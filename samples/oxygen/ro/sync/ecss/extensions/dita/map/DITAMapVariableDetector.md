# Class: `DITAMapVariableDetector`

**Package:** [`ro.sync.ecss.extensions.dita.map`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.map.DITAMapVariableDetector`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorListenerAdapter`](../../api/AuthorListenerAdapter.md)

**Implements:** [`ro.sync.ecss.extensions.api.AuthorExtensionStateListener`](../../api/AuthorExtensionStateListener.md), [`ro.sync.ecss.extensions.api.AuthorPreloadProcessor`](../../api/AuthorPreloadProcessor.md)

## Description

## Fields

### `DITA_VARIABLE_PSEUDOCLASS`

**Type:** `java.lang.String`

### `controller`

**Type:** [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md)

## Constructors

### `<init>()`

## Methods

### `isDITAVariable(ro.sync.ecss.extensions.api.node.AuthorNode candidate)`

**Returns:** `boolean`

**Parameters:**
- `candidate` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The candidate node.

### `getSingleChild(ro.sync.ecss.extensions.api.node.AuthorNode candidate, java.lang.String childLocalName)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

**Parameters:**
- `candidate` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The candidate.
- `childLocalName` (`java.lang.String`): The child.

### `isElementWithName(ro.sync.ecss.extensions.api.node.AuthorNode candidate, java.lang.String localName)`

**Returns:** `boolean`

**Parameters:**
- `candidate` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The candidate.
- `localName` (`java.lang.String`): The local name.

### `updatePseudoClass(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `void`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node to update.

### `updatePseudoClassBelow(ro.sync.ecss.extensions.api.node.AuthorNode node, int depth)`

**Returns:** `void`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node.
- `depth` (`int`): The depth, excluding the current node.

### `updatePseudoClassAbove(ro.sync.ecss.extensions.api.node.AuthorNode node, int count)`

**Returns:** `void`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node.
- `count` (`int`): The number of ancestors to update, excluding the current node.

### `authorNodeNameChanged(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `void`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

### `authorNodeStructureChanged(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `void`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

### `documentChanged(ro.sync.ecss.extensions.api.node.AuthorDocument oldDocument, ro.sync.ecss.extensions.api.node.AuthorDocument newDocument)`

**Returns:** `void`

**Parameters:**
- `oldDocument` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](../../api/node/AuthorDocument.md))
- `newDocument` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](../../api/node/AuthorDocument.md))

### `contentDeleted(ro.sync.ecss.extensions.api.DocumentContentDeletedEvent e)`

**Returns:** `void`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentDeletedEvent`](../../api/DocumentContentDeletedEvent.md))

### `contentInserted(ro.sync.ecss.extensions.api.DocumentContentInsertedEvent e)`

**Returns:** `void`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentInsertedEvent`](../../api/DocumentContentInsertedEvent.md))

### `doctypeChanged()`

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

### `activated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))

### `deactivated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))

### `documentAboutToBeLoaded(ro.sync.ecss.extensions.api.node.AuthorDocument document, ro.sync.ecss.extensions.api.AuthorPseudoClassController pseudoClassController)`

**Returns:** `void`

**Parameters:**
- `document` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](../../api/node/AuthorDocument.md))
- `pseudoClassController` ([`ro.sync.ecss.extensions.api.AuthorPseudoClassController`](../../api/AuthorPseudoClassController.md))

### `updatePseudoClassDirectlyBelow(ro.sync.ecss.extensions.api.node.AuthorNode node, ro.sync.ecss.extensions.api.AuthorPseudoClassController pseudoClassController)`

**Returns:** `void`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The root of the subtree.
- `pseudoClassController` ([`ro.sync.ecss.extensions.api.AuthorPseudoClassController`](../../api/AuthorPseudoClassController.md)): Pseudo class controller

