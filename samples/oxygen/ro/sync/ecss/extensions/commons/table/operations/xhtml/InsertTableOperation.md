# Class: `InsertTableOperation`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations.xhtml`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.xhtml.InsertTableOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../../../api/AuthorOperation.md), [`ro.sync.ecss.extensions.commons.table.operations.InsertTableOperationBase`](../InsertTableOperationBase.md)

## Description

## Fields

### `NAMESPACE`

**Type:** `java.lang.String`

### `CONVERSION_ELEMENT_CHECKER`

**Type:** `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`

## Constructors

### `<init>()`

## Methods

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `insertTable([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../../api/node/AuthorDocumentFragment.md) fragments, `java.util.List<java.util.Map<java.lang.String,java.lang.String>>` rowAttributes, `boolean` cellsFragments, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, `java.lang.String` namespace, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../AuthorTableHelper.md) tableHelper, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../TableInfo.md) tableInfo)`

**Returns:** `void`

Each fragments will correspond to a cell. The resulting table will have one column and as many rows as fragments length.
 
 If no fragment is provided an empty table is inserted (a dialog is shown
 to choose all the table properties)

### `insertTable([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../../api/node/AuthorDocumentFragment.md) fragments, `boolean` cellsFragments, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, `java.lang.String` namespace, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../AuthorTableHelper.md) tableHelper, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../TableInfo.md) tableInfo)`

**Returns:** `void`

### `addTableBody(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../TableInfo.md) tableInfo, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../../api/node/AuthorDocumentFragment.md) fragments, `java.util.List<java.util.Map<java.lang.String,java.lang.String>>` rowAttributes, `boolean` cellsFragments, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../AuthorTableHelper.md) tableHelper, `java.lang.String` namespace)`

**Returns:** `void`

### `addTableCols(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../TableInfo.md) tableInfo)`

**Returns:** `void`

The table will be inserted with proportional column widths.

### `addTableFooter(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../TableInfo.md) tableInfo)`

**Returns:** `void`

### `addTableHeader(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../TableInfo.md) tableInfo)`

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../../api/ArgumentDescriptor.md)

The operation will display a dialog for choosing the table attributes.

### `getDescription()`

**Returns:** `java.lang.String`

### `getTableXMLFragment([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../TableInfo.md) tableInfo, `java.lang.String` namespace, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../../api/node/AuthorDocumentFragment.md) fragments, `java.util.List<java.util.Map<java.lang.String,java.lang.String>>` rowAttributes, `boolean` cellsFragments, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../AuthorTableHelper.md) tableHelper)`

**Returns:** `java.lang.StringBuilder`

