# Interface: `EditorContainer`

**Package:** [`ro.sync.exml.editor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.editor.EditorContainer`

**Extends:** `ro.sync.exml.editor.je`

## Methods

### `addChangeListener(javax.swing.event.ChangeListener arg0)`

**Parameters:**
- `arg0` (`javax.swing.event.ChangeListener`)

**Returns:** `void`

### `addContainerListener(java.awt.event.ContainerListener arg0)`

**Parameters:**
- `arg0` (`java.awt.event.ContainerListener`)

**Returns:** `void`

### `addMouseListener(java.awt.event.MouseListener arg0)`

**Parameters:**
- `arg0` (`java.awt.event.MouseListener`)

**Returns:** `void`

### `addTab(java.lang.String arg0, java.lang.String arg1, javax.swing.Icon arg2, javax.swing.JComponent arg3, java.lang.String arg4)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`javax.swing.Icon`)
- `arg3` (`javax.swing.JComponent`)
- `arg4` (`java.lang.String`)

**Returns:** `void`

### `replaceTab(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, javax.swing.Icon arg3, javax.swing.JComponent arg4, javax.swing.JComponent arg5)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`javax.swing.Icon`)
- `arg4` (`javax.swing.JComponent`)
- `arg5` (`javax.swing.JComponent`)

**Returns:** `void`

### `setSelectedComponent(java.awt.Component arg0, java.lang.String arg1)`

**Parameters:**
- `arg0` (`java.awt.Component`)
- `arg1` (`java.lang.String`)

**Returns:** `void`

### `getSelectedComponent()`

**Returns:** `java.awt.Component`

### `isEmpty()`

**Returns:** `boolean`

### `getAllEditorComponents()`

**Returns:** `ro.sync.exml.editor.dd[]`

### `getAllEditorComponentsInVisualOrder()`

**Returns:** `ro.sync.exml.editor.dd[]`

### `getTopEditorsComponents()`

**Returns:** `ro.sync.exml.editor.dd[]`

### `setVisible(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `setBorder(javax.swing.border.Border arg0)`

**Parameters:**
- `arg0` (`javax.swing.border.Border`)

**Returns:** `void`

### `getBackground()`

**Returns:** `java.awt.Color`

### `getHostComponent()`

**Returns:** `javax.swing.JComponent`

### `remove(javax.swing.JComponent arg0)`

**Parameters:**
- `arg0` (`javax.swing.JComponent`)

**Returns:** `void`

### `setTitle(javax.swing.JComponent arg0, java.lang.String arg1, java.lang.String arg2)`

**Parameters:**
- `arg0` (`javax.swing.JComponent`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

**Returns:** `void`

### `repaintHost()`

**Returns:** `void`

### `removeChangeListener(javax.swing.event.ChangeListener arg0)`

**Parameters:**
- `arg0` (`javax.swing.event.ChangeListener`)

**Returns:** `void`

### `removeMouseListener(java.awt.event.MouseListener arg0)`

**Parameters:**
- `arg0` (`java.awt.event.MouseListener`)

**Returns:** `void`

### `removeContainerListener(java.awt.event.ContainerListener arg0)`

**Parameters:**
- `arg0` (`java.awt.event.ContainerListener`)

**Returns:** `void`

### `setListenersEnabled(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `isEnabledListeners()`

**Returns:** `boolean`

### `getEditorsFromTheSameGroup(ro.sync.exml.editor.dd arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.dd`)

**Returns:** `ro.sync.exml.editor.dd[]`

### `saveLayout()`

**Returns:** `void`

### `loadLayout()`

**Returns:** `void`

### `resetLayout()`

**Returns:** `void`

### `updateIconAndTooltip(ro.sync.exml.editor.dd arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.dd`)

**Returns:** `void`

### `setAllowDetachingEditors(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `setShowEditorTabs(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

