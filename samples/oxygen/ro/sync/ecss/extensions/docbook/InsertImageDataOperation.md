# Class: `InsertImageDataOperation`

**Package:** [`ro.sync.ecss.extensions.docbook`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.docbook.InsertImageDataOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../api/AuthorOperation.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `ARGUMENT_IMAGE_URL`

**Type:** `java.lang.String`

The value is `imageUrl`.

### `arguments`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `insertImageRef([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, `ro.sync.ecss.docbook.DocBookImageInfo` imageInfo, `boolean` isInlineMediaObjectAccepted)`

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](../api/schemaaware/SchemaAwareHandlerResult.md)

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../api/ArgumentDescriptor.md)

The operation will display a dialog for choosing the image fileref.

### `getDescription()`

**Returns:** `java.lang.String`

