# Class: `WSEditorListener`

**Package:** [`ro.sync.exml.workspace.api.listeners`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.listeners.WSEditorListener`

**Extends:** [`ro.sync.exml.workspace.api.listeners.WSEditorPageChangedListener`](./WSEditorPageChangedListener.md)

## Description

The listener is added to a WSEditor and receives different callbacks.

## Fields

### `SAVE_OPERATION`

**Type:** `int`

### `SAVE_AS_OPERATION`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `editorAboutToBeSavedVeto(int operationType)`

**Parameters:**
- `operationType` (`int`): The operation type. One of the constants WSEditorListener#SAVE_AS_OPERATION or WSEditorListener#SAVE_OPERATION.

**Returns:** `boolean`

### `editorSaved(int operationType)`

**Parameters:**
- `operationType` (`int`): The operation type. One of the constants WSEditorListener#SAVE_AS_OPERATION or WSEditorListener#SAVE_OPERATION.

**Returns:** `void`

### `documentTypeExtensionsReconfigured()`

For example after a document is opened, the application will re-configure the framework-specific toolbar. After this, the callback will be received.
 So if you are using code which for example tries to add a listener to one of the actions on the framework-specific toolbar, 
 the code should re-add the listener when the callback is received.

**Returns:** `void`

### `editorAboutToBeClosedVeto(URL editorLocation)`

Decide if the closing should proceed or not.


 This method is not called from the Eclipse plug-in. It works only with the stand-alone application.

**Parameters:**
- `editorLocation` (`java.net.URL`): The URL of the editor.

**Returns:** `boolean`

### `editorReloaded(URL editorURL)`

Probably F5 was pressed.

**Parameters:**
- `editorURL` (`java.net.URL`): The URL for which the content has been reloaded.

**Returns:** `void`

