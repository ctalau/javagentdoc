# Class: `RelTablePropertiesHelper`

**Package:** [`ro.sync.ecss.extensions.dita.map.table`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.map.table.RelTablePropertiesHelper`

**Extends:** [`ro.sync.ecss.extensions.commons.table.properties.TablePropertiesHelperBase`](../../../commons/table/properties/TablePropertiesHelperBase.md)

## Description

## Fields

### `RELCOLSPEC`

**Type:** `java.lang.String`

### `RELCELL`

**Type:** `java.lang.String`

### `RELHEADER`

**Type:** `java.lang.String`

### `RELROW`

**Type:** `java.lang.String`

### `ATTRIBUTE_CLASS`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `isTable(AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isTableRow(AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isHeaderRow(AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The node to be checked.

**Returns:** `boolean`

### `isBodyRow(AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The node to be checked.

**Returns:** `boolean`

### `isTableHead(AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isTableBody(AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isTableCell(AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `getElementTag(int elementType)`

**Parameters:**
- `elementType` (`int`)

**Returns:** `java.lang.String`

### `getElementName(int elementType)`

**Parameters:**
- `elementType` (`int`)

**Returns:** `java.lang.String`

