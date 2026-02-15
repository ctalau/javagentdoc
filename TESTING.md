# Testing JavaAgentDoc

This document describes how to test the JavaAgentDoc doclet processor.

## Quick Test (Demo Project)

A small demo project with 2 classes is suitable for quick testing:

### Build the Doclet

```bash
mvn clean install -DskipTests
```

### Run on Demo Project

Create test sources at `/tmp/test-project/src/com/example/demo/`:

```bash
# Generate Markdown
javadoc \
  -doclet com.github.javagentdoc.doclet.SemanticXmlDoclet \
  -docletpath semantic-xml-doclet/target/semantic-xml-doclet-0.1.0-SNAPSHOT.jar \
  --semanticOut /tmp/output.md \
  --semanticFormat markdown \
  -sourcepath /tmp/test-project/src \
  -subpackages com.example.demo

# Generate XML
javadoc \
  -doclet com.github.javagentdoc.doclet.SemanticXmlDoclet \
  -docletpath semantic-xml-doclet/target/semantic-xml-doclet-0.1.0-SNAPSHOT.jar \
  --semanticOut /tmp/output.xml \
  --semanticFormat xml \
  -sourcepath /tmp/test-project/src \
  -subpackages com.example.demo
```

## Output Examples

### Markdown Output

```markdown
# API Documentation

## Package: com.example.demo

### Class: `Calculator`

**Description:** A simple calculator for basic arithmetic operations.
@author Demo Author
@version 1.0.0

#### Members

- **Method:** `int add(int a, int b)`
  - Adds two numbers together.
@param a the first number
@param b the second number
@return the sum of a and b
```

### XML Output

```xml
<?xml version="1.0" encoding="UTF-8"?>
<api version="1.0">
  <package name="com.example.demo">
    <type name="com.example.demo.Calculator" kind="class">
      <doc>
        <body></body>
        <blockTags>
          <tag kind="AUTHOR">@author Demo Author</tag>
          <tag kind="VERSION">@version 1.0.0</tag>
        </blockTags>
      </doc>
      <members>
        <method name="add" returns="int">
          <params>
            <param name="a" type="int"/>
            <param name="b" type="int"/>
          </params>
          <doc>
            <body></body>
            <blockTags>
              <tag kind="PARAM">@param a the first number</tag>
              <tag kind="RETURN">@return the sum of a and b</tag>
            </blockTags>
          </doc>
        </method>
      </members>
    </type>
  </package>
</api>
```

## Testing with Your Own Project

To test with your own Java project:

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
