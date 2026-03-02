# Class: `WSEditorChangeListener`

**Package:** [`ro.sync.exml.workspace.api.listeners`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.listeners.WSEditorChangeListener`

## Description

## Constructors

### `<init>()`

## Methods

### `editorAboutToBeOpenedVeto(URL editorLocation)`

You can reject the opening of the editor by returning `false`.
 If the open is not rejected then the WSEditorChangeListener#editorAboutToBeOpened(URL) and then WSEditorChangeListener#editorOpened(URL) methods will be called.
 If you want to open another file instead, you must start a thread which calls the API to open the other file and then return `false`.
 Calling API to open another resource directly on this callback will block Oxygen.
 
 This method is not called in the Eclipse plugin.

**Parameters:**
- `editorLocation` (`java.net.URL`): The editor's location.

**Returns:** `boolean`

### `editorAboutToBeOpened(URL editorLocation)`

If the open does not fail, then the WSEditorChangeListener#editorOpened(URL) method will be called.

**Parameters:**
- `editorLocation` (`java.net.URL`): The editor's location

**Returns:** `void`

### `editorOpened(URL editorLocation)`

**Parameters:**
- `editorLocation` (`java.net.URL`): The editor's location

**Returns:** `void`

### `editorClosed(URL editorLocation)`

**Parameters:**
- `editorLocation` (`java.net.URL`): The editor's location

**Returns:** `void`

### `editorSelected(URL editorLocation)`

**Parameters:**
- `editorLocation` (`java.net.URL`): The editor's location. Can be `null` if no editor is opened or a switch between editors is pending.

**Returns:** `void`

### `editorPageChanged(URL editorLocation)`

This means the user switched for example from the **Text** to the **Author** page.
 An XML Editor usually has 3 pages: **Text**, **Grid** and **Author**.

**Parameters:**
- `editorLocation` (`java.net.URL`): The editor's location

**Returns:** `void`

### `editorActivated(URL editorLocation)`

It is the selected editor but also the editor in which the focus is present.

**Parameters:**
- `editorLocation` (`java.net.URL`): The editor's location

**Returns:** `void`

### `editorDeactivated(URL editorLocation)`

Focus is no longer present in it. 
 Maybe the editor was already closed.

**Parameters:**
- `editorLocation` (`java.net.URL`): The editor's location

**Returns:** `void`

### `editorAboutToBeClosed(URL editorLocation)`

You can reject the close of the editor by returning `false`.

**Parameters:**
- `editorLocation` (`java.net.URL`): The editor's location

**Returns:** `boolean`

### `editorRelocated(URL previousEditorLocation, URL newEditorLocation)`

Probably **Save As** was called on the opened editor.

**Parameters:**
- `previousEditorLocation` (`java.net.URL`): The previous editor's location
- `newEditorLocation` (`java.net.URL`): The current editor's location
   
   In the standalone Oxygen version the listener is usually called after the 
   end user has used the "Save as" or "Save to URL" actions and saved the editor contents somewhere else.
   
   This method is not called in the Eclipse plugin.

**Returns:** `void`

### `editorsAboutToBeClosed(URL[] editorLocations)`

This event is triggered before the application will try to check which of these editors are modified and to show a batch save dialog for them.
 You can reject the close of the editor by returning `false`.
 If the callback is not rejected, you will also receive individual "editorAboutToBeClosed" and 
 "editorClosed" callbacks for each of the editors while they are being individually closed.
  
 This callback is only received in the Oxygen standalone application so it is not received in the Oxygen Eclipse Plugin.

**Parameters:**
- `editorLocations` (`java.net.URL[]`): The locations of the editors which will be batch closed.

**Returns:** `boolean`

