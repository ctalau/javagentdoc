# Class: `XHTMLWebappImageMapSupportFactory`

**Package:** [`ro.sync.ecss.extensions.xhtml.imagemap`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.xhtml.imagemap.XHTMLWebappImageMapSupportFactory`

**Implements:** [`ro.sync.ecss.extensions.api.webapp.imagemap.WebappImageMapSupportFactory`](../../api/webapp/imagemap/WebappImageMapSupportFactory.md)

## Description

## Constructors

### `<init>()`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `createImageMapSupport(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.imagemap.WebappImageMapSupport`](../../api/webapp/imagemap/WebappImageMapSupport.md)

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md))

### `getMapId(ro.sync.ecss.extensions.api.node.AttrValue useMapAttr)`

**Returns:** `java.lang.String`

**Parameters:**
- `useMapAttr` ([`ro.sync.ecss.extensions.api.node.AttrValue`](../../api/node/AttrValue.md)): The attribute that points to the map element.

### `getMapElement(ro.sync.ecss.extensions.api.editor.AuthorInplaceContext context, java.lang.String mapId)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

**Parameters:**
- `context` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](../../api/editor/AuthorInplaceContext.md)): The form control context.
- `mapId` (`java.lang.String`): The ID of the map linked to the current image.

