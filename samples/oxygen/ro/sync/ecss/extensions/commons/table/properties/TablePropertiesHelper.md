# Interface: `TablePropertiesHelper`

**Package:** [`ro.sync.ecss.extensions.commons.table.properties`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.properties.TablePropertiesHelper`

**Extends:** [`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](./TableHelper.md), [`ro.sync.ecss.extensions.commons.table.properties.TablePropertiesConstants`](./TablePropertiesConstants.md)

## Description

## Methods

### `isTableBody(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The node to be checked.

**Returns:** `boolean`

### `isTableHead(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The node to be checked.

**Returns:** `boolean`

### `isTableFoot(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The node to be checked.

**Returns:** `boolean`

### `isTableRow(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The node to be checked.

**Returns:** `boolean`

### `isTableCell(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The node to be checked.

**Returns:** `boolean`

### `isTableColspec(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The node to be checked.

**Returns:** `boolean`

### `allowsFooter()`

**Returns:** `boolean`

### `getFirstChildOfTypeFromParentWithType(ro.sync.ecss.extensions.api.node.AuthorElement currentRow, int childType, int parentType)`

The type could be one of
 TYPE_HEADED, TYPE_BODY, TYPE_FOOTER.

**Parameters:**
- `currentRow` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The current row element.
- `childType` (`int`): The type of the child that is needed.
- `parentType` (`int`): The type for the parent which will contain the returned row element.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `getElementType(ro.sync.ecss.extensions.api.node.AuthorElement node)`

Type can be one of TablePropertiesConstants#TYPE_TABLE,
 TablePropertiesConstants#TYPE_GROUP, TablePropertiesConstants#TYPE_HEADER,
 TablePropertiesConstants#TYPE_BODY, TablePropertiesConstants#TYPE_FOOTER,
 TablePropertiesConstants#TYPE_ROW, TablePropertiesConstants#TYPE_CELL,
 TablePropertiesConstants#TYPE_COLSPEC.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The node to compute type for.

**Returns:** `int`

### `getElementTag(int elementType)`

**Parameters:**
- `elementType` (`int`): The type of the element.

**Returns:** `java.lang.String`

### `getElementName(int elementType)`

**Parameters:**
- `elementType` (`int`): The element type.

**Returns:** `java.lang.String`

