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

### `handleEvent(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` (`ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType`)

**Returns:** `boolean`

### `handlePromoteDemote(java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> arg0, boolean arg1, ro.sync.ecss.extensions.api.AuthorAccess arg2)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)
- `arg1` (`boolean`)
- `arg2` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** `boolean`

### `getPreferredXMLElementContent(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** `java.lang.String`

### `getParagraphElement(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** `java.lang.String`

### `getCandidates(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

### `isCaretInProperPlace(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)

### `isMovableListItem(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.node.AuthorNode arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `boolean`

### `promote(ro.sync.ecss.extensions.api.AuthorDocumentController arg0, int arg1, java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> arg2, boolean arg3)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md))
- `arg1` (`int`)
- `arg2` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)
- `arg3` (`boolean`)

**Returns:** [`ro.sync.ecss.extensions.api.ContentInterval`](./ContentInterval.md)

### `filterUniqueAttrs(ro.sync.ecss.extensions.api.UniqueAttributesProcessor arg0, java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.UniqueAttributesProcessor`](./UniqueAttributesProcessor.md))
- `arg1` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)

**Returns:** `void`

### `demote(ro.sync.ecss.extensions.api.AuthorDocumentController arg0, int arg1, java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> arg2, boolean arg3)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md))
- `arg1` (`int`)
- `arg2` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)
- `arg3` (`boolean`)

**Returns:** [`ro.sync.ecss.extensions.api.ContentInterval`](./ContentInterval.md)

### `insertElementIfPossible(ro.sync.ecss.extensions.api.AuthorDocumentController arg0, ro.sync.ecss.extensions.api.node.AuthorElement arg1, int arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))
- `arg2` (`int`)

**Returns:** `boolean`

### `deleteNodeChildren(ro.sync.ecss.extensions.api.AuthorDocumentController arg0, ro.sync.ecss.extensions.api.node.AuthorNode arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `void`

### `getInsertableFormForElement(ro.sync.ecss.extensions.api.AuthorDocumentController arg0, ro.sync.ecss.extensions.api.node.AuthorElement arg1, int arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))
- `arg2` (`int`)

**Returns:** [`ro.sync.contentcompletion.xml.CIElement`](../../../contentcompletion/xml/CIElement.md)

### `promoteSubListItems(ro.sync.ecss.extensions.api.AuthorDocumentController arg0, ro.sync.ecss.extensions.api.node.AuthorNode arg1, ro.sync.ecss.extensions.api.node.AuthorNode arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))
- `arg2` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `void`

### `isList(ro.sync.ecss.extensions.api.node.AuthorNode arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `boolean`

### `areCompatibleLists(ro.sync.ecss.extensions.api.node.AuthorNode arg0, ro.sync.ecss.extensions.api.node.AuthorNode arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `boolean`

### `isHealthySchemaManager(ro.sync.ecss.extensions.api.AuthorSchemaManager arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](./AuthorSchemaManager.md))

**Returns:** `boolean`

### `compensateForSplits(ro.sync.ecss.g.j arg0, ro.sync.ecss.changetracking.j arg1, javax.swing.text.Position arg2, int arg3)`

**Parameters:**
- `arg0` (`ro.sync.ecss.g.j`)
- `arg1` (`ro.sync.ecss.changetracking.j`)
- `arg2` (`javax.swing.text.Position`)
- `arg3` (`int`)

**Returns:** `void`

### `removeSplitMarkers(ro.sync.ecss.g.j arg0, ro.sync.ecss.changetracking.j arg1, int arg2)`

**Parameters:**
- `arg0` (`ro.sync.ecss.g.j`)
- `arg1` (`ro.sync.ecss.changetracking.j`)
- `arg2` (`int`)

**Returns:** `void`

### `canHandleEvent(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` (`ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType`)

**Returns:** `boolean`

### `canChangeCodeblockIndentation(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` (`ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType`)

**Returns:** `boolean`

### `canMoveListItems(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** `boolean`

### `getDescription()`

**Returns:** `java.lang.String`

### `getContentCompletionActions(ro.sync.ecss.extensions.api.AuthorAccess arg0, int arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` (`int`)

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.editor.IAuthorExtensionAction>`

### `getConvertListItemToParaAction(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.node.AuthorElement arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))

**Returns:** [`ro.sync.ecss.extensions.api.editor.IAuthorExtensionAction`](editor/IAuthorExtensionAction.md)

### `getUnindentListItemAction(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.node.AuthorElement arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))

**Returns:** [`ro.sync.ecss.extensions.api.editor.IAuthorExtensionAction`](editor/IAuthorExtensionAction.md)

### `isInsideNestedList(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.node.AuthorElement arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))

**Returns:** `boolean`

### `getConvertToActionName(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.node.AuthorElement arg1, java.lang.String arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))
- `arg2` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getLastListItemToConvert(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.node.AuthorElement arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

### `extractElementInternal(ro.sync.ecss.extensions.api.node.AuthorElement arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

