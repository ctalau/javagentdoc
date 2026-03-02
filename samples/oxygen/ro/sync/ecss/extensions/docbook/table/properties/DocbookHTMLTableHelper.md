# Class: `DocbookHTMLTableHelper`

**Package:** [`ro.sync.ecss.extensions.docbook.table.properties`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.docbook.table.properties.DocbookHTMLTableHelper`

**Extends:** [`ro.sync.ecss.extensions.docbook.table.properties.DocbookCALSTableHelper`](./DocbookCALSTableHelper.md)

## Description

## Fields

### `CELL_NAME`

**Type:** `java.lang.String`

### `HEADER_CELL_NAME`

**Type:** `java.lang.String`

### `ROW_NAME`

**Type:** `java.lang.String`

### `HEADER_NAME`

**Type:** `java.lang.String`

### `BODY_NAME`

**Type:** `java.lang.String`

### `FOOTER_NAME`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `isTableRow(AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isTableFoot(AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isTableGroup(AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isTableColspec(AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isTableCell(AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `getElementTag(int elementType)`

**Parameters:**
- `elementType` (`int`)

**Returns:** `java.lang.String`

### `getElementName(int elementType)`

**Parameters:**
- `elementType` (`int`)

**Returns:** `java.lang.String`

### `isTable(AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

