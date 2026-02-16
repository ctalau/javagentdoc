# Class: `AppendableWriter`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.AppendableWriter`

**Extends:** `java.io.Writer`

## Description

Writer that places all output on an `Appendable` target. If the target is `Flushable`
 or `Closeable`, flush()es and close()s will also be delegated to the target.
**Author:** Alan Green
**Author:** Sebastian Kanthak
**Since:** 1.0

## Fields

### `target`

**Type:** `java.lang.Appendable`

### `closed`

**Type:** `boolean`

## Constructors

### `<init>(`java.lang.Appendable` target)`

Creates a new writer that appends everything it writes to `target`.
@param target target to which to append output

## Methods

### `write(`char[]` cbuf, `int` off, `int` len)`

**Returns:** `void`

### `write(`int` c)`

**Returns:** `void`

### `write(`java.lang.String` str)`

**Returns:** `void`

### `write(`java.lang.String` str, `int` off, `int` len)`

**Returns:** `void`

### `flush()`

**Returns:** `void`

### `close()`

**Returns:** `void`

### `append(`char` c)`

**Returns:** `java.io.Writer`

### `append(`java.lang.CharSequence` charSeq)`

**Returns:** `java.io.Writer`

### `append(`java.lang.CharSequence` charSeq, `int` start, `int` end)`

**Returns:** `java.io.Writer`

### `checkNotClosed()`

**Returns:** `void`

