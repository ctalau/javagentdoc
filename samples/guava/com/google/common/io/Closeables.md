# Class: `Closeables`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.Closeables`

## Description

## Fields

### `logger`

**Type:** `java.util.logging.Logger`

## Constructors

### `<init>()`

## Methods

### `close(java.io.Closeable closeable, boolean swallowIOException)`

**Returns:** `void`

This is primarily useful in a finally block, where a thrown exception needs to be logged but
 not propagated (otherwise the original exception will be lost).

 
If swallowIOException is true then we never throw IOException but merely log
 it.

 
Example:

 

```

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
 
```

**Parameters:**
- `closeable` (`java.io.Closeable`): the Closeable object to be closed, or null, in which case this method
     does nothing
- `swallowIOException` (`boolean`): if true, don't propagate IO exceptions thrown by the close
     methods

### `closeQuietly(java.io.InputStream inputStream)`

**Returns:** `void`

While it's not safe in the general case to ignore exceptions that are thrown when closing an
 I/O resource, it should generally be safe in the case of a resource that's being used only for
 reading, such as an InputStream. Unlike with writable resources, there's no chance that
 a failure that occurs when closing the stream indicates a meaningful problem such as a failure
 to flush all bytes to the underlying resource.

**Parameters:**
- `inputStream` (`java.io.InputStream`): the input stream to be closed, or null in which case this method
     does nothing

### `closeQuietly(java.io.Reader reader)`

**Returns:** `void`

While it's not safe in the general case to ignore exceptions that are thrown when closing an
 I/O resource, it should generally be safe in the case of a resource that's being used only for
 reading, such as a Reader. Unlike with writable resources, there's no chance that a
 failure that occurs when closing the reader indicates a meaningful problem such as a failure to
 flush all bytes to the underlying resource.

**Parameters:**
- `reader` (`java.io.Reader`): the reader to be closed, or null in which case this method does nothing

