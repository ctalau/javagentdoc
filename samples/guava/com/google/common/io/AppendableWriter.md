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

### `<init>(Appendable target)`

**Parameters:**
- `target` (`java.lang.Appendable`): target to which to append output

## Methods

### `write(char[] cbuf, int off, int len)`

**Parameters:**
- `cbuf` (`char[]`)
- `off` (`int`)
- `len` (`int`)

**Returns:** `void`

### `write(int c)`

**Parameters:**
- `c` (`int`)

**Returns:** `void`

### `write(String str)`

**Parameters:**
- `str` (`java.lang.String`)

**Returns:** `void`

### `write(String str, int off, int len)`

**Parameters:**
- `str` (`java.lang.String`)
- `off` (`int`)
- `len` (`int`)

**Returns:** `void`

### `flush()`

**Returns:** `void`

### `close()`

**Returns:** `void`

### `append(char c)`

**Parameters:**
- `c` (`char`)

**Returns:** `java.io.Writer`

### `append(CharSequence charSeq)`

**Parameters:**
- `charSeq` (`java.lang.CharSequence`)

**Returns:** `java.io.Writer`

### `append(CharSequence charSeq, int start, int end)`

**Parameters:**
- `charSeq` (`java.lang.CharSequence`)
- `start` (`int`)
- `end` (`int`)

**Returns:** `java.io.Writer`

### `checkNotClosed()`

**Returns:** `void`

