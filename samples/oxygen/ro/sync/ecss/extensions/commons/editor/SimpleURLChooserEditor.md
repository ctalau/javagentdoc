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

**Returns:** `java.lang.Object`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md))

### `getRenderingInfo(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context)`

**Returns:** [`ro.sync.ecss.extensions.api.editor.RendererLayoutInfo`](../../api/editor/RendererLayoutInfo.md)

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md))

### `computeRenderingInfo(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context)`

**Returns:** [`ro.sync.ecss.extensions.api.editor.RendererLayoutInfo`](../../api/editor/RendererLayoutInfo.md)

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md)): The current context.

### `getTooltipText(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context, int x, int y)`

**Returns:** `java.lang.String`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md))
- `x` (`int`)
- `y` (`int`)

### `getEditorComponent(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context, ro.sync.exml.view.graphics.Rectangle allocation, ro.sync.exml.view.graphics.Point mouseLocation)`

**Returns:** `java.lang.Object`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md))
- `allocation` (`ro.sync.exml.view.graphics.Rectangle`)
- `mouseLocation` (`ro.sync.exml.view.graphics.Point`)

### `getScrollRectangle()`

**Returns:** `ro.sync.exml.view.graphics.Rectangle`

### `getApproximativeCharsWidth(int numberOfChars, java.awt.FontMetrics fontMetrics)`

**Returns:** `int`

**Parameters:**
- `numberOfChars` (`int`): The number of characters.
- `fontMetrics` (`java.awt.FontMetrics`): The font metrics

### `requestFocus()`

**Returns:** `void`

### `getValue()`

**Returns:** `java.lang.Object`

### `stopEditing()`

**Returns:** `void`

### `commitValue()`

**Returns:** `void`

### `stopEditing(boolean onEnter)`

**Returns:** `void`

**Parameters:**
- `onEnter` (`boolean`)

### `cancelEditing()`

**Returns:** `void`

### `prepareComponents(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context, boolean forEditing)`

**Returns:** `void`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md)): The current context.
- `forEditing` (`boolean`)

### `setInitialValue(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context, boolean forEditing)`

**Returns:** `void`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md)): Editing context.
- `forEditing` (`boolean`): `true` if we are in the editor. `false` for renderer.

### `createTextField()`

**Returns:** `javax.swing.JTextField`

### `getCursorType(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context, int x, int y)`

**Returns:** [`ro.sync.ecss.extensions.api.CursorType`](../../api/CursorType.md)

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md))
- `x` (`int`)
- `y` (`int`)

### `getCursorType(int x, int y)`

**Returns:** [`ro.sync.ecss.extensions.api.CursorType`](../../api/CursorType.md)

**Parameters:**
- `x` (`int`)
- `y` (`int`)

### `refresh(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context)`

**Returns:** `void`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md))

### `insertContent(java.lang.String content)`

**Returns:** `boolean`

**Parameters:**
- `content` (`java.lang.String`)

