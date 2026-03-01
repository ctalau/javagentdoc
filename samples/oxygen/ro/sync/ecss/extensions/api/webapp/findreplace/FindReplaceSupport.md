# Interface: `FindReplaceSupport`

**Package:** [`ro.sync.ecss.extensions.api.webapp.findreplace`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.findreplace.FindReplaceSupport`

## Description

## Methods

### `getSearchHighlightsProvider(`java.lang.String` searchFor, `boolean` matchCase, `boolean` wholeWords)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorHighlighter`](../../highlights/AuthorHighlighter.md)

### `getSearchHighlightsProvider(`java.lang.String` searchFor, [`ro.sync.ecss.extensions.api.webapp.findreplace.WebappFindOptions`](./WebappFindOptions.md) options)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorHighlighter`](../../highlights/AuthorHighlighter.md)

### `replaceAll(`java.lang.String` textToFind, `java.lang.String` textToReplaceWith)`

**Returns:** `void`

### `replaceAll(`java.lang.String` textToFind, `java.lang.String` textToReplaceWith, [`ro.sync.ecss.extensions.api.webapp.findreplace.WebappFindOptions`](./WebappFindOptions.md) options)`

**Returns:** `void`

Also considers the options.

### `replace(`int[]` selectionOffsets, `java.lang.String` textToReplaceWith)`

**Returns:** `void`

### `getSearchHighlightsProvider(`java.lang.String` searchFor)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorHighlighter`](../../highlights/AuthorHighlighter.md)

