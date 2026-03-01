# Interface: `AuthorDocumentFilterBypass`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`

## Description

## Methods

### `insertText(`int` offset, `java.lang.String` text)`

**Returns:** `void`

After the operation the caret will be 
 positioned at the end of the inserted text.

### `insertFragment(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md) frag)`

**Returns:** `void`

### `insertNode(`int` offset, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node)`

**Returns:** `boolean`

### `insertMultipleElements([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) parentElement, `java.lang.String[]` elementNames, `int[]` offsets, `java.lang.String` namespace)`

**Returns:** `void`

Note: *The offsets and elements must be in document order.*

### `insertMultipleFragments([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) parentElement, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](node/AuthorDocumentFragment.md) fragments, `int[]` offsets)`

**Returns:** `boolean`

Note: *The offsets and fragments must be in document order.*

### `delete(`int` startOffset, `int` endOffset, `boolean` withBackspace)`

**Returns:** `boolean`

### `deleteNode([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node)`

**Returns:** `boolean`

### `multipleDelete([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) parentElement, `int[]` startOffsets, `int[]` endOffsets)`

**Returns:** `void`

Note: *The offsets must be in document order and the intervals must not 
 intersect with each other.*

### `renameElement([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) element, `java.lang.String` newName, `java.lang.Object` infoProvider)`

**Returns:** `void`

Any compound must be handled externally.

### `setAttribute(`java.lang.String` attributeName, [`ro.sync.ecss.extensions.api.node.AttrValue`](node/AttrValue.md) value, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) element)`

**Returns:** `void`

Attributes set in this manner (as opposed to calling 
 AuthorElement#setAttribute(String, AttrValue) directly) 
 will be subject to undo/redo.

### `removeAttribute(`java.lang.String` attributeName, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) element)`

**Returns:** `void`

Attributes removed in this manner (as opposed to calling 
 AuthorElement#setAttribute(String, AttrValue) directly) will 
 be subject to undo/redo.

### `split([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) toSplit, `int` splitOffset)`

**Returns:** `boolean`

The attributes of the splitted node will also be copied excepting the 
 unique ones. The unique attributes are identified by the UniqueAttributesRecognizer.

### `surroundWithNode([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node, `int` startOffset, `int` endOffset, `boolean` leftToRight)`

**Returns:** `void`

The fragment between the start and end offsets will become the node actual content.

### `surroundInFragment(`java.lang.String` xmlFragment, `int` startOffset, `int` endOffset)`

**Returns:** `void`

If `endOffset < startOffset` the `xmlFragment` 
 will be inserted at `startOffset`.

### `surroundInText(`java.lang.String` header, `java.lang.String` footer, `int` startOffset, `int` endOffset)`

**Returns:** `void`

The method inserts the `header` at `startOffset` and 
 the `footer` at `endOffset`.

### `setDoctype([`ro.sync.ecss.extensions.api.AuthorDocumentType`](./AuthorDocumentType.md) docType)`

**Returns:** `void`

This is a good method to add new entities (regular or unparsed) to the internal document type of the document.
 
 WARNING: if these modifications affect regular entities already inserted and expanded,
 they will not be re-parsed and their old content will remain rendered as such.

### `surroundInFragment([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md) xmlFragment, `int` startOffset, `int` endOffset)`

**Returns:** `void`

If `endOffset < startOffset` the `xmlFragment` 
 will be inserted at `startOffset`.

### `setMultipleDistinctAttributes(`int` parentElementStartOffset, `int[]` elementOffsets, `java.util.List<java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.node.AttrValue>>` attributes)`

**Returns:** `void`

Attributes set in this manner will be subject to undo/redo.

### `setMultipleAttributes(`int` parentElementStartOffset, `int[]` elementOffsets, `java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.node.AttrValue>` attributes)`

**Returns:** `void`

Attributes set in this manner will be subject to undo/redo.

### `addCommentMarker(`int` startOffset, `int` endOffset, `java.lang.String` comment, `java.lang.String` parentID)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md)

### `addPersistentMarker(`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight.PersistentHighlightType` type, `int` startOffset, `int` endOffset, `java.util.Map<java.lang.String,java.lang.String>` properties)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md)

### `removeMarker([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md) marker)`

**Returns:** `boolean`

