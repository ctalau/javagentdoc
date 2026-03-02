# Class: `InsertULink`

**Package:** [`ro.sync.ecss.extensions.docbook.link`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.docbook.link.InsertULink`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

## Fields

### `ARGUMENT_URL_VALUE`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `doOperation(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

**Returns:** `void`

### `insertULink(String url, AuthorAccess authorAccess, boolean schemaAware)`

**Parameters:**
- `url` (`java.lang.String`): The URL to insert as external link.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `schemaAware` (`boolean`): `true` for schema aware operation.

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

