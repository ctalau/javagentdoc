# Class: `CharSequenceReader`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.CharSequenceReader`

**Extends:** `java.io.Reader`

## Description

Like StringReader,
 but works with any CharSequence.

## Fields

### `seq`

**Type:** `java.lang.CharSequence`

### `pos`

**Type:** `int`

### `mark`

**Type:** `int`

## Constructors

### `<init>(java.lang.CharSequence seq)`

**Parameters:**
- `seq` (`java.lang.CharSequence`)

## Methods

### `checkOpen()`

**Returns:** `void`

### `hasRemaining()`

**Returns:** `boolean`

### `remaining()`

**Returns:** `int`

### `read(java.nio.CharBuffer target)`

**Returns:** `int`

**Parameters:**
- `target` (`java.nio.CharBuffer`)

### `read()`

**Returns:** `int`

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

### `markSupported()`

**Returns:** `boolean`

### `mark(int readAheadLimit)`

**Returns:** `void`

**Parameters:**
- `readAheadLimit` (`int`)

### `reset()`

**Returns:** `void`

### `close()`

**Returns:** `void`

