# Class: `DOTProjectAuthorReferenceResolver`

**Package:** [`ro.sync.ecss.extensions.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.DOTProjectAuthorReferenceResolver`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorReferenceResolver`](../api/AuthorReferenceResolver.md)

## Description

It will resolve all 

  `<include href="includedProject.xml">` 
 references.

## Fields

### `INCLUDE_ELEMENT_NAME`

**Type:** `java.lang.String`

### `HREF_ATTR_NAME`

**Type:** `java.lang.String`

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `resolveReference([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node, `java.lang.String` systemID, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, `org.xml.sax.EntityResolver` entityResolver)`

**Returns:** `javax.xml.transform.sax.SAXSource`

### `isReferenceChanged([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node, `java.lang.String` attributeName)`

**Returns:** `boolean`

### `hasReferences([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

The value of the HREF attribute should not be null.

### `getReferenceUniqueID([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node)`

**Returns:** `java.lang.String`

### `getReferenceSystemID([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess)`

**Returns:** `java.lang.String`

### `getDisplayName([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node)`

**Returns:** `java.lang.String`

### `hasEditableReference(`java.lang.String` systemID, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) referenceNodeParent)`

**Returns:** `boolean`

### `replaceReference([`ro.sync.ecss.extensions.api.node.AuthorDocumentProvider`](../api/node/AuthorDocumentProvider.md) targetProvider, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorReferenceNode`](../api/node/AuthorReferenceNode.md) referenceNode)`

**Returns:** `void`

### `allowsValidatationForEditableReference(`java.lang.String` systemID, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) referenceNodeParent)`

**Returns:** `boolean`

### `extractHref([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node)`

**Returns:** `java.lang.String`

