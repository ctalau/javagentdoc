# Class: `Flushables`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.Flushables`

## Description

Utility methods for working with {@link Flushable} objects.
@author Michael Lancaster
@since 1.0

## Fields

### `logger`

**Type:** [`java.util.logging.Logger`](../../../../java/util/logging/Logger.md)

## Constructors

### `<init>()`

## Methods

### `flush([`java.io.Flushable`](../../../../java/io/Flushable.md) flushable, `boolean` swallowIOException)`

**Returns:** `void`

Flush a {@link Flushable}, with control over whether an {@code IOException} may be thrown.

 <p>If {@code swallowIOException} is true, then we don't rethrow {@code IOException}, but merely
 log it.
@param flushable the {@code Flushable} object to be flushed.
@param swallowIOException if true, don't propagate IO exceptions thrown by the {@code flush}
     method
@throws IOException if {@code swallowIOException} is false and {@link Flushable#flush} throws
     an {@code IOException}.
@see Closeables#close

### `flushQuietly([`java.io.Flushable`](../../../../java/io/Flushable.md) flushable)`

**Returns:** `void`

Equivalent to calling {@code flush(flushable, true)}, but with no {@code IOException} in the
 signature.
@param flushable the {@code Flushable} object to be flushed.

