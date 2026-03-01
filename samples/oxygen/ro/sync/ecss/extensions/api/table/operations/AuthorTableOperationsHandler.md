# Class: `AuthorTableOperationsHandler`

**Package:** [`ro.sync.ecss.extensions.api.table.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.table.operations.AuthorTableOperationsHandler`

## Description

It should be implemented when the author extension being developed offers
 support for editing data in tabular form.

## Constructors

### `<init>()`

## Methods

### `handleInsertColumn([`ro.sync.ecss.extensions.api.table.operations.AuthorTableInsertColumnArguments`](./AuthorTableInsertColumnArguments.md) arguments)`

**Returns:** `boolean`

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

### `handleDeleteColumn([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteColumnArguments`](./AuthorTableDeleteColumnArguments.md) arguments)`

**Returns:** `boolean`

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

### `handleDeleteRow([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowArguments`](./AuthorTableDeleteRowArguments.md) arguments)`

**Returns:** `boolean`

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

### `handleDeleteRows([`ro.sync.ecss.extensions.api.table.operations.AuthorTableDeleteRowsArguments`](./AuthorTableDeleteRowsArguments.md) arguments)`

**Returns:** `boolean`

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

### `getTableElementContainingOffset([`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md) access, `int` offset)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../node/AuthorElement.md)

This method can be used to obtain the closest table that contains the given 
 offset.

### `getColumnSpecification([`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md) access, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../node/AuthorElement.md) tableElement, `int` columnIndex)`

**Returns:** [`ro.sync.ecss.extensions.api.table.operations.TableColumnSpecificationInformation`](./TableColumnSpecificationInformation.md)

This information is requested when a column is copied or dragged and 
 it can be used when the column must be inserted in the document (on paste or
 drop). The column specification is send as an argument to the 
 #handleInsertColumn(AuthorTableInsertColumnArguments) method.

### `handleRemoveInvalidColNamesFromTableCells([`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../node/AuthorElement.md) tableElement, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` cells)`

**Returns:** `void`

### `handleAttributeChange([`ro.sync.ecss.extensions.api.AuthorAccess`](../../AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../node/AuthorElement.md) currentElement, `java.lang.String` attributeName, [`ro.sync.ecss.extensions.api.node.AttrValue`](../../node/AttrValue.md) newValue)`

**Returns:** `boolean`

### `handlePasteRows([`ro.sync.ecss.extensions.api.table.operations.AuthorTableInsertRowArguments`](./AuthorTableInsertRowArguments.md) arguments)`

**Returns:** `boolean`

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

### `handleCreateTable([`ro.sync.ecss.extensions.api.table.operations.AuthorTableArguments`](./AuthorTableArguments.md) arguments)`

**Returns:** `boolean`

