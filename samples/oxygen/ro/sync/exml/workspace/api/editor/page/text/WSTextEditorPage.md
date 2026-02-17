# Interface: `WSTextEditorPage`

**Package:** [`ro.sync.exml.workspace.api.editor.page.text`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.text.WSTextEditorPage`

**Extends:** [`ro.sync.exml.workspace.api.editor.page.WSTextBasedEditorPage`](../WSTextBasedEditorPage.md)

## Description

## Methods

### `getDocument()`

**Returns:** `javax.swing.text.Document`

For eclipse, the returned instance is an javax.swing.text.Document adapter over the Eclipse native document.

### `getTextComponent()`

**Returns:** `java.lang.Object`

### `getXMLSchemaManager()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](./WSTextXMLSchemaManager.md)

### `beginCompoundUndoableEdit()`

**Returns:** `void`

This is useful if you make modifications through the API and want Oxygen to undo in a single step.
 
 This should be used like:
 

```
try{
  beginCompoundUndoableEdit();
  //YOUR CODE HERE
 } finally{
  endCompoundUndoableEdit();
 }
 
```

### `endCompoundUndoableEdit()`

**Returns:** `void`

This is useful if you make modifications through the API and want Oxygen to undo in a single step.
 
 This should be used like:
 

```
try{
  beginCompoundUndoableEdit();
  //YOUR CODE HERE
 } finally{
  endCompoundUndoableEdit();
 }
 
```

### `getLineOfOffset(`int` offset)`

**Returns:** `int`

If the offset is
  between two lines, then the number of the line after is returned. The
  line number returned is indexed in 1.

### `getColumnOfOffset(`int` offset)`

**Returns:** `int`

### `getOffsetOfLineStart(`int` lineNumber)`

**Returns:** `int`

The
  line number is indexed in 1.

### `getOffsetOfLineEnd(`int` lineNumber)`

**Returns:** `int`

This will
  be equal to the start offset of the next line, if there is one. The line
  number is indexed in 1.

### `addPopUpMenuCustomizer([`ro.sync.exml.workspace.api.editor.page.text.TextPopupMenuCustomizer`](./TextPopupMenuCustomizer.md) popUpCustomizer)`

**Returns:** `void`

If the customizer is already added, it will not be added again.

### `removePopUpMenuCustomizer([`ro.sync.exml.workspace.api.editor.page.text.TextPopupMenuCustomizer`](./TextPopupMenuCustomizer.md) popUpCustomizer)`

**Returns:** `void`

### `getActionsProvider()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.text.actions.TextActionsProvider`](actions/TextActionsProvider.md)

### `addExternalContentCompletionProvider([`ro.sync.exml.workspace.api.editor.page.text.ExternalContentCompletionProvider`](./ExternalContentCompletionProvider.md) ccProvider)`

**Returns:** `void`

Not implemented in the Oxygen Eclipse Plug-in.

### `removeExternalContentCompletionProvider([`ro.sync.exml.workspace.api.editor.page.text.ExternalContentCompletionProvider`](./ExternalContentCompletionProvider.md) ccProvider)`

**Returns:** `void`

Not implemented in the Oxygen Eclipse Plug-in.

### `addQuickAssistProcessor([`ro.sync.exml.editor.quickassist.SimpleQuickAssistProcessor`](../../../../../editor/quickassist/SimpleQuickAssistProcessor.md) processor)`

**Returns:** `void`

This allow you to provide quick custom quick assist 
 proposals in the current editor page quick assist menu.

### `removeQuickAssistProcessor([`ro.sync.exml.editor.quickassist.SimpleQuickAssistProcessor`](../../../../../editor/quickassist/SimpleQuickAssistProcessor.md) processor)`

**Returns:** `void`

