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

### `<init>(String algorithmName, String toString)`

**Parameters:**
- `algorithmName` (`java.lang.String`)
- `toString` (`java.lang.String`)

### `<init>(String algorithmName, int bytes, String toString)`

**Parameters:**
- `algorithmName` (`java.lang.String`)
- `bytes` (`int`)
- `toString` (`java.lang.String`)

## Methods

### `supportsClone(MessageDigest digest)`

**Parameters:**
- `digest` (`java.security.MessageDigest`)

**Returns:** `boolean`

### `bits()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `getMessageDigest(String algorithmName)`

**Parameters:**
- `algorithmName` (`java.lang.String`)

**Returns:** `java.security.MessageDigest`

### `newHasher()`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(ObjectInputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

**Returns:** `void`

