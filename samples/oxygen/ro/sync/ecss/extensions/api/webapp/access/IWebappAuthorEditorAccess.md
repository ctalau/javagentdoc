# Interface: `IWebappAuthorEditorAccess`

**Package:** [`ro.sync.ecss.extensions.api.webapp.access`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.access.IWebappAuthorEditorAccess`

**Extends:** [`ro.sync.ecss.extensions.api.access.AuthorEditorAccess`](../../access/AuthorEditorAccess.md)

## Description

## Methods

### `getReadOnlyReason()`

**Returns:** [`ro.sync.exml.workspace.api.editor.ReadOnlyReason`](../../../../../exml/workspace/api/editor/ReadOnlyReason.md)

### `isModified()`

**Returns:** `boolean`

If the modified status was set to true during a "compound edit" AuthorDocumentController#beginCompoundEdit() 
 this method should also be called inside the same "compound edit".

### `changeActiveCssGroups(`java.util.Set<java.lang.String>` titles)`

**Returns:** `void`

Each CSS file have a title associated with it.
 
 Call this method to change the active CSS files that will be used to render 
 the document from the current editor.
 
 To find the list of all available CSS titles for a specific document type 
 you can call DocumentTypeInfo#getAvailableCssGroups().

### `getActiveCssGroupsTitles()`

**Returns:** `java.util.List<java.lang.String>`

Each CSS file have a title associated with it.
 
 This method returns the list of titles for all (active) CSS files that are used to render 
 the document from the current editor.
 
 To find the list of all available CSS titles for a specific document type 
 you can call DocumentTypeInfo#getAvailableCssGroups().

