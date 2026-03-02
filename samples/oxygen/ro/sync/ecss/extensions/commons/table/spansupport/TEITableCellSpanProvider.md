# Class: `TEITableCellSpanProvider`

**Package:** [`ro.sync.ecss.extensions.commons.table.spansupport`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.spansupport.TEITableCellSpanProvider`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)

## Description

## Constructors

### `<init>()`

## Methods

### `getColSpan(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `java.lang.Integer`

### `getRowSpan(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `java.lang.Integer`

### `init(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

Cell spanning information in a TEI table is given through the
 attributes of the cell element.

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

### `hasColumnSpecifications(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

