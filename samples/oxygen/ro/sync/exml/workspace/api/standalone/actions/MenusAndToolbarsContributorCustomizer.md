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

### `customizeAuthorPageExtensionMenu(`javax.swing.JMenu` extensionMenu, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../../ecss/extensions/api/AuthorAccess.md) authorAccess)`

**Returns:** `void`

For example DITA, Docbook, etc...

### `customizeAuthorPageExtensionToolbar([`ro.sync.exml.workspace.api.standalone.ToolbarInfo`](../ToolbarInfo.md) toolbarInfo, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../../ecss/extensions/api/AuthorAccess.md) authorAccess)`

**Returns:** `void`

The toolbar will be included in the Author-specific toolbar.
 
 An extension toolbar contains actions belonging to the specific support the application offers for a certain vocabulary.

### `customizeDITAMapsManagerExtendedToolbar([`ro.sync.exml.workspace.api.standalone.ToolbarInfo`](../ToolbarInfo.md) toolbarInfo)`

**Returns:** `void`

### `customizeDITAMapsManagerMainToolbar([`ro.sync.exml.workspace.api.standalone.ToolbarInfo`](../ToolbarInfo.md) toolbarInfo)`

**Returns:** `void`

### `customizeAuthorPopUpMenu(`javax.swing.JPopupMenu` popUp, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../../ecss/extensions/api/AuthorAccess.md) authorAccess)`

**Returns:** `void`

By default this method gets called for both the contextual menu shown in the main editing area, 
 shown in the Outline view or shown in the Breadcrumb.
 
 If everything is removed then the menu will not be shown.

### `customizeAuthorOutlinePopUpMenu(`javax.swing.JPopupMenu` popUp, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../../ecss/extensions/api/AuthorAccess.md) authorAccess)`

**Returns:** `void`

If everything is removed then the menu will not be shown.

### `customizeAuthorBreadcrumbPopUpMenu(`javax.swing.JPopupMenu` popUp, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../../ecss/extensions/api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../../../ecss/extensions/api/node/AuthorNode.md) currentNode)`

**Returns:** `void`

If everything is removed then the menu will not be shown.

### `customizeTextPopUpMenu(`javax.swing.JPopupMenu` popUp, [`ro.sync.exml.workspace.api.editor.page.text.WSTextEditorPage`](../../editor/page/text/WSTextEditorPage.md) textPage)`

**Returns:** `void`

If everything is removed then the menu will not be shown.

### `customizeDITAMapPopUpMenu(`javax.swing.JPopupMenu` popUp, [`ro.sync.exml.workspace.api.editor.page.ditamap.WSDITAMapEditorPage`](../../editor/page/ditamap/WSDITAMapEditorPage.md) ditaMapEditorPage)`

**Returns:** `void`

If everything is removed then the menu will not be shown.

### `customizeEditorTabPopUpMenu(`javax.swing.JPopupMenu` popUpMenu, [`ro.sync.exml.workspace.api.editor.WSEditor`](../../editor/WSEditor.md) editor)`

**Returns:** `void`

Editor tabs from both the main editing area and the DITA Maps Manager are taken into account.

