# Class: `AuthorOutlineCustomizer`

**Package:** [`ro.sync.ecss.extensions.api.structure`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.structure.AuthorOutlineCustomizer`

**Implements:** [`ro.sync.ecss.extensions.api.structure.AuthorNodeRendererCustomizer`](./AuthorNodeRendererCustomizer.md), [`ro.sync.ecss.extensions.api.structure.AuthorPopupMenuCustomizer`](./AuthorPopupMenuCustomizer.md)

## Description

## Constructors

### `<init>()`

## Methods

### `ignoreNode(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../node/AuthorNode.md)): The node to check for ignore.

**Returns:** `boolean`

### `customizeRenderingInformation(RenderingInformation renderInfo)`

For more information, search the oXygen documentation for "cc_config.xml" 
 configuration file. 
 For DITA, this file is in "frameworks/dita/resources/cc_config.xml".

**Parameters:**
- `renderInfo` ([`ro.sync.ecss.extensions.api.structure.RenderingInformation`](./RenderingInformation.md))

**Returns:** `void`

### `customizePopUpMenu(Object popUp, AuthorAccess authorAccess)`

**Parameters:**
- `popUp` (`java.lang.Object`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md))

**Returns:** `void`

