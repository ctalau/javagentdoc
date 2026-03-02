# Class: `MacHashFunction`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.MacHashFunction`

**Extends:** [`com.google.common.hash.AbstractHashFunction`](./AbstractHashFunction.md)

## Description

## Fields

### `prototype`

**Type:** `javax.crypto.Mac`

### `key`

**Type:** `java.security.Key`

### `toString`

**Type:** `java.lang.String`

### `bits`

**Type:** `int`

### `supportsClone`

**Type:** `boolean`

## Constructors

### `<init>(String algorithmName, Key key, String toString)`

**Parameters:**
- `algorithmName` (`java.lang.String`)
- `key` (`java.security.Key`)
- `toString` (`java.lang.String`)

## Methods

### `bits()`

**Returns:** `int`

### `supportsClone(Mac mac)`

**Parameters:**
- `mac` (`javax.crypto.Mac`)

**Returns:** `boolean`

### `getMac(String algorithmName, Key key)`

**Parameters:**
- `algorithmName` (`java.lang.String`)
- `key` (`java.security.Key`)

**Returns:** `javax.crypto.Mac`

### `newHasher()`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `toString()`

**Returns:** `java.lang.String`

