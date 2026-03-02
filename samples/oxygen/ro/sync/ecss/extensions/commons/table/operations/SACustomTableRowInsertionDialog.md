# Class: `SACustomTableRowInsertionDialog`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.SACustomTableRowInsertionDialog`

**Extends:** [`ro.sync.ecss.extensions.commons.ui.OKCancelDialog`](../../ui/OKCancelDialog.md)

## Description

It is used on standalone implementation.

## Fields

### `rowsSpinner`

**Type:** `javax.swing.JSpinner`

### `aboveRadioButton`

**Type:** `javax.swing.JRadioButton`

If selected, the row(s) will be inserted above the current location.

### `belowRadioButton`

**Type:** `javax.swing.JRadioButton`

If selected, the row(s) will be inserted below the current location.

## Constructors

### `<init>(JFrame parentFrame, AuthorResourceBundle resourceBundle)`

**Parameters:**
- `parentFrame` (`javax.swing.JFrame`): the parent frame
- `resourceBundle` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md)): The resource bundle.

## Methods

### `showDialog(TableRowsInfo previousTableRowsInfo)`

**Parameters:**
- `previousTableRowsInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableRowsInfo`](./TableRowsInfo.md)): the previous row information

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.TableRowsInfo`](./TableRowsInfo.md)

### `initialize(TableRowsInfo previousTableRowsInfo)`

**Parameters:**
- `previousTableRowsInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableRowsInfo`](./TableRowsInfo.md)): If `null`, defaults will be used. Otherwise, the controls
   will be initialized with values from this info.

**Returns:** `void`

