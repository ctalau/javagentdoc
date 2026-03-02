# Class: `AuthorTableDeleteRowArguments`

**Package:** [`ro.sync.ecss.extensions.api.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowArguments`

## Description

## Fields

### `authorAccess`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md)

### `rowInterval`

**Type:** [`ro.sync.ecss.extensions.api.ContentInterval`](../../ContentInterval.md)

## Constructors

### `<init>(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ContentInterval rowInterval)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md)): The Author access.
- `rowInterval` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../ContentInterval.md)): The content interval (containing the **inclusive** start offset and 
 **exclusive** end offset) determining the row that must be deleted.

## Methods

### `getAuthorAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md)

### `getRowInterval()`

**Returns:** [`ro.sync.ecss.extensions.api.ContentInterval`](../../ContentInterval.md)

