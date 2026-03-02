# Class: `MoveCaretUtil`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.MoveCaretUtil`

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `hasImposedEditorVariableCaretOffset(java.lang.String xmlFragment)`

**Parameters:**
- `xmlFragment` (`java.lang.String`): The XML fragment.

**Returns:** `boolean`

### `moveCaretToImposedEditorVariableOffset(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int insertionOffset)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `insertionOffset` (`int`): The offset where the operation inserted the XML fragment.

**Returns:** `void`

### `detectCaretPI(ro.sync.ecss.extensions.api.AuthorDocumentController ctrl, int startSearch)`

**Parameters:**
- `ctrl` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md))
- `startSearch` (`int`)

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)

### `detectCaretPI(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The current node.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)

