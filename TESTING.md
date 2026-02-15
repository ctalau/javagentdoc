# Testing JavaAgentDoc

This document describes how to test the JavaAgentDoc doclet processor against Google Guava.

## Prerequisites

- Java 17+
- Maven 3.6+
- Git

## Quick Start

### 1. Build JavaAgentDoc

```bash
cd /path/to/javagentdoc
mvn clean install -DskipTests
```

### 2. Clone Google Guava

```bash
cd /tmp
git clone --depth 1 https://github.com/google/guava.git
cd guava
```

### 3. Run JavaAgentDoc Doclet on Guava

```bash
mvn javadoc:javadoc -pl :guava
```

**Note: This takes approximately 15 minutes to complete**

The standard Maven javadoc generation will process all ~1500+ classes in Guava and generate complete documentation including all packages, classes, methods, fields, and their documentation comments.

## Testing with Your Own Project

To test with your own Java project using Maven:

```bash
# In your project directory
mvn javadoc:javadoc
```

Or using javadoc command directly:

```bash
javadoc \
  -doclet com.github.javagentdoc.doclet.SemanticXmlDoclet \
  -docletpath /path/to/semantic-xml-doclet-0.1.0-SNAPSHOT.jar \
  --semanticOut /path/to/output.md \
  --semanticFormat markdown \
  -sourcepath /path/to/src \
  -subpackages your.package.name
```

## Expected Behavior

✅ **What Works:**
- Doclet loads without errors
- Generates valid Markdown and XML output
- Captures all classes, interfaces, enums
- Includes method signatures with types
- Preserves documentation comments
- Handles multiple files and packages

⚠️ **Known Limitations (See TODO.md):**
- Block tags appear as raw text
- No semantic parsing of tag structure
- Inline tags not converted
- No cross-reference resolution

## Troubleshooting

### Doclet Not Found

```
error: Cannot find doclet class com.github.javagentdoc.doclet.SemanticXmlDoclet
```

Solution: Ensure the JAR path is correct and the doclet has been built:
```bash
ls semantic-xml-doclet/target/semantic-xml-doclet-0.1.0-SNAPSHOT.jar
```

### Module Resolution Errors

For projects with `module-info.java`, you may need to:
1. Build the project first: `mvn clean compile`
2. Run javadoc through Maven: `mvn javadoc:javadoc`
3. Or configure module paths manually

### Output File Not Created

Ensure the output directory exists:
```bash
mkdir -p $(dirname /tmp/output.md)
```

## Performance Notes

- Small projects (< 100 classes): < 5 seconds
- Medium projects (100-1000 classes): 5-30 seconds
- Large projects (1000+ classes): 30+ seconds

Memory usage: typically < 512MB for most projects
