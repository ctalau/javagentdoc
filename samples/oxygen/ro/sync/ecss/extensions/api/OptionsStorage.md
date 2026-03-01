# Interface: `OptionsStorage`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.OptionsStorage`

## Description

## Methods

### `setOptionsDoctypePrefix(`java.lang.String` optionsDoctypePrefix)`

**Returns:** `void`

### `addOptionListener([`ro.sync.ecss.extensions.api.OptionListener`](./OptionListener.md) listener)`

**Returns:** `void`

The listener is notified when the value of its associated option changes.

### `removeOptionListener([`ro.sync.ecss.extensions.api.OptionListener`](./OptionListener.md) listener)`

**Returns:** `void`

### `getOption(`java.lang.String` key, `java.lang.String` defaultValue)`

**Returns:** `java.lang.String`

### `setOption(`java.lang.String` key, `java.lang.String` value)`

**Returns:** `void`

If the supplied value is `null`
 The option will be removed from storage.

