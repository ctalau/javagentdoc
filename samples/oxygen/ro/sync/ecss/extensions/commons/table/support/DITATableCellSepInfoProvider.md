# Class: `DITATableCellSepInfoProvider`

**Package:** [`ro.sync.ecss.extensions.commons.table.support`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.support.DITATableCellSepInfoProvider`

**Extends:** [`ro.sync.ecss.extensions.commons.table.support.CALSTableCellInfoProvider`](./CALSTableCellInfoProvider.md)

## Description

The same as a CALS one, but also knows about the simple table.

## Constructors

### `<init>()`

## Methods

### `getColSep(ro.sync.ecss.extensions.api.node.AuthorElement cellElement, int columnIndex)`

Always return `true` for them.

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `columnIndex` (`int`)

**Returns:** `boolean`

### `getRowSep(ro.sync.ecss.extensions.api.node.AuthorElement cellElement, int columnIndex)`

Always return `true` for them.

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `columnIndex` (`int`)

**Returns:** `boolean`

### `containsClass(ro.sync.ecss.extensions.api.node.AuthorElement element, java.lang.String substring)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The element
- `substring` (`java.lang.String`): The substring to search for.

**Returns:** `boolean`

### `isTableElement(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isTgroupElement(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

