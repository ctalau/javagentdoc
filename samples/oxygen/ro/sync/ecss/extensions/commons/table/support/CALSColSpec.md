# Class: `CALSColSpec`

**Package:** [`ro.sync.ecss.extensions.commons.table.support`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.support.CALSColSpec`

## Description

DocBook or DITA tables).

## Fields

### `colNumber`

**Type:** `int`

### `colName`

**Type:** `java.lang.String`

### `colWidth`

**Type:** [`ro.sync.ecss.extensions.api.WidthRepresentation`](../../../api/WidthRepresentation.md)

See WidthRepresentation javadoc
 for details about the format.

### `colNumberSpecified`

**Type:** `boolean`

### `indexInDocument`

**Type:** `int`

### `align`

**Type:** `java.lang.String`

### `colSep`

**Type:** `java.lang.Boolean`

This can be `true` if the separator 
 should be painted at the right of the cell, `false` if no separator 
 is needed, or `null` if the default specified by the document type 
 should be applied.
 For instance in Docbook, the default value is `true` while in DITA 
 is `false`.
 If the cell is the last in the row, this value is disregarded.

### `rowSep`

**Type:** `java.lang.Boolean`

This can be `true` if the separator 
 should be painted below the cell, `false` if no separator 
 is needed, or `null` if the default specified by the document type 
 should be applied.
 For instance in Docbook, the default value is `true` while in DITA 
 is `false`.
 If the cell is the in the last row, this value is disregarded.

## Constructors

### `<init>(`int` indexInDocument, `int` colNumber, `boolean` colNumberSpecified, `java.lang.String` colName, `java.lang.String` colWidth, `java.lang.Boolean` colSep, `java.lang.Boolean` rowSep)`

### `<init>(`int` indexInDocument, `int` colNumber, `boolean` colNumberSpecified, `java.lang.String` colName, [`ro.sync.ecss.extensions.api.WidthRepresentation`](../../../api/WidthRepresentation.md) colWidth)`

The rowsep and colsep are set to null, i.e. the document type default.

## Methods

### `getColSep()`

**Returns:** `java.lang.Boolean`

### `getRowSep()`

**Returns:** `java.lang.Boolean`

### `isColNumberSpecified()`

**Returns:** `boolean`

### `getIndexInDocument()`

**Returns:** `int`

### `getColumnNumber()`

**Returns:** `int`

### `getColumnName()`

**Returns:** `java.lang.String`

### `getColWidth()`

**Returns:** [`ro.sync.ecss.extensions.api.WidthRepresentation`](../../../api/WidthRepresentation.md)

### `toString()`

**Returns:** `java.lang.String`

### `createXMLFragment(`java.lang.String` ns)`

**Returns:** `java.lang.String`

The general format of the generated fragment is:
 


 `
 <colspec colnum="integer_value" colname="string_value" colwidth="string_value" xmlns="URI"/>
 `

### `appendAttrWithValue(`java.lang.StringBuilder` buffer, `java.lang.String` attrName, `java.lang.String` attrValue, `boolean` allowEmptyValue)`

**Returns:** `void`

### `setColWidth([`ro.sync.ecss.extensions.api.WidthRepresentation`](../../../api/WidthRepresentation.md) colWidth)`

**Returns:** `void`

### `getAlign()`

**Returns:** `java.lang.String`

### `setAlign(`java.lang.String` align)`

**Returns:** `void`

