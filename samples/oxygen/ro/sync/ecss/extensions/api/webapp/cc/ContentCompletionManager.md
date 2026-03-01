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

### `getProposedElementsForInsert([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md) selectionModel)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy>`

### `getAllPossibleElementsForInsert()`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy>`

### `executeInsert([`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md) ccItem, [`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md) selectionModel)`

**Returns:** `void`

### `getProposedElementsForRename([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md) selectionModel)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy>`

### `executeRename([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md) selectionModel, [`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md) ccItem)`

**Returns:** `void`

### `executeNewLine([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md) selectionModel)`

**Returns:** `void`

### `getProposedElementsForSurround([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md) selectionModel)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy>`

### `executeSurround([`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md) ccItem, [`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md) selectionModel)`

**Returns:** `void`

### `getProposedElementsToSplit([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md) selectionModel)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy>`

### `executeSplit([`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md) ccItem, [`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md) selectionModel)`

**Returns:** `void`

### `executeSplit([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md) selectionModel)`

**Returns:** `void`

### `getNewLineProposal([`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md) selectionModel)`

**Returns:** [`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md)

### `executeInsertInvalid([`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md) ccItem, [`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md) selectionModel)`

**Returns:** `void`

Some schema aware strategies will be employed to find a good position to insert the 
 element.

### `executeAction([`ro.sync.ecss.extensions.api.webapp.cc.CCItemProxy`](./CCItemProxy.md) ccItem, [`ro.sync.ecss.extensions.api.AuthorSelectionAndCaretModel`](../../AuthorSelectionAndCaretModel.md) selectionModel)`

**Returns:** `void`

