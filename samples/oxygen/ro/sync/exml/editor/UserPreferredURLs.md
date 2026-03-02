# Class: `UserPreferredURLs`

**Package:** [`ro.sync.exml.editor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.editor.UserPreferredURLs`

**Implements:** `ro.sync.options.PersistentObject`

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `keys`

**Type:** `ro.sync.options.SerializableList`

### `urlLists`

**Type:** `ro.sync.options.SerializableList`

### `MAX_URLS_IN_LIST`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `checkValid()`

**Returns:** `void`

### `addURL(java.lang.String arg0, java.lang.String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `void`

### `removeURL(java.lang.String arg0, java.lang.String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `void`

### `clearURLs(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getURLs(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.lang.String[]`

### `getNotPersistentFieldNames()`

**Returns:** `java.lang.String[]`

### `clone()`

**Returns:** `java.lang.Object`

