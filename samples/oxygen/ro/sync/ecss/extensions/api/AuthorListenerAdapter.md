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

### `attributeChanged([`ro.sync.ecss.extensions.api.AttributeChangedEvent`](./AttributeChangedEvent.md) e)`

**Returns:** `void`

### `authorNodeNameChanged([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node)`

**Returns:** `void`

### `authorNodeStructureChanged([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node)`

**Returns:** `void`

### `beforeAttributeChange([`ro.sync.ecss.extensions.api.AttributeChangedEvent`](./AttributeChangedEvent.md) e)`

**Returns:** `void`

### `beforeAuthorNodeStructureChange([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) authorNode)`

**Returns:** `void`

### `beforeAuthorNodeNameChange([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) authorNode)`

**Returns:** `void`

### `beforeContentDelete([`ro.sync.ecss.extensions.api.DocumentContentDeletedEvent`](./DocumentContentDeletedEvent.md) e)`

**Returns:** `void`

### `beforeContentInsert([`ro.sync.ecss.extensions.api.DocumentContentInsertedEvent`](./DocumentContentInsertedEvent.md) e)`

**Returns:** `void`

### `beforeDoctypeChange()`

**Returns:** `void`

### `contentDeleted([`ro.sync.ecss.extensions.api.DocumentContentDeletedEvent`](./DocumentContentDeletedEvent.md) e)`

**Returns:** `void`

### `contentInserted([`ro.sync.ecss.extensions.api.DocumentContentInsertedEvent`](./DocumentContentInsertedEvent.md) e)`

**Returns:** `void`

### `doctypeChanged()`

**Returns:** `void`

### `documentChanged([`ro.sync.ecss.extensions.api.node.AuthorDocument`](node/AuthorDocument.md) oldDocument, [`ro.sync.ecss.extensions.api.node.AuthorDocument`](node/AuthorDocument.md) newDocument)`

**Returns:** `void`

