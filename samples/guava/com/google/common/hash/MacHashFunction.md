# Class: `MacHashFunction`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.MacHashFunction`

**Extends:** [`com.google.common.hash.AbstractHashFunction`](./AbstractHashFunction.md)

## Description

{@link HashFunction} adapter for {@link Mac} instances.
@author Kurt Alfred Kluever

## Fields

### `prototype`

**Type:** [`javax.crypto.Mac`](../../../../javax/crypto/Mac.md)

### `key`

**Type:** [`java.security.Key`](../../../../java/security/Key.md)

### `toString`

**Type:** `java.lang.String`

### `bits`

**Type:** `int`

### `supportsClone`

**Type:** `boolean`

## Constructors

### `<init>(`java.lang.String` algorithmName, [`java.security.Key`](../../../../java/security/Key.md) key, `java.lang.String` toString)`

## Methods

### `bits()`

**Returns:** `int`

### `supportsClone([`javax.crypto.Mac`](../../../../javax/crypto/Mac.md) mac)`

**Returns:** `boolean`

### `getMac(`java.lang.String` algorithmName, [`java.security.Key`](../../../../java/security/Key.md) key)`

**Returns:** [`javax.crypto.Mac`](../../../../javax/crypto/Mac.md)

### `newHasher()`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `toString()`

**Returns:** `java.lang.String`

