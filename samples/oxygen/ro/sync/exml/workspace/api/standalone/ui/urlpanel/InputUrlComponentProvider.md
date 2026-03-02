# Interface: `InputUrlComponentProvider`

**Package:** [`ro.sync.exml.workspace.api.standalone.ui.urlpanel`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.ui.urlpanel.InputUrlComponentProvider`

## Description

The component can be added to Swing-based panels.

## Methods

### `getUrl()`

**Returns:** `java.net.URL`

### `setUrl(java.net.URL url)`

**Returns:** `void`

**Parameters:**
- `url` (`java.net.URL`): The `URL` to be presented.

### `getUrlText()`

**Returns:** `java.lang.String`

It will return the exact value of the combobox,
 without expanding any editor variable.

### `setUrlText(java.lang.String newURL)`

**Returns:** `void`

Can contain unexpanded editor variables.

**Parameters:**
- `newURL` (`java.lang.String`): The new URL.

### `setEnabled(boolean enabled)`

**Returns:** `void`

**Parameters:**
- `enabled` (`boolean`): `true` to enable.

### `setUrlLabel(java.lang.String urlPresenterLabelText)`

**Returns:** `void`

By default the presented label is `URL`

**Parameters:**
- `urlPresenterLabelText` (`java.lang.String`): A new text for the label associated with the URL presenter component.
                              If `null`, the label will be hidden.

### `getJComponent()`

**Returns:** `javax.swing.JComponent`

### `addChangeListener(ro.sync.exml.workspace.api.standalone.ui.urlpanel.InputUrlComponentChangeListener listener)`

**Returns:** `void`

**Parameters:**
- `listener` ([`ro.sync.exml.workspace.api.standalone.ui.urlpanel.InputUrlComponentChangeListener`](./InputUrlComponentChangeListener.md)): The listener that notifies when the url is changed.

### `removeChangeListener(ro.sync.exml.workspace.api.standalone.ui.urlpanel.InputUrlComponentChangeListener listener)`

**Returns:** `void`

**Parameters:**
- `listener` ([`ro.sync.exml.workspace.api.standalone.ui.urlpanel.InputUrlComponentChangeListener`](./InputUrlComponentChangeListener.md)): The listener that notifies when the url is changed.

