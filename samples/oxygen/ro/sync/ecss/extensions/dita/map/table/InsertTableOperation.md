# Class: `InsertTableOperation`

**Package:** [`ro.sync.ecss.extensions.dita.map.table`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.map.table.InsertTableOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../../api/AuthorOperation.md), [`ro.sync.ecss.extensions.commons.table.operations.InsertTableOperationBase`](../../../commons/table/operations/InsertTableOperationBase.md)

## Description

## Fields

### `LOGGER`

**Type:** `org.slf4j.Logger`

### `ARGUMENTS`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `addRelTableBody(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md) tableInfo, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md) fragments, `boolean` cellsFragments, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `java.lang.String` namespace, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../../commons/table/operations/AuthorTableHelper.md) tableHelper)`

**Returns:** `void`

### `addRelTableHeader(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md) tableInfo)`

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

The operation will display a dialog for choosing the table attributes.

### `getDescription()`

**Returns:** `java.lang.String`

### `insertTable([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md) fragments, `boolean` cellsFragments, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `java.lang.String` namespace, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../../commons/table/operations/AuthorTableHelper.md) tableHelper, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md) tableInfo)`

**Returns:** `void`

