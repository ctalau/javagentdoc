# Interface: `Workspace`

**Package:** [`ro.sync.exml.workspace.api`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.Workspace`

**Extends:** [`ro.sync.exml.workspace.api.WorkspaceUtilities`](./WorkspaceUtilities.md)

## Description

## Methods

### `open(java.net.URL url)`

**Returns:** `boolean`

If the URL is already opened, the editor tab which contains it will be brought to front.

**Parameters:**
- `url` (`java.net.URL`): The URL of the file to be opened.

### `open(java.net.URL url, java.lang.String imposedPage)`

**Returns:** `boolean`

If the URL is already opened, the editor tab which contains it will be brought to front.

**Parameters:**
- `url` (`java.net.URL`): The URL of the file to be opened.
- `imposedPage` (`java.lang.String`): The imposed page for opening the URL. One of the page related constants from EditorPageConstants.

### `open(java.net.URL url, java.lang.String imposedPage, java.lang.String imposedContentType)`

**Returns:** `boolean`

If the URL is already opened, the editor tab which contains it will be brought to front.
 The imposed content type is used only in the Oxygen standalone application, it is not used in the Author Component and Eclipse plugin applications.

**Parameters:**
- `url` (`java.net.URL`): The URL of the file to be opened.
- `imposedPage` (`java.lang.String`): The imposed page for opening the URL. Can be `null` to perform the default behavior.
- `imposedContentType` (`java.lang.String`): The imposed content type, one of the constants in the interface ro.sync.exml.editor.ContentTypes. 

 This is useful if for example the URL does not have a file extension (maybe it is a CMS resource) but the caller of the API knows that it is XML.
 In this case the caller can provide the "text/xml" imposed content type for it to avoid Oxygen asking what type of resource the URL is.

 
 Another use case is for DITA Map URLs without an extension. The caller can pass the "application/ditamap" content type value to the API.
 In the standalone application Oxygen will ask the user where to open the DITA Map (DITA Maps Manager 
 or the main editor) and will continue the open procedure. 

 In the Oxygen Eclipse plugin the DITA Map will be opened directly in the DITA Maps Manager view. 

 
 Can be `null` to perform the default behavior.

### `saveAll()`

**Returns:** `void`

### `close(java.net.URL url)`

**Returns:** `boolean`

If the editor has unsaved content, the user will be given the opportunity to save it.

**Parameters:**
- `url` (`java.net.URL`): The url of the editor to be closed.

### `closeAll()`

**Returns:** `boolean`

If there are editors with unsaved content, the user will be given the opportunity to save them.

### `delete(java.net.URL url)`

**Returns:** `void`

Currently supported protocols are:
 

 - file://

 - zip://

 - ftp://

 - sftp://

 - http://

 - https://

**Parameters:**
- `url` (`java.net.URL`): The URL from where to delete a resource.

### `refreshInProject(java.net.URL url)`

**Returns:** `void`

**Parameters:**
- `url` (`java.net.URL`): The new resource

### `createNewEditor(java.lang.String extension, java.lang.String contentType, java.lang.String content)`

**Returns:** `java.net.URL`

The editor content is not saved on disk, this method is equivalent to using the "File -> New" action.

**Parameters:**
- `extension` (`java.lang.String`): The editor extension ("xml" or "dita" or "xsl" or "xsd", etc...)
- `contentType` (`java.lang.String`): The content type which can take values like: "text/xml" or "text/xsl" or "text/xsd", etc...
 If NULL, the content type will be automatically detected from the extension.
- `content` (`java.lang.String`): The XML content will be used to load the new editor from.

### `createNewEditor(java.net.URL saveTo, java.lang.String extension, java.lang.String contentType, java.lang.String content)`

**Returns:** `java.net.URL`

The editor content is not saved on disk, this method is equivalent to using the "File -> New" action.

**Parameters:**
- `saveTo` (`java.net.URL`): The URL where the new file will be saved when the save operation is invoked for the first time.
- `extension` (`java.lang.String`): The editor extension ("xml" or "dita" or "xsl" or "xsd", etc...). May be null if the saveTo URL is specified.
- `contentType` (`java.lang.String`): The content type which can take values like: "text/xml" or "text/xsl" or "text/xsd", etc...
 If NULL, the content type will be automatically detected from the extension.
- `content` (`java.lang.String`): The XML content will be used to load the new editor from.

### `isStandalone()`

**Returns:** `boolean`

### `setParentFrameTitle(java.lang.String parentFrameTitle)`

**Returns:** `void`

This is available only in the standalone Oxygen version (not available in the Oxygen Eclipse plugin).
 If NULL, will reset to the default title.

**Parameters:**
- `parentFrameTitle` (`java.lang.String`): The new title to set on the parent frame.
 If NULL, will reset to the default title.

