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

**Parameters:**
- `candidate` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The candidate node.

**Returns:** `boolean`

### `getSingleChild(ro.sync.ecss.extensions.api.node.AuthorNode candidate, java.lang.String childLocalName)`

**Parameters:**
- `candidate` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The candidate.
- `childLocalName` (`java.lang.String`): The child.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

### `isElementWithName(ro.sync.ecss.extensions.api.node.AuthorNode candidate, java.lang.String localName)`

**Parameters:**
- `candidate` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The candidate.
- `localName` (`java.lang.String`): The local name.

**Returns:** `boolean`

### `updatePseudoClass(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node to update.

**Returns:** `void`

### `updatePseudoClassBelow(ro.sync.ecss.extensions.api.node.AuthorNode node, int depth)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node.
- `depth` (`int`): The depth, excluding the current node.

**Returns:** `void`

### `updatePseudoClassAbove(ro.sync.ecss.extensions.api.node.AuthorNode node, int count)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node.
- `count` (`int`): The number of ancestors to update, excluding the current node.

**Returns:** `void`

### `authorNodeNameChanged(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

**Returns:** `void`

### `authorNodeStructureChanged(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

**Returns:** `void`

### `documentChanged(ro.sync.ecss.extensions.api.node.AuthorDocument oldDocument, ro.sync.ecss.extensions.api.node.AuthorDocument newDocument)`

**Parameters:**
- `oldDocument` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](../../api/node/AuthorDocument.md))
- `newDocument` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](../../api/node/AuthorDocument.md))

**Returns:** `void`

### `contentDeleted(ro.sync.ecss.extensions.api.DocumentContentDeletedEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentDeletedEvent`](../../api/DocumentContentDeletedEvent.md))

**Returns:** `void`

### `contentInserted(ro.sync.ecss.extensions.api.DocumentContentInsertedEvent e)`

**Parameters:**
- `e` ([`ro.sync.ecss.extensions.api.DocumentContentInsertedEvent`](../../api/DocumentContentInsertedEvent.md))

**Returns:** `void`

### `doctypeChanged()`

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

### `activated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))

**Returns:** `void`

### `deactivated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))

**Returns:** `void`

### `documentAboutToBeLoaded(ro.sync.ecss.extensions.api.node.AuthorDocument document, ro.sync.ecss.extensions.api.AuthorPseudoClassController pseudoClassController)`

**Parameters:**
- `document` ([`ro.sync.ecss.extensions.api.node.AuthorDocument`](../../api/node/AuthorDocument.md))
- `pseudoClassController` ([`ro.sync.ecss.extensions.api.AuthorPseudoClassController`](../../api/AuthorPseudoClassController.md))

**Returns:** `void`

### `updatePseudoClassDirectlyBelow(ro.sync.ecss.extensions.api.node.AuthorNode node, ro.sync.ecss.extensions.api.AuthorPseudoClassController pseudoClassController)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The root of the subtree.
- `pseudoClassController` ([`ro.sync.ecss.extensions.api.AuthorPseudoClassController`](../../api/AuthorPseudoClassController.md)): Pseudo class controller

**Returns:** `void`

