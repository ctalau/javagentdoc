# Testing JavaAgentDoc with Google Guava

This guide explains how to test JavaAgentDoc with the Google Guava library.

## Prerequisites

- Java 17+
- Maven 3.6+
- Git

## Step 1: Build JavaAgentDoc

From the javagentdoc repository root:

```bash
mvn clean install -DskipTests
```

This produces the doclet JAR at:
```
semantic-xml-doclet/target/semantic-xml-doclet-0.1.0-SNAPSHOT.jar
```

Note the absolute path to this JAR—you'll need it below.

## Step 2: Clone Google Guava

```bash
cd /tmp
git clone https://github.com/google/guava.git
cd guava
```

## Step 3: Run JavaAgentDoc on Guava

### Option A: Using Maven Javadoc Plugin

Create a temporary `pom-override.xml` in the guava directory:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.google</groupId>
    <artifactId>guava-docs</artifactId>
    <version>1.0</version>
    <packaging>pom</packaging>

    <properties>
        <maven.compiler.release>17</maven.compiler.release>
    </properties>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-javadoc-plugin</artifactId>
                <version>3.6.3</version>
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
                        <additionalOption>/tmp/guava-docs.md</additionalOption>
                        <additionalOption>--semanticFormat</additionalOption>
                        <additionalOption>markdown</additionalOption>
                    </additionalOptions>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```

Then run:

```bash
mvn -f pom-override.xml javadoc:javadoc
```

### Option B: Using javadoc Command Directly

```bash
DOCLET_JAR="/path/to/semantic-xml-doclet-0.1.0-SNAPSHOT.jar"

javadoc \
  --doclet com.github.javagentdoc.doclet.SemanticXmlDoclet \
  --doclet-path "$DOCLET_JAR" \
  --semanticOut /tmp/guava-docs.md \
  --semanticFormat markdown \
  -encoding UTF-8 \
  -sourcepath guava/src \
  -subpackages com.google.common
```

(Adjust `-sourcepath` to match Guava's structure.)

## Step 4: Verify Output

Check the generated Markdown:

```bash
# View the file
less /tmp/guava-docs.md

# Check file size and line count
wc -l /tmp/guava-docs.md
ls -lh /tmp/guava-docs.md

# Search for known classes
grep -c "class:" /tmp/guava-docs.md
grep "class: \`Lists\`" /tmp/guava-docs.md
```

## Expected Output Structure

The generated Markdown should contain:

1. **Header**: `# API Documentation`
2. **Packages**: Each package as `## Package: com.google.common.xxx`
3. **Classes/Interfaces**: Each type as `### Class: \`ClassName\``
4. **Methods**: Each method as `- **Method:** \`returnType methodName(...)\``
5. **Fields**: Each field as `- **Field:** \`fieldType fieldName\``
6. **Documentation**: Doc comments included under each element

Example snippet:
```markdown
# API Documentation

## Package: com.google.common.base

### Class: `Splitter`

**Description:** An object that divides strings (a "splitter") based on a pattern...

#### Members

- **Method:** `static Splitter on(char separator)`
  - Returns a splitter that uses the given single-character separator. ...

- **Field:** `static final Splitter on(String pattern)`
  - Returns a splitter that divides strings at the given pattern. ...
```

## Troubleshooting

### "Doclet failed" or similar errors

1. **Check doclet JAR exists**:
   ```bash
   ls -l semantic-xml-doclet/target/semantic-xml-doclet-*.jar
   ```

2. **Check Java version**:
   ```bash
   java -version
   ```
   Must be Java 17+.

3. **Check doclet class name**:
   Ensure you're using `com.github.javagentdoc.doclet.SemanticXmlDoclet`.

4. **Check for compilation errors**:
   ```bash
   mvn clean install
   ```

### Output file not created

1. Ensure `--semanticOut` points to a writable directory
2. Create the directory if it doesn't exist
3. Check file permissions

### Empty or incomplete output

This is expected for the MVP. The current implementation:
- ✓ Captures package/class/method structure
- ✓ Includes basic documentation text
- ⚠ Does NOT yet fully parse @param, @return, @throws tags
- ⚠ Does NOT yet handle @link, @code inline tags as semantic elements

See `constitution.md` for full feature requirements.

## Success Criteria

✓ **MVP Success**: Generated Markdown file contains:
  - All classes from Guava
  - All methods with signatures
  - Documentation comments for each member
  - File is valid Markdown that renders properly

## Next Steps

After verifying successful output:

1. Review the generated Markdown
2. Check coverage (how many classes/methods are included)
3. Create an issue or PR with findings
4. Discuss semantic enrichment needs (full tag parsing, cross-references, etc.)

## Performance Notes

On a modern machine, processing Google Guava (~5000 public elements) should take:
- **XML generation**: 5-15 seconds
- **Markdown generation**: 5-15 seconds

Times vary based on:
- JDK version and optimization
- Disk I/O speed
- Available memory
