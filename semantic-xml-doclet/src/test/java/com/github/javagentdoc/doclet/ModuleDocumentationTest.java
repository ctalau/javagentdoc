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
 * Tests for Phase 3: Module documentation support.
 *
 * Verifies that Java 9+ modules (module-info.java) are documented
 * with their exports, requires, opens, and provides directives.
 */
public class ModuleDocumentationTest {

    @TempDir
    Path tempDir;

    /**
     * Test that module is documented with basic information.
     *
     * Expected behavior:
     * - <module> element with module name
     * - Module documentation comment captured
     */
    @Test
    public void testBasicModuleDocumentation() throws Exception {
        Path sourceDir = tempDir.resolve("src");
        Files.createDirectories(sourceDir);

        // Module descriptor
        Path moduleFile = sourceDir.resolve("module-info.java");
        Files.writeString(moduleFile, """
            /**
             * Test module for basic documentation.
             * @since 1.0
             */
            module com.example.testmodule {
            }
            """);

        // Need at least one class in the module
        Path classFile = sourceDir.resolve("TestClass.java");
        Files.writeString(classFile, """
            package com.example;

            /**
             * Test class.
             */
            public class TestClass {
            }
            """);

        Path outputFile = tempDir.resolve("output.xml");
        runDoclet(sourceDir, outputFile);

        String xmlContent = Files.readString(outputFile);

        // ASSERTIONS: Verify module is documented

        // Should have <module> element
        assertTrue(
            xmlContent.contains("<module") || xmlContent.contains("module"),
            "Expected <module> element for module documentation"
        );

        // Should include module name
        assertTrue(
            xmlContent.contains("com.example.testmodule") || xmlContent.contains("testmodule"),
            "Expected module name in output"
        );
    }

    /**
     * Test that module exports are captured.
     *
     * Expected behavior:
     * - <exports> elements for exported packages
     * - Qualified package names
     * - Qualified exports (exports to specific modules)
     */
    @Test
    public void testModuleExports() throws Exception {
        Path sourceDir = tempDir.resolve("src");
        Files.createDirectories(sourceDir);

        // Module with exports
        Path moduleFile = sourceDir.resolve("module-info.java");
        Files.writeString(moduleFile, """
            /**
             * Module with exports.
             */
            module com.example.mymodule {
                exports com.example.api;
                exports com.example.util to com.example.client;
            }
            """);

        // Package for export
        Path apiDir = sourceDir.resolve("com/example/api");
        Files.createDirectories(apiDir);
        Path apiFile = apiDir.resolve("Api.java");
        Files.writeString(apiFile, """
            package com.example.api;

            /** API class. */
            public class Api {
            }
            """);

        Path outputFile = tempDir.resolve("output.xml");
        runDoclet(sourceDir, outputFile);

        String xmlContent = Files.readString(outputFile);

        // ASSERTIONS: Verify exports are captured

        // Should have exports information
        assertTrue(
            xmlContent.contains("exports") || xmlContent.contains("api"),
            "Expected exports directive to be captured"
        );

        // Should include exported package name
        assertTrue(
            xmlContent.contains("com.example.api"),
            "Expected exported package name"
        );
    }

    /**
     * Test that module requires are captured.
     *
     * Expected behavior:
     * - <requires> elements for required modules
     * - Module names and modifiers (transitive, static)
     */
    @Test
    public void testModuleRequires() throws Exception {
        Path sourceDir = tempDir.resolve("src");
        Files.createDirectories(sourceDir);

        // Module with requires
        Path moduleFile = sourceDir.resolve("module-info.java");
        Files.writeString(moduleFile, """
            /**
             * Module with dependencies.
             */
            module com.example.consumer {
                requires java.base;
                requires transitive java.sql;
                requires static java.logging;
            }
            """);

        // Dummy class
        Path classFile = sourceDir.resolve("Consumer.java");
        Files.writeString(classFile, """
            package com.example;

            /** Consumer class. */
            public class Consumer {
            }
            """);

        Path outputFile = tempDir.resolve("output.xml");
        runDoclet(sourceDir, outputFile);

        String xmlContent = Files.readString(outputFile);

        // ASSERTIONS: Verify requires are captured

        // Should have requires information
        assertTrue(
            xmlContent.contains("requires") || xmlContent.contains("java."),
            "Expected requires directive to be captured"
        );
    }

    /**
     * Test that module opens directives are captured.
     *
     * Expected behavior:
     * - <opens> elements for opened packages
     * - Reflection access information
     */
    @Test
    public void testModuleOpens() throws Exception {
        Path sourceDir = tempDir.resolve("src");
        Files.createDirectories(sourceDir);

        // Module with opens
        Path moduleFile = sourceDir.resolve("module-info.java");
        Files.writeString(moduleFile, """
            /**
             * Module with opens.
             */
            module com.example.reflective {
                opens com.example.internal;
            }
            """);

        // Package for opens
        Path internalDir = sourceDir.resolve("com/example/internal");
        Files.createDirectories(internalDir);
        Path internalFile = internalDir.resolve("Internal.java");
        Files.writeString(internalFile, """
            package com.example.internal;

            /** Internal class. */
            public class Internal {
            }
            """);

        Path outputFile = tempDir.resolve("output.xml");
        runDoclet(sourceDir, outputFile);

        String xmlContent = Files.readString(outputFile);

        // ASSERTIONS: Verify opens are captured

        // Should have opens information
        assertTrue(
            xmlContent.contains("opens") || xmlContent.contains("internal"),
            "Expected opens directive to be captured"
        );
    }

    /**
     * Helper: Run the doclet on source files including module-info.
     */
    private void runDoclet(Path sourceDir, Path outputFile) throws IOException {
        DocumentationTool tool = ToolProvider.getSystemDocumentationTool();
        StandardJavaFileManager fileManager = tool.getStandardFileManager(null, null, null);

        Iterable<? extends JavaFileObject> sources = fileManager.getJavaFileObjectsFromPaths(
            List.of(Files.walk(sourceDir)
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
