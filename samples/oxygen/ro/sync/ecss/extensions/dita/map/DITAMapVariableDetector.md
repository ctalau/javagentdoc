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

### `isDITAVariable([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) candidate)`

**Returns:** `boolean`

### `getSingleChild([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) candidate, `java.lang.String` childLocalName)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

### `isElementWithName([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) candidate, `java.lang.String` localName)`

**Returns:** `boolean`

### `updatePseudoClass([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node)`

**Returns:** `void`

### `updatePseudoClassBelow([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node, `int` depth)`

**Returns:** `void`

### `updatePseudoClassAbove([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node, `int` count)`

**Returns:** `void`

### `authorNodeNameChanged([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node)`

**Returns:** `void`

### `authorNodeStructureChanged([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node)`

**Returns:** `void`

### `documentChanged([`ro.sync.ecss.extensions.api.node.AuthorDocument`](../../api/node/AuthorDocument.md) oldDocument, [`ro.sync.ecss.extensions.api.node.AuthorDocument`](../../api/node/AuthorDocument.md) newDocument)`

**Returns:** `void`

### `contentDeleted([`ro.sync.ecss.extensions.api.DocumentContentDeletedEvent`](../../api/DocumentContentDeletedEvent.md) e)`

**Returns:** `void`

### `contentInserted([`ro.sync.ecss.extensions.api.DocumentContentInsertedEvent`](../../api/DocumentContentInsertedEvent.md) e)`

**Returns:** `void`

### `doctypeChanged()`

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

### `activated([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** `void`

### `deactivated([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** `void`

### `documentAboutToBeLoaded([`ro.sync.ecss.extensions.api.node.AuthorDocument`](../../api/node/AuthorDocument.md) document, [`ro.sync.ecss.extensions.api.AuthorPseudoClassController`](../../api/AuthorPseudoClassController.md) pseudoClassController)`

**Returns:** `void`

### `updatePseudoClassDirectlyBelow([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node, [`ro.sync.ecss.extensions.api.AuthorPseudoClassController`](../../api/AuthorPseudoClassController.md) pseudoClassController)`

**Returns:** `void`

