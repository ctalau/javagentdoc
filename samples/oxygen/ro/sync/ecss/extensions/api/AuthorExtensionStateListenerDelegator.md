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

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

### `deactivated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md))

### `addListener(ro.sync.ecss.extensions.api.AuthorExtensionStateListener listener)`

**Returns:** `void`

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.AuthorExtensionStateListener`](./AuthorExtensionStateListener.md)): The new extension state listener.

### `removeListener(ro.sync.ecss.extensions.api.AuthorExtensionStateListener listener)`

**Returns:** `void`

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.AuthorExtensionStateListener`](./AuthorExtensionStateListener.md)): The extension state listener to remove.

### `getDescription()`

**Returns:** `java.lang.String`

### `fireActivated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access

### `fireDeactivated(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md)): The author access

