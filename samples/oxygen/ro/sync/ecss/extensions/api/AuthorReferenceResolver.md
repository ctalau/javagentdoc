# Interface: `AuthorReferenceResolver`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorReferenceResolver`

**Extends:** [`ro.sync.ecss.extensions.api.Extension`](./Extension.md)

## Description

## Methods

### `hasReferences([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node)`

**Returns:** `boolean`

For example the method should return `true` for 
 a DITA element that has `conref` attribute set.

### `isReferenceChanged([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node, `java.lang.String` attributeName)`

**Returns:** `boolean`

For example the DITA implementation returns `true` 
 when the attribute name is equal to `'conref'`.

### `resolveReference([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node, `java.lang.String` systemID, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `org.xml.sax.EntityResolver` entityResolver)`

**Returns:** `javax.xml.transform.sax.SAXSource`

The returning SAXSource will be used for creating the referred content 
 using the parser and the source inside it.
 
IMPORTANT: the SAXSource needs to have an XMLReader set to it.
 

 For example the DITA implementation resolves the content referred by the
 `conref` attribute.

### `getDisplayName([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node)`

**Returns:** `java.lang.String`

For example the value of the `conref` attribute is returned
 by the DITA implementation.

### `getReferenceUniqueID([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node)`

**Returns:** `java.lang.String`

The unique identifier is used to avoid resolving the references recursively.
 

 For example the DITA implementation uses the value of the 
 `conref` attribute as the unique identifier.

### `getReferenceSystemID([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `java.lang.String`

### `hasEditableReference(`java.lang.String` systemID, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) referenceNodeParent)`

**Returns:** `boolean`

### `allowsValidatationForEditableReference(`java.lang.String` systemID, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) referenceNodeParent)`

**Returns:** `boolean`

### `replaceReference([`ro.sync.ecss.extensions.api.node.AuthorDocumentProvider`](node/AuthorDocumentProvider.md) targetProvider, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorReferenceNode`](node/AuthorReferenceNode.md) referenceNode)`

**Returns:** `void`

