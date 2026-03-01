# Class: `TableColumnSpecificationInformation`

**Package:** [`ro.sync.ecss.extensions.api.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`

**Implements:** [`ro.sync.ecss.component.AuthorContentMetadata`](../../../../component/AuthorContentMetadata.md)

## Description

It can be extended to provide specific table column properties for different 
 types of tables or document types.
 

 This information is requested when a column is copied or dragged and 
 it can be used when the column must be inserted in the document (on paste or
 drop).
 Please note that when a column is copied the table column specification information
 will be copied into the clipboard (the AuthorClipboardObject contains 
 a field of TableColumnSpecificationInformation type), 
 so it will be serialized.  
 

 The column specification is send as an argument to the 
 AuthorTableOperationsHandler#handleInsertColumn(AuthorTableInsertColumnArguments) method
 and it can be used to keep informations like column name or column width unchchanged when 
 the column is moved or copy-pasted.

## Fields

### `serialVersionUID`

**Type:** `long`

### `widthRepresentation`

**Type:** [`ro.sync.ecss.extensions.api.WidthRepresentation`](../../WidthRepresentation.md)

Specifies the fixed and relative width 
 determined from the column specification.

## Constructors

### `<init>([`ro.sync.ecss.extensions.api.WidthRepresentation`](../../WidthRepresentation.md) widthRepresentation)`

## Methods

### `getWidthRepresentation()`

**Returns:** [`ro.sync.ecss.extensions.api.WidthRepresentation`](../../WidthRepresentation.md)

