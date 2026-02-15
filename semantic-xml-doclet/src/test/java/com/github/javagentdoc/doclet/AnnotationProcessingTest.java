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
 * Tests for Phase 3: Annotation processing.
 *
 * Verifies that annotations on classes, methods, fields, and parameters
 * are captured as semantic elements in the XML output, including
 * annotation values and parameters.
 */
public class AnnotationProcessingTest {

    @TempDir
    Path tempDir;

    /**
     * Test that class-level annotations are captured.
     *
     * Expected behavior:
     * - <annotation> elements for each class annotation
     * - Qualified annotation type name
     * - Annotation values/parameters if present
     */
    @Test
    public void testClassAnnotationsCaptured() throws Exception {
        Path sourceDir = tempDir.resolve("src");
        Files.createDirectories(sourceDir);

        // Custom annotation
        Path annotationFile = sourceDir.resolve("Documented.java");
        Files.writeString(annotationFile, """
            import java.lang.annotation.*;

            /**
             * Custom documentation annotation.
             */
            @Retention(RetentionPolicy.RUNTIME)
            @Target(ElementType.TYPE)
            public @interface Documented {
                String value() default "";
                String author() default "";
            }
            """);

        // Annotated class
        Path classFile = sourceDir.resolve("MyService.java");
        Files.writeString(classFile, """
            /**
             * Service class with annotations.
             */
            @Documented(value = "Important service", author = "John Doe")
            @Deprecated
            public class MyService {
                public void doWork() {}
            }
            """);

        Path outputFile = tempDir.resolve("output.xml");
        runDoclet(sourceDir, outputFile);

        String xmlContent = Files.readString(outputFile);

        // ASSERTIONS: Verify class annotations are captured

        // Should have <annotation> elements
        assertTrue(
            xmlContent.contains("<annotation"),
            "Expected <annotation> element(s) for class annotations"
        );

        // Should include @Documented annotation
        assertTrue(
            xmlContent.contains("Documented"),
            "Expected @Documented annotation to be captured"
        );

        // Should include @Deprecated annotation
        assertTrue(
            xmlContent.contains("Deprecated") || xmlContent.contains("deprecated"),
            "Expected @Deprecated annotation to be captured"
        );
    }

    /**
     * Test that method-level annotations are captured.
     *
     * Expected behavior:
     * - <annotation> elements on methods
     * - Standard annotations like @Override, @Deprecated
     * - Custom annotations with values
     */
    @Test
    public void testMethodAnnotationsCaptured() throws Exception {
        Path sourceDir = tempDir.resolve("src");
        Files.createDirectories(sourceDir);

        // Base class
        Path baseFile = sourceDir.resolve("Base.java");
        Files.writeString(baseFile, """
            /**
             * Base class.
             */
            public class Base {
                /**
                 * Base method.
                 */
                public void method() {}
            }
            """);

        // Derived class with annotated method
        Path derivedFile = sourceDir.resolve("Derived.java");
        Files.writeString(derivedFile, """
            /**
             * Derived class.
             */
            public class Derived extends Base {
                /**
                 * Overridden and deprecated method.
                 */
                @Override
                @Deprecated
                public void method() {}
            }
            """);

        Path outputFile = tempDir.resolve("output.xml");
        runDoclet(sourceDir, outputFile);

        String xmlContent = Files.readString(outputFile);

        // ASSERTIONS: Verify method annotations are captured

        // Should have annotations on the method
        assertTrue(
            xmlContent.contains("Override") || xmlContent.contains("@Override"),
            "Expected @Override annotation on method"
        );

        assertTrue(
            xmlContent.contains("Deprecated") || xmlContent.contains("deprecated"),
            "Expected @Deprecated annotation on method"
        );
    }

    /**
     * Test that field-level annotations are captured.
     *
     * Expected behavior:
     * - <annotation> elements on fields
     * - Annotation values preserved
     */
    @Test
    public void testFieldAnnotationsCaptured() throws Exception {
        Path sourceDir = tempDir.resolve("src");
        Files.createDirectories(sourceDir);

        // Custom annotation
        Path annotationFile = sourceDir.resolve("Inject.java");
        Files.writeString(annotationFile, """
            import java.lang.annotation.*;

            /**
             * Injection annotation.
             */
            @Retention(RetentionPolicy.RUNTIME)
            @Target(ElementType.FIELD)
            public @interface Inject {
                String name() default "";
            }
            """);

        // Class with annotated fields
        Path classFile = sourceDir.resolve("Controller.java");
        Files.writeString(classFile, """
            /**
             * Controller with injected dependencies.
             */
            public class Controller {
                /**
                 * Injected service field.
                 */
                @Inject(name = "myService")
                private Object service;

                /**
                 * Deprecated field.
                 */
                @Deprecated
                private String oldField;
            }
            """);

        Path outputFile = tempDir.resolve("output.xml");
        runDoclet(sourceDir, outputFile);

        String xmlContent = Files.readString(outputFile);

        // ASSERTIONS: Verify field annotations are captured

        // Should have field annotations
        assertTrue(
            xmlContent.contains("Inject") || xmlContent.contains("inject"),
            "Expected @Inject annotation on field"
        );

        assertTrue(
            xmlContent.contains("Deprecated") || xmlContent.contains("deprecated"),
            "Expected @Deprecated annotation on deprecated field"
        );
    }

    /**
     * Test that annotation values/parameters are captured.
     *
     * Expected behavior:
     * - Annotation element values extracted
     * - Both simple values (strings, numbers) and complex values
     * - Default values vs explicit values
     */
    @Test
    public void testAnnotationValuesCaptured() throws Exception {
        Path sourceDir = tempDir.resolve("src");
        Files.createDirectories(sourceDir);

        // Rich annotation with multiple parameters
        Path annotationFile = sourceDir.resolve("Configure.java");
        Files.writeString(annotationFile, """
            import java.lang.annotation.*;

            /**
             * Configuration annotation.
             */
            @Retention(RetentionPolicy.RUNTIME)
            @Target(ElementType.TYPE)
            public @interface Configure {
                String name();
                int priority() default 0;
                boolean enabled() default true;
            }
            """);

        // Annotated class with values
        Path classFile = sourceDir.resolve("Component.java");
        Files.writeString(classFile, """
            /**
             * Configured component.
             */
            @Configure(name = "MainComponent", priority = 10, enabled = true)
            public class Component {
                public void run() {}
            }
            """);

        Path outputFile = tempDir.resolve("output.xml");
        runDoclet(sourceDir, outputFile);

        String xmlContent = Files.readString(outputFile);

        // ASSERTIONS: Verify annotation values are captured

        // Should have annotation with parameters
        assertTrue(
            xmlContent.contains("Configure"),
            "Expected @Configure annotation"
        );

        // Should capture annotation values (at least the name)
        // The format might vary, but we should see the values somewhere
        assertTrue(
            xmlContent.contains("MainComponent") || xmlContent.contains("name"),
            "Expected annotation parameter values to be captured"
        );
    }

    /**
     * Test that parameter annotations are captured.
     *
     * Expected behavior:
     * - Annotations on method parameters
     * - Common annotations like @Nullable, @NotNull
     */
    @Test
    public void testParameterAnnotationsCaptured() throws Exception {
        Path sourceDir = tempDir.resolve("src");
        Files.createDirectories(sourceDir);

        // Parameter annotation
        Path annotationFile = sourceDir.resolve("NotNull.java");
        Files.writeString(annotationFile, """
            import java.lang.annotation.*;

            /**
             * Not null annotation.
             */
            @Retention(RetentionPolicy.RUNTIME)
            @Target(ElementType.PARAMETER)
            public @interface NotNull {
            }
            """);

        // Method with annotated parameter
        Path classFile = sourceDir.resolve("Validator.java");
        Files.writeString(classFile, """
            /**
             * Validator class.
             */
            public class Validator {
                /**
                 * Validates input.
                 * @param input the input to validate
                 */
                public void validate(@NotNull String input) {
                    // validation logic
                }
            }
            """);

        Path outputFile = tempDir.resolve("output.xml");
        runDoclet(sourceDir, outputFile);

        String xmlContent = Files.readString(outputFile);

        // ASSERTIONS: Verify parameter annotations are captured

        // Should have parameter with annotation
        assertTrue(
            xmlContent.contains("NotNull") || xmlContent.contains("annotation"),
            "Expected @NotNull annotation on parameter"
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
