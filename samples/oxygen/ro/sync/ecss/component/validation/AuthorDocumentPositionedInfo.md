# Class: `AuthorDocumentPositionedInfo`

**Package:** [`ro.sync.ecss.component.validation`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.component.validation.AuthorDocumentPositionedInfo`

**Extends:** [`ro.sync.document.DocumentPositionedInfo`](../../../document/DocumentPositionedInfo.md)

**Implements:** [`ro.sync.ecss.component.validation.IAuthorDocumentPositionedInfo`](./IAuthorDocumentPositionedInfo.md)

## Description

This extension allows you to specify either the problem AuthorNode or an offset/length interval in the Author content.

## Fields

### `node`

**Type:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md)

Can be null

### `selectEntireNode`

**Type:** `boolean`

## Constructors

### `<init>(ro.sync.document.DocumentPositionedInfo dpi, ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `dpi` ([`ro.sync.document.DocumentPositionedInfo`](../../../document/DocumentPositionedInfo.md)): The document positioned info to copy.
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md)): The author node. The node base URL will be used as a system ID location.

### `<init>(int severity, java.lang.String message, ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `severity` (`int`): Severity. One of the severity constants from class DocumentPositionedInfo: 
   SEVERITY_ERROR, SEVERITY_FATAL, SEVERITY_INFO , SEVERITY_WARN.
- `message` (`java.lang.String`): Error message.
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md)): The author node. The node base URL will be used as a system ID location.

### `<init>(int severity, java.lang.String message, java.lang.String systemID, ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `severity` (`int`): Severity. One of the severity constants from class DocumentPositionedInfo: 
   SEVERITY_ERROR, SEVERITY_FATAL, SEVERITY_INFO , SEVERITY_WARN.
- `message` (`java.lang.String`): Error message.
- `systemID` (`java.lang.String`): System ID
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md)): The author node.

### `<init>(int severity, java.lang.String message, java.lang.String systemID, int startOffset, int length)`

**Parameters:**
- `severity` (`int`): Severity. One of the severity constants from class DocumentPositionedInfo: 
   SEVERITY_ERROR, SEVERITY_FATAL, SEVERITY_INFO , SEVERITY_WARN.
- `message` (`java.lang.String`): Error message.
- `systemID` (`java.lang.String`): System ID
- `startOffset` (`int`): The start offset of the problem, mapped in the Author content.
- `length` (`int`): The length of the problem, mapped in the Author content.

## Methods

### `getSystemID(java.lang.String systemID, ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `systemID` (`java.lang.String`): The proposed system ID, can be `null`
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md)): The current node, can be `null`

**Returns:** `java.lang.String`

### `getNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md)

### `setSelectEntireNode(boolean selectEntireNode)`

**Parameters:**
- `selectEntireNode` (`boolean`): `true` if the entire node should be selected.

**Returns:** `void`

### `isSelectEntireNode()`

**Returns:** `boolean`

