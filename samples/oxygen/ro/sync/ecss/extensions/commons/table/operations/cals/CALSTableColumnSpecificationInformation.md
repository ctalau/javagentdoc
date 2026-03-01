# Class: `CALSTableColumnSpecificationInformation`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations.cals`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.cals.CALSTableColumnSpecificationInformation`

**Extends:** [`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](../../../../api/table/operations/TableColumnSpecificationInformation.md)

## Description

Holds informations like 
 column width and column name. It is used on table column insertion operations 
 handling, to keep the original column name and width unchanged
 (for example when a CALS column is copied this information is kept 
 into the clipboard and then used on paste column operation, as values for the
 inserted column colspec attributes).

## Fields

### `serialVersionUID`

**Type:** `long`

### `columnName`

**Type:** `java.lang.String`

## Constructors

### `<init>([`ro.sync.ecss.extensions.api.WidthRepresentation`](../../../../api/WidthRepresentation.md) widthRepresentation, `java.lang.String` columnName)`

## Methods

### `getColumnName()`

**Returns:** `java.lang.String`

### `setColumnName(`java.lang.String` colName)`

**Returns:** `void`

