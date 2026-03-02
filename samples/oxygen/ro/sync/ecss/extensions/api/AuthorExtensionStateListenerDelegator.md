# Class: `AuthorExtensionStateListenerDelegator`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorExtensionStateListenerDelegator`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorExtensionStateListener`](./AuthorExtensionStateListener.md)

## Description

This is useful in case you need to receive activated() events in more implementations.

## Fields

### `listeners`

**Type:** `java.util.List<ro.sync.ecss.extensions.api.AuthorExtensionStateListener>`

## Constructors

### `<init>()`

## Methods

### `activated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** `void`

### `deactivated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

**Returns:** `void`

### `addListener(ro.sync.ecss.extensions.api.AuthorExtensionStateListener listener)`

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.AuthorExtensionStateListener`](./AuthorExtensionStateListener.md)): The new extension state listener.

**Returns:** `void`

### `removeListener(ro.sync.ecss.extensions.api.AuthorExtensionStateListener listener)`

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.AuthorExtensionStateListener`](./AuthorExtensionStateListener.md)): The extension state listener to remove.

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

### `fireActivated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access

**Returns:** `void`

### `fireDeactivated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access

**Returns:** `void`

