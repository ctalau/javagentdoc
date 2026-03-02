# Interface: `InputUrlComponentProvider`

**Package:** [`ro.sync.exml.workspace.api.standalone.ui.urlpanel`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.ui.urlpanel.InputUrlComponentProvider`

## Description

The component can be added to Swing-based panels.

## Methods

### `getUrl()`

**Returns:** `java.net.URL`

### `setUrl(java.net.URL url)`

**Parameters:**
- `url` (`java.net.URL`): The `URL` to be presented.

**Returns:** `void`

### `getUrlText()`

It will return the exact value of the combobox,
 without expanding any editor variable.

**Returns:** `java.lang.String`

### `setUrlText(java.lang.String newURL)`

Can contain unexpanded editor variables.

**Parameters:**
- `newURL` (`java.lang.String`): The new URL.

**Returns:** `void`

### `setEnabled(boolean enabled)`

**Parameters:**
- `enabled` (`boolean`): `true` to enable.

**Returns:** `void`

### `setUrlLabel(java.lang.String urlPresenterLabelText)`

By default the presented label is `URL`

**Parameters:**
- `urlPresenterLabelText` (`java.lang.String`): A new text for the label associated with the URL presenter component.
                                If `null`, the label will be hidden.

**Returns:** `void`

### `getJComponent()`

**Returns:** `javax.swing.JComponent`

### `addChangeListener(ro.sync.exml.workspace.api.standalone.ui.urlpanel.InputUrlComponentChangeListener listener)`

**Parameters:**
- `listener` ([`ro.sync.exml.workspace.api.standalone.ui.urlpanel.InputUrlComponentChangeListener`](./InputUrlComponentChangeListener.md)): The listener that notifies when the url is changed.

**Returns:** `void`

### `removeChangeListener(ro.sync.exml.workspace.api.standalone.ui.urlpanel.InputUrlComponentChangeListener listener)`

**Parameters:**
- `listener` ([`ro.sync.exml.workspace.api.standalone.ui.urlpanel.InputUrlComponentChangeListener`](./InputUrlComponentChangeListener.md)): The listener that notifies when the url is changed.

**Returns:** `void`

