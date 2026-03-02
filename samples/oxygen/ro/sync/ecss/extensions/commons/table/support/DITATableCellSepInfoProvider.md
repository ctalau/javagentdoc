# Class: `DITATableCellSepInfoProvider`

**Package:** [`ro.sync.ecss.extensions.commons.table.support`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.support.DITATableCellSepInfoProvider`

**Extends:** [`ro.sync.ecss.extensions.commons.table.support.CALSTableCellInfoProvider`](./CALSTableCellInfoProvider.md)

## Description

The same as a CALS one, but also knows about the simple table.

## Constructors

### `<init>()`

## Methods

### `getColSep(AuthorElement cellElement, int columnIndex)`

Always return `true` for them.

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `columnIndex` (`int`)

**Returns:** `boolean`

### `getRowSep(AuthorElement cellElement, int columnIndex)`

Always return `true` for them.

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `columnIndex` (`int`)

**Returns:** `boolean`

### `containsClass(AuthorElement element, String substring)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The element
- `substring` (`java.lang.String`): The substring to search for.

**Returns:** `boolean`

### `isTableElement(AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isTgroupElement(AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

