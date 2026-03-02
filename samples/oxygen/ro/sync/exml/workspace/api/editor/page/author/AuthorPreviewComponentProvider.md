# Interface: `AuthorPreviewComponentProvider`

**Package:** [`ro.sync.exml.workspace.api.editor.page.author`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.author.AuthorPreviewComponentProvider`

## Description

## Methods

### `load(URL url, Reader reader)`

**Parameters:**
- `url` (`java.net.URL`): The system id of the resource. If `null`, the reader must be provided 
   and relative DTD entity references will not be properly resolved.
- `reader` (`java.io.Reader`): The document reader. If `null`, the reader will be created internally.

**Returns:** `void`

### `getAuthorAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../../../ecss/extensions/api/AuthorAccess.md)

### `getComponent()`

**Returns:** `java.lang.Object`

