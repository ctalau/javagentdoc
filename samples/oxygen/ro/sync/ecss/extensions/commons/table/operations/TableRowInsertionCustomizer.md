# Class: `TableRowInsertionCustomizer`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.TableRowInsertionCustomizer`

## Description

Shows the dialog used for customization and gets the new information.

## Fields

### `tableRowsInfo`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.TableRowsInfo`](./TableRowsInfo.md)

Session level persistence.

## Constructors

### `<init>()`

## Methods

### `customizeTableRowInsertion(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

A table row insertion customizer dialog is shown, giving the possibility to choose the 
 properties of the new row(s) to be inserted in the document. An object containing 
 the new information is returned.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Access to Author operations.

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.TableRowsInfo`](./TableRowsInfo.md)

### `showCustomTableRowInsertionDialog(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The Author access.

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.TableRowsInfo`](./TableRowsInfo.md)

