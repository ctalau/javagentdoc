# Class: `AuthorTableInsertColumnArguments`

**Package:** [`ro.sync.ecss.extensions.api.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.table.operations.AuthorTableInsertColumnArguments`

## Description

## Fields

### `insertOffset`

**Type:** `int`

### `columnFragments`

**Type:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../node/AuthorDocumentFragment.md)

### `fragmentsWrappedInCells`

**Type:** `boolean`

### `authorAccess`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md)

### `columnSpecification`

**Type:** [`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](./TableColumnSpecificationInformation.md)

It can be `null` if no information is specified for table column.

## Constructors

### `<init>(int insertOffset, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] columnFragments, boolean fragmentsWrappedInCells, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation columnSpecification)`

**Parameters:**
- `insertOffset` (`int`): The offset where the column is inserted.
- `columnFragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../node/AuthorDocumentFragment.md)): The array containing the cells nodes that compose an Author table column.
- `fragmentsWrappedInCells` (`boolean`): `true` if the given column fragments represents the cells nodes 
 or only the content of the cells nodes.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md)): The Author access.
- `columnSpecification` ([`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](./TableColumnSpecificationInformation.md)): Table column specification information that is requested
 when a column is copied or dragged, from AuthorTableOperationsHandler#getColumnSpecification(AuthorAccess, ro.sync.ecss.extensions.api.node.AuthorElement, int)
 method. It can be `null` if no information is specified for table column.

## Methods

### `getAuthorAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md)

### `getColumnFragments()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../node/AuthorDocumentFragment.md)

### `getInsertOffset()`

**Returns:** `int`

### `areFragmentsWrappedInCells()`

**Returns:** `boolean`

### `getColumnSpecificationInformation()`

**Returns:** [`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](./TableColumnSpecificationInformation.md)

This information is requested when a column is copied or dragged, from
 AuthorTableOperationsHandler#getColumnSpecification(AuthorAccess, ro.sync.ecss.extensions.api.node.AuthorElement, int)
 method.

