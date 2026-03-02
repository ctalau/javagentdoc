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

### `<init>(InputStream in)`

**Parameters:**
- `in` (`java.io.InputStream`): the input stream to be wrapped

## Methods

### `getCount()`

**Returns:** `long`

### `read()`

**Returns:** `int`

### `read(byte[] b, int off, int len)`

**Parameters:**
- `b` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

**Returns:** `int`

### `skip(long n)`

**Parameters:**
- `n` (`long`)

**Returns:** `long`

### `mark(int readlimit)`

**Parameters:**
- `readlimit` (`int`)

**Returns:** `void`

### `reset()`

**Returns:** `void`

