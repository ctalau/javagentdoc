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

**Type:** [`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`](../../commons/operations/CommonsOperationsUtil/ConversionElementHelper.md)

## Constructors

### `<init>()`

## Methods

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `addTableBody(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md) tableInfo, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md) fragments, `java.util.List<java.util.Map<java.lang.String,java.lang.String>>` rowAttributes, `boolean` cellsFragments, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../commons/table/operations/AuthorTableHelper.md) tableHelper, `java.lang.String` namespace)`

**Returns:** `void`

### `addTableHeader(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md) tableInfo)`

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `insertTable([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md) fragments, `boolean` cellsFragments, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.lang.String` namespace, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../commons/table/operations/AuthorTableHelper.md) tableHelper, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md) tableInfo)`

**Returns:** `void`

### `insertTable([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md) fragments, `java.util.List<java.util.Map<java.lang.String,java.lang.String>>` rowAttributes, `boolean` cellsFragments, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.lang.String` namespace, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../commons/table/operations/AuthorTableHelper.md) tableHelper, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md) tableInfo)`

**Returns:** `void`

Each fragments will correspond to a cell. The resulting table will have one column and as many rows as fragments length.
 
 If no fragment is provided an empty table is inserted (a dialog is shown
 to choose all the table properties)

