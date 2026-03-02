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

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

**Returns:** `void`

### `addRelTableBody(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, boolean cellsFragments, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String namespace, ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper)`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The string buffer to append content.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md)): The table info.
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md)): The cell fragments.
- `cellsFragments` (`boolean`): `true` if cells.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The Author access.
- `namespace` (`java.lang.String`): The table namespace.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../../commons/table/operations/AuthorTableHelper.md)): The table helper.

**Returns:** `void`

### `addRelTableHeader(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo)`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The string buffer representing the table XML fragment.
                            The table header fragment will be added to this table fragment.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md)): The table info containing informations about the table columns number.

**Returns:** `void`

### `getArguments()`

The operation will display a dialog for choosing the table attributes.

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `insertTable(ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, boolean cellsFragments, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String namespace, ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo)`

**Parameters:**
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md))
- `cellsFragments` (`boolean`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `namespace` (`java.lang.String`)
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../../commons/table/operations/AuthorTableHelper.md))
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md))

**Returns:** `void`

