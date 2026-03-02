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

### `flush(Flushable flushable, boolean swallowIOException)`

If swallowIOException is true, then we don't rethrow IOException, but merely
 log it.

**Parameters:**
- `flushable` (`java.io.Flushable`): the Flushable object to be flushed.
- `swallowIOException` (`boolean`): if true, don't propagate IO exceptions thrown by the flush
       method

**Returns:** `void`

### `flushQuietly(Flushable flushable)`

**Parameters:**
- `flushable` (`java.io.Flushable`): the Flushable object to be flushed.

**Returns:** `void`

