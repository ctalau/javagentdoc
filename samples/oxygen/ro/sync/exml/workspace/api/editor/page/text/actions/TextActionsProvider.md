# Interface: `TextActionsProvider`

**Package:** [`ro.sync.exml.workspace.api.editor.page.text.actions`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.text.actions.TextActionsProvider`

## Description

## Methods

### `getTextActions()`

**Returns:** `java.util.Map<java.lang.String,java.lang.Object>`

### `invokeAction(Object action)`

**Parameters:**
- `action` (`java.lang.Object`): The action to invoke

**Returns:** `void`

### `getActionID(Object action)`

If the action appears on a contextual menu but is not installed on a main menu it will pe prefixed with the constant "ACTION_WITH_NO_SHORTCUT/"

**Parameters:**
- `action` (`java.lang.Object`): The action for which to retrieve the ID.

**Returns:** `java.lang.String`

