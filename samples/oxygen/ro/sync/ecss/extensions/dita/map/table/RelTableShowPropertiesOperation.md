# Class: `RelTableShowPropertiesOperation`

**Package:** [`ro.sync.ecss.extensions.dita.map.table`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.map.table.RelTableShowPropertiesOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.table.properties.ShowTablePropertiesBaseOperation`](../../../commons/table/properties/ShowTablePropertiesBaseOperation.md)

## Description

## Constructors

### `<init>()`

## Methods

### `getCategoriesAndProperties(java.util.List<java.lang.Integer[]> selections)`

**Parameters:**
- `selections` (`java.util.List<java.lang.Integer[]>`)

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`

### `getRowsTabInformation(java.util.List<java.lang.Integer[]> selections)`

This information will contain the properties 
 which will be edited, the rows on which those properties applies and some context 
 information.

**Parameters:**
- `selections` (`java.util.List<java.lang.Integer[]>`): The list with the selection intervals.

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](../../../commons/table/properties/TabInfo.md)

### `computeFragmentsToMoveInsideFooter(java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment> fragments, java.util.List<javax.swing.text.Position> offsets, ro.sync.ecss.extensions.commons.table.properties.TabInfo tabInfo, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> nodesToModify, ro.sync.ecss.extensions.api.node.AuthorElement currentNode)`

**Parameters:**
- `fragments` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `offsets` (`java.util.List<javax.swing.text.Position>`)
- `tabInfo` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](../../../commons/table/properties/TabInfo.md))
- `nodesToModify` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `computeFragmentMoveInsideHeader(java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment> fragments, java.util.List<javax.swing.text.Position> offsets, ro.sync.ecss.extensions.commons.table.properties.TabInfo tabInfo, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> nodesToModify, ro.sync.ecss.extensions.api.node.AuthorElement currentNode)`

**Parameters:**
- `fragments` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `offsets` (`java.util.List<javax.swing.text.Position>`)
- `tabInfo` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](../../../commons/table/properties/TabInfo.md))
- `nodesToModify` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `computeFragmentsToMoveInsideBody(java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment> fragments, java.util.List<javax.swing.text.Position> offsets, ro.sync.ecss.extensions.commons.table.properties.TabInfo tabInfo, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> nodesToModify, ro.sync.ecss.extensions.api.node.AuthorElement currentNode)`

**Parameters:**
- `fragments` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `offsets` (`java.util.List<javax.swing.text.Position>`)
- `tabInfo` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](../../../commons/table/properties/TabInfo.md))
- `nodesToModify` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `getTableAttribute()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `getHelpPageID()`

**Returns:** `java.lang.String`

