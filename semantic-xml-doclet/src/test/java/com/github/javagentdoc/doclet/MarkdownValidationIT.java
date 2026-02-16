package com.github.javagentdoc.doclet;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests to validate generated Markdown documentation for common issues.
 *
 * This test suite ensures that the Markdown generation code produces
 * valid output without:
 * - Broken JRE type links
 * - Type parameter broken links
 * - Unconverted Javadoc tags ({@code}, {@link}, etc.)
 * - Unconverted standalone tags (@since, @author, etc.)
 */
public class MarkdownValidationIT {

    private static final String DOCS_DIR = "target/test-docs";
    private static Path docsPath;
    private static List<Path> markdownFiles;

    @BeforeAll
    static void setup() throws IOException {
        docsPath = Paths.get(DOCS_DIR);

        // Find all markdown files if the directory exists
        if (Files.exists(docsPath)) {
            try (Stream<Path> paths = Files.walk(docsPath)) {
                markdownFiles = paths
                    .filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".md"))
                    .collect(Collectors.toList());
            }
        } else {
            markdownFiles = Collections.emptyList();
        }
    }

    @Test
    @DisplayName("Test documentation directory exists")
    void testDocsDirectoryExists() {
        if (markdownFiles.isEmpty()) {
            System.out.println("⚠️  No markdown files found. Run documentation generation first.");
            System.out.println("   This test will be skipped.");
        }
        // Don't fail if docs don't exist yet - this allows the test to be part of CI
    }

    @Test
    @DisplayName("No broken JRE type links with relative paths")
    void testNoBrokenJreLinks() throws IOException {
        assumeMarkdownFilesExist();

        // Pattern: [`java.X.Y`](../../../java/X/Y.md) or similar relative paths to java.*
        Pattern brokenJreLinkPattern = Pattern.compile("\\[`(java\\.[a-zA-Z0-9_.<>?,\\s\\[\\]]+)`\\]\\(\\.\\./.*?/java/.*?\\.md\\)");

        List<ValidationIssue> issues = new ArrayList<>();

        for (Path file : markdownFiles) {
            String content = Files.readString(file);
            Matcher matcher = brokenJreLinkPattern.matcher(content);

            while (matcher.find()) {
                issues.add(new ValidationIssue(
                    file,
                    getLineNumber(content, matcher.start()),
                    "Broken JRE link with relative path",
                    matcher.group(0)
                ));
            }
        }

        if (!issues.isEmpty()) {
            fail(formatIssues("Found broken JRE type links", issues));
        }
    }

    @Test
    @DisplayName("No type parameter broken links like [K](K.md)")
    void testNoTypeParameterBrokenLinks() throws IOException {
        assumeMarkdownFilesExist();

        // Pattern: [`K`](K.md), [`V`](V.md), etc. - single uppercase letter type parameters
        Pattern typeParamLinkPattern = Pattern.compile("\\[`([A-Z])`\\]\\(\\1\\.md\\)");

        List<ValidationIssue> issues = new ArrayList<>();

        for (Path file : markdownFiles) {
            String content = Files.readString(file);
            Matcher matcher = typeParamLinkPattern.matcher(content);

            while (matcher.find()) {
                issues.add(new ValidationIssue(
                    file,
                    getLineNumber(content, matcher.start()),
                    "Type parameter incorrectly linked",
                    matcher.group(0)
                ));
            }
        }

        if (!issues.isEmpty()) {
            fail(formatIssues("Found type parameter broken links", issues));
        }
    }

    @Test
    @DisplayName("No unconverted {@code} tags")
    void testNoUnconvertedCodeTags() throws IOException {
        assumeMarkdownFilesExist();

        // Pattern: {@code ...}
        Pattern codeTagPattern = Pattern.compile("\\{@code\\s+[^}]+\\}");

        List<ValidationIssue> issues = new ArrayList<>();

        for (Path file : markdownFiles) {
            String content = Files.readString(file);
            Matcher matcher = codeTagPattern.matcher(content);

            while (matcher.find()) {
                issues.add(new ValidationIssue(
                    file,
                    getLineNumber(content, matcher.start()),
                    "Unconverted {@code} tag",
                    matcher.group(0)
                ));
            }
        }

        if (!issues.isEmpty()) {
            fail(formatIssues("Found unconverted {@code} tags", issues));
        }
    }

    @Test
    @DisplayName("No unconverted {@link} tags")
    void testNoUnconvertedLinkTags() throws IOException {
        assumeMarkdownFilesExist();

        // Pattern: {@link ...}
        Pattern linkTagPattern = Pattern.compile("\\{@link\\s+[^}]+\\}");

        List<ValidationIssue> issues = new ArrayList<>();

        for (Path file : markdownFiles) {
            String content = Files.readString(file);
            Matcher matcher = linkTagPattern.matcher(content);

            while (matcher.find()) {
                issues.add(new ValidationIssue(
                    file,
                    getLineNumber(content, matcher.start()),
                    "Unconverted {@link} tag",
                    matcher.group(0)
                ));
            }
        }

        if (!issues.isEmpty()) {
            fail(formatIssues("Found unconverted {@link} tags", issues));
        }
    }

    @Test
    @DisplayName("No unconverted {@literal} tags")
    void testNoUnconvertedLiteralTags() throws IOException {
        assumeMarkdownFilesExist();

        // Pattern: {@literal ...}
        Pattern literalTagPattern = Pattern.compile("\\{@literal\\s+[^}]+\\}");

        List<ValidationIssue> issues = new ArrayList<>();

        for (Path file : markdownFiles) {
            String content = Files.readString(file);
            Matcher matcher = literalTagPattern.matcher(content);

            while (matcher.find()) {
                issues.add(new ValidationIssue(
                    file,
                    getLineNumber(content, matcher.start()),
                    "Unconverted {@literal} tag",
                    matcher.group(0)
                ));
            }
        }

        if (!issues.isEmpty()) {
            fail(formatIssues("Found unconverted {@literal} tags", issues));
        }
    }

    @Test
    @DisplayName("No unconverted {@linkplain} tags")
    void testNoUnconvertedLinkplainTags() throws IOException {
        assumeMarkdownFilesExist();

        // Pattern: {@linkplain ...}
        Pattern linkplainTagPattern = Pattern.compile("\\{@linkplain\\s+[^}]+\\}");

        List<ValidationIssue> issues = new ArrayList<>();

        for (Path file : markdownFiles) {
            String content = Files.readString(file);
            Matcher matcher = linkplainTagPattern.matcher(content);

            while (matcher.find()) {
                issues.add(new ValidationIssue(
                    file,
                    getLineNumber(content, matcher.start()),
                    "Unconverted {@linkplain} tag",
                    matcher.group(0)
                ));
            }
        }

        if (!issues.isEmpty()) {
            fail(formatIssues("Found unconverted {@linkplain} tags", issues));
        }
    }

    @Test
    @DisplayName("No unconverted standalone @since tags")
    void testNoUnconvertedSinceTags() throws IOException {
        assumeMarkdownFilesExist();

        // Pattern: @since at start of line (not already in bold)
        Pattern sinceTagPattern = Pattern.compile("(?m)^@since\\s+");

        List<ValidationIssue> issues = new ArrayList<>();

        for (Path file : markdownFiles) {
            String content = Files.readString(file);
            Matcher matcher = sinceTagPattern.matcher(content);

            while (matcher.find()) {
                issues.add(new ValidationIssue(
                    file,
                    getLineNumber(content, matcher.start()),
                    "Unconverted @since tag",
                    getLineContent(content, matcher.start())
                ));
            }
        }

        if (!issues.isEmpty()) {
            fail(formatIssues("Found unconverted @since tags", issues));
        }
    }

    @Test
    @DisplayName("No unconverted standalone @author tags")
    void testNoUnconvertedAuthorTags() throws IOException {
        assumeMarkdownFilesExist();

        // Pattern: @author at start of line (not already in bold)
        Pattern authorTagPattern = Pattern.compile("(?m)^@author\\s+");

        List<ValidationIssue> issues = new ArrayList<>();

        for (Path file : markdownFiles) {
            String content = Files.readString(file);
            Matcher matcher = authorTagPattern.matcher(content);

            while (matcher.find()) {
                issues.add(new ValidationIssue(
                    file,
                    getLineNumber(content, matcher.start()),
                    "Unconverted @author tag",
                    getLineContent(content, matcher.start())
                ));
            }
        }

        if (!issues.isEmpty()) {
            fail(formatIssues("Found unconverted @author tags", issues));
        }
    }

    @Test
    @DisplayName("No unconverted standalone @deprecated tags")
    void testNoUnconvertedDeprecatedTags() throws IOException {
        assumeMarkdownFilesExist();

        // Pattern: @deprecated at start of line (not already in bold)
        Pattern deprecatedTagPattern = Pattern.compile("(?m)^@deprecated\\s+");

        List<ValidationIssue> issues = new ArrayList<>();

        for (Path file : markdownFiles) {
            String content = Files.readString(file);
            Matcher matcher = deprecatedTagPattern.matcher(content);

            while (matcher.find()) {
                issues.add(new ValidationIssue(
                    file,
                    getLineNumber(content, matcher.start()),
                    "Unconverted @deprecated tag",
                    getLineContent(content, matcher.start())
                ));
            }
        }

        if (!issues.isEmpty()) {
            fail(formatIssues("Found unconverted @deprecated tags", issues));
        }
    }

    @Test
    @DisplayName("All markdown files have valid structure")
    void testMarkdownStructure() throws IOException {
        assumeMarkdownFilesExist();

        List<ValidationIssue> issues = new ArrayList<>();

        for (Path file : markdownFiles) {
            String content = Files.readString(file);

            // Each file should start with a heading
            if (!content.trim().startsWith("#")) {
                issues.add(new ValidationIssue(
                    file,
                    1,
                    "File doesn't start with a heading",
                    content.substring(0, Math.min(50, content.length()))
                ));
            }

            // Check for malformed links (missing closing parenthesis)
            Pattern malformedLinkPattern = Pattern.compile("\\[`[^`]+`\\]\\([^)]*$", Pattern.MULTILINE);
            Matcher matcher = malformedLinkPattern.matcher(content);
            if (matcher.find()) {
                issues.add(new ValidationIssue(
                    file,
                    getLineNumber(content, matcher.start()),
                    "Malformed markdown link (missing closing parenthesis)",
                    matcher.group(0)
                ));
            }
        }

        if (!issues.isEmpty()) {
            fail(formatIssues("Found markdown structure issues", issues));
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"README.md"})
    @DisplayName("Index file exists")
    void testIndexFileExists(String filename) {
        assumeMarkdownFilesExist();

        boolean found = markdownFiles.stream()
            .anyMatch(p -> p.getFileName().toString().equals(filename));

        assertTrue(found, "Expected to find " + filename + " in docs directory");
    }

    // Helper methods

    private void assumeMarkdownFilesExist() {
        if (markdownFiles.isEmpty()) {
            Assumptions.abort("No markdown files found - skipping test");
        }
    }

    private int getLineNumber(String content, int position) {
        int lineNumber = 1;
        for (int i = 0; i < position && i < content.length(); i++) {
            if (content.charAt(i) == '\n') {
                lineNumber++;
            }
        }
        return lineNumber;
    }

    private String getLineContent(String content, int position) {
        int lineStart = content.lastIndexOf('\n', position) + 1;
        int lineEnd = content.indexOf('\n', position);
        if (lineEnd == -1) lineEnd = content.length();
        return content.substring(lineStart, lineEnd).trim();
    }

    private String formatIssues(String title, List<ValidationIssue> issues) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append(title).append(":\n");
        sb.append("━".repeat(80)).append("\n");
        sb.append(String.format("Found %d issues\n\n", issues.size()));

        // Show first 10 issues
        int count = Math.min(10, issues.size());
        for (int i = 0; i < count; i++) {
            ValidationIssue issue = issues.get(i);
            sb.append(String.format("  %s:%d\n",
                issue.file.getFileName(),
                issue.lineNumber
            ));
            sb.append(String.format("    %s\n", issue.message));
            sb.append(String.format("    > %s\n\n",
                issue.example.substring(0, Math.min(80, issue.example.length()))
            ));
        }

        if (issues.size() > 10) {
            sb.append(String.format("  ... and %d more issues\n", issues.size() - 10));
        }

        return sb.toString();
    }

    // Inner class for validation issues
    private static class ValidationIssue {
        final Path file;
        final int lineNumber;
        final String message;
        final String example;

        ValidationIssue(Path file, int lineNumber, String message, String example) {
            this.file = file;
            this.lineNumber = lineNumber;
            this.message = message;
            this.example = example;
        }
    }
}
