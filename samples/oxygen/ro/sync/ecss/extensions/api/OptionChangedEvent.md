# Class: `OptionChangedEvent`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.OptionChangedEvent`

## Description

## Fields

### `optionKey`

**Type:** `java.lang.String`

### `oldValue`

**Type:** `java.lang.Object`

### `newValue`

**Type:** `java.lang.Object`

## Constructors

### `<init>(String optionKey, String oldValue, String newValue)`

This constructor is deprecated, you should use the #OptionChangedEvent(String, Object, Object) constructor instead.

**Parameters:**
- `optionKey` (`java.lang.String`): The identification key of the option
   whose value modification generated this event.
- `oldValue` (`java.lang.String`): The old value of the option.
- `newValue` (`java.lang.String`): The new value of the option.

### `<init>(String optionKey, Object oldValue, Object newValue)`

**Parameters:**
- `optionKey` (`java.lang.String`): The identification key of the option
   whose value modification generated this event.
- `oldValue` (`java.lang.Object`): The old value of the option.
- `newValue` (`java.lang.Object`): The new value of the option.

## Methods

### `getOptionKey()`

**Returns:** `java.lang.String`

### `getOldValue()`

This method is deprecated, you should use the #getOldObjectValue() method instead.

**Returns:** `java.lang.String`

### `getNewValue()`

This method is deprecated, you should use the #getNewObjectValue() method instead.

**Returns:** `java.lang.String`

### `getOldObjectValue()`

**Returns:** `java.lang.Object`

### `getNewObjectValue()`

**Returns:** `java.lang.Object`

