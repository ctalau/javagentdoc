#!/bin/bash
#
# Generate Markdown documentation for Oxygen XML SDK sources.
#
# Usage:
#   ./generate-oxygen-docs.sh [OPTIONS]
#
# Required environment variables (or edit DEFAULTS below):
#   OXYGEN_SOURCES_JAR   - Path to oxygen-<version>-sources.jar
#   OXYGEN_DEPS_DIR      - Directory containing all dependency JARs
#                          (oxygen.jar, oxygen-annotations.jar,
#                           oxygen-basic-utilities.jar, etc.)
#
# Optional environment variables:
#   OUTPUT_DIR           - Where to write the markdown (default: samples/oxygen)
#   DOCLET_JAR           - Path to the built doclet JAR
#   WORK_DIR             - Temp directory for extracted sources
#
# Example:
#   OXYGEN_SOURCES_JAR=/opt/oxygen/lib/oxygen-28.0.0.3-sources.jar \
#   OXYGEN_DEPS_DIR=/opt/oxygen/lib \
#   ./generate-oxygen-docs.sh
#

set -e

# ---------------------------------------------------------------------------
# Defaults — override via environment variables
# ---------------------------------------------------------------------------
SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"

OXYGEN_SOURCES_JAR="${OXYGEN_SOURCES_JAR:-}"
OXYGEN_DEPS_DIR="${OXYGEN_DEPS_DIR:-}"
OUTPUT_DIR="${OUTPUT_DIR:-${SCRIPT_DIR}/samples/oxygen}"
DOCLET_JAR="${DOCLET_JAR:-${SCRIPT_DIR}/semantic-xml-doclet/target/semantic-xml-doclet-0.1.0-SNAPSHOT.jar}"
WORK_DIR="${WORK_DIR:-/tmp/oxygen-doc-gen}"

# ---------------------------------------------------------------------------
# Validate inputs
# ---------------------------------------------------------------------------
if [ -z "$OXYGEN_SOURCES_JAR" ]; then
  echo "ERROR: OXYGEN_SOURCES_JAR is not set."
  echo "  Set it to the path of oxygen-<version>-sources.jar"
  echo "  Example: OXYGEN_SOURCES_JAR=/opt/oxygen/lib/oxygen-28.0.0.3-sources.jar \\"
  echo "           OXYGEN_DEPS_DIR=/opt/oxygen/lib ./generate-oxygen-docs.sh"
  exit 1
fi

if [ -z "$OXYGEN_DEPS_DIR" ]; then
  echo "ERROR: OXYGEN_DEPS_DIR is not set."
  echo "  Set it to a directory that contains all Oxygen runtime JARs"
  echo "  (oxygen.jar, oxygen-annotations.jar, oxygen-basic-utilities.jar, etc.)"
  exit 1
fi

if [ ! -f "$OXYGEN_SOURCES_JAR" ]; then
  echo "ERROR: Sources JAR not found: $OXYGEN_SOURCES_JAR"
  exit 1
fi

if [ ! -d "$OXYGEN_DEPS_DIR" ]; then
  echo "ERROR: Deps directory not found: $OXYGEN_DEPS_DIR"
  exit 1
fi

if [ ! -f "$DOCLET_JAR" ]; then
  echo "ERROR: Doclet JAR not found: $DOCLET_JAR"
  echo "  Build it first with: cd semantic-xml-doclet && mvn clean package"
  exit 1
fi

# ---------------------------------------------------------------------------
# Setup
# ---------------------------------------------------------------------------
echo "Starting Oxygen documentation generation..."
echo "  Sources JAR : $OXYGEN_SOURCES_JAR"
echo "  Deps dir    : $OXYGEN_DEPS_DIR"
echo "  Output dir  : $OUTPUT_DIR"
echo ""

rm -rf "$WORK_DIR"
mkdir -p "$WORK_DIR"
cd "$WORK_DIR"

# ---------------------------------------------------------------------------
# Extract sources
# ---------------------------------------------------------------------------
echo "Extracting sources from JAR..."
mkdir -p src
jar xf "$OXYGEN_SOURCES_JAR" -C src
find src -name "*.java" > source-files.txt
FILE_COUNT=$(wc -l < source-files.txt)
echo "  Found $FILE_COUNT Java source files"

# Also pick up any additional sources JARs from the deps dir (e.g. *-sources.jar)
EXTRA_SOURCES=$(find "$OXYGEN_DEPS_DIR" -name "*-sources.jar" 2>/dev/null | grep -v "$(basename "$OXYGEN_SOURCES_JAR")" || true)
if [ -n "$EXTRA_SOURCES" ]; then
  echo ""
  echo "  Found additional sources JARs — extracting:"
  while IFS= read -r src_jar; do
    echo "    $src_jar"
    jar xf "$src_jar" -C src
  done <<< "$EXTRA_SOURCES"
  find src -name "*.java" > source-files.txt
  FILE_COUNT=$(wc -l < source-files.txt)
  echo "  Total Java source files after merge: $FILE_COUNT"
fi

# ---------------------------------------------------------------------------
# Build classpath
# ---------------------------------------------------------------------------
echo ""
echo "Building classpath from $OXYGEN_DEPS_DIR ..."
CLASSPATH=$(find "$OXYGEN_DEPS_DIR" -name "*.jar" ! -name "*-sources.jar" | tr '\n' ':')
JAR_COUNT=$(find "$OXYGEN_DEPS_DIR" -name "*.jar" ! -name "*-sources.jar" | wc -l)
echo "  Found $JAR_COUNT dependency JARs"

# ---------------------------------------------------------------------------
# Run javadoc
# ---------------------------------------------------------------------------
echo ""
echo "Generating Markdown documentation..."
mkdir -p "$OUTPUT_DIR"

# Run javadoc; capture stderr to a log so we can detect missing-dependency errors
JAVADOC_LOG="$WORK_DIR/javadoc.log"

set +e
javadoc \
  -doclet com.github.javagentdoc.doclet.SemanticXmlDoclet \
  -docletpath "$DOCLET_JAR" \
  --semanticOut "$OUTPUT_DIR/README.md" \
  --semanticFormat markdown \
  -classpath "$CLASSPATH" \
  -encoding UTF-8 \
  -quiet \
  @source-files.txt 2>"$JAVADOC_LOG"
JAVADOC_EXIT=$?
set -e

# Report errors (not warnings — those are noise from obfuscated code)
ERROR_COUNT=$(grep -c "^error:" "$JAVADOC_LOG" 2>/dev/null || true)
if [ "$ERROR_COUNT" -gt 0 ]; then
  echo ""
  echo "WARNING: javadoc reported $ERROR_COUNT error(s). These packages will be absent"
  echo "         from the output because their types could not be resolved."
  echo "         Common fix: add missing JARs to OXYGEN_DEPS_DIR."
  echo ""
  echo "  First 20 errors:"
  grep "^error:" "$JAVADOC_LOG" | head -20
  echo ""
fi

if [ "$JAVADOC_EXIT" -ne 0 ] && [ ! -f "$OUTPUT_DIR/README.md" ]; then
  echo "ERROR: javadoc failed and produced no output."
  echo "Full log: $JAVADOC_LOG"
  exit 1
fi

# ---------------------------------------------------------------------------
# Summary
# ---------------------------------------------------------------------------
if [ -f "$OUTPUT_DIR/README.md" ]; then
  MD_FILES=$(find "$OUTPUT_DIR" -name "*.md" | wc -l)
  PKG_COUNT=$(find "$OUTPUT_DIR" -name "README.md" | grep -v "^$OUTPUT_DIR/README.md$" | wc -l)
  echo "Documentation generation complete."
  echo "  Output dir     : $OUTPUT_DIR"
  echo "  Packages       : $PKG_COUNT"
  echo "  Markdown files : $MD_FILES"
  echo "  Javadoc log    : $JAVADOC_LOG"
else
  echo "ERROR: Output README.md was not created."
  echo "Full log: $JAVADOC_LOG"
  exit 1
fi

# ---------------------------------------------------------------------------
# Cleanup
# ---------------------------------------------------------------------------
rm -rf "$WORK_DIR/src"
echo ""
echo "Done. Temp source tree removed; log kept at $JAVADOC_LOG"
