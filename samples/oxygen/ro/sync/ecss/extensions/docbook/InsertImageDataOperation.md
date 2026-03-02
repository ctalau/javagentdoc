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

### `doOperation(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../api/ArgumentsMap.md))

**Returns:** `void`

### `insertImageRef(AuthorAccess authorAccess, DocBookImageInfo imageInfo, boolean isInlineMediaObjectAccepted)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): Access to the Author-specific functions.
- `imageInfo` (`ro.sync.ecss.docbook.DocBookImageInfo`): An object containing information about the image to be inserted.
- `isInlineMediaObjectAccepted` (`boolean`): `true` if an inline media object is accepted according to the schema.

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](../api/schemaaware/SchemaAwareHandlerResult.md)

### `getArguments()`

The operation will display a dialog for choosing the image fileref.

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

