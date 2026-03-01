# Interface: `InplaceEditingListener`

**Package:** [`ro.sync.ecss.extensions.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.editor.InplaceEditingListener`

**Extends:** [`ro.sync.ecss.extensions.api.editor.InplaceEditingTraversalListener`](./InplaceEditingTraversalListener.md)

## Description

**Unless a #editingOccured() is received the value will not be committed.**

 - #editingOccured() - signals an edit event inside the editor. This will mark
 the value from the editor as being dirty and requiring committing.

 - #editingCanceled() - a request to hide the editor without any commit.

 

 
 An editor implementation will have to add listeners onto itself like:
 

  - a KeyListener for handling key events like: ENTER to stop editing and ESCAPE to cancel it.

  - a FocusListener to stop editing when the focus is given to a component that is not 
  part of the editor.

  - a DocumentListener to fire #editingOccured() events (If the editor has a document).

## Methods

### `editingStopped([`ro.sync.ecss.extensions.api.editor.EditingEvent`](./EditingEvent.md) event)`

**Returns:** `void`

This will commit the value into the document **ONLY
 if the following conditions apply**:

 - an #editingOccured() event was received prior to this event.

 - the value that must be committed is different from the old value. The old
 value taken into account is either InplaceEditorArgumentKeys#INITIAL_VALUE or, if missing,
 InplaceEditorArgumentKeys#DEFAULT_VALUE.

 

 **OBS:** Before or after firing this event, the editor should release
 any held resources. For example a SWT editor will have to dispose() any 
 created images, fonts or controls.

### `editingCanceled()`

**Returns:** `void`

**OBS:** Before or after firing this event, the editor should release
 any held resources. For example a SWT editor will have to dispose() any 
 created images, fonts or controls.

### `editingOccured()`

**Returns:** `void`

OBS: THIS EVENT IS VERY IMPORTANT. If no #editingOccured() event
 is received, the value from the editor will not be committed when the editing 
 is stopped. See #editingStopped(EditingEvent) for more information.

### `commitValue([`ro.sync.ecss.extensions.api.editor.EditingEvent`](./EditingEvent.md) event)`

**Returns:** `void`

Will only commit if a new string value is provided and only if the value 
 that must be committed is different from the current value.
 
 Normally, this kind of event should be preceded by an #editingOccured() event.

