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

### `doOperationInternal(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

### `getXMLFragment(ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo, java.lang.String namespace, boolean innerTable, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, java.util.List<java.util.Map<java.lang.String,java.lang.String>> rowAttributes, boolean cellsFragments, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper)`

**Returns:** `java.lang.StringBuilder`

**Parameters:**
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md)): The object containing information about the table.
- `namespace` (`java.lang.String`): The namespace of the table element.
- `innerTable` (`boolean`): `true` if inner table.
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md)): The cells fragments.
- `rowAttributes` (`java.util.List<java.util.Map<java.lang.String,java.lang.String>>`): For each fragment this list can contain a list of corresponding 
 attributes that can be set on the row element.
- `cellsFragments` (`boolean`): `true` if the fragments are cells.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The Author access.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../commons/table/operations/AuthorTableHelper.md)): The table helper.

### `addCALSXMLFragment(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo, java.lang.String namespace, boolean innerTable, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, java.util.List<java.util.Map<java.lang.String,java.lang.String>> rowAttributes, boolean cellsFragments, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The string buffer where to append CALS elements.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md)): The table information.
- `namespace` (`java.lang.String`): The table element namespace.
- `innerTable` (`boolean`)
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md)): The cells fragments.
- `rowAttributes` (`java.util.List<java.util.Map<java.lang.String,java.lang.String>>`): For each fragment this list can contain a list of corresponding 
 attributes that can be set on the row element.
- `cellsFragments` (`boolean`): `true` if the fragments are cells.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The Author acccess.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../commons/table/operations/AuthorTableHelper.md)): The table helper

### `addCALSTableBody(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, java.util.List<java.util.Map<java.lang.String,java.lang.String>> rowAttributes, boolean cellsFragments, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper, java.lang.String namespace)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The string buffer where to append CALS elements.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md)): The table information.
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md)): The cell fragments.
- `rowAttributes` (`java.util.List<java.util.Map<java.lang.String,java.lang.String>>`): For each fragment this list can contain a list of corresponding 
 attributes that can be set on the row element.
- `cellsFragments` (`boolean`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The Author access.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../commons/table/operations/AuthorTableHelper.md)): The table helper.
- `namespace` (`java.lang.String`): The table element namespace.

### `addCALSTableFooter(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The string buffer representing the table XML fragment.
                          The CALS table footer fragment will be added to this table fragment.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md)): The table info containing informations about the table columns number.

### `addCALSTableHeader(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The string buffer representing the table XML fragment.
                          The CALS table header fragment will be added to this table fragment.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md)): The table info containing informations about the table columns number.

### `addCALSColSpecs(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`)
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md))

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `addHTMLXMLFragment(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo, java.lang.String namespace, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, java.util.List<java.util.Map<java.lang.String,java.lang.String>> rowAttributes, boolean cellsFragments, boolean isDocBook5, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The string buffer where to append HTML elements.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md)): The table information.
- `namespace` (`java.lang.String`): The table element namespace.
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md)): The cells fragments.
- `rowAttributes` (`java.util.List<java.util.Map<java.lang.String,java.lang.String>>`): The attributes specific to each inserted row (each entry in this list
 corresponds to a fragment from the "fragments" list).
- `cellsFragments` (`boolean`): `true` if the fragments are cells.
- `isDocBook5` (`boolean`): `true` the fragment is for DocBook5, `false` for DocBook4
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The Author acccess.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../commons/table/operations/AuthorTableHelper.md)): The table helper.

### `addHTMLTableCols(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`)
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md))

### `addHTMLTableHeader(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo, boolean isDocBook5)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The string buffer representing the table XML fragment.
                          The HTML table header fragment will be added to this table fragment.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md)): The table info containing informations about the table columns number.
- `isDocBook5` (`boolean`): `true` the fragment is for DocBook5, `false` for DocBook4

### `addHTMLTableBody(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, java.util.List<java.util.Map<java.lang.String,java.lang.String>> rowAttributes, boolean cellsFragments, boolean isDocBook5, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper, java.lang.String namespace)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The string buffer where to append HTML elements.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md)): The table information.
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../api/node/AuthorDocumentFragment.md)): The cell fragments.
- `rowAttributes` (`java.util.List<java.util.Map<java.lang.String,java.lang.String>>`): The attributes specific to each inserted row (each entry in this list
 corresponds to a fragment from the "fragments" list).
- `cellsFragments` (`boolean`)
- `isDocBook5` (`boolean`): `true` the fragment is for DocBook5, `false` for DocBook4
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The Author access.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../commons/table/operations/AuthorTableHelper.md)): The table helper.
- `namespace` (`java.lang.String`): The table element namespace.

### `addHTMLTableFooter(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo, boolean isDocBook5)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The string buffer representing the table XML fragment.
                          The HTML table footer fragment will be added to this table fragment.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../commons/table/operations/TableInfo.md)): The table info containing informations about the table columns number.
- `isDocBook5` (`boolean`): `true` the fragment is for DocBook5, `false` for DocBook4

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

