# Class: `CreateNewTopicFromSelectionOperation`

**Package:** [`ro.sync.ecss.extensions.dita.topic`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.topic.CreateNewTopicFromSelectionOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

## Constructors

### `<init>()`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

### `extractNewDocContent(ro.sync.ecss.extensions.api.AuthorDocumentController sourceCtrl, int selectionStart, int selectionEnd)`

**Returns:** `ro.sync.ecss.extensions.dita.topic.CreateNewTopicFromSelectionOperation.DocContent`

**Parameters:**
- `sourceCtrl` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md)): The document controller over the current document (source)
- `selectionStart` (`int`): The start offset of the selection of the source document
- `selectionEnd` (`int`): The end offset of the selection of the source document

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `isTitle(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

### `openAndGetAuthorPage(ro.sync.ecss.extensions.api.access.AuthorWorkspaceAccess workspaceAccess, java.net.URL toOpen)`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPage`](../../../../exml/workspace/api/editor/page/author/WSAuthorEditorPage.md)

**Parameters:**
- `workspaceAccess` ([`ro.sync.ecss.extensions.api.access.AuthorWorkspaceAccess`](../../api/access/AuthorWorkspaceAccess.md)): Offers access to Author API.
- `toOpen` (`java.net.URL`): The URL to open.

### `insertInTopicBody(ro.sync.ecss.extensions.api.AuthorDocumentController controller, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment fragmentToInsert)`

**Returns:** `void`

**Parameters:**
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md)): The document controller
- `fragmentToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md)): The fragment that will be inserted.

### `getAttribute(ro.sync.ecss.extensions.api.node.AuthorElement element, java.lang.String attrName)`

**Returns:** `java.lang.String`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element
- `attrName` (`java.lang.String`): The attribute name.

