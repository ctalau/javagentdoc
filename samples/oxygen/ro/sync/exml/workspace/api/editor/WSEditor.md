# Interface: `WSEditor`

**Package:** [`ro.sync.exml.workspace.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.WSEditor`

**Extends:** [`ro.sync.exml.workspace.api.editor.WSEditorBase`](./WSEditorBase.md), [`ro.sync.exml.editor.EditorPageConstants`](../../../editor/EditorPageConstants.md)

## Description

## Methods

### `getCurrentPage()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.WSEditorPage`](page/WSEditorPage.md)

### `getCurrentPageID()`

**Returns:** `java.lang.String`

### `addPageChangedListener(ro.sync.exml.workspace.api.listeners.WSEditorPageChangedListener pageChangedListener)`

**Parameters:**
- `pageChangedListener` ([`ro.sync.exml.workspace.api.listeners.WSEditorPageChangedListener`](../listeners/WSEditorPageChangedListener.md)): The page changed listener.
   
  
  
   Note that in Reviewer edition only the Author page is available.

**Returns:** `void`

### `removePageChangedListener(ro.sync.exml.workspace.api.listeners.WSEditorPageChangedListener pageChangedListener)`

**Parameters:**
- `pageChangedListener` ([`ro.sync.exml.workspace.api.listeners.WSEditorPageChangedListener`](../listeners/WSEditorPageChangedListener.md)): The page changed listener.
   
  
  
   Note that in Reviewer edition only the Author page is available.

**Returns:** `void`

### `addEditorListener(ro.sync.exml.workspace.api.listeners.WSEditorListener editorListener)`

**Parameters:**
- `editorListener` ([`ro.sync.exml.workspace.api.listeners.WSEditorListener`](../listeners/WSEditorListener.md)): The editor listener.

**Returns:** `void`

### `getEditorListeners()`

**Returns:** [`ro.sync.exml.workspace.api.listeners.WSEditorListener[]`](../listeners/WSEditorListener.md)

### `removeEditorListener(ro.sync.exml.workspace.api.listeners.WSEditorListener editorListener)`

**Parameters:**
- `editorListener` ([`ro.sync.exml.workspace.api.listeners.WSEditorListener`](../listeners/WSEditorListener.md)): The editor listener.

**Returns:** `void`

### `changePage(java.lang.String pageID)`

This does not affect editors opened in the DITA Maps Manager.
 If problems occur during the page switch or the page ID is not recognized the page will be switched to Text and the operation is aborted.
 


 Note that in Reviewer edition only the Author page is available.

**Parameters:**
- `pageID` (`java.lang.String`): The ID of the page, one of the constant fields: 
   EditorPageConstants#PAGE_TEXT, EditorPageConstants#PAGE_AUTHOR, EditorPageConstants#PAGE_GRID, 
   EditorPageConstants#PAGE_DESIGN

**Returns:** `void`

### `addValidationProblemsFilter(ro.sync.exml.workspace.api.editor.validation.ValidationProblemsFilter validationProblemsFilter)`

Validation can be manual or automatic.
 Automatic validation is done when modifications occur in the XML file.

**Parameters:**
- `validationProblemsFilter` ([`ro.sync.exml.workspace.api.editor.validation.ValidationProblemsFilter`](validation/ValidationProblemsFilter.md)): a filter for problems encountered during validation of the current editor.

**Returns:** `void`

### `removeValidationProblemsFilter(ro.sync.exml.workspace.api.editor.validation.ValidationProblemsFilter validationProblemsFilter)`

Validation can be manual or automatic.
 Automatic validation is done when modifications occur in the XML file.

**Parameters:**
- `validationProblemsFilter` ([`ro.sync.exml.workspace.api.editor.validation.ValidationProblemsFilter`](validation/ValidationProblemsFilter.md)): a filter for problems encountered during validation of the current editor.

**Returns:** `void`

### `checkValid()`

For document types which do not support validation, this returns always `true`.
 If you want to see the problems reported by the validation process you can add a validation problems filter #addValidationProblemsFilter(ValidationProblemsFilter).

**Returns:** `boolean`

### `checkValid(boolean automatic)`

For document types which do not support validation, this returns always `true`.
 If you want to see the problems reported by the validation process you can add a validation problems filter #addValidationProblemsFilter(ValidationProblemsFilter).

**Parameters:**
- `automatic` (`boolean`): `true` If Oxygen performs automatic validation 
                        (identical with the validation performed when the document is modified) 
                        or `false` if Oxygen should perform manual validation 
                        (identical to the validation made when you press the Validate toolbar action).

**Returns:** `boolean`

### `getComponent()`

Use of this method is discouraged but it may be useful in some cases like:
 
 This can be helpful when you want to set a busy cursor on the entire editor 
 or when you want to get access to the swing JTabbedPane pane where the editor is located.

**Returns:** `java.lang.Object`

### `setEditable(boolean editable)`

This method is not available in the Oxygen Eclipse plugin which relies on the IEditorInput for the information.

**Parameters:**
- `editable` (`boolean`): `true` if the editor should be editable.

**Returns:** `void`

### `isEditable()`

A document can be set as read-only from API, by using the 
 #setEditable(boolean) method.

**Returns:** `boolean`

### `getContentType()`

**Returns:** `java.lang.String`

### `reloadIfChangeOnDiskDetected()`

If the timestamps differ the 
 document will be reloaded or the user will be asked if the document contains unsaved modifications.

 This method is implemented only for the desktop version of the application.

**Returns:** `void`

### `reload()`

If the document contains unsaved changes, the end user is asked if they want to continue the reload and lose the modifications.

 This method is implemented only for the desktop version of the application.

**Returns:** `void`

