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

### `customizeAuthorPageExtensionMenu(javax.swing.JMenu extensionMenu, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `void`

For example DITA, Docbook, etc...

**Parameters:**
- `extensionMenu` (`javax.swing.JMenu`): The extension menu.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../../ecss/extensions/api/AuthorAccess.md)): Access class to the author functions.

### `customizeAuthorPageExtensionToolbar(ro.sync.exml.workspace.api.standalone.ToolbarInfo toolbarInfo, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `void`

The toolbar will be included in the Author-specific toolbar.
 
 An extension toolbar contains actions belonging to the specific support the application offers for a certain vocabulary.

**Parameters:**
- `toolbarInfo` ([`ro.sync.exml.workspace.api.standalone.ToolbarInfo`](../ToolbarInfo.md)): Information about toolbar components.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../../ecss/extensions/api/AuthorAccess.md)): Access class to the author functions.

### `customizeDITAMapsManagerExtendedToolbar(ro.sync.exml.workspace.api.standalone.ToolbarInfo toolbarInfo)`

**Returns:** `void`

**Parameters:**
- `toolbarInfo` ([`ro.sync.exml.workspace.api.standalone.ToolbarInfo`](../ToolbarInfo.md)): The toolbar information.

### `customizeDITAMapsManagerMainToolbar(ro.sync.exml.workspace.api.standalone.ToolbarInfo toolbarInfo)`

**Returns:** `void`

**Parameters:**
- `toolbarInfo` ([`ro.sync.exml.workspace.api.standalone.ToolbarInfo`](../ToolbarInfo.md)): The toolbar components information.

### `customizeAuthorPopUpMenu(javax.swing.JPopupMenu popUp, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `void`

By default this method gets called for both the contextual menu shown in the main editing area, 
 shown in the Outline view or shown in the Breadcrumb.
 
 If everything is removed then the menu will not be shown.

**Parameters:**
- `popUp` (`javax.swing.JPopupMenu`): The pop-up Menu.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../../ecss/extensions/api/AuthorAccess.md)): Access class to the author functions.

### `customizeAuthorOutlinePopUpMenu(javax.swing.JPopupMenu popUp, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `void`

If everything is removed then the menu will not be shown.

**Parameters:**
- `popUp` (`javax.swing.JPopupMenu`): The pop-up Menu.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../../ecss/extensions/api/AuthorAccess.md)): Access class to the author functions.

### `customizeAuthorBreadcrumbPopUpMenu(javax.swing.JPopupMenu popUp, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorNode currentNode)`

**Returns:** `void`

If everything is removed then the menu will not be shown.

**Parameters:**
- `popUp` (`javax.swing.JPopupMenu`): The pop-up Menu.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../../ecss/extensions/api/AuthorAccess.md)): Access class to the author functions.
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../ecss/extensions/api/node/AuthorNode.md)): The current node on which the popup is shown.

### `customizeTextPopUpMenu(javax.swing.JPopupMenu popUp, ro.sync.exml.workspace.api.editor.page.text.WSTextEditorPage textPage)`

**Returns:** `void`

If everything is removed then the menu will not be shown.

**Parameters:**
- `popUp` (`javax.swing.JPopupMenu`): The pop-up Menu.
- `textPage` ([`ro.sync.exml.workspace.api.editor.page.text.WSTextEditorPage`](../../editor/page/text/WSTextEditorPage.md)): The page over which the pop-up will be presented.

### `customizeDITAMapPopUpMenu(javax.swing.JPopupMenu popUp, ro.sync.exml.workspace.api.editor.page.ditamap.WSDITAMapEditorPage ditaMapEditorPage)`

**Returns:** `void`

If everything is removed then the menu will not be shown.

**Parameters:**
- `popUp` (`javax.swing.JPopupMenu`): The pop-up Menu.
- `ditaMapEditorPage` ([`ro.sync.exml.workspace.api.editor.page.ditamap.WSDITAMapEditorPage`](../../editor/page/ditamap/WSDITAMapEditorPage.md)): The DITA Map editor page access.

### `customizeEditorTabPopUpMenu(javax.swing.JPopupMenu popUpMenu, ro.sync.exml.workspace.api.editor.WSEditor editor)`

**Returns:** `void`

Editor tabs from both the main editing area and the DITA Maps Manager are taken into account.

**Parameters:**
- `popUpMenu` (`javax.swing.JPopupMenu`): The pop-up menu to customize.
- `editor` ([`ro.sync.exml.workspace.api.editor.WSEditor`](../../editor/WSEditor.md)): The current editor, on whose tab the pop-up menu has been invoked.

