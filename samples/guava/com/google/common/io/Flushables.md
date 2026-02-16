# Class: `Flushables`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.Flushables`

## Description

Utility methods for working with `Flushable` objects.
**Author:** Michael Lancaster
**Since:** 1.0

## Fields

### `logger`

**Type:** `java.util.logging.Logger`

## Constructors

### `<init>()`

## Methods

### `flush(`java.io.Flushable` flushable, `boolean` swallowIOException)`

**Returns:** `void`

Flush a `Flushable`, with control over whether an `IOException` may be thrown.

 <p>If `swallowIOException` is true, then we don't rethrow `IOException`, but merely
 log it.
@param flushable the `Flushable` object to be flushed.
@param swallowIOException if true, don't propagate IO exceptions thrown by the `flush`
     method
@throws IOException if `swallowIOException` is false and `Flushable.flush` throws
     an `IOException`.
**See:** Closeables#close

### `flushQuietly(`java.io.Flushable` flushable)`

**Returns:** `void`

Equivalent to calling `flush(flushable, true)`, but with no `IOException` in the
 signature.
@param flushable the `Flushable` object to be flushed.

