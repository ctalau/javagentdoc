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

### `doOperation(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../../api/ArgumentsMap.md))

**Returns:** `void`

### `insertTable(AuthorDocumentFragment[] fragments, List<Map<String,String>> rowAttributes, boolean cellsFragments, AuthorAccess authorAccess, String namespace, AuthorTableHelper tableHelper, TableInfo tableInfo)`

Each fragments will correspond to a cell. The resulting table will have one column and as many rows as fragments length.
 
 If no fragment is provided an empty table is inserted (a dialog is shown
 to choose all the table properties)

**Parameters:**
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../../api/node/AuthorDocumentFragment.md)): An array of AuthorDocumentFragments that are used as content of the inserted cells.
- `rowAttributes` (`java.util.List<java.util.Map<java.lang.String,java.lang.String>>`): For each fragment this list can contain a list of corresponding 
   attributes that can be set on the row element.
- `cellsFragments` (`boolean`): If the value is `true` then the fragments 
   where originally cells.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md)): The author access.
- `namespace` (`java.lang.String`): The namespace.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../AuthorTableHelper.md)): The table helper.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../TableInfo.md)): The details about table creation. If null, a dialog is 
   presented to let the user choose the details.

**Returns:** `void`

### `insertTable(AuthorDocumentFragment[] fragments, boolean cellsFragments, AuthorAccess authorAccess, String namespace, AuthorTableHelper tableHelper, TableInfo tableInfo)`

**Parameters:**
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../../api/node/AuthorDocumentFragment.md))
- `cellsFragments` (`boolean`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `namespace` (`java.lang.String`)
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../AuthorTableHelper.md))
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../TableInfo.md))

**Returns:** `void`

### `addTableBody(StringBuilder tableXMLFragment, TableInfo tableInfo, AuthorDocumentFragment[] fragments, List<Map<String,String>> rowAttributes, boolean cellsFragments, AuthorAccess authorAccess, AuthorTableHelper tableHelper, String namespace)`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The string buffer representing the table XML fragment.
                            The table body fragment will be added to this table fragment.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../TableInfo.md)): The table info containing informations about the table rows and columns number.
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../../api/node/AuthorDocumentFragment.md))
- `rowAttributes` (`java.util.List<java.util.Map<java.lang.String,java.lang.String>>`): The attributes specific to each inserted row (each entry in this list
   corresponds to a fragment from the "fragments" list).
- `cellsFragments` (`boolean`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../AuthorTableHelper.md))
- `namespace` (`java.lang.String`)

**Returns:** `void`

### `addTableCols(StringBuilder tableXMLFragment, TableInfo tableInfo)`

The table will be inserted with proportional column widths.

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The string buffer representing the table XML fragment.
                            The table columns specification fragment will be added to this table fragment.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../TableInfo.md)): The table info containing informations about the table columns number

**Returns:** `void`

### `addTableFooter(StringBuilder tableXMLFragment, TableInfo tableInfo)`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The string buffer representing the table XML fragment.
                            The table footer fragment will be added to this table fragment.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../TableInfo.md)): The table info containing informations about the table columns number.

**Returns:** `void`

### `addTableHeader(StringBuilder tableXMLFragment, TableInfo tableInfo)`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The string buffer representing the table XML fragment.
                            The table header fragment will be added to this table fragment.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../TableInfo.md)): The table info containing informations about the table columns number.

**Returns:** `void`

### `getArguments()`

The operation will display a dialog for choosing the table attributes.

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `getTableXMLFragment(TableInfo tableInfo, String namespace, AuthorDocumentFragment[] fragments, List<Map<String,String>> rowAttributes, boolean cellsFragments, AuthorAccess authorAccess, AuthorTableHelper tableHelper)`

**Parameters:**
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../TableInfo.md)): The table information.
- `namespace` (`java.lang.String`): The table element namespace.
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../../api/node/AuthorDocumentFragment.md))
- `rowAttributes` (`java.util.List<java.util.Map<java.lang.String,java.lang.String>>`): The attributes specific to each inserted row (each entry in this list
   corresponds to a fragment from the "fragments" list).
- `cellsFragments` (`boolean`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../AuthorTableHelper.md))

**Returns:** `java.lang.StringBuilder`

