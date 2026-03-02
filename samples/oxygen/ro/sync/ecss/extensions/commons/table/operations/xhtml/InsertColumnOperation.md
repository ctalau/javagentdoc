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

### `<init>(ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper documentTypeHelper)`

**Parameters:**
- `documentTypeHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](../AuthorTableHelper.md)): Document type helper, has methods specific to a document type.

## Methods

### `getCellElementName(ro.sync.ecss.extensions.api.node.AuthorElement rowElement, int newColumnIndex)`

**Returns:** `java.lang.String`

**Parameters:**
- `rowElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))
- `newColumnIndex` (`int`)

### `getLocalName(java.lang.String qName)`

**Returns:** `java.lang.String`

**Parameters:**
- `qName` (`java.lang.String`): The name in a qualified form.

### `updateColumnCellsSpan(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider tableSupport, ro.sync.ecss.extensions.api.node.AuthorElement tableElem, int newColumnIndex, ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation columnSpecification, java.lang.String namespace, int noOfColumnsToBeInserted)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../../api/AuthorAccess.md))
- `tableSupport` ([`ro.sync.ecss.extensions.api.AuthorTableCellSpanProvider`](../../../../api/AuthorTableCellSpanProvider.md))
- `tableElem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../api/node/AuthorElement.md))
- `newColumnIndex` (`int`)
- `columnSpecification` ([`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](../../../../api/table/operations/TableColumnSpecificationInformation.md))
- `namespace` (`java.lang.String`)
- `noOfColumnsToBeInserted` (`int`)

