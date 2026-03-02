# Class: `DocbookHTMLShowTablePropertiesOperationBase`

**Package:** [`ro.sync.ecss.extensions.docbook.table.properties`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.docbook.table.properties.DocbookHTMLShowTablePropertiesOperationBase`

**Extends:** [`ro.sync.ecss.extensions.commons.table.properties.CALSAndHTMLShowTablePropertiesBase`](../../../commons/table/properties/CALSAndHTMLShowTablePropertiesBase.md)

## Description

## Fields

### `BASELINE`

**Type:** `java.lang.String`

### `TABLE_FRAME_VALUES`

**Type:** `java.lang.String[]`

## Constructors

### `<init>(ro.sync.ecss.extensions.commons.table.properties.TablePropertiesHelper helper)`

**Parameters:**
- `helper` ([`ro.sync.ecss.extensions.commons.table.properties.TablePropertiesHelper`](../../../commons/table/properties/TablePropertiesHelper.md)): The table helper.

## Methods

### `getRowsAttributesToEdit()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `getCellsAttributes()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `getColumnsAttributes()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `processFragment(ro.sync.ecss.extensions.api.node.AuthorElement currentNode, java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment> fragments, boolean moveToHeader)`

**Returns:** `void`

**Parameters:**
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `fragments` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `moveToHeader` (`boolean`)

### `getTableAttribute()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `getColSpecs(java.util.Map<ro.sync.ecss.extensions.api.node.AuthorElement,java.util.Set<java.lang.Integer>> map)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`

**Parameters:**
- `map` (`java.util.Map<ro.sync.ecss.extensions.api.node.AuthorElement,java.util.Set<java.lang.Integer>>`)

### `getCellIndexes(java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> cells)`

**Returns:** `java.util.Map<ro.sync.ecss.extensions.api.node.AuthorElement,java.util.Set<java.lang.Integer>>`

**Parameters:**
- `cells` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)

### `getHelpPageID()`

**Returns:** `java.lang.String`

