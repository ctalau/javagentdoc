# Class: `OptionListener`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.OptionListener`

## Description

## Fields

### `key`

**Type:** `java.lang.String`

The listener will be notified about the value changes 
 of the option associated with this key.

## Constructors

### `<init>()`

IMPORTANT, this default constructor is mostly intended to facilitate creating such objects from Javascript Rhino code.
 You must set a an option key using the "setKey" method after you are using this implicit constructor.

### `<init>(java.lang.String key)`

**Parameters:**
- `key` (`java.lang.String`): The key of the option whose value modification
   triggers the listener notification.

## Methods

### `optionValueChanged(ro.sync.ecss.extensions.api.OptionChangedEvent event)`

**Parameters:**
- `event` ([`ro.sync.ecss.extensions.api.OptionChangedEvent`](./OptionChangedEvent.md)): An OptionChangedEvent which indicates that the value 
   of the associated option has been changed.

**Returns:** `void`

### `setKey(java.lang.String key)`

The key must be set before the listener is added.

**Parameters:**
- `key` (`java.lang.String`): The key of the option whose value modification
   triggers the listener notification.

**Returns:** `void`

### `getKey()`

**Returns:** `java.lang.String`

