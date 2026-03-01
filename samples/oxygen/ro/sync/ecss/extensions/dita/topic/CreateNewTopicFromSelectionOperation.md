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

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `extractNewDocContent([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md) sourceCtrl, `int` selectionStart, `int` selectionEnd)`

**Returns:** `ro.sync.ecss.extensions.dita.topic.CreateNewTopicFromSelectionOperation.DocContent`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `isTitle([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `openAndGetAuthorPage([`ro.sync.ecss.extensions.api.access.AuthorWorkspaceAccess`](../../api/access/AuthorWorkspaceAccess.md) workspaceAccess, `java.net.URL` toOpen)`

**Returns:** [`ro.sync.exml.workspace.api.editor.page.author.WSAuthorEditorPage`](../../../../exml/workspace/api/editor/page/author/WSAuthorEditorPage.md)

### `insertInTopicBody([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md) controller, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md) fragmentToInsert)`

**Returns:** `void`

### `getAttribute([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element, `java.lang.String` attrName)`

**Returns:** `java.lang.String`

