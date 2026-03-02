# Class: `XHTMLWebappImageMapSupport`

**Package:** [`ro.sync.ecss.extensions.xhtml.imagemap`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.xhtml.imagemap.XHTMLWebappImageMapSupport`

**Implements:** [`ro.sync.ecss.extensions.api.webapp.imagemap.WebappImageMapSupport`](../../api/webapp/imagemap/WebappImageMapSupport.md)

## Description

## Fields

### `areaViews`

**Type:** `java.util.List<ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView>`

## Constructors

### `<init>(ro.sync.ecss.extensions.api.node.AuthorElement map)`

**Parameters:**
- `map` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The  element.

## Methods

### `getAreas(int fontSize)`

**Parameters:**
- `fontSize` (`int`)

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView>`

### `computeAreas(ro.sync.ecss.extensions.api.node.AuthorElement map)`

**Parameters:**
- `map` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The map element.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView>`

### `areaToAreaView(ro.sync.ecss.extensions.api.node.AuthorElement area, int originalLayer)`

**Parameters:**
- `area` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element.
- `originalLayer` (`int`): The original layer of the area.

**Returns:** [`ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView`](../../api/webapp/imagemap/WebappAreaView.md)

### `createPolygon(java.util.List<java.lang.Integer> coords, int originalLayer)`

**Parameters:**
- `coords` (`java.util.List<java.lang.Integer>`): The coordinates.
- `originalLayer` (`int`): The original layer.

**Returns:** [`ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView`](../../api/webapp/imagemap/WebappAreaView.md)

### `createRectangle(java.util.List<java.lang.Integer> coords, int originalLayer)`

**Parameters:**
- `coords` (`java.util.List<java.lang.Integer>`): The coordinates.
- `originalLayer` (`int`): The original layer.

**Returns:** [`ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView`](../../api/webapp/imagemap/WebappAreaView.md)

### `createCircle(java.util.List<java.lang.Integer> coords, int originalLayer)`

**Parameters:**
- `coords` (`java.util.List<java.lang.Integer>`): The coordinates.
- `originalLayer` (`int`): The original layer.

**Returns:** [`ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView`](../../api/webapp/imagemap/WebappAreaView.md)

### `parseCoords(ro.sync.ecss.extensions.api.node.AuthorElement area)`

**Parameters:**
- `area` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The area.

**Returns:** `java.util.List<java.lang.Integer>`

### `getImageSize(int fontSize)`

**Parameters:**
- `fontSize` (`int`)

**Returns:** `java.util.Optional<ro.sync.exml.view.graphics.Rectangle>`

