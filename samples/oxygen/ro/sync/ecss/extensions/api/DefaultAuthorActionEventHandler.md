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

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` (`ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType`)

### `handlePromoteDemote(java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> arg0, boolean arg1, ro.sync.ecss.extensions.api.AuthorAccess arg2)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)
- `arg1` (`boolean`)
- `arg2` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

### `getPreferredXMLElementContent(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

### `getParagraphElement(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

### `getCandidates(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

### `isCaretInProperPlace(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

### `isMovableListItem(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.node.AuthorNode arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

### `promote(ro.sync.ecss.extensions.api.AuthorDocumentController arg0, int arg1, java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> arg2, boolean arg3)`

**Returns:** [`ro.sync.ecss.extensions.api.ContentInterval`](./ContentInterval.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md))
- `arg1` (`int`)
- `arg2` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)
- `arg3` (`boolean`)

### `filterUniqueAttrs(ro.sync.ecss.extensions.api.UniqueAttributesProcessor arg0, java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.UniqueAttributesProcessor`](./UniqueAttributesProcessor.md))
- `arg1` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)

### `demote(ro.sync.ecss.extensions.api.AuthorDocumentController arg0, int arg1, java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> arg2, boolean arg3)`

**Returns:** [`ro.sync.ecss.extensions.api.ContentInterval`](./ContentInterval.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md))
- `arg1` (`int`)
- `arg2` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`)
- `arg3` (`boolean`)

### `insertElementIfPossible(ro.sync.ecss.extensions.api.AuthorDocumentController arg0, ro.sync.ecss.extensions.api.node.AuthorElement arg1, int arg2)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))
- `arg2` (`int`)

### `deleteNodeChildren(ro.sync.ecss.extensions.api.AuthorDocumentController arg0, ro.sync.ecss.extensions.api.node.AuthorNode arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

### `getInsertableFormForElement(ro.sync.ecss.extensions.api.AuthorDocumentController arg0, ro.sync.ecss.extensions.api.node.AuthorElement arg1, int arg2)`

**Returns:** [`ro.sync.contentcompletion.xml.CIElement`](../../../contentcompletion/xml/CIElement.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))
- `arg2` (`int`)

### `promoteSubListItems(ro.sync.ecss.extensions.api.AuthorDocumentController arg0, ro.sync.ecss.extensions.api.node.AuthorNode arg1, ro.sync.ecss.extensions.api.node.AuthorNode arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))
- `arg2` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

### `isList(ro.sync.ecss.extensions.api.node.AuthorNode arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

### `areCompatibleLists(ro.sync.ecss.extensions.api.node.AuthorNode arg0, ro.sync.ecss.extensions.api.node.AuthorNode arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

### `isHealthySchemaManager(ro.sync.ecss.extensions.api.AuthorSchemaManager arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](./AuthorSchemaManager.md))

### `compensateForSplits(ro.sync.ecss.g.j arg0, ro.sync.ecss.changetracking.j arg1, javax.swing.text.Position arg2, int arg3)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.ecss.g.j`)
- `arg1` (`ro.sync.ecss.changetracking.j`)
- `arg2` (`javax.swing.text.Position`)
- `arg3` (`int`)

### `removeSplitMarkers(ro.sync.ecss.g.j arg0, ro.sync.ecss.changetracking.j arg1, int arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.ecss.g.j`)
- `arg1` (`ro.sync.ecss.changetracking.j`)
- `arg2` (`int`)

### `canHandleEvent(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` (`ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType`)

### `canChangeCodeblockIndentation(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` (`ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType`)

### `canMoveListItems(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

### `getDescription()`

**Returns:** `java.lang.String`

### `getContentCompletionActions(ro.sync.ecss.extensions.api.AuthorAccess arg0, int arg1)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.editor.IAuthorExtensionAction>`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` (`int`)

### `getConvertListItemToParaAction(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.node.AuthorElement arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.editor.IAuthorExtensionAction`](editor/IAuthorExtensionAction.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))

### `getUnindentListItemAction(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.node.AuthorElement arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.editor.IAuthorExtensionAction`](editor/IAuthorExtensionAction.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))

### `isInsideNestedList(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.node.AuthorElement arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))

### `getConvertToActionName(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.node.AuthorElement arg1, java.lang.String arg2)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))
- `arg2` (`java.lang.String`)

### `getLastListItemToConvert(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.node.AuthorElement arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))

### `extractElementInternal(ro.sync.ecss.extensions.api.node.AuthorElement arg0)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md))

