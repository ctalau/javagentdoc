# Oxygen XML Documentation Generation

This document describes how the Oxygen XML 28.0.0.3 markdown files in `samples/oxygen/` were generated, and explains the known gap between source files and generated output.

## What Was Generated

- **Output location:** `samples/oxygen/`
- **Total files committed:** 944 markdown files across 75 packages
  - 880 class/interface/enum markdown files
  - 64 package `README.md` index files
  - 1 root `README.md` index
- **Source:** `oxygen-28.0.0.3-sources.jar` (1,114 Java source files)
- **Committed:** 2026-02-17, commit `2cd5399`

## Generation Process

The markdown was generated using the `SemanticXmlDoclet` custom Javadoc doclet in this repository. The process mirrors the Guava generation (`generate-guava-docs-mvn.sh`) but targets Oxygen sources and dependencies.

### Steps

1. **Build the doclet:**
   ```bash
   cd semantic-xml-doclet
   mvn clean package
   ```

2. **Assemble Oxygen dependencies on the classpath:**
   - `oxygen.jar`
   - `oxygen-annotations.jar`
   - `oxygen-basic-utilities.jar`
   - `oxygen-patched-slf4j.jar`
   - `oxygen-patched-saxon-12he.jar`

3. **Expand the sources JAR and list all `.java` files:**
   ```bash
   jar xf oxygen-28.0.0.3-sources.jar
   find . -name "*.java" > source-files.txt
   ```

4. **Run `javadoc` with the custom doclet:**
   ```bash
   javadoc \
     -doclet com.github.javagentdoc.doclet.SemanticXmlDoclet \
     -docletpath semantic-xml-doclet/target/semantic-xml-doclet-0.1.0-SNAPSHOT.jar \
     --semanticOut samples/oxygen/README.md \
     --semanticFormat markdown \
     -classpath oxygen.jar:oxygen-annotations.jar:... \
     -encoding UTF-8 \
     -quiet \
     @source-files.txt
   ```

The doclet creates:
- `samples/oxygen/README.md` — index of all packages
- `samples/oxygen/<package/path>/README.md` — per-package index
- `samples/oxygen/<package/path>/ClassName.md` — per-class documentation

### Re-running Generation

There is currently no dedicated script for Oxygen (unlike Guava, which has `generate-guava-docs-mvn.sh`). To regenerate:

1. Obtain `oxygen-28.0.0.3-sources.jar` and all dependency JARs listed above.
2. Follow the steps in the **Steps** section above.
3. Commit the resulting `samples/oxygen/` directory.

> **TODO:** Create `generate-oxygen-docs.sh` modelled on `generate-guava-docs-mvn.sh` to make regeneration reproducible.

## Why Not All Java Sources Have Markdown Files

Of the **1,114 Java source files** in `oxygen-28.0.0.3-sources.jar`, only **880 class markdown files** were generated — a gap of **234 missing types (21%)**.

### Root Cause 1: Inner/Nested Classes Are Not Generated as Separate Files

The doclet iterates over **top-level package members only**. In `generatePackageMarkdown` (`SemanticXmlDoclet.java:250`):

```java
for (Element enclosed : pkg.getEnclosedElements()) {
    if (enclosed.getKind().isClass() || enclosed.getKind().isInterface()) {
        generateClassMarkdown(type, pkgDir, pkgName, docTrees);
    }
}
```

`pkg.getEnclosedElements()` returns only the **direct children of a package** — i.e., top-level classes. Classes declared as inner/nested types within another class are enclosed elements of their *parent class*, not the package, so they are never visited here.

Additionally, `generateClassMarkdown` only iterates `FIELD`, `CONSTRUCTOR`, and `METHOD` element kinds from the type's enclosed elements — it does not recurse into nested type declarations. So nested classes are neither generated as separate files nor mentioned in their enclosing class's markdown.

**Effect:** Any public or protected inner/nested class (e.g., `OuterClass.InnerClass`) has no markdown file and is completely absent from the output.

### Root Cause 2: Package-Private (Default Access) Classes Are Excluded by javadoc

The `javadoc` tool processes only **public and protected** elements by default. Package-private (default-access) top-level classes present in the sources JAR are excluded from `env.getIncludedElements()` and never reach the doclet.

Oxygen's sources include many single-letter obfuscated implementation classes (e.g., `i`, `ib`, `c`) that are likely package-private internal types. These would not be included unless `javadoc` is run with the `-package` or `-private` visibility flag.

**Effect:** Package-private top-level classes have no markdown file even though their `.java` source is in the JAR.

### Summary of the Gap

| Reason | Description |
|--------|-------------|
| Inner/nested classes | Doclet only processes top-level package members; nested types are silently skipped |
| Package-private classes | `javadoc` default visibility excludes non-public top-level types |

### Potential Fixes

**To include inner/nested classes**, `generatePackageMarkdown` (or a new recursive step) would need to walk the type hierarchy and generate files for enclosed types, e.g.:

```java
// Pseudocode — not yet implemented
private void generateClassMarkdownRecursive(TypeElement type, ...) {
    generateClassMarkdown(type, ...);
    for (Element enclosed : type.getEnclosedElements()) {
        if (enclosed.getKind().isClass() || enclosed.getKind().isInterface()) {
            generateClassMarkdownRecursive((TypeElement) enclosed, ...);
        }
    }
}
```

**To include package-private classes**, add the `-package` flag to the `javadoc` invocation:

```bash
javadoc \
  -package \       # includes package-private in addition to public/protected
  -doclet com.github.javagentdoc.doclet.SemanticXmlDoclet \
  ...
```

Whether to do either depends on the intended audience: public API documentation normally excludes both, while comprehensive internal documentation would include them.
