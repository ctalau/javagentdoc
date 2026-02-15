# JavaAgentDoc TODO

## Known Shortcomings

These are the gaps between the current MVP implementation and the full specification defined in `constitution.md`.

### WHAT DOESN'T WORK (SHORTCOMINGS):

✗ Block tags (@param, @return, @throws, @author, @version, @since, @deprecated)
  are included as RAW TEXT within documentation blocks,
  NOT as separate semantic elements

✗ No parsing of tag structure - tags appear literally as "@param name description"

✗ No semantic separation between description and tags

✗ Inline tags {@link}, {@code}, {@literal} appear as plain text

✗ No cross-reference resolution

✗ No inheritance hierarchy

✗ No generic type parameters preserved properly

✗ No @throws exceptions extracted

✗ NO API is truly "AI-friendly" for semantic understanding -
  while structure is present, semantic meaning is lost

## Implementation Roadmap

### Phase 2: Semantic Enrichment (CRITICAL)

- [ ] Implement DocTreeVisitor for proper DocTree traversal
- [ ] Add block tag parsers (@param, @return, @throws, @deprecated, @since, @author, @see)
- [ ] Add inline tag handlers ({@link}, {@code}, {@literal}, {@value})
- [ ] Parse @throws exceptions into structured format
- [ ] Extract generic type parameters
- [ ] Create semantic element mapping

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
