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

### `getPreferredSize(JPanel panel, AuthorInplaceContext context)`

**Parameters:**
- `panel` (`javax.swing.JPanel`): A panel used as an editor.
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md)): In-place editing context.

**Returns:** `ro.sync.exml.view.graphics.Dimension`

### `getPreferredSize(JComboBox comboBox, AuthorInplaceContext context)`

**Parameters:**
- `comboBox` (`javax.swing.JComboBox`): A combo box used as an editor.
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md)): In-place editing context.

**Returns:** `ro.sync.exml.view.graphics.Dimension`

### `getPreferredSize(JTextField textField, AuthorInplaceContext context)`

**Parameters:**
- `textField` (`javax.swing.JTextField`): A text field used as an editor.
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md)): In-place editing context.

**Returns:** `ro.sync.exml.view.graphics.Dimension`

### `relayout(JComboBox comboBox, AuthorInplaceContext context)`

The caret offset will also be scrolled to be visible.

**Parameters:**
- `comboBox` (`javax.swing.JComboBox`): Combo box used for editing.
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md)): In-place editing context.

**Returns:** `void`

### `relayout(JTextField textField, AuthorInplaceContext context)`

The caret offset will also be scrolled to be visible.

**Parameters:**
- `textField` (`javax.swing.JTextField`): Text field used for editing.
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md)): In-place editing context.

**Returns:** `void`

### `setCaretAtEnd(JTextComponent textField, AuthorInplaceContext context)`

**Parameters:**
- `textField` (`javax.swing.text.JTextComponent`): Text field to be scrolled.
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md)): In-place editing context.

**Returns:** `void`

### `getApproximativeCharsWidth(int numberOfChars, FontMetrics fontMetrics)`

**Parameters:**
- `numberOfChars` (`int`): The number of characters.
- `fontMetrics` (`java.awt.FontMetrics`): The font metrics

**Returns:** `int`

### `getPreferredSize(Component component, Container parent)`

**Parameters:**
- `component` (`java.awt.Component`): The component.
- `parent` (`java.awt.Container`): The parent component, where the component will eventually be added.

**Returns:** `java.awt.Dimension`

### `addToParent(Component component, Container parent, Supplier<T> supplier)`

**Parameters:**
- `component` (`java.awt.Component`): The component.
- `parent` (`java.awt.Container`): The parent component, where the component will eventually be added.
- `supplier` (`java.util.function.Supplier<T>`): To be invoked.

**Returns:** `T`

