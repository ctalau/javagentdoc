# Class: `InsertTableOperation`

**Package:** [`ro.sync.ecss.extensions.docbook.table`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.docbook.table.InsertTableOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.AbstractTableOperation`](../../commons/table/operations/AbstractTableOperation.md)

**Implements:** [`ro.sync.ecss.extensions.commons.table.operations.InsertTableOperationBase`](../../commons/table/operations/InsertTableOperationBase.md), [`ro.sync.ecss.extensions.commons.table.operations.InsertTableCellsContentConstants`](../../commons/table/operations/InsertTableCellsContentConstants.md)

## Description

## Fields

### `LOGGER`

**Type:** `org.slf4j.Logger`

### `HTML_TABLE_MODEL`

**Type:** `java.lang.String`

### `CALS_TABLE_MODEL`

**Type:** `java.lang.String`

### `NO_TABLE_MODEL`

**Type:** `java.lang.String`

### `DEFAULT_TABLE_MODEL_ARGUMENT_NAME`

**Type:** `java.lang.String`

### `TABLE_MODEL_ARGUMENT`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor`](../../api/ArgumentDescriptor.md)

### `cellContent`

**Type:** `java.lang.String`

### `defaultTableModel`

**Type:** `int`

### `CONVERSION_ELEMENT_CHECKER`

**Type:** `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`

### `ARGUMENTS`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `doOperationInternal([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `getXMLFragment([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md) tableInfo, `java.lang.String` namespace, `boolean` innerTable, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md) fragments, `java.util.List<java.util.Map<java.lang.String,java.lang.String>>` rowAttributes, `boolean` cellsFragments, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../commons/table/operations/AuthorTableHelper.md) tableHelper)`

**Returns:** `java.lang.StringBuilder`

### `addCALSXMLFragment(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md) tableInfo, `java.lang.String` namespace, `boolean` innerTable, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md) fragments, `java.util.List<java.util.Map<java.lang.String,java.lang.String>>` rowAttributes, `boolean` cellsFragments, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../commons/table/operations/AuthorTableHelper.md) tableHelper)`

**Returns:** `void`

### `addCALSTableBody(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md) tableInfo, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md) fragments, `java.util.List<java.util.Map<java.lang.String,java.lang.String>>` rowAttributes, `boolean` cellsFragments, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../commons/table/operations/AuthorTableHelper.md) tableHelper, `java.lang.String` namespace)`

**Returns:** `void`

### `addCALSTableFooter(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md) tableInfo)`

**Returns:** `void`

### `addCALSTableHeader(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md) tableInfo)`

**Returns:** `void`

### `addCALSColSpecs(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md) tableInfo)`

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `addHTMLXMLFragment(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md) tableInfo, `java.lang.String` namespace, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md) fragments, `java.util.List<java.util.Map<java.lang.String,java.lang.String>>` rowAttributes, `boolean` cellsFragments, `boolean` isDocBook5, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../commons/table/operations/AuthorTableHelper.md) tableHelper)`

**Returns:** `void`

### `addHTMLTableCols(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md) tableInfo)`

**Returns:** `void`

### `addHTMLTableHeader(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md) tableInfo, `boolean` isDocBook5)`

**Returns:** `void`

### `addHTMLTableBody(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md) tableInfo, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md) fragments, `java.util.List<java.util.Map<java.lang.String,java.lang.String>>` rowAttributes, `boolean` cellsFragments, `boolean` isDocBook5, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../commons/table/operations/AuthorTableHelper.md) tableHelper, `java.lang.String` namespace)`

**Returns:** `void`

### `addHTMLTableFooter(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md) tableInfo, `boolean` isDocBook5)`

**Returns:** `void`

### `insertTable([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md) fragments, `boolean` cellsFragments, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.lang.String` namespace, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../commons/table/operations/AuthorTableHelper.md) tableHelper, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md) tableInfo)`

**Returns:** `void`

### `insertTable([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md) fragments, `java.util.List<java.util.Map<java.lang.String,java.lang.String>>` rowAttributes, `boolean` cellsFragments, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.lang.String` namespace, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../commons/table/operations/AuthorTableHelper.md) tableHelper, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md) tableInfo)`

**Returns:** `void`

Each fragments will correspond to a cell. The resulting table will have one column and as many rows as fragments length.
 
 If no fragment is provided an empty table is inserted (a dialog is shown
 to choose all the table properties)

