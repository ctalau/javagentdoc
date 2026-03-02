# Class: `AuthorTableInsertRowArguments`

**Package:** [`ro.sync.ecss.extensions.api.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.table.operations.AuthorTableInsertRowArguments`

## Description

## Fields

### `insertOffset`

**Type:** `int`

### `rowsFragments`

**Type:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../node/AuthorDocumentFragment.md)

### `authorAccess`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md)

## Constructors

### `<init>(AuthorAccess authorAccess, AuthorDocumentFragment[] rowFragments, int insertOffset)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md)): The Author access.
- `rowFragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../node/AuthorDocumentFragment.md)): The array containing the rows nodes that are inserted
- `insertOffset` (`int`): The offset where the rows are inserted.

## Methods

### `getAuthorAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md)

### `getRowFragments()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../node/AuthorDocumentFragment.md)

### `getInsertOffset()`

**Returns:** `int`

