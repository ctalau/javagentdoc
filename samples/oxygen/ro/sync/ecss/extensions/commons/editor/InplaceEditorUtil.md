# Class: `InplaceEditorUtil`

**Package:** [`ro.sync.ecss.extensions.commons.editor`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.editor.InplaceEditorUtil`

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `getPreferredSize(javax.swing.JPanel panel, ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context)`

**Returns:** `ro.sync.exml.view.graphics.Dimension`

**Parameters:**
- `panel` (`javax.swing.JPanel`): A panel used as an editor.
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md)): In-place editing context.

### `getPreferredSize(javax.swing.JComboBox comboBox, ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context)`

**Returns:** `ro.sync.exml.view.graphics.Dimension`

**Parameters:**
- `comboBox` (`javax.swing.JComboBox`): A combo box used as an editor.
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md)): In-place editing context.

### `getPreferredSize(javax.swing.JTextField textField, ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context)`

**Returns:** `ro.sync.exml.view.graphics.Dimension`

**Parameters:**
- `textField` (`javax.swing.JTextField`): A text field used as an editor.
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md)): In-place editing context.

### `relayout(javax.swing.JComboBox comboBox, ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context)`

**Returns:** `void`

The caret offset will also be scrolled to be visible.

**Parameters:**
- `comboBox` (`javax.swing.JComboBox`): Combo box used for editing.
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md)): In-place editing context.

### `relayout(javax.swing.JTextField textField, ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context)`

**Returns:** `void`

The caret offset will also be scrolled to be visible.

**Parameters:**
- `textField` (`javax.swing.JTextField`): Text field used for editing.
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md)): In-place editing context.

### `setCaretAtEnd(javax.swing.text.JTextComponent textField, ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context)`

**Returns:** `void`

**Parameters:**
- `textField` (`javax.swing.text.JTextComponent`): Text field to be scrolled.
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md)): In-place editing context.

### `getApproximativeCharsWidth(int numberOfChars, java.awt.FontMetrics fontMetrics)`

**Returns:** `int`

**Parameters:**
- `numberOfChars` (`int`): The number of characters.
- `fontMetrics` (`java.awt.FontMetrics`): The font metrics

### `getPreferredSize(java.awt.Component component, java.awt.Container parent)`

**Returns:** `java.awt.Dimension`

**Parameters:**
- `component` (`java.awt.Component`): The component.
- `parent` (`java.awt.Container`): The parent component, where the component will eventually be added.

### `addToParent(java.awt.Component component, java.awt.Container parent, java.util.function.Supplier<T> supplier)`

**Returns:** `T`

**Parameters:**
- `component` (`java.awt.Component`): The component.
- `parent` (`java.awt.Container`): The parent component, where the component will eventually be added.
- `supplier` (`java.util.function.Supplier<T>`): To be invoked.

