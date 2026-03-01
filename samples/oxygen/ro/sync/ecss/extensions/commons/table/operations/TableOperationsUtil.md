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

### `createCellXMLFragment([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](../../../api/node/AuthorDocumentFragment.md) fragments, `boolean` cellsFragment, `java.lang.String` cellElementName, `int` currentFragmentIndex, `java.lang.String` namespace, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md) authorTableHelper, `java.lang.String[]` imposedAttributesFragments)`

**Returns:** `java.lang.String`

### `isIgnoredAttribute(`java.lang.String` attrName, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md) tableHelper)`

**Returns:** `boolean`

### `getContentFromFragment([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `boolean` cellsFragment, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../../api/node/AuthorDocumentFragment.md) fragment)`

**Returns:** `java.lang.String`

If the cellsFragment parameter is `true`, 
 the returned content represent the content of the cell, otherwise the fragment itself.

### `nodeHasProperties([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node, `java.lang.String` name, `java.lang.String` namespace)`

**Returns:** `boolean`

### `getTableElementContainingOffset(`int` offset, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) access, `java.lang.String[]` tableClassValues)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

Used for DITA and DITA Maps
 table operations.

### `getTableElementContainingOffset(`int` offset, `java.lang.String` namespace, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) access, `java.lang.String[]` tableElementNames)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `isChoiceTableAllowed([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `areOtherTablesThanChoicetableAllowed([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `isPropertiesTableGlobalElement([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `getTableElementsOfTypeFromSelection([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `int` type, [`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md) tableHelper, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`

### `getTableElementsOfType([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `java.util.List<java.lang.Integer[]>` selections, `int` type, [`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md) tableHelper)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`

### `computeElementsList(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` elementsList, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) node, `int` startOffset, `int` endOffset, `int` type, `boolean` fullySelected, [`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md) tableHelper)`

**Returns:** `void`

### `getElementAncestor([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../../api/node/AuthorNode.md) node, `int` type, [`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md) tableHelper)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `getChildElements([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) node, `int` type, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` children, [`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md) tableHelper)`

**Returns:** `void`

### `getCellIndexes(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` cells, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md) tableHelper, `boolean` isCals)`

**Returns:** `java.util.Map<ro.sync.ecss.extensions.api.node.AuthorElement,java.util.Set<java.lang.Integer>>`

### `createTableHelper([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md) authorTableHelper)`

**Returns:** [`ro.sync.ecss.extensions.commons.table.properties.TableHelper`](../properties/TableHelper.md)

### `placeCaretInFirstCell([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.commons.table.operations.TableInfo`](./TableInfo.md) tableInfo, [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md) controller, [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](../../../api/schemaaware/SchemaAwareHandlerResult.md) result)`

**Returns:** `void`

### `getFirstCell([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) parentElement, [`ro.sync.ecss.extensions.api.access.AuthorEditorAccess`](../../../api/access/AuthorEditorAccess.md) authorEditorAccess)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md)

### `removeInvalidColNamesFromCALSTableCells([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) tableElement, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` cells)`

**Returns:** `void`

Remove references to column names which are not defined in the table.

### `handleColumnSpecAttributeChange([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md) helper, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) currentElement, `java.lang.String` attributeName, [`ro.sync.ecss.extensions.api.node.AttrValue`](../../../api/node/AttrValue.md) newValue)`

**Returns:** `boolean`

### `iterateCells([`ro.sync.ecss.extensions.commons.table.operations.AuthorTableHelper`](./AuthorTableHelper.md) helper, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` toChange, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../api/node/AuthorElement.md) rowElement)`

**Returns:** `void`

