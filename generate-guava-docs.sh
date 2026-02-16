#!/bin/bash

set -e

echo "Starting Guava documentation generation..."
echo "This will take approximately 15 minutes..."

# Variables
GUAVA_VERSION="33.0.0-jre"
WORK_DIR="/tmp/guava-doc-gen"
DOCLET_JAR="/home/miciiortodocsi/javagentdoc/semantic-xml-doclet/target/semantic-xml-doclet-0.1.0-SNAPSHOT.jar"
OUTPUT_DIR="/home/miciiortodocsi/javagentdoc/samples/guava"

# Clean and create work directory
rm -rf "$WORK_DIR"
mkdir -p "$WORK_DIR"
cd "$WORK_DIR"

echo "Downloading Guava ${GUAVA_VERSION} sources..."

# Download Guava sources using Maven
mvn dependency:get \
  -Dartifact=com.google.guava:guava:${GUAVA_VERSION}:jar:sources \
  -Ddest="${WORK_DIR}/guava-sources.jar" \
  -q

echo "Extracting sources..."
unzip -q guava-sources.jar -d guava-src

# Find all Java source files
echo "Finding all Java source files..."
find guava-src -name "*.java" > source-files.txt

# Count the files
FILE_COUNT=$(wc -l < source-files.txt)
echo "Found ${FILE_COUNT} Java source files"

echo "Generating Markdown documentation..."
echo "Output will be saved to: ${OUTPUT_DIR}"

# Create output directory
mkdir -p "${OUTPUT_DIR}"

# Run javadoc with our custom doclet
# Note: We pass a dummy file path, but the doclet will use its parent directory
javadoc \
  -doclet com.github.javagentdoc.doclet.SemanticXmlDoclet \
  -docletpath "${DOCLET_JAR}" \
  --semanticOut "${OUTPUT_DIR}/README.md" \
  --semanticFormat markdown \
  -encoding UTF-8 \
  -quiet \
  @source-files.txt

echo ""
echo "✅ Documentation generation complete!"
echo "Output directory: ${OUTPUT_DIR}"
echo "Directory size: $(du -sh "${OUTPUT_DIR}" | cut -f1)"
echo "Number of files: $(find "${OUTPUT_DIR}" -name "*.md" | wc -l)"

# Cleanup
cd /home/miciiortodocsi/javagentdoc
rm -rf "$WORK_DIR"

echo "Temporary files cleaned up."
