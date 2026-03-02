# Class: `TablePropertiesHelperBase`

**Package:** [`ro.sync.ecss.extensions.commons.table.properties`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.properties.TablePropertiesHelperBase`

**Implements:** [`ro.sync.ecss.extensions.commons.table.properties.TablePropertiesHelper`](./TablePropertiesHelper.md)

## Description

## Constructors

### `<init>()`

## Methods

### `isTable(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `isTableGroup(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `isTableBody(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `isTableHead(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `isTableFoot(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `isTableRow(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `isTableCell(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `isTableColspec(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `isNodeOfType(ro.sync.ecss.extensions.api.node.AuthorElement node, int type)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `type` (`int`)

### `allowsFooter()`

**Returns:** `boolean`

### `getFirstChildOfTypeFromParentWithType(ro.sync.ecss.extensions.api.node.AuthorElement currentRow, int childType, int parentType)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

**Parameters:**
- `currentRow` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `childType` (`int`)
- `parentType` (`int`)

### `getElementType(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Returns:** `int`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `getElementTag(int elementType)`

**Returns:** `java.lang.String`

**Parameters:**
- `elementType` (`int`)

### `getElementName(int elementType)`

**Returns:** `java.lang.String`

**Parameters:**
- `elementType` (`int`)

