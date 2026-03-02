# Interface: `AuthorTableCellSpanProvider`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`

**Extends:** [`ro.sync.ecss.extensions.api.Extension`](./Extension.md)

## Description

It should be implemented when the author extension being developed offers
 support for editing data in tabular form.

## Methods

### `getColSpan(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Returns:** `java.lang.Integer`

For example, for the DocBook CALS tables the number of columns the cell spans across
 is computed by looking at the `spanspec` attribute. In case the `spanspec` 
 attribute is missing then the column span is defined by the `namest` and `nameend` attribute.

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The node that represents a table cell in CSS.

### `getRowSpan(ro.sync.ecss.extensions.api.node.AuthorElement cellElement)`

**Returns:** `java.lang.Integer`

For example, for the DocBook CALS tables this value is computed
 by looking at the `morerows` attribute.

**Parameters:**
- `cellElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The AuthorElement that represents a table cell in CSS.

### `init(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Returns:** `void`

Its intended
 to extract information from the element representing the table only once, not on every 
 getColSpan() or getRowSpan() call. Example: for a DocBook table we identify and cache
 the `colspec` and `spanspec` elements from that table.
 
 A new instance of the table cell span provider is used for every table in a document so 
 cached data cannot be used between different tables..

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The AuthorElement representing a table (it has the CSS display property 
 set on 'table').

### `hasColumnSpecifications(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Returns:** `boolean`

For example the 
 CALS table model requires `colspec` elements to be present.

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The AuthorElement that is rendered as a table.

