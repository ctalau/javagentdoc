# Class: `ECTableCustomizerDialog`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.ECTableCustomizerDialog`

**Implements:** [`ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants`](./TableCustomizerConstants.md)

## Fields

### `HELP_PAGE_ID`

**Type:** `java.lang.String`

### `title`

**Type:** `java.lang.String`

### `createTitle`

**Type:** `boolean`

### `rows`

**Type:** `int`

### `columns`

**Type:** `int`

### `createHeader`

**Type:** `boolean`

### `createFooter`

**Type:** `boolean`

### `makeCalsTable`

**Type:** `boolean`

### `makePropertiesTable`

**Type:** `boolean`

### `makeSimpleOrHtmlTable`

**Type:** `boolean`

### `selectedFrame`

**Type:** `java.lang.String`

### `selectedRowsep`

**Type:** `java.lang.String`

### `selectedColsep`

**Type:** `java.lang.String`

### `selectedAlign`

**Type:** `java.lang.String`

### `hasFooter`

**Type:** `boolean`

### `hasFrameAttribute`

**Type:** `boolean`

### `showModelChooser`

**Type:** `boolean`

### `titleTextField`

**Type:** `org.eclipse.swt.widgets.Text`

### `colWidthsCombobox`

**Type:** `org.eclipse.jface.viewers.ComboViewer`

### `framesCombo`

**Type:** `org.eclipse.jface.viewers.ComboViewer`

### `rowsepCombo`

**Type:** `org.eclipse.jface.viewers.ComboViewer`

### `colsepCombo`

**Type:** `org.eclipse.jface.viewers.ComboViewer`

### `alignCombo`

**Type:** `org.eclipse.jface.viewers.ComboViewer`

### `simpleTableModel`

**Type:** `boolean`

### `titleCheckbox`

**Type:** `org.eclipse.swt.widgets.Button`

### `selectedColWidthsType`

**Type:** `ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants.ColumnWidthsType`

### `calsModelRadio`

**Type:** `org.eclipse.swt.widgets.Button`

### `simpleOrHtmlModelRadio`

**Type:** `org.eclipse.swt.widgets.Button`

### `propertiesModelRadio`

**Type:** `org.eclipse.swt.widgets.Button`

### `rowsSpinner`

**Type:** `org.eclipse.swt.widgets.Spinner`

### `columnsSpinner`

**Type:** `org.eclipse.swt.widgets.Spinner`

### `headerCheckbox`

**Type:** `org.eclipse.swt.widgets.Button`

### `footerCheckbox`

**Type:** `org.eclipse.swt.widgets.Button`

### `tableInfo`

**Type:** [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)

### `innerCalsTable`

**Type:** `boolean`

### `authorResourceBundle`

**Type:** [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md)

### `predefinedRowsCount`

**Type:** `int`

### `predefinedColumnsCount`

**Type:** `int`

### `showChoiceTable`

**Type:** `boolean`

### `hasRowSep`

**Type:** `boolean`

### `hasColsep`

**Type:** `boolean`

### `hasAlign`

**Type:** `boolean`

### `isCalsTable`

**Type:** `boolean`

### `isPropertiesTableAccepted`

**Type:** `boolean`

### `isPropertiesTableModel`

**Type:** `boolean`

### `isSimpleOrHtmlTable`

**Type:** `boolean`

## Constructors

### `<init>(ro.sync.ecss.extensions.api.AuthorAccess arg0, org.eclipse.swt.widgets.Shell arg1, boolean arg2, boolean arg3, boolean arg4, ro.sync.ecss.extensions.api.AuthorResourceBundle arg5, int arg6, int arg7)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `arg1` (`org.eclipse.swt.widgets.Shell`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)
- `arg4` (`boolean`)
- `arg5` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md))
- `arg6` (`int`)
- `arg7` (`int`)

### `<init>(ro.sync.ecss.extensions.api.AuthorAccess arg0, org.eclipse.swt.widgets.Shell arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, ro.sync.ecss.extensions.api.AuthorResourceBundle arg10, int arg11, int arg12)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `arg1` (`org.eclipse.swt.widgets.Shell`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)
- `arg4` (`boolean`)
- `arg5` (`boolean`)
- `arg6` (`boolean`)
- `arg7` (`boolean`)
- `arg8` (`boolean`)
- `arg9` (`boolean`)
- `arg10` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md))
- `arg11` (`int`)
- `arg12` (`int`)

### `<init>(ro.sync.ecss.extensions.api.AuthorAccess arg0, org.eclipse.swt.widgets.Shell arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10, ro.sync.ecss.extensions.api.AuthorResourceBundle arg11, int arg12, int arg13)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `arg1` (`org.eclipse.swt.widgets.Shell`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)
- `arg4` (`boolean`)
- `arg5` (`boolean`)
- `arg6` (`boolean`)
- `arg7` (`boolean`)
- `arg8` (`boolean`)
- `arg9` (`boolean`)
- `arg10` (`boolean`)
- `arg11` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md))
- `arg12` (`int`)
- `arg13` (`int`)

### `<init>(ro.sync.ecss.extensions.api.AuthorAccess arg0, org.eclipse.swt.widgets.Shell arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10, boolean arg11, ro.sync.ecss.extensions.api.AuthorResourceBundle arg12, int arg13, int arg14)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `arg1` (`org.eclipse.swt.widgets.Shell`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)
- `arg4` (`boolean`)
- `arg5` (`boolean`)
- `arg6` (`boolean`)
- `arg7` (`boolean`)
- `arg8` (`boolean`)
- `arg9` (`boolean`)
- `arg10` (`boolean`)
- `arg11` (`boolean`)
- `arg12` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md))
- `arg13` (`int`)
- `arg14` (`int`)

### `<init>(ro.sync.ecss.extensions.api.AuthorAccess arg0, org.eclipse.swt.widgets.Shell arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10, boolean arg11, boolean arg12, boolean arg13, boolean arg14, ro.sync.ecss.extensions.api.AuthorResourceBundle arg15, int arg16, int arg17)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `arg1` (`org.eclipse.swt.widgets.Shell`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)
- `arg4` (`boolean`)
- `arg5` (`boolean`)
- `arg6` (`boolean`)
- `arg7` (`boolean`)
- `arg8` (`boolean`)
- `arg9` (`boolean`)
- `arg10` (`boolean`)
- `arg11` (`boolean`)
- `arg12` (`boolean`)
- `arg13` (`boolean`)
- `arg14` (`boolean`)
- `arg15` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md))
- `arg16` (`int`)
- `arg17` (`int`)

## Methods

### `configureShell(org.eclipse.swt.widgets.Shell arg0)`

**Parameters:**
- `arg0` (`org.eclipse.swt.widgets.Shell`)

**Returns:** `void`

### `createDialogArea(org.eclipse.swt.widgets.Composite arg0)`

**Parameters:**
- `arg0` (`org.eclipse.swt.widgets.Composite`)

**Returns:** `org.eclipse.swt.widgets.Control`

### `updateRadioButtonsSelection()`

**Returns:** `void`

### `setFrameComboInput(java.lang.String[] arg0)`

**Parameters:**
- `arg0` (`java.lang.String[]`)

**Returns:** `void`

### `setRowsepComboInput(java.lang.String[] arg0)`

**Parameters:**
- `arg0` (`java.lang.String[]`)

**Returns:** `void`

### `setColsepComboInput(java.lang.String[] arg0)`

**Parameters:**
- `arg0` (`java.lang.String[]`)

**Returns:** `void`

### `setAlignComboInput(java.lang.String[] arg0)`

**Parameters:**
- `arg0` (`java.lang.String[]`)

**Returns:** `void`

### `setColWidthsComboInput(java.util.List<ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants.ColumnWidthsType> arg0)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants.ColumnWidthsType>`)

**Returns:** `void`

### `getFrameValues(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `java.lang.String[]`

### `getRowsepValues(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `java.lang.String[]`

### `getColsepValues(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `java.lang.String[]`

### `getAlignValues(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `java.lang.String[]`

### `getDefaultFrameValue(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `java.lang.String`

### `getDefaultRowsepValue(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `java.lang.String`

### `getDefaultColsepValue(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `java.lang.String`

### `getDefaultAlignValue(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `java.lang.String`

### `getColumnWidthsSpecifications(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants.ColumnWidthsType>`

### `createTitleCheckbox(org.eclipse.swt.widgets.Composite arg0)`

**Parameters:**
- `arg0` (`org.eclipse.swt.widgets.Composite`)

**Returns:** `org.eclipse.swt.widgets.Button`

### `showDialog(ro.sync.ecss.extensions.commons.table.operations.TableInfo arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md))

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)

### `initialize()`

**Returns:** `void`

### `getTableModel()`

**Returns:** `int`

### `updateTitleState(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `updateSeparatorsState(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `updateAlignState(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `updateColWidthsCombo(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `tableModelChanged(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `void`

### `createButtonsForButtonBar(org.eclipse.swt.widgets.Composite arg0)`

**Parameters:**
- `arg0` (`org.eclipse.swt.widgets.Composite`)

**Returns:** `void`

### `getHelpPageID()`

**Returns:** `java.lang.String`

