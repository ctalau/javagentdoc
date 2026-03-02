# Interface: `FindReplaceSupport`

**Package:** [`ro.sync.ecss.extensions.api.webapp.findreplace`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.findreplace.FindReplaceSupport`

## Description

## Methods

### `getSearchHighlightsProvider(java.lang.String searchFor, boolean matchCase, boolean wholeWords)`

**Parameters:**
- `searchFor` (`java.lang.String`): The string to search for.
- `matchCase` (`boolean`): Flag for matching case on the search string.
- `wholeWords` (`boolean`): Find whole words only.

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorHighlighter`](../../highlights/AuthorHighlighter.md)

### `getSearchHighlightsProvider(java.lang.String searchFor, ro.sync.ecss.extensions.api.webapp.findreplace.WebappFindOptions options)`

**Parameters:**
- `searchFor` (`java.lang.String`): The string to search for.
- `options` ([`ro.sync.ecss.extensions.api.webapp.findreplace.WebappFindOptions`](./WebappFindOptions.md)): The search options.

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorHighlighter`](../../highlights/AuthorHighlighter.md)

### `replaceAll(java.lang.String textToFind, java.lang.String textToReplaceWith)`

**Parameters:**
- `textToFind` (`java.lang.String`): The text to search for.
- `textToReplaceWith` (`java.lang.String`): The text to replace with.

**Returns:** `void`

### `replaceAll(java.lang.String textToFind, java.lang.String textToReplaceWith, ro.sync.ecss.extensions.api.webapp.findreplace.WebappFindOptions options)`

Also considers the options.

**Parameters:**
- `textToFind` (`java.lang.String`): The text to search for.
- `textToReplaceWith` (`java.lang.String`): The text to replace with.
- `options` ([`ro.sync.ecss.extensions.api.webapp.findreplace.WebappFindOptions`](./WebappFindOptions.md)): The search options.

**Returns:** `void`

### `replace(int[] selectionOffsets, java.lang.String textToReplaceWith)`

**Parameters:**
- `selectionOffsets` (`int[]`): The offsets.
- `textToReplaceWith` (`java.lang.String`): The replacement text.

**Returns:** `void`

### `getSearchHighlightsProvider(java.lang.String searchFor)`

**Parameters:**
- `searchFor` (`java.lang.String`): The string to search for.

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorHighlighter`](../../highlights/AuthorHighlighter.md)

