# Class: `DocbookAuthorActionEventHandler`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.DocbookAuthorActionEventHandler`

**Extends:** [`ro.sync.ecss.extensions.api.DefaultAuthorActionEventHandler`](./DefaultAuthorActionEventHandler.md)

## Description

IMPORTANT, THIS CLASS SHOULD HAVE BEEN CREATED IN THE FRAMEWORK SPECIFIC PACKAGE.
 BUT IT WAS NOT, TOO LATE, WE KEEP IT HERE FOR BACKWARD COMPATIBILITY

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `MAX_LEVEL`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `promoteSubListItems([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md) controller, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) theDemotedCandidate, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) listElement)`

**Returns:** `void`

### `getSubListToPromote([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) parent, `int` level, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>` lastSubList)`

**Returns:** `void`

If there are more than 1 sublists,
 then we don't promote them anymore. We let them be demoted along
 with the parent item.

### `isParagraph([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node)`

**Returns:** `boolean`

### `isList([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node)`

**Returns:** `boolean`

### `areCompatibleLists([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node1, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node2)`

**Returns:** `boolean`

### `getParagraphElement([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `java.lang.String`

### `getListItemAncestorToSplit([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) access)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

### `hasLocalName([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node, `java.lang.String` localName)`

**Returns:** `boolean`

