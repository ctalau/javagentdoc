# Class: `TableCustomizer`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.TableCustomizer`

## Description

It is used on standalone implementation.

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `TABLE_CUSTOMIZER_OPTIONS_KEY`

**Type:** `java.lang.String`

### `tableInfo`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)

Session level persistence.

## Constructors

### `<init>()`

## Methods

### `customizeTable(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

A table customizer dialog is shown, giving the possibility to choose the 
 properties of a new table to be inserted in the document. An object containing 
 the new table information is returned.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Access to Author operations.

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)

### `customizeTable(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int predefinedRowsCount, int predefinedColumnsCount)`

A table customizer dialog is shown, giving the possibility to choose the 
 properties of a new table to be inserted in the document. An object containing 
 the new table information is returned.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Access to Author operations.
- `predefinedRowsCount` (`int`): The predefined number of rows, `-1` 
   if the user can control the number of inserted column.
- `predefinedColumnsCount` (`int`): The predefined number of columns, `-1` 
   if the user can control the number of inserted column.
   If predefined columns count and predefined rows count values are positive 
   then the dialog will not contain any field for defining the table columns
   and rows count and the inserted table will use the predefined values.

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)

### `showCustomizeTableDialog(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int predefinedRowsCount, int predefinedColumnsCount, int defaultTableModel)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The Author access.
- `predefinedRowsCount` (`int`): Predefined number of rows.
- `predefinedColumnsCount` (`int`): Predefined number of columns.
- `defaultTableModel` (`int`): The default model of the table that will be inserted.

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)

### `customizeTable(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int predefinedRowsCount, int predefinedColumnsCount, int defaultTableModel)`

A table customizer dialog is shown, giving the possibility to choose the 
 properties of a new table to be inserted in the document. An object containing 
 the new table information is returned.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Access to Author operations.
- `predefinedRowsCount` (`int`): The predefined number of rows, `-1` 
   if the user can control the number of inserted column.
- `predefinedColumnsCount` (`int`): The predefined number of columns, `-1` 
   if the user can control the number of inserted column.
   If predefined columns count and predefined rows count values are positive 
   then the dialog will not contain any field for defining the table columns
   and rows count and the inserted table will use the predefined values.
- `defaultTableModel` (`int`): The default model of the table that will be inserted.

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)

### `getTableInfoObject(java.lang.String tableCustomizerOptions)`

**Parameters:**
- `tableCustomizerOptions` (`java.lang.String`): the options serialization to be deserialized.

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)

### `serializeTableCustomizerOptions()`

**Returns:** `java.lang.String`

