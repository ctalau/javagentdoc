# Class: `TableOperationsUtil`

**Package:** [`ro.sync.ecss.extensions.commons.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.table.operations.TableOperationsUtil`

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `createCellXMLFragment(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, boolean cellsFragment, java.lang.String cellElementName, int currentFragmentIndex, java.lang.String namespace, ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper authorTableHelper, java.lang.String[] imposedAttributesFragments)`

**Returns:** `java.lang.String`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md)): The list of all content fragments.
- `cellsFragment` (`boolean`): `true` if the fragments represents cells.
- `cellElementName` (`java.lang.String`): The cell name.
- `currentFragmentIndex` (`int`): The index of the fragment that must be used for attributes and content.
- `namespace` (`java.lang.String`): The cell namespace.
- `authorTableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)): Author table helper.
- `imposedAttributesFragments` (`java.lang.String[]`): Imposed attributes for the created cell.
                                    Each fragment has the following form: "attribute_name=\"attribute_value\""

### `isIgnoredAttribute(java.lang.String attrName, ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper tableHelper)`

**Returns:** `boolean`

**Parameters:**
- `attrName` (`java.lang.String`): The attribute name.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)): Author table helper

### `getContentFromFragment(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, boolean cellsFragment, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment fragment)`

**Returns:** `java.lang.String`

If the cellsFragment parameter is `true`, 
 the returned content represent the content of the cell, otherwise the fragment itself.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `cellsFragment` (`boolean`): `true` if the fragment represent a cell fragment
- `fragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../../api/node/AuthorDocumentFragment.md)): The Author fragment.

### `nodeHasProperties(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String name, java.lang.String namespace)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The node to check.
- `name` (`java.lang.String`): The name to compare the node name with.
- `namespace` (`java.lang.String`): The namespace to compare the node namespace with.

### `getTableElementContainingOffset(int offset, ro.sync.ecss.extensions.api.AuthorAccess access, java.lang.String[] tableClassValues)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

Used for DITA and DITA Maps
 table operations.

**Parameters:**
- `offset` (`int`): The offset to search the parent table element for.
- `access` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Access to Author operations.
- `tableClassValues` (`java.lang.String[]`): Possible table class attributes values.

### `getTableElementContainingOffset(int offset, java.lang.String namespace, ro.sync.ecss.extensions.api.AuthorAccess access, java.lang.String[] tableElementNames)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

**Parameters:**
- `offset` (`int`): The offset to search the parent table element for.
- `namespace` (`java.lang.String`): The table node namespace.
- `access` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Access to Author operations.
- `tableElementNames` (`java.lang.String[]`): Possible table element names.

### `isChoiceTableAllowed(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `boolean`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.

### `areOtherTablesThanChoicetableAllowed(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `boolean`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.

### `isPropertiesTableGlobalElement(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `boolean`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.

### `getTableElementsOfTypeFromSelection(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int type, ro.sync.ecss.extensions.commons.table.properties.TableHelper tableHelper, ro.sync.ecss.extensions.api.node.AuthorElement tableElement)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access
- `type` (`int`): The type of the elements to be collected.
 Can be one of TYPE_ prefixed constants from TableHelperConstants.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md)): Utility class to determine information about table nodes.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table parent elements.

### `getTableElementsOfType(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<java.lang.Integer[]> selections, int type, ro.sync.ecss.extensions.commons.table.properties.TableHelper tableHelper)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access
- `selections` (`java.util.List<java.lang.Integer[]>`): The currently selected nodes. They can be mixed.
- `type` (`int`): The type of the elements to be collected.
 Can be one of TYPE_ prefixed constants from TableHelperConstants.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md)): Utility class to determine information about table nodes.

### `computeElementsList(java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> elementsList, ro.sync.ecss.extensions.api.node.AuthorElement node, int startOffset, int endOffset, int type, boolean fullySelected, ro.sync.ecss.extensions.commons.table.properties.TableHelper tableHelper)`

**Returns:** `void`

**Parameters:**
- `elementsList` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`): The list which will contain the elements.
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The starting node.
- `startOffset` (`int`): Selection start.
- `endOffset` (`int`): Selection end.
- `type` (`int`): The elements type.
 Can be one of TYPE_ prefixed constants from TableHelperConstants.
- `fullySelected` (`boolean`): `true` if the nodes should be entire contained by the selection.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md)): Utility class to determine information about table nodes.

### `getElementAncestor(ro.sync.ecss.extensions.api.node.AuthorNode node, int type, ro.sync.ecss.extensions.commons.table.properties.TableHelper tableHelper)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The starting node.
- `type` (`int`): The type of the ancestor.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md)): Utility class to determine information about table nodes.

### `getChildElements(ro.sync.ecss.extensions.api.node.AuthorElement node, int type, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> children, ro.sync.ecss.extensions.commons.table.properties.TableHelper tableHelper)`

**Returns:** `void`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The parent node.
- `type` (`int`): The child elements type. 
 Can be one of TYPE_ prefixed constants from TableHelperConstants.
- `children` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`): The list with collected children. Empty when the function is called.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md)): Utility class to determine information about table nodes.

### `getCellIndexes(java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> cells, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.table.properties.TableHelper tableHelper, boolean isCals)`

**Returns:** `java.util.Map<ro.sync.ecss.extensions.api.node.AuthorElement,java.util.Set<java.lang.Integer>>`

**Parameters:**
- `cells` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`): The selected cells.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md)): Utility class to determine information about table nodes.
- `isCals` (`boolean`): `true` if it is a CALS table

### `createTableHelper(ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper authorTableHelper)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md)

**Parameters:**
- `authorTableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)): The Author table helper

### `placeCaretInFirstCell(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.table.operations.TableInfo tableInfo, ro.sync.ecss.extensions.api.AuthorDocumentController controller, ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult result)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Author access.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)): Table information.
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md)): Controller.
- `result` ([`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](../../../api/schemaaware/SchemaAwareHandlerResult.md)): Insert operation result.

### `getFirstCell(ro.sync.ecss.extensions.api.node.AuthorElement parentElement, ro.sync.ecss.extensions.api.access.AuthorEditorAccess authorEditorAccess)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

**Parameters:**
- `parentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The parent element.
- `authorEditorAccess` ([`ro.sync.ecss.extensions.api.access.AuthorEditorAccess`](../../../api/access/AuthorEditorAccess.md)): Author editor access.

### `removeInvalidColNamesFromCALSTableCells(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement tableElement, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> cells)`

**Returns:** `void`

Remove references to column names which are not defined in the table.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Author Access
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table element
- `cells` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`): The list of cells.

### `handleColumnSpecAttributeChange(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper helper, ro.sync.ecss.extensions.api.node.AuthorElement currentElement, java.lang.String attributeName, ro.sync.ecss.extensions.api.node.AttrValue newValue)`

**Returns:** `boolean`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Author access
- `helper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)): Table helper.
- `currentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): Current element on which the attribute which should be changed.
- `attributeName` (`java.lang.String`): Name of changed attribute
- `newValue` ([`ro.sync.ecss.extensions.api.node.AttrValue`](../../../api/node/AttrValue.md)): The new attribute value

### `iterateCells(ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper helper, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> toChange, ro.sync.ecss.extensions.api.node.AuthorElement rowElement)`

**Returns:** `void`

**Parameters:**
- `helper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)): The helper.
- `toChange` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`): List where to add all cells.
- `rowElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The current row.

