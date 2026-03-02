# Class: `TEITableCellSpanProvider`

**Package:** [`ro.sync.ecss.extensions.commons.table.spansupport`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.spansupport.TEITableCellSpanProvider`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)

## Description

## Constructors

### `<init>()`

## Methods

### `getColSpan(AuthorElement cellElement)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `java.lang.Integer`

### `getRowSpan(AuthorElement cellElement)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `java.lang.Integer`

### `init(AuthorElement tableElement)`

Cell spanning information in a TEI table is given through the
 attributes of the cell element.

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

### `hasColumnSpecifications(AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

