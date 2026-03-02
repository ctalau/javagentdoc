# Class: `InsertTableOperation`

**Package:** [`ro.sync.ecss.extensions.tei.table`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.tei.table.InsertTableOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md), [`ro.sync.ecss.extensions.commons.table.operations.InsertTableOperationBase`](../../commons/table/operations/InsertTableOperationBase.md)

## Description

## Fields

### `ARGUMENT_NAME`

**Type:** `java.lang.String`

The value is `defaultNamespace`

### `ARGUMENTS`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `CONVERSION_ELEMENT_CHECKER`

**Type:** `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`

## Constructors

### `<init>()`

## Methods

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

### `addTableBody(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, java.util.List<java.util.Map<java.lang.String,java.lang.String>> rowAttributes, boolean cellsFragments, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper, java.lang.String namespace)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The table XML fragment buffer to which to add the table body representation.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md)): Information about the table.
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md)): An array of AuthorDocumentFragments that are used as content
                          of the inserted cells.
- `rowAttributes` (`java.util.List<java.util.Map<java.lang.String,java.lang.String>>`): For each fragment this list can contain a list of corresponding 
 attributes that can be set on the row element.
- `cellsFragments` (`boolean`): If the value is `true` then the fragments where originally cells.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../commons/table/operations/AuthorTableHelper.md)): Table helper.
- `namespace` (`java.lang.String`): The namespace.

### `addTableHeader(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The table XML fragment buffer to which to add the table header representation.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md)): Information about the table.

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `insertTable(ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, boolean cellsFragments, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String namespace, ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo)`

**Returns:** `void`

**Parameters:**
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md))
- `cellsFragments` (`boolean`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `namespace` (`java.lang.String`)
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../commons/table/operations/AuthorTableHelper.md))
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md))

### `insertTable(ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, java.util.List<java.util.Map<java.lang.String,java.lang.String>> rowAttributes, boolean cellsFragments, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String namespace, ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo)`

**Returns:** `void`

Each fragments will correspond to a cell. The resulting table will have one column and as many rows as fragments length.
 
 If no fragment is provided an empty table is inserted (a dialog is shown
 to choose all the table properties)

**Parameters:**
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md)): An array of AuthorDocumentFragments that are used as content of the inserted cells.
- `rowAttributes` (`java.util.List<java.util.Map<java.lang.String,java.lang.String>>`): For each fragment this list can contain a list of corresponding 
 attributes that can be set on the row element.
- `cellsFragments` (`boolean`): If the value is `true` then the fragments 
 where originally cells.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `namespace` (`java.lang.String`): The namespace.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../commons/table/operations/AuthorTableHelper.md)): The table helper.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md)): The details about table creation. If null, a dialog is 
 presented to let the user choose the details.

