# Class: `MultiReader`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.MultiReader`

**Extends:** `java.io.Reader`

## Description

## Fields

### `it`

**Type:** `java.util.Iterator<? extends com.google.common.io.CharSource>`

### `current`

**Type:** `java.io.Reader`

## Constructors

### `<init>(Iterator<? extends CharSource> readers)`

**Parameters:**
- `readers` (`java.util.Iterator<? extends com.google.common.io.CharSource>`)

## Methods

### `advance()`

**Returns:** `void`

### `read(char[] cbuf, int off, int len)`

**Parameters:**
- `cbuf` (`char[]`)
- `off` (`int`)
- `len` (`int`)

**Returns:** `int`

### `skip(long n)`

**Parameters:**
- `n` (`long`)

**Returns:** `long`

### `ready()`

**Returns:** `boolean`

### `close()`

**Returns:** `void`

