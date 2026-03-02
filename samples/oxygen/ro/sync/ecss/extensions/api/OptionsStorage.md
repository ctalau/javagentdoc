# Interface: `OptionsStorage`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.OptionsStorage`

## Description

## Methods

### `setOptionsDoctypePrefix(java.lang.String optionsDoctypePrefix)`

**Returns:** `void`

**Parameters:**
- `optionsDoctypePrefix` (`java.lang.String`): The document type prefix used to build the options keys.
 This should not be `null`.

### `addOptionListener(ro.sync.ecss.extensions.api.OptionListener listener)`

**Returns:** `void`

The listener is notified when the value of its associated option changes.

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.OptionListener`](./OptionListener.md)): The OptionListener to be added.

### `removeOptionListener(ro.sync.ecss.extensions.api.OptionListener listener)`

**Returns:** `void`

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.OptionListener`](./OptionListener.md)): The OptionListener to be removed.

### `getOption(java.lang.String key, java.lang.String defaultValue)`

**Returns:** `java.lang.String`

**Parameters:**
- `key` (`java.lang.String`): The key that uniquely identifies an option.
- `defaultValue` (`java.lang.String`): The default value for the specified option.

### `setOption(java.lang.String key, java.lang.String value)`

**Returns:** `void`

If the supplied value is `null`
 The option will be removed from storage.

**Parameters:**
- `key` (`java.lang.String`): The key of the option whose value is to be modified.
- `value` (`java.lang.String`): The new value of the option. If `null`
 the option will be removed from the storage.

