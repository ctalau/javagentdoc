# Interface: `EditorComponentProvider`

**Package:** [`ro.sync.ecss.extensions.api.component`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.component.EditorComponentProvider`

**Extends:** [`ro.sync.ecss.extensions.api.component.ComponentProvider`](./ComponentProvider.md)

## Description

The editor might have multiple editor pages.

## Fields

### `OUTLINER_PANEL_ID`

**Type:** `int`

### `ATTRIBUTES_PANEL_ID`

**Type:** `int`

### `MODEL_PANEL_ID`

**Type:** `int`

### `ELEMENTS_PANEL_ID`

**Type:** `int`

### `ENTITIES_PANEL_ID`

**Type:** `int`

### `REVIEWS_PANEL_ID`

**Type:** `int`

## Methods

### `showLocation(URL url, Reader reader)`

If the document pointed by this URL is different than the document currently 
 loaded in the editor page, this URL will be used to set the content to edit, 
 to solve relative references (eg: images) and to show the location pointed by the
 URL reference part. 
 

 If the document pointed by this URL is currently loaded in the editor page,
 only the reference part of the given URL will be used to show the corresponding location
 in the editor.

**Parameters:**
- `url` (`java.net.URL`): The URL to show location for.
- `reader` (`java.io.Reader`): The reader over the URL, can be null.

**Returns:** `void`

### `addAuthorComponentListener(AuthorComponentListener listener)`

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.component.listeners.AuthorComponentListener`](listeners/AuthorComponentListener.md)): The listener.

**Returns:** `void`

### `removeAuthorComponentListener(AuthorComponentListener listener)`

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.component.listeners.AuthorComponentListener`](listeners/AuthorComponentListener.md)): The listener.

**Returns:** `void`

### `getAdditionalEditHelper(int helperID)`

It can be the outline, attributes, entities, elements or model helper component, depending on the ID.

**Parameters:**
- `helperID` (`int`): One of:
                   
  
                    - ATTRIBUTES_PANEL_ID,
                    - ELEMENTS_PANEL_ID, 
                    - ENTITIES_PANEL_ID,
                    - MODEL_PANEL_ID,
                    - OUTLINER_PANEL_ID constants.

**Returns:** `javax.swing.JComponent`

