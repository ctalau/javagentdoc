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

### `<init>(`int` insertOffset, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../node/AuthorDocumentFragment.md) columnFragments, `boolean` fragmentsWrappedInCells, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](./TableColumnSpecificationInformation.md) columnSpecification)`

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

