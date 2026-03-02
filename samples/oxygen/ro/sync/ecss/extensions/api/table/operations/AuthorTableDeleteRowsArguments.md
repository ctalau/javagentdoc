# Class: `AuthorTableDeleteRowsArguments`

**Package:** [`ro.sync.ecss.extensions.api.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowsArguments`

## Description

## Fields

### `authorAccess`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md)

### `contentIntervals`

**Type:** `java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`

The rows that must be deleted are all the rows that intersects the given content intervals.

## Constructors

### `<init>(AuthorAccess authorAccess, List<ContentInterval> contentIntervals)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md)): The Author access.
- `contentIntervals` (`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`): The content intervals (containing the **inclusive** start offset and 
   **exclusive** end offset) determining the rows that must be deleted.
   The rows that must be deleted are all the rows that intersects the given content intervals.

## Methods

### `getAuthorAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md)

### `getContentIntervals()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`

