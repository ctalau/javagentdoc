# Interface: `ActionsProvider`

**Package:** [`ro.sync.exml.workspace.api.standalone.actions`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.actions.ActionsProvider`

**Extends:** [`ro.sync.exml.workspace.api.actions.CommonActionsProvider`](../../actions/CommonActionsProvider.md)

## Description

## Methods

### `getGlobalActions()`

**Returns:** `java.util.Map<java.lang.String,java.lang.Object>`

### `registerAction(`java.lang.String` actionID, `java.lang.Object` action, `java.lang.String` defaultKeyStroke)`

**Returns:** `void`

The action shortcut will be visible in the Oxygen menu shortcut keys table.
 If the action uses a shortcut which is not used by other Oxygen actions, the shortcut will work even if you do not add the action to an existing menu.

### `unregisterAction(`java.lang.String` actionID)`

**Returns:** `void`

