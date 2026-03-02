# Interface: `WSTextEditorPage`

**Package:** [`ro.sync.exml.workspace.api.editor.page.text`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.text.WSTextEditorPage`

**Extends:** [`ro.sync.exml.workspace.api.editor.page.WSTextBasedEditorPage`](../WSTextBasedEditorPage.md)

## Description

## Methods

### `getDocument()`

For eclipse, the returned instance is an javax.swing.text.Document adapter over the Eclipse native document.

**Returns:** `javax.swing.text.Document`

### `getTextComponent()`

**Returns:** `java.lang.Object`

### `getXMLSchemaManager()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`](./WSTextXMLSchemaManager.md)

### `beginCompoundUndoableEdit()`

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

**Returns:** `void`

### `endCompoundUndoableEdit()`

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

**Returns:** `void`

### `getLineOfOffset(int offset)`

If the offset is
  between two lines, then the number of the line after is returned. The
  line number returned is indexed in 1.

**Parameters:**
- `offset` (`int`): Offset in document.

**Returns:** `int`

### `getColumnOfOffset(int offset)`

**Parameters:**
- `offset` (`int`): The offset that is to be checked.

**Returns:** `int`

### `getOffsetOfLineStart(int lineNumber)`

The
  line number is indexed in 1.

**Parameters:**
- `lineNumber` (`int`): The number of the line. Indexed in 1.

**Returns:** `int`

### `getOffsetOfLineEnd(int lineNumber)`

This will
  be equal to the start offset of the next line, if there is one. The line
  number is indexed in 1.

**Parameters:**
- `lineNumber` (`int`): The number of the line. Indexed in 1.

**Returns:** `int`

### `addPopUpMenuCustomizer(TextPopupMenuCustomizer popUpCustomizer)`

If the customizer is already added, it will not be added again.

**Parameters:**
- `popUpCustomizer` ([`ro.sync.exml.workspace.api.editor.page.text.TextPopupMenuCustomizer`](./TextPopupMenuCustomizer.md)): the pop-up menu customizer.

**Returns:** `void`

### `removePopUpMenuCustomizer(TextPopupMenuCustomizer popUpCustomizer)`

**Parameters:**
- `popUpCustomizer` ([`ro.sync.exml.workspace.api.editor.page.text.TextPopupMenuCustomizer`](./TextPopupMenuCustomizer.md)): the pop-up menu customizer.

**Returns:** `void`

### `getActionsProvider()`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.text.actions.TextActionsProvider`](actions/TextActionsProvider.md)

### `addExternalContentCompletionProvider(ExternalContentCompletionProvider ccProvider)`

Not implemented in the Oxygen Eclipse Plug-in.

**Parameters:**
- `ccProvider` ([`ro.sync.exml.workspace.api.editor.page.text.ExternalContentCompletionProvider`](./ExternalContentCompletionProvider.md)): The content completion provider.

**Returns:** `void`

### `removeExternalContentCompletionProvider(ExternalContentCompletionProvider ccProvider)`

Not implemented in the Oxygen Eclipse Plug-in.

**Parameters:**
- `ccProvider` ([`ro.sync.exml.workspace.api.editor.page.text.ExternalContentCompletionProvider`](./ExternalContentCompletionProvider.md)): The content completion provider to be removed.

**Returns:** `void`

### `addQuickAssistProcessor(SimpleQuickAssistProcessor processor)`

This allow you to provide quick custom quick assist 
 proposals in the current editor page quick assist menu.

**Parameters:**
- `processor` ([`ro.sync.exml.editor.quickassist.SimpleQuickAssistProcessor`](../../../../../editor/quickassist/SimpleQuickAssistProcessor.md)): The processor to be registered.

**Returns:** `void`

### `removeQuickAssistProcessor(SimpleQuickAssistProcessor processor)`

**Parameters:**
- `processor` ([`ro.sync.exml.editor.quickassist.SimpleQuickAssistProcessor`](../../../../../editor/quickassist/SimpleQuickAssistProcessor.md)): The processor to be unregistered.

**Returns:** `void`

