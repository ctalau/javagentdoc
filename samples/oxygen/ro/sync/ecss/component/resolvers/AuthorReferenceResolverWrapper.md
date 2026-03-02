# Class: `AuthorReferenceResolverWrapper`

**Package:** [`ro.sync.ecss.component.resolvers`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.component.resolvers.AuthorReferenceResolverWrapper`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorReferenceResolver`](../../extensions/api/AuthorReferenceResolver.md)

## Description

## Fields

### `wrappedResolver`

**Type:** [`ro.sync.ecss.extensions.api.AuthorReferenceResolver`](../../extensions/api/AuthorReferenceResolver.md)

## Constructors

### `<init>(ro.sync.ecss.extensions.api.AuthorReferenceResolver wrappedResolver)`

**Parameters:**
- `wrappedResolver` ([`ro.sync.ecss.extensions.api.AuthorReferenceResolver`](../../extensions/api/AuthorReferenceResolver.md)): The wrapped resolver.

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `hasReferences(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))

### `isReferenceChanged(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String attributeName)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))
- `attributeName` (`java.lang.String`)

### `resolveReference(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String systemID, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, org.xml.sax.EntityResolver entityResolver)`

**Returns:** `javax.xml.transform.sax.SAXSource`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))
- `systemID` (`java.lang.String`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../extensions/api/AuthorAccess.md))
- `entityResolver` (`org.xml.sax.EntityResolver`)

### `getDisplayName(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `java.lang.String`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))

### `getReferenceUniqueID(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `java.lang.String`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))

### `getReferenceSystemID(ro.sync.ecss.extensions.api.node.AuthorNode node, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `java.lang.String`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../extensions/api/AuthorAccess.md))

### `getWrappedResolver()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorReferenceResolver`](../../extensions/api/AuthorReferenceResolver.md)

### `hasEditableReference(java.lang.String systemID, ro.sync.ecss.extensions.api.node.AuthorNode referenceNodeParent)`

**Returns:** `boolean`

**Parameters:**
- `systemID` (`java.lang.String`)
- `referenceNodeParent` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))

### `allowsValidatationForEditableReference(java.lang.String systemID, ro.sync.ecss.extensions.api.node.AuthorNode referenceNodeParent)`

**Returns:** `boolean`

**Parameters:**
- `systemID` (`java.lang.String`)
- `referenceNodeParent` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))

### `replaceReference(ro.sync.ecss.extensions.api.node.AuthorDocumentProvider targetProvider, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorReferenceNode referenceNode)`

**Returns:** `void`

**Parameters:**
- `targetProvider` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentProvider`](../../extensions/api/node/AuthorDocumentProvider.md))
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../extensions/api/AuthorAccess.md))
- `referenceNode` ([`ro.sync.ecss.extensions.api.node.AuthorReferenceNode`](../../extensions/api/node/AuthorReferenceNode.md))

