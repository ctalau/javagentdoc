# Class: `MenusAndToolbarsContributorCustomizer`

**Package:** [`ro.sync.exml.workspace.api.standalone.actions`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.actions.MenusAndToolbarsContributorCustomizer`

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `customizeAuthorPageExtensionMenu(JMenu extensionMenu, AuthorAccess authorAccess)`

For example DITA, Docbook, etc...

**Parameters:**
- `extensionMenu` (`javax.swing.JMenu`): The extension menu.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../../ecss/extensions/api/AuthorAccess.md)): Access class to the author functions.

**Returns:** `void`

### `customizeAuthorPageExtensionToolbar(ToolbarInfo toolbarInfo, AuthorAccess authorAccess)`

The toolbar will be included in the Author-specific toolbar.
 
 An extension toolbar contains actions belonging to the specific support the application offers for a certain vocabulary.

**Parameters:**
- `toolbarInfo` ([`ro.sync.exml.workspace.api.standalone.ToolbarInfo`](../ToolbarInfo.md)): Information about toolbar components.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../../ecss/extensions/api/AuthorAccess.md)): Access class to the author functions.

**Returns:** `void`

### `customizeDITAMapsManagerExtendedToolbar(ToolbarInfo toolbarInfo)`

**Parameters:**
- `toolbarInfo` ([`ro.sync.exml.workspace.api.standalone.ToolbarInfo`](../ToolbarInfo.md)): The toolbar information.

**Returns:** `void`

### `customizeDITAMapsManagerMainToolbar(ToolbarInfo toolbarInfo)`

**Parameters:**
- `toolbarInfo` ([`ro.sync.exml.workspace.api.standalone.ToolbarInfo`](../ToolbarInfo.md)): The toolbar components information.

**Returns:** `void`

### `customizeAuthorPopUpMenu(JPopupMenu popUp, AuthorAccess authorAccess)`

By default this method gets called for both the contextual menu shown in the main editing area, 
 shown in the Outline view or shown in the Breadcrumb.
 
 If everything is removed then the menu will not be shown.

**Parameters:**
- `popUp` (`javax.swing.JPopupMenu`): The pop-up Menu.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../../ecss/extensions/api/AuthorAccess.md)): Access class to the author functions.

**Returns:** `void`

### `customizeAuthorOutlinePopUpMenu(JPopupMenu popUp, AuthorAccess authorAccess)`

If everything is removed then the menu will not be shown.

**Parameters:**
- `popUp` (`javax.swing.JPopupMenu`): The pop-up Menu.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../../ecss/extensions/api/AuthorAccess.md)): Access class to the author functions.

**Returns:** `void`

### `customizeAuthorBreadcrumbPopUpMenu(JPopupMenu popUp, AuthorAccess authorAccess, AuthorNode currentNode)`

If everything is removed then the menu will not be shown.

**Parameters:**
- `popUp` (`javax.swing.JPopupMenu`): The pop-up Menu.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../../ecss/extensions/api/AuthorAccess.md)): Access class to the author functions.
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../ecss/extensions/api/node/AuthorNode.md)): The current node on which the popup is shown.

**Returns:** `void`

### `customizeTextPopUpMenu(JPopupMenu popUp, WSTextEditorPage textPage)`

If everything is removed then the menu will not be shown.

**Parameters:**
- `popUp` (`javax.swing.JPopupMenu`): The pop-up Menu.
- `textPage` ([`ro.sync.exml.workspace.api.editor.page.text.WSTextEditorPage`](../../editor/page/text/WSTextEditorPage.md)): The page over which the pop-up will be presented.

**Returns:** `void`

### `customizeDITAMapPopUpMenu(JPopupMenu popUp, WSDITAMapEditorPage ditaMapEditorPage)`

If everything is removed then the menu will not be shown.

**Parameters:**
- `popUp` (`javax.swing.JPopupMenu`): The pop-up Menu.
- `ditaMapEditorPage` ([`ro.sync.exml.workspace.api.editor.page.ditamap.WSDITAMapEditorPage`](../../editor/page/ditamap/WSDITAMapEditorPage.md)): The DITA Map editor page access.

**Returns:** `void`

### `customizeEditorTabPopUpMenu(JPopupMenu popUpMenu, WSEditor editor)`

Editor tabs from both the main editing area and the DITA Maps Manager are taken into account.

**Parameters:**
- `popUpMenu` (`javax.swing.JPopupMenu`): The pop-up menu to customize.
- `editor` ([`ro.sync.exml.workspace.api.editor.WSEditor`](../../editor/WSEditor.md)): The current editor, on whose tab the pop-up menu has been invoked.

**Returns:** `void`

