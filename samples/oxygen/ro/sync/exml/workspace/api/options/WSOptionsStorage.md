# Interface: `WSOptionsStorage`

**Package:** [`ro.sync.exml.workspace.api.options`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.options.WSOptionsStorage`

## Description

## Methods

### `setOptionsDoctypePrefix(String optionsDoctypePrefix)`

**Parameters:**
- `optionsDoctypePrefix` (`java.lang.String`): The document type prefix used to build the options keys.
   This should not be `null`.

**Returns:** `void`

### `addOptionListener(WSOptionListener listener)`

The listener is notified when the value of its associated option changes.

**Parameters:**
- `listener` ([`ro.sync.exml.workspace.api.options.WSOptionListener`](./WSOptionListener.md)): The OptionListener to be added.

**Returns:** `void`

### `removeOptionListener(WSOptionListener listener)`

**Parameters:**
- `listener` ([`ro.sync.exml.workspace.api.options.WSOptionListener`](./WSOptionListener.md)): The OptionListener to be removed.

**Returns:** `void`

### `getOption(String key, String defaultValue)`

**Parameters:**
- `key` (`java.lang.String`): The key that uniquely identifies an option.
- `defaultValue` (`java.lang.String`): The default value for the specified option.

**Returns:** `java.lang.String`

### `setOption(String key, String value)`

If the supplied value is `null`
 The option will be removed from storage.

**Parameters:**
- `key` (`java.lang.String`): The key of the option whose value is to be modified.
- `value` (`java.lang.String`): The new value of the option. If `null`
   the option will be removed from the storage.

**Returns:** `void`

### `getSecretOption(String key, String defaultValue)`

**Parameters:**
- `key` (`java.lang.String`): The key that uniquely identifies an option.
- `defaultValue` (`java.lang.String`): The default value for the specified option.

**Returns:** `java.lang.String`

### `setSecretOption(String key, String value)`

If the supplied value is `null`
 The option will be removed from storage.

**Parameters:**
- `key` (`java.lang.String`): The key of the option whose value is to be modified.
- `value` (`java.lang.String`): The new value of the option. If `null`
   the option will be removed from the storage.

**Returns:** `void`

### `setPersistentObjectOption(String key, ExternalPersistentObject persistentObject)`

**Parameters:**
- `key` (`java.lang.String`): The key.
- `persistentObject` ([`ro.sync.exml.workspace.api.options.ExternalPersistentObject`](./ExternalPersistentObject.md)): The persistent object.

**Returns:** `void`

### `getPersistentObjectOption(String key, ExternalPersistentObject defaultValue)`

**Parameters:**
- `key` (`java.lang.String`): The key.
- `defaultValue` ([`ro.sync.exml.workspace.api.options.ExternalPersistentObject`](./ExternalPersistentObject.md)): Default value

**Returns:** [`ro.sync.exml.workspace.api.options.ExternalPersistentObject`](./ExternalPersistentObject.md)

### `getStringArrayOption(String key, String[] defaultValues)`

**Parameters:**
- `key` (`java.lang.String`): The key that uniquely identifies the option.
- `defaultValues` (`java.lang.String[]`): The default values for the specified option.

**Returns:** `java.lang.String[]`

### `setStringArrayOption(String key, String[] values)`

If the provided value is `null`, the option will be removed from storage.

**Parameters:**
- `key` (`java.lang.String`): The key that uniquely identifies the option.
- `values` (`java.lang.String[]`): The new values to set. If `null`, the option 
                      will be removed from the storage.

**Returns:** `void`

