# Class: `SATableCustomizerDialog`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.SATableCustomizerDialog`

**Extends:** [`ro.sync.ecss.extensions.commons.ui.OKCancelDialog`](../../ui/OKCancelDialog.md)

**Implements:** [`ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants`](./TableCustomizerConstants.md)

## Description

It is used on standalone implementation.

## Fields

### `DEFAULT_NO_OF_COLS_FOR_PROPERTIES_TABLE`

**Type:** `int`

### `titleCheckbox`

**Type:** `javax.swing.JCheckBox`

### `titleTextField`

**Type:** `javax.swing.JTextField`

### `rowsSpinner`

**Type:** `javax.swing.JSpinner`

### `columnsSpinner`

**Type:** `javax.swing.JSpinner`

### `colWidthsCombobox`

**Type:** `javax.swing.JComboBox`

The column widths values can be fixed or proportional.

### `headerCheckbox`

**Type:** `javax.swing.JCheckBox`

### `footerCheckbox`

**Type:** `javax.swing.JCheckBox`

### `frameCombo`

**Type:** `javax.swing.JComboBox`

### `rowsepCombo`

**Type:** `javax.swing.JComboBox`

### `colsepCombo`

**Type:** `javax.swing.JComboBox`

### `alignCombo`

**Type:** `javax.swing.JComboBox`

### `hasFooter`

**Type:** `boolean`

### `hasFrameAttribute`

**Type:** `boolean`

### `hasRowsepAttribute`

**Type:** `boolean`

### `hasColsepAttribute`

**Type:** `boolean`

### `hasAlignAttribute`

**Type:** `boolean`

### `showModelChooser`

**Type:** `boolean`

The table model can be CALS or HTML.

### `calsModelRadio`

**Type:** `javax.swing.JRadioButton`

### `simpleOrHtmlModelRadio`

**Type:** `javax.swing.JRadioButton`

### `propertiesModelRadio`

**Type:** `javax.swing.JRadioButton`

### `authorResourceBundle`

**Type:** [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md)

### `predefinedColumnsCount`

**Type:** `int`

### `predefinedRowsCount`

**Type:** `int`

### `choiceTableModel`

**Type:** `boolean`

### `isCalsTable`

**Type:** `boolean`

### `isSimpleTableNotHtml`

**Type:** `boolean`

### `isPropertiesTable`

**Type:** `boolean`

### `propertiesTableColSpinnerModel`

**Type:** `javax.swing.SpinnerModel`

### `defaultColSpinnerModel`

**Type:** `javax.swing.SpinnerModel`

### `isSimpleOrHtmlTable`

**Type:** `boolean`

## Constructors

### `<init>(java.awt.Frame parentFrame, boolean hasFooter, boolean hasFrameAttribute, boolean showModelChooser, ro.sync.ecss.extensions.api.AuthorResourceBundle authorResourceBundle, int predefinedRowsCount, int predefinedColumnsCount)`

**Parameters:**
- `parentFrame` (`java.awt.Frame`): The parent JFrame of the dialog.
- `hasFooter` (`boolean`): `true` if this table has a footer.
- `hasFrameAttribute` (`boolean`): `true` if this table has a frame attribute.
- `showModelChooser` (`boolean`): `true` to show the dialog panel for choosing the table
                                model, one of CALS or HTML.
- `authorResourceBundle` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md)): Author resource bundle.
- `predefinedRowsCount` (`int`): The predefined number of rows.
- `predefinedColumnsCount` (`int`): The predefined number of columns.

### `<init>(java.awt.Frame parentFrame, boolean hasFooter, boolean hasFrameAttribute, boolean showModelChooser, boolean showSimpleModel, boolean innerCallsTable, boolean hasRowsepAttribute, boolean hasColsepAttribute, boolean hasAlignAttribute, ro.sync.ecss.extensions.api.AuthorResourceBundle authorResourceBundle, int predefinedRowsCount, int predefinedColumnsCount)`

**Parameters:**
- `parentFrame` (`java.awt.Frame`): The parent JFrame of the dialog.
- `hasFooter` (`boolean`): `true` if this table has a footer.
- `hasFrameAttribute` (`boolean`): `true` if the table has a frame attribute.
- `showModelChooser` (`boolean`): `true` to show the dialog panel for choosing the table
                                      model, one of CALS or HTML.
- `showSimpleModel` (`boolean`): `true` to use the simple table model radio button instead of the HTML model.
- `innerCallsTable` (`boolean`): `true` if this is an inner CALLS table.
- `hasRowsepAttribute` (`boolean`): `true` if the table has a row separator attribute.
                                      Flag used to add a corresponding combo box in the dialog.
- `hasColsepAttribute` (`boolean`): `true` if the table has a column separator attribute.
                                      Flag used to add a corresponding combo box in the dialog.
- `hasAlignAttribute` (`boolean`): `true` if the table has an align attribute.
                                      Flag used to add a corresponding combo box in the dialog.
- `authorResourceBundle` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md)): Author resource bundle.
- `predefinedRowsCount` (`int`): The predefined number of rows.
- `predefinedColumnsCount` (`int`): The predefined number of columns.

### `<init>(java.awt.Frame parentFrame, boolean hasFooter, boolean hasFrameAttribute, boolean showModelChooser, boolean showSimpleModel, boolean choiceTableModel, boolean innerCallsTable, boolean hasRowsepAttribute, boolean hasColsepAttribute, boolean hasAlignAttribute, ro.sync.ecss.extensions.api.AuthorResourceBundle authorResourceBundle, int predefinedRowsCount, int predefinedColumnsCount)`

**Parameters:**
- `parentFrame` (`java.awt.Frame`): The parent JFrame of the dialog.
- `hasFooter` (`boolean`): `true` if this table has a footer.
- `hasFrameAttribute` (`boolean`): `true` if the table has a frame attribute.
- `showModelChooser` (`boolean`): `true` to show the dialog panel for choosing the table
                                      model, one of CALS or HTML.
- `showSimpleModel` (`boolean`): `true` to use the simple table model radio button instead of the HTML model.
- `choiceTableModel` (`boolean`): `true` to use the choice table model.
- `innerCallsTable` (`boolean`): `true` if this is an inner CALLS table.
- `hasRowsepAttribute` (`boolean`): `true` if the table has a row separator attribute.
                                      Flag used to add a corresponding combo box in the dialog.
- `hasColsepAttribute` (`boolean`): `true` if the table has a column separator attribute.
                                      Flag used to add a corresponding combo box in the dialog.
- `hasAlignAttribute` (`boolean`): `true` if the table has an align attribute.
                                      Flag used to add a corresponding combo box in the dialog.
- `authorResourceBundle` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md)): Author resource bundle.
- `predefinedRowsCount` (`int`): The predefined number of rows.
- `predefinedColumnsCount` (`int`): The predefined number of columns.

### `<init>(java.awt.Frame parentFrame, boolean hasFooter, boolean hasFrameAttribute, boolean showModelChooser, boolean showSimpleModel, boolean choiceTableModel, boolean isCalsTable, boolean innerCallsTable, boolean hasRowsepAttribute, boolean hasColsepAttribute, boolean hasAlignAttribute, ro.sync.ecss.extensions.api.AuthorResourceBundle authorResourceBundle, int predefinedRowsCount, int predefinedColumnsCount)`

**Parameters:**
- `parentFrame` (`java.awt.Frame`): The parent JFrame of the dialog.
- `hasFooter` (`boolean`): `true` if this table has a footer.
- `hasFrameAttribute` (`boolean`): `true` if the table has a frame attribute.
- `showModelChooser` (`boolean`): `true` to show the dialog panel for choosing the table
                                      model, one of CALS or HTML.
- `showSimpleModel` (`boolean`): `true` to use the simple table model radio button instead of the HTML model.
- `choiceTableModel` (`boolean`): `true` to show the dialog for choice table.
- `isCalsTable` (`boolean`): `true` if the table model is CALS.
- `innerCallsTable` (`boolean`): `true` if this is an inner CALLS table.
- `hasRowsepAttribute` (`boolean`): `true` if the table has a row separator attribute.
                                      Flag used to add a corresponding combo box in the dialog.
- `hasColsepAttribute` (`boolean`): `true` if the table has a column separator attribute.
                                      Flag used to add a corresponding combo box in the dialog.
- `hasAlignAttribute` (`boolean`): `true` if the table has an align attribute.
                                      Flag used to add a corresponding combo box in the dialog.
- `authorResourceBundle` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md)): Author resource bundle.
- `predefinedRowsCount` (`int`): The predefined number of rows.
- `predefinedColumnsCount` (`int`): The predefined number of columns.

### `<init>(java.awt.Frame parentFrame, boolean hasFooter, boolean hasFrameAttribute, boolean showModelChooser, boolean showSimpleModel, boolean choiceTableModel, boolean isCalsTable, boolean isSimpleOrHtmlTable, boolean isPropertiesTableAccepted, boolean isPropertiesTable, boolean innerCallsTable, boolean hasRowsepAttribute, boolean hasColsepAttribute, boolean hasAlignAttribute, ro.sync.ecss.extensions.api.AuthorResourceBundle authorResourceBundle, int predefinedRowsCount, int predefinedColumnsCount)`

**Parameters:**
- `parentFrame` (`java.awt.Frame`): The parent JFrame of the dialog.
- `hasFooter` (`boolean`): `true` if this table has a footer.
- `hasFrameAttribute` (`boolean`): `true` if the table has a frame attribute.
- `showModelChooser` (`boolean`): `true` to show the dialog panel for choosing the table
                                        model, one of CALS or HTML.
- `showSimpleModel` (`boolean`): `true` to use the simple table model radio instead of the HTML model.
- `choiceTableModel` (`boolean`): `true` to show the dialog for choice table.
- `isCalsTable` (`boolean`): `true` if the table model is CALS.
- `isSimpleOrHtmlTable` (`boolean`): `true` if the model is for simple or HTML table, not CALS or properties.
- `isPropertiesTableAccepted` (`boolean`): `true` of a properties table is accepted.
- `isPropertiesTable` (`boolean`): `true` if the current table has a properties table model.
- `innerCallsTable` (`boolean`): `true` if this is an inner CALLS table.
- `hasRowsepAttribute` (`boolean`): `true` if the table has a row separator attribute.
                                        Flag used to add a corresponding combo box in the dialog.
- `hasColsepAttribute` (`boolean`): `true` if the table has a column separator attribute.
                                        Flag used to add a corresponding combo box in the dialog.
- `hasAlignAttribute` (`boolean`): `true` if the table has an align attribute. 
                                        Flag used to add a corresponding combo box in the dialog.
- `authorResourceBundle` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md)): Author resource bundle.
- `predefinedRowsCount` (`int`): The predefined number of rows.
- `predefinedColumnsCount` (`int`): The predefined number of columns.

## Methods

### `updateColumnsWidthsCombo(ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants.ColumnWidthsType[] columnsWidthsSpecifications)`

**Parameters:**
- `columnsWidthsSpecifications` (`ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants.ColumnWidthsType[]`): The column widths specifications.

**Returns:** `void`

### `updateTitleState(boolean enabled)`

**Parameters:**
- `enabled` (`boolean`): `true` if the title is enabled.

**Returns:** `void`

### `updateElementsState(boolean enabled)`

**Parameters:**
- `enabled` (`boolean`): `true` if the combos will be enabled.

**Returns:** `void`

### `updateAlignState(boolean enabled)`

**Parameters:**
- `enabled` (`boolean`): `true` if the align combo is enabled.

**Returns:** `void`

### `getFrameValues(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`): The table model type. 
   One of the constants: 
   TableInfo#TABLE_MODEL_CALS, TableInfo#TABLE_MODEL_CUSTOM,
   TableInfo#TABLE_MODEL_DITA_SIMPLE, TableInfo#TABLE_MODEL_HTML.

**Returns:** `java.lang.String[]`

### `getDefaultFrameValue(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`): The table model type.
   One of the constants: 
   TableInfo#TABLE_MODEL_CALS, TableInfo#TABLE_MODEL_CUSTOM,
   TableInfo#TABLE_MODEL_DITA_SIMPLE, TableInfo#TABLE_MODEL_HTML.

**Returns:** `java.lang.String`

### `getRowsepValues(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`): The table model type.
   One of the constants: 
   TableInfo#TABLE_MODEL_CALS, TableInfo#TABLE_MODEL_CUSTOM,
   TableInfo#TABLE_MODEL_DITA_SIMPLE, TableInfo#TABLE_MODEL_HTML.

**Returns:** `java.lang.String[]`

### `getDefaultRowsepValue(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`): The table model type.
   One of the constants: 
   TableInfo#TABLE_MODEL_CALS, TableInfo#TABLE_MODEL_CUSTOM,
   TableInfo#TABLE_MODEL_DITA_SIMPLE, TableInfo#TABLE_MODEL_HTML.

**Returns:** `java.lang.String`

### `getColsepValues(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`): The table model type.
   One of the constants: 
   TableInfo#TABLE_MODEL_CALS, TableInfo#TABLE_MODEL_CUSTOM,
   TableInfo#TABLE_MODEL_DITA_SIMPLE, TableInfo#TABLE_MODEL_HTML.

**Returns:** `java.lang.String[]`

### `getAlignValues(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`): The table model type.
   One of the constants: 
   TableInfo#TABLE_MODEL_CALS, TableInfo#TABLE_MODEL_CUSTOM,
   TableInfo#TABLE_MODEL_DITA_SIMPLE, TableInfo#TABLE_MODEL_HTML.

**Returns:** `java.lang.String[]`

### `getDefaultColsepValue(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`): The table model type.
   One of the constants: 
   TableInfo#TABLE_MODEL_CALS, TableInfo#TABLE_MODEL_CUSTOM,
   TableInfo#TABLE_MODEL_DITA_SIMPLE, TableInfo#TABLE_MODEL_HTML.

**Returns:** `java.lang.String`

### `getDefaultAlignValue(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`): The table model type.
   One of the constants: 
   TableInfo#TABLE_MODEL_CALS, TableInfo#TABLE_MODEL_CUSTOM,
   TableInfo#TABLE_MODEL_DITA_SIMPLE, TableInfo#TABLE_MODEL_HTML.

**Returns:** `java.lang.String`

### `getColumnWidthsSpecifications(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`): The table model type.
   One of the constants: 
   TableInfo#TABLE_MODEL_CALS, TableInfo#TABLE_MODEL_CUSTOM,
   TableInfo#TABLE_MODEL_DITA_SIMPLE, TableInfo#TABLE_MODEL_HTML.

**Returns:** `ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants.ColumnWidthsType[]`

### `createTitleCheckbox()`

**Returns:** `javax.swing.JCheckBox`

### `addValuesToFrameCombo(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`): The table model type.

**Returns:** `void`

### `addValuesToRowsepCombo(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`): The table model type.

**Returns:** `void`

### `addValuesToColsepCombo(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`): The table model type.

**Returns:** `void`

### `addValuesToAlignCombo(int tableModelType)`

**Parameters:**
- `tableModelType` (`int`): The table model type.

**Returns:** `void`

### `showDialog(ro.sync.ecss.extensions.commons.table.operations.TableInfo previousTableInfo)`

**Parameters:**
- `previousTableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)): Table info to be used for initializing the controls.

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)

### `getTableModelType()`

**Returns:** `int`

### `initialize(ro.sync.ecss.extensions.commons.table.operations.TableInfo previousTableInfo)`

**Parameters:**
- `previousTableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)): If `null` defaults will be used. Otherwise, the controls
   will be initialized with values from this info.

**Returns:** `void`

### `getPropertiesModelRadio()`

**Returns:** `javax.swing.JRadioButton`

### `getColumnsSpinner()`

**Returns:** `javax.swing.JSpinner`

### `getHeaderCheckbox()`

**Returns:** `javax.swing.JCheckBox`

### `getColWidthsCombobox()`

**Returns:** `javax.swing.JComboBox`

### `getFrameCombo()`

**Returns:** `javax.swing.JComboBox`

### `getColsepCombo()`

**Returns:** `javax.swing.JComboBox`

### `getRowsepCombo()`

**Returns:** `javax.swing.JComboBox`

### `getAlignCombo()`

**Returns:** `javax.swing.JComboBox`

### `getTitleCheckbox()`

**Returns:** `javax.swing.JCheckBox`

### `getTitleTextField()`

**Returns:** `javax.swing.JTextField`

### `getRowsSpinner()`

**Returns:** `javax.swing.JSpinner`

### `getCalsModelRadio()`

**Returns:** `javax.swing.JRadioButton`

### `getSimpleOrHtmlModelRadio()`

**Returns:** `javax.swing.JRadioButton`

### `getFooterCheckbox()`

**Returns:** `javax.swing.JCheckBox`

