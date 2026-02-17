# Interface: `CommonActionsProvider`

**Package:** [`ro.sync.exml.workspace.api.actions`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.actions.CommonActionsProvider`

## Description

## Methods

### `invokeAction(`java.lang.Object` action)`

**Returns:** `void`

The action will be invoked only if it is enabled in the current context.

### `getActionID(`java.lang.Object` actionOrUIObject)`

**Returns:** `java.lang.String`

If the action appears on a contextual menu but is not installed on a main menu it will be prefixed with the constant "ACTION_WITH_NO_SHORTCUT/"

### `addActionPerformedListener(`java.lang.Object` action, [`ro.sync.exml.workspace.api.editor.page.author.actions.ActionPerformedListener`](../editor/page/author/actions/ActionPerformedListener.md) listener)`

**Returns:** `void`

### `removeActionPerformedListener(`java.lang.Object` action, [`ro.sync.exml.workspace.api.editor.page.author.actions.ActionPerformedListener`](../editor/page/author/actions/ActionPerformedListener.md) listener)`

**Returns:** `void`

