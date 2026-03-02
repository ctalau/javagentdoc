# Class: `AuthorBreadCrumbCustomizer`

**Package:** [`ro.sync.ecss.extensions.api.structure`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.structure.AuthorBreadCrumbCustomizer`

**Implements:** [`ro.sync.ecss.extensions.api.structure.AuthorNodeRendererCustomizer`](./AuthorNodeRendererCustomizer.md), [`ro.sync.ecss.extensions.api.structure.AuthorPopupMenuCustomizer`](./AuthorPopupMenuCustomizer.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `customizeRenderingInformation(ro.sync.ecss.extensions.api.structure.RenderingInformation renderInfo)`

The breadcrumb cannot assign a certain icon for a rendered node.
 
 By default a node is represented in the Outline by its tag name and a additional information obtained 
 from a specific attribute or text. You can set custom values for each rendered field.
 
 If you need to change the way the XML elements are displayed, you may consider 
 using a configuration file.
 For more information, search the oXygen documentation for "cc_config.xml" 
 configuration file. 
 For DITA, this file is in "frameworks/dita/resources/cc_config.xml".

**Parameters:**
- `renderInfo` ([`ro.sync.ecss.extensions.api.structure.RenderingInformation`](./RenderingInformation.md)): The default information which will get displayed. 
   You can set custom values for each field

**Returns:** `void`

### `customizePopUpMenu(java.lang.Object popUp, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `popUp` (`java.lang.Object`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md))

**Returns:** `void`

### `customizePopUpMenu(java.lang.Object popUp, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorNode clickedNode)`

If everything is removed then the menu will not be shown.

 For the standalone implementation the object is a *JPopupMenu*.

 For the eclipse implementation the object is a *IMenuManager*.

**Parameters:**
- `popUp` (`java.lang.Object`): The pop-up Menu.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md)): Access class to the author functions.
- `clickedNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../node/AuthorNode.md)): The current clicked node in the Author page.

**Returns:** `void`

