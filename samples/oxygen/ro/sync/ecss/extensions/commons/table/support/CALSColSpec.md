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

### `<init>(int indexInDocument, int colNumber, boolean colNumberSpecified, java.lang.String colName, java.lang.String colWidth, java.lang.Boolean colSep, java.lang.Boolean rowSep)`

**Parameters:**
- `indexInDocument` (`int`): Index in colspec elements list.
- `colNumber` (`int`): The number of the column. It is 1 based.
- `colNumberSpecified` (`boolean`): `true` if the column number was specified as an attribute
- `colName` (`java.lang.String`): The name of the column.
- `colWidth` (`java.lang.String`): The string representation of the column width 
   as described in the WidthRepresentation.
- `colSep` (`java.lang.Boolean`): `true` if the column separators are needed for that column, 
     `false` if not, `null` if the framework default should apply. 
     For instance Docbook has the colsep on true by default, while DITA on false.
- `rowSep` (`java.lang.Boolean`): `true` if the row separators are needed for that column, 
     `false` if not, `null` if the framework default should apply. 
     For instance Docbook has the rowsep on true by default, while DITA on false.

### `<init>(int indexInDocument, int colNumber, boolean colNumberSpecified, java.lang.String colName, ro.sync.ecss.extensions.api.WidthRepresentation colWidth)`

The rowsep and colsep are set to null, i.e. the document type default.

**Parameters:**
- `indexInDocument` (`int`): Index in colspec elements list.
- `colNumber` (`int`): The number of this column. It is 1 based.
- `colNumberSpecified` (`boolean`): `true` if the column number was specified as an attribute
- `colName` (`java.lang.String`): The name of this column.
- `colWidth` ([`ro.sync.ecss.extensions.api.WidthRepresentation`](../../../api/WidthRepresentation.md)): The column width representation.

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

### `createXMLFragment(java.lang.String ns)`

The general format of the generated fragment is:
 


 `
 <colspec colnum="integer_value" colname="string_value" colwidth="string_value" xmlns="URI"/>
 `

**Parameters:**
- `ns` (`java.lang.String`): The namespace URI of the table element. It can be `null`.

**Returns:** `java.lang.String`

### `appendAttrWithValue(java.lang.StringBuilder buffer, java.lang.String attrName, java.lang.String attrValue, boolean allowEmptyValue)`

**Parameters:**
- `buffer` (`java.lang.StringBuilder`): The buffer where to append the attribute name and its value.
- `attrName` (`java.lang.String`): The attribute name.
- `attrValue` (`java.lang.String`): The attribute value.
- `allowEmptyValue` (`boolean`): `true` to allow empty values, `false` if checking for `null` is enough.

**Returns:** `void`

### `setColWidth(ro.sync.ecss.extensions.api.WidthRepresentation colWidth)`

**Parameters:**
- `colWidth` ([`ro.sync.ecss.extensions.api.WidthRepresentation`](../../../api/WidthRepresentation.md)): The column width to be set.

**Returns:** `void`

### `getAlign()`

**Returns:** `java.lang.String`

### `setAlign(java.lang.String align)`

**Parameters:**
- `align` (`java.lang.String`): The textAlign to set.

**Returns:** `void`

