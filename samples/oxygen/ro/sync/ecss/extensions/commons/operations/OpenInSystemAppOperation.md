# Class: `OpenInSystemAppOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.OpenInSystemAppOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `ARGUMENT_RESOURCE_PATH`

**Type:** `java.lang.String`

### `ARGUMENT_UNPARSED_ENTITY`

**Type:** `java.lang.String`

### `ARGUMENT_MEDIA_TYPE`

**Type:** `java.lang.String`

### `MEDIA_TYPE_VIDEO`

**Type:** `java.lang.String`

### `MEDIA_TYPE_AUDIO`

**Type:** `java.lang.String`

### `MEDIA_TYPE_MEDIA`

**Type:** `java.lang.String`

### `MEDIA_TYPE_IMAGE`

**Type:** `java.lang.String`

### `MEDIA_TYPE_HTML`

**Type:** `java.lang.String`

### `MEDIA_TYPE_PDF`

**Type:** `java.lang.String`

### `arguments`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

### `open(java.lang.String toOpenVal, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Returns:** `void`

**Parameters:**
- `toOpenVal` (`java.lang.String`): The resource to open.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md)): The map of arguments.

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

