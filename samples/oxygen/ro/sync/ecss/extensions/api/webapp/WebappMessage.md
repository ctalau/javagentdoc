# Class: `WebappMessage`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.WebappMessage`

## Description

## Fields

### `MESSAGE_TYPE_RESULT_VALUE`

**Type:** `int`

### `MESSAGE_TYPE_SYSTEM_APPLICATION`

**Type:** `int`

### `MESSAGE_TYPE_INFO`

**Type:** `int`

### `MESSAGE_TYPE_WARN`

**Type:** `int`

### `MESSAGE_TYPE_ERROR`

**Type:** `int`

### `MESSAGE_TYPE_CUSTOM`

**Type:** `int`

All message types larger than this one are not handled by default by the 
 webapp, but passed to the plugin code handlers.

### `isUserGenerated`

**Type:** `boolean`

`false` is the message should be logged in console.

### `type`

**Type:** `int`

### `title`

**Type:** `java.lang.String`

### `message`

**Type:** `java.lang.String`

## Constructors

### `<init>(`int` type, `java.lang.String` title, `java.lang.String` message, `boolean` isUserGenerated)`

## Methods

### `getMessage()`

**Returns:** `java.lang.String`

### `getTitle()`

**Returns:** `java.lang.String`

### `getType()`

**Returns:** `int`

### `isUserGenerated()`

**Returns:** `boolean`

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

