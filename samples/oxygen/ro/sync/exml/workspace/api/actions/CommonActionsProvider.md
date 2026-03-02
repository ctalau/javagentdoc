# Interface: `CommonActionsProvider`

**Package:** [`ro.sync.exml.workspace.api.actions`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.actions.CommonActionsProvider`

## Description

## Methods

### `invokeAction(Object action)`

The action will be invoked only if it is enabled in the current context.

**Parameters:**
- `action` (`java.lang.Object`): The action to invoke

**Returns:** `void`

### `getActionID(Object actionOrUIObject)`

If the action appears on a contextual menu but is not installed on a main menu it will be prefixed with the constant "ACTION_WITH_NO_SHORTCUT/"

**Parameters:**
- `actionOrUIObject` (`java.lang.Object`): The action or UI component for which to retrieve the ID.

**Returns:** `java.lang.String`

### `addActionPerformedListener(Object action, ActionPerformedListener listener)`

**Parameters:**
- `action` (`java.lang.Object`): The action on which to add the listener.
- `listener` ([`ro.sync.exml.workspace.api.editor.page.author.actions.ActionPerformedListener`](../editor/page/author/actions/ActionPerformedListener.md)): The listener.

**Returns:** `void`

### `removeActionPerformedListener(Object action, ActionPerformedListener listener)`

**Parameters:**
- `action` (`java.lang.Object`): The action.
- `listener` ([`ro.sync.exml.workspace.api.editor.page.author.actions.ActionPerformedListener`](../editor/page/author/actions/ActionPerformedListener.md)): The listener.

**Returns:** `void`

