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

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md))

**Returns:** `java.lang.String`

### `resolveXrefReference(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String linkendOrHrefAttrValue)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): Author node that contains the xref.
- `linkendOrHrefAttrValue` (`java.lang.String`): The value of the linkend or href attribute.

**Returns:** `java.lang.String`

### `refresh()`

**Returns:** `void`

### `clearReferencesCache()`

**Returns:** `void`

### `findElementWithId(ro.sync.ecss.extensions.api.node.AuthorNode node, java.lang.String id)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node in whose children (including the node itself)
   we look for the element with the given ID.
- `id` (`java.lang.String`): The ID of the element to be returned.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

### `getIDAttribute(ro.sync.ecss.extensions.api.node.AuthorElement elem, java.lang.String id)`

**Parameters:**
- `elem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The current element.
- `id` (`java.lang.String`): The value of the attribute whose name we are looking for.

**Returns:** `java.lang.String`

### `getTitleValue(ro.sync.ecss.extensions.api.node.AuthorElement elem)`

**Parameters:**
- `elem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The current element.

**Returns:** `java.lang.String`

### `getFirstChildElement(ro.sync.ecss.extensions.api.node.AuthorElement elem)`

**Parameters:**
- `elem` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): Author element.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

### `activated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))

**Returns:** `void`

### `deactivated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))

**Returns:** `void`

