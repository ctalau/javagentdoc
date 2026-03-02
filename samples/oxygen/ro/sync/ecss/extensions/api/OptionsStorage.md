# Interface: `OptionsStorage`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.OptionsStorage`

## Description

## Methods

### `setOptionsDoctypePrefix(String optionsDoctypePrefix)`

**Parameters:**
- `optionsDoctypePrefix` (`java.lang.String`): The document type prefix used to build the options keys.
   This should not be `null`.

**Returns:** `void`

### `addOptionListener(OptionListener listener)`

The listener is notified when the value of its associated option changes.

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.OptionListener`](./OptionListener.md)): The OptionListener to be added.

**Returns:** `void`

### `removeOptionListener(OptionListener listener)`

**Parameters:**
- `listener` ([`ro.sync.ecss.extensions.api.OptionListener`](./OptionListener.md)): The OptionListener to be removed.

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

