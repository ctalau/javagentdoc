# Class: `MultiInputStream`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.MultiInputStream`

**Extends:** `java.io.InputStream`

## Description

An `InputStream` that concatenates multiple substreams. At most one stream will be open at
 a time.
**Author:** Chris Nokleberg
**Since:** 1.0

## Fields

### `it`

**Type:** `java.util.Iterator<? extends com.google.common.io.ByteSource>`

### `in`

**Type:** `java.io.InputStream`

## Constructors

### `<init>(`java.util.Iterator<? extends com.google.common.io.ByteSource>` it)`

Creates a new instance.
@param it an iterator of I/O suppliers that will provide each substream

## Methods

### `close()`

**Returns:** `void`

### `advance()`

**Returns:** `void`

Closes the current input stream and opens the next one, if any.

### `available()`

**Returns:** `int`

### `markSupported()`

**Returns:** `boolean`

### `read()`

**Returns:** `int`

### `read(`byte[]` b, `int` off, `int` len)`

**Returns:** `int`

### `skip(`long` n)`

**Returns:** `long`

