# Class: `Crc32cHashFunction`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.Crc32cHashFunction`

**Extends:** [`com.google.common.hash.AbstractHashFunction`](./AbstractHashFunction.md)

## Description

This class generates a CRC32C checksum, defined by RFC 3720, Section 12.1. The generator
 polynomial for this checksum is `0x11EDC6F41`.
**Author:** Kurt Alfred Kluever

## Fields

### `CRC_32_C`

**Type:** [`com.google.common.hash.HashFunction`](./HashFunction.md)

## Constructors

### `<init>()`

## Methods

### `bits()`

**Returns:** `int`

### `newHasher()`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `toString()`

**Returns:** `java.lang.String`

