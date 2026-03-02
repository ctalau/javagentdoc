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

### `isTableCell(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `isColspec(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `getTableRowElementNames()`

**Returns:** `java.lang.String[]`

### `isTableRow(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `getTableElementLocalName()`

**Returns:** `java.lang.String[]`

### `isTable(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `isContentReference(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `isActuallyTableAndNotTgroup(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): the node for which we perform the check.

**Returns:** `boolean`

### `getTableCellSpanProvider(ro.sync.ecss.extensions.api.node.AuthorElement tgroupElement)`

**Parameters:**
- `tgroupElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../api/AuthorTableCellSpanProvider.md)

