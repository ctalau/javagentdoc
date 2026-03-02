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

### `asByteSource(java.net.URL url)`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

**Parameters:**
- `url` (`java.net.URL`)

### `asCharSource(java.net.URL url, java.nio.charset.Charset charset)`

**Returns:** [`com.google.common.io.CharSource`](./CharSource.md)

**Parameters:**
- `url` (`java.net.URL`)
- `charset` (`java.nio.charset.Charset`)

### `toByteArray(java.net.URL url)`

**Returns:** `byte[]`

**Parameters:**
- `url` (`java.net.URL`): the URL to read from

### `toString(java.net.URL url, java.nio.charset.Charset charset)`

**Returns:** `java.lang.String`

**Parameters:**
- `url` (`java.net.URL`): the URL to read from
- `charset` (`java.nio.charset.Charset`): the charset used to decode the input stream; see Charsets for helpful
     predefined constants

### `readLines(java.net.URL url, java.nio.charset.Charset charset, com.google.common.io.LineProcessor<T> callback)`

**Returns:** `T`

**Parameters:**
- `url` (`java.net.URL`): the URL to read from
- `charset` (`java.nio.charset.Charset`): the charset used to decode the input stream; see Charsets for helpful
     predefined constants
- `callback` ([`com.google.common.io.LineProcessor<T>`](./LineProcessor.md)): the LineProcessor to use to handle the lines

### `readLines(java.net.URL url, java.nio.charset.Charset charset)`

**Returns:** `java.util.List<java.lang.String>`

The lines do not include line-termination characters, but do
 include other leading and trailing whitespace.

 
This method returns a mutable List. For an ImmutableList, use 
 Resources.asCharSource(url, charset).readLines().

**Parameters:**
- `url` (`java.net.URL`): the URL to read from
- `charset` (`java.nio.charset.Charset`): the charset used to decode the input stream; see Charsets for helpful
     predefined constants

### `copy(java.net.URL from, java.io.OutputStream to)`

**Returns:** `void`

**Parameters:**
- `from` (`java.net.URL`): the URL to read from
- `to` (`java.io.OutputStream`): the output stream

### `getResource(java.lang.String resourceName)`

**Returns:** `java.net.URL`

In simple environments, the
 context class loader will find resources from the class path. In environments where different
 threads can have different class loaders, for example app servers, the context class loader
 will typically have been set to an appropriate loader for the current thread.

 
In the unusual case where the context class loader is null, the class loader that loaded
 this class (Resources) will be used instead.

**Parameters:**
- `resourceName` (`java.lang.String`)

### `getResource(java.lang.Class<?> contextClass, java.lang.String resourceName)`

**Returns:** `java.net.URL`

**Parameters:**
- `contextClass` (`java.lang.Class<?>`)
- `resourceName` (`java.lang.String`)

