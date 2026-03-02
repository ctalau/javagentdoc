# Class: `InsertGraphicOperation`

**Package:** [`ro.sync.ecss.extensions.docbook`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.docbook.InsertGraphicOperation`

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

### `doOperation(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../api/ArgumentsMap.md))

**Returns:** `void`

### `insertImageRef(AuthorAccess authorAccess, DocBookImageInfo imageInfo, boolean isInlineGraphicAccepted)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): The author access
- `imageInfo` (`ro.sync.ecss.docbook.DocBookImageInfo`): The image information.
- `isInlineGraphicAccepted` (`boolean`): `true` if an inline graphic is accepted.

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](../api/schemaaware/SchemaAwareHandlerResult.md)

### `getArguments()`

The operation will display a dialog for choosing the image file.

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

