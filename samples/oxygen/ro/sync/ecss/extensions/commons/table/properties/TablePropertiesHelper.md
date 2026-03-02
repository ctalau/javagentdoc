# Interface: `TablePropertiesHelper`

**Package:** [`ro.sync.ecss.extensions.commons.table.properties`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.properties.TablePropertiesHelper`

**Extends:** [`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](./TableHelper.md), [`ro.sync.ecss.extensions.commons.table.properties.TablePropertiesConstants`](./TablePropertiesConstants.md)

## Description

## Methods

### `isTableBody(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The node to be checked.

### `isTableHead(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The node to be checked.

### `isTableFoot(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The node to be checked.

### `isTableRow(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The node to be checked.

### `isTableCell(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The node to be checked.

### `isTableColspec(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The node to be checked.

### `allowsFooter()`

**Returns:** `boolean`

### `getFirstChildOfTypeFromParentWithType(ro.sync.ecss.extensions.api.node.AuthorElement currentRow, int childType, int parentType)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

The type could be one of
 TYPE_HEADED, TYPE_BODY, TYPE_FOOTER.

**Parameters:**
- `currentRow` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The current row element.
- `childType` (`int`): The type of the child that is needed.
- `parentType` (`int`): The type for the parent which will contain the returned row element.

### `getElementType(ro.sync.ecss.extensions.api.node.AuthorElement node)`

**Returns:** `int`

Type can be one of TablePropertiesConstants#TYPE_TABLE,
 TablePropertiesConstants#TYPE_GROUP, TablePropertiesConstants#TYPE_HEADER,
 TablePropertiesConstants#TYPE_BODY, TablePropertiesConstants#TYPE_FOOTER,
 TablePropertiesConstants#TYPE_ROW, TablePropertiesConstants#TYPE_CELL,
 TablePropertiesConstants#TYPE_COLSPEC.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The node to compute type for.

### `getElementTag(int elementType)`

**Returns:** `java.lang.String`

**Parameters:**
- `elementType` (`int`): The type of the element.

### `getElementName(int elementType)`

**Returns:** `java.lang.String`

**Parameters:**
- `elementType` (`int`): The element type.

