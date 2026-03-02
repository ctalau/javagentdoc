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

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))

**Returns:** `boolean`

### `isReferenceChanged(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String attributeName)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))
- `attributeName` (`java.lang.String`)

**Returns:** `boolean`

### `resolveReference(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String systemID, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, org.xml.sax.EntityResolver entityResolver)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))
- `systemID` (`java.lang.String`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../extensions/api/AuthorAccess.md))
- `entityResolver` (`org.xml.sax.EntityResolver`)

**Returns:** `javax.xml.transform.sax.SAXSource`

### `getDisplayName(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))

**Returns:** `java.lang.String`

### `getReferenceUniqueID(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))

**Returns:** `java.lang.String`

### `getReferenceSystemID(ro.sync.ecss.extensions.api.node.AuthorNode node, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../extensions/api/AuthorAccess.md))

**Returns:** `java.lang.String`

### `getWrappedResolver()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorReferenceResolver`](../../extensions/api/AuthorReferenceResolver.md)

### `hasEditableReference(java.lang.String systemID, ro.sync.ecss.extensions.api.node.AuthorNode referenceNodeParent)`

**Parameters:**
- `systemID` (`java.lang.String`)
- `referenceNodeParent` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))

**Returns:** `boolean`

### `allowsValidatationForEditableReference(java.lang.String systemID, ro.sync.ecss.extensions.api.node.AuthorNode referenceNodeParent)`

**Parameters:**
- `systemID` (`java.lang.String`)
- `referenceNodeParent` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))

**Returns:** `boolean`

### `replaceReference(ro.sync.ecss.extensions.api.node.AuthorDocumentProvider targetProvider, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorReferenceNode referenceNode)`

**Parameters:**
- `targetProvider` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentProvider`](../../extensions/api/node/AuthorDocumentProvider.md))
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../extensions/api/AuthorAccess.md))
- `referenceNode` ([`ro.sync.ecss.extensions.api.node.AuthorReferenceNode`](../../extensions/api/node/AuthorReferenceNode.md))

**Returns:** `void`

