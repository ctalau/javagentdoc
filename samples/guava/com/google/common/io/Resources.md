# Class: `Resources`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.Resources`

## Description

Provides utility methods for working with resources in the classpath. Note that even though these
 methods use {@link URL} parameters, they are usually not appropriate for HTTP or other
 non-classpath resources.
@author Chris Nokleberg
@author Ben Yu
@author Colin Decker
@since 1.0

## Constructors

### `<init>()`

## Methods

### `asByteSource([`java.net.URL`](../../../../java/net/URL.md) url)`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

Returns a {@link ByteSource} that reads from the given URL.
@since 14.0

### `asCharSource([`java.net.URL`](../../../../java/net/URL.md) url, [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset)`

**Returns:** [`com.google.common.io.CharSource`](./CharSource.md)

Returns a {@link CharSource} that reads from the given URL using the given character set.
@since 14.0

### `toByteArray([`java.net.URL`](../../../../java/net/URL.md) url)`

**Returns:** `byte[]`

Reads all bytes from a URL into a byte array.
@param url the URL to read from
@return a byte array containing all the bytes from the URL
@throws IOException if an I/O error occurs

### `toString([`java.net.URL`](../../../../java/net/URL.md) url, [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset)`

**Returns:** `java.lang.String`

Reads all characters from a URL into a {@link String}, using the given character set.
@param url the URL to read from
@param charset the charset used to decode the input stream; see {@link Charsets} for helpful
     predefined constants
@return a string containing all the characters from the URL
@throws IOException if an I/O error occurs.

### `readLines([`java.net.URL`](../../../../java/net/URL.md) url, [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset, [`com.google.common.io.LineProcessor<T>`](./LineProcessor.md) callback)`

**Returns:** [`T`](T.md)

Streams lines from a URL, stopping when our callback returns false, or we have read all of the
 lines.
@param url the URL to read from
@param charset the charset used to decode the input stream; see {@link Charsets} for helpful
     predefined constants
@param callback the LineProcessor to use to handle the lines
@return the output of processing the lines
@throws IOException if an I/O error occurs

### `readLines([`java.net.URL`](../../../../java/net/URL.md) url, [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md) charset)`

**Returns:** [`java.util.List<java.lang.String>`](../../../../java/util/List.md)

Reads all of the lines from a URL. The lines do not include line-termination characters, but do
 include other leading and trailing whitespace.

 <p>This method returns a mutable {@code List}. For an {@code ImmutableList}, use {@code
 Resources.asCharSource(url, charset).readLines()}.
@param url the URL to read from
@param charset the charset used to decode the input stream; see {@link Charsets} for helpful
     predefined constants
@return a mutable {@link List} containing all the lines
@throws IOException if an I/O error occurs

### `copy([`java.net.URL`](../../../../java/net/URL.md) from, [`java.io.OutputStream`](../../../../java/io/OutputStream.md) to)`

**Returns:** `void`

Copies all bytes from a URL to an output stream.
@param from the URL to read from
@param to the output stream
@throws IOException if an I/O error occurs

### `getResource(`java.lang.String` resourceName)`

**Returns:** [`java.net.URL`](../../../../java/net/URL.md)

Returns a {@code URL} pointing to {@code resourceName} if the resource is found using the
 {@linkplain Thread#getContextClassLoader() context class loader}. In simple environments, the
 context class loader will find resources from the class path. In environments where different
 threads can have different class loaders, for example app servers, the context class loader
 will typically have been set to an appropriate loader for the current thread.

 <p>In the unusual case where the context class loader is null, the class loader that loaded
 this class ({@code Resources}) will be used instead.
@throws IllegalArgumentException if the resource is not found

### `getResource(`java.lang.Class<?>` contextClass, `java.lang.String` resourceName)`

**Returns:** [`java.net.URL`](../../../../java/net/URL.md)

Given a {@code resourceName} that is relative to {@code contextClass}, returns a {@code URL}
 pointing to the named resource.
@throws IllegalArgumentException if the resource is not found

