# Class: `SAXHTMLTableCustomizerDialog`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations.xhtml`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.xhtml.SAXHTMLTableCustomizerDialog`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.SATableCustomizerDialog`](../SATableCustomizerDialog.md)

## Description

It is used on standalone implementation.

## Constructors

### `<init>(java.awt.Frame parentFrame, ro.sync.ecss.extensions.api.AuthorResourceBundle authorResourceBundle, int predefinedRowsCount, int predefinedColumnsCount)`

**Parameters:**
- `parentFrame` (`java.awt.Frame`): The parent frame.
- `authorResourceBundle` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../../api/AuthorResourceBundle.md)): The author resource bundle.
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

### `main(java.lang.String[] args)`

**Parameters:**
- `args` (`java.lang.String[]`): Not used.

**Returns:** `void`

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

