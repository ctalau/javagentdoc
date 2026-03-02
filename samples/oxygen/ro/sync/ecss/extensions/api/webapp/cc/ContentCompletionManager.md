# Interface: `ContentCompletionManager`

**Package:** [`ro.sync.ecss.extensions.api.webapp.cc`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.cc.ContentCompletionManager`

## Description

For every action we have two methods: one that returns a list of proposals
 to be presented to the user and another one that performs the action based
 on the user choice. 
 
 Users of the API will typically show a dialog with the proposals and after 
 the user selects one of the call the second method to finish the action.

## Methods

### `getProposedElementsForInsert(ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel selectionModel)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy>`

**Parameters:**
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection and caret model of the document.

### `getAllPossibleElementsForInsert()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy>`

### `executeInsert(ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy ccItem, ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel selectionModel)`

**Returns:** `void`

**Parameters:**
- `ccItem` ([`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md)): The content completion item chosen by the user.
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection and caret model of the document.

### `getProposedElementsForRename(ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel selectionModel)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy>`

**Parameters:**
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection and caret model of the document.
 The selection should be either collapsed, or an entire element should be
 selected.

### `executeRename(ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel selectionModel, ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy ccItem)`

**Returns:** `void`

**Parameters:**
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection and caret model of the document.
- `ccItem` ([`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md)): The content completion item chosen for rename.

### `executeNewLine(ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel selectionModel)`

**Returns:** `void`

**Parameters:**
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection and caret model of the document.

### `getProposedElementsForSurround(ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel selectionModel)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy>`

**Parameters:**
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection and caret model of the document.

### `executeSurround(ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy ccItem, ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel selectionModel)`

**Returns:** `void`

**Parameters:**
- `ccItem` ([`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md)): The content completion item chosen by the user.
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection and caret model of the document.

### `getProposedElementsToSplit(ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel selectionModel)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy>`

**Parameters:**
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection and caret model of the document.

### `executeSplit(ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy ccItem, ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel selectionModel)`

**Returns:** `void`

**Parameters:**
- `ccItem` ([`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md)): The element chosen by the user.
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection model of the document.

### `executeSplit(ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel selectionModel)`

**Returns:** `void`

**Parameters:**
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection and caret model of the document.

### `getNewLineProposal(ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel selectionModel)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md)

**Parameters:**
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): Selection and caret model.

### `executeInsertInvalid(ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy ccItem, ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel selectionModel)`

**Returns:** `void`

Some schema aware strategies will be employed to find a good position to insert the 
 element.

**Parameters:**
- `ccItem` ([`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md)): The selected element.
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection.

### `executeAction(ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy ccItem, ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel selectionModel)`

**Returns:** `void`

**Parameters:**
- `ccItem` ([`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md)): The selected element.
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection.

