# Class: `TableColumnInsertionCustomizer`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.TableColumnInsertionCustomizer`

## Description

Shows the dialog used for customization and gets the new information.

## Fields

### `tableColumnsInfo`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.TableColumnsInfo`](./TableColumnsInfo.md)

Session level persistence.

## Constructors

### `<init>()`

## Methods

### `customizeTableColumnInsertion(AuthorAccess authorAccess)`

A table column insertion customizer dialog is shown, giving the possibility to choose the 
 properties of the new column(s) to be inserted in the document. An object containing 
 the new information is returned.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Access to Author operations.

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.TableColumnsInfo`](./TableColumnsInfo.md)

### `showCustomTableColumnInsertionDialog(AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The Author access.

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.TableColumnsInfo`](./TableColumnsInfo.md)

