# Class: `LinkTextResolver`

**Package:** [`ro.sync.ecss.extensions.api.link`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.link.LinkTextResolver`

## Description

This interface is used
 when CSS function oxy_link-text() is encountered in the CSS on 'content' properties.

## Constructors

### `<init>()`

## Methods

### `resolveReference(ro.sync.ecss.extensions.api.node.AuthorNode node)`

This text will be used inside
 author page next to the the link element.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../node/AuthorNode.md)): Author node.

**Returns:** `java.lang.String`

### `update(java.util.Set<java.lang.String> modifiedURLs)`

Update the cache of references if any of the 
 resolved links were loaded from one of these URL.

**Parameters:**
- `modifiedURLs` (`java.util.Set<java.lang.String>`): The URLs that are modified.

**Returns:** `void`

### `refresh()`

Any cache should be cleared in order to 
 prepare for future evaluations.

**Returns:** `void`

### `clearReferencesCache()`

**Returns:** `void`

### `activated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

All kinds of listeners 
 can be added on this call (like AuthorMouseListener or AuthorListener).

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md)): The AuthorAccess of the Author page where the 
   listener was activated.

**Returns:** `void`

### `deactivated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

All listeners 
 should be removed on this call.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md)): The AuthorAccess of the Author page where the 
   listener was activated.

**Returns:** `void`

### `refreshNodeReferences(ro.sync.ecss.extensions.api.node.AuthorNode node)`

After performing an internal refresh the resolver must get an editor access 
 using AuthorAccess#getEditorAccess() and call AuthorEditorAccess#refresh(AuthorNode)
  so that the editing area updates.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../node/AuthorNode.md)): The node to be refresh.

**Returns:** `void`

