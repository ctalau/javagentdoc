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
import java.util.regex.Pattern;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests markdown generation for method parameter documentation.
 *
 * Method signatures should remain plain (no markdown links), while
 * parameter details should include type links and @param descriptions.
 */
public class MarkdownParameterDocumentationTest {

    @TempDir
    Path tempDir;

    @Test
    public void testMethodHeaderHasNoLinksButParameterSectionDoes() throws Exception {
        Path sourceDir = tempDir.resolve("src");
        Files.createDirectories(sourceDir);

        Path helperFile = sourceDir.resolve("Helper.java");
        Files.writeString(helperFile, """
            package test;

            /**
             * Helper dependency used by service methods.
             */
            public class Helper {
            }
            """);

        Path serviceFile = sourceDir.resolve("Service.java");
        Files.writeString(serviceFile, """
            package test;

            /**
             * Service with documented parameters.
             */
            public class Service {
                /**
                 * Process input data.
                 *
                 * @param helper helper to use
                 * @param count item count
                 */
                public void process(Helper helper, int count) {
                }
            }
            """);

        Path outputFile = tempDir.resolve("docs/README.md");
        runDoclet(sourceDir, outputFile);

        Path serviceDoc = tempDir.resolve("docs/test/Service.md");
        assertTrue(Files.exists(serviceDoc), "Expected generated markdown for Service");
        String markdown = Files.readString(serviceDoc);

        String headerLine = markdown.lines()
            .filter(line -> line.startsWith("### `process("))
            .findFirst()
            .orElse("");

        assertFalse(headerLine.isEmpty(), "Expected method signature header for process");
        assertFalse(
            headerLine.contains("]("),
            "Method signature header should not contain markdown links: " + headerLine
        );

        assertTrue(
            markdown.contains("**Parameters:**"),
            "Expected parameter documentation block in method output"
        );

        Pattern helperParamPattern = Pattern.compile(
            "- `helper` \\(\\[`[^`]*Helper`\\]\\([^)]*Helper\\.md\\)\\): helper to use"
        );
        assertTrue(
            helperParamPattern.matcher(markdown).find(),
            "Expected linked Helper type and @param description in parameter documentation"
        );

        assertTrue(
            markdown.contains("- `count` (`int`): item count"),
            "Expected primitive parameter with @param description"
        );
    }

    private void runDoclet(Path sourceDir, Path outputFile) throws IOException {
        DocumentationTool tool = ToolProvider.getSystemDocumentationTool();
        StandardJavaFileManager fileManager = tool.getStandardFileManager(null, null, null);

        Path[] sourcePaths;
        try (Stream<Path> sourceStream = Files.list(sourceDir)) {
            sourcePaths = sourceStream
                .filter(path -> path.toString().endsWith(".java"))
                .toArray(Path[]::new);
        }

        Iterable<? extends JavaFileObject> sources = fileManager.getJavaFileObjectsFromPaths(List.of(sourcePaths));

        List<String> options = List.of(
            "-doclet", "com.github.javagentdoc.doclet.SemanticXmlDoclet",
            "-docletpath", System.getProperty("java.class.path"),
            "--semanticOut", outputFile.toString(),
            "--semanticFormat", "markdown"
        );

        DocumentationTool.DocumentationTask task = tool.getTask(
            null, fileManager, null, null, options, sources
        );

        Boolean result = task.call();
        assertTrue(Boolean.TRUE.equals(result), "Doclet should run successfully");
    }
}
