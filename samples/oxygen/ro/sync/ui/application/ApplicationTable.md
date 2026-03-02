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

### `<init>(TableModel arg0)`

**Parameters:**
- `arg0` (`javax.swing.table.TableModel`)

### `<init>(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

### `<init>(boolean arg0, boolean arg1)`

**Parameters:**
- `arg0` (`boolean`)
- `arg1` (`boolean`)

### `<init>(Vector arg0, Vector arg1)`

**Parameters:**
- `arg0` (`java.util.Vector`)
- `arg1` (`java.util.Vector`)

### `<init>(TableModel arg0, boolean arg1)`

**Parameters:**
- `arg0` (`javax.swing.table.TableModel`)
- `arg1` (`boolean`)

## Methods

### `isDrawingStripes()`

**Returns:** `boolean`

### `getStripeColorForRow(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `java.awt.Color`

### `pqc(boolean arg0, boolean arg1)`

**Parameters:**
- `arg0` (`boolean`)
- `arg1` (`boolean`)

**Returns:** `void`

### `shouldInstallRowHeightUpdater()`

**Returns:** `boolean`

### `prepareRenderer(TableCellRenderer arg0, int arg1, int arg2)`

**Parameters:**
- `arg0` (`javax.swing.table.TableCellRenderer`)
- `arg1` (`int`)
- `arg2` (`int`)

**Returns:** `java.awt.Component`

### `shouldChangeRendererColors()`

**Returns:** `boolean`

### `prepareEditor(TableCellEditor arg0, int arg1, int arg2)`

**Parameters:**
- `arg0` (`javax.swing.table.TableCellEditor`)
- `arg1` (`int`)
- `arg2` (`int`)

**Returns:** `java.awt.Component`

### `setTableHeader(JTableHeader arg0)`

**Parameters:**
- `arg0` (`javax.swing.table.JTableHeader`)

**Returns:** `void`

### `createDefaultTableHeader()`

**Returns:** `javax.swing.table.JTableHeader`

### `setDefaultEditor(Class<?> arg0, TableCellEditor arg1)`

**Parameters:**
- `arg0` (`java.lang.Class<?>`)
- `arg1` (`javax.swing.table.TableCellEditor`)

**Returns:** `void`

### `setDefaultRenderer(Class<?> arg0, TableCellRenderer arg1)`

**Parameters:**
- `arg0` (`java.lang.Class<?>`)
- `arg1` (`javax.swing.table.TableCellRenderer`)

**Returns:** `void`

### `setDefaultAction(Action arg0, boolean arg1, boolean arg2)`

**Parameters:**
- `arg0` (`javax.swing.Action`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)

**Returns:** `void`

### `changeSelection(int arg0, int arg1, boolean arg2, boolean arg3)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`int`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)

**Returns:** `void`

### `scrollRectToVisible(Rectangle arg0)`

**Parameters:**
- `arg0` (`java.awt.Rectangle`)

**Returns:** `void`

### `setUI(TableUI arg0)`

**Parameters:**
- `arg0` (`javax.swing.plaf.TableUI`)

**Returns:** `void`

### `setColumnModel(TableColumnModel arg0)`

**Parameters:**
- `arg0` (`javax.swing.table.TableColumnModel`)

**Returns:** `void`

### `qqc(TableColumnModel arg0)`

**Parameters:**
- `arg0` (`javax.swing.table.TableColumnModel`)

**Returns:** `void`

### `showVerticalLinesOutsideTableBounds()`

**Returns:** `boolean`

### `showHorizontalLinesOutsideTableBounds()`

**Returns:** `boolean`

### `createDefaultColumnsFromModel()`

**Returns:** `void`

### `setSelectionBackground(Color arg0)`

**Parameters:**
- `arg0` (`java.awt.Color`)

**Returns:** `void`

### `setSelectionForeground(Color arg0)`

**Parameters:**
- `arg0` (`java.awt.Color`)

**Returns:** `void`

### `getDefaultAction()`

**Returns:** `javax.swing.Action`

### `setDeleteAction(Action arg0)`

**Parameters:**
- `arg0` (`javax.swing.Action`)

**Returns:** `void`

### `getDeleteAction()`

**Returns:** `javax.swing.Action`

### `setRowSorter(RowSorter<? extends TableModel> arg0)`

**Parameters:**
- `arg0` (`javax.swing.RowSorter<? extends javax.swing.table.TableModel>`)

**Returns:** `void`

### `oqc()`

**Returns:** `void`

### `getDefaultRenderer(Class<?> arg0)`

**Parameters:**
- `arg0` (`java.lang.Class<?>`)

**Returns:** `javax.swing.table.TableCellRenderer`

### `getDefaultEditor(Class<?> arg0)`

**Parameters:**
- `arg0` (`java.lang.Class<?>`)

**Returns:** `javax.swing.table.TableCellEditor`

