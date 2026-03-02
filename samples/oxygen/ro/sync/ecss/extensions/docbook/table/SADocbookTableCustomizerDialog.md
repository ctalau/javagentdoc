# Class: `SADocbookTableCustomizerDialog`

**Package:** [`ro.sync.ecss.extensions.docbook.table`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.docbook.table.SADocbookTableCustomizerDialog`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.SATableCustomizerDialog`](../../commons/table/operations/SATableCustomizerDialog.md)

## Description

It is used on standalone implementation.

## Constructors

### `<init>(java.awt.Frame parentFrame, boolean innerTable, ro.sync.ecss.extensions.api.AuthorResourceBundle authorResourceBundle, int predefinedRowsCount, int predefinedColumnsCount, int defaultTableModel)`

**Parameters:**
- `parentFrame` (`java.awt.Frame`): The parent frame.
- `innerTable` (`boolean`): If `true` then we are inserting an inner table.
- `authorResourceBundle` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../api/AuthorResourceBundle.md)): The author resource bundle.
- `predefinedRowsCount` (`int`): The predefined number of rows.
- `predefinedColumnsCount` (`int`): The predefined number of columns.
- `defaultTableModel` (`int`): The default model of the table that will be inserted.

## Methods

### `getColumnWidthsSpecifications(int tableModelType)`

**Returns:** `ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants.ColumnWidthsType[]`

**Parameters:**
- `tableModelType` (`int`)

### `getFrameValues(int tableModelType)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `tableModelType` (`int`)

### `createTitleCheckbox()`

**Returns:** `javax.swing.JCheckBox`

### `getDefaultFrameValue(int tableModelType)`

**Returns:** `java.lang.String`

**Parameters:**
- `tableModelType` (`int`)

### `getRowsepValues(int tableModelType)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `tableModelType` (`int`)

### `getDefaultRowsepValue(int tableModelType)`

**Returns:** `java.lang.String`

**Parameters:**
- `tableModelType` (`int`)

### `getColsepValues(int tableModelType)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `tableModelType` (`int`)

### `getDefaultColsepValue(int tableModelType)`

**Returns:** `java.lang.String`

**Parameters:**
- `tableModelType` (`int`)

### `getAlignValues(int tableModelType)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `tableModelType` (`int`)

### `getDefaultAlignValue(int tableModelType)`

**Returns:** `java.lang.String`

**Parameters:**
- `tableModelType` (`int`)

### `getCALSAlignValues()`

**Returns:** `java.lang.String[]`

### `getHelpPageID()`

**Returns:** `java.lang.String`

