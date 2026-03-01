# Class: `DefaultAuthorActionEventHandler`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.DefaultAuthorActionEventHandler`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorActionEventHandlerBase`](./AuthorActionEventHandlerBase.md)

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `handleEvent([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) arg0, `ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType` arg1)`

**Returns:** `boolean`

### `handlePromoteDemote(`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>` arg0, `boolean` arg1, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) arg2)`

**Returns:** `boolean`

### `getPreferredXMLElementContent([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) arg0)`

**Returns:** `java.lang.String`

### `getParagraphElement([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) arg0)`

**Returns:** `java.lang.String`

### `getCandidates([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) arg0)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

### `isCaretInProperPlace([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)

### `isMovableListItem([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) arg0, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) arg1)`

**Returns:** `boolean`

### `promote([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md) arg0, `int` arg1, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>` arg2, `boolean` arg3)`

**Returns:** [`ro.sync.ecss.extensions.api.ContentInterval`](./ContentInterval.md)

### `filterUniqueAttrs([`ro.sync.ecss.extensions.api.UniqueAttributesProcessor`](./UniqueAttributesProcessor.md) arg0, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>` arg1)`

**Returns:** `void`

### `demote([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md) arg0, `int` arg1, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>` arg2, `boolean` arg3)`

**Returns:** [`ro.sync.ecss.extensions.api.ContentInterval`](./ContentInterval.md)

### `insertElementIfPossible([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md) arg0, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) arg1, `int` arg2)`

**Returns:** `boolean`

### `deleteNodeChildren([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md) arg0, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) arg1)`

**Returns:** `void`

### `getInsertableFormForElement([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md) arg0, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) arg1, `int` arg2)`

**Returns:** [`ro.sync.contentcompletion.xml.CIElement`](../../../contentcompletion/xml/CIElement.md)

### `promoteSubListItems([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md) arg0, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) arg1, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) arg2)`

**Returns:** `void`

### `isList([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) arg0)`

**Returns:** `boolean`

### `areCompatibleLists([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) arg0, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) arg1)`

**Returns:** `boolean`

### `isHealthySchemaManager([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](./AuthorSchemaManager.md) arg0)`

**Returns:** `boolean`

### `compensateForSplits(`ro.sync.ecss.g.j` arg0, `ro.sync.ecss.changetracking.j` arg1, `javax.swing.text.Position` arg2, `int` arg3)`

**Returns:** `void`

### `removeSplitMarkers(`ro.sync.ecss.g.j` arg0, `ro.sync.ecss.changetracking.j` arg1, `int` arg2)`

**Returns:** `void`

### `canHandleEvent([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) arg0, `ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType` arg1)`

**Returns:** `boolean`

### `canChangeCodeblockIndentation([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) arg0, `ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType` arg1)`

**Returns:** `boolean`

### `canMoveListItems([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) arg0)`

**Returns:** `boolean`

### `getDescription()`

**Returns:** `java.lang.String`

### `getContentCompletionActions([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) arg0, `int` arg1)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.editor.IAuthorExtensionAction>`

### `getConvertListItemToParaAction([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) arg0, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.editor.IAuthorExtensionAction`](editor/IAuthorExtensionAction.md)

### `getUnindentListItemAction([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) arg0, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.editor.IAuthorExtensionAction`](editor/IAuthorExtensionAction.md)

### `isInsideNestedList([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) arg0, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) arg1)`

**Returns:** `boolean`

### `getConvertToActionName([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) arg0, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) arg1, `java.lang.String` arg2)`

**Returns:** `java.lang.String`

### `getLastListItemToConvert([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) arg0, [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

### `extractElementInternal([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

