# Class: `MessageDigestHashFunction`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.MessageDigestHashFunction`

**Extends:** [`com.google.common.hash.AbstractHashFunction`](./AbstractHashFunction.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Description

{@link HashFunction} adapter for {@link MessageDigest} instances.
@author Kevin Bourrillion
@author Dimitris Andreou

## Fields

### `prototype`

**Type:** [`java.security.MessageDigest`](../../../../java/security/MessageDigest.md)

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

### `supportsClone([`java.security.MessageDigest`](../../../../java/security/MessageDigest.md) digest)`

**Returns:** `boolean`

### `bits()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `getMessageDigest(`java.lang.String` algorithmName)`

**Returns:** [`java.security.MessageDigest`](../../../../java/security/MessageDigest.md)

### `newHasher()`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

