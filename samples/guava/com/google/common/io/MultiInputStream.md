# Class: `MultiInputStream`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.MultiInputStream`

**Extends:** `java.io.InputStream`

## Description

At most one stream will be open at
 a time.

## Fields

### `it`

**Type:** `java.util.Iterator<? extends com.google.common.io.ByteSource>`

### `in`

**Type:** `java.io.InputStream`

## Constructors

### `<init>(java.util.Iterator<? extends com.google.common.io.ByteSource> it)`

**Parameters:**
- `it` (`java.util.Iterator<? extends com.google.common.io.ByteSource>`): an iterator of I/O suppliers that will provide each substream

## Methods

### `close()`

**Returns:** `void`

### `advance()`

**Returns:** `void`

### `available()`

**Returns:** `int`

### `markSupported()`

**Returns:** `boolean`

### `read()`

**Returns:** `int`

### `read(byte[] b, int off, int len)`

**Returns:** `int`

**Parameters:**
- `b` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

### `skip(long n)`

**Returns:** `long`

**Parameters:**
- `n` (`long`)

