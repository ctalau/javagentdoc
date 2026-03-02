# Class: `Resources`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.Resources`

## Description

Note that even though these
 methods use URL parameters, they are usually not appropriate for HTTP or other
 non-classpath resources.

## Constructors

### `<init>()`

## Methods

### `asByteSource(URL url)`

**Parameters:**
- `url` (`java.net.URL`)

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

### `asCharSource(URL url, Charset charset)`

**Parameters:**
- `url` (`java.net.URL`)
- `charset` (`java.nio.charset.Charset`)

**Returns:** [`com.google.common.io.CharSource`](./CharSource.md)

### `toByteArray(URL url)`

**Parameters:**
- `url` (`java.net.URL`): the URL to read from

**Returns:** `byte[]`

### `toString(URL url, Charset charset)`

**Parameters:**
- `url` (`java.net.URL`): the URL to read from
- `charset` (`java.nio.charset.Charset`): the charset used to decode the input stream; see Charsets for helpful
       predefined constants

**Returns:** `java.lang.String`

### `readLines(URL url, Charset charset, LineProcessor<T> callback)`

**Parameters:**
- `url` (`java.net.URL`): the URL to read from
- `charset` (`java.nio.charset.Charset`): the charset used to decode the input stream; see Charsets for helpful
       predefined constants
- `callback` ([`com.google.common.io.LineProcessor<T>`](./LineProcessor.md)): the LineProcessor to use to handle the lines

**Returns:** `T`

### `readLines(URL url, Charset charset)`

The lines do not include line-termination characters, but do
 include other leading and trailing whitespace.

 
This method returns a mutable List. For an ImmutableList, use 
 Resources.asCharSource(url, charset).readLines().

**Parameters:**
- `url` (`java.net.URL`): the URL to read from
- `charset` (`java.nio.charset.Charset`): the charset used to decode the input stream; see Charsets for helpful
       predefined constants

**Returns:** `java.util.List<java.lang.String>`

### `copy(URL from, OutputStream to)`

**Parameters:**
- `from` (`java.net.URL`): the URL to read from
- `to` (`java.io.OutputStream`): the output stream

**Returns:** `void`

### `getResource(String resourceName)`

In simple environments, the
 context class loader will find resources from the class path. In environments where different
 threads can have different class loaders, for example app servers, the context class loader
 will typically have been set to an appropriate loader for the current thread.

 
In the unusual case where the context class loader is null, the class loader that loaded
 this class (Resources) will be used instead.

**Parameters:**
- `resourceName` (`java.lang.String`)

**Returns:** `java.net.URL`

### `getResource(Class<?> contextClass, String resourceName)`

**Parameters:**
- `contextClass` (`java.lang.Class<?>`)
- `resourceName` (`java.lang.String`)

**Returns:** `java.net.URL`

