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

### `<init>(ro.sync.ecss.extensions.commons.table.properties.TablePropertiesHelper arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.commons.table.properties.TablePropertiesHelper`](./TablePropertiesHelper.md))

## Methods

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.ArgumentsMap arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `showTableProperties(ro.sync.ecss.extensions.api.ArgumentsMap arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

### `getTableInfoFromDescriptor(java.util.Map<java.lang.String,java.util.List> arg0, java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo> arg1)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md)

**Parameters:**
- `arg0` (`java.util.Map<java.lang.String,java.util.List>`)
- `arg1` (`java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`)

### `applyChanges(ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md))

### `applyTabChanges(ro.sync.ecss.extensions.commons.table.properties.TabInfo arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md))

### `sortInDocumentOrder(java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)

### `applyAttributesChanges(ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md))

### `showDialog(ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo arg0)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md))

### `getSelections()`

**Returns:** `java.util.List<java.lang.Integer[]>`

### `getElementsWithModifiedAttributes(ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo arg0)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md))

### `checkRowSpans(java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> arg0, int arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `arg1` (`int`)

### `getDescription()`

**Returns:** `java.lang.String`

### `getFragmentsAndOffsetsToInsert(ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo arg0)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md))

### `getTableInformation(java.util.List<java.lang.Integer[]> arg0)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md)

**Parameters:**
- `arg0` (`java.util.List<java.lang.Integer[]>`)

### `getAttrProperty(java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> arg0, java.lang.String arg1, ro.sync.ecss.extensions.commons.table.properties.TableProperty arg2)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TableProperty`](./TableProperty.md)

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `arg1` (`java.lang.String`)
- `arg2` ([`ro.sync.ecss.extensions.commons.table.properties.TableProperty`](./TableProperty.md))

### `getCommonValue(ro.sync.ecss.extensions.api.node.AuthorElement arg0, java.lang.String arg1, java.lang.String arg2)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

### `getSelectedTab(java.util.List<java.lang.Integer[]> arg0)`

**Returns:** `ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo.TAB_TYPE`

**Parameters:**
- `arg0` (`java.util.List<java.lang.Integer[]>`)

### `checkForCellTab(ro.sync.ecss.extensions.api.node.AuthorElement arg0, int arg1, int arg2, ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo.TAB_TYPE arg3)`

**Returns:** `ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo.TAB_TYPE`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `arg1` (`int`)
- `arg2` (`int`)
- `arg3` (`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo.TAB_TYPE`)

### `getTabType(ro.sync.ecss.extensions.api.node.AuthorElement arg0)`

**Returns:** `ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo.TAB_TYPE`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `getCategoriesAndProperties(java.util.List<java.lang.Integer[]> arg0)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`

**Parameters:**
- `arg0` (`java.util.List<java.lang.Integer[]>`)

### `getTableAttribute()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `computeFragmentsToMoveInsideFooter(java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment> arg0, java.util.List<javax.swing.text.Position> arg1, ro.sync.ecss.extensions.commons.table.properties.TabInfo arg2, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> arg3, ro.sync.ecss.extensions.api.node.AuthorElement arg4)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `arg1` (`java.util.List<javax.swing.text.Position>`)
- `arg2` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md))
- `arg3` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `arg4` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `computeFragmentMoveInsideHeader(java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment> arg0, java.util.List<javax.swing.text.Position> arg1, ro.sync.ecss.extensions.commons.table.properties.TabInfo arg2, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> arg3, ro.sync.ecss.extensions.api.node.AuthorElement arg4)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `arg1` (`java.util.List<javax.swing.text.Position>`)
- `arg2` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md))
- `arg3` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `arg4` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `computeFragmentsToMoveInsideBody(java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment> arg0, java.util.List<javax.swing.text.Position> arg1, ro.sync.ecss.extensions.commons.table.properties.TabInfo arg2, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> arg3, ro.sync.ecss.extensions.api.node.AuthorElement arg4)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `arg1` (`java.util.List<javax.swing.text.Position>`)
- `arg2` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md))
- `arg3` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `arg4` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

### `getHelpPageID()`

**Returns:** `java.lang.String`

