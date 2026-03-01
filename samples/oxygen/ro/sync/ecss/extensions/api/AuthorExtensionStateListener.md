# Interface: `AuthorExtensionStateListener`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorExtensionStateListener`

**Extends:** [`ro.sync.ecss.extensions.api.Extension`](./Extension.md)

## Description

## Methods

### `activated([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `void`

This event is triggered when the Author extension where this listener is
 defined was activated in relation with a document opened in Author page.
 Listeners like AuthorMouseListener or AuthorListener 
 can be added at this point.

### `deactivated([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `void`

This event is triggered when another Author extension corresponding to the 
 the current document opened in Author page was activated, 
 the user switches to another editor page or the editor is closed.

