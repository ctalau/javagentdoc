# Interface: `AuthorListener`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorListener`

**Extends:** [`ro.sync.ecss.extensions.api.CompoundEditListener`](./CompoundEditListener.md)

## Description

Please use instead the 
 "ro.sync.ecss.extensions.api.AuthorDocumentController.setDocumentFilter(AuthorDocumentFilter)" API.

## Methods

### `beforeContentDelete(DocumentContentDeletedEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentDeletedEvent`](./DocumentContentDeletedEvent.md)): The DocumentContentDeletedEvent.

**Returns:** `void`

### `beforeAttributeChange(AttributeChangedEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.AttributeChangedEvent`](./AttributeChangedEvent.md)): The AttributeChangedEvent.

**Returns:** `void`

### `beforeContentInsert(DocumentContentInsertedEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentInsertedEvent`](./DocumentContentInsertedEvent.md)): The DocumentContentInsertedEvent.

**Returns:** `void`

### `beforeDoctypeChange()`

**Returns:** `void`

### `beforeAuthorNodeStructureChange(AuthorNode authorNode)`

**Parameters:**
- `authorNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The AuthorNode that contains the modification.

**Returns:** `void`

### `beforeAuthorNodeNameChange(AuthorNode authorNode)`

*The `authorNode` is a reference to the actual node in the 
 AuthorDocument so its name will be changed after the name change 
 operation is completed.
 

 If the old name of the node will be needed after the call of this method it should be 
 obtained and saved during this method call.*

**Parameters:**
- `authorNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The AuthorNode that will be changed.

**Returns:** `void`

### `attributeChanged(AttributeChangedEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.AttributeChangedEvent`](./AttributeChangedEvent.md)): The AttributeChangedEvent.

**Returns:** `void`

### `authorNodeNameChanged(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The AuthorNode that was renamed.

**Returns:** `void`

### `authorNodeStructureChanged(AuthorNode node)`

An insert or delete operation 
 has been made and affected the children of the node.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The AuthorNode that contains the modification.

**Returns:** `void`

### `documentChanged(AuthorDocument oldDocument, AuthorDocument newDocument)`

**Parameters:**
- `oldDocument` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](node/AuthorDocument.md)): The old Author document
- `newDocument` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](node/AuthorDocument.md)): The new Author document.

**Returns:** `void`

### `contentDeleted(DocumentContentDeletedEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentDeletedEvent`](./DocumentContentDeletedEvent.md)): The DocumentContentDeletedEvent.

**Returns:** `void`

### `contentInserted(DocumentContentInsertedEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentInsertedEvent`](./DocumentContentInsertedEvent.md)): The DocumentContentInsertedEvent.

**Returns:** `void`

### `doctypeChanged()`

**Returns:** `void`

