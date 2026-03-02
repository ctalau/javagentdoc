# Class: `SACustomTableColumnInsertionDialog`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.SACustomTableColumnInsertionDialog`

**Extends:** [`ro.sync.ecss.extensions.commons.ui.OKCancelDialog`](../../ui/OKCancelDialog.md)

## Description

It is used on the stand-alone implementation.

## Fields

### `columnsSpinner`

**Type:** `javax.swing.JSpinner`

### `beforeRadioButton`

**Type:** `javax.swing.JRadioButton`

If selected, the column(s) will be inserted before the current location.

### `afterRadioButton`

**Type:** `javax.swing.JRadioButton`

If selected, the column(s) will be inserted after the current location.

## Constructors

### `<init>(JFrame parentFrame, AuthorResourceBundle resourceBundle)`

**Parameters:**
- `parentFrame` (`javax.swing.JFrame`): the parent frame.
- `resourceBundle` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md)): the resource bundle.

## Methods

### `showDialog(TableColumnsInfo previousTableColumnsInfo)`

**Parameters:**
- `previousTableColumnsInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableColumnsInfo`](./TableColumnsInfo.md)): the previous columns information

**Returns:** [`ro.sync.ecss.extensions.commons.table.operations.TableColumnsInfo`](./TableColumnsInfo.md)

### `initialize(TableColumnsInfo previousTableColumnsInfo)`

**Parameters:**
- `previousTableColumnsInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableColumnsInfo`](./TableColumnsInfo.md)): If `null`, defaults will be used. Otherwise, the controls
   will be initialized with values from this info.

**Returns:** `void`

