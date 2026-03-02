# Class: `ApplicationTable`

**Package:** [`ro.sync.ui.application`](README.md)

**Fully Qualified Name:** `ro.sync.ui.application.ApplicationTable`

**Extends:** `javax.swing.JTable`

## Fields

### `messages`

**Type:** `ro.sync.i18n.c`

### `wyd`

**Type:** `java.beans.PropertyChangeListener`

### `izd`

**Type:** `javax.swing.event.TableColumnModelListener`

### `bzd`

**Type:** `java.awt.Color`

### `gzd`

**Type:** `java.awt.Color`

### `fzd`

**Type:** `java.lang.String`

### `azd`

**Type:** `java.lang.String`

### `jzd`

**Type:** `java.awt.Color[]`

### `kzd`

**Type:** `boolean`

### `yyd`

**Type:** `ro.sync.ui.application.h`

### `czd`

**Type:** `javax.swing.Action`

### `mzd`

**Type:** `javax.swing.Action`

### `zyd`

**Type:** `java.awt.event.MouseListener`

### `lzd`

**Type:** `org.slf4j.Logger`

### `dzd`

**Type:** `boolean`

### `hzd`

**Type:** `boolean`

### `xyd`

**Type:** `javax.swing.RowSorter`

### `ezd`

**Type:** `javax.swing.event.RowSorterListener`

## Constructors

### `<init>()`

### `<init>(javax.swing.table.TableModel arg0)`

**Parameters:**
- `arg0` (`javax.swing.table.TableModel`)

### `<init>(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

### `<init>(boolean arg0, boolean arg1)`

**Parameters:**
- `arg0` (`boolean`)
- `arg1` (`boolean`)

### `<init>(java.util.Vector arg0, java.util.Vector arg1)`

**Parameters:**
- `arg0` (`java.util.Vector`)
- `arg1` (`java.util.Vector`)

### `<init>(javax.swing.table.TableModel arg0, boolean arg1)`

**Parameters:**
- `arg0` (`javax.swing.table.TableModel`)
- `arg1` (`boolean`)

## Methods

### `isDrawingStripes()`

**Returns:** `boolean`

### `getStripeColorForRow(int arg0)`

**Returns:** `java.awt.Color`

**Parameters:**
- `arg0` (`int`)

### `pqc(boolean arg0, boolean arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)
- `arg1` (`boolean`)

### `shouldInstallRowHeightUpdater()`

**Returns:** `boolean`

### `prepareRenderer(javax.swing.table.TableCellRenderer arg0, int arg1, int arg2)`

**Returns:** `java.awt.Component`

**Parameters:**
- `arg0` (`javax.swing.table.TableCellRenderer`)
- `arg1` (`int`)
- `arg2` (`int`)

### `shouldChangeRendererColors()`

**Returns:** `boolean`

### `prepareEditor(javax.swing.table.TableCellEditor arg0, int arg1, int arg2)`

**Returns:** `java.awt.Component`

**Parameters:**
- `arg0` (`javax.swing.table.TableCellEditor`)
- `arg1` (`int`)
- `arg2` (`int`)

### `setTableHeader(javax.swing.table.JTableHeader arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`javax.swing.table.JTableHeader`)

### `createDefaultTableHeader()`

**Returns:** `javax.swing.table.JTableHeader`

### `setDefaultEditor(java.lang.Class<?> arg0, javax.swing.table.TableCellEditor arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.Class<?>`)
- `arg1` (`javax.swing.table.TableCellEditor`)

### `setDefaultRenderer(java.lang.Class<?> arg0, javax.swing.table.TableCellRenderer arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.Class<?>`)
- `arg1` (`javax.swing.table.TableCellRenderer`)

### `setDefaultAction(javax.swing.Action arg0, boolean arg1, boolean arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` (`javax.swing.Action`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)

### `changeSelection(int arg0, int arg1, boolean arg2, boolean arg3)`

**Returns:** `void`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`int`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)

### `scrollRectToVisible(java.awt.Rectangle arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.awt.Rectangle`)

### `setUI(javax.swing.plaf.TableUI arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`javax.swing.plaf.TableUI`)

### `setColumnModel(javax.swing.table.TableColumnModel arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`javax.swing.table.TableColumnModel`)

### `qqc(javax.swing.table.TableColumnModel arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`javax.swing.table.TableColumnModel`)

### `showVerticalLinesOutsideTableBounds()`

**Returns:** `boolean`

### `showHorizontalLinesOutsideTableBounds()`

**Returns:** `boolean`

### `createDefaultColumnsFromModel()`

**Returns:** `void`

### `setSelectionBackground(java.awt.Color arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.awt.Color`)

### `setSelectionForeground(java.awt.Color arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.awt.Color`)

### `getDefaultAction()`

**Returns:** `javax.swing.Action`

### `setDeleteAction(javax.swing.Action arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`javax.swing.Action`)

### `getDeleteAction()`

**Returns:** `javax.swing.Action`

### `setRowSorter(javax.swing.RowSorter<? extends javax.swing.table.TableModel> arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`javax.swing.RowSorter<? extends javax.swing.table.TableModel>`)

### `oqc()`

**Returns:** `void`

### `getDefaultRenderer(java.lang.Class<?> arg0)`

**Returns:** `javax.swing.table.TableCellRenderer`

**Parameters:**
- `arg0` (`java.lang.Class<?>`)

### `getDefaultEditor(java.lang.Class<?> arg0)`

**Returns:** `javax.swing.table.TableCellEditor`

**Parameters:**
- `arg0` (`java.lang.Class<?>`)

