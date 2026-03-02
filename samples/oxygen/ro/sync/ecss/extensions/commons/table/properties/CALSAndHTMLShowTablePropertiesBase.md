# Class: `CALSAndHTMLShowTablePropertiesBase`

**Package:** [`ro.sync.ecss.extensions.commons.table.properties`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.properties.CALSAndHTMLShowTablePropertiesBase`

**Extends:** [`ro.sync.ecss.extensions.commons.table.properties.ShowTablePropertiesBaseOperation`](./ShowTablePropertiesBaseOperation.md)

## Description

## Fields

### `HORIZONTAL_ALIGN_VALUES`

**Type:** `java.lang.String[]`

### `VERTICAL_ALIGN_VALUES`

**Type:** `java.lang.String[]`

## Constructors

### `<init>(ro.sync.ecss.extensions.commons.table.properties.TablePropertiesHelper helper)`

**Parameters:**
- `helper` ([`ro.sync.ecss.extensions.commons.table.properties.TablePropertiesHelper`](./TablePropertiesHelper.md)): The table helper.

## Methods

### `getCategoriesAndProperties(java.util.List<java.lang.Integer[]> selections)`

**Parameters:**
- `selections` (`java.util.List<java.lang.Integer[]>`)

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`

### `getColumnsInformation(java.util.List<java.lang.Integer[]> selections)`

This information will contain the properties 
 which will be edited, the columns on which those properties applies and some context 
 information.

**Parameters:**
- `selections` (`java.util.List<java.lang.Integer[]>`): The list with the selection intervals.

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md)

### `getCellsInformation(java.util.List<java.lang.Integer[]> selections)`

**Parameters:**
- `selections` (`java.util.List<java.lang.Integer[]>`): The list with the selection intervals.

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md)

### `getCellsAttributes()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `getRowsInformation(java.util.List<java.lang.Integer[]> selections)`

This information will contain the properties 
 which will be edited, the rows on which those properties applies and some context 
 information.

**Parameters:**
- `selections` (`java.util.List<java.lang.Integer[]>`): The list with the selection intervals.

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md)

### `computeFragmentsToMoveInsideFooter(java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment> fragments, java.util.List<javax.swing.text.Position> offsets, ro.sync.ecss.extensions.commons.table.properties.TabInfo tabInfo, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> nodesToModify, ro.sync.ecss.extensions.api.node.AuthorElement currentNode)`

**Parameters:**
- `fragments` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `offsets` (`java.util.List<javax.swing.text.Position>`)
- `tabInfo` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md))
- `nodesToModify` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `computeFragmentMoveInsideHeader(java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment> fragments, java.util.List<javax.swing.text.Position> offsets, ro.sync.ecss.extensions.commons.table.properties.TabInfo tabInfo, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> nodesToModify, ro.sync.ecss.extensions.api.node.AuthorElement currentNode)`

**Parameters:**
- `fragments` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `offsets` (`java.util.List<javax.swing.text.Position>`)
- `tabInfo` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md))
- `nodesToModify` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `computeFragmentsToMoveInsideBody(java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment> fragments, java.util.List<javax.swing.text.Position> offsets, ro.sync.ecss.extensions.commons.table.properties.TabInfo tabInfo, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> nodesToModify, ro.sync.ecss.extensions.api.node.AuthorElement currentNode)`

**Parameters:**
- `fragments` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `offsets` (`java.util.List<javax.swing.text.Position>`)
- `tabInfo` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md))
- `nodesToModify` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `processFragment(ro.sync.ecss.extensions.api.node.AuthorElement currentNode, java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment> fragments, boolean moveToHeader)`

**Parameters:**
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The current row node.
- `fragments` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`): The list with fragment which will be inserted.
- `moveToHeader` (`boolean`): `true` if the current node is moved from body/footer to header.

**Returns:** `void`

### `getRowsAttributesToEdit()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `getColumnsAttributes()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `getColSpecs(java.util.Map<ro.sync.ecss.extensions.api.node.AuthorElement,java.util.Set<java.lang.Integer>> map)`

**Parameters:**
- `map` (`java.util.Map<ro.sync.ecss.extensions.api.node.AuthorElement,java.util.Set<java.lang.Integer>>`): A map containing the table elements and cells indexes.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`

### `getCellIndexes(java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> cells)`

**Parameters:**
- `cells` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`): The selected cells.

**Returns:** `java.util.Map<ro.sync.ecss.extensions.api.node.AuthorElement,java.util.Set<java.lang.Integer>>`

