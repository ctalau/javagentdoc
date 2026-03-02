# Class: `InsertImageOperation`

**Package:** [`ro.sync.ecss.extensions.dita.topic`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.topic.InsertImageOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

## Fields

### `ARGUMENT_IMAGE_URL`

**Type:** `java.lang.String`

The value is `imageUrl`.

### `arguments`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

**Returns:** `void`

### `getArguments()`

The operation will display a dialog for choosing the image file.

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

