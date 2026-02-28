# Oxygen XML Documentation Generation

This document describes how the Oxygen XML 28.0.0.3 markdown files in `samples/oxygen/` were generated, the root causes of missing documentation, and how to regenerate.

## What Was Generated

- **Output location:** `samples/oxygen/`
- **Total files committed:** 944 markdown files across 64 packages
  - 880 class/interface/enum markdown files
  - 64 package `README.md` index files
  - 1 root `README.md` index
- **Source:** `oxygen-28.0.0.3-sources.jar` (1,114 Java source files)
- **Committed:** 2026-02-17, commit `2cd5399`

## Regenerating Documentation

Use the dedicated script:

```bash
OXYGEN_SOURCES_JAR=/path/to/oxygen-28.0.0.3-sources.jar \
OXYGEN_DEPS_DIR=/path/to/oxygen/lib \
./generate-oxygen-docs.sh
```

The script extracts sources, builds a classpath from all JARs in `OXYGEN_DEPS_DIR`,
runs `javadoc` with the `SemanticXmlDoclet`, and reports any errors that caused packages
to be excluded.

Build the doclet first if needed:
```bash
cd semantic-xml-doclet && mvn clean package
```

See `generate-oxygen-docs.sh` for all options and environment variables.

## Why the `ro.sync.ecss.extensions.api` Package Is Missing

`AuthorDocumentController`, `AuthorOperationArgument`, and all other types in
`ro.sync.ecss.extensions.api` and its sub-packages are **completely absent** from the
generated output — there is no `samples/oxygen/ro/sync/ecss/extensions/api/` directory
at all, even though those types are referenced (as broken links) from generated files.

### Root Cause: Classpath Errors Silently Excluded the Entire Package Tree

The previous generation command piped stderr through `grep -v "^warning:" || true`,
which suppressed **both warnings and errors**. When `javadoc` encounters types whose
referenced symbols cannot be resolved (e.g. missing dependency JARs), it emits
`error: cannot find symbol` messages — these were silently discarded.

When compilation errors occur for a group of types, `javadoc` cannot resolve their
inter-dependencies and excludes them from `DocletEnvironment.getIncludedElements()`.
Because the doclet only generates output for packages that appear in that set, the
entire `ro.sync.ecss.extensions.api` subtree was skipped without any visible indication.

The generation script `generate-oxygen-docs.sh` captures stderr separately so errors
are visible, making this class of problem diagnosable.

### How to Fix It

1. **Identify missing dependencies** — run the script and check the error log:
   ```
   $WORK_DIR/javadoc.log
   ```
   Look for `error: cannot find symbol` lines. The missing class names tell you which
   JARs need to be added to `OXYGEN_DEPS_DIR`.

2. **Add the missing JARs** — common candidates:
   - JARs bundled with the Oxygen installation (`lib/`, `lib/endorsed/`, etc.)
   - Third-party JARs that Oxygen depends on (e.g. Swing/AWT come from the JDK and
     are always available; look for Oxygen-specific frameworks like JGoodies, JAXB
     implementations, Apache Commons, etc.)

3. **Re-run the script** after adding the JARs until no `error:` lines remain.

## Why Many Obfuscated Class Files Are Present

The sources JAR includes internal implementation classes with obfuscated single-letter
names (e.g. `i`, `ib`, `c`, `lb` in `ro.sync.ecss.extensions`). These are
package-level implementation details of the Oxygen runtime, not part of the public API.
They appear in the generated docs because `javadoc` processes all public and protected
types by default, and these classes happen to be `public` (required by the JVM even for
obfuscated code that is referenced across compilation units).

To suppress them, scope the generation to specific public API packages by passing
`-subpackages` instead of a flat source list:

```bash
javadoc \
  -doclet ... \
  --semanticOut ... \
  --semanticFormat markdown \
  -classpath "$CLASSPATH" \
  -sourcepath src \
  -subpackages ro.sync.ecss.extensions.api:ro.sync.exml.workspace.api:ro.sync.exml.plugin
```

This is not yet wired into `generate-oxygen-docs.sh` but can be added when the desired
package scope is known.

## Known Gaps Between Sources and Generated Output

Of the **1,114 Java source files** in `oxygen-28.0.0.3-sources.jar`, only **880 class
markdown files** were generated. The 234-file gap has three causes:

| Cause | Description |
|-------|-------------|
| Classpath errors | Types whose dependencies were not on the classpath were excluded from `getIncludedElements()` (primary cause for the missing `api` subtree) |
| Inner/nested classes | The doclet only generates files for top-level package members; classes nested inside other classes are silently skipped |
| Package-private classes | `javadoc` excludes package-private types by default |
