# Enum: `SelectionInterpretationMode`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.SelectionInterpretationMode`

## Description

The SelectionInterpretationMode#TABLE_COLUMN interpretation mode is 
 already set by default by the application when a table column is selected. 
 In this case, when the column is pasted, it is also interpreted as a table column 
 by the application built-in document types. 
 

 To obtain this behavior for any selection, the SelectionInterpretationMode#TABLE_COLUMN 
 interpretation mode must be imposed from 
 AuthorSelectionModel#setSelectionInterpretationMode(SelectionInterpretationMode)
 method.
 

 For instance, when two paragraphs are copied, the clipboard object contains 
 a list with two Author document fragments (one for each paragraph).
 If the selection interpretation mode is imposed to SelectionInterpretationMode#TABLE_COLUMN,
 when pasting the fragments a table column is created, each paragraph being
 the content of a column cell.
 

 

 For a custom document type, when a content with an imposed SelectionInterpretationMode#TABLE_COLUMN 
 interpretation mode is pasted the AuthorTableOperationsHandler#handlePasteColumn(AuthorTablePasteColumnArguments)
 method is called. If there is no implementation for this extension, the default paste 
 behavior is invoked.
 

 See ExtensionsBundle#getAuthorTableOperationsHandler() for handling the
 paste column operation.

## Constructors

### `<init>()`

## Methods

### `values()`

**Returns:** [`ro.sync.ecss.extensions.api.SelectionInterpretationMode[]`](./SelectionInterpretationMode.md)

### `valueOf(String name)`

**Parameters:**
- `name` (`java.lang.String`)

**Returns:** [`ro.sync.ecss.extensions.api.SelectionInterpretationMode`](./SelectionInterpretationMode.md)

