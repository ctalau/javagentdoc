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

### `getProposedElementsForInsert(AuthorSelectionAndCaretModel selectionModel)`

**Parameters:**
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection and caret model of the document.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy>`

### `getAllPossibleElementsForInsert()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy>`

### `executeInsert(CCItemProxy ccItem, AuthorSelectionAndCaretModel selectionModel)`

**Parameters:**
- `ccItem` ([`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md)): The content completion item chosen by the user.
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection and caret model of the document.

**Returns:** `void`

### `getProposedElementsForRename(AuthorSelectionAndCaretModel selectionModel)`

**Parameters:**
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection and caret model of the document.
   The selection should be either collapsed, or an entire element should be
   selected.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy>`

### `executeRename(AuthorSelectionAndCaretModel selectionModel, CCItemProxy ccItem)`

**Parameters:**
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection and caret model of the document.
- `ccItem` ([`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md)): The content completion item chosen for rename.

**Returns:** `void`

### `executeNewLine(AuthorSelectionAndCaretModel selectionModel)`

**Parameters:**
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection and caret model of the document.

**Returns:** `void`

### `getProposedElementsForSurround(AuthorSelectionAndCaretModel selectionModel)`

**Parameters:**
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection and caret model of the document.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy>`

### `executeSurround(CCItemProxy ccItem, AuthorSelectionAndCaretModel selectionModel)`

**Parameters:**
- `ccItem` ([`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md)): The content completion item chosen by the user.
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection and caret model of the document.

**Returns:** `void`

### `getProposedElementsToSplit(AuthorSelectionAndCaretModel selectionModel)`

**Parameters:**
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection and caret model of the document.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy>`

### `executeSplit(CCItemProxy ccItem, AuthorSelectionAndCaretModel selectionModel)`

**Parameters:**
- `ccItem` ([`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md)): The element chosen by the user.
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection model of the document.

**Returns:** `void`

### `executeSplit(AuthorSelectionAndCaretModel selectionModel)`

**Parameters:**
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection and caret model of the document.

**Returns:** `void`

### `getNewLineProposal(AuthorSelectionAndCaretModel selectionModel)`

**Parameters:**
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): Selection and caret model.

**Returns:** [`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md)

### `executeInsertInvalid(CCItemProxy ccItem, AuthorSelectionAndCaretModel selectionModel)`

Some schema aware strategies will be employed to find a good position to insert the 
 element.

**Parameters:**
- `ccItem` ([`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md)): The selected element.
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection.

**Returns:** `void`

### `executeAction(CCItemProxy ccItem, AuthorSelectionAndCaretModel selectionModel)`

**Parameters:**
- `ccItem` ([`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md)): The selected element.
- `selectionModel` ([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md)): The selection.

**Returns:** `void`

