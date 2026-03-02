# Class: `AuthorListenerAdapter`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorListenerAdapter`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorListener`](./AuthorListener.md)

## Description

**DANGER:** You must avoid making live document changes on the received call backs. Please use instead the 
 "ro.sync.ecss.extensions.api.AuthorDocumentController.setDocumentFilter(AuthorDocumentFilter)" API.

## Constructors

### `<init>()`

## Methods

### `attributeChanged(ro.sync.ecss.extensions.api.AttributeChangedEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.AttributeChangedEvent`](./AttributeChangedEvent.md))

**Returns:** `void`

### `authorNodeNameChanged(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `void`

### `authorNodeStructureChanged(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `void`

### `beforeAttributeChange(ro.sync.ecss.extensions.api.AttributeChangedEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.AttributeChangedEvent`](./AttributeChangedEvent.md))

**Returns:** `void`

### `beforeAuthorNodeStructureChange(ro.sync.ecss.extensions.api.node.AuthorNode authorNode)`

**Parameters:**
- `authorNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `void`

### `beforeAuthorNodeNameChange(ro.sync.ecss.extensions.api.node.AuthorNode authorNode)`

**Parameters:**
- `authorNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `void`

### `beforeContentDelete(ro.sync.ecss.extensions.api.DocumentContentDeletedEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentDeletedEvent`](./DocumentContentDeletedEvent.md))

**Returns:** `void`

### `beforeContentInsert(ro.sync.ecss.extensions.api.DocumentContentInsertedEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentInsertedEvent`](./DocumentContentInsertedEvent.md))

**Returns:** `void`

### `beforeDoctypeChange()`

**Returns:** `void`

### `contentDeleted(ro.sync.ecss.extensions.api.DocumentContentDeletedEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentDeletedEvent`](./DocumentContentDeletedEvent.md))

**Returns:** `void`

### `contentInserted(ro.sync.ecss.extensions.api.DocumentContentInsertedEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentInsertedEvent`](./DocumentContentInsertedEvent.md))

**Returns:** `void`

### `doctypeChanged()`

**Returns:** `void`

### `documentChanged(ro.sync.ecss.extensions.api.node.AuthorDocument oldDocument, ro.sync.ecss.extensions.api.node.AuthorDocument newDocument)`

**Parameters:**
- `oldDocument` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](node/AuthorDocument.md))
- `newDocument` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](node/AuthorDocument.md))

**Returns:** `void`

