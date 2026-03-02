# Class: `OxygenUIComponentsFactory`

**Package:** [`ro.sync.exml.workspace.api.standalone.ui`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.ui.OxygenUIComponentsFactory`

## Constructors

### `<init>()`

## Methods

### `createButton(Action arg0)`

**Parameters:**
- `arg0` (`javax.swing.Action`)

**Returns:** `javax.swing.JButton`

### `createColorChooserButton(Color arg0)`

**Parameters:**
- `arg0` (`java.awt.Color`)

**Returns:** [`ro.sync.exml.workspace.api.standalone.ui.ColorButton`](./ColorButton.md)

### `createMenu(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** [`ro.sync.exml.workspace.api.standalone.ui.Menu`](./Menu.md)

### `createOkCancelDialog(Frame arg0, String arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.awt.Frame`)
- `arg1` (`java.lang.String`)
- `arg2` (`boolean`)

**Returns:** [`ro.sync.exml.workspace.api.standalone.ui.OKCancelDialog`](./OKCancelDialog.md)

### `createPopupMenu()`

**Returns:** [`ro.sync.exml.workspace.api.standalone.ui.PopupMenu`](./PopupMenu.md)

### `createSplitMenuButton(String arg0, Icon arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`javax.swing.Icon`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)
- `arg4` (`boolean`)
- `arg5` (`boolean`)

**Returns:** [`ro.sync.exml.workspace.api.standalone.ui.SplitMenuButton`](./SplitMenuButton.md)

### `createTable(TableModel arg0)`

**Parameters:**
- `arg0` (`javax.swing.table.TableModel`)

**Returns:** [`ro.sync.exml.workspace.api.standalone.ui.Table`](./Table.md)

### `createTextField()`

**Returns:** [`ro.sync.exml.workspace.api.standalone.ui.TextField`](./TextField.md)

### `createToolbarButton(Action arg0, boolean arg1)`

**Parameters:**
- `arg0` (`javax.swing.Action`)
- `arg1` (`boolean`)

**Returns:** `javax.swing.JButton`

### `createToolbarToggleButton(Action arg0, boolean arg1)`

**Parameters:**
- `arg0` (`javax.swing.Action`)
- `arg1` (`boolean`)

**Returns:** `javax.swing.JButton`

### `createTree(TreeModel arg0)`

**Parameters:**
- `arg0` (`javax.swing.tree.TreeModel`)

**Returns:** [`ro.sync.exml.workspace.api.standalone.ui.Tree`](./Tree.md)

### `createMenuItem(Action arg0)`

**Parameters:**
- `arg0` (`javax.swing.Action`)

**Returns:** `javax.swing.JMenuItem`

### `installMultilineTooltip(JComponent arg0)`

**Parameters:**
- `arg0` (`javax.swing.JComponent`)

**Returns:** `javax.swing.JToolTip`

### `createMultilineLabel(String arg0, boolean arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)

**Returns:** `javax.swing.JComponent`

### `createComboBox(ComboBoxModel arg0)`

**Parameters:**
- `arg0` (`javax.swing.ComboBoxModel`)

**Returns:** `javax.swing.JComboBox`

### `createInputURLPanelProvider(String[] arg0, String arg1, String[] arg2, boolean arg3, String arg4, LocalFileBrowseType arg5)`

**Parameters:**
- `arg0` (`java.lang.String[]`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String[]`)
- `arg3` (`boolean`)
- `arg4` (`java.lang.String`)
- `arg5` ([`ro.sync.exml.workspace.api.standalone.ui.urlpanel.LocalFileBrowseType`](urlpanel/LocalFileBrowseType.md))

**Returns:** [`ro.sync.exml.workspace.api.standalone.ui.urlpanel.InputUrlComponentProvider`](urlpanel/InputUrlComponentProvider.md)

### `createScrollPane(Component arg0, int arg1, int arg2)`

**Parameters:**
- `arg0` (`java.awt.Component`)
- `arg1` (`int`)
- `arg2` (`int`)

**Returns:** `javax.swing.JScrollPane`

### `createHTMLEditorPane(String arg0, boolean arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)

**Returns:** `javax.swing.JEditorPane`

### `createTextArea(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `javax.swing.JTextArea`

### `createTextArea(String arg0, boolean arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)

**Returns:** `javax.swing.JTextArea`

### `createTextArea(String arg0, boolean arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)

**Returns:** `javax.swing.JTextArea`

### `changeContentType(JTextArea arg0, String arg1)`

**Parameters:**
- `arg0` (`javax.swing.JTextArea`)
- `arg1` (`java.lang.String`)

**Returns:** `void`

### `createCheckBoxMenuItem(Action arg0)`

**Parameters:**
- `arg0` (`javax.swing.Action`)

**Returns:** `javax.swing.JCheckBoxMenuItem`

### `createRadioMenuItem(Action arg0)`

**Parameters:**
- `arg0` (`javax.swing.Action`)

**Returns:** `javax.swing.JRadioButtonMenuItem`

### `createLinkLabel(String arg0, ActionListener arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.awt.event.ActionListener`)

**Returns:** `javax.swing.JLabel`

