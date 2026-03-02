# Class: `DITAAuthorActionEventHandler`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.DITAAuthorActionEventHandler`

**Extends:** [`ro.sync.ecss.extensions.api.DefaultAuthorActionEventHandler`](./DefaultAuthorActionEventHandler.md)

## Description

IMPORTANT, THIS CLASS SHOULD HAVE BEEN CREATED IN THE FRAMEWORK SPECIFIC PACKAGE.
 BUT IT WAS NOT, TOO LATE, WE KEEP IT HERE FOR BACKWARD COMPATIBILITY

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `isMovableListItem(AuthorAccess authorAccess, AuthorNode candidate)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `candidate` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `boolean`

### `isList(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `boolean`

### `getParagraphElement(AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** `java.lang.String`

### `areCompatibleLists(AuthorNode node1, AuthorNode node2)`

**Parameters:**
- `node1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))
- `node2` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))

**Returns:** `boolean`

### `getListItemAncestorToSplit(AuthorNode node, AuthorAccess access)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md))
- `access` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

### `matchesClass(AuthorElement element, String classFragment)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The element.
- `classFragment` (`java.lang.String`): The DITA class fragment.

**Returns:** `boolean`

### `handleEvent(AuthorAccess authorAccess, AuthorActionEventHandler.AuthorActionEventType eventType)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `eventType` (`ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType`)

**Returns:** `boolean`

### `handleEnterAtTableEnd(AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): the author access.

**Returns:** `boolean`

### `handleEnterInBeforeSectionTitle(AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access.

**Returns:** `boolean`

### `isCaretBeforeSectionTitle(AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access.

**Returns:** `boolean`

### `getSectionBeforeTitle(AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

### `canHandleEvent(AuthorAccess authorAccess, AuthorActionEventDetails eventDetails)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))
- `eventDetails` ([`ro.sync.ecss.extensions.api.AuthorActionEventDetails`](./AuthorActionEventDetails.md))

**Returns:** `boolean`

### `shouldHandleEnter(AuthorAccess authorAccess, boolean showCCWindow)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): the author access.
- `showCCWindow` (`boolean`): whether the CC window will be shown.

**Returns:** `boolean`

### `isCaretAtTableEnd(AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): the author access.

**Returns:** `boolean`

