# Interface: `WSOptionsStorage`

**Package:** [`ro.sync.exml.workspace.api.options`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.options.WSOptionsStorage`

## Description

## Methods

### `setOptionsDoctypePrefix(`java.lang.String` optionsDoctypePrefix)`

**Returns:** `void`

### `addOptionListener([`ro.sync.exml.workspace.api.options.WSOptionListener`](./WSOptionListener.md) listener)`

**Returns:** `void`

The listener is notified when the value of its associated option changes.

### `removeOptionListener([`ro.sync.exml.workspace.api.options.WSOptionListener`](./WSOptionListener.md) listener)`

**Returns:** `void`

### `getOption(`java.lang.String` key, `java.lang.String` defaultValue)`

**Returns:** `java.lang.String`

### `setOption(`java.lang.String` key, `java.lang.String` value)`

**Returns:** `void`

If the supplied value is `null`
 The option will be removed from storage.

### `getSecretOption(`java.lang.String` key, `java.lang.String` defaultValue)`

**Returns:** `java.lang.String`

### `setSecretOption(`java.lang.String` key, `java.lang.String` value)`

**Returns:** `void`

If the supplied value is `null`
 The option will be removed from storage.

### `setPersistentObjectOption(`java.lang.String` key, [`ro.sync.exml.workspace.api.options.ExternalPersistentObject`](./ExternalPersistentObject.md) persistentObject)`

**Returns:** `void`

### `getPersistentObjectOption(`java.lang.String` key, [`ro.sync.exml.workspace.api.options.ExternalPersistentObject`](./ExternalPersistentObject.md) defaultValue)`

**Returns:** [`ro.sync.exml.workspace.api.options.ExternalPersistentObject`](./ExternalPersistentObject.md)

### `getStringArrayOption(`java.lang.String` key, `java.lang.String[]` defaultValues)`

**Returns:** `java.lang.String[]`

### `setStringArrayOption(`java.lang.String` key, `java.lang.String[]` values)`

**Returns:** `void`

If the provided value is `null`, the option will be removed from storage.

