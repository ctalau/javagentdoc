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

### `<init>(ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper documentTypeHelper)`

**Parameters:**
- `documentTypeHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)): Author Document type helper, has methods specific to a document type.

## Methods

### `getOperationArguments()`

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

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `doOperationInternal(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

**Returns:** `void`

### `insertRows(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String xPathLocation, java.lang.String namespace, ro.sync.ecss.extensions.api.node.AuthorNode nodeAtCaret, ro.sync.ecss.extensions.api.node.AuthorElement tableElement, int noOfRowsToBeInserted, java.lang.String relativePosition)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `xPathLocation` (`java.lang.String`): The xPath location.
- `namespace` (`java.lang.String`): The rows namespace.
- `nodeAtCaret` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The node at caret
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The parent table element.
- `noOfRowsToBeInserted` (`int`): Number of rows to be inserted.
- `relativePosition` (`java.lang.String`): One of AuthorConstants#POSITION_AFTER or
   AuthorConstants#POSITION_BEFORE constants.

**Returns:** `void`

### `getRowXMLFragment(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement tableElement, java.lang.String namespace, java.lang.String newCellFragment, int newCellColumnIndex, int initialNumberOfColumns)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table element.
- `namespace` (`java.lang.String`): The namespace of the table row.
- `newCellFragment` (`java.lang.String`): The row will contain an additional cell added at the given 
   column index.
- `newCellColumnIndex` (`int`): The column index of the additional cell
- `initialNumberOfColumns` (`int`): The initial number of columns.

**Returns:** `java.lang.String`

### `getRowXMLFragment(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement tableElement, ro.sync.ecss.extensions.api.node.AuthorElement referenceRowElement, boolean preferReferencedRow, java.lang.String namespace, boolean before)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table element.
- `referenceRowElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The reference row element (from the caret position).
- `preferReferencedRow` (`boolean`): `true` to prefer the referenced row.
- `namespace` (`java.lang.String`): The namespace of the table row.
- `before` (`boolean`): `true` to insert before the reference row.

**Returns:** `java.lang.String`

### `createCell(ro.sync.ecss.extensions.api.node.AuthorElement tableElement, java.lang.StringBuilder newRowStructure, int i)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table element into which to add the cell.
- `newRowStructure` (`java.lang.StringBuilder`): The row which will contain the cell.
- `i` (`int`): The column index of the cell. Used to determine the name of the cell element.

**Returns:** `void`

### `mergeArrays(java.lang.String[] array1, java.lang.String[] array2)`

**Parameters:**
- `array1` (`java.lang.String[]`): The first array.
- `array2` (`java.lang.String[]`): The second array.

**Returns:** `java.lang.String[]`

### `createCellXMLFragment(ro.sync.ecss.extensions.api.node.AuthorElement cell, java.lang.String[] skippedAttributes, java.lang.String[] allowedAttributes, java.lang.String cellContent)`

**Parameters:**
- `cell` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The cell to copy the element name and attributes from.
- `skippedAttributes` (`java.lang.String[]`): List of skipped attributes names.
- `allowedAttributes` (`java.lang.String[]`)
- `cellContent` (`java.lang.String`): The cell content.

**Returns:** `java.lang.String`

### `incrementRowSpans(ro.sync.ecss.extensions.api.node.AuthorElement tableElement, ro.sync.ecss.extensions.api.node.AuthorElement referenceRowElement, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int minRowSpan, int numberOfInsertedRows, java.lang.String relativePosition)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table element.
- `referenceRowElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The reference row element.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `minRowSpan` (`int`): The minimum row span that must be updated.
- `numberOfInsertedRows` (`int`): The number of inserted rows.
- `relativePosition` (`java.lang.String`)

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `getCellElementName(ro.sync.ecss.extensions.api.node.AuthorElement tableElement, int columnIndex)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table element
- `columnIndex` (`int`): The column index.

**Returns:** `java.lang.String`

### `getRowElementName(ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Parameters:**
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table parent element.

**Returns:** `java.lang.String`

### `useCurrentRowTemplateOnInsert()`

**Returns:** `boolean`

### `getDefaultContentForEmptyCells()`

**Returns:** `java.lang.String`

### `removeCustomInsertionDescriptor(ro.sync.ecss.extensions.api.ArgumentDescriptor[] superArguments)`

**Parameters:**
- `superArguments` ([`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)): The input arguments list.

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

