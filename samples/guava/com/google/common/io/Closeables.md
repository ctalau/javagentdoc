# Class: `Closeables`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.Closeables`

## Description

Utility methods for working with {@link Closeable} objects.
@author Michael Lancaster
@since 1.0

## Fields

### `logger`

**Type:** [`java.util.logging.Logger`](../../../../java/util/logging/Logger.md)

## Constructors

### `<init>()`

## Methods

### `close([`java.io.Closeable`](../../../../java/io/Closeable.md) closeable, `boolean` swallowIOException)`

**Returns:** `void`

Closes a {@link Closeable}, with control over whether an {@code IOException} may be thrown.
 This is primarily useful in a finally block, where a thrown exception needs to be logged but
 not propagated (otherwise the original exception will be lost).

 <p>If {@code swallowIOException} is true then we never throw {@code IOException} but merely log
 it.

 <p>Example:

 <pre>{@code
 public void useStreamNicely() throws IOException {
   SomeStream stream = new SomeStream("foo");
   boolean threw = true;
   try {
     // ... code which does something with the stream ...
     threw = false;
   } finally {
     // If an exception occurs, rethrow it only if threw==false:
     Closeables.close(stream, threw);
   }
 }
 }</pre>
@param closeable the {@code Closeable} object to be closed, or null, in which case this method
     does nothing
@param swallowIOException if true, don't propagate IO exceptions thrown by the {@code close}
     methods
@throws IOException if {@code swallowIOException} is false and {@code close} throws an {@code
     IOException}.

### `closeQuietly([`java.io.InputStream`](../../../../java/io/InputStream.md) inputStream)`

**Returns:** `void`

Closes the given {@link InputStream}, logging any {@code IOException} that's thrown rather than
 propagating it.

 <p>While it's not safe in the general case to ignore exceptions that are thrown when closing an
 I/O resource, it should generally be safe in the case of a resource that's being used only for
 reading, such as an {@code InputStream}. Unlike with writable resources, there's no chance that
 a failure that occurs when closing the stream indicates a meaningful problem such as a failure
 to flush all bytes to the underlying resource.
@param inputStream the input stream to be closed, or {@code null} in which case this method
     does nothing
@since 17.0

### `closeQuietly([`java.io.Reader`](../../../../java/io/Reader.md) reader)`

**Returns:** `void`

Closes the given {@link Reader}, logging any {@code IOException} that's thrown rather than
 propagating it.

 <p>While it's not safe in the general case to ignore exceptions that are thrown when closing an
 I/O resource, it should generally be safe in the case of a resource that's being used only for
 reading, such as a {@code Reader}. Unlike with writable resources, there's no chance that a
 failure that occurs when closing the reader indicates a meaningful problem such as a failure to
 flush all bytes to the underlying resource.
@param reader the reader to be closed, or {@code null} in which case this method does nothing
@since 17.0

