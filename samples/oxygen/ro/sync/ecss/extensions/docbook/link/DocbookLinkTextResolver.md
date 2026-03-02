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

### `resolveReference(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `java.lang.String`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

### `resolveXrefReference(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String linkendOrHrefAttrValue)`

**Returns:** `java.lang.String`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): Author node that contains the xref.
- `linkendOrHrefAttrValue` (`java.lang.String`): The value of the linkend or href attribute.

### `refresh()`

**Returns:** `void`

### `clearReferencesCache()`

**Returns:** `void`

### `findElementWithId(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String id)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node in whose children (including the node itself)
 we look for the element with the given ID.
- `id` (`java.lang.String`): The ID of the element to be returned.

### `getIDAttribute(ro.sync.ecss.extensions.api.node.AuthorElement elem, java.lang.String id)`

**Returns:** `java.lang.String`

**Parameters:**
- `elem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The current element.
- `id` (`java.lang.String`): The value of the attribute whose name we are looking for.

### `getTitleValue(ro.sync.ecss.extensions.api.node.AuthorElement elem)`

**Returns:** `java.lang.String`

**Parameters:**
- `elem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The current element.

### `getFirstChildElement(ro.sync.ecss.extensions.api.node.AuthorElement elem)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

**Parameters:**
- `elem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): Author element.

### `activated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))

### `deactivated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))

