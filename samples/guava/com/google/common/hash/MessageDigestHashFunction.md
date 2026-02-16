# Class: `MessageDigestHashFunction`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.MessageDigestHashFunction`

**Extends:** [`com.google.common.hash.AbstractHashFunction`](./AbstractHashFunction.md)

**Implements:** `java.io.Serializable`

## Description

`HashFunction` adapter for `MessageDigest` instances.
**Author:** Kevin Bourrillion
**Author:** Dimitris Andreou

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

### `<init>(`java.lang.String` algorithmName, `java.lang.String` toString)`

### `<init>(`java.lang.String` algorithmName, `int` bytes, `java.lang.String` toString)`

## Methods

### `supportsClone(`java.security.MessageDigest` digest)`

**Returns:** `boolean`

### `bits()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `getMessageDigest(`java.lang.String` algorithmName)`

**Returns:** `java.security.MessageDigest`

### `newHasher()`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

