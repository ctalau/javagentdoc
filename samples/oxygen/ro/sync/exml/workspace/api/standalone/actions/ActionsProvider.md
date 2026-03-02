# Interface: `ActionsProvider`

**Package:** [`ro.sync.exml.workspace.api.standalone.actions`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.actions.ActionsProvider`

**Extends:** [`ro.sync.exml.workspace.api.actions.CommonActionsProvider`](../../actions/CommonActionsProvider.md)

## Description

## Methods

### `getGlobalActions()`

**Returns:** `java.util.Map<java.lang.String,java.lang.Object>`

### `registerAction(java.lang.String actionID, java.lang.Object action, java.lang.String defaultKeyStroke)`

**Returns:** `void`

The action shortcut will be visible in the Oxygen menu shortcut keys table.
 If the action uses a shortcut which is not used by other Oxygen actions, the shortcut will work even if you do not add the action to an existing menu.

**Parameters:**
- `actionID` (`java.lang.String`): The action ID. An unique ID which you provide for your action...
- `action` (`java.lang.Object`): The action. It must be an instance of javax.swing.Action. It can have a default keystroke...
- `defaultKeyStroke` (`java.lang.String`): The default action key stroke string representation. 
 You can use platform-dependent strokes like "Ctrl Alt X" or platform-independent strokes like "M1 M3 X" where:
 
 

  - M1 represents the Command key on MacOS X, and the Ctrl key on other platforms.

  - M2 represents the Shift key.

  - M3 represents the Option key on MacOS X, and the Alt key on other platforms.

  - M4 represents the Ctrl key on MacOS X, and is undefined on other platforms.

 


### `unregisterAction(java.lang.String actionID)`

**Returns:** `void`

**Parameters:**
- `actionID` (`java.lang.String`): The action ID.

