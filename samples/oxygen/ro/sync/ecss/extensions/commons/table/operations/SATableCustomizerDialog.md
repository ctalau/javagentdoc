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

### `<init>(`java.awt.Frame` parentFrame, `boolean` hasFooter, `boolean` hasFrameAttribute, `boolean` showModelChooser, [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md) authorResourceBundle, `int` predefinedRowsCount, `int` predefinedColumnsCount)`

### `<init>(`java.awt.Frame` parentFrame, `boolean` hasFooter, `boolean` hasFrameAttribute, `boolean` showModelChooser, `boolean` showSimpleModel, `boolean` innerCallsTable, `boolean` hasRowsepAttribute, `boolean` hasColsepAttribute, `boolean` hasAlignAttribute, [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md) authorResourceBundle, `int` predefinedRowsCount, `int` predefinedColumnsCount)`

### `<init>(`java.awt.Frame` parentFrame, `boolean` hasFooter, `boolean` hasFrameAttribute, `boolean` showModelChooser, `boolean` showSimpleModel, `boolean` choiceTableModel, `boolean` innerCallsTable, `boolean` hasRowsepAttribute, `boolean` hasColsepAttribute, `boolean` hasAlignAttribute, [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md) authorResourceBundle, `int` predefinedRowsCount, `int` predefinedColumnsCount)`

### `<init>(`java.awt.Frame` parentFrame, `boolean` hasFooter, `boolean` hasFrameAttribute, `boolean` showModelChooser, `boolean` showSimpleModel, `boolean` choiceTableModel, `boolean` isCalsTable, `boolean` innerCallsTable, `boolean` hasRowsepAttribute, `boolean` hasColsepAttribute, `boolean` hasAlignAttribute, [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md) authorResourceBundle, `int` predefinedRowsCount, `int` predefinedColumnsCount)`

### `<init>(`java.awt.Frame` parentFrame, `boolean` hasFooter, `boolean` hasFrameAttribute, `boolean` showModelChooser, `boolean` showSimpleModel, `boolean` choiceTableModel, `boolean` isCalsTable, `boolean` isSimpleOrHtmlTable, `boolean` isPropertiesTableAccepted, `boolean` isPropertiesTable, `boolean` innerCallsTable, `boolean` hasRowsepAttribute, `boolean` hasColsepAttribute, `boolean` hasAlignAttribute, [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md) authorResourceBundle, `int` predefinedRowsCount, `int` predefinedColumnsCount)`

## Methods

### `updateColumnsWidthsCombo(`ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants.ColumnWidthsType[]` columnsWidthsSpecifications)`

**Returns:** `void`

### `updateTitleState(`boolean` enabled)`

**Returns:** `void`

### `updateElementsState(`boolean` enabled)`

**Returns:** `void`

### `updateAlignState(`boolean` enabled)`

**Returns:** `void`

### `getFrameValues(`int` tableModelType)`

**Returns:** `java.lang.String[]`

### `getDefaultFrameValue(`int` tableModelType)`

**Returns:** `java.lang.String`

### `getRowsepValues(`int` tableModelType)`

**Returns:** `java.lang.String[]`

### `getDefaultRowsepValue(`int` tableModelType)`

**Returns:** `java.lang.String`

### `getColsepValues(`int` tableModelType)`

**Returns:** `java.lang.String[]`

### `getAlignValues(`int` tableModelType)`

**Returns:** `java.lang.String[]`

### `getDefaultColsepValue(`int` tableModelType)`

**Returns:** `java.lang.String`

### `getDefaultAlignValue(`int` tableModelType)`

**Returns:** `java.lang.String`

### `getColumnWidthsSpecifications(`int` tableModelType)`

**Returns:** `ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants.ColumnWidthsType[]`

### `createTitleCheckbox()`

**Returns:** `javax.swing.JCheckBox`

### `addValuesToFrameCombo(`int` tableModelType)`

**Returns:** `void`

### `addValuesToRowsepCombo(`int` tableModelType)`

**Returns:** `void`

### `addValuesToColsepCombo(`int` tableModelType)`

**Returns:** `void`

### `addValuesToAlignCombo(`int` tableModelType)`

**Returns:** `void`

### `showDialog([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md) previousTableInfo)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)

### `getTableModelType()`

**Returns:** `int`

### `initialize([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md) previousTableInfo)`

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

