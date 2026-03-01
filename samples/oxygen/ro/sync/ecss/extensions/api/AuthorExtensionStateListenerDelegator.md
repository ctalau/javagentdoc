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

### `activated([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `void`

### `deactivated([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `void`

### `addListener([`ro.sync.ecss.extensions.api.AuthorExtensionStateListener`](./AuthorExtensionStateListener.md) listener)`

**Returns:** `void`

### `removeListener([`ro.sync.ecss.extensions.api.AuthorExtensionStateListener`](./AuthorExtensionStateListener.md) listener)`

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

### `fireActivated([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `void`

### `fireDeactivated([`ro.sync.ecss.extensions.api.AuthorAccess`](./AuthorAccess.md) authorAccess)`

**Returns:** `void`

