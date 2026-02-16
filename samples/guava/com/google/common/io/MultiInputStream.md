# Class: `MultiInputStream`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.MultiInputStream`

**Extends:** [`java.io.InputStream`](../../../../java/io/InputStream.md)

## Description

An {@link InputStream} that concatenates multiple substreams. At most one stream will be open at
 a time.
@author Chris Nokleberg
@since 1.0

## Fields

### `it`

**Type:** [`java.util.Iterator<? extends com.google.common.io.ByteSource>`](../../../../java/util/Iterator.md)

### `in`

**Type:** [`java.io.InputStream`](../../../../java/io/InputStream.md)

## Constructors

### `<init>([`java.util.Iterator<? extends com.google.common.io.ByteSource>`](../../../../java/util/Iterator.md) it)`

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

