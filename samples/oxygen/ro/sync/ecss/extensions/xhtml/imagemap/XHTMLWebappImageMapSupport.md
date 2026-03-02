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

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView>`

**Parameters:**
- `fontSize` (`int`)

### `computeAreas(ro.sync.ecss.extensions.api.node.AuthorElement map)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView>`

**Parameters:**
- `map` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The map element.

### `areaToAreaView(ro.sync.ecss.extensions.api.node.AuthorElement area, int originalLayer)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView`](../../api/webapp/imagemap/WebappAreaView.md)

**Parameters:**
- `area` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element.
- `originalLayer` (`int`): The original layer of the area.

### `createPolygon(java.util.List<java.lang.Integer> coords, int originalLayer)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView`](../../api/webapp/imagemap/WebappAreaView.md)

**Parameters:**
- `coords` (`java.util.List<java.lang.Integer>`): The coordinates.
- `originalLayer` (`int`): The original layer.

### `createRectangle(java.util.List<java.lang.Integer> coords, int originalLayer)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView`](../../api/webapp/imagemap/WebappAreaView.md)

**Parameters:**
- `coords` (`java.util.List<java.lang.Integer>`): The coordinates.
- `originalLayer` (`int`): The original layer.

### `createCircle(java.util.List<java.lang.Integer> coords, int originalLayer)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView`](../../api/webapp/imagemap/WebappAreaView.md)

**Parameters:**
- `coords` (`java.util.List<java.lang.Integer>`): The coordinates.
- `originalLayer` (`int`): The original layer.

### `parseCoords(ro.sync.ecss.extensions.api.node.AuthorElement area)`

**Returns:** `java.util.List<java.lang.Integer>`

**Parameters:**
- `area` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The area.

### `getImageSize(int fontSize)`

**Returns:** `java.util.Optional<ro.sync.exml.view.graphics.Rectangle>`

**Parameters:**
- `fontSize` (`int`)

