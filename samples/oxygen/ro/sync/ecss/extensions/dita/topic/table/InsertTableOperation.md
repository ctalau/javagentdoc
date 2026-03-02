# Class: `InsertTableOperation`

**Package:** [`ro.sync.ecss.extensions.dita.topic.table`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.topic.table.InsertTableOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../../api/AuthorOperation.md), [`ro.sync.ecss.extensions.commons.table.operations.InsertTableOperationBase`](../../../commons/table/operations/InsertTableOperationBase.md), [`ro.sync.ecss.extensions.commons.table.operations.InsertTableCellsContentConstants`](../../../commons/table/operations/InsertTableCellsContentConstants.md)

## Description

## Fields

### `CHOICE_TABLE_MODEL`

**Type:** `java.lang.String`

### `SIMPLE_TABLE_MODEL`

**Type:** `java.lang.String`

### `CALS_TABLE_MODEL`

**Type:** `java.lang.String`

### `PROPERTIES_TABLE_MODEL`

**Type:** `java.lang.String`

### `NO_TABLE_MODEL`

**Type:** `java.lang.String`

### `DEFAULT_TABLE_MODEL_ARGUMENT_NAME`

**Type:** `java.lang.String`

### `DEFAULT_TABLE_MODEL_ARGUMENT`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor`](../../../api/ArgumentDescriptor.md)

### `cellContent`

**Type:** `java.lang.String`

### `defaultTableModel`

**Type:** `int`

### `ARGUMENTS`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `CONVERSION_ELEMENT_CHECKER`

**Type:** `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`

## Constructors

### `<init>()`

## Methods

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

### `addTableBody(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, java.util.List<java.util.Map<java.lang.String,java.lang.String>> rowAttributes, boolean cellsFragments, java.lang.String namespace, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper, java.lang.String rowElName, java.lang.String entryElName)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The string buffer where to append content.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md)): The table information.
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md)): The cell fragments.
- `rowAttributes` (`java.util.List<java.util.Map<java.lang.String,java.lang.String>>`): For each fragment this list can contain a list of corresponding 
 attributes that can be set on the row element.
- `cellsFragments` (`boolean`)
- `namespace` (`java.lang.String`): The table namespace.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The Author access.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../../commons/table/operations/AuthorTableHelper.md)): The table helper.
- `rowElName` (`java.lang.String`): The name of the row element.
- `entryElName` (`java.lang.String`): The name of the entry element.

### `addTableHeader(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String rowElName, java.lang.String entryElName)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The buffer where to append the XML fragment for the table header.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md)): Information about the table.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The Author access.
- `rowElName` (`java.lang.String`): The name of the row element.
- `entryElName` (`java.lang.String`): The name of the cell element.

### `addSimpleTableBody(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, java.util.List<java.util.Map<java.lang.String,java.lang.String>> rowAttributes, boolean cellsFragments, java.lang.String namespace, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper, java.lang.String stentryElName)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The string buffer to append content.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md)): The table info.
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md)): The cell fragments.
- `rowAttributes` (`java.util.List<java.util.Map<java.lang.String,java.lang.String>>`): The attributes specific to each inserted row (each entry in this list
 corresponds to a fragment from the "fragments" list).
- `cellsFragments` (`boolean`)
- `namespace` (`java.lang.String`): The table namespace.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The Author access.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../../commons/table/operations/AuthorTableHelper.md)): The table helper.
- `stentryElName` (`java.lang.String`): The name of the entry element for a simple table.

### `addChoiceTableBody(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, java.util.List<java.util.Map<java.lang.String,java.lang.String>> rowAttributes, boolean cellsFragments, java.lang.String namespace, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The string buffer to append content.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md)): The table info.
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md)): The cell fragments.
- `rowAttributes` (`java.util.List<java.util.Map<java.lang.String,java.lang.String>>`): For each fragment this list can contain a list of corresponding 
 attributes that can be set on the row element.
- `cellsFragments` (`boolean`): `true` if cells.
- `namespace` (`java.lang.String`): The table namespace.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The Author access.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../../commons/table/operations/AuthorTableHelper.md)): The table helper.

### `addSimpleTableColWidths(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`)
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md))

### `addSimpleTableHeader(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String stentryElName)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The buffer where to append the XML fragment for the table header.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md)): Information about the table.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The Author access.
- `stentryElName` (`java.lang.String`): The name of the cell element.

### `addChoiceTableHeader(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The string buffer to append content.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md)): The table info.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The Author access.

### `addColSpecs(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo, ro.sync.ecss.extensions.api.AuthorDocumentController authorDocumentController)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The buffer where to append the XML fragment for the table header.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md)): Information about the table.
- `authorDocumentController` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md)): The Author document controller.

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

The operation will display a dialog for choosing the table attributes.

### `getDescription()`

**Returns:** `java.lang.String`

### `insertTable(ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, boolean cellsFragments, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String namespace, ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo)`

**Returns:** `void`

**Parameters:**
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md))
- `cellsFragments` (`boolean`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `namespace` (`java.lang.String`)
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../../commons/table/operations/AuthorTableHelper.md))
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md))

### `insertTable(ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, java.util.List<java.util.Map<java.lang.String,java.lang.String>> rowAttributes, boolean cellsFragments, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String namespace, ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo)`

**Returns:** `void`

Each fragments will correspond to a cell. The resulting table will have one column and as many rows as fragments length.
 
 If no fragment is provided an empty table is inserted (a dialog is shown
 to choose all the table properties)

**Parameters:**
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md)): An array of AuthorDocumentFragments that are used as content of the inserted cells.
- `rowAttributes` (`java.util.List<java.util.Map<java.lang.String,java.lang.String>>`): For each fragment this list can contain a list of corresponding 
 attributes that can be set on the row element.
- `cellsFragments` (`boolean`): If the value is `true` then the fragments 
 where originally cells.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `namespace` (`java.lang.String`): The namespace.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../../commons/table/operations/AuthorTableHelper.md)): The table helper.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md)): The details about table creation. If null, a dialog is 
 presented to let the user choose the details.

### `addPropertiesTableBody(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, java.util.List<java.util.Map<java.lang.String,java.lang.String>> rowAttributes, boolean cellsFragments, java.lang.String namespace, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The string buffer to append content.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md)): The table info.
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md)): The cell fragments.
- `rowAttributes` (`java.util.List<java.util.Map<java.lang.String,java.lang.String>>`): For each fragment this list can contain a list of corresponding 
 attributes that can be set on the row element.
- `cellsFragments` (`boolean`): `true` if cells.
- `namespace` (`java.lang.String`): The table namespace.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The Author access.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../../commons/table/operations/AuthorTableHelper.md)): The table helper.

### `addPropertiesTableHeader(java.lang.StringBuilder tableXMLFragment, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `void`

**Parameters:**
- `tableXMLFragment` (`java.lang.StringBuilder`): The string buffer to append content.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md)): The table info.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The Author access.

### `createCell(java.lang.StringBuilder xmlFragment, java.lang.String elName)`

**Returns:** `void`

**Parameters:**
- `xmlFragment` (`java.lang.StringBuilder`): The XML fragment where the cell will be appended.
- `elName` (`java.lang.String`): The element name.

