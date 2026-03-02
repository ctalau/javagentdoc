# Interface: `EditorContainer`

**Package:** [`ro.sync.exml.editor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.editor.EditorContainer`

**Extends:** `ro.sync.exml.editor.je`

## Methods

### `addChangeListener(javax.swing.event.ChangeListener arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`javax.swing.event.ChangeListener`)

### `addContainerListener(java.awt.event.ContainerListener arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.awt.event.ContainerListener`)

### `addMouseListener(java.awt.event.MouseListener arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.awt.event.MouseListener`)

### `addTab(java.lang.String arg0, java.lang.String arg1, javax.swing.Icon arg2, javax.swing.JComponent arg3, java.lang.String arg4)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`javax.swing.Icon`)
- `arg3` (`javax.swing.JComponent`)
- `arg4` (`java.lang.String`)

### `replaceTab(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, javax.swing.Icon arg3, javax.swing.JComponent arg4, javax.swing.JComponent arg5)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`javax.swing.Icon`)
- `arg4` (`javax.swing.JComponent`)
- `arg5` (`javax.swing.JComponent`)

### `setSelectedComponent(java.awt.Component arg0, java.lang.String arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.awt.Component`)
- `arg1` (`java.lang.String`)

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

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

### `setBorder(javax.swing.border.Border arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`javax.swing.border.Border`)

### `getBackground()`

**Returns:** `java.awt.Color`

### `getHostComponent()`

**Returns:** `javax.swing.JComponent`

### `remove(javax.swing.JComponent arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`javax.swing.JComponent`)

### `setTitle(javax.swing.JComponent arg0, java.lang.String arg1, java.lang.String arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` (`javax.swing.JComponent`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

### `repaintHost()`

**Returns:** `void`

### `removeChangeListener(javax.swing.event.ChangeListener arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`javax.swing.event.ChangeListener`)

### `removeMouseListener(java.awt.event.MouseListener arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.awt.event.MouseListener`)

### `removeContainerListener(java.awt.event.ContainerListener arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.awt.event.ContainerListener`)

### `setListenersEnabled(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

### `isEnabledListeners()`

**Returns:** `boolean`

### `getEditorsFromTheSameGroup(ro.sync.exml.editor.dd arg0)`

**Returns:** `ro.sync.exml.editor.dd[]`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.dd`)

### `saveLayout()`

**Returns:** `void`

### `loadLayout()`

**Returns:** `void`

### `resetLayout()`

**Returns:** `void`

### `updateIconAndTooltip(ro.sync.exml.editor.dd arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.dd`)

### `setAllowDetachingEditors(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

### `setShowEditorTabs(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

