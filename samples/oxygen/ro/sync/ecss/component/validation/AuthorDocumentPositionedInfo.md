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

### `<init>([`ro.sync.document.DocumentPositionedInfo`](../../../document/DocumentPositionedInfo.md) dpi, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md) node)`

### `<init>(`int` severity, `java.lang.String` message, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md) node)`

### `<init>(`int` severity, `java.lang.String` message, `java.lang.String` systemID, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md) node)`

### `<init>(`int` severity, `java.lang.String` message, `java.lang.String` systemID, `int` startOffset, `int` length)`

## Methods

### `getSystemID(`java.lang.String` systemID, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md) node)`

**Returns:** `java.lang.String`

### `getNode()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../extensions/api/node/AuthorNode.md)

### `setSelectEntireNode(`boolean` selectEntireNode)`

**Returns:** `void`

### `isSelectEntireNode()`

**Returns:** `boolean`

