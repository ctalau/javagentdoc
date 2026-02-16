# Class: `CharSequenceReader`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.CharSequenceReader`

**Extends:** `java.io.Reader`

## Description

A `Reader` that reads the characters in a `CharSequence`. Like `StringReader`,
 but works with any `CharSequence`.
**Author:** Colin Decker

## Fields

### `seq`

**Type:** `java.lang.CharSequence`

### `pos`

**Type:** `int`

### `mark`

**Type:** `int`

## Constructors

### `<init>(`java.lang.CharSequence` seq)`

Creates a new reader wrapping the given character sequence.

## Methods

### `checkOpen()`

**Returns:** `void`

### `hasRemaining()`

**Returns:** `boolean`

### `remaining()`

**Returns:** `int`

### `read(`java.nio.CharBuffer` target)`

**Returns:** `int`

### `read()`

**Returns:** `int`

### `read(`char[]` cbuf, `int` off, `int` len)`

**Returns:** `int`

### `skip(`long` n)`

**Returns:** `long`

### `ready()`

**Returns:** `boolean`

### `markSupported()`

**Returns:** `boolean`

### `mark(`int` readAheadLimit)`

**Returns:** `void`

### `reset()`

**Returns:** `void`

### `close()`

**Returns:** `void`

