# Class: `InsertColumnOperation`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations.xhtml`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.xhtml.InsertColumnOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.InsertColumnOperationBase`](../InsertColumnOperationBase.md)

**Implements:** [`ro.sync.ecss.extensions.commons.table.operations.xhtml.XHTMLConstants`](./XHTMLConstants.md)

## Description

## Fields

### `ELEMENT_NAME_COLSPEC`

**Type:** `java.lang.String`

### `ELEMENT_NAME_THEAD`

**Type:** `java.lang.String`

### `ELEMENT_NAME_TBODY`

**Type:** `java.lang.String`

### `ELEMENT_NAME_COLGROUP`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

### `<init>([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../AuthorTableHelper.md) documentTypeHelper)`

## Methods

### `getCellElementName([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) rowElement, `int` newColumnIndex)`

**Returns:** `java.lang.String`

### `getLocalName(`java.lang.String` qName)`

**Returns:** `java.lang.String`

### `updateColumnCellsSpan([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md) tableSupport, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md) tableElem, `int` newColumnIndex, [`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](../../../../api/table/operations/TableColumnSpecificationInformation.md) columnSpecification, `java.lang.String` namespace, `int` noOfColumnsToBeInserted)`

**Returns:** `void`

