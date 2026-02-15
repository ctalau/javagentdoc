# JavaAgentDoc

Convert Java Javadoc to semantic XML and Markdown format for AI agent accessibility.

JavaAgentDoc is a custom Javadoc doclet processor that transforms Java documentation comments into structured, machine-readable formats (XML and Markdown). This makes Java API documentation more accessible to AI agents and automated processing tools.

## Goals

- **AI-Friendly**: Output structured formats that AI agents can reliably parse and understand
- **Semantic**: Preserve the semantic structure of Javadoc comments, not just raw text
- **Comprehensive**: Support all standard Javadoc constructs and tags
- **Flexible**: Support both XML and Markdown output formats
- **Maven Integration**: Easy integration into existing Maven builds

## Quick Start

### 1. Build the Doclet

```bash
mvn clean install
```

This builds the `semantic-xml-doclet` JAR artifact.

### 2. Use with Maven Javadoc Plugin

Add this to your project's `pom.xml`:

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-javadoc-plugin</artifactId>
    <version>3.6.3</version>
    <executions>
        <execution>
            <id>semantic-docs</id>
            <goals>
                <goal>javadoc</goal>
            </goals>
            <phase>verify</phase>
            <configuration>
                <doclet>com.github.javagentdoc.doclet.SemanticXmlDoclet</doclet>
                <docletArtifact>
                    <groupId>com.github.javagentdoc</groupId>
                    <artifactId>semantic-xml-doclet</artifactId>
                    <version>0.1.0-SNAPSHOT</version>
                </docletArtifact>
                <useStandardDocletOptions>false</useStandardDocletOptions>
                <additionalOptions>
                    <additionalOption>--semanticOut</additionalOption>
                    <additionalOption>${project.build.directory}/semantic-docs/api.xml</additionalOption>
                    <additionalOption>--semanticFormat</additionalOption>
                    <additionalOption>xml</additionalOption>
                </additionalOptions>
            </configuration>
        </execution>
    </executions>
</plugin>
```

### 3. Command-Line Usage

Generate semantic documentation for a library:

```bash
javadoc \
  --doclet com.github.javagentdoc.doclet.SemanticXmlDoclet \
  --doclet-path semantic-xml-doclet/target/semantic-xml-doclet-0.1.0-SNAPSHOT.jar \
  --semanticOut /tmp/output.xml \
  --semanticFormat xml \
  -sourcepath src/main/java \
  -subpackages com.example
```

## Options

- `--semanticOut <file>`: Output file path (required). Supports `.xml` and `.md` extensions.
- `--semanticFormat xml|markdown`: Output format (optional, defaults to XML). Can be inferred from file extension.

## Output Formats

### XML Format

Generates structured XML with semantic information:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<api version="1.0">
    <package name="com.example">
        <type name="com.example.MyClass" kind="class">
            <doc>
                <body>
                    <node kind="TEXT">Description of MyClass</node>
                </body>
                <blockTags>
                    <tag kind="AUTHOR">author name</tag>
                </blockTags>
            </doc>
            <members>
                <method name="doSomething" returns="void">
                    <params>
                        <param name="input" type="java.lang.String"/>
                    </params>
                    <doc>
                        <body>
                            <node kind="TEXT">Method description</node>
                        </body>
                        <blockTags>
                            <tag kind="PARAM">param input description</tag>
                        </blockTags>
                    </doc>
                </method>
            </members>
        </type>
    </package>
</api>
```

### Markdown Format

Generates human-readable Markdown:

```markdown
# API Documentation

## Package: com.example

### Class: `MyClass`

**Description:** Description of MyClass

#### Members

- **Method:** `void doSomething(java.lang.String input)`
  - Method description
```

## Acceptance Criteria

- [x] Generate Javadoc of the Guava library in Markdown format
- [ ] Comprehensive coverage of all Javadoc constructs
- [ ] Semantic preservation of documentation structure
- [ ] AI-friendly output suitable for agent processing

## Architecture

```
javagentdoc/
├── pom.xml                          # Parent Maven POM
├── semantic-xml-doclet/             # Custom doclet module
│   ├── pom.xml
│   └── src/main/java/
│       └── com/github/javagentdoc/doclet/
│           └── SemanticXmlDoclet.java
├── README.md
└── constitution.md                  # Project principles and requirements
```

## Requirements

- Java 17+
- Maven 3.6+

## Development

### Building

```bash
mvn clean install
```

### Testing with Guava

To test against the Google Guava library:

```bash
# Clone guava
git clone https://github.com/google/guava.git
cd guava

# Run our doclet
mvn javadoc:javadoc \
  -Djavadoc.doclet=com.github.javagentdoc.doclet.SemanticXmlDoclet \
  -Djavadoc.docletpath=/path/to/semantic-xml-doclet.jar \
  -Djavadoc.additionalOptions="--semanticOut /tmp/guava-docs.md --semanticFormat markdown"
```

## License

MIT

## Contributing

See `constitution.md` for principles and requirements.
