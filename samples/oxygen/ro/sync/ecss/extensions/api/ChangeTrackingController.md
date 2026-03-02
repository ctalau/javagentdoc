# Interface: `ChangeTrackingController`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.ChangeTrackingController`

## Description

Can toggle change tracking on and off and check its state.

## Methods

### `isTrackingChanges()`

**Returns:** `boolean`

### `toggleTrackChanges()`

Each opened document has a separate track changes state.
 The initial state is provided by the default values set in the user preferences:
 
 https://www.oxygenxml.com/doc/ug-oxygen/index.html?q=/doc/ug-oxygen/topics/preferences-track-changes.html
 
 So after a document is opened, this method can be used to change its track changes state.

**Returns:** `void`

### `getChangeHighlights()`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight[]`](highlights/AuthorPersistentHighlight.md)

### `getAttributeChangeHighlights()`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight[]`](highlights/AuthorPersistentHighlight.md)

### `getChangeHighlights(int startOffset, int endOffset)`

**Parameters:**
- `startOffset` (`int`): The start offset(inclusive).
- `endOffset` (`int`): The end offset (inclusive).

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight[]`](highlights/AuthorPersistentHighlight.md)

### `accept(int startOffset, int endOffset)`

**Parameters:**
- `startOffset` (`int`): The interval start offset, inclusive.
- `endOffset` (`int`): The interval end offset, inclusive.

**Returns:** `void`

### `acceptSelection(int startOffset, int endOffset)`

The difference from the "ro.sync.ecss.extensions.api.ChangeTrackingController.accept(int, int)" method is 
 that the end offset is exclusive and you can accept the selection even if you select only one character.

**Parameters:**
- `startOffset` (`int`): The interval start offset, inclusive.
- `endOffset` (`int`): The interval end offset, exclusive.

**Returns:** `void`

### `accept(AuthorPersistentHighlight highlight)`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md)): The change tracking highlight to be accepted.

**Returns:** `void`

### `reject(int startOffset, int endOffset)`

**Parameters:**
- `startOffset` (`int`): The interval start offset, inclusive.
- `endOffset` (`int`): The interval end offset, inclusive.

**Returns:** `void`

### `rejectSelection(int startOffset, int endOffset)`

The difference from the "ro.sync.ecss.extensions.api.ChangeTrackingController.reject(int, int)" method is 
 that the end offset is exclusive and you can accept the selection even if you select only one character.

**Parameters:**
- `startOffset` (`int`): The interval start offset, inclusive.
- `endOffset` (`int`): The interval end offset, exclusive.

**Returns:** `void`

### `reject(AuthorPersistentHighlight highlight)`

**Parameters:**
- `highlight` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md)): The change tracking highlight to be accepted.

**Returns:** `void`

