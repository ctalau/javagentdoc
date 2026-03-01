# Class: `DocbookLinkTextResolver`

**Package:** [`ro.sync.ecss.extensions.docbook.link`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.docbook.link.DocbookLinkTextResolver`

**Extends:** [`ro.sync.ecss.extensions.api.link.LinkTextResolver`](../../api/link/LinkTextResolver.md)

## Description

The content of the link is given by either
 the xreflabel attribute or a title(info/title) child of the targeted element.

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `dependencies`

**Type:** `java.util.Map<java.lang.String,ro.sync.basic.util.WeakHashSet<ro.sync.ecss.extensions.api.node.AuthorNode>>`

It uses weak references to avoid a memory leak.

### `idToAuthorNodeMap`

**Type:** `java.util.Map<java.lang.String,java.lang.ref.WeakReference<ro.sync.ecss.extensions.api.node.AuthorElement>>`

### `authorListenerAdapter`

**Type:** [`ro.sync.ecss.extensions.api.AuthorListenerAdapter`](../../api/AuthorListenerAdapter.md)

### `authorAccess`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)

## Constructors

### `<init>()`

## Methods

### `resolveReference([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node)`

**Returns:** `java.lang.String`

### `resolveXrefReference([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node, `java.lang.String` linkendOrHrefAttrValue)`

**Returns:** `java.lang.String`

### `refresh()`

**Returns:** `void`

### `clearReferencesCache()`

**Returns:** `void`

### `findElementWithId([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node, `java.lang.String` id)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

### `getIDAttribute([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) elem, `java.lang.String` id)`

**Returns:** `java.lang.String`

### `getTitleValue([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) elem)`

**Returns:** `java.lang.String`

### `getFirstChildElement([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) elem)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

### `activated([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** `void`

### `deactivated([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** `void`

