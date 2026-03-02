# Class: `DeleteColumnOperation`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations.cals`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.cals.DeleteColumnOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.DeleteColumnOperationBase`](../DeleteColumnOperationBase.md)

**Implements:** [`ro.sync.ecss.extensions.commons.table.operations.cals.CALSConstants`](./CALSConstants.md)

## Description

## Constructors

### `<init>()`

### `<init>(AuthorTableHelper documentTypeHelper)`

**Parameters:**
- `documentTypeHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../AuthorTableHelper.md)): The document type helper.

## Methods

### `updateColspec(AuthorAccess authorAccess, Integer deletedColumnIndex)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `deletedColumnIndex` (`java.lang.Integer`)

**Returns:** `void`

### `updateTableColSpan(AuthorAccess authorAccess, AuthorTableCellSpanProvider spanProvider, AuthorElement cell, int colStartIndex, int colEndIndex)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `spanProvider` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md))
- `cell` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))
- `colStartIndex` (`int`)
- `colEndIndex` (`int`)

**Returns:** `void`

