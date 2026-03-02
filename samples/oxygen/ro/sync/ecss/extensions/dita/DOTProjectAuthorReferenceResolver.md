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

### `resolveReference(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String systemID, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, org.xml.sax.EntityResolver entityResolver)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))
- `systemID` (`java.lang.String`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `entityResolver` (`org.xml.sax.EntityResolver`)

**Returns:** `javax.xml.transform.sax.SAXSource`

### `isReferenceChanged(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String attributeName)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))
- `attributeName` (`java.lang.String`)

**Returns:** `boolean`

### `hasReferences(ro.sync.ecss.extensions.api.node.AuthorNode node)`

The value of the HREF attribute should not be null.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): The node we want to check for references.

**Returns:** `boolean`

### `getReferenceUniqueID(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))

**Returns:** `java.lang.String`

### `getReferenceSystemID(ro.sync.ecss.extensions.api.node.AuthorNode node, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))

**Returns:** `java.lang.String`

### `getDisplayName(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))

**Returns:** `java.lang.String`

### `hasEditableReference(java.lang.String systemID, ro.sync.ecss.extensions.api.node.AuthorNode referenceNodeParent)`

**Parameters:**
- `systemID` (`java.lang.String`)
- `referenceNodeParent` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))

**Returns:** `boolean`

### `replaceReference(ro.sync.ecss.extensions.api.node.AuthorDocumentProvider targetProvider, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorReferenceNode referenceNode)`

**Parameters:**
- `targetProvider` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentProvider`](../api/node/AuthorDocumentProvider.md))
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `referenceNode` ([`ro.sync.ecss.extensions.api.node.AuthorReferenceNode`](../api/node/AuthorReferenceNode.md))

**Returns:** `void`

### `allowsValidatationForEditableReference(java.lang.String systemID, ro.sync.ecss.extensions.api.node.AuthorNode referenceNodeParent)`

**Parameters:**
- `systemID` (`java.lang.String`)
- `referenceNodeParent` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))

**Returns:** `boolean`

### `extractHref(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): The node with the href.

**Returns:** `java.lang.String`

