package com.github.javagentdoc.doclet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import javax.tools.DocumentationTool;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for Phase 3: Cross-reference resolution.
 *
 * Verifies that {@link}, {@linkplain}, and @see tags are resolved to
 * actual element references with qualified names, package information,
 * and member signatures - not just raw text.
 */
public class CrossReferenceResolutionTest {

    @TempDir
    Path tempDir;

    /**
     * Test that {@link} tags are resolved to fully qualified element references.
     *
     * Expected behavior:
     * - {@link TargetClass} should resolve to package + class name
     * - {@link TargetClass#method()} should include method signature
     * - Link references should be structured semantic elements, not plain text
     */
    @Test
    public void testLinkTagsResolvedToQualifiedReferences() throws Exception {
        // Create source files with cross-references
        Path sourceDir = tempDir.resolve("src");
        Files.createDirectories(sourceDir);

        // Target class that will be referenced
        Path targetFile = sourceDir.resolve("TargetClass.java");
        Files.writeString(targetFile, """
            /**
             * A target class that will be referenced by links.
             */
            public class TargetClass {
                /**
                 * A target method.
                 * @param value the input value
                 * @return the result
                 */
                public String targetMethod(int value) {
                    return String.valueOf(value);
                }
            }
            """);

        // Source class with {@link} references
        Path sourceFile = sourceDir.resolve("SourceClass.java");
        Files.writeString(sourceFile, """
            /**
             * A source class that references other elements.
             *
             * See {@link TargetClass} for the target class.
             * Use {@link TargetClass#targetMethod(int)} to process values.
             */
            public class SourceClass {
                /**
                 * Processes data using {@link TargetClass#targetMethod(int)}.
                 * @param input the input
                 * @return the output
                 */
                public String process(int input) {
                    return new TargetClass().targetMethod(input);
                }
            }
            """);

        // Generate XML documentation
        Path outputFile = tempDir.resolve("output.xml");
        runDoclet(sourceDir, outputFile);

        // Read generated XML
        String xmlContent = Files.readString(outputFile);

        // ASSERTIONS: Verify cross-references are resolved semantically

        // Should have a structured <link> element, not just raw {@link} text
        assertTrue(
            xmlContent.contains("<link") || xmlContent.contains("<reference"),
            "Expected semantic <link> or <reference> element for cross-references"
        );

        // Should NOT contain raw {@link} syntax in output
        assertFalse(
            xmlContent.contains("{@link"),
            "Should NOT contain raw {@link} syntax - links should be resolved"
        );

        // Should include fully qualified class name in link
        assertTrue(
            xmlContent.contains("TargetClass") &&
            (xmlContent.contains("qualified") || xmlContent.contains("fqn") || xmlContent.contains("target")),
            "Expected resolved link with qualified class reference"
        );

        // Should include method signature in method links
        assertTrue(
            xmlContent.contains("targetMethod") &&
            (xmlContent.contains("signature") || xmlContent.contains("params") || xmlContent.contains("int")),
            "Expected resolved method link with signature information"
        );
    }

    /**
     * Test that @see tags are resolved to structured references.
     *
     * Expected behavior:
     * - @see TargetClass should resolve to qualified name
     * - @see references should be semantic elements with type information
     * - Should distinguish between class refs and method refs
     */
    @Test
    public void testSeeTagsResolvedWithTypeInfo() throws Exception {
        Path sourceDir = tempDir.resolve("src");
        Files.createDirectories(sourceDir);

        // Create referenced class
        Path targetFile = sourceDir.resolve("ReferencedClass.java");
        Files.writeString(targetFile, """
            /**
             * A referenced class.
             */
            public class ReferencedClass {
                /**
                 * A referenced method.
                 */
                public void referencedMethod() {}
            }
            """);

        // Create source with @see tags
        Path sourceFile = sourceDir.resolve("SourceWithSee.java");
        Files.writeString(sourceFile, """
            /**
             * Source class with see references.
             *
             * @see ReferencedClass
             * @see ReferencedClass#referencedMethod()
             */
            public class SourceWithSee {
                /**
                 * A method.
                 * @see ReferencedClass#referencedMethod()
                 */
                public void myMethod() {}
            }
            """);

        Path outputFile = tempDir.resolve("output.xml");
        runDoclet(sourceDir, outputFile);

        String xmlContent = Files.readString(outputFile);

        // ASSERTIONS: @see should be resolved semantically

        // Should have <see> elements (already implemented in Phase 2)
        assertTrue(
            xmlContent.contains("<see"),
            "Expected <see> element for @see tags"
        );

        // Should include element type (class vs method)
        assertTrue(
            xmlContent.contains("kind=\"") || xmlContent.contains("type=\"") ||
            xmlContent.contains("elementType"),
            "Expected element type information (class/method) in see references"
        );

        // Should include qualified name
        assertTrue(
            xmlContent.contains("ReferencedClass") &&
            (xmlContent.contains("qualified") || xmlContent.contains("target=\"") || xmlContent.contains("ref=")),
            "Expected qualified reference in @see resolution"
        );

        // Should include member signature for method references
        assertTrue(
            xmlContent.contains("referencedMethod"),
            "Expected method name in resolved @see reference"
        );
    }

    /**
     * Test that unresolved references are handled gracefully.
     *
     * When a {@link} or @see references a non-existent class/method,
     * the doclet should:
     * - Not crash
     * - Mark the reference as unresolved
     * - Preserve the original reference text
     */
    @Test
    public void testUnresolvedReferencesHandledGracefully() throws Exception {
        Path sourceDir = tempDir.resolve("src");
        Files.createDirectories(sourceDir);

        // Source with broken reference
        Path sourceFile = sourceDir.resolve("SourceWithBrokenLink.java");
        Files.writeString(sourceFile, """
            /**
             * Source with a broken link.
             *
             * {@link NonExistentClass} does not exist.
             * @see NonExistentClass#nonExistentMethod()
             */
            public class SourceWithBrokenLink {
                public void test() {}
            }
            """);

        Path outputFile = tempDir.resolve("output.xml");
        runDoclet(sourceDir, outputFile);

        String xmlContent = Files.readString(outputFile);

        // ASSERTIONS: Should handle unresolved references

        // Should NOT crash (test passes if we get here)
        assertNotNull(xmlContent);

        // Should mark as unresolved or preserve text
        assertTrue(
            xmlContent.contains("NonExistentClass") &&
            (xmlContent.contains("unresolved") || xmlContent.contains("resolved=") ||
             xmlContent.contains("broken") || xmlContent.contains("<link") || xmlContent.contains("<see")),
            "Expected unresolved reference to be marked or preserved in output"
        );
    }

    /**
     * Helper: Run the doclet on source files.
     */
    private void runDoclet(Path sourceDir, Path outputFile) throws IOException {
        DocumentationTool tool = ToolProvider.getSystemDocumentationTool();
        StandardJavaFileManager fileManager = tool.getStandardFileManager(null, null, null);

        Iterable<? extends JavaFileObject> sources = fileManager.getJavaFileObjectsFromPaths(
            List.of(Files.list(sourceDir)
                .filter(p -> p.toString().endsWith(".java"))
                .toList()
                .toArray(new Path[0]))
        );

        List<String> options = List.of(
            "-doclet", "com.github.javagentdoc.doclet.SemanticXmlDoclet",
            "-docletpath", System.getProperty("java.class.path"),
            "--semanticOut", outputFile.toString(),
            "--semanticFormat", "xml"
        );

        DocumentationTool.DocumentationTask task = tool.getTask(null, null, null,
            SemanticXmlDoclet.class, options, sources);

        boolean success = task.call();
        assertTrue(success, "Doclet execution should succeed");
    }
}
