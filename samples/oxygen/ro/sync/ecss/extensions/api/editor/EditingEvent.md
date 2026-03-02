# Class: `EditingEvent`

**Package:** [`ro.sync.ecss.extensions.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.editor.EditingEvent`

## Description

It will provide the committed value if such
 a value exists for the current type of editor. For example a 
 InplaceEditorCSSConstants#TYPE_BUTTON doesn't give such a value. In this
 case when the notification is received we will just invoke the action associated 
 with the button.
 
 A custom form control that wants to perform more custom operation can wrap
 these on a Runnable and give then on the EditingEvent#customEdit
 field. This is the recommended way for performing custom changes.

## Fields

### `val`

**Type:** `java.lang.String`

If the type of 
 editor used can provide such a value.
 
 When editing an attribute value, an empty string will result in deleting the 
 attribute.

### `toInvoke`

**Type:** [`ro.sync.ecss.extensions.api.editor.IAuthorExtensionAction`](./IAuthorExtensionAction.md)

### `requestFocusInHost`

**Type:** `boolean`

Depending on how the editing was stopped it might be necessary to skip requesting
 focus inside the author component. For example if the cause of the stop editing
 was a focus lost event, we should skip requesting focus since the focus has already 
 a destination.

### `customEdit`

**Type:** `java.lang.Runnable`

This will ensure
 a more seamless integration by letting Oxygen decide when to make the custom changes.

## Constructors

### `<init>(String val)`

**Parameters:**
- `val` (`java.lang.String`): The value that the user accepted when the editing stopped.

### `<init>(Runnable toInvoke, boolean requestFocus)`

**Parameters:**
- `toInvoke` (`java.lang.Runnable`): The action to be invoked as a result for the edit event.
- `requestFocus` (`boolean`): `true` if the focus should be requested inside the author component.
   Depending on how the editing was stopped it might be necessary to skip requesting
   focus inside the author component. For example if the cause of the stop editing
   was a focus lost event, we should skip requesting focus since the focus has already 
   a destination.

### `<init>(IAuthorExtensionAction toInvoke)`

**Parameters:**
- `toInvoke` ([`ro.sync.ecss.extensions.api.editor.IAuthorExtensionAction`](./IAuthorExtensionAction.md)): The action to be invoked as a result for the edit event.

### `<init>(String value, boolean requestFocus)`

**Parameters:**
- `value` (`java.lang.String`): The value that the user accepted when the editing stopped.
- `requestFocus` (`boolean`): `true` if the focus should be requested inside the author component.
   Depending on how the editing was stopped it might be necessary to skip requesting
   focus inside the author component. For example if the cause of the stop editing
   was a focus lost event, we should skip requesting focus since the focus has already 
   a destination.

### `<init>(Runnable customEdit, IAuthorExtensionAction toInvoke, String value, boolean requestFocus)`

**Parameters:**
- `customEdit` (`java.lang.Runnable`)
- `toInvoke` ([`ro.sync.ecss.extensions.api.editor.IAuthorExtensionAction`](./IAuthorExtensionAction.md))
- `value` (`java.lang.String`)
- `requestFocus` (`boolean`)

