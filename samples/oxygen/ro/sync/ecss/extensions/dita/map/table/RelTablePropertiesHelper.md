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

### `isTable(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isTableRow(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isHeaderRow(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The node to be checked.

**Returns:** `boolean`

### `isBodyRow(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The node to be checked.

**Returns:** `boolean`

### `isTableHead(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isTableBody(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `isTableCell(ro.sync.ecss.extensions.api.node.AuthorElement node)`

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

