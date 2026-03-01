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

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `addTableBody(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md) tableInfo, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md) fragments, `java.util.List<java.util.Map<java.lang.String,java.lang.String>>` rowAttributes, `boolean` cellsFragments, `java.lang.String` namespace, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../../commons/table/operations/AuthorTableHelper.md) tableHelper, `java.lang.String` rowElName, `java.lang.String` entryElName)`

**Returns:** `void`

### `addTableHeader(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md) tableInfo, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `java.lang.String` rowElName, `java.lang.String` entryElName)`

**Returns:** `void`

### `addSimpleTableBody(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md) tableInfo, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md) fragments, `java.util.List<java.util.Map<java.lang.String,java.lang.String>>` rowAttributes, `boolean` cellsFragments, `java.lang.String` namespace, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../../commons/table/operations/AuthorTableHelper.md) tableHelper, `java.lang.String` stentryElName)`

**Returns:** `void`

### `addChoiceTableBody(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md) tableInfo, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md) fragments, `java.util.List<java.util.Map<java.lang.String,java.lang.String>>` rowAttributes, `boolean` cellsFragments, `java.lang.String` namespace, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../../commons/table/operations/AuthorTableHelper.md) tableHelper)`

**Returns:** `void`

### `addSimpleTableColWidths(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md) tableInfo)`

**Returns:** `void`

### `addSimpleTableHeader(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md) tableInfo, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `java.lang.String` stentryElName)`

**Returns:** `void`

### `addChoiceTableHeader(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md) tableInfo, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess)`

**Returns:** `void`

### `addColSpecs(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md) tableInfo, [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md) authorDocumentController)`

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

The operation will display a dialog for choosing the table attributes.

### `getDescription()`

**Returns:** `java.lang.String`

### `insertTable([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md) fragments, `boolean` cellsFragments, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `java.lang.String` namespace, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../../commons/table/operations/AuthorTableHelper.md) tableHelper, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md) tableInfo)`

**Returns:** `void`

### `insertTable([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md) fragments, `java.util.List<java.util.Map<java.lang.String,java.lang.String>>` rowAttributes, `boolean` cellsFragments, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `java.lang.String` namespace, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../../commons/table/operations/AuthorTableHelper.md) tableHelper, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md) tableInfo)`

**Returns:** `void`

Each fragments will correspond to a cell. The resulting table will have one column and as many rows as fragments length.
 
 If no fragment is provided an empty table is inserted (a dialog is shown
 to choose all the table properties)

### `addPropertiesTableBody(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md) tableInfo, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md) fragments, `java.util.List<java.util.Map<java.lang.String,java.lang.String>>` rowAttributes, `boolean` cellsFragments, `java.lang.String` namespace, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../../../commons/table/operations/AuthorTableHelper.md) tableHelper)`

**Returns:** `void`

### `addPropertiesTableHeader(`java.lang.StringBuilder` tableXMLFragment, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](../../../commons/table/operations/TableInfo.md) tableInfo, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess)`

**Returns:** `void`

### `createCell(`java.lang.StringBuilder` xmlFragment, `java.lang.String` elName)`

**Returns:** `void`

