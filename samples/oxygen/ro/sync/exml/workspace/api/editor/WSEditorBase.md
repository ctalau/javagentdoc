# Interface: `WSEditorBase`

**Package:** [`ro.sync.exml.workspace.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.WSEditorBase`

**Extends:** [`ro.sync.exml.workspace.api.base.ModifiedStatusProvider`](../base/ModifiedStatusProvider.md), [`ro.sync.exml.workspace.api.editor.ScenarioInvoker`](./ScenarioInvoker.md)

## Description

## Methods

### `getEncodingForSerialization()`

**Returns:** `java.lang.String`

### `getEditorLocation()`

**Returns:** `java.net.URL`

### `save()`

**Returns:** `void`

### `saveAs(java.net.URL location)`

This method is not implemented in the Oxygen Eclipse plugin.

**Parameters:**
- `location` (`java.net.URL`): The new editor location.

**Returns:** `void`

### `close(boolean askForSave)`

If the editor has unsaved content and `askForSave` is
 `true`, the user will be given the opportunity to save it.

**Parameters:**
- `askForSave` (`boolean`): `true` to save the editor contents if required,
              and `false` to discard any unsaved changes.

**Returns:** `boolean`

### `setModified(boolean modified)`

For SWT the result of this method is guaranteed only when working exclusively with the author page. 
 If the text page contains modifications (and is marked as dirty) this method is unable to change its state 
 to unmodified. 

 
For Web Author, can be used to mark the document as clean and to make sure that the clean state is 
 properly identified after a series of undo/redo operations. This method has some limitations: 
 

   -  It does not automatically update the client-side editor dirty status.
   -  It does nothing if invoked during a "compound edit"
   (see AuthorDocumentController.beginCompoundEdit()). Note that a "compound edit" is 
   created automatically when invoking an AuthorOperation that does not extend 
   AuthorOperationWithCustomUndoBehavior.
   - it does nothing if invoked with `false`.

**Parameters:**
- `modified` (`boolean`): `true` if the document in the current editor contains unsaved modifications.

**Returns:** `void`

### `isNewDocument()`

**Returns:** `boolean`

### `createContentReader()`

The unsaved changes are included. If for the Author page change tracking highlights are present, they are also included as processing instructions.

**Returns:** `java.io.Reader`

### `createContentInputStream()`

The unsaved changes are included. If for the Author page change tracking highlights are present, they are also included as processing instructions.

**Returns:** `java.io.InputStream`

### `reloadContent(java.io.Reader reader)`

This will lose undo history and any modifications the editor may have.

**Parameters:**
- `reader` (`java.io.Reader`): The reader provided by the extension.

**Returns:** `void`

### `reloadContent(java.io.Reader reader, boolean discardUndoableEdits)`

This will lose any modifications the editor may have unless discardUndoableEdits
 is `false` in which case you will be able to UNDO the editor
 to the content prior to the reload.

**Parameters:**
- `reader` (`java.io.Reader`): The reader provided by the extension.
- `discardUndoableEdits` (`boolean`): `true` to lose undo history.

**Returns:** `void`

### `setEditorTabText(java.lang.String tabText)`

Set it with the value NULL to reset the tab title to the default value (the loaded file name).

**Parameters:**
- `tabText` (`java.lang.String`): the text which appears on the editor's tab, by default it is the loaded file name.
   NULL to reset the tab title to the default value (the loaded file name).

**Returns:** `void`

### `setEditorTabTooltipText(java.lang.String tabTooltip)`

Set it with the value NULL to reset the tab title to the default value (the loaded file path).

**Parameters:**
- `tabTooltip` (`java.lang.String`): the tooltip for the editor's tab, by default it is the loaded file path.
   NULL to reset the tab tooltip to the default value (the loaded file path).

**Returns:** `void`

### `getDocumentTypeInformation()`

**Returns:** [`ro.sync.exml.workspace.api.editor.documenttype.DocumentTypeInformation`](documenttype/DocumentTypeInformation.md)

