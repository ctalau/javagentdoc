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
 * Tests for Phase 3: Inheritance hierarchy tracking.
 *
 * Verifies that class extends and implements relationships are captured
 * as semantic elements in the XML output, including qualified names for
 * parent types.
 */
public class InheritanceHierarchyTest {

    @TempDir
    Path tempDir;

    /**
     * Test that class extends relationships are captured semantically.
     *
     * Expected behavior:
     * - <extends> element with qualified name of superclass
     * - Not just toString() of the type
     */
    @Test
    public void testClassExtendsTracked() throws Exception {
        Path sourceDir = tempDir.resolve("src");
        Files.createDirectories(sourceDir);

        // Base class
        Path baseFile = sourceDir.resolve("BaseClass.java");
        Files.writeString(baseFile, """
            /**
             * Base class for testing inheritance.
             */
            public class BaseClass {
                public void baseMethod() {}
            }
            """);

        // Derived class
        Path derivedFile = sourceDir.resolve("DerivedClass.java");
        Files.writeString(derivedFile, """
            /**
             * Derived class that extends BaseClass.
             */
            public class DerivedClass extends BaseClass {
                public void derivedMethod() {}
            }
            """);

        Path outputFile = tempDir.resolve("output.xml");
        runDoclet(sourceDir, outputFile);

        String xmlContent = Files.readString(outputFile);

        // ASSERTIONS: Verify inheritance is tracked

        // Should have <extends> element
        assertTrue(
            xmlContent.contains("<extends") || xmlContent.contains("<superclass"),
            "Expected <extends> or <superclass> element for class inheritance"
        );

        // Should include qualified name of BaseClass
        assertTrue(
            xmlContent.contains("BaseClass") &&
            (xmlContent.contains("name=\"") || xmlContent.contains("type=\"")),
            "Expected qualified name attribute for extends relationship"
        );

        // Should NOT just have raw "extends BaseClass" text in type definition
        // (it should be a semantic element, not raw syntax)
    }

    /**
     * Test that interface implements relationships are captured.
     *
     * Expected behavior:
     * - <implements> elements for each interface
     * - Support multiple interfaces
     * - Qualified names for all implemented interfaces
     */
    @Test
    public void testInterfaceImplementsTracked() throws Exception {
        Path sourceDir = tempDir.resolve("src");
        Files.createDirectories(sourceDir);

        // Interfaces
        Path interface1File = sourceDir.resolve("Readable.java");
        Files.writeString(interface1File, """
            /**
             * Readable interface.
             */
            public interface Readable {
                void read();
            }
            """);

        Path interface2File = sourceDir.resolve("Writable.java");
        Files.writeString(interface2File, """
            /**
             * Writable interface.
             */
            public interface Writable {
                void write();
            }
            """);

        // Class implementing multiple interfaces
        Path implFile = sourceDir.resolve("FileHandler.java");
        Files.writeString(implFile, """
            /**
             * File handler implementing Readable and Writable.
             */
            public class FileHandler implements Readable, Writable {
                public void read() {}
                public void write() {}
            }
            """);

        Path outputFile = tempDir.resolve("output.xml");
        runDoclet(sourceDir, outputFile);

        String xmlContent = Files.readString(outputFile);

        // ASSERTIONS: Verify interfaces are tracked

        // Should have <implements> elements
        assertTrue(
            xmlContent.contains("<implements"),
            "Expected <implements> element(s) for interface implementation"
        );

        // Should include both Readable and Writable
        assertTrue(
            xmlContent.contains("Readable") && xmlContent.contains("Writable"),
            "Expected both implemented interfaces to be captured"
        );

        // Should have structured elements, not just text
        int implementsCount = countOccurrences(xmlContent, "<implements");
        assertTrue(
            implementsCount >= 2,
            "Expected at least 2 <implements> elements for multiple interfaces"
        );
    }

    /**
     * Test that interface extends interface is tracked.
     *
     * Expected behavior:
     * - Interfaces can extend other interfaces
     * - <extends> element for interface inheritance
     * - Multiple interface extension supported
     */
    @Test
    public void testInterfaceExtendsTracked() throws Exception {
        Path sourceDir = tempDir.resolve("src");
        Files.createDirectories(sourceDir);

        // Base interface
        Path baseInterfaceFile = sourceDir.resolve("Closeable.java");
        Files.writeString(baseInterfaceFile, """
            /**
             * Closeable interface.
             */
            public interface Closeable {
                void close();
            }
            """);

        // Extended interface
        Path extendedInterfaceFile = sourceDir.resolve("AutoCloseable.java");
        Files.writeString(extendedInterfaceFile, """
            /**
             * AutoCloseable extends Closeable.
             */
            public interface AutoCloseable extends Closeable {
                void autoClose();
            }
            """);

        Path outputFile = tempDir.resolve("output.xml");
        runDoclet(sourceDir, outputFile);

        String xmlContent = Files.readString(outputFile);

        // ASSERTIONS: Verify interface extends is tracked

        // Should have <extends> element for the interface
        assertTrue(
            xmlContent.contains("<extends") || xmlContent.contains("<superinterface"),
            "Expected <extends> or <superinterface> element for interface inheritance"
        );

        // Should include Closeable as parent
        assertTrue(
            xmlContent.contains("Closeable"),
            "Expected parent interface name to be captured"
        );
    }

    /**
     * Test that Object superclass is handled appropriately.
     *
     * Classes that don't explicitly extend anything should either:
     * - Not have <extends> element (implicit Object)
     * - OR have <extends>java.lang.Object</extends> explicitly
     */
    @Test
    public void testImplicitObjectSuperclass() throws Exception {
        Path sourceDir = tempDir.resolve("src");
        Files.createDirectories(sourceDir);

        Path classFile = sourceDir.resolve("SimpleClass.java");
        Files.writeString(classFile, """
            /**
             * Simple class with no explicit superclass.
             */
            public class SimpleClass {
                public void method() {}
            }
            """);

        Path outputFile = tempDir.resolve("output.xml");
        runDoclet(sourceDir, outputFile);

        String xmlContent = Files.readString(outputFile);

        // ASSERTIONS: Verify implicit Object is handled

        // Either no <extends> or explicit java.lang.Object
        // (both are acceptable - no extends is cleaner)
        boolean noExtendsOrExplicitObject =
            !xmlContent.contains("<extends") ||
            xmlContent.contains("java.lang.Object");

        assertTrue(
            noExtendsOrExplicitObject,
            "Expected either no <extends> or explicit java.lang.Object for implicit Object superclass"
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

    /**
     * Helper: Count occurrences of a substring.
     */
    private int countOccurrences(String text, String substring) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        return count;
    }
}
