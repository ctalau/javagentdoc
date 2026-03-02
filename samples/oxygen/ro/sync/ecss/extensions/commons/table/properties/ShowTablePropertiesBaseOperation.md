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

### `<init>(TablePropertiesHelper arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.commons.table.properties.TablePropertiesHelper`](./TablePropertiesHelper.md))

## Methods

### `doOperation(AuthorAccess arg0, ArgumentsMap arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `showTableProperties(ArgumentsMap arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

**Returns:** `void`

### `getTableInfoFromDescriptor(Map<String,List> arg0, List<TabInfo> arg1)`

**Parameters:**
- `arg0` (`java.util.Map<java.lang.String,java.util.List>`)
- `arg1` (`java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`)

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md)

### `applyChanges(EditedTablePropertiesInfo arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md))

**Returns:** `void`

### `applyTabChanges(TabInfo arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md))

**Returns:** `void`

### `sortInDocumentOrder(List<AuthorElement> arg0)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)

**Returns:** `void`

### `applyAttributesChanges(EditedTablePropertiesInfo arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md))

**Returns:** `void`

### `showDialog(EditedTablePropertiesInfo arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md))

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md)

### `getSelections()`

**Returns:** `java.util.List<java.lang.Integer[]>`

### `getElementsWithModifiedAttributes(EditedTablePropertiesInfo arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md))

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`

### `checkRowSpans(List<AuthorElement> arg0, int arg1)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `arg1` (`int`)

**Returns:** `boolean`

### `getDescription()`

**Returns:** `java.lang.String`

### `getFragmentsAndOffsetsToInsert(EditedTablePropertiesInfo arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo`](./EditedTablePropertiesInfo.md))

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`

### `getTableInformation(List<Integer[]> arg0)`

**Parameters:**
- `arg0` (`java.util.List<java.lang.Integer[]>`)

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md)

### `getAttrProperty(List<AuthorElement> arg0, String arg1, TableProperty arg2)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `arg1` (`java.lang.String`)
- `arg2` ([`ro.sync.ecss.extensions.commons.table.properties.TableProperty`](./TableProperty.md))

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TableProperty`](./TableProperty.md)

### `getCommonValue(AuthorElement arg0, String arg1, String arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getSelectedTab(List<Integer[]> arg0)`

**Parameters:**
- `arg0` (`java.util.List<java.lang.Integer[]>`)

**Returns:** `ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo.TAB_TYPE`

### `checkForCellTab(AuthorElement arg0, int arg1, int arg2, EditedTablePropertiesInfo.TAB_TYPE arg3)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))
- `arg1` (`int`)
- `arg2` (`int`)
- `arg3` (`ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo.TAB_TYPE`)

**Returns:** `ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo.TAB_TYPE`

### `getTabType(AuthorElement arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `ro.sync.ecss.extensions.commons.table.properties.EditedTablePropertiesInfo.TAB_TYPE`

### `getCategoriesAndProperties(List<Integer[]> arg0)`

**Parameters:**
- `arg0` (`java.util.List<java.lang.Integer[]>`)

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TabInfo>`

### `getTableAttribute()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.table.properties.TableProperty>`

### `computeFragmentsToMoveInsideFooter(List<AuthorDocumentFragment> arg0, List<Position> arg1, TabInfo arg2, List<AuthorElement> arg3, AuthorElement arg4)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `arg1` (`java.util.List<javax.swing.text.Position>`)
- `arg2` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md))
- `arg3` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `arg4` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `computeFragmentMoveInsideHeader(List<AuthorDocumentFragment> arg0, List<Position> arg1, TabInfo arg2, List<AuthorElement> arg3, AuthorElement arg4)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `arg1` (`java.util.List<javax.swing.text.Position>`)
- `arg2` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md))
- `arg3` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `arg4` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `computeFragmentsToMoveInsideBody(List<AuthorDocumentFragment> arg0, List<Position> arg1, TabInfo arg2, List<AuthorElement> arg3, AuthorElement arg4)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorDocumentFragment>`)
- `arg1` (`java.util.List<javax.swing.text.Position>`)
- `arg2` ([`ro.sync.ecss.extensions.commons.table.properties.TabInfo`](./TabInfo.md))
- `arg3` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `arg4` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md))

**Returns:** `boolean`

### `getHelpPageID()`

**Returns:** `java.lang.String`

