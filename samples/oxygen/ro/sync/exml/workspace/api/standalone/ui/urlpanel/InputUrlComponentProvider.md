# Interface: `InputUrlComponentProvider`

**Package:** [`ro.sync.exml.workspace.api.standalone.ui.urlpanel`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.ui.urlpanel.InputUrlComponentProvider`

## Description

The component can be added to Swing-based panels.

## Methods

### `getUrl()`

**Returns:** `java.net.URL`

### `setUrl(`java.net.URL` url)`

**Returns:** `void`

### `getUrlText()`

**Returns:** `java.lang.String`

It will return the exact value of the combobox,
 without expanding any editor variable.

### `setUrlText(`java.lang.String` newURL)`

**Returns:** `void`

Can contain unexpanded editor variables.

### `setEnabled(`boolean` enabled)`

**Returns:** `void`

### `setUrlLabel(`java.lang.String` urlPresenterLabelText)`

**Returns:** `void`

By default the presented label is `URL`

### `getJComponent()`

**Returns:** `javax.swing.JComponent`

### `addChangeListener([`ro.sync.exml.workspace.api.standalone.ui.urlpanel.InputUrlComponentChangeListener`](./InputUrlComponentChangeListener.md) listener)`

**Returns:** `void`

### `removeChangeListener([`ro.sync.exml.workspace.api.standalone.ui.urlpanel.InputUrlComponentChangeListener`](./InputUrlComponentChangeListener.md) listener)`

**Returns:** `void`

