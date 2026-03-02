# Class: `WSEditorChangeListener`

**Package:** [`ro.sync.exml.workspace.api.listeners`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.listeners.WSEditorChangeListener`

## Description

## Constructors

### `<init>()`

## Methods

### `editorAboutToBeOpenedVeto(java.net.URL editorLocation)`

**Returns:** `boolean`

You can reject the opening of the editor by returning `false`.
 If the open is not rejected then the WSEditorChangeListener#editorAboutToBeOpened(URL) and then WSEditorChangeListener#editorOpened(URL) methods will be called.
 If you want to open another file instead, you must start a thread which calls the API to open the other file and then return `false`.
 Calling API to open another resource directly on this callback will block Oxygen.
 
 This method is not called in the Eclipse plugin.

**Parameters:**
- `editorLocation` (`java.net.URL`): The editor's location.

### `editorAboutToBeOpened(java.net.URL editorLocation)`

**Returns:** `void`

If the open does not fail, then the WSEditorChangeListener#editorOpened(URL) method will be called.

**Parameters:**
- `editorLocation` (`java.net.URL`): The editor's location

### `editorOpened(java.net.URL editorLocation)`

**Returns:** `void`

**Parameters:**
- `editorLocation` (`java.net.URL`): The editor's location

### `editorClosed(java.net.URL editorLocation)`

**Returns:** `void`

**Parameters:**
- `editorLocation` (`java.net.URL`): The editor's location

### `editorSelected(java.net.URL editorLocation)`

**Returns:** `void`

**Parameters:**
- `editorLocation` (`java.net.URL`): The editor's location. Can be `null` if no editor is opened or a switch between editors is pending.

### `editorPageChanged(java.net.URL editorLocation)`

**Returns:** `void`

This means the user switched for example from the **Text** to the **Author** page.
 An XML Editor usually has 3 pages: **Text**, **Grid** and **Author**.

**Parameters:**
- `editorLocation` (`java.net.URL`): The editor's location

### `editorActivated(java.net.URL editorLocation)`

**Returns:** `void`

It is the selected editor but also the editor in which the focus is present.

**Parameters:**
- `editorLocation` (`java.net.URL`): The editor's location

### `editorDeactivated(java.net.URL editorLocation)`

**Returns:** `void`

Focus is no longer present in it. 
 Maybe the editor was already closed.

**Parameters:**
- `editorLocation` (`java.net.URL`): The editor's location

### `editorAboutToBeClosed(java.net.URL editorLocation)`

**Returns:** `boolean`

You can reject the close of the editor by returning `false`.

**Parameters:**
- `editorLocation` (`java.net.URL`): The editor's location

### `editorRelocated(java.net.URL previousEditorLocation, java.net.URL newEditorLocation)`

**Returns:** `void`

Probably **Save As** was called on the opened editor.

**Parameters:**
- `previousEditorLocation` (`java.net.URL`): The previous editor's location
- `newEditorLocation` (`java.net.URL`): The current editor's location
 
 In the standalone Oxygen version the listener is usually called after the 
 end user has used the "Save as" or "Save to URL" actions and saved the editor contents somewhere else.
 
 This method is not called in the Eclipse plugin.

### `editorsAboutToBeClosed(java.net.URL[] editorLocations)`

**Returns:** `boolean`

This event is triggered before the application will try to check which of these editors are modified and to show a batch save dialog for them.
 You can reject the close of the editor by returning `false`.
 If the callback is not rejected, you will also receive individual "editorAboutToBeClosed" and 
 "editorClosed" callbacks for each of the editors while they are being individually closed.
  
 This callback is only received in the Oxygen standalone application so it is not received in the Oxygen Eclipse Plugin.

**Parameters:**
- `editorLocations` (`java.net.URL[]`): The locations of the editors which will be batch closed.

