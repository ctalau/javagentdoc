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

### `attributeChanged(AttributeChangedEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.AttributeChangedEvent`](./AttributeChangedEvent.md))

**Returns:** `void`

### `authorNodeNameChanged(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `void`

### `authorNodeStructureChanged(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `void`

### `beforeAttributeChange(AttributeChangedEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.AttributeChangedEvent`](./AttributeChangedEvent.md))

**Returns:** `void`

### `beforeAuthorNodeStructureChange(AuthorNode authorNode)`

**Parameters:**
- `authorNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `void`

### `beforeAuthorNodeNameChange(AuthorNode authorNode)`

**Parameters:**
- `authorNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `void`

### `beforeContentDelete(DocumentContentDeletedEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentDeletedEvent`](./DocumentContentDeletedEvent.md))

**Returns:** `void`

### `beforeContentInsert(DocumentContentInsertedEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentInsertedEvent`](./DocumentContentInsertedEvent.md))

**Returns:** `void`

### `beforeDoctypeChange()`

**Returns:** `void`

### `contentDeleted(DocumentContentDeletedEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentDeletedEvent`](./DocumentContentDeletedEvent.md))

**Returns:** `void`

### `contentInserted(DocumentContentInsertedEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentInsertedEvent`](./DocumentContentInsertedEvent.md))

**Returns:** `void`

### `doctypeChanged()`

**Returns:** `void`

### `documentChanged(AuthorDocument oldDocument, AuthorDocument newDocument)`

**Parameters:**
- `oldDocument` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](node/AuthorDocument.md))
- `newDocument` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](node/AuthorDocument.md))

**Returns:** `void`

