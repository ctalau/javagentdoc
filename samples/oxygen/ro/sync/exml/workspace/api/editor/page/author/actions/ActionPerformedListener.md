# Class: `ActionPerformedListener`

**Package:** [`ro.sync.exml.workspace.api.editor.page.author.actions`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.author.actions.ActionPerformedListener`

## Description

The listener will be triggered before an action is performed (and will be able to reject the default code which is executed when the action is performed).
 The listener will also be triggered after an action is performed.

## Constructors

### `<init>()`

## Methods

### `beforeActionPerformed(`java.lang.Object` actionEvent)`

**Returns:** `boolean`

If the callback rejects, the other added listeners will also not get called.

### `afterActionPerformed(`java.lang.Object` actionEvent)`

**Returns:** `void`

