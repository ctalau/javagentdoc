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

### `<init>(java.util.Iterator<? extends com.google.common.io.CharSource> readers)`

**Parameters:**
- `readers` (`java.util.Iterator<? extends com.google.common.io.CharSource>`)

## Methods

### `advance()`

**Returns:** `void`

### `read(char[] cbuf, int off, int len)`

**Returns:** `int`

**Parameters:**
- `cbuf` (`char[]`)
- `off` (`int`)
- `len` (`int`)

### `skip(long n)`

**Returns:** `long`

**Parameters:**
- `n` (`long`)

### `ready()`

**Returns:** `boolean`

### `close()`

**Returns:** `void`

