# Class: `AuthorTableOperationsHandler`

**Package:** [`ro.sync.ecss.extensions.api.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.table.operations.AuthorTableOperationsHandler`

## Description

It should be implemented when the author extension being developed offers
 support for editing data in tabular form.

## Constructors

### `<init>()`

## Methods

### `handleInsertColumn(ro.sync.ecss.extensions.api.table.operations.AuthorTableInsertColumnArguments arguments)`

This method is called when pasting or dropping content for which the 
 SelectionInterpretationMode#TABLE_COLUMN interpretation mode was imposed.
 

 

 The SelectionInterpretationMode#TABLE_COLUMN interpretation mode is 
 already set by default by the application when a table column is selected.
 It can be also imposed from the AuthorSelectionModel#setSelectionInterpretationMode(SelectionInterpretationMode)
 method, for any selection content.
 

 For instance, when two paragraphs are copied, the clipboard object contains 
 a list with two Author document fragments (one for each paragraph).
 If the selection interpretation mode is imposed to SelectionInterpretationMode#TABLE_COLUMN,
 when pasting the fragments this method is called. The fragments array are included in the 
 argument object.

**Parameters:**
- `arguments` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableInsertColumnArguments`](./AuthorTableInsertColumnArguments.md)): The arguments for insert column operation like: 
   the offset where the column is inserted, the array containing the cells fragments
   that compose an Author table column, information about column width specification, 
   the Author access.

**Returns:** `boolean`

### `handleDeleteColumn(ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteColumnArguments arguments)`

This method is called when deleting content  (by drag and drop or cut operations)  
 for which the SelectionInterpretationMode#TABLE_COLUMN interpretation mode was imposed.
 

 

 The SelectionInterpretationMode#TABLE_COLUMN interpretation mode is 
 already set by default by the application when a table column is selected.
 It can be also imposed from the AuthorSelectionModel#setSelectionInterpretationMode(SelectionInterpretationMode)
 method, for any selection content.
 

 For instance, when two paragraphs are copied, the clipboard object contains 
 a list with two Author document fragments (one for each paragraph).
 If the selection interpretation mode is imposed to SelectionInterpretationMode#TABLE_COLUMN,
 when deleting the fragments this method is called. The fragments array are included in the 
 argument object.

**Parameters:**
- `arguments` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteColumnArguments`](./AuthorTableDeleteColumnArguments.md)): The arguments for delete column operation (like the Author access
   and the column cells start and end offsets).

**Returns:** `boolean`

### `handleDeleteRow(ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowArguments arguments)`

This method is called when deleting content (by drag and drop or cut operations) 
 for which the SelectionInterpretationMode#TABLE_ROW interpretation mode was imposed.
 

 

 The SelectionInterpretationMode#TABLE_ROW interpretation mode is 
 already set by default by the application when a table row is selected.
 It can be also imposed from the AuthorSelectionModel#setSelectionInterpretationMode(SelectionInterpretationMode)
 method, for any selection content.
 

 For instance, when two paragraphs are copied, the clipboard object contains 
 a list with two Author document fragments (one for each paragraph).
 If the selection interpretation mode is imposed to SelectionInterpretationMode#TABLE_ROW,
 when deleting the fragments this method is called. The fragments array are included in the 
 argument object.

**Parameters:**
- `arguments` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowArguments`](./AuthorTableDeleteRowArguments.md)): The arguments for delete row operation (like the Author access and 
   the content interval of the row element that must be deleted).

**Returns:** `boolean`

### `handleDeleteRows(ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowsArguments arguments)`

All the rows that intersects the given content intervals will be deleted.
 

 This method is called when deleting content (by drag and drop or cut operations) 
 for which the SelectionInterpretationMode#TABLE_ROW interpretation mode was imposed.
 

 

 The SelectionInterpretationMode#TABLE_ROW interpretation mode is 
 already set by default by the application when a table row is selected.
 It can be also imposed from the AuthorSelectionModel#setSelectionInterpretationMode(SelectionInterpretationMode)
 method, for any selection content.
 

 For instance, when two paragraphs are copied, the clipboard object contains 
 a list with two Author document fragments (one for each paragraph).
 If the selection interpretation mode is imposed to SelectionInterpretationMode#TABLE_ROW,
 when deleting the fragments this method is called.

**Parameters:**
- `arguments` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowsArguments`](./AuthorTableDeleteRowsArguments.md)): The arguments for delete rows operation (like the Author access and 
   the content intervals that determine the rows element that must be deleted).

**Returns:** `boolean`

### `getTableElementContainingOffset(ro.sync.ecss.extensions.api.AuthorAccess access, int offset)`

This method can be used to obtain the closest table that contains the given 
 offset.

**Parameters:**
- `access` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md)): Access to Author operations.
- `offset` (`int`): The offset to search the parent table element for.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../node/AuthorElement.md)

### `getColumnSpecification(ro.sync.ecss.extensions.api.AuthorAccess access, ro.sync.ecss.extensions.api.node.AuthorElement tableElement, int columnIndex)`

This information is requested when a column is copied or dragged and 
 it can be used when the column must be inserted in the document (on paste or
 drop). The column specification is send as an argument to the 
 #handleInsertColumn(AuthorTableInsertColumnArguments) method.

**Parameters:**
- `access` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md)): Access to Author operations.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../node/AuthorElement.md)): The table that contains the column.
- `columnIndex` (`int`): The column index, `0` based.

**Returns:** [`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](./TableColumnSpecificationInformation.md)

### `handleRemoveInvalidColNamesFromTableCells(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement tableElement, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> cells)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md)): The author access.
- `tableElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../node/AuthorElement.md)): The table element.
- `cells` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`): The list of table cells.

**Returns:** `void`

### `handleAttributeChange(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement currentElement, java.lang.String attributeName, ro.sync.ecss.extensions.api.node.AttrValue newValue)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md)): The Author Access.
- `currentElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../node/AuthorElement.md)): The current element.
- `attributeName` (`java.lang.String`): The attribute name.
- `newValue` ([`ro.sync.ecss.extensions.api.node.AttrValue`](../../node/AttrValue.md)): The new value.

**Returns:** `boolean`

### `handlePasteRows(ro.sync.ecss.extensions.api.table.operations.AuthorTableInsertRowArguments arguments)`

This method is called when pasting or dropping content for which the 
 SelectionInterpretationMode#TABLE_ROW interpretation mode was imposed.
 

 

 The SelectionInterpretationMode#TABLE_ROW interpretation mode is 
 already set by default by the application when a table row is selected.
 It can be also imposed from the AuthorSelectionModel#setSelectionInterpretationMode(SelectionInterpretationMode)
 method, for any selection content.
 

 For instance, when two paragraphs are copied, the clipboard object contains 
 a list with two Author document fragments (one for each paragraph).
 If the selection interpretation mode is imposed to SelectionInterpretationMode#TABLE_ROW,
 when pasting the fragments this method is called. The fragments array are included in the 
 argument object.

**Parameters:**
- `arguments` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableInsertRowArguments`](./AuthorTableInsertRowArguments.md)): The arguments for insert column operation like: 
   the offset where the rows are inserted, the array containing the rows fragments,
    information about column width specification, 
   the Author access.

**Returns:** `boolean`

### `handleCreateTable(ro.sync.ecss.extensions.api.table.operations.AuthorTableArguments arguments)`

**Parameters:**
- `arguments` ([`ro.sync.ecss.extensions.api.table.operations.AuthorTableArguments`](./AuthorTableArguments.md)): The arguments for copied cells like: 
   the offset where the rows are inserted, the array containing the rows fragments,
   how many rows and columns the new table should have, the Author access.

**Returns:** `boolean`

