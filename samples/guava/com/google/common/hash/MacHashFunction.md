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

### `<init>(java.lang.String algorithmName, java.security.Key key, java.lang.String toString)`

**Parameters:**
- `algorithmName` (`java.lang.String`)
- `key` (`java.security.Key`)
- `toString` (`java.lang.String`)

## Methods

### `bits()`

**Returns:** `int`

### `supportsClone(javax.crypto.Mac mac)`

**Returns:** `boolean`

**Parameters:**
- `mac` (`javax.crypto.Mac`)

### `getMac(java.lang.String algorithmName, java.security.Key key)`

**Returns:** `javax.crypto.Mac`

**Parameters:**
- `algorithmName` (`java.lang.String`)
- `key` (`java.security.Key`)

### `newHasher()`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `toString()`

**Returns:** `java.lang.String`

