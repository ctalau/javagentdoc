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

### `doOperation(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

**Returns:** `void`

### `extractNewDocContent(AuthorDocumentController sourceCtrl, int selectionStart, int selectionEnd)`

**Parameters:**
- `sourceCtrl` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md)): The document controller over the current document (source)
- `selectionStart` (`int`): The start offset of the selection of the source document
- `selectionEnd` (`int`): The end offset of the selection of the source document

**Returns:** `ro.sync.ecss.extensions.dita.topic.CreateNewTopicFromSelectionOperation.DocContent`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `isTitle(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

**Returns:** `boolean`

### `openAndGetAuthorPage(AuthorWorkspaceAccess workspaceAccess, URL toOpen)`

**Parameters:**
- `workspaceAccess` ([`ro.sync.ecss.extensions.api.access.AuthorWorkspaceAccess`](../../api/access/AuthorWorkspaceAccess.md)): Offers access to Author API.
- `toOpen` (`java.net.URL`): The URL to open.

**Returns:** [`ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPage`](../../../../exml/workspace/api/editor/page/author/WSAuthorEditorPage.md)

### `insertInTopicBody(AuthorDocumentController controller, AuthorDocumentFragment fragmentToInsert)`

**Parameters:**
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md)): The document controller
- `fragmentToInsert` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md)): The fragment that will be inserted.

**Returns:** `void`

### `getAttribute(AuthorElement element, String attrName)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element
- `attrName` (`java.lang.String`): The attribute name.

**Returns:** `java.lang.String`

