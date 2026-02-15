package com.github.javagentdoc.doclet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import javax.tools.DocumentationTool;
import javax.tools.ToolProvider;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for generic type parameter extraction and preservation.
 *
 * Phase 2 requirement: Generic type parameters should be extracted
 * and preserved with their bounds and constraints, not as raw strings.
 */
class GenericTypeParametersTest {

    @TempDir
    Path tempDir;

    /**
     * Test that class-level generic type parameters are extracted semantically.
     */
    @Test
    void testClassGenericParameters() throws Exception {
        Path sourceFile = tempDir.resolve("GenericClass.java");
        Files.writeString(sourceFile, """
            package test;

            /**
             * A generic container class.
             *
             * @param <T> the type of elements
             * @param <K> the key type
             */
            public class GenericClass<T extends Number, K> {
                private T value;
                private K key;
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
        assertTrue(Files.exists(outputFile), "Output file should be created");

        String xmlContent = Files.readString(outputFile);

        // Type parameters should be in a semantic structure
        // Expected: <typeParameters>
        //             <typeParameter name="T">
        //               <bounds>Number</bounds>
        //             </typeParameter>
        //             <typeParameter name="K"/>
        //           </typeParameters>

        assertTrue(
            xmlContent.contains("<typeParameters>") ||
            xmlContent.contains("<typeParams>"),
            "Expected semantic <typeParameters> element. Actual:\n" + xmlContent
        );

        assertTrue(
            xmlContent.contains("name=\"T\"") && xmlContent.contains("name=\"K\""),
            "Expected type parameters T and K with name attributes"
        );

        // @param <T> should be separate from method parameters
        assertTrue(
            xmlContent.contains("<param name=\"T\"") ||
            xmlContent.contains("<typeParam name=\"T\""),
            "Expected type parameter @param <T> to be in semantic element"
        );

        assertTrue(
            xmlContent.contains("the type of elements") &&
            xmlContent.contains("the key type"),
            "Expected type parameter descriptions"
        );

        // Bounds should be captured
        assertTrue(
            xmlContent.contains("Number") || xmlContent.contains("extends"),
            "Expected type bound 'extends Number' to be captured"
        );
    }

    /**
     * Test that method-level generic type parameters are extracted.
     */
    @Test
    void testMethodGenericParameters() throws Exception {
        Path sourceFile = tempDir.resolve("GenericMethods.java");
        Files.writeString(sourceFile, """
            package test;

            import java.util.List;

            /**
             * Class with generic methods.
             */
            public class GenericMethods {
                /**
                 * Converts a list of one type to another.
                 *
                 * @param <T> the input type
                 * @param <R> the output type
                 * @param input the input list
                 * @return the converted list
                 */
                public <T, R extends Comparable<R>> List<R> convert(List<T> input) {
                    return null;
                }
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

        // Method should have type parameters
        assertTrue(
            xmlContent.contains("<typeParameters>") ||
            xmlContent.contains("<typeParams>") ||
            xmlContent.contains("typeParameter"),
            "Expected method-level type parameters"
        );

        // @param <T> and @param <R> should be distinguishable from regular @param input
        assertTrue(
            xmlContent.contains("name=\"T\"") && xmlContent.contains("the input type"),
            "Expected type parameter @param <T> with description"
        );

        assertTrue(
            xmlContent.contains("name=\"R\"") && xmlContent.contains("the output type"),
            "Expected type parameter @param <R> with description"
        );

        // Regular parameter should also be present
        assertTrue(
            xmlContent.contains("name=\"input\"") && xmlContent.contains("the input list"),
            "Expected regular parameter 'input' with description"
        );

        // Type bounds should be captured (R extends Comparable<R>)
        assertTrue(
            xmlContent.contains("Comparable") || xmlContent.contains("extends"),
            "Expected type bound 'extends Comparable<R>'"
        );
    }

    /**
     * Test that complex nested generics are preserved.
     */
    @Test
    void testNestedGenerics() throws Exception {
        Path sourceFile = tempDir.resolve("NestedGenerics.java");
        Files.writeString(sourceFile, """
            package test;

            import java.util.Map;
            import java.util.List;

            /**
             * Class with complex nested generics.
             */
            public class NestedGenerics {
                /**
                 * Processes nested generic structures.
                 *
                 * @param data the input map
                 * @return processed map
                 */
                public Map<String, List<Integer>> process(Map<String, List<Integer>> data) {
                    return data;
                }
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

        // Method parameter and return types should preserve generic structure
        // e.g., type="Map<String, List<Integer>>" or similar
        assertTrue(
            xmlContent.contains("Map") && xmlContent.contains("List") &&
            xmlContent.contains("String") && xmlContent.contains("Integer"),
            "Expected nested generic types to be preserved in method signature"
        );

        // Should have structured type information, not just flattened string
        assertTrue(
            xmlContent.contains("type=") || xmlContent.contains("<type"),
            "Expected type information in semantic structure"
        );
    }
}
