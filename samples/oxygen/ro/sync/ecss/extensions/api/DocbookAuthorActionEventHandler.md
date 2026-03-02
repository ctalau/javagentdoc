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

### `promoteSubListItems(ro.sync.ecss.extensions.api.AuthorDocumentController controller, ro.sync.ecss.extensions.api.node.AuthorNode theDemotedCandidate, ro.sync.ecss.extensions.api.node.AuthorNode listElement)`

**Returns:** `void`

**Parameters:**
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](./AuthorDocumentController.md))
- `theDemotedCandidate` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))
- `listElement` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

### `getSubListToPromote(ro.sync.ecss.extensions.api.node.AuthorNode parent, int level, java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode> lastSubList)`

**Returns:** `void`

If there are more than 1 sublists,
 then we don't promote them anymore. We let them be demoted along
 with the parent item.

**Parameters:**
- `parent` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): Initially the demoted item.
- `level` (`int`): The level inside the item that was demoted.
- `lastSubList` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorNode>`): A list where we want to store the last sublist inside the demoted item.
                      Needed a list in order to be able to store and return from recursion the last sublist.

### `isParagraph(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): the node for which we perform the check.

### `isList(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

### `areCompatibleLists(ro.sync.ecss.extensions.api.node.AuthorNode node1, ro.sync.ecss.extensions.api.node.AuthorNode node2)`

**Returns:** `boolean`

**Parameters:**
- `node1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))
- `node2` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

### `getParagraphElement(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `java.lang.String`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

### `getListItemAncestorToSplit(ro.sync.ecss.extensions.api.node.AuthorNode node, ro.sync.ecss.extensions.api.AuthorAccess access)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))
- `access` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

### `hasLocalName(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String localName)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node to check.
- `localName` (`java.lang.String`): The local name.

