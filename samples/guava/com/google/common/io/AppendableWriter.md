# Class: `AppendableWriter`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.AppendableWriter`

**Extends:** `java.io.Writer`

## Description

If the target is Flushable
 or Closeable, flush()es and close()s will also be delegated to the target.

## Fields

### `target`

**Type:** `java.lang.Appendable`

### `closed`

**Type:** `boolean`

## Constructors

### `<init>(java.lang.Appendable target)`

**Parameters:**
- `target` (`java.lang.Appendable`): target to which to append output

## Methods

### `write(char[] cbuf, int off, int len)`

**Returns:** `void`

**Parameters:**
- `cbuf` (`char[]`)
- `off` (`int`)
- `len` (`int`)

### `write(int c)`

**Returns:** `void`

**Parameters:**
- `c` (`int`)

### `write(java.lang.String str)`

**Returns:** `void`

**Parameters:**
- `str` (`java.lang.String`)

### `write(java.lang.String str, int off, int len)`

**Returns:** `void`

**Parameters:**
- `str` (`java.lang.String`)
- `off` (`int`)
- `len` (`int`)

### `flush()`

**Returns:** `void`

### `close()`

**Returns:** `void`

### `append(char c)`

**Returns:** `java.io.Writer`

**Parameters:**
- `c` (`char`)

### `append(java.lang.CharSequence charSeq)`

**Returns:** `java.io.Writer`

**Parameters:**
- `charSeq` (`java.lang.CharSequence`)

### `append(java.lang.CharSequence charSeq, int start, int end)`

**Returns:** `java.io.Writer`

**Parameters:**
- `charSeq` (`java.lang.CharSequence`)
- `start` (`int`)
- `end` (`int`)

### `checkNotClosed()`

**Returns:** `void`

