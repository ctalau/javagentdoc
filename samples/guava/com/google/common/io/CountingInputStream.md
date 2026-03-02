# Class: `CountingInputStream`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.CountingInputStream`

**Extends:** `java.io.FilterInputStream`

## Description

## Fields

### `count`

**Type:** `long`

### `mark`

**Type:** `long`

## Constructors

### `<init>(java.io.InputStream in)`

**Parameters:**
- `in` (`java.io.InputStream`): the input stream to be wrapped

## Methods

### `getCount()`

**Returns:** `long`

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

### `mark(int readlimit)`

**Returns:** `void`

**Parameters:**
- `readlimit` (`int`)

### `reset()`

**Returns:** `void`

