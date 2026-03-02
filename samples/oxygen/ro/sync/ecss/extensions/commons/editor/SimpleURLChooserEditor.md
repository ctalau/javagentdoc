# Class: `SimpleURLChooserEditor`

**Package:** [`ro.sync.ecss.extensions.commons.editor`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.editor.SimpleURLChooserEditor`

**Extends:** [`ro.sync.ecss.extensions.api.editor.AbstractInplaceEditor`](../../api/editor/AbstractInplaceEditor.md)

**Implements:** [`ro.sync.ecss.extensions.api.editor.InplaceRenderer`](../../api/editor/InplaceRenderer.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `IS_ECLIPSE`

**Type:** `boolean`

### `IS_WIN32`

**Type:** `boolean`

### `VGAP`

**Type:** `int`

### `HGAP`

**Type:** `int`

### `UNDO_MANAGER_PROPERTY`

**Type:** `java.lang.String`

### `browseBtn`

**Type:** `javax.swing.JButton`

### `urlChooserPanel`

**Type:** `javax.swing.JPanel`

### `urlTextField`

**Type:** `javax.swing.JTextField`

### `isBrowsing`

**Type:** `boolean`

### `defaultForeground`

**Type:** `java.awt.Color`

### `utilAccess`

**Type:** [`ro.sync.ecss.extensions.api.access.AuthorUtilAccess`](../../api/access/AuthorUtilAccess.md)

### `defaultFont`

**Type:** `java.awt.Font`

## Constructors

### `<init>()`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `getRendererComponent(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md))

**Returns:** `java.lang.Object`

### `getRenderingInfo(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md))

**Returns:** [`ro.sync.ecss.extensions.api.editor.RendererLayoutInfo`](../../api/editor/RendererLayoutInfo.md)

### `computeRenderingInfo(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md)): The current context.

**Returns:** [`ro.sync.ecss.extensions.api.editor.RendererLayoutInfo`](../../api/editor/RendererLayoutInfo.md)

### `getTooltipText(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context, int x, int y)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md))
- `x` (`int`)
- `y` (`int`)

**Returns:** `java.lang.String`

### `getEditorComponent(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context, ro.sync.exml.view.graphics.Rectangle allocation, ro.sync.exml.view.graphics.Point mouseLocation)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md))
- `allocation` (`ro.sync.exml.view.graphics.Rectangle`)
- `mouseLocation` (`ro.sync.exml.view.graphics.Point`)

**Returns:** `java.lang.Object`

### `getScrollRectangle()`

**Returns:** `ro.sync.exml.view.graphics.Rectangle`

### `getApproximativeCharsWidth(int numberOfChars, java.awt.FontMetrics fontMetrics)`

**Parameters:**
- `numberOfChars` (`int`): The number of characters.
- `fontMetrics` (`java.awt.FontMetrics`): The font metrics

**Returns:** `int`

### `requestFocus()`

**Returns:** `void`

### `getValue()`

**Returns:** `java.lang.Object`

### `stopEditing()`

**Returns:** `void`

### `commitValue()`

**Returns:** `void`

### `stopEditing(boolean onEnter)`

**Parameters:**
- `onEnter` (`boolean`)

**Returns:** `void`

### `cancelEditing()`

**Returns:** `void`

### `prepareComponents(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context, boolean forEditing)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md)): The current context.
- `forEditing` (`boolean`)

**Returns:** `void`

### `setInitialValue(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context, boolean forEditing)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md)): Editing context.
- `forEditing` (`boolean`): `true` if we are in the editor. `false` for renderer.

**Returns:** `void`

### `createTextField()`

**Returns:** `javax.swing.JTextField`

### `getCursorType(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context, int x, int y)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md))
- `x` (`int`)
- `y` (`int`)

**Returns:** [`ro.sync.ecss.extensions.api.CursorType`](../../api/CursorType.md)

### `getCursorType(int x, int y)`

**Parameters:**
- `x` (`int`)
- `y` (`int`)

**Returns:** [`ro.sync.ecss.extensions.api.CursorType`](../../api/CursorType.md)

### `refresh(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md))

**Returns:** `void`

### `insertContent(java.lang.String content)`

**Parameters:**
- `content` (`java.lang.String`)

**Returns:** `boolean`

