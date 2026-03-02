# Interface: `AuthorReferenceResolver`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorReferenceResolver`

**Extends:** [`ro.sync.ecss.extensions.api.Extension`](./Extension.md)

## Description

## Methods

### `hasReferences(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

For example the method should return `true` for 
 a DITA element that has `conref` attribute set.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node to be analyzed.

### `isReferenceChanged(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String attributeName)`

**Returns:** `boolean`

For example the DITA implementation returns `true` 
 when the attribute name is equal to `'conref'`.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The AuthorNode with the references.
- `attributeName` (`java.lang.String`): The name of the changed attribute.

### `resolveReference(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String systemID, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, org.xml.sax.EntityResolver entityResolver)`

**Returns:** `javax.xml.transform.sax.SAXSource`

The returning SAXSource will be used for creating the referred content 
 using the parser and the source inside it.
 
IMPORTANT: the SAXSource needs to have an XMLReader set to it.
 

 For example the DITA implementation resolves the content referred by the
 `conref` attribute.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node which has references.
- `systemID` (`java.lang.String`): The system ID of the node with references.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access implementation.
 Provides access to specific informations and actions for 
 editor, document, workspace, tables, change tracking, utility a.s.o.
- `entityResolver` (`org.xml.sax.EntityResolver`): The entity resolver that can be used to resolve: 
 
 

  - Resources that are already opened in editor. 
  For this case the InputSource will contain the editor content.

  - Resources resolved through XML catalog.

 


### `getDisplayName(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `java.lang.String`

For example the value of the `conref` attribute is returned
 by the DITA implementation.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node that contains references.

### `getReferenceUniqueID(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `java.lang.String`

The unique identifier is used to avoid resolving the references recursively.
 

 For example the DITA implementation uses the value of the 
 `conref` attribute as the unique identifier.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node that has reference.

### `getReferenceSystemID(ro.sync.ecss.extensions.api.node.AuthorNode node, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `java.lang.String`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The reference node.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access. It provides access to specific 
 informations and actions for editor, document, workspace, tables, 
 change tracking, utility a.s.o.

### `hasEditableReference(java.lang.String systemID, ro.sync.ecss.extensions.api.node.AuthorNode referenceNodeParent)`

**Returns:** `boolean`

**Parameters:**
- `systemID` (`java.lang.String`): System ID of the document in which the current node is located.
- `referenceNodeParent` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The parent of the future referene node

### `allowsValidatationForEditableReference(java.lang.String systemID, ro.sync.ecss.extensions.api.node.AuthorNode referenceNodeParent)`

**Returns:** `boolean`

**Parameters:**
- `systemID` (`java.lang.String`): System ID of the document in which the current node is located.
- `referenceNodeParent` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The parent of the future reference node

### `replaceReference(ro.sync.ecss.extensions.api.node.AuthorDocumentProvider targetProvider, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorReferenceNode referenceNode)`

**Returns:** `void`

**Parameters:**
- `targetProvider` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentProvider`](node/AuthorDocumentProvider.md)): The provider to the target document.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): Access to the current document.
- `referenceNode` ([`ro.sync.ecss.extensions.api.node.AuthorReferenceNode`](node/AuthorReferenceNode.md)): The reference node to get the modified content from.

