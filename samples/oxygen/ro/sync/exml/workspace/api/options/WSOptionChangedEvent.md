# Class: `WSOptionChangedEvent`

**Package:** [`ro.sync.exml.workspace.api.options`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.options.WSOptionChangedEvent`

## Description

## Fields

### `optionKey`

**Type:** `java.lang.String`

### `oldValue`

**Type:** `java.lang.Object`

### `newValue`

**Type:** `java.lang.Object`

## Constructors

### `<init>(java.lang.String optionKey, java.lang.String oldValue, java.lang.String newValue)`

**Parameters:**
- `optionKey` (`java.lang.String`): The identification key of the option
 whose value modification generated this event.
- `oldValue` (`java.lang.String`): The old value of the option.
- `newValue` (`java.lang.String`): The new value of the option.
 
 When the entire set of Oxygen preferences is reset by the end user, the reported old value will be equal to the new value as
 the global reset no longer retains the state of the value before the reset...

### `<init>(java.lang.String optionKey, java.lang.Object oldValue, java.lang.Object newValue)`

**Parameters:**
- `optionKey` (`java.lang.String`): The identification key of the option
 whose value modification generated this event.
- `oldValue` (`java.lang.Object`): The old value of the option.
- `newValue` (`java.lang.Object`): The new value of the option.
 
 When the entire set of Oxygen preferences is reset by the end user, the reported old value will be equal to the new value as
 the global reset no longer retains the state of the value before the reset...

## Methods

### `getOptionKey()`

**Returns:** `java.lang.String`

### `getOldValue()`

**Returns:** `java.lang.String`

### `getOldValueObject()`

**Returns:** `java.lang.Object`

### `getNewValue()`

**Returns:** `java.lang.String`

### `getNewValueObject()`

**Returns:** `java.lang.Object`

