# Class: `EmbeddedImageContentProvider`

**Package:** [`ro.sync.exml.workspace.api.images.handlers.providers`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.images.handlers.providers.EmbeddedImageContentProvider`

**Extends:** [`ro.sync.exml.workspace.api.images.handlers.providers.ImageContentProvider`](./ImageContentProvider.md)

## Description

## Fields

### `doctype`

**Type:** `java.lang.String`

### `imageSerializedContent`

**Type:** `java.lang.String`

Not `null` when the image is embedded in the content...

## Constructors

### `<init>(`java.net.URL` systemID, `java.lang.String` imageSerializedContent, `java.lang.String` doctypeContent)`

## Methods

### `getImageSerializedContent()`

**Returns:** `java.lang.String`

Not `null` when the image is embedded in the document (SVG, MathML, etc).

### `getDoctype()`

**Returns:** `java.lang.String`

### `getInputStream()`

**Returns:** `java.io.InputStream`

