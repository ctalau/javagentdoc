# Interface: `WebappImageMapSupport`

**Package:** [`ro.sync.ecss.extensions.api.webapp.imagemap`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.imagemap.WebappImageMapSupport`

## Description

## Methods

### `getAreas(int fontSize)`

**Parameters:**
- `fontSize` (`int`): The font size of the image.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.imagemap.WebappAreaView>`

### `getImageSize(int fontSize)`

If the image size is not specified by XML attributes,
 the editor will determine it based on the natural size of the image file.

**Parameters:**
- `fontSize` (`int`): The font size of the image map.

**Returns:** `java.util.Optional<ro.sync.exml.view.graphics.Rectangle>`

