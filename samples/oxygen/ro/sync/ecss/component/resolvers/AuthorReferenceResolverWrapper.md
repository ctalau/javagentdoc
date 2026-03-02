# Class: `AuthorReferenceResolverWrapper`

**Package:** [`ro.sync.ecss.component.resolvers`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.component.resolvers.AuthorReferenceResolverWrapper`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorReferenceResolver`](../../extensions/api/AuthorReferenceResolver.md)

## Description

## Fields

### `wrappedResolver`

**Type:** [`ro.sync.ecss.extensions.api.AuthorReferenceResolver`](../../extensions/api/AuthorReferenceResolver.md)

## Constructors

### `<init>(AuthorReferenceResolver wrappedResolver)`

**Parameters:**
- `wrappedResolver` ([`ro.sync.ecss.extensions.api.AuthorReferenceResolver`](../../extensions/api/AuthorReferenceResolver.md)): The wrapped resolver.

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `hasReferences(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))

**Returns:** `boolean`

### `isReferenceChanged(AuthorNode node, String attributeName)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))
- `attributeName` (`java.lang.String`)

**Returns:** `boolean`

### `resolveReference(AuthorNode node, String systemID, AuthorAccess authorAccess, EntityResolver entityResolver)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))
- `systemID` (`java.lang.String`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../extensions/api/AuthorAccess.md))
- `entityResolver` (`org.xml.sax.EntityResolver`)

**Returns:** `javax.xml.transform.sax.SAXSource`

### `getDisplayName(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))

**Returns:** `java.lang.String`

### `getReferenceUniqueID(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))

**Returns:** `java.lang.String`

### `getReferenceSystemID(AuthorNode node, AuthorAccess authorAccess)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../extensions/api/AuthorAccess.md))

**Returns:** `java.lang.String`

### `getWrappedResolver()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorReferenceResolver`](../../extensions/api/AuthorReferenceResolver.md)

### `hasEditableReference(String systemID, AuthorNode referenceNodeParent)`

**Parameters:**
- `systemID` (`java.lang.String`)
- `referenceNodeParent` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))

**Returns:** `boolean`

### `allowsValidatationForEditableReference(String systemID, AuthorNode referenceNodeParent)`

**Parameters:**
- `systemID` (`java.lang.String`)
- `referenceNodeParent` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md))

**Returns:** `boolean`

### `replaceReference(AuthorDocumentProvider targetProvider, AuthorAccess authorAccess, AuthorReferenceNode referenceNode)`

**Parameters:**
- `targetProvider` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentProvider`](../../extensions/api/node/AuthorDocumentProvider.md))
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../extensions/api/AuthorAccess.md))
- `referenceNode` ([`ro.sync.ecss.extensions.api.node.AuthorReferenceNode`](../../extensions/api/node/AuthorReferenceNode.md))

**Returns:** `void`

