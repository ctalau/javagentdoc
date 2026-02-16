#!/bin/bash

set -e

echo "Starting Guava documentation generation using Maven..."
echo "This will take approximately 15 minutes..."

# Variables
GUAVA_VERSION="33.0.0-jre"
WORK_DIR="/tmp/guava-doc-maven"
DOCLET_JAR="/home/miciiortodocsi/javagentdoc/semantic-xml-doclet/target/semantic-xml-doclet-0.1.0-SNAPSHOT.jar"
OUTPUT_DIR="/home/miciiortodocsi/javagentdoc/samples/guava"

# Clean and create work directory
rm -rf "$WORK_DIR"
mkdir -p "$WORK_DIR"
cd "$WORK_DIR"

echo "Creating temporary Maven project..."

# Create a minimal pom.xml that depends on Guava
cat > pom.xml <<'EOF'
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>temp</groupId>
    <artifactId>guava-doc-gen</artifactId>
    <version>1.0</version>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <dependency>
            <groupId>com.google.guava</groupId>
            <artifactId>guava</artifactId>
            <version>33.0.0-jre</version>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-dependency-plugin</artifactId>
                <version>3.6.0</version>
            </plugin>
        </plugins>
    </build>
</project>
EOF

echo "Downloading Guava sources and dependencies..."

# Download Guava sources
mvn dependency:unpack \
  -Dartifact=com.google.guava:guava:${GUAVA_VERSION}:jar:sources \
  -DoutputDirectory=guava-src \
  -q

# Download all dependency JARs for classpath
mvn dependency:copy-dependencies \
  -DincludeScope=compile \
  -DoutputDirectory=deps \
  -q

# Build classpath from all dependencies
CLASSPATH=$(find deps -name "*.jar" | tr '\n' ':')

echo "Found dependencies, building classpath..."
echo "Classpath has $(echo "$CLASSPATH" | tr ':' '\n' | wc -l) JARs"

# Find all Java source files
echo "Finding all Java source files..."
find guava-src -name "*.java" > source-files.txt

FILE_COUNT=$(wc -l < source-files.txt)
echo "Found ${FILE_COUNT} Java source files"

echo "Generating Markdown documentation..."
echo "Output will be saved to: ${OUTPUT_DIR}"

# Create output directory
mkdir -p "${OUTPUT_DIR}"

# Run javadoc with our custom doclet and proper classpath
javadoc \
  -doclet com.github.javagentdoc.doclet.SemanticXmlDoclet \
  -docletpath "${DOCLET_JAR}" \
  --semanticOut "${OUTPUT_DIR}/README.md" \
  --semanticFormat markdown \
  -classpath "${CLASSPATH}" \
  -encoding UTF-8 \
  -quiet \
  @source-files.txt 2>&1 | grep -v "^warning:" || true

if [ -f "${OUTPUT_DIR}/README.md" ]; then
    echo ""
    echo "✅ Documentation generation complete!"
    echo "Output directory: ${OUTPUT_DIR}"
    echo "Directory size: $(du -sh "${OUTPUT_DIR}" | cut -f1)"
    echo "Number of markdown files: $(find "${OUTPUT_DIR}" -name "*.md" | wc -l)"
    echo "Number of packages: $(find "${OUTPUT_DIR}" -type d -name "*.google.*" 2>/dev/null | wc -l)"
else
    echo "❌ Error: Output was not generated"
    exit 1
fi

# Cleanup
cd /home/miciiortodocsi/javagentdoc
rm -rf "$WORK_DIR"

echo "Temporary files cleaned up."
