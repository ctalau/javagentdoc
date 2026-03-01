# Interface: `AuthorSelectionModel`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorSelectionModel`

## Description

## Methods

### `setSelectionInterpretationMode([`ro.sync.ecss.extensions.api.SelectionInterpretationMode`](./SelectionInterpretationMode.md) interpretationMode)`

**Returns:** `void`

See SelectionInterpretationMode for more details about the interpretation
 of selection in Author mode.
 
 
 This interpretation mode is reseted when the next caret moved is performed or
 another interpretation mode is imposed.

### `getSelectionInterpretationMode()`

**Returns:** [`ro.sync.ecss.extensions.api.SelectionInterpretationMode`](./SelectionInterpretationMode.md)

See SelectionInterpretationMode for more details about the interpretation
 of selection in Author mode.
 
 
 This interpretation mode is reseted when the next caret moved is performed or
 another interpretation mode is imposed.

### `getSelectionIntervals()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`

Each ContentInterval contains the **inclusive** 
 start selection offset and the **exclusive** end selection offset.
 

 

 The selection intervals are added to the list in the same order in which 
 the selections are made in the Author editor page. If the caret is not inside 
 a selection the last selection interval points to the caret offset 
 (both ContentInterval#getStartOffset() and ContentInterval#getEndOffset()
 will return the caret position). Otherwise, the last ContentInterval 
 from the list corresponds with the last selection made in the editor.
 

 

 This method never returns `null`. If there is no selection,
 the list contains a single ContentInterval that points to the caret offset.

### `getSelectionInterval()`

**Returns:** [`ro.sync.ecss.extensions.api.ContentInterval`](./ContentInterval.md)

This is the last selection made in the
 Author editor page (the last selection from the #getSelectionIntervals()
 selections list). If the caret offset is not included in a selection range, 
 the selection interval points to the caret offset (both ContentInterval#getStartOffset()
 and ContentInterval#getEndOffset() will return the caret position).
 

 The ContentInterval contains the **inclusive** start selection
 offset and the **exclusive** end selection offset.
 

 

 This method never returns `null`. If there is no selection,
 both the start and end offset of the interval will be the caret position.

### `hasSelection()`

**Returns:** `boolean`

### `hasMultipleSelection()`

**Returns:** `boolean`

### `setSelection(`int` startOffset, `int` endOffset)`

**Returns:** `void`

This selection interval is considered to be the current one (the one that 
 will be returned by the AuthorSelectionModel#getSelectionInterval() 
 method). 
 
 
 

 The previous Author selections are discarded.

### `setSelection(`int` startOffset, `int` endOffset, `boolean` scrollToBVisible)`

**Returns:** `void`

This selection interval is considered to be the current one (the one that 
 will be returned by the AuthorSelectionModel#getSelectionInterval() 
 method). 
 
 
 

 The previous Author selections are discarded.

### `addSelection(`int` startOffset, `int` endOffset)`

**Returns:** `void`

This selection interval is considered to be the current one (the one that 
 will be returned by the AuthorSelectionModel#getSelectionInterval() 
 method).  
 

 
  
 The previous Author selections are kept.
 Call AuthorSelectionModel#getSelectionIntervals() method to get all 
 the selection intervals from Author editor page.

### `clearSelection()`

**Returns:** `void`

The caret will remain in the same position.
 

 

 After this method is executed, AuthorSelectionModel#getSelectionIntervals() will return a single
 selection interval that points to the caret offset (both ContentInterval#getStartOffset()
 and ContentInterval#getEndOffset() will return the caret position).

### `setSelectionIntervals(`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>` intervals, `boolean` scrollToVisible)`

**Returns:** `void`

Each ContentInterval contains the **inclusive** 
 start selection offset and the **exclusive** end selection offset.
 

 

 The selection intervals are added to the Author editor page order in which 
 they are in the list. The last selection interval end offset will set the caret position.

### `addSelectionIntervals(`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>` intervals, `boolean` scrollToVisible)`

**Returns:** `void`

Each ContentInterval contains the **inclusive** 
 start selection offset and the **exclusive** end selection offset.
 

 

 The selection intervals are added to the Author editor page order in which 
 they are in the list. The last selection interval end offset will set the caret position.

