# JavaAgentDoc Constitution

This document defines the principles, requirements, and acceptance criteria for the JavaAgentDoc project.

## Project Vision

JavaAgentDoc is a bridge between traditional Java documentation and AI agents. It transforms Javadoc comments—originally designed for human readers—into structured, semantic formats that AI systems can reliably parse, understand, and process.

## Core Principles

### 1. AI-First Design
Documentation output MUST be designed to be consumed and understood by Large Language Models and AI agents, not just humans.

- Output must use consistent, predictable structures
- No ambiguous or context-dependent formatting
- All semantic relationships must be explicitly represented
- Tagged blocks must be clearly delimited and labeled

### 2. Semantic Preservation
Information in the source Javadoc must not be lost or degraded during conversion.

- All standard Javadoc tags (@param, @return, @throws, @deprecated, @since, etc.) must be captured
- Inline tags ({@link}, {@code}, {@literal}, etc.) must be preserved as semantic elements
- Documentation relationships (e.g., parameter descriptions linked to parameter names) must be explicit
- Comments must be distinguishable from auto-generated structure

### 3. Maven Artifact Distribution
JavaAgentDoc MUST be distributed and consumed exclusively as a Maven artifact.

- Available on Maven Central Repository (or equivalent)
- Versioned according to SemVer
- All releases must include proper Maven metadata (pom.xml, sources JAR, Javadoc JAR)
- Consumers declare dependency via standard `<dependency>` declarations in their pom.xml

### 4. Comprehensive Javadoc Coverage
All Javadoc syntax and constructs MUST be supported.

#### Block-level Tags (must support)
- `@author` - Author information
- `@version` - Version information
- `@param` - Parameter documentation
- `@return` - Return value documentation
- `@throws` / `@exception` - Exception documentation
- `@deprecated` - Deprecation notices
- `@since` - Version when introduced
- `@see` - Cross-references
- `@serial` / `@serialData` / `@serialField` - Serialization info
- Custom tags (arbitrary block tags)

#### Inline Tags (must support)
- `{@link}` - Links to other members
- `{@linkplain}` - Plain-text links
- `{@code}` - Inline code formatting
- `{@literal}` - Literal text (no processing)
- `{@value}` - Constant values
- `{@inheritDoc}` - Documentation inheritance
- Custom inline tags

#### Modifiers and Visibility
- Public / Protected / Private / Package-private visibility
- Static, final, abstract, synchronized, volatile modifiers
- Annotations

#### Element Types
- Classes (including nested)
- Interfaces
- Enums
- Records
- Annotations
- Fields
- Methods
- Constructors
- Type parameters and bounds
- Generics and wildcards

### 5. Multiple Output Formats

The system MUST support multiple output formats, with XML as the canonical format.

#### XML Format Requirements
- Structured, valid XML (schema-validatable)
- Complete information model (no information loss vs. Javadoc source)
- Suitable for:
  - XSLT/XPath transformation
  - XML schema validation
  - Direct programmatic consumption
  - Conversion to other formats

- Must include:
  - Complete type hierarchy and package structure
  - Full member signatures with all modifiers
  - Complete documentation with all tags
  - Metadata (e.g., visibility, deprecation status, version info)

#### Markdown Format Requirements
- Human-readable
- AI-agent processable
- Suitable for:
  - Display in GitHub / documentation sites
  - Embedding in LLM prompts
  - Direct code comments in downstream projects

- Must include:
  - Proper heading hierarchy
  - Code blocks for signatures
  - Clear section boundaries
  - All semantic information in accessible form

#### Future Formats
- JSON (for web consumption)
- JSONLD (for semantic web)
- HTML (for web viewing)
- Custom formats as needed

### 6. AI Agent Accessibility

Documentation output must be AI-friendly:

- **Explicit Structure**: Every piece of information has a clear location and purpose
- **Unambiguous Delimiters**: Tags, sections, and fields are clearly marked
- **Complete Context**: Information needed to understand a member (class, parameters, return type, exceptions) is colocated
- **Consistent Encoding**: The same semantic information is always represented the same way
- **No Implicit Information**: Nothing relies on implicit knowledge or convention
- **Machine-Processable**: Output can be reliably parsed and structured by automated tools

Example: A method's parameter list MUST include:
- Parameter names
- Parameter types (fully qualified if needed)
- Parameter descriptions (from @param tags)
- Whether the parameter is nullable / optional (from documentation or annotations)
- Default values (if applicable)

### 7. Java Language Coverage

Must support all versions of Java and language features:

- Java 8 (baseline)
- Java 9+ (modules, var, records, sealed classes, text blocks, etc.)
- Modern annotations and annotation processors
- Lambda expressions and functional interfaces
- Var-args, generics, wildcards, type bounds

## Acceptance Criteria

### Minimum Viable Product (MVP)
- [x] Maven POM setup with correct parent/child hierarchy
- [x] Basic SemanticXmlDoclet implementation
- [x] Support for `--semanticOut` and `--semanticFormat` options
- [x] XML output generation for packages, classes, methods, fields
- [x] Markdown output generation for basic API structure
- [ ] Successfully process Google Guava library → generate valid Markdown (integration test needed)
- [x] All standard Javadoc block tags captured in XML (@param, @return, @throws, @author, @version, @since, @deprecated, @see)
- [x] All inline tags (@link, @code, @literal, etc.) represented
- [x] Type information fully captured (generics, bounds, modifiers)

### Phase 2: Semantic Enrichment
- [x] Complete DocTree visitor for fine-grained semantic capture
- [ ] Semantic linking between related elements (Phase 3)
- [ ] Cross-reference resolution (Phase 3)
- [ ] Inheritance hierarchy representation (Phase 3)
- [x] Generic type parameter tracking

### Phase 3: Advanced Features
- [ ] Module documentation (Java 9+)
- [ ] Custom tag support
- [ ] Configuration profiles
- [ ] Incremental processing
- [ ] Parallel processing support
- [ ] Caching and deduplication

## Technical Requirements

### Build & Packaging
- Maven 3.6+ compatible
- Produces executable JAR with all dependencies (shade plugin)
- Semantic versioning (MAJOR.MINOR.PATCH)
- Maven Central Repository compatible

### Code Quality
- Java 17+ baseline
- No external runtime dependencies (XML via StAX, which is JDK-included)
- JDK doclet API (jdk.javadoc) only
- Minimal class count and JAR size

### Documentation
- README with quick-start guide
- API documentation (Javadoc) for public APIs
- Examples for common use cases
- Clear error messages

### Testing
- Unit tests for each output format
- Integration test with real library (Google Guava)
- Validation of output (XML schema, Markdown structure)
- End-to-end test: source → doclet → output → validation

## Non-Goals

- Replacing standard Javadoc HTML generation
- Providing IDE plugins (though projects MAY use JavaAgentDoc)
- Custom comment syntax (uses standard Javadoc only)
- Runtime documentation generation (static, build-time only)
- Documentation of non-public code (respects javadoc visibility rules)

## Success Metrics

1. Can generate valid Markdown documentation for Google Guava library in under 10 seconds
2. Output Markdown includes all classes, methods, fields, and their Javadocs
3. Output can be parsed by common Markdown processors
4. XML output validates against defined schema
5. AI agents can reliably extract and understand semantic information from output
6. Zero information loss vs. source Javadoc comments

## Future Extensibility

The system MUST be designed to allow:
- Custom output format plugins
- Custom DocTree visitors
- Custom XML schema extensions
- Transformation pipelines
- Integration with other tools
