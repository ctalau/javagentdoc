# Class: `SADocbookTableCustomizerDialog`

**Package:** [`ro.sync.ecss.extensions.docbook.table`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.docbook.table.SADocbookTableCustomizerDialog`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.SATableCustomizerDialog`](../../commons/table/operations/SATableCustomizerDialog.md)

## Description

It is used on standalone implementation.

## Constructors

### `<init>(Frame parentFrame, boolean innerTable, AuthorResourceBundle authorResourceBundle, int predefinedRowsCount, int predefinedColumnsCount, int defaultTableModel)`

**Parameters:**
- `parentFrame` (`java.awt.Frame`): The parent frame.
- `innerTable` (`boolean`): If `true` then we are inserting an inner table.
- `authorResourceBundle` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../api/AuthorResourceBundle.md)): The author resource bundle.
- `predefinedRowsCount` (`int`): The predefined number of rows.
- `predefinedColumnsCount` (`int`): The predefined number of columns.
- `defaultTableModel` (`int`): The default model of the table that will be inserted.

## Methods

### `getColumnWidthsSpecifications(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`)

**Returns:** `ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants.ColumnWidthsType[]`

### `getFrameValues(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`)

**Returns:** `java.lang.String[]`

### `createTitleCheckbox()`

**Returns:** `javax.swing.JCheckBox`

### `getDefaultFrameValue(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`)

**Returns:** `java.lang.String`

### `getRowsepValues(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`)

**Returns:** `java.lang.String[]`

### `getDefaultRowsepValue(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`)

**Returns:** `java.lang.String`

### `getColsepValues(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`)

**Returns:** `java.lang.String[]`

### `getDefaultColsepValue(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`)

**Returns:** `java.lang.String`

### `getAlignValues(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`)

**Returns:** `java.lang.String[]`

### `getDefaultAlignValue(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`)

**Returns:** `java.lang.String`

### `getCALSAlignValues()`

**Returns:** `java.lang.String[]`

### `getHelpPageID()`

**Returns:** `java.lang.String`

