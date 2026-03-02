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

**Returns:** `void`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.AttributeChangedEvent`](./AttributeChangedEvent.md))

### `authorNodeNameChanged(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `void`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

### `authorNodeStructureChanged(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `void`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

### `beforeAttributeChange(ro.sync.ecss.extensions.api.AttributeChangedEvent e)`

**Returns:** `void`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.AttributeChangedEvent`](./AttributeChangedEvent.md))

### `beforeAuthorNodeStructureChange(ro.sync.ecss.extensions.api.node.AuthorNode authorNode)`

**Returns:** `void`

**Parameters:**
- `authorNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

### `beforeAuthorNodeNameChange(ro.sync.ecss.extensions.api.node.AuthorNode authorNode)`

**Returns:** `void`

**Parameters:**
- `authorNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

### `beforeContentDelete(ro.sync.ecss.extensions.api.DocumentContentDeletedEvent e)`

**Returns:** `void`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentDeletedEvent`](./DocumentContentDeletedEvent.md))

### `beforeContentInsert(ro.sync.ecss.extensions.api.DocumentContentInsertedEvent e)`

**Returns:** `void`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentInsertedEvent`](./DocumentContentInsertedEvent.md))

### `beforeDoctypeChange()`

**Returns:** `void`

### `contentDeleted(ro.sync.ecss.extensions.api.DocumentContentDeletedEvent e)`

**Returns:** `void`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentDeletedEvent`](./DocumentContentDeletedEvent.md))

### `contentInserted(ro.sync.ecss.extensions.api.DocumentContentInsertedEvent e)`

**Returns:** `void`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentInsertedEvent`](./DocumentContentInsertedEvent.md))

### `doctypeChanged()`

**Returns:** `void`

### `documentChanged(ro.sync.ecss.extensions.api.node.AuthorDocument oldDocument, ro.sync.ecss.extensions.api.node.AuthorDocument newDocument)`

**Returns:** `void`

**Parameters:**
- `oldDocument` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](node/AuthorDocument.md))
- `newDocument` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](node/AuthorDocument.md))

