# Class: `AuthorTableDeleteColumnArguments`

**Package:** [`ro.sync.ecss.extensions.api.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteColumnArguments`

## Description

## Fields

### `authorAccess`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md)

### `columnCellsIntervals`

**Type:** `java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`

## Constructors

### `<init>(AuthorAccess authorAccess, List<ContentInterval> columnCellsIntervals)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md)): The Author access.
- `columnCellsIntervals` (`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`): The list of intervals of the cells that compose 
   the deleted column. Each ContentInterval contains the start and end 
   offsets of the cells.

## Methods

### `getAuthorAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md)

### `getColumnCellsIntervals()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`

