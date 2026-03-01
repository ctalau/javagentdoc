# Class: `AuthorDocumentFragment`

**Package:** [`ro.sync.ecss.extensions.api.node`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `content`

**Type:** [`ro.sync.ecss.extensions.api.Content`](../Content.md)

### `nodes`

**Type:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

### `righSplits`

**Type:** `int`

### `leftSplits`

**Type:** `int`

### `changeMarks`

**Type:** `java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>`

### `persistentMarks`

**Type:** `java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>`

### `attributesChanges`

**Type:** `java.util.Map<ro.sync.ecss.extensions.api.node.AuthorElement,java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>>`

### `suggestedRelativeCaretOffset`

**Type:** `int`

## Constructors

### `<init>([`ro.sync.ecss.extensions.api.Content`](../Content.md) arg0, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>` arg1, `int` arg2, `int` arg3)`

### `<init>([`ro.sync.ecss.extensions.api.Content`](../Content.md) arg0, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>` arg1, `int` arg2, `int` arg3, `java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>` arg4, `java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>` arg5)`

### `<init>([`ro.sync.ecss.extensions.api.Content`](../Content.md) arg0, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>` arg1, `int` arg2, `int` arg3, `java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>` arg4, `java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>` arg5, `java.util.Map<ro.sync.ecss.extensions.api.node.AuthorElement,java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>>` arg6)`

## Methods

### `getContent()`

**Returns:** [`ro.sync.ecss.extensions.api.Content`](../Content.md)

### `getAcceptedLength()`

**Returns:** `int`

### `getLength()`

**Returns:** `int`

### `getContentNodes()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

### `toString()`

**Returns:** `java.lang.String`

### `getLeftSplits()`

**Returns:** `int`

### `getRightSplits()`

**Returns:** `int`

### `setLeftSplits(`int` arg0)`

**Returns:** `void`

### `setRighSplits(`int` arg0)`

**Returns:** `void`

### `getChangeHighlights()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>`

### `getAttributesChangeHighlights()`

**Returns:** `java.util.Map<ro.sync.ecss.extensions.api.node.AuthorElement,java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>>`

### `getCommentsAndCustomHighlights()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>`

### `setCommentAndCustomHighlights(`java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>` arg0)`

**Returns:** `void`

### `setChangeHighlights(`java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>` arg0)`

**Returns:** `void`

### `setAttributesChanges(`java.util.Map<ro.sync.ecss.extensions.api.node.AuthorElement,java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>>` arg0)`

**Returns:** `void`

### `isEmpty()`

**Returns:** `boolean`

### `containsSimpleText()`

**Returns:** `boolean`

### `clone()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](./AuthorDocumentFragment.md)

### `clonePersistentMarkers([`ro.sync.ecss.extensions.api.Content`](../Content.md) arg0)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>`

### `cloneChangeMarkers([`ro.sync.ecss.extensions.api.Content`](../Content.md) arg0)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>`

### `cloneAttributeChanges([`ro.sync.ecss.extensions.api.Content`](../Content.md) arg0, `java.util.Map<ro.sync.ecss.extensions.api.node.AuthorNode,ro.sync.ecss.extensions.api.node.AuthorNode>` arg1)`

**Returns:** `java.util.Map<ro.sync.ecss.extensions.api.node.AuthorElement,java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.extensions.api.highlights.AuthorPersistentHighlight>>`

### `cloneContent()`

**Returns:** [`ro.sync.ecss.extensions.api.Content`](../Content.md)

### `setSuggestedRelativeCaretOffset(`int` arg0)`

**Returns:** `void`

### `getSuggestedRelativeCaretOffset()`

**Returns:** `int`

### `setContentNodes(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>` arg0)`

**Returns:** `void`

