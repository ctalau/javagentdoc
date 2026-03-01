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

### `isMovableListItem([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) candidate)`

**Returns:** `boolean`

### `isList([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node)`

**Returns:** `boolean`

### `getParagraphElement([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `java.lang.String`

### `areCompatibleLists([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node1, [`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node2)`

**Returns:** `boolean`

### `getListItemAncestorToSplit([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) node, [`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) access)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

### `matchesClass([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) element, `java.lang.String` classFragment)`

**Returns:** `boolean`

### `handleEvent([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `ro.sync.ecss.extensions.api.AuthorActionEventHandler.AuthorActionEventType` eventType)`

**Returns:** `boolean`

### `handleEnterAtTableEnd([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `handleEnterInBeforeSectionTitle([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `isCaretBeforeSectionTitle([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

### `getSectionBeforeTitle([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)

### `canHandleEvent([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.AuthorActionEventDetails`](./AuthorActionEventDetails.md) eventDetails)`

**Returns:** `boolean`

### `shouldHandleEnter([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess, `boolean` showCCWindow)`

**Returns:** `boolean`

### `isCaretAtTableEnd([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `boolean`

