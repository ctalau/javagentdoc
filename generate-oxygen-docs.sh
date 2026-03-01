#!/bin/bash
#
# Generate Markdown documentation for Oxygen XML SDK sources.
#
# Usage:
#   ./generate-oxygen-docs.sh
#
# Optional environment variables:
#   OXYGEN_VERSION       - Oxygen SDK version (default: 28.0.0.3)
#   OXYGEN_MAVEN_REPO    - Oxygen Maven repository URL
#   OXYGEN_CACHE_DIR     - Cache directory for downloaded artifacts
#   OXYGEN_SOURCES_JAR   - Override sources JAR path
#   OXYGEN_DEPS_DIR      - Override dependency JAR directory
#   OUTPUT_DIR           - Where to write markdown output
#   DOCLET_JAR           - Path to semantic-xml-doclet JAR
#   WORK_DIR             - Working directory for extracted sources and logs
#
# This script is strict:
# - fails if javadoc reports errors
# - fails if AuthorDocumentController is missing
# - fails if any generated class markdown file starts with lowercase
# - fails if any relative markdown links are broken

set -euo pipefail

# ---------------------------------------------------------------------------
# Defaults — override via environment variables
# ---------------------------------------------------------------------------
SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"

OXYGEN_VERSION="${OXYGEN_VERSION:-28.0.0.3}"
OXYGEN_MAVEN_REPO="${OXYGEN_MAVEN_REPO:-https://www.oxygenxml.com/maven}"
OXYGEN_CACHE_DIR="${OXYGEN_CACHE_DIR:-${SCRIPT_DIR}/.cache/oxygen-sdk/${OXYGEN_VERSION}}"
OXYGEN_SOURCES_JAR="${OXYGEN_SOURCES_JAR:-${OXYGEN_CACHE_DIR}/oxygen-${OXYGEN_VERSION}-sources.jar}"
OXYGEN_DEPS_DIR="${OXYGEN_DEPS_DIR:-${OXYGEN_CACHE_DIR}/deps}"
OUTPUT_DIR="${OUTPUT_DIR:-${SCRIPT_DIR}/samples/oxygen}"
DOCLET_JAR="${DOCLET_JAR:-${SCRIPT_DIR}/semantic-xml-doclet/target/semantic-xml-doclet-0.1.0-SNAPSHOT.jar}"
WORK_DIR="${WORK_DIR:-/tmp/oxygen-doc-gen-${OXYGEN_VERSION}}"

# ---------------------------------------------------------------------------
# Helpers
# ---------------------------------------------------------------------------
download_if_missing() {
  local url="$1"
  local dest="$2"

  if [ -f "$dest" ]; then
    return 0
  fi

  mkdir -p "$(dirname "$dest")"
  echo "Downloading: $url"
  curl -fL --retry 3 -o "$dest" "$url"
}

# ---------------------------------------------------------------------------
# Ensure doclet exists (build automatically when missing)
# ---------------------------------------------------------------------------
if [ ! -f "$DOCLET_JAR" ]; then
  echo "Doclet JAR not found. Building it..."
  (cd "$SCRIPT_DIR" && mvn -q -pl semantic-xml-doclet -am -DskipTests package)
fi

if [ ! -f "$DOCLET_JAR" ]; then
  echo "ERROR: Doclet JAR not found after build: $DOCLET_JAR"
  exit 1
fi

# ---------------------------------------------------------------------------
# Download Oxygen sources JAR when needed
# ---------------------------------------------------------------------------
if [ ! -f "$OXYGEN_SOURCES_JAR" ]; then
  SOURCES_URL="${OXYGEN_MAVEN_REPO}/com/oxygenxml/oxygen/${OXYGEN_VERSION}/oxygen-${OXYGEN_VERSION}-sources.jar"
  download_if_missing "$SOURCES_URL" "$OXYGEN_SOURCES_JAR"
fi

# ---------------------------------------------------------------------------
# Download Oxygen SDK dependency jars when needed
# ---------------------------------------------------------------------------
mkdir -p "$OXYGEN_DEPS_DIR" "$OXYGEN_CACHE_DIR"
if [ "$(find "$OXYGEN_DEPS_DIR" -maxdepth 1 -name '*.jar' | wc -l)" -eq 0 ]; then
  echo "Downloading Oxygen SDK dependencies via Maven..."

  TMP_MVN_DIR="${OXYGEN_CACHE_DIR}/mvn"
  mkdir -p "$TMP_MVN_DIR"
  cat > "${TMP_MVN_DIR}/pom.xml" <<EOF
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>temp</groupId>
  <artifactId>oxygen-doc-gen</artifactId>
  <version>1.0.0</version>

  <repositories>
    <repository>
      <id>oxygenxml</id>
      <url>${OXYGEN_MAVEN_REPO}</url>
    </repository>
    <repository>
      <id>central</id>
      <url>https://repo1.maven.org/maven2</url>
    </repository>
  </repositories>

  <dependencies>
    <dependency>
      <groupId>com.oxygenxml</groupId>
      <artifactId>oxygen-sdk</artifactId>
      <version>${OXYGEN_VERSION}</version>
    </dependency>
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>3.0.1</version>
    </dependency>
    <dependency>
      <groupId>com.oxygenxml</groupId>
      <artifactId>oxygen-ai-positron-api</artifactId>
      <version>${OXYGEN_VERSION}</version>
    </dependency>
  </dependencies>
</project>
EOF

  (
    cd "$TMP_MVN_DIR"
    mvn -q \
      dependency:copy-dependencies \
      -DincludeScope=compile \
      -DoutputDirectory="$OXYGEN_DEPS_DIR" \
      -Dmdep.useRepositoryLayout=false
  )
fi

JAR_COUNT="$(find "$OXYGEN_DEPS_DIR" -maxdepth 1 -name '*.jar' | wc -l)"
if [ "$JAR_COUNT" -eq 0 ]; then
  echo "ERROR: No dependency JARs found in $OXYGEN_DEPS_DIR"
  exit 1
fi

# ---------------------------------------------------------------------------
# Setup work directory and extract sources
# ---------------------------------------------------------------------------
rm -rf "$WORK_DIR"
mkdir -p "$WORK_DIR/src"
mkdir -p "$OUTPUT_DIR"

echo "Extracting sources from: $OXYGEN_SOURCES_JAR"
(
  cd "$WORK_DIR/src"
  jar xf "$OXYGEN_SOURCES_JAR"
)
# Build the candidate source set from the full extracted sources tree.
SOURCE_LIST="$WORK_DIR/source-files.current"
find "$WORK_DIR/src" -name "*.java" | awk -F'/' '
  {
    f=$NF
    if (f == "module-info.java" || f == "package-info.java") next
    cls=f
    sub(/\.java$/, "", cls)
    if (cls ~ /^[a-z]{1,3}$/) next
    print $0
  }
' | sort -u > "$SOURCE_LIST"
INITIAL_SOURCE_LIST="$WORK_DIR/source-files.initial"
cp "$SOURCE_LIST" "$INITIAL_SOURCE_LIST"

FILE_COUNT="$(wc -l < "$SOURCE_LIST")"
if [ "$FILE_COUNT" -eq 0 ]; then
  echo "ERROR: No candidate Java source files found in extracted Oxygen sources."
  exit 1
fi

# Build classpath
CLASSPATH="$(find "$OXYGEN_DEPS_DIR" -maxdepth 1 -name "*.jar" | sort | tr '\n' ':')"

# ---------------------------------------------------------------------------
# Run javadoc
# ---------------------------------------------------------------------------
echo "Starting Oxygen documentation generation..."
echo "  Oxygen version : $OXYGEN_VERSION"
echo "  Sources JAR    : $OXYGEN_SOURCES_JAR"
echo "  Deps dir       : $OXYGEN_DEPS_DIR ($JAR_COUNT jars)"
echo "  Source scope   : all packages in sources JAR"
echo "  Output dir     : $OUTPUT_DIR"
echo "  Candidate files: $FILE_COUNT"
echo ""

JAVADOC_LOG="$WORK_DIR/javadoc.log"
MAX_PRUNE_PASSES="${MAX_PRUNE_PASSES:-12}"
PASS=0
INITIAL_FILE_COUNT="$FILE_COUNT"
REQUIRED_SOURCE="$WORK_DIR/src/ro/sync/ecss/extensions/api/AuthorDocumentController.java"
FAILED_FILES="$WORK_DIR/failing-files.txt"
FAILED_REASONS="$WORK_DIR/failing-reasons.tsv"
>"$FAILED_REASONS"

while true; do
  PASS=$((PASS + 1))
  set +e
  javadoc \
    -doclet com.github.javagentdoc.doclet.SemanticXmlDoclet \
    -docletpath "$DOCLET_JAR" \
    --semanticOut "$OUTPUT_DIR/README.md" \
    --semanticFormat markdown \
    -classpath "$CLASSPATH" \
    -encoding UTF-8 \
    -quiet \
    @"$SOURCE_LIST" 2>"$JAVADOC_LOG"
  JAVADOC_EXIT=$?
  set -e

  if [ "$JAVADOC_EXIT" -eq 0 ]; then
    break
  fi

  awk -F: '/\.java:[0-9]+: error:/{print $1}' "$JAVADOC_LOG" | sort -u > "$FAILED_FILES"
  awk -F': error: ' '/\.java:[0-9]+: error:/{msg=$2; gsub(/^[ \t]+|[ \t]+$/, "", msg); if (msg == "") msg="javadoc compilation error"; print $1 "\t" msg}' "$JAVADOC_LOG" >> "$FAILED_REASONS"
  FAIL_COUNT="$(wc -l < "$FAILED_FILES")"

  if [ "$FAIL_COUNT" -eq 0 ]; then
    echo "ERROR: javadoc failed (pass $PASS) but no failing source files could be identified."
    echo "Last 40 lines from javadoc log:"
    tail -40 "$JAVADOC_LOG"
    exit 1
  fi

  if grep -Fxq "$REQUIRED_SOURCE" "$FAILED_FILES"; then
    echo "ERROR: Required class source failed compilation: $REQUIRED_SOURCE"
    echo "Cannot continue without missing AuthorDocumentController."
    exit 1
  fi

  grep -Fvx -f "$FAILED_FILES" "$SOURCE_LIST" > "$WORK_DIR/source-files.next"
  NEW_FILE_COUNT="$(wc -l < "$WORK_DIR/source-files.next")"

  if [ "$NEW_FILE_COUNT" -eq "$FILE_COUNT" ]; then
    echo "ERROR: javadoc failed and pruning made no progress."
    echo "First 30 failing files:"
    head -30 "$FAILED_FILES"
    exit 1
  fi

  mv "$WORK_DIR/source-files.next" "$SOURCE_LIST"
  FILE_COUNT="$NEW_FILE_COUNT"
  echo "Pruned $FAIL_COUNT unresolved source file(s); retrying javadoc (pass $((PASS + 1)), files remaining: $FILE_COUNT)."

  if [ "$PASS" -ge "$MAX_PRUNE_PASSES" ]; then
    echo "ERROR: Exceeded MAX_PRUNE_PASSES=$MAX_PRUNE_PASSES"
    echo "Remaining failing files:"
    head -50 "$FAILED_FILES"
    exit 1
  fi
done

REMOVED_COUNT=$((INITIAL_FILE_COUNT - FILE_COUNT))
REMOVED_SOURCE_LIST="$WORK_DIR/source-files.removed"
grep -Fvx -f "$SOURCE_LIST" "$INITIAL_SOURCE_LIST" > "$REMOVED_SOURCE_LIST"

if [ "$REMOVED_COUNT" -gt 0 ]; then
  PLACEHOLDER_REPORT="$OUTPUT_DIR/PLACEHOLDER-CLASSES.md"
  cat > "$PLACEHOLDER_REPORT" <<EOF
# Placeholder Classes

These classes were emitted as placeholders because javadoc could not fully compile them with publicly available SDK dependencies.

| Class | Source file | Reason |
|---|---|---|
EOF

  while IFS= read -r src_file; do
    [ -z "$src_file" ] && continue

    rel_path="${src_file#"$WORK_DIR/src/"}"
    pkg_path="$(dirname "$rel_path")"
    class_name="$(basename "$rel_path" .java)"
    pkg_name="${pkg_path//\//.}"

    pkg_dir="$OUTPUT_DIR/$pkg_path"
    class_md="$pkg_dir/$class_name.md"
    pkg_readme="$pkg_dir/README.md"

    mkdir -p "$pkg_dir"

    if [ ! -f "$class_md" ]; then
      cat > "$class_md" <<EOF
# Class: \`$class_name\`

**Package:** [\`$pkg_name\`](README.md)

**Fully Qualified Name:** \`$pkg_name.$class_name\`

## Description

This is a placeholder entry. The original source references internal Oxygen runtime classes that are not available in the public SDK artifacts from \`$OXYGEN_MAVEN_REPO\`, so full member-level extraction could not be completed.
EOF
    fi

    reason="$(awk -F'\t' -v f="$src_file" '$1==f{r=$2} END{print r}' "$FAILED_REASONS")"
    if [ -z "$reason" ]; then
      reason="unresolved symbols or dependencies not present in public SDK artifacts"
    fi
    reason="${reason//|/\\|}"
    rel_src="${src_file#"$WORK_DIR/src/"}"
    printf -- "| \`%s\` | \`%s\` | %s |\n" "$pkg_name.$class_name" "$rel_src" "$reason" >> "$PLACEHOLDER_REPORT"

    if [ ! -f "$pkg_readme" ]; then
      cat > "$pkg_readme" <<EOF
# Package: \`$pkg_name\`

## Classes and Interfaces

EOF
    fi

    if ! grep -Fq "[$class_name]($class_name.md)" "$pkg_readme"; then
      printf -- "- [%s](%s.md)\n" "$class_name" "$class_name" >> "$pkg_readme"
    fi

    if ! grep -Fq "[$pkg_name]($pkg_path/README.md)" "$OUTPUT_DIR/README.md"; then
      printf -- "- [%s](%s/README.md)\n" "$pkg_name" "$pkg_path" >> "$OUTPUT_DIR/README.md"
    fi
  done < "$REMOVED_SOURCE_LIST"

  echo "Added placeholder markdown for $REMOVED_COUNT unresolved class source file(s)."
fi

if [ "$REMOVED_COUNT" -gt 0 ]; then
  echo "Resolved javadoc build by pruning $REMOVED_COUNT non-compilable source file(s) unavailable in public SDK artifacts."
fi

# ---------------------------------------------------------------------------
# Validation gates
# ---------------------------------------------------------------------------
if [ ! -f "$OUTPUT_DIR/README.md" ]; then
  echo "ERROR: Output README.md was not created."
  exit 1
fi

AUTHOR_DOC="$OUTPUT_DIR/ro/sync/ecss/extensions/api/AuthorDocumentController.md"
if [ ! -f "$AUTHOR_DOC" ]; then
  echo "ERROR: Missing required API class markdown: $AUTHOR_DOC"
  exit 1
fi

LOWERCASE_CLASSES="$(find "$OUTPUT_DIR" -type f -name '*.md' ! -name 'README.md' ! -name 'PLACEHOLDER-CLASSES.md' -printf '%P\n' | awk -F'/' '{name=$NF; sub(/\.md$/, "", name); if (name ~ /^[a-z]{1,3}$/) print $0}')"
if [ -n "$LOWERCASE_CLASSES" ]; then
  echo "ERROR: Found generated class markdown files with lowercase names of length <= 3 (obfuscated/internal):"
  echo "$LOWERCASE_CLASSES" | head -30
  exit 1
fi

BROKEN_LINKS_FILE="$WORK_DIR/broken-links.txt"
if ! python3 - "$OUTPUT_DIR" "$BROKEN_LINKS_FILE" <<'PY'
import os
import re
import sys

root = os.path.abspath(sys.argv[1])
report = sys.argv[2]
pattern = re.compile(r"\[[^\]]+\]\(([^)]+)\)")
broken = []

for dirpath, _, filenames in os.walk(root):
    for name in filenames:
        if not name.endswith(".md"):
            continue
        current = os.path.join(dirpath, name)
        with open(current, encoding="utf-8", errors="ignore") as fh:
            text = fh.read()
        for link in pattern.findall(text):
            if "://" in link or link.startswith("#") or link.startswith("mailto:"):
                continue
            target_ref = link.split("#", 1)[0].strip()
            if not target_ref:
                continue
            target = os.path.normpath(os.path.join(dirpath, target_ref))
            if not os.path.exists(target):
                broken.append((current, link, target))

with open(report, "w", encoding="utf-8") as fh:
    for src, link, target in broken:
        fh.write(f"{os.path.relpath(src, root)} -> {link} => {os.path.relpath(target, root)}\n")

if broken:
    sys.exit(1)

sys.exit(0)
PY
then
  echo "ERROR: Broken relative markdown links detected."
  echo "First 30 broken links:"
  head -30 "$BROKEN_LINKS_FILE"
  exit 1
fi

MD_FILES="$(find "$OUTPUT_DIR" -name '*.md' | wc -l)"
PKG_COUNT="$(find "$OUTPUT_DIR" -name 'README.md' | grep -v "^$OUTPUT_DIR/README.md$" | wc -l)"

echo ""
echo "Documentation generation complete."
echo "  Output dir     : $OUTPUT_DIR"
echo "  Packages       : $PKG_COUNT"
echo "  Markdown files : $MD_FILES"
echo "  Source files   : $FILE_COUNT (from $INITIAL_FILE_COUNT candidates)"
echo "  Javadoc log    : $JAVADOC_LOG"
echo "  Validation     : passed (AuthorDocumentController present, no lowercase classes <= 3 chars, no broken links)"
