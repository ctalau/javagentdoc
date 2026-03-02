# Class: `RelTableShowPropertiesOperation`

**Package:** [`ro.sync.ecss.extensions.dita.map.table`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.map.table.RelTableShowPropertiesOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.table.properties.ShowTablePropertiesBaseOperation`](../../../commons/table/properties/ShowTablePropertiesBaseOperation.md)

## Description

## Constructors

### `<init>()`

## Methods

### `getCategoriesAndProperties(java.util.List<java.lang.Integer[]> selections)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`

**Parameters:**
- `selections` (`java.util.List<java.lang.Integer[]>`)

### `getRowsTabInformation(java.util.List<java.lang.Integer[]> selections)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](../../../commons/table/properties/TabInfo.md)

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
- `tabInfo` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](../../../commons/table/properties/TabInfo.md))
- `nodesToModify` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `computeFragmentMoveInsideHeader(java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment> fragments, java.util.List<javax.swing.text.Position> offsets, ro.sync.ecss.extensions.commons.table.properties.TabInfo tabInfo, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> nodesToModify, ro.sync.ecss.extensions.api.node.AuthorElement currentNode)`

**Returns:** `boolean`

**Parameters:**
- `fragments` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `offsets` (`java.util.List<javax.swing.text.Position>`)
- `tabInfo` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](../../../commons/table/properties/TabInfo.md))
- `nodesToModify` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `computeFragmentsToMoveInsideBody(java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment> fragments, java.util.List<javax.swing.text.Position> offsets, ro.sync.ecss.extensions.commons.table.properties.TabInfo tabInfo, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> nodesToModify, ro.sync.ecss.extensions.api.node.AuthorElement currentNode)`

**Returns:** `boolean`

**Parameters:**
- `fragments` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `offsets` (`java.util.List<javax.swing.text.Position>`)
- `tabInfo` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](../../../commons/table/properties/TabInfo.md))
- `nodesToModify` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `getTableAttribute()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `getHelpPageID()`

**Returns:** `java.lang.String`

