# Class: `SADITARelTableCustomizerDialog`

**Package:** [`ro.sync.ecss.extensions.dita.map.table`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.map.table.SADITARelTableCustomizerDialog`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.SATableCustomizerDialog`](../../../commons/table/operations/SATableCustomizerDialog.md)

## Description

It is used on standalone implementation.

## Constructors

### `<init>(java.awt.Frame parentFrame, ro.sync.ecss.extensions.api.AuthorResourceBundle authorResourceBundle, int predefinedRowsCount, int predefinedColumnsCount)`

**Parameters:**
- `parentFrame` (`java.awt.Frame`): The parent JFrame.
- `authorResourceBundle` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md)): The author resource bundle.
- `predefinedRowsCount` (`int`): The predefined number of rows.
- `predefinedColumnsCount` (`int`): The predefined number of columns.

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

### `getHelpPageID()`

**Returns:** `java.lang.String`

