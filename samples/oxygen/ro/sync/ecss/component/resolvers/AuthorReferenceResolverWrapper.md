# Class: `AuthorReferenceResolverWrapper`

**Package:** [`ro.sync.ecss.component.resolvers`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.component.resolvers.AuthorReferenceResolverWrapper`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorReferenceResolver`](../../extensions/api/AuthorReferenceResolver.md)

## Description

## Fields

### `wrappedResolver`

**Type:** [`ro.sync.ecss.extensions.api.AuthorReferenceResolver`](../../extensions/api/AuthorReferenceResolver.md)

## Constructors

### `<init>([`ro.sync.ecss.extensions.api.AuthorReferenceResolver`](../../extensions/api/AuthorReferenceResolver.md) wrappedResolver)`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `hasReferences([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `isReferenceChanged([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md) node, `java.lang.String` attributeName)`

**Returns:** `boolean`

### `resolveReference([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md) node, `java.lang.String` systemID, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../extensions/api/AuthorAccess.md) authorAccess, `org.xml.sax.EntityResolver` entityResolver)`

**Returns:** `javax.xml.transform.sax.SAXSource`

### `getDisplayName([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md) node)`

**Returns:** `java.lang.String`

### `getReferenceUniqueID([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md) node)`

**Returns:** `java.lang.String`

### `getReferenceSystemID([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md) node, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../extensions/api/AuthorAccess.md) authorAccess)`

**Returns:** `java.lang.String`

### `getWrappedResolver()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorReferenceResolver`](../../extensions/api/AuthorReferenceResolver.md)

### `hasEditableReference(`java.lang.String` systemID, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md) referenceNodeParent)`

**Returns:** `boolean`

### `allowsValidatationForEditableReference(`java.lang.String` systemID, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md) referenceNodeParent)`

**Returns:** `boolean`

### `replaceReference([`ro.sync.ecss.extensions.api.node.AuthorDocumentProvider`](../../extensions/api/node/AuthorDocumentProvider.md) targetProvider, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../extensions/api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorReferenceNode`](../../extensions/api/node/AuthorReferenceNode.md) referenceNode)`

**Returns:** `void`

