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

### `<init>(CharSequence seq)`

**Parameters:**
- `seq` (`java.lang.CharSequence`)

## Methods

### `checkOpen()`

**Returns:** `void`

### `hasRemaining()`

**Returns:** `boolean`

### `remaining()`

**Returns:** `int`

### `read(CharBuffer target)`

**Parameters:**
- `target` (`java.nio.CharBuffer`)

**Returns:** `int`

### `read()`

**Returns:** `int`

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

### `markSupported()`

**Returns:** `boolean`

### `mark(int readAheadLimit)`

**Parameters:**
- `readAheadLimit` (`int`)

**Returns:** `void`

### `reset()`

**Returns:** `void`

### `close()`

**Returns:** `void`

