# Interface: `AuthorListener`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorListener`

**Extends:** [`ro.sync.ecss.extensions.api.CompoundEditListener`](./CompoundEditListener.md)

## Description

Please use instead the 
 "ro.sync.ecss.extensions.api.AuthorDocumentController.setDocumentFilter(AuthorDocumentFilter)" API.

## Methods

### `beforeContentDelete(ro.sync.ecss.extensions.api.DocumentContentDeletedEvent e)`

**Returns:** `void`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentDeletedEvent`](./DocumentContentDeletedEvent.md)): The DocumentContentDeletedEvent.

### `beforeAttributeChange(ro.sync.ecss.extensions.api.AttributeChangedEvent e)`

**Returns:** `void`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.AttributeChangedEvent`](./AttributeChangedEvent.md)): The AttributeChangedEvent.

### `beforeContentInsert(ro.sync.ecss.extensions.api.DocumentContentInsertedEvent e)`

**Returns:** `void`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentInsertedEvent`](./DocumentContentInsertedEvent.md)): The DocumentContentInsertedEvent.

### `beforeDoctypeChange()`

**Returns:** `void`

### `beforeAuthorNodeStructureChange(ro.sync.ecss.extensions.api.node.AuthorNode authorNode)`

**Returns:** `void`

**Parameters:**
- `authorNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The AuthorNode that contains the modification.

### `beforeAuthorNodeNameChange(ro.sync.ecss.extensions.api.node.AuthorNode authorNode)`

**Returns:** `void`

*The `authorNode` is a reference to the actual node in the 
 AuthorDocument so its name will be changed after the name change 
 operation is completed.
 

 If the old name of the node will be needed after the call of this method it should be 
 obtained and saved during this method call.*

**Parameters:**
- `authorNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The AuthorNode that will be changed.

### `attributeChanged(ro.sync.ecss.extensions.api.AttributeChangedEvent e)`

**Returns:** `void`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.AttributeChangedEvent`](./AttributeChangedEvent.md)): The AttributeChangedEvent.

### `authorNodeNameChanged(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `void`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The AuthorNode that was renamed.

### `authorNodeStructureChanged(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `void`

An insert or delete operation 
 has been made and affected the children of the node.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The AuthorNode that contains the modification.

### `documentChanged(ro.sync.ecss.extensions.api.node.AuthorDocument oldDocument, ro.sync.ecss.extensions.api.node.AuthorDocument newDocument)`

**Returns:** `void`

**Parameters:**
- `oldDocument` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](node/AuthorDocument.md)): The old Author document
- `newDocument` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](node/AuthorDocument.md)): The new Author document.

### `contentDeleted(ro.sync.ecss.extensions.api.DocumentContentDeletedEvent e)`

**Returns:** `void`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentDeletedEvent`](./DocumentContentDeletedEvent.md)): The DocumentContentDeletedEvent.

### `contentInserted(ro.sync.ecss.extensions.api.DocumentContentInsertedEvent e)`

**Returns:** `void`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentInsertedEvent`](./DocumentContentInsertedEvent.md)): The DocumentContentInsertedEvent.

### `doctypeChanged()`

**Returns:** `void`

