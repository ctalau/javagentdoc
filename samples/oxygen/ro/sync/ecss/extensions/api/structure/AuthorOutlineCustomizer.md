# Class: `AuthorOutlineCustomizer`

**Package:** [`ro.sync.ecss.extensions.api.structure`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.structure.AuthorOutlineCustomizer`

**Implements:** [`ro.sync.ecss.extensions.api.structure.AuthorNodeRendererCustomizer`](./AuthorNodeRendererCustomizer.md), [`ro.sync.ecss.extensions.api.structure.AuthorPopupMenuCustomizer`](./AuthorPopupMenuCustomizer.md)

## Description

## Constructors

### `<init>()`

## Methods

### `ignoreNode(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../node/AuthorNode.md)): The node to check for ignore.

### `customizeRenderingInformation(ro.sync.ecss.extensions.api.structure.RenderingInformation renderInfo)`

**Returns:** `void`

For more information, search the oXygen documentation for "cc_config.xml" 
 configuration file. 
 For DITA, this file is in "frameworks/dita/resources/cc_config.xml".

**Parameters:**
- `renderInfo` ([`ro.sync.ecss.extensions.api.structure.RenderingInformation`](./RenderingInformation.md))

### `customizePopUpMenu(java.lang.Object popUp, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `void`

**Parameters:**
- `popUp` (`java.lang.Object`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md))

