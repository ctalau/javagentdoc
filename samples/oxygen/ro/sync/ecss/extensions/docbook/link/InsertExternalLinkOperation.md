# Class: `InsertExternalLinkOperation`

**Package:** [`ro.sync.ecss.extensions.docbook.link`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.docbook.link.InsertExternalLinkOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

## Fields

### `LOGGER`

**Type:** `org.slf4j.Logger`

### `DOCBOOK_NS`

**Type:** `java.lang.String`

### `ARGUMENT_URL_VALUE`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `doOperation(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `insertExternalLink(String url, AuthorAccess authorAccess, boolean schemaAware)`

**Parameters:**
- `url` (`java.lang.String`): The URL to insert as external link.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `schemaAware` (`boolean`): The schema aware.

**Returns:** `void`

