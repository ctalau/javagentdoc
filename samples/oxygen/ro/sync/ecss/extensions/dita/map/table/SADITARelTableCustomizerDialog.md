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

### `getHelpPageID()`

**Returns:** `java.lang.String`

