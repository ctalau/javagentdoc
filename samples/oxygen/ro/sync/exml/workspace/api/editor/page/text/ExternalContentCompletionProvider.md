# Class: `ExternalContentCompletionProvider`

**Package:** [`ro.sync.exml.workspace.api.editor.page.text`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.text.ExternalContentCompletionProvider`

## Description

Can be used to display a custom content completion list,
 and insert content in the document. This provider is invoked if no built-in proposals 
 are available for the current context.

## Constructors

### `<init>()`

## Methods

### `startExternalContentCompletion(ro.sync.exml.workspace.api.editor.page.text.IExternalContentCompletionContext context)`

**Returns:** `boolean`

**Parameters:**
- `context` ([`ro.sync.exml.workspace.api.editor.page.text.IExternalContentCompletionContext`](./IExternalContentCompletionContext.md)): The current content completion context, such as the position and the text 
                from the caret.

