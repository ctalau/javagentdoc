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

**Returns:** `void`

**Parameters:**
- `arg0` (`org.eclipse.swt.widgets.Shell`)

### `createDialogArea(org.eclipse.swt.widgets.Composite arg0)`

**Returns:** `org.eclipse.swt.widgets.Control`

**Parameters:**
- `arg0` (`org.eclipse.swt.widgets.Composite`)

### `updateRadioButtonsSelection()`

**Returns:** `void`

### `setFrameComboInput(java.lang.String[] arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String[]`)

### `setRowsepComboInput(java.lang.String[] arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String[]`)

### `setColsepComboInput(java.lang.String[] arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String[]`)

### `setAlignComboInput(java.lang.String[] arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String[]`)

### `setColWidthsComboInput(java.util.List<ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants.ColumnWidthsType> arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants.ColumnWidthsType>`)

### `getFrameValues(int arg0)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `arg0` (`int`)

### `getRowsepValues(int arg0)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `arg0` (`int`)

### `getColsepValues(int arg0)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `arg0` (`int`)

### `getAlignValues(int arg0)`

**Returns:** `java.lang.String[]`

**Parameters:**
- `arg0` (`int`)

### `getDefaultFrameValue(int arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`int`)

### `getDefaultRowsepValue(int arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`int`)

### `getDefaultColsepValue(int arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`int`)

### `getDefaultAlignValue(int arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`int`)

### `getColumnWidthsSpecifications(int arg0)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants.ColumnWidthsType>`

**Parameters:**
- `arg0` (`int`)

### `createTitleCheckbox(org.eclipse.swt.widgets.Composite arg0)`

**Returns:** `org.eclipse.swt.widgets.Button`

**Parameters:**
- `arg0` (`org.eclipse.swt.widgets.Composite`)

### `showDialog(ro.sync.ecss.extensions.commons.table.operations.TableInfo arg0)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md))

### `initialize()`

**Returns:** `void`

### `getTableModel()`

**Returns:** `int`

### `updateTitleState(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

### `updateSeparatorsState(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

### `updateAlignState(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

### `updateColWidthsCombo(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

### `tableModelChanged(int arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`int`)

### `createButtonsForButtonBar(org.eclipse.swt.widgets.Composite arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`org.eclipse.swt.widgets.Composite`)

### `getHelpPageID()`

**Returns:** `java.lang.String`

