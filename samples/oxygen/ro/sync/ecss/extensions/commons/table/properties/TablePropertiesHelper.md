# Interface: `TablePropertiesHelper`

**Package:** [`ro.sync.ecss.extensions.commons.table.properties`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.properties.TablePropertiesHelper`

**Extends:** [`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](./TableHelper.md), [`ro.sync.ecss.extensions.commons.table.properties.TablePropertiesConstants`](./TablePropertiesConstants.md)

## Description

## Methods

### `isTableBody([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) node)`

**Returns:** `boolean`

### `isTableHead([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) node)`

**Returns:** `boolean`

### `isTableFoot([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) node)`

**Returns:** `boolean`

### `isTableRow([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) node)`

**Returns:** `boolean`

### `isTableCell([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) node)`

**Returns:** `boolean`

### `isTableColspec([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) node)`

**Returns:** `boolean`

### `allowsFooter()`

**Returns:** `boolean`

### `getFirstChildOfTypeFromParentWithType([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) currentRow, `int` childType, `int` parentType)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

The type could be one of
 TYPE_HEADED, TYPE_BODY, TYPE_FOOTER.

### `getElementType([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) node)`

**Returns:** `int`

Type can be one of TablePropertiesConstants#TYPE_TABLE,
 TablePropertiesConstants#TYPE_GROUP, TablePropertiesConstants#TYPE_HEADER,
 TablePropertiesConstants#TYPE_BODY, TablePropertiesConstants#TYPE_FOOTER,
 TablePropertiesConstants#TYPE_ROW, TablePropertiesConstants#TYPE_CELL,
 TablePropertiesConstants#TYPE_COLSPEC.

### `getElementTag(`int` elementType)`

**Returns:** `java.lang.String`

### `getElementName(`int` elementType)`

**Returns:** `java.lang.String`

