# Interface: `AuthorActionsProvider`

**Package:** [`ro.sync.exml.workspace.api.editor.page.author.actions`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.author.actions.AuthorActionsProvider`

**Extends:** [`ro.sync.exml.workspace.api.editor.page.author.actions.ActionsProvider`](./ActionsProvider.md)

## Description

## Methods

### `getAuthorCommonActions()`

**Returns:** `java.util.Map<java.lang.String,java.lang.Object>`

### `getAuthorExtensionActions()`

**Returns:** `java.util.Map<java.lang.String,java.lang.Object>`

Can be null if the author page does not have an associated document type.
 This should get called after each load as the extension actions depend on the loaded document type.

### `invokeAuthorExtensionActionInContext(`java.lang.Object` action, `int` offset)`

**Returns:** `void`

If the action is not an extension action, the method runs it without a context offset.
 The action will be invoked only if it is enabled in the execution context offset.

