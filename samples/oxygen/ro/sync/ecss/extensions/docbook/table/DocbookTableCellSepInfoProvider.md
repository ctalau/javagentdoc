# Class: `DocbookTableCellSepInfoProvider`

**Package:** [`ro.sync.ecss.extensions.docbook.table`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.docbook.table.DocbookTableCellSepInfoProvider`

**Extends:** [`ro.sync.ecss.extensions.commons.table.support.CALSTableCellInfoProvider`](../../commons/table/support/CALSTableCellInfoProvider.md)

## Description

The same as a CALS one, but also knows about the simple table.

## Constructors

### `<init>()`

## Methods

### `getColSep(ro.sync.ecss.extensions.api.node.AuthorElement cellElement, int columnIndex)`

Always return `true` for them.

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))
- `columnIndex` (`int`)

**Returns:** `boolean`

### `getRowSep(ro.sync.ecss.extensions.api.node.AuthorElement cellElement, int columnIndex)`

Always return `true` for them.

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md))
- `columnIndex` (`int`)

**Returns:** `boolean`

