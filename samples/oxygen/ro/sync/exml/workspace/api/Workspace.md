# Interface: `Workspace`

**Package:** [`ro.sync.exml.workspace.api`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.Workspace`

**Extends:** [`ro.sync.exml.workspace.api.WorkspaceUtilities`](./WorkspaceUtilities.md)

## Description

## Methods

### `open(`java.net.URL` url)`

**Returns:** `boolean`

If the URL is already opened, the editor tab which contains it will be brought to front.

### `open(`java.net.URL` url, `java.lang.String` imposedPage)`

**Returns:** `boolean`

If the URL is already opened, the editor tab which contains it will be brought to front.

### `open(`java.net.URL` url, `java.lang.String` imposedPage, `java.lang.String` imposedContentType)`

**Returns:** `boolean`

If the URL is already opened, the editor tab which contains it will be brought to front.
 The imposed content type is used only in the Oxygen standalone application, it is not used in the Author Component and Eclipse plugin applications.

### `saveAll()`

**Returns:** `void`

### `close(`java.net.URL` url)`

**Returns:** `boolean`

If the editor has unsaved content, the user will be given the opportunity to save it.

### `closeAll()`

**Returns:** `boolean`

If there are editors with unsaved content, the user will be given the opportunity to save them.

### `delete(`java.net.URL` url)`

**Returns:** `void`

Currently supported protocols are:
 

 - file://

 - zip://

 - ftp://

 - sftp://

 - http://

 - https://

### `refreshInProject(`java.net.URL` url)`

**Returns:** `void`

### `createNewEditor(`java.lang.String` extension, `java.lang.String` contentType, `java.lang.String` content)`

**Returns:** `java.net.URL`

The editor content is not saved on disk, this method is equivalent to using the "File -> New" action.

### `createNewEditor(`java.net.URL` saveTo, `java.lang.String` extension, `java.lang.String` contentType, `java.lang.String` content)`

**Returns:** `java.net.URL`

The editor content is not saved on disk, this method is equivalent to using the "File -> New" action.

### `isStandalone()`

**Returns:** `boolean`

### `setParentFrameTitle(`java.lang.String` parentFrameTitle)`

**Returns:** `void`

This is available only in the standalone Oxygen version (not available in the Oxygen Eclipse plugin).
 If NULL, will reset to the default title.

