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

### `createCellXMLFragment(AuthorAccess authorAccess, AuthorDocumentFragment[] fragments, boolean cellsFragment, String cellElementName, int currentFragmentIndex, String namespace, AuthorTableHelper authorTableHelper, String[] imposedAttributesFragments)`

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

**Returns:** `java.lang.String`

### `isIgnoredAttribute(String attrName, AuthorTableHelper tableHelper)`

**Parameters:**
- `attrName` (`java.lang.String`): The attribute name.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)): Author table helper

**Returns:** `boolean`

### `getContentFromFragment(AuthorAccess authorAccess, boolean cellsFragment, AuthorDocumentFragment fragment)`

If the cellsFragment parameter is `true`, 
 the returned content represent the content of the cell, otherwise the fragment itself.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `cellsFragment` (`boolean`): `true` if the fragment represent a cell fragment
- `fragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../../api/node/AuthorDocumentFragment.md)): The Author fragment.

**Returns:** `java.lang.String`

### `nodeHasProperties(AuthorNode node, String name, String namespace)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The node to check.
- `name` (`java.lang.String`): The name to compare the node name with.
- `namespace` (`java.lang.String`): The namespace to compare the node namespace with.

**Returns:** `boolean`

### `getTableElementContainingOffset(int offset, AuthorAccess access, String[] tableClassValues)`

Used for DITA and DITA Maps
 table operations.

**Parameters:**
- `offset` (`int`): The offset to search the parent table element for.
- `access` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Access to Author operations.
- `tableClassValues` (`java.lang.String[]`): Possible table class attributes values.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `getTableElementContainingOffset(int offset, String namespace, AuthorAccess access, String[] tableElementNames)`

**Parameters:**
- `offset` (`int`): The offset to search the parent table element for.
- `namespace` (`java.lang.String`): The table node namespace.
- `access` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Access to Author operations.
- `tableElementNames` (`java.lang.String[]`): Possible table element names.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `isChoiceTableAllowed(AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.

**Returns:** `boolean`

### `areOtherTablesThanChoicetableAllowed(AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.

**Returns:** `boolean`

### `isPropertiesTableGlobalElement(AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.

**Returns:** `boolean`

### `getTableElementsOfTypeFromSelection(AuthorAccess authorAccess, int type, TableHelper tableHelper, AuthorElement tableElement)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access
- `type` (`int`): The type of the elements to be collected.
   Can be one of TYPE_ prefixed constants from TableHelperConstants.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md)): Utility class to determine information about table nodes.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table parent elements.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`

### `getTableElementsOfType(AuthorAccess authorAccess, List<Integer[]> selections, int type, TableHelper tableHelper)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access
- `selections` (`java.util.List<java.lang.Integer[]>`): The currently selected nodes. They can be mixed.
- `type` (`int`): The type of the elements to be collected.
   Can be one of TYPE_ prefixed constants from TableHelperConstants.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md)): Utility class to determine information about table nodes.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`

### `computeElementsList(List<AuthorElement> elementsList, AuthorElement node, int startOffset, int endOffset, int type, boolean fullySelected, TableHelper tableHelper)`

**Parameters:**
- `elementsList` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`): The list which will contain the elements.
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The starting node.
- `startOffset` (`int`): Selection start.
- `endOffset` (`int`): Selection end.
- `type` (`int`): The elements type.
   Can be one of TYPE_ prefixed constants from TableHelperConstants.
- `fullySelected` (`boolean`): `true` if the nodes should be entire contained by the selection.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md)): Utility class to determine information about table nodes.

**Returns:** `void`

### `getElementAncestor(AuthorNode node, int type, TableHelper tableHelper)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md)): The starting node.
- `type` (`int`): The type of the ancestor.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md)): Utility class to determine information about table nodes.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `getChildElements(AuthorElement node, int type, List<AuthorElement> children, TableHelper tableHelper)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The parent node.
- `type` (`int`): The child elements type. 
   Can be one of TYPE_ prefixed constants from TableHelperConstants.
- `children` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`): The list with collected children. Empty when the function is called.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md)): Utility class to determine information about table nodes.

**Returns:** `void`

### `getCellIndexes(List<AuthorElement> cells, AuthorAccess authorAccess, TableHelper tableHelper, boolean isCals)`

**Parameters:**
- `cells` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`): The selected cells.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): The author access.
- `tableHelper` ([`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md)): Utility class to determine information about table nodes.
- `isCals` (`boolean`): `true` if it is a CALS table

**Returns:** `java.util.Map<ro.sync.ecss.extensions.api.node.AuthorElement,java.util.Set<java.lang.Integer>>`

### `createTableHelper(AuthorTableHelper authorTableHelper)`

**Parameters:**
- `authorTableHelper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)): The Author table helper

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md)

### `placeCaretInFirstCell(AuthorAccess authorAccess, TableInfo tableInfo, AuthorDocumentController controller, SchemaAwareHandlerResult result)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Author access.
- `tableInfo` ([`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md)): Table information.
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md)): Controller.
- `result` ([`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](../../../api/schemaaware/SchemaAwareHandlerResult.md)): Insert operation result.

**Returns:** `void`

### `getFirstCell(AuthorElement parentElement, AuthorEditorAccess authorEditorAccess)`

**Parameters:**
- `parentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The parent element.
- `authorEditorAccess` ([`ro.sync.ecss.extensions.api.access.AuthorEditorAccess`](../../../api/access/AuthorEditorAccess.md)): Author editor access.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `removeInvalidColNamesFromCALSTableCells(AuthorAccess authorAccess, AuthorElement tableElement, List<AuthorElement> cells)`

Remove references to column names which are not defined in the table.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Author Access
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The table element
- `cells` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`): The list of cells.

**Returns:** `void`

### `handleColumnSpecAttributeChange(AuthorAccess authorAccess, AuthorTableHelper helper, AuthorElement currentElement, String attributeName, AttrValue newValue)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Author access
- `helper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)): Table helper.
- `currentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): Current element on which the attribute which should be changed.
- `attributeName` (`java.lang.String`): Name of changed attribute
- `newValue` ([`ro.sync.ecss.extensions.api.node.AttrValue`](../../../api/node/AttrValue.md)): The new attribute value

**Returns:** `boolean`

### `iterateCells(AuthorTableHelper helper, List<AuthorElement> toChange, AuthorElement rowElement)`

**Parameters:**
- `helper` ([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md)): The helper.
- `toChange` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`): List where to add all cells.
- `rowElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)): The current row.

**Returns:** `void`

