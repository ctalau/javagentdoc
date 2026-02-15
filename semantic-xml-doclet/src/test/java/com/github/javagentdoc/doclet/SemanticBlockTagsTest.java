package com.github.javagentdoc.doclet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import javax.tools.DocumentationTool;
import javax.tools.ToolProvider;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for semantic parsing of Javadoc block tags.
 *
 * Phase 2 requirement: Block tags (@param, @return, @throws, etc.)
 * should be parsed into semantic elements, NOT raw text.
 */
class SemanticBlockTagsTest {

    @TempDir
    Path tempDir;

    /**
     * Test that @param tags are parsed into structured semantic elements
     * with separate name and description fields, not as raw "@param name description" text.
     */
    @Test
    void testParamTagsParsedSemantically() throws Exception {
        // Create a test Java file with @param tags
        Path sourceFile = tempDir.resolve("TestClass.java");
        Files.writeString(sourceFile, """
            package test;

            /**
             * A test class for semantic tag parsing.
             */
            public class TestClass {
                /**
                 * Calculates the sum of two numbers.
                 *
                 * @param a the first number
                 * @param b the second number
                 * @return the sum of a and b
                 * @throws IllegalArgumentException if either parameter is negative
                 */
                public int add(int a, int b) {
                    if (a < 0 || b < 0) {
                        throw new IllegalArgumentException("Parameters must be non-negative");
                    }
                    return a + b;
                }
            }
            """);

        // Generate XML documentation
        Path outputFile = tempDir.resolve("output.xml");
        DocumentationTool javadoc = ToolProvider.getSystemDocumentationTool();

        int result = javadoc.run(
            null, null, null,
            "-doclet", "com.github.javagentdoc.doclet.SemanticXmlDoclet",
            "-sourcepath", sourceFile.getParent().toString(),
            "--semanticOut", outputFile.toString(),
            "--semanticFormat", "xml",
            sourceFile.toString()
        );

        assertEquals(0, result, "Doclet should run successfully");
        assertTrue(Files.exists(outputFile), "Output file should be created");

        // Read and parse the XML output
        String xmlContent = Files.readString(outputFile);

        // SEMANTIC PARSING REQUIREMENTS:
        // Instead of: <tag kind="PARAM">@param a the first number</tag>
        // We expect: <param name="a"><description>the first number</description></param>

        // Test 1: @param tags should have separate 'name' attribute
        assertTrue(
            xmlContent.contains("<param name=\"a\""),
            "Expected semantic <param name=\"a\"> element, but got raw text format. " +
            "Actual XML:\n" + xmlContent
        );

        assertTrue(
            xmlContent.contains("<param name=\"b\""),
            "Expected semantic <param name=\"b\"> element, but got raw text format"
        );

        // Test 2: @param descriptions should be in separate description element
        assertTrue(
            xmlContent.contains("<description>the first number</description>") ||
            xmlContent.contains(">the first number<"),
            "Expected semantic description element for param 'a'"
        );

        // Test 3: @return should be in a semantic <return> element
        assertTrue(
            xmlContent.contains("<return>") &&
            xmlContent.contains("the sum of a and b"),
            "Expected semantic <return> element with description"
        );

        // Test 4: @throws should be in semantic <throws> element with exception type
        assertTrue(
            xmlContent.contains("<throws") &&
            xmlContent.contains("IllegalArgumentException"),
            "Expected semantic <throws> element with exception type"
        );

        // NEGATIVE TEST: Should NOT contain raw tag text like "@param a the first number"
        assertFalse(
            xmlContent.contains("@param a the first number"),
            "Should NOT contain raw '@param' text - tags should be semantically parsed. " +
            "Actual XML:\n" + xmlContent
        );

        assertFalse(
            xmlContent.contains("@return the sum"),
            "Should NOT contain raw '@return' text - should be in semantic <return> element"
        );

        assertFalse(
            xmlContent.contains("@throws IllegalArgumentException"),
            "Should NOT contain raw '@throws' text - should be in semantic <throws> element"
        );
    }

    /**
     * Test that @deprecated, @since, @author tags are parsed semantically.
     */
    @Test
    void testMetadataTagsParsedSemantically() throws Exception {
        Path sourceFile = tempDir.resolve("DeprecatedClass.java");
        Files.writeString(sourceFile, """
            package test;

            /**
             * An old class that should not be used.
             *
             * @author John Doe
             * @version 1.0
             * @since 0.1
             * @deprecated Use NewClass instead
             */
            @Deprecated
            public class DeprecatedClass {
            }
            """);

        Path outputFile = tempDir.resolve("output.xml");
        DocumentationTool javadoc = ToolProvider.getSystemDocumentationTool();

        int result = javadoc.run(
            null, null, null,
            "-doclet", "com.github.javagentdoc.doclet.SemanticXmlDoclet",
            "-sourcepath", sourceFile.getParent().toString(),
            "--semanticOut", outputFile.toString(),
            "--semanticFormat", "xml",
            sourceFile.toString()
        );

        assertEquals(0, result, "Doclet should run successfully");

        String xmlContent = Files.readString(outputFile);

        // These should be in semantic elements, not raw "@author John Doe" text
        assertTrue(
            xmlContent.contains("<author>John Doe</author>") ||
            xmlContent.contains("<author name=\"John Doe\""),
            "Expected semantic <author> element"
        );

        assertTrue(
            xmlContent.contains("<deprecated>") &&
            xmlContent.contains("Use NewClass instead"),
            "Expected semantic <deprecated> element with reason"
        );

        assertTrue(
            xmlContent.contains("<since>0.1</since>") ||
            xmlContent.contains("<since version=\"0.1\""),
            "Expected semantic <since> element"
        );

        // Should NOT have raw tag text
        assertFalse(
            xmlContent.contains("@author John Doe"),
            "Should NOT contain raw '@author' text"
        );

        assertFalse(
            xmlContent.contains("@deprecated Use NewClass"),
            "Should NOT contain raw '@deprecated' text"
        );
    }
}
