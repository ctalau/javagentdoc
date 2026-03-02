# Class: `DocbookCALSTableHelper`

**Package:** [`ro.sync.ecss.extensions.docbook.table.properties`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.docbook.table.properties.DocbookCALSTableHelper`

**Extends:** [`ro.sync.ecss.extensions.commons.table.properties.TablePropertiesHelperBase`](../../../commons/table/properties/TablePropertiesHelperBase.md)

## Description

## Fields

### `CELL_ELEMENT`

**Type:** `java.lang.String`

### `ROW_ELEMENT`

**Type:** `java.lang.String`

### `FOOTER_ELEMENT`

**Type:** `java.lang.String`

### `HEADER_ELEMENT`

**Type:** `java.lang.String`

### `BODY_ELEMENT`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `isTableBody(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isTableRow(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isTableHead(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isTableFoot(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isTable(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isTableGroup(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isTableColspec(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isTableCell(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `getElementTag(int elementType)`

**Parameters:**
- `elementType` (`int`)

**Returns:** `java.lang.String`

### `allowsFooter()`

**Returns:** `boolean`

