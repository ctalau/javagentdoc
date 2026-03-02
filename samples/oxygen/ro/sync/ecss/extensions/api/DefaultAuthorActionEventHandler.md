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

### `handleEvent(AuthorAccess arg0, AuthorActionEventHandler.AuthorActionEventType arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` (`ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType`)

**Returns:** `boolean`

### `handlePromoteDemote(List<AuthorNode> arg0, boolean arg1, AuthorAccess arg2)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)
- `arg1` (`boolean`)
- `arg2` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** `boolean`

### `getPreferredXMLElementContent(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** `java.lang.String`

### `getParagraphElement(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** `java.lang.String`

### `getCandidates(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

### `isCaretInProperPlace(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)

### `isMovableListItem(AuthorAccess arg0, AuthorNode arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `boolean`

### `promote(AuthorDocumentController arg0, int arg1, List<AuthorNode> arg2, boolean arg3)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md))
- `arg1` (`int`)
- `arg2` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)
- `arg3` (`boolean`)

**Returns:** [`ro.sync.ecss.extensions.api.ContentInterval`](./ContentInterval.md)

### `filterUniqueAttrs(UniqueAttributesProcessor arg0, List<AuthorNode> arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.UniqueAttributesProcessor`](./UniqueAttributesProcessor.md))
- `arg1` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)

**Returns:** `void`

### `demote(AuthorDocumentController arg0, int arg1, List<AuthorNode> arg2, boolean arg3)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md))
- `arg1` (`int`)
- `arg2` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)
- `arg3` (`boolean`)

**Returns:** [`ro.sync.ecss.extensions.api.ContentInterval`](./ContentInterval.md)

### `insertElementIfPossible(AuthorDocumentController arg0, AuthorElement arg1, int arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))
- `arg2` (`int`)

**Returns:** `boolean`

### `deleteNodeChildren(AuthorDocumentController arg0, AuthorNode arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `void`

### `getInsertableFormForElement(AuthorDocumentController arg0, AuthorElement arg1, int arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))
- `arg2` (`int`)

**Returns:** [`ro.sync.contentcompletion.xml.CIElement`](../../../contentcompletion/xml/CIElement.md)

### `promoteSubListItems(AuthorDocumentController arg0, AuthorNode arg1, AuthorNode arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))
- `arg2` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `void`

### `isList(AuthorNode arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `boolean`

### `areCompatibleLists(AuthorNode arg0, AuthorNode arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `boolean`

### `isHealthySchemaManager(AuthorSchemaManager arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](./AuthorSchemaManager.md))

**Returns:** `boolean`

### `compensateForSplits(j arg0, j arg1, Position arg2, int arg3)`

**Parameters:**
- `arg0` (`ro.sync.ecss.g.j`)
- `arg1` (`ro.sync.ecss.changetracking.j`)
- `arg2` (`javax.swing.text.Position`)
- `arg3` (`int`)

**Returns:** `void`

### `removeSplitMarkers(j arg0, j arg1, int arg2)`

**Parameters:**
- `arg0` (`ro.sync.ecss.g.j`)
- `arg1` (`ro.sync.ecss.changetracking.j`)
- `arg2` (`int`)

**Returns:** `void`

### `canHandleEvent(AuthorAccess arg0, AuthorActionEventHandler.AuthorActionEventType arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` (`ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType`)

**Returns:** `boolean`

### `canChangeCodeblockIndentation(AuthorAccess arg0, AuthorActionEventHandler.AuthorActionEventType arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` (`ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType`)

**Returns:** `boolean`

### `canMoveListItems(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** `boolean`

### `getDescription()`

**Returns:** `java.lang.String`

### `getContentCompletionActions(AuthorAccess arg0, int arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` (`int`)

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.editor.IAuthorExtensionAction>`

### `getConvertListItemToParaAction(AuthorAccess arg0, AuthorElement arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))

**Returns:** [`ro.sync.ecss.extensions.api.editor.IAuthorExtensionAction`](editor/IAuthorExtensionAction.md)

### `getUnindentListItemAction(AuthorAccess arg0, AuthorElement arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))

**Returns:** [`ro.sync.ecss.extensions.api.editor.IAuthorExtensionAction`](editor/IAuthorExtensionAction.md)

### `isInsideNestedList(AuthorAccess arg0, AuthorElement arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))

**Returns:** `boolean`

### `getConvertToActionName(AuthorAccess arg0, AuthorElement arg1, String arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))
- `arg2` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getLastListItemToConvert(AuthorAccess arg0, AuthorElement arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

### `extractElementInternal(AuthorElement arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

