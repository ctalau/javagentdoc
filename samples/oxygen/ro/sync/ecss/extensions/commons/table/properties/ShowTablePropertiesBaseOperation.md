# Class: `ShowTablePropertiesBaseOperation`

**Package:** [`ro.sync.ecss.extensions.commons.table.properties`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.properties.ShowTablePropertiesBaseOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../../api/AuthorOperation.md)

## Fields

### `LOGGER`

**Type:** `org.slf4j.Logger`

### `tableHelper`

**Type:** [`ro.sync.ecss.extensions.commons.table.properties.TablePropertiesHelper`](./TablePropertiesHelper.md)

### `authorAccess`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)

## Constructors

### `<init>([`ro.sync.ecss.extensions.commons.table.properties.TablePropertiesHelper`](./TablePropertiesHelper.md) arg0)`

## Methods

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) arg0, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) arg1)`

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `showTableProperties([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) arg0)`

**Returns:** `void`

### `getTableInfoFromDescriptor(`java.util.Map<java.lang.String,java.util.List>` arg0, `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>` arg1)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md)

### `applyChanges([`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md) arg0)`

**Returns:** `void`

### `applyTabChanges([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md) arg0)`

**Returns:** `void`

### `sortInDocumentOrder(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` arg0)`

**Returns:** `void`

### `applyAttributesChanges([`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md) arg0)`

**Returns:** `void`

### `showDialog([`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md) arg0)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md)

### `getSelections()`

**Returns:** `java.util.List<java.lang.Integer[]>`

### `getElementsWithModifiedAttributes([`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md) arg0)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`

### `checkRowSpans(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` arg0, `int` arg1)`

**Returns:** `boolean`

### `getDescription()`

**Returns:** `java.lang.String`

### `getFragmentsAndOffsetsToInsert([`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md) arg0)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`

### `getTableInformation(`java.util.List<java.lang.Integer[]>` arg0)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md)

### `getAttrProperty(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` arg0, `java.lang.String` arg1, [`ro.sync.ecss.extensions.commons.table.properties.TableProperty`](./TableProperty.md) arg2)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TableProperty`](./TableProperty.md)

### `getCommonValue([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** `java.lang.String`

### `getSelectedTab(`java.util.List<java.lang.Integer[]>` arg0)`

**Returns:** `ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo.TAB_TYPE`

### `checkForCellTab([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) arg0, `int` arg1, `int` arg2, `ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo.TAB_TYPE` arg3)`

**Returns:** `ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo.TAB_TYPE`

### `getTabType([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) arg0)`

**Returns:** `ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo.TAB_TYPE`

### `getCategoriesAndProperties(`java.util.List<java.lang.Integer[]>` arg0)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`

### `getTableAttribute()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `computeFragmentsToMoveInsideFooter(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>` arg0, `java.util.List<javax.swing.text.Position>` arg1, [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md) arg2, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` arg3, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) arg4)`

**Returns:** `boolean`

### `computeFragmentMoveInsideHeader(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>` arg0, `java.util.List<javax.swing.text.Position>` arg1, [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md) arg2, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` arg3, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) arg4)`

**Returns:** `boolean`

### `computeFragmentsToMoveInsideBody(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>` arg0, `java.util.List<javax.swing.text.Position>` arg1, [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md) arg2, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` arg3, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) arg4)`

**Returns:** `boolean`

### `getHelpPageID()`

**Returns:** `java.lang.String`

