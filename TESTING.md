# Testing JavaAgentDoc

This document describes how to test the JavaAgentDoc doclet processor and validate generated Markdown documentation.

## Prerequisites

- Java 17+
- Maven 3.6+
- Git (for cloning test projects like Guava)

## Quick Start

### One Command to Rule Them All

```bash
cd /home/miciiortodocsi/javagentdoc
mvn clean verify
```

This will:
1. Build the project
2. Run unit tests (test phase)
3. Generate Guava docs (pre-integration-test phase)
4. Run integration tests to validate Markdown (integration-test phase)
5. Verify all tests passed (verify phase)

### Run Only Integration Tests

```bash
mvn integration-test -DskipTests
```

Or to skip doc generation if already generated:

```bash
mvn failsafe:integration-test
```

## Markdown Validation Tests

**Location:** `semantic-xml-doclet/src/test/java/com/github/javagentdoc/doclet/MarkdownValidationIT.java`

**Type:** Integration Test (runs in `integration-test` phase)

### What Gets Tested

1. ✅ **No broken JRE type links** - Ensures JRE types aren't linked with broken relative paths
2. ✅ **No type parameter broken links** - Ensures generic type parameters (K, V, T) aren't incorrectly linked
3. ✅ **No unconverted `{@code}` tags** - Ensures all `{@code}` converted to backticks
4. ✅ **No unconverted `{@link}` tags** - Ensures all `{@link}` properly converted
5. ✅ **No unconverted `{@literal}` tags** - Ensures all `{@literal}` converted
6. ✅ **No unconverted `{@linkplain}` tags** - Ensures all `{@linkplain}` converted
7. ✅ **No unconverted `@since` tags** - Ensures formatted as `**Since:**`
8. ✅ **No unconverted `@author` tags** - Ensures formatted as `**Author:**`
9. ✅ **No unconverted `@deprecated` tags** - Ensures formatted as `**Deprecated:**`
10. ✅ **Valid markdown structure** - Ensures proper headings and no malformed links

### Running Specific Tests

```bash
# Run all markdown validation integration tests
mvn verify

# Run specific test
mvn verify -Dit.test=MarkdownValidationIT#testNoBrokenJreLinks

# Run with verbose output
mvn verify -X

# Skip doc generation if already done
mvn failsafe:integration-test -Dit.test=MarkdownValidationIT
```

### Expected Output (Passing)

```
[INFO] -------------------------------------------------------
[INFO]  I N T E G R A T I O N   T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.github.javagentdoc.doclet.MarkdownValidationIT
[INFO] Tests run: 11, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```

### Example Failure Output

If issues are found, tests will fail with detailed reports:

```
Found unconverted {@code} tags:
════════════════════════════════════════════════════════════════════════════════
Found 15 issues

  Joiner.md:13
    Unconverted {@code} tag
    > Users of {@code CompletableFuture} will likely...

  FluentFuture.md:40
    Unconverted {@code} tag
    > The {@code newArrayList(E[])} method...

  ... and 13 more issues
```

## Testing with Google Guava

### Automated Testing (Recommended)

```bash
cd /home/miciiortodocsi/javagentdoc

# One command: build, generate docs, and validate
mvn clean verify
```

This automatically:
1. Builds the doclet
2. Generates Guava docs (~15 minutes)
3. Runs validation tests
4. Reports results

### Manual Testing

```bash
# Just generate docs
./generate-guava-docs.sh

# Just run tests on existing docs
mvn failsafe:integration-test
```

### Manual Verification

```bash
cd samples/guava

# Check for broken JRE links
grep -r '\[`java\.' . --include="*.md" | grep '\.\./.*\.md'

# Check for type parameter links
grep -r '\[`[A-Z]`\]([A-Z]\.md)' . --include="*.md"

# Check for unconverted tags
grep -r '{@code' . --include="*.md"
grep -r '{@link' . --include="*.md"
grep -r '^@since' . --include="*.md"
```

## Testing with Your Own Project

### Using Maven

```bash
# In your project directory
mvn javadoc:javadoc
```

### Using Command Line

```bash
javadoc \
  -doclet com.github.javagentdoc.doclet.SemanticXmlDoclet \
  -docletpath /path/to/semantic-xml-doclet-0.1.0-SNAPSHOT.jar \
  --semanticOut /path/to/output.md \
  --semanticFormat markdown \
  -sourcepath /path/to/src \
  -subpackages your.package.name
```

## Continuous Integration

### GitHub Actions Example

```yaml
name: Validate Documentation

on: [push, pull_request]

jobs:
  test:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v3

      - name: Set up JDK 17
        uses: actions/setup-java@v3
        with:
          java-version: '17'
          distribution: 'temurin'

      - name: Build and test
        run: mvn clean package

      - name: Generate test docs
        run: |
          ./generate-guava-docs.sh
          mkdir -p semantic-xml-doclet/target/test-docs
          cp -r samples/guava/* semantic-xml-doclet/target/test-docs/

      - name: Validate Markdown
        run: mvn test -Dtest=MarkdownValidationIT
```

## Fixing Issues

If tests fail, the root cause is in the markdown generation code.

**File:** `semantic-xml-doclet/src/main/java/com/github/javagentdoc/doclet/SemanticXmlDoclet.java`

**Key methods:**
- `formatTypeLink()` (line ~427) - Handles type link generation
- `convertLinksInText()` (line ~452) - Handles Javadoc tag conversion

### Fix Workflow

1. Edit the problematic method in `SemanticXmlDoclet.java`
2. Rebuild: `mvn clean package`
3. Regenerate docs: `./generate-guava-docs.sh`
4. Re-run tests: `mvn test -Dtest=MarkdownValidationIT`
5. Repeat until tests pass

## Troubleshooting

### "No markdown files found - skipping test"

Ensure:
1. Documentation has been generated
2. Files are copied to `semantic-xml-doclet/target/test-docs/`
3. Path is correct: `ls semantic-xml-doclet/target/test-docs/`

### Doclet Not Found

```
error: Cannot find doclet class com.github.javagentdoc.doclet.SemanticXmlDoclet
```

Solution: Build the doclet first:
```bash
mvn clean package
ls semantic-xml-doclet/target/semantic-xml-doclet-0.1.0-SNAPSHOT.jar
```

### Out of Memory

For large projects like Guava:
```bash
export MAVEN_OPTS="-Xmx4g"
./generate-guava-docs.sh
```

## Performance Notes

- Small projects (< 100 classes): < 5 seconds
- Medium projects (100-1000 classes): 5-30 seconds
- Large projects (1000+ classes like Guava): 30+ seconds

Memory usage: typically < 512MB for most projects, up to 2GB for Guava
