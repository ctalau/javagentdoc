# Class: `TableInfo`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.TableInfo`

**Implements:** `java.io.Serializable`

## Description

## Fields

### `serialVersionUID`

**Type:** `long`

### `title`

**Type:** `java.lang.String`

### `rowsNumber`

**Type:** `int`

### `columnsNumber`

**Type:** `int`

### `generateHeader`

**Type:** `boolean`

### `generateFooter`

**Type:** `boolean`

### `frame`

**Type:** `java.lang.String`

### `rowsep`

**Type:** `java.lang.String`

### `colsep`

**Type:** `java.lang.String`

### `align`

**Type:** `java.lang.String`

### `tableModel`

**Type:** `int`

One of the constants: 
 TableInfo#TABLE_MODEL_CALS, TableInfo#TABLE_MODEL_CUSTOM,
 TableInfo#TABLE_MODEL_DITA_SIMPLE, TableInfo#TABLE_MODEL_HTML.

### `TABLE_MODEL_NONE`

**Type:** `int`

### `TABLE_MODEL_HTML`

**Type:** `int`

### `TABLE_MODEL_CALS`

**Type:** `int`

### `TABLE_MODEL_CUSTOM`

**Type:** `int`

### `TABLE_MODEL_DITA_SIMPLE`

**Type:** `int`

### `TABLE_MODEL_DITA_CHOICE`

**Type:** `int`

### `TABLE_MODEL_DITA_PROPERTIES`

**Type:** `int`

### `columnsWidthsType`

**Type:** `ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants.ColumnWidthsType`

### `MIN_ROWS_COUNT`

**Type:** `int`

### `DEFAULT_ROWS_COUNT`

**Type:** `int`

### `DEFAULT_COLUMNS_COUNT_CHOICE_TABLE`

**Type:** `int`

### `DEFAULT_COLUMNS_COUNT`

**Type:** `int`

### `DEFAULT_COLUMNS_COUNT_PROPERTIES_TABLE`

**Type:** `int`

### `MIN_COLUMNS_COUNT`

**Type:** `int`

### `MIN_COLUMNS_COUNT_PROPERTIES_TABLE`

**Type:** `int`

### `MAX_COLUMNS_COUNT`

**Type:** `int`

### `MAX_COLUMNS_COUNT_PROPERTIES_TABLE`

**Type:** `int`

## Constructors

### `<init>(java.lang.String title, int rowsNumber, int columnsNumber, boolean generateHeader, boolean generateFooter, java.lang.String frame, int tableModel)`

**Parameters:**
- `title` (`java.lang.String`): The table title.
- `rowsNumber` (`int`): The number of rows.
- `columnsNumber` (`int`): The number of columns.
- `generateHeader` (`boolean`): If `true` generate table header.
- `generateFooter` (`boolean`): If `true` generate table footer.
- `frame` (`java.lang.String`): Specifies how the table is to be framed.
- `tableModel` (`int`): The table model type.
   One of the constants: 
   TableInfo#TABLE_MODEL_CALS, TableInfo#TABLE_MODEL_CUSTOM,
   TableInfo#TABLE_MODEL_DITA_SIMPLE, TableInfo#TABLE_MODEL_HTML,
   TableInfo#TABLE_MODEL_DITA_CHOICE, TableInfo#TABLE_MODEL_DITA_PROPERTIES.

### `<init>(java.lang.String title, int rowsNumber, int columnsNumber, boolean generateHeader, boolean generateFooter, java.lang.String frame, int tableModel, ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants.ColumnWidthsType columnsWidthsType, java.lang.String rowsep, java.lang.String colsep, java.lang.String align)`

**Parameters:**
- `title` (`java.lang.String`): The table title.
- `rowsNumber` (`int`): The number of rows.
- `columnsNumber` (`int`): The number of columns.
- `generateHeader` (`boolean`): If `true` generate table header.
- `generateFooter` (`boolean`): If `true` generate table footer.
- `frame` (`java.lang.String`): Specifies how the table is to be framed.
- `tableModel` (`int`): The table model type.
   One of the constants: 
   TableInfo#TABLE_MODEL_CALS, TableInfo#TABLE_MODEL_CUSTOM,
   TableInfo#TABLE_MODEL_DITA_SIMPLE, TableInfo#TABLE_MODEL_HTML,
   TableInfo#TABLE_MODEL_DITA_CHOICE, TableInfo#TABLE_MODEL_DITA_PROPERTIES.
- `columnsWidthsType` (`ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants.ColumnWidthsType`): The columns widths type.
- `rowsep` (`java.lang.String`): Specifies the row separator value.
- `colsep` (`java.lang.String`): Specifies the column separator value
- `align` (`java.lang.String`): Specifies the alignment for the current table.

### `<init>(java.util.Map<java.lang.String,java.lang.Object> fieldValues, int rows)`

**Parameters:**
- `fieldValues` (`java.util.Map<java.lang.String,java.lang.Object>`): The map that contains the values for the operation 
   fields.
- `rows` (`int`): If greater than 0, the enforced number of rows, used when the user converts 
   a list with that many items to a table. If 0 or negative, it is ignored.

### `<init>(java.util.Map<java.lang.String,java.lang.Object> fieldValues)`

**Parameters:**
- `fieldValues` (`java.util.Map<java.lang.String,java.lang.Object>`): The map that contains the values for the operation 
   fields.

## Methods

### `getTitle()`

**Returns:** `java.lang.String`

### `getRowsNumber()`

**Returns:** `int`

### `getColumnsNumber()`

**Returns:** `int`

### `isGenerateHeader()`

**Returns:** `boolean`

### `isGenerateFooter()`

**Returns:** `boolean`

### `getFrame()`

**Returns:** `java.lang.String`

### `getRowsep()`

**Returns:** `java.lang.String`

### `getColsep()`

**Returns:** `java.lang.String`

### `getAlign()`

**Returns:** `java.lang.String`

### `getTableModel()`

**Returns:** `int`

### `getColumnsWidthsType()`

**Returns:** `ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants.ColumnWidthsType`

### `toString()`

**Returns:** `java.lang.String`

