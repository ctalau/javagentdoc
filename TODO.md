# JavaAgentDoc TODO

## Known Shortcomings

These are the gaps between the current MVP implementation and the full specification defined in `constitution.md`.

### WHAT DOESN'T WORK (SHORTCOMINGS):

✓ ~~Block tags (@param, @return, @throws, @author, @version, @since, @deprecated)~~
  ~~are included as RAW TEXT within documentation blocks~~
  **FIXED**: Now parsed into semantic XML elements

✓ ~~No parsing of tag structure - tags appear literally as "@param name description"~~
  **FIXED**: Tags are now parsed with separate name/description fields

✓ ~~No semantic separation between description and tags~~
  **FIXED**: Description and tags are now separate semantic elements

✓ ~~Inline tags {@link}, {@code}, {@literal} appear as plain text~~
  **FIXED**: Basic inline tag handling implemented

✓ ~~No @throws exceptions extracted~~
  **FIXED**: @throws parsed with exception type and description

✗ No cross-reference resolution (coming in Phase 3)

✗ No inheritance hierarchy (coming in Phase 3)

✗ No generic type parameters preserved properly (Phase 2 - in progress)

✓ ~~NO API is truly "AI-friendly" for semantic understanding~~
  **IMPROVED**: Semantic structure now enables AI understanding

## Implementation Roadmap

### Phase 2: Semantic Enrichment (CRITICAL)

- [x] Implement DocTreeVisitor for proper DocTree traversal
- [x] Add block tag parsers (@param, @return, @throws, @deprecated, @since, @author, @see)
- [x] Add inline tag handlers ({@link}, {@code}, {@literal}, {@value})
- [x] Parse @throws exceptions into structured format
- [x] Create semantic element mapping
- [ ] Extract generic type parameters
- [ ] Enhanced inline tag rendering with semantic context

### Phase 3: Advanced Features

- [ ] Cross-reference resolution between types/methods
- [ ] Inheritance hierarchy tracking
- [ ] Method override tracking
- [ ] Annotation processing
- [ ] Module documentation support

### Phase 4: Additional Formats

- [ ] JSON output format
- [ ] JSONLD (semantic web) format
- [ ] HTML5 output format
- [ ] Custom format support via plugins

### Phase 5: Performance & Scale

- [ ] Parallel processing for large projects
- [ ] Incremental processing support
- [ ] Caching mechanism
- [ ] Memory optimization
