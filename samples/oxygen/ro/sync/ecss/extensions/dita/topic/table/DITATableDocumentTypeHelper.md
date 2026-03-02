# Class: `DITATableDocumentTypeHelper`

**Package:** [`ro.sync.ecss.extensions.dita.topic.table`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.topic.table.DITATableDocumentTypeHelper`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.cals.CALSDocumentTypeHelper`](../../../commons/table/operations/cals/CALSDocumentTypeHelper.md)

## Description

Looks at class attribute values.

## Constructors

### `<init>()`

## Methods

### `getTableCellElementNames()`

**Returns:** `java.lang.String[]`

### `isTableCell(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `isColspec(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `getTableRowElementNames()`

**Returns:** `java.lang.String[]`

### `isTableRow(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `getTableElementLocalName()`

**Returns:** `java.lang.String[]`

### `isTable(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `isContentReference(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `isActuallyTableAndNotTgroup(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): the node for which we perform the check.

**Returns:** `boolean`

### `getTableCellSpanProvider(AuthorElement tgroupElement)`

**Parameters:**
- `tgroupElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)

