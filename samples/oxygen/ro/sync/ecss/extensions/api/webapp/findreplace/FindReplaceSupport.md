# Interface: `FindReplaceSupport`

**Package:** [`ro.sync.ecss.extensions.api.webapp.findreplace`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.findreplace.FindReplaceSupport`

## Description

## Methods

### `getSearchHighlightsProvider(java.lang.String searchFor, boolean matchCase, boolean wholeWords)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorHighlighter`](../../highlights/AuthorHighlighter.md)

**Parameters:**
- `searchFor` (`java.lang.String`): The string to search for.
- `matchCase` (`boolean`): Flag for matching case on the search string.
- `wholeWords` (`boolean`): Find whole words only.

### `getSearchHighlightsProvider(java.lang.String searchFor, ro.sync.ecss.extensions.api.webapp.findreplace.WebappFindOptions options)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorHighlighter`](../../highlights/AuthorHighlighter.md)

**Parameters:**
- `searchFor` (`java.lang.String`): The string to search for.
- `options` ([`ro.sync.ecss.extensions.api.webapp.findreplace.WebappFindOptions`](./WebappFindOptions.md)): The search options.

### `replaceAll(java.lang.String textToFind, java.lang.String textToReplaceWith)`

**Returns:** `void`

**Parameters:**
- `textToFind` (`java.lang.String`): The text to search for.
- `textToReplaceWith` (`java.lang.String`): The text to replace with.

### `replaceAll(java.lang.String textToFind, java.lang.String textToReplaceWith, ro.sync.ecss.extensions.api.webapp.findreplace.WebappFindOptions options)`

**Returns:** `void`

Also considers the options.

**Parameters:**
- `textToFind` (`java.lang.String`): The text to search for.
- `textToReplaceWith` (`java.lang.String`): The text to replace with.
- `options` ([`ro.sync.ecss.extensions.api.webapp.findreplace.WebappFindOptions`](./WebappFindOptions.md)): The search options.

### `replace(int[] selectionOffsets, java.lang.String textToReplaceWith)`

**Returns:** `void`

**Parameters:**
- `selectionOffsets` (`int[]`): The offsets.
- `textToReplaceWith` (`java.lang.String`): The replacement text.

### `getSearchHighlightsProvider(java.lang.String searchFor)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorHighlighter`](../../highlights/AuthorHighlighter.md)

**Parameters:**
- `searchFor` (`java.lang.String`): The string to search for.

