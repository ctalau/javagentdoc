# Class: `SATableSplitCustomizerDialog`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.SATableSplitCustomizerDialog`

**Extends:** [`ro.sync.exml.workspace.api.standalone.ui.OKCancelDialog`](../../../../../exml/workspace/api/standalone/ui/OKCancelDialog.md)

## Description

## Fields

### `colsSpinner`

**Type:** `javax.swing.JSpinner`

### `rowsSpinner`

**Type:** `javax.swing.JSpinner`

## Constructors

### `<init>(Frame parentFrame, AuthorResourceBundle authorResourceBundle, int maxColumns, int maxRows)`

**Parameters:**
- `parentFrame` (`java.awt.Frame`): The parent frame of the dialog.
- `authorResourceBundle` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md)): The author resource bundle.It is used for translations.
- `maxColumns` (`int`): The maximum number of columns in which the current cell can be split.
- `maxRows` (`int`): The maximum number of rows in which the current cell can be split.

## Methods

### `getSplitInformation()`

(horizontally and vertically)

**Returns:** `int[]`

