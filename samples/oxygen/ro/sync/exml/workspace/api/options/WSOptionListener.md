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

### `<init>(`java.lang.String` key)`

### `<init>()`

IMPORTANT, this default constructor is mostly intended to facilitate creating such objects from Javascript Rhino code.
 You must set a an option key using the "setKey" method after you are using this implicit constructor.

## Methods

### `optionValueChanged([`ro.sync.exml.workspace.api.options.WSOptionChangedEvent`](./WSOptionChangedEvent.md) event)`

**Returns:** `void`

### `setKey(`java.lang.String` key)`

**Returns:** `void`

The key must be set before the listener is added.

### `getKey()`

**Returns:** `java.lang.String`

