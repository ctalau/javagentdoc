# Interface: `InplaceEditor`

**Package:** [`ro.sync.ecss.extensions.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.editor.InplaceEditor`

**Extends:** [`ro.sync.ecss.extensions.api.Extension`](../Extension.md)

## Description

Subclasses contain implementation based on real
 SWT or Swing components like combo boxes, text fields, check boxes, buttons etc.
 
 
An editor is associated with an oxy_editor CSS function and is invoked on user interaction.
 It only handles edit requests while the InplaceRenderer will handle the 
 painting of the value to edit.
 
An editor implementation is used through the oxy_editor function like this:
 

```

 code {
   content: 
     "Attr1: " oxy_editor(type, combo, edit, '@attr1')
     "Attr2: " oxy_editor(type, text, edit, '@attr2')
  }
 
```

 In the previous example a predefined **combo** editor is requested for editing the value 
 of attribute **attr1** and a predefined **text** editor for editing attribute **attr2**. 
 
 For a custom implementation properties InplaceEditorCSSConstants#PROPERTY_SWING_EDITOR_CLASS_NAME
 and InplaceEditorCSSConstants#PROPERTY_SWT_EDITOR_CLASS_NAME must be used:
 

```

 myElement {
   content: oxy_editor(
       rendererClassName, "com.custom.editors.CustomRenderer",
       swingEditorClassName, "com.custom.editors.SwingCustomEditor",
       swtEditorClassName, "com.custom.editors.SwtCustomEditor",
       edit, "@my_attr"
       customProperty1, "customValue1",
       customProperty2, "customValue2"
   )
 }
 
```

 In the previous example, the editor classes com.custom.editors.SwingCustomEditor and 
 com.custom.editors.SwtCustomEditor must be added in the Classpath of the 
 document type associated with the edited document.
 
 
 
It is recommended to extend the adapter class InplaceEditorRendererAdapter or
 InplaceEditorAdapter in order to be protected from future API additions.
 
 
A SWT implementation should also implement org.eclipse.jface.text.ITextOperationTarget
 so that it will be delegated with events of UNDO, REDO, CUT, PASTE, SELECT ALL.

## Methods

### `getEditorComponent(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context, ro.sync.exml.view.graphics.Rectangle allocation, ro.sync.exml.view.graphics.Point mouseInvocationLocation)`

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md)): The context where the editor will be used.
- `allocation` (`ro.sync.exml.view.graphics.Rectangle`): The bounds where the editor will be shown. This is normally
   the bounds of the box in which the value being edited is rendered. If the 
   editor requires to be presented in different bounds it should alter this parameter.
   The X,Y coordinates are relative to the parent in which the editor will be added.
- `mouseInvocationLocation` (`ro.sync.exml.view.graphics.Point`): if the editor was requested using the mouse this
   parameter represents the X,Y location where the event took place. It is relative to the parent
   in which the editor will be added. `null` if the editor wasn't requested through 
   mouse interaction.
   
   
  
   
  
   **OBS**: This is the very first call received by an editor. This ensures that the 
   editor is properly initialized for the subsequent calls (like a #requestFocus() call).
   
  
   **OBS**: An editor implementation will have to add listeners onto itself like:
   
  
    - a KeyListener for handling key events like: ENTER to stop editing 
    (by calling InplaceEditingListener#editingStopped(EditingEvent)) 
    and ESCAPE to cancel it (by calling InplaceEditingListener#editingCanceled()).
  
    - a FocusListener to stop editing when the focus is given to a component that is not 
    part of the editor (by calling InplaceEditingListener#editingStopped(EditingEvent)).
  
    - a DocumentListener to fire InplaceEditingListener#editingOccured() events (If the editor has a document).

**Returns:** `java.lang.Object`

### `getScrollRectangle()`

The coordinate should be relative to the editor itself.
 
 The default behavior is to make the entire editor visible but if the editor
 is bigger than the viewport the visible part might not be the right one. For
 example is the editor is a text field the caret might not be visible. This is
 when this method is useful. The caret rectangle should be returned so that 
 the part of the editor with the caret is presented.

**Returns:** `ro.sync.exml.view.graphics.Rectangle`

### `addEditingListener(ro.sync.ecss.extensions.api.editor.InplaceEditingListener editingListener)`

- InplaceEditingListener#editingOccured() to signal modification in 
   the editor. This event marks the editor as dirty and it's value will be 
   committed when a InplaceEditingListener#editingStopped(EditingEvent)
   is received.
 - InplaceEditingListener#editingStopped(EditingEvent) to end editing
   and commit it's value if needed. The value is usually committed ONLY if 
   a InplaceEditingListener#editingOccured() was fired. See
   InplaceEditingListener#editingStopped(EditingEvent) for more information.

**Parameters:**
- `editingListener` ([`ro.sync.ecss.extensions.api.editor.InplaceEditingListener`](./InplaceEditingListener.md)): Editing listener.

**Returns:** `void`

### `requestFocus()`

**Returns:** `void`

### `getValue()`

**Returns:** `java.lang.Object`

### `stopEditing()`

The editor should release
 any held resources and notify InplaceEditingListener#editingStopped(EditingEvent).
 
 OBS: The current value will be committed only if at least one 
 InplaceEditingListener#editingOccured() event was issued before this moment.

**Returns:** `void`

### `commitValue()`

Will only commit if a new string value is provided and only if the value 
 that must be committed is different from the current value.

**Returns:** `void`

### `cancelEditing()`

The editor should release
 any held resources and notify InplaceEditingListener#editingCanceled().

**Returns:** `void`

### `removeEditingListener(ro.sync.ecss.extensions.api.editor.InplaceEditingListener editingListener)`

**Parameters:**
- `editingListener` ([`ro.sync.ecss.extensions.api.editor.InplaceEditingListener`](./InplaceEditingListener.md)): Editing listener.

**Returns:** `void`

### `refresh(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context)`

In this situation it might be good 
 for the editor to refresh the presented data.
 
 


 
 Currently this method is called if:
 

    - 
        This editor edits an attribute and the same attribute was externally modified.
        In this situation is recommended for the editor to update the current value.

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md)): An updated editing context for this editor.

**Returns:** `void`

### `insertContent(java.lang.String content)`

The form control should insert this text as it sees fit. For example a text field
 might insert it at the caret position. An example when this event comes is when the user 
 uses the Character Map Dialog to insert characters directly into a form control.

**Parameters:**
- `content` (`java.lang.String`): Content to be inserted.

**Returns:** `boolean`

### `allowsRepostingEvents()`

**Returns:** `boolean`

