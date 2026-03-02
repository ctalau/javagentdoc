# Interface: `MenuBarCustomizer`

**Package:** [`ro.sync.exml.workspace.api.standalone`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.MenuBarCustomizer`

## Description

## Methods

### `customizeMainMenu(javax.swing.JMenuBar mainMenu)`

This callback may be received multiple times during the editing session and you need to avoid adding your actions multiple times,
 check if they have already been added and if they have avoid adding them again to the menu.

**Parameters:**
- `mainMenu` (`javax.swing.JMenuBar`): The main menu bar.

**Returns:** `void`

