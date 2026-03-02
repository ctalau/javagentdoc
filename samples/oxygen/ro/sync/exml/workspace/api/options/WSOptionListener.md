# Class: `WSOptionListener`

**Package:** [`ro.sync.exml.workspace.api.options`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.options.WSOptionListener`

## Description

## Fields

### `key`

**Type:** `java.lang.String`

The listener will be notified about the value changes 
 of the option associated with this key.

## Constructors

### `<init>(String key)`

**Parameters:**
- `key` (`java.lang.String`): The key of the option whose value modification
   triggers the listener notification.

### `<init>()`

IMPORTANT, this default constructor is mostly intended to facilitate creating such objects from Javascript Rhino code.
 You must set a an option key using the "setKey" method after you are using this implicit constructor.

## Methods

### `optionValueChanged(WSOptionChangedEvent event)`

**Parameters:**
- `event` ([`ro.sync.exml.workspace.api.options.WSOptionChangedEvent`](./WSOptionChangedEvent.md)): An WSOptionChangedEvent which indicates that the value 
   of the associated option has been changed.

**Returns:** `void`

### `setKey(String key)`

The key must be set before the listener is added.

**Parameters:**
- `key` (`java.lang.String`): The key of the option whose value modification
   triggers the listener notification.

**Returns:** `void`

### `getKey()`

**Returns:** `java.lang.String`

