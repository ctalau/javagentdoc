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

### `<init>([`ro.sync.ecss.extensions.commons.table.properties.TablePropertiesHelper`](./TablePropertiesHelper.md) helper)`

## Methods

### `getCategoriesAndProperties(`java.util.List<java.lang.Integer[]>` selections)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`

### `getColumnsInformation(`java.util.List<java.lang.Integer[]>` selections)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md)

This information will contain the properties 
 which will be edited, the columns on which those properties applies and some context 
 information.

### `getCellsInformation(`java.util.List<java.lang.Integer[]>` selections)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md)

### `getCellsAttributes()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `getRowsInformation(`java.util.List<java.lang.Integer[]>` selections)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md)

This information will contain the properties 
 which will be edited, the rows on which those properties applies and some context 
 information.

### `computeFragmentsToMoveInsideFooter(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>` fragments, `java.util.List<javax.swing.text.Position>` offsets, [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md) tabInfo, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` nodesToModify, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) currentNode)`

**Returns:** `boolean`

### `computeFragmentMoveInsideHeader(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>` fragments, `java.util.List<javax.swing.text.Position>` offsets, [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md) tabInfo, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` nodesToModify, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) currentNode)`

**Returns:** `boolean`

### `computeFragmentsToMoveInsideBody(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>` fragments, `java.util.List<javax.swing.text.Position>` offsets, [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md) tabInfo, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` nodesToModify, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) currentNode)`

**Returns:** `boolean`

### `processFragment([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) currentNode, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>` fragments, `boolean` moveToHeader)`

**Returns:** `void`

### `getRowsAttributesToEdit()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `getColumnsAttributes()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `getColSpecs(`java.util.Map<ro.sync.ecss.extensions.api.node.AuthorElement,java.util.Set<java.lang.Integer>>` map)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`

### `getCellIndexes(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` cells)`

**Returns:** `java.util.Map<ro.sync.ecss.extensions.api.node.AuthorElement,java.util.Set<java.lang.Integer>>`

