# Class: `InsertMediaOperation`

**Package:** [`ro.sync.ecss.extensions.xhtml`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.xhtml.InsertMediaOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../api/AuthorOperation.md)

## Description

## Fields

### `ARGUMENT_MEDIA_URL`

**Type:** `java.lang.String`

The value is `mediaUrl`.

### `arguments`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../api/ArgumentsMap.md))

**Returns:** `void`

### `createMediaContentToInsert(java.lang.String ref)`

**Parameters:**
- `ref` (`java.lang.String`): Relative reference of the media file.

**Returns:** `java.lang.StringBuilder`

### `getArguments()`

The operation will display a dialog for choosing the media file.

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

