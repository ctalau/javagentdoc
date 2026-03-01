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

### `customizeTable([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)

A table customizer dialog is shown, giving the possibility to choose the 
 properties of a new table to be inserted in the document. An object containing 
 the new table information is returned.

### `customizeTable([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `int` predefinedRowsCount, `int` predefinedColumnsCount)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)

A table customizer dialog is shown, giving the possibility to choose the 
 properties of a new table to be inserted in the document. An object containing 
 the new table information is returned.

### `showCustomizeTableDialog([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `int` predefinedRowsCount, `int` predefinedColumnsCount, `int` defaultTableModel)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)

### `customizeTable([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `int` predefinedRowsCount, `int` predefinedColumnsCount, `int` defaultTableModel)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)

A table customizer dialog is shown, giving the possibility to choose the 
 properties of a new table to be inserted in the document. An object containing 
 the new table information is returned.

### `getTableInfoObject(`java.lang.String` tableCustomizerOptions)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)

### `serializeTableCustomizerOptions()`

**Returns:** `java.lang.String`

