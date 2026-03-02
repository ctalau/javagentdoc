# Class: `AuthorComponentProvider`

**Package:** [`ro.sync.ecss.extensions.api.component`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.component.AuthorComponentProvider`

**Extends:** [`ro.sync.ecss.extensions.api.component.AbstractComponentProvider`](./AbstractComponentProvider.md)

## Constructors

### `<init>(f arg0, Frame arg1, String[] arg2, String arg3)`

**Parameters:**
- `arg0` (`ro.sync.exml.workspace.b.i.f`)
- `arg1` (`java.awt.Frame`)
- `arg2` (`java.lang.String[]`)
- `arg3` (`java.lang.String`)

## Methods

### `createEditor(j arg0, Frame arg1, String[] arg2, String arg3, String arg4)`

**Parameters:**
- `arg0` (`ro.sync.exml.workspace.b.i.j`)
- `arg1` (`java.awt.Frame`)
- `arg2` (`java.lang.String[]`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)

**Returns:** `ro.sync.exml.editor.dd`

### `setEditorPopUpCustomizer(PopupMenuCustomizer arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.component.PopupMenuCustomizer`](./PopupMenuCustomizer.md))

**Returns:** `void`

### `setOutlinerPopUpCustomizer(PopupMenuCustomizer arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.component.PopupMenuCustomizer`](./PopupMenuCustomizer.md))

**Returns:** `void`

### `showBreadCrumb(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `setBreadCrumbPopUpCustomizer(PopupMenuCustomizer arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.component.PopupMenuCustomizer`](./PopupMenuCustomizer.md))

**Returns:** `void`

### `createExtensionActionsToolbars()`

**Returns:** `java.util.List<javax.swing.JToolBar>`

### `getAuthorExtensionActions()`

**Returns:** `java.util.Map<java.lang.String,javax.swing.AbstractAction>`

### `getAuthorCommonActions()`

**Returns:** `java.util.Map<java.lang.String,javax.swing.AbstractAction>`

### `getAuthorAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md)

