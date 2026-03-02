# Class: `Flushables`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.Flushables`

## Description

## Fields

### `logger`

**Type:** `java.util.logging.Logger`

## Constructors

### `<init>()`

## Methods

### `flush(java.io.Flushable flushable, boolean swallowIOException)`

**Returns:** `void`

If swallowIOException is true, then we don't rethrow IOException, but merely
 log it.

**Parameters:**
- `flushable` (`java.io.Flushable`): the Flushable object to be flushed.
- `swallowIOException` (`boolean`): if true, don't propagate IO exceptions thrown by the flush
     method

### `flushQuietly(java.io.Flushable flushable)`

**Returns:** `void`

**Parameters:**
- `flushable` (`java.io.Flushable`): the Flushable object to be flushed.

