# Class: `MessageDigestHashFunction`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.MessageDigestHashFunction`

**Extends:** [`com.google.common.hash.AbstractHashFunction`](./AbstractHashFunction.md)

**Implements:** `java.io.Serializable`

## Description

## Fields

### `prototype`

**Type:** `java.security.MessageDigest`

### `bytes`

**Type:** `int`

### `supportsClone`

**Type:** `boolean`

### `toString`

**Type:** `java.lang.String`

## Constructors

### `<init>(java.lang.String algorithmName, java.lang.String toString)`

**Parameters:**
- `algorithmName` (`java.lang.String`)
- `toString` (`java.lang.String`)

### `<init>(java.lang.String algorithmName, int bytes, java.lang.String toString)`

**Parameters:**
- `algorithmName` (`java.lang.String`)
- `bytes` (`int`)
- `toString` (`java.lang.String`)

## Methods

### `supportsClone(java.security.MessageDigest digest)`

**Returns:** `boolean`

**Parameters:**
- `digest` (`java.security.MessageDigest`)

### `bits()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `getMessageDigest(java.lang.String algorithmName)`

**Returns:** `java.security.MessageDigest`

**Parameters:**
- `algorithmName` (`java.lang.String`)

### `newHasher()`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

