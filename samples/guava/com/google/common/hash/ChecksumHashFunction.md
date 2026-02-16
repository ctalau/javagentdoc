# Class: `ChecksumHashFunction`

**Package:** [`com.google.common.hash`](README.md)

**Fully Qualified Name:** `com.google.common.hash.ChecksumHashFunction`

**Extends:** [`com.google.common.hash.AbstractHashFunction`](./AbstractHashFunction.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Description

{@link HashFunction} adapter for {@link Checksum} instances.
@author Colin Decker

## Fields

### `checksumSupplier`

**Type:** [`com.google.common.hash.ImmutableSupplier<? extends java.util.zip.Checksum>`](./ImmutableSupplier.md)

### `bits`

**Type:** `int`

### `toString`

**Type:** `java.lang.String`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`com.google.common.hash.ImmutableSupplier<? extends java.util.zip.Checksum>`](./ImmutableSupplier.md) checksumSupplier, `int` bits, `java.lang.String` toString)`

## Methods

### `bits()`

**Returns:** `int`

### `newHasher()`

**Returns:** [`com.google.common.hash.Hasher`](./Hasher.md)

### `toString()`

**Returns:** `java.lang.String`

