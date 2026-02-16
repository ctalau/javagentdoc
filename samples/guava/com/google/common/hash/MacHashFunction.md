# Class: `MacHashFunction`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.MacHashFunction`

**Extends:** [`com.google.common.hash.AbstractHashFunction`](./AbstractHashFunction.md)

## Description

`HashFunction` adapter for `Mac` instances.
**Author:** Kurt Alfred Kluever

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

### `<init>(`java.lang.String` algorithmName, `java.security.Key` key, `java.lang.String` toString)`

## Methods

### `bits()`

**Returns:** `int`

### `supportsClone(`javax.crypto.Mac` mac)`

**Returns:** `boolean`

### `getMac(`java.lang.String` algorithmName, `java.security.Key` key)`

**Returns:** `javax.crypto.Mac`

### `newHasher()`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `toString()`

**Returns:** `java.lang.String`

