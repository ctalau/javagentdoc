# Interface: `AuthorDocumentFilterBypass`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorDocumentFilterBypass`

## Description

## Methods

### `insertText(int offset, java.lang.String text)`

**Returns:** `void`

After the operation the caret will be 
 positioned at the end of the inserted text.

**Parameters:**
- `offset` (`int`): The insert position, 0 based.
- `text` (`java.lang.String`): The text to be inserted.

### `insertFragment(int offset, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment frag)`

**Returns:** `void`

**Parameters:**
- `offset` (`int`): The offset where the fragment will be inserted, 0 based.
- `frag` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)): The AuthorDocumentFragment to be inserted.

### `insertNode(int offset, ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `offset` (`int`): The offset where the node will be inserted. 0 based.
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The AuthorNode to insert.

### `insertMultipleElements(ro.sync.ecss.extensions.api.node.AuthorElement parentElement, java.lang.String[] elementNames, int[] offsets, java.lang.String namespace)`

**Returns:** `void`

Note: *The offsets and elements must be in document order.*

**Parameters:**
- `parentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The parent element that contains all the new inserted 
 elements.
- `elementNames` (`java.lang.String[]`): The element names to be inserted.
- `offsets` (`int[]`): The absolute offsets where the elements will be inserted. 0 based.
- `namespace` (`java.lang.String`): The namespace of the new inserted elements.

### `insertMultipleFragments(ro.sync.ecss.extensions.api.node.AuthorElement parentElement, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, int[] offsets)`

**Returns:** `boolean`

Note: *The offsets and fragments must be in document order.*

**Parameters:**
- `parentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The parent element that contains all the new inserted 
 elements.
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](node/AuthorDocumentFragment.md)): The fragments to be inserted.
- `offsets` (`int[]`): The absolute offsets where the elements will be inserted. 0 based.

### `delete(int startOffset, int endOffset, boolean withBackspace)`

**Returns:** `boolean`

**Parameters:**
- `startOffset` (`int`): Start offset, 0 based and inclusive.
- `endOffset` (`int`): End offset, 0 based and inclusive.
- `withBackspace` (`boolean`): `true` if `BACKSPACE` key was used when deleting the fragment.

### `deleteNode(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The AuthorNode to delete.

### `multipleDelete(ro.sync.ecss.extensions.api.node.AuthorElement parentElement, int[] startOffsets, int[] endOffsets)`

**Returns:** `void`

Note: *The offsets must be in document order and the intervals must not 
 intersect with each other.*

**Parameters:**
- `parentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The element that contains all the deleted intervals.
- `startOffsets` (`int[]`): The start offset for each interval.
 Must be in document order. 0 based and inclusive.
- `endOffsets` (`int[]`): The end offset for each interval.
 Must be in document order. 0 based and inclusive.

### `renameElement(ro.sync.ecss.extensions.api.node.AuthorElement element, java.lang.String newName, java.lang.Object infoProvider)`

**Returns:** `void`

Any compound must be handled externally.

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The AuthorElement that is renamed.
- `newName` (`java.lang.String`): The new name for the element.
- `infoProvider` (`java.lang.Object`): Information provider used for internal processing.

### `setAttribute(java.lang.String attributeName, ro.sync.ecss.extensions.api.node.AttrValue value, ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Returns:** `void`

Attributes set in this manner (as opposed to calling 
 AuthorElement#setAttribute(String, AttrValue) directly) 
 will be subject to undo/redo.

**Parameters:**
- `attributeName` (`java.lang.String`): Name of the attribute being changed.
- `value` ([`ro.sync.ecss.extensions.api.node.AttrValue`](node/AttrValue.md)): New AttrValue for the attribute. If `null`, the attribute is 
 removed from the element.
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The AuthorElement whose attribute is changing.

### `removeAttribute(java.lang.String attributeName, ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Returns:** `void`

Attributes removed in this manner (as opposed to calling 
 AuthorElement#setAttribute(String, AttrValue) directly) will 
 be subject to undo/redo.

**Parameters:**
- `attributeName` (`java.lang.String`): Name of the attribute to remove.
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The AuthorElement whose attribute will be removed.

### `split(ro.sync.ecss.extensions.api.node.AuthorNode toSplit, int splitOffset)`

**Returns:** `boolean`

The attributes of the splitted node will also be copied excepting the 
 unique ones. The unique attributes are identified by the UniqueAttributesRecognizer.

**Parameters:**
- `toSplit` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The AuthorNode to split.
- `splitOffset` (`int`): The split offset. The offset must be greater or equal 
 to 1 and less than the current document length.

### `surroundWithNode(ro.sync.ecss.extensions.api.node.AuthorNode node, int startOffset, int endOffset, boolean leftToRight)`

**Returns:** `void`

The fragment between the start and end offsets will become the node actual content.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The AuthorNode that will surround the fragment.
- `startOffset` (`int`): Start offset of the surrounded fragment. 0 based and inclusive.
- `endOffset` (`int`): End offset of the surrounded fragment. 0 based and inclusive.
- `leftToRight` (`boolean`): `true` if after the operation the selection 
 in the author page is done from the left to the right.

### `surroundInFragment(java.lang.String xmlFragment, int startOffset, int endOffset)`

**Returns:** `void`

If `endOffset < startOffset` the `xmlFragment` 
 will be inserted at `startOffset`.

**Parameters:**
- `xmlFragment` (`java.lang.String`): The XML fragment which will surround the given interval.
 The first leaf node of the XML fragment will be the parent of the surrounded content.
- `startOffset` (`int`): The start offset of the content to be surrounded, 0 based and inclusive.
- `endOffset` (`int`): The end offset of the content to be surrounded, 0 based and inclusive.

### `surroundInText(java.lang.String header, java.lang.String footer, int startOffset, int endOffset)`

**Returns:** `void`

The method inserts the `header` at `startOffset` and 
 the `footer` at `endOffset`.

**Parameters:**
- `header` (`java.lang.String`): The header to be inserted before the surrounded text.
- `footer` (`java.lang.String`): The footer to be inserted after the surrounded text.
- `startOffset` (`int`): The start offset of the text to be surrounded, 0 based and inclusive.
- `endOffset` (`int`): The end offset of the text to be surrounded, 0 based and inclusive.

### `setDoctype(ro.sync.ecss.extensions.api.AuthorDocumentType docType)`

**Returns:** `void`

This is a good method to add new entities (regular or unparsed) to the internal document type of the document.
 
 WARNING: if these modifications affect regular entities already inserted and expanded,
 they will not be re-parsed and their old content will remain rendered as such.

**Parameters:**
- `docType` ([`ro.sync.ecss.extensions.api.AuthorDocumentType`](./AuthorDocumentType.md)): The document type information.

### `surroundInFragment(ro.sync.ecss.extensions.api.node.AuthorDocumentFragment xmlFragment, int startOffset, int endOffset)`

**Returns:** `void`

If `endOffset < startOffset` the `xmlFragment` 
 will be inserted at `startOffset`.

**Parameters:**
- `xmlFragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)): The XML fragment which will surround the given interval.
 The first leaf node of the XML fragment will be the parent of the surrounded content.
- `startOffset` (`int`): The start offset of the content to be surrounded, 0 based and inclusive.
- `endOffset` (`int`): The end offset of the content to be surrounded, 0 based and inclusive.

### `setMultipleDistinctAttributes(int parentElementStartOffset, int[] elementOffsets, java.util.List<java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.node.AttrValue>> attributes)`

**Returns:** `void`

Attributes set in this manner will be subject to undo/redo.

**Parameters:**
- `parentElementStartOffset` (`int`): The start offset of the parent element.
- `elementOffsets` (`int[]`): The start offset for each element.
- `attributes` (`java.util.List<java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.node.AttrValue>>`): The list with attributes. Every attribute name is mapped to 
 an AttrValue object. If the value is `null`, the attribute will
 be removed.

### `setMultipleAttributes(int parentElementStartOffset, int[] elementOffsets, java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.node.AttrValue> attributes)`

**Returns:** `void`

Attributes set in this manner will be subject to undo/redo.

**Parameters:**
- `parentElementStartOffset` (`int`): The start offset of the parent element.
- `elementOffsets` (`int[]`): The start offset for each element.
- `attributes` (`java.util.Map<java.lang.String,ro.sync.ecss.extensions.api.node.AttrValue>`): The list with attributes. Every attribute name is mapped to 
 an AttrValue object. If the value is `null`, the attribute will
 be removed.

### `addCommentMarker(int startOffset, int endOffset, java.lang.String comment, java.lang.String parentID)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md)

**Parameters:**
- `startOffset` (`int`): Start offset of marker
- `endOffset` (`int`): End offset of marker
- `comment` (`java.lang.String`): The comment to be added.
- `parentID` (`java.lang.String`): The comment parent id (not `null` for replies).

### `addPersistentMarker(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight.PersistentHighlightType type, int startOffset, int endOffset, java.util.Map<java.lang.String,java.lang.String> properties)`

**Returns:** [`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md)

**Parameters:**
- `type` (`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight.PersistentHighlightType`): The persistent marker type (comment or custom)
- `startOffset` (`int`): Start offset of marker
- `endOffset` (`int`): End offset of marker
- `properties` (`java.util.Map<java.lang.String,java.lang.String>`): not `null` comment properties.

### `removeMarker(ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight marker)`

**Returns:** `boolean`

**Parameters:**
- `marker` ([`ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight`](highlights/AuthorPersistentHighlight.md)): The marker

