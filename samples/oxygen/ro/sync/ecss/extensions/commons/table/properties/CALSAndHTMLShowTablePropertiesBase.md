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

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`

**Parameters:**
- `selections` (`java.util.List<java.lang.Integer[]>`)

### `getColumnsInformation(java.util.List<java.lang.Integer[]> selections)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md)

This information will contain the properties 
 which will be edited, the columns on which those properties applies and some context 
 information.

**Parameters:**
- `selections` (`java.util.List<java.lang.Integer[]>`): The list with the selection intervals.

### `getCellsInformation(java.util.List<java.lang.Integer[]> selections)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md)

**Parameters:**
- `selections` (`java.util.List<java.lang.Integer[]>`): The list with the selection intervals.

### `getCellsAttributes()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `getRowsInformation(java.util.List<java.lang.Integer[]> selections)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md)

This information will contain the properties 
 which will be edited, the rows on which those properties applies and some context 
 information.

**Parameters:**
- `selections` (`java.util.List<java.lang.Integer[]>`): The list with the selection intervals.

### `computeFragmentsToMoveInsideFooter(java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment> fragments, java.util.List<javax.swing.text.Position> offsets, ro.sync.ecss.extensions.commons.table.properties.TabInfo tabInfo, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> nodesToModify, ro.sync.ecss.extensions.api.node.AuthorElement currentNode)`

**Returns:** `boolean`

**Parameters:**
- `fragments` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `offsets` (`java.util.List<javax.swing.text.Position>`)
- `tabInfo` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md))
- `nodesToModify` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `computeFragmentMoveInsideHeader(java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment> fragments, java.util.List<javax.swing.text.Position> offsets, ro.sync.ecss.extensions.commons.table.properties.TabInfo tabInfo, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> nodesToModify, ro.sync.ecss.extensions.api.node.AuthorElement currentNode)`

**Returns:** `boolean`

**Parameters:**
- `fragments` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `offsets` (`java.util.List<javax.swing.text.Position>`)
- `tabInfo` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md))
- `nodesToModify` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `computeFragmentsToMoveInsideBody(java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment> fragments, java.util.List<javax.swing.text.Position> offsets, ro.sync.ecss.extensions.commons.table.properties.TabInfo tabInfo, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> nodesToModify, ro.sync.ecss.extensions.api.node.AuthorElement currentNode)`

**Returns:** `boolean`

**Parameters:**
- `fragments` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `offsets` (`java.util.List<javax.swing.text.Position>`)
- `tabInfo` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md))
- `nodesToModify` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `processFragment(ro.sync.ecss.extensions.api.node.AuthorElement currentNode, java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment> fragments, boolean moveToHeader)`

**Returns:** `void`

**Parameters:**
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The current row node.
- `fragments` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`): The list with fragment which will be inserted.
- `moveToHeader` (`boolean`): `true` if the current node is moved from body/footer to header.

### `getRowsAttributesToEdit()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `getColumnsAttributes()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `getColSpecs(java.util.Map<ro.sync.ecss.extensions.api.node.AuthorElement,java.util.Set<java.lang.Integer>> map)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`

**Parameters:**
- `map` (`java.util.Map<ro.sync.ecss.extensions.api.node.AuthorElement,java.util.Set<java.lang.Integer>>`): A map containing the table elements and cells indexes.

### `getCellIndexes(java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> cells)`

**Returns:** `java.util.Map<ro.sync.ecss.extensions.api.node.AuthorElement,java.util.Set<java.lang.Integer>>`

**Parameters:**
- `cells` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`): The selected cells.

