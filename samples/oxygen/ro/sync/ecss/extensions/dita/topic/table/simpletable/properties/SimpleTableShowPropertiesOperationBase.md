# Class: `SimpleTableShowPropertiesOperationBase`

**Package:** [`ro.sync.ecss.extensions.dita.topic.table.simpletable.properties`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.topic.table.simpletable.properties.SimpleTableShowPropertiesOperationBase`

**Extends:** [`ro.sync.ecss.extensions.commons.table.properties.ShowTablePropertiesBaseOperation`](../../../../../commons/table/properties/ShowTablePropertiesBaseOperation.md)

## Description

## Fields

### `FRAME_DITA_CONREF`

**Type:** `java.lang.String`

### `TABLE_FRAME_VALUES`

**Type:** `java.lang.String[]`

## Constructors

### `<init>(TablePropertiesHelper helper)`

**Parameters:**
- `helper` ([`ro.sync.ecss.extensions.commons.table.properties.TablePropertiesHelper`](../../../../../commons/table/properties/TablePropertiesHelper.md)): The helper.

## Methods

### `getCategoriesAndProperties(List<Integer[]> selections)`

**Parameters:**
- `selections` (`java.util.List<java.lang.Integer[]>`)

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`

### `getRowsTabInformation(List<Integer[]> selections)`

This information will contain the properties 
 which will be edited, the rows on which those properties applies and some context 
 information.

**Parameters:**
- `selections` (`java.util.List<java.lang.Integer[]>`): The list with the selection intervals.

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](../../../../../commons/table/properties/TabInfo.md)

### `computeFragmentsToMoveInsideFooter(List<AuthorDocumentFragment> fragments, List<Position> offsets, TabInfo tabInfo, List<AuthorElement> nodesToModify, AuthorElement currentNode)`

**Parameters:**
- `fragments` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `offsets` (`java.util.List<javax.swing.text.Position>`)
- `tabInfo` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](../../../../../commons/table/properties/TabInfo.md))
- `nodesToModify` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `computeFragmentMoveInsideHeader(List<AuthorDocumentFragment> fragments, List<Position> offsets, TabInfo tabInfo, List<AuthorElement> nodesToModify, AuthorElement currentNode)`

**Parameters:**
- `fragments` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `offsets` (`java.util.List<javax.swing.text.Position>`)
- `tabInfo` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](../../../../../commons/table/properties/TabInfo.md))
- `nodesToModify` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `computeFragmentsToMoveInsideBody(List<AuthorDocumentFragment> fragments, List<Position> offsets, TabInfo tabInfo, List<AuthorElement> nodesToModify, AuthorElement currentNode)`

**Parameters:**
- `fragments` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `offsets` (`java.util.List<javax.swing.text.Position>`)
- `tabInfo` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](../../../../../commons/table/properties/TabInfo.md))
- `nodesToModify` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `currentNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `getTableAttribute()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `getHelpPageID()`

**Returns:** `java.lang.String`

