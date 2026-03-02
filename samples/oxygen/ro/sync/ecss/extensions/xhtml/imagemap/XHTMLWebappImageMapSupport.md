# Class: `XHTMLWebappImageMapSupport`

**Package:** [`ro.sync.ecss.extensions.xhtml.imagemap`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.xhtml.imagemap.XHTMLWebappImageMapSupport`

**Implements:** [`ro.sync.ecss.extensions.api.webapp.imagemap.WebappImageMapSupport`](../../api/webapp/imagemap/WebappImageMapSupport.md)

## Description

## Fields

### `areaViews`

**Type:** `java.util.List<ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView>`

## Constructors

### `<init>(AuthorElement map)`

**Parameters:**
- `map` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The  element.

## Methods

### `getAreas(int fontSize)`

**Parameters:**
- `fontSize` (`int`)

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView>`

### `computeAreas(AuthorElement map)`

**Parameters:**
- `map` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The map element.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView>`

### `areaToAreaView(AuthorElement area, int originalLayer)`

**Parameters:**
- `area` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element.
- `originalLayer` (`int`): The original layer of the area.

**Returns:** [`ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView`](../../api/webapp/imagemap/WebappAreaView.md)

### `createPolygon(List<Integer> coords, int originalLayer)`

**Parameters:**
- `coords` (`java.util.List<java.lang.Integer>`): The coordinates.
- `originalLayer` (`int`): The original layer.

**Returns:** [`ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView`](../../api/webapp/imagemap/WebappAreaView.md)

### `createRectangle(List<Integer> coords, int originalLayer)`

**Parameters:**
- `coords` (`java.util.List<java.lang.Integer>`): The coordinates.
- `originalLayer` (`int`): The original layer.

**Returns:** [`ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView`](../../api/webapp/imagemap/WebappAreaView.md)

### `createCircle(List<Integer> coords, int originalLayer)`

**Parameters:**
- `coords` (`java.util.List<java.lang.Integer>`): The coordinates.
- `originalLayer` (`int`): The original layer.

**Returns:** [`ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView`](../../api/webapp/imagemap/WebappAreaView.md)

### `parseCoords(AuthorElement area)`

**Parameters:**
- `area` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The area.

**Returns:** `java.util.List<java.lang.Integer>`

### `getImageSize(int fontSize)`

**Parameters:**
- `fontSize` (`int`)

**Returns:** `java.util.Optional<ro.sync.exml.view.graphics.Rectangle>`

