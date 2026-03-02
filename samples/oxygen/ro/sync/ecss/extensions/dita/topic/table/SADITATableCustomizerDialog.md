# Class: `SADITATableCustomizerDialog`

**Package:** [`ro.sync.ecss.extensions.dita.topic.table`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.topic.table.SADITATableCustomizerDialog`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.SATableCustomizerDialog`](../../../commons/table/operations/SATableCustomizerDialog.md)

## Description

It is used on standalone implementation.

## Fields

### `DITA_CONREF`

**Type:** `java.lang.String`

### `TABLE_FRAME_VALUES`

**Type:** `java.lang.String[]`

### `ALIGN_VALUES`

**Type:** `java.lang.String[]`

## Constructors

### `<init>(java.awt.Frame parentFrame, ro.sync.ecss.extensions.api.AuthorResourceBundle authorResourceBundle, int predefinedRowsCount, int predefinedColumnsCount, boolean insertChoiceTable)`

**Parameters:**
- `parentFrame` (`java.awt.Frame`): The parent frame.
- `authorResourceBundle` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md)): The author resource bundle.
- `predefinedRowsCount` (`int`): The predefined number of rows.
- `predefinedColumnsCount` (`int`): The predefined number of columns.
- `insertChoiceTable` (`boolean`): `true` to show dialog for a DITA choice table.

### `<init>(java.awt.Frame parentFrame, ro.sync.ecss.extensions.api.AuthorResourceBundle authorResourceBundle, int predefinedRowsCount, int predefinedColumnsCount, boolean insertChoiceTable, int defaultTableModel)`

**Parameters:**
- `parentFrame` (`java.awt.Frame`): The parent frame.
- `authorResourceBundle` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md)): The author resource bundle.
- `predefinedRowsCount` (`int`): The predefined number of rows.
- `predefinedColumnsCount` (`int`): The predefined number of columns.
- `insertChoiceTable` (`boolean`): `true` to show dialog for a DITA choice table.
- `defaultTableModel` (`int`): The default model of the table that will be inserted.

### `<init>(java.awt.Frame parentFrame, ro.sync.ecss.extensions.api.AuthorResourceBundle authorResourceBundle, int predefinedRowsCount, int predefinedColumnsCount, boolean insertChoiceTable, boolean isPropertiesTableAccepted, int defaultTableModel)`

**Parameters:**
- `parentFrame` (`java.awt.Frame`): The parent frame.
- `authorResourceBundle` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md)): The author resource bundle.
- `predefinedRowsCount` (`int`): The predefined number of rows.
- `predefinedColumnsCount` (`int`): The predefined number of columns.
- `insertChoiceTable` (`boolean`): `true` to show dialog for a DITA choice table.
- `isPropertiesTableAccepted` (`boolean`): `true` if a properties table is accepted by the schema
          (i.e. if it is a global element).
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

### `getHelpPageID()`

**Returns:** `java.lang.String`

