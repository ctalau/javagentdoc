# Class: `TableRowsSpecificationInformation`

**Package:** [`ro.sync.ecss.extensions.api.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.table.operations.TableRowsSpecificationInformation`

**Implements:** [`ro.sync.ecss.component.AuthorContentMetadata`](../../../../component/AuthorContentMetadata.md)

## Description

It can be extended to provide specific table rows properties for different 
 types of tables or document types.
 

 This information is requested when table rows are copied or dragged and 
 it can be used when the rows must be inserted in the document (on paste or
 drop).
 Please note that when a column is copied the table column specification information
 will be copied into the clipboard (the AuthorClipboardObject contains 
 a field of TableRowsSpecificationInformation type), 
 so it will be serialized.

## Fields

### `spanningCellIndexes`

**Type:** `java.util.List<java.util.List<java.lang.Integer>>`

### `sourceTableColumnsCount`

**Type:** `int`

## Constructors

### `<init>(`int` sourceTableColumnsCount)`

## Methods

### `addSpanningCellIndexes(`java.util.List<java.lang.Integer>` indexes)`

**Returns:** `void`

### `getSpanningCellIndexes()`

**Returns:** `java.util.List<java.util.List<java.lang.Integer>>`

### `getSourceTableColumnsCount()`

**Returns:** `int`

