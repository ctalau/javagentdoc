# Interface: `AuthorListener`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorListener`

**Extends:** [`ro.sync.ecss.extensions.api.CompoundEditListener`](./CompoundEditListener.md)

## Description

Please use instead the 
 "ro.sync.ecss.extensions.api.AuthorDocumentController.setDocumentFilter(AuthorDocumentFilter)" API.

## Methods

### `beforeContentDelete([`ro.sync.ecss.extensions.api.DocumentContentDeletedEvent`](./DocumentContentDeletedEvent.md) e)`

**Returns:** `void`

### `beforeAttributeChange([`ro.sync.ecss.extensions.api.AttributeChangedEvent`](./AttributeChangedEvent.md) e)`

**Returns:** `void`

### `beforeContentInsert([`ro.sync.ecss.extensions.api.DocumentContentInsertedEvent`](./DocumentContentInsertedEvent.md) e)`

**Returns:** `void`

### `beforeDoctypeChange()`

**Returns:** `void`

### `beforeAuthorNodeStructureChange([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) authorNode)`

**Returns:** `void`

### `beforeAuthorNodeNameChange([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) authorNode)`

**Returns:** `void`

*The `authorNode` is a reference to the actual node in the 
 AuthorDocument so its name will be changed after the name change 
 operation is completed.
 

 If the old name of the node will be needed after the call of this method it should be 
 obtained and saved during this method call.*

### `attributeChanged([`ro.sync.ecss.extensions.api.AttributeChangedEvent`](./AttributeChangedEvent.md) e)`

**Returns:** `void`

### `authorNodeNameChanged([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node)`

**Returns:** `void`

### `authorNodeStructureChanged([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node)`

**Returns:** `void`

An insert or delete operation 
 has been made and affected the children of the node.

### `documentChanged([`ro.sync.ecss.extensions.api.node.AuthorDocument`](node/AuthorDocument.md) oldDocument, [`ro.sync.ecss.extensions.api.node.AuthorDocument`](node/AuthorDocument.md) newDocument)`

**Returns:** `void`

### `contentDeleted([`ro.sync.ecss.extensions.api.DocumentContentDeletedEvent`](./DocumentContentDeletedEvent.md) e)`

**Returns:** `void`

### `contentInserted([`ro.sync.ecss.extensions.api.DocumentContentInsertedEvent`](./DocumentContentInsertedEvent.md) e)`

**Returns:** `void`

### `doctypeChanged()`

**Returns:** `void`

