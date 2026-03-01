# Class: `InsertRowOperationBase`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.InsertRowOperationBase`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.AbstractTableOperation`](./AbstractTableOperation.md)

## Description

## Fields

### `XPATH_LOCATION_ARGUMENT`

**Type:** `java.lang.String`

The argument defines the location where the operation will be executed as an XPath expression.
 The value is `insertLocation`

### `RELATIVE_POSITION_ARGUMENT`

**Type:** `java.lang.String`

The argument defines the relative position to the node obtained 
  from the XPath location where the row(s) will be inserted.
  The value is `insertPosition`

### `CUSTOM_ROW_INSERTION_ARGUMENT`

**Type:** `java.lang.String`

The value is `customRowInsertion`

### `CUSTOM_INSERTION_ARGUMENT_DESCRIPTOR`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor`](../../../api/ArgumentDescriptor.md)

### `arguments`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

## Constructors

### `<init>([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md) documentTypeHelper)`

## Methods

### `getOperationArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

The first argument defines the location where the operation will be executed
 as an xpath expression, the second one defines the relative position to the 
 node obtained from the XPath location, the third is the namespace argument
 descriptor and the forth specifies if the user desires the insertion of multiple rows or not.
 For the second argument included in the returned arguments descriptor array,
 the allowed values are:
 `
 AuthorConstants#POSITION_BEFORE, 
 AuthorConstants#POSITION_AFTER, 
 AuthorConstants#POSITION_INSIDE_FIRST
 AuthorConstants#POSITION_INSIDE_LAST
 `

### `doOperationInternal([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `insertRows([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `java.lang.String` xPathLocation, `java.lang.String` namespace, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) nodeAtCaret, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement, `int` noOfRowsToBeInserted, `java.lang.String` relativePosition)`

**Returns:** `void`

### `getRowXMLFragment([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement, `java.lang.String` namespace, `java.lang.String` newCellFragment, `int` newCellColumnIndex, `int` initialNumberOfColumns)`

**Returns:** `java.lang.String`

### `getRowXMLFragment([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) referenceRowElement, `boolean` preferReferencedRow, `java.lang.String` namespace, `boolean` before)`

**Returns:** `java.lang.String`

### `createCell([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement, `java.lang.StringBuilder` newRowStructure, `int` i)`

**Returns:** `void`

### `mergeArrays(`java.lang.String[]` array1, `java.lang.String[]` array2)`

**Returns:** `java.lang.String[]`

### `createCellXMLFragment([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) cell, `java.lang.String[]` skippedAttributes, `java.lang.String[]` allowedAttributes, `java.lang.String` cellContent)`

**Returns:** `java.lang.String`

### `incrementRowSpans([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) referenceRowElement, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `int` minRowSpan, `int` numberOfInsertedRows, `java.lang.String` relativePosition)`

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `getCellElementName([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement, `int` columnIndex)`

**Returns:** `java.lang.String`

### `getRowElementName([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement)`

**Returns:** `java.lang.String`

### `useCurrentRowTemplateOnInsert()`

**Returns:** `boolean`

### `getDefaultContentForEmptyCells()`

**Returns:** `java.lang.String`

### `removeCustomInsertionDescriptor([`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md) superArguments)`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

