# Class: `DeleteColumnOperation`

**Package:** [`ro.sync.ecss.extensions.dita.topic.table.simpletable`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.topic.table.simpletable.DeleteColumnOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.DeleteColumnOperationBase`](../../../../commons/table/operations/DeleteColumnOperationBase.md)

**Implements:** [`ro.sync.ecss.extensions.dita.topic.table.simpletable.SimpleTableConstants`](./SimpleTableConstants.md)

## Description

## Constructors

### `<init>()`

## Methods

### `updateTableColSpan(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider spanProvider, ro.sync.ecss.extensions.api.node.AuthorElement cell, int colStartIndex, int colEndIndex)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `spanProvider` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md))
- `cell` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))
- `colStartIndex` (`int`)
- `colEndIndex` (`int`)

**Returns:** `void`

### `updateAppliableColWidthsNumber(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement tableElem, int deletedColumnIndex)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `tableElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))
- `deletedColumnIndex` (`int`)

**Returns:** `void`

### `canDeleteColumn()`

**Returns:** `boolean`

