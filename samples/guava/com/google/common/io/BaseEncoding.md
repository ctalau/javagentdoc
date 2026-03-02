# Class: `BaseEncoding`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.BaseEncoding`

## Description

This class includes several constants for encoding schemes specified by [RFC 4648](http://tools.ietf.org/html/rfc4648). For example, the expression:

 

```

 BaseEncoding.base32().encode("foo".getBytes(Charsets.US_ASCII))
 
```


 
returns the string "MZXW6===", and

 

```

 byte[] decoded = BaseEncoding.base32().decode("MZXW6===");
 
```


 
...returns the ASCII bytes of the string "foo".

 
By default, BaseEncoding's behavior is relatively strict and in accordance with RFC
 4648. Decoding rejects characters in the wrong case, though padding is optional. To modify
 encoding and decoding behavior, use configuration methods to obtain a new encoding with modified
 behavior:

 

```

 BaseEncoding.base16().lowerCase().decode("deadbeef");
 
```


 
Warning: BaseEncoding instances are immutable. Invoking a configuration method has no effect
 on the receiving instance; you must store and use the new encoding instance it returns, instead.

 

```

 // Do NOT do this
 BaseEncoding hex = BaseEncoding.base16();
 hex.lowerCase(); // does nothing!
 return hex.decode("deadbeef"); // throws an IllegalArgumentException
 
```


 
It is guaranteed that encoding.decode(encoding.encode(x)) is always equal to 
 x, but the reverse does not necessarily hold.

 
 Encodings
 
 Encoding
 Alphabet
 char:byte ratio
 Default padding
 Comments
 
 #base16()
 0-9 A-F
 2.00
 N/A
 Traditional hexadecimal. Defaults to upper case.
 
 #base32()
 A-Z 2-7
 1.60
 =
 Human-readable; no possibility of mixing up 0/O or 1/I. Defaults to upper case.
 
 #base32Hex()
 0-9 A-V
 1.60
 =
 "Numerical" base 32; extended from the traditional hex alphabet. Defaults to upper case.
 
 #base64()
 A-Z a-z 0-9 + /
 1.33
 =
 
 
 #base64Url()
 A-Z a-z 0-9 - _
 1.33
 =
 Safe to use as filenames, or to pass in URLs without escaping
 

 
All instances of this class are immutable, so they may be stored safely as static constants.

## Fields

### `BASE64`

**Type:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

### `BASE64_URL`

**Type:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

### `BASE32`

**Type:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

### `BASE32_HEX`

**Type:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

### `BASE16`

**Type:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

## Constructors

### `<init>()`

## Methods

### `encode(byte[] bytes)`

**Returns:** `java.lang.String`

**Parameters:**
- `bytes` (`byte[]`)

### `encode(byte[] bytes, int off, int len)`

**Returns:** `java.lang.String`

**Parameters:**
- `bytes` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

### `encodingStream(java.io.Writer writer)`

**Returns:** `java.io.OutputStream`

When the returned OutputStream is closed, so is the backing 
 Writer.

**Parameters:**
- `writer` (`java.io.Writer`)

### `encodingSink(com.google.common.io.CharSink encodedSink)`

**Returns:** [`com.google.common.io.ByteSink`](./ByteSink.md)

**Parameters:**
- `encodedSink` ([`com.google.common.io.CharSink`](./CharSink.md))

### `extract(byte[] result, int length)`

**Returns:** `byte[]`

**Parameters:**
- `result` (`byte[]`)
- `length` (`int`)

### `canDecode(java.lang.CharSequence chars)`

**Returns:** `boolean`

**Parameters:**
- `chars` (`java.lang.CharSequence`)

### `decode(java.lang.CharSequence chars)`

**Returns:** `byte[]`

This is the
 inverse operation to #encode(byte[]).

**Parameters:**
- `chars` (`java.lang.CharSequence`)

### `decodeChecked(java.lang.CharSequence chars)`

**Returns:** `byte[]`

This is the
 inverse operation to #encode(byte[]).

**Parameters:**
- `chars` (`java.lang.CharSequence`)

### `decodingStream(java.io.Reader reader)`

**Returns:** `java.io.InputStream`

The returned stream throws a DecodingException upon decoding-specific errors.

**Parameters:**
- `reader` (`java.io.Reader`)

### `decodingSource(com.google.common.io.CharSource encodedSource)`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

**Parameters:**
- `encodedSource` ([`com.google.common.io.CharSource`](./CharSource.md))

### `maxEncodedSize(int bytes)`

**Returns:** `int`

**Parameters:**
- `bytes` (`int`)

### `encodeTo(java.lang.Appendable target, byte[] bytes, int off, int len)`

**Returns:** `void`

**Parameters:**
- `target` (`java.lang.Appendable`)
- `bytes` (`byte[]`)
- `off` (`int`)
- `len` (`int`)

### `maxDecodedSize(int chars)`

**Returns:** `int`

**Parameters:**
- `chars` (`int`)

### `decodeTo(byte[] target, java.lang.CharSequence chars)`

**Returns:** `int`

**Parameters:**
- `target` (`byte[]`)
- `chars` (`java.lang.CharSequence`)

### `trimTrailingPadding(java.lang.CharSequence chars)`

**Returns:** `java.lang.CharSequence`

**Parameters:**
- `chars` (`java.lang.CharSequence`)

### `omitPadding()`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

### `withPadChar(char padChar)`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

**Parameters:**
- `padChar` (`char`)

### `withSeparator(java.lang.String separator, int n)`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

Any occurrences of any characters that occur in the separator
 are skipped over in decoding.

**Parameters:**
- `separator` (`java.lang.String`)
- `n` (`int`)

### `upperCase()`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

Padding and separator characters remain in their original case.

### `lowerCase()`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

Padding and separator characters remain in their original case.

### `ignoreCase()`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

### `base64()`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

(This is the same as the base 64 encoding from [RFC 3548](http://tools.ietf.org/html/rfc3548#section-3).)

 
The character '=' is used for padding, but can be omitted or replaced.

 
No line feeds are added by default, as per [RFC 4648 section 3.1](http://tools.ietf.org/html/rfc4648#section-3.1), Line Feeds in
 Encoded Data. Line feeds may be added using #withSeparator(String, int).

### `base64Url()`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

The character '=' is used for padding, but can be omitted or replaced.

 
No line feeds are added by default, as per [RFC 4648 section 3.1](http://tools.ietf.org/html/rfc4648#section-3.1), Line Feeds in
 Encoded Data. Line feeds may be added using #withSeparator(String, int).

### `base32()`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

(This is the same as the base 32 encoding from [RFC 3548](http://tools.ietf.org/html/rfc3548#section-5).)

 
The character '=' is used for padding, but can be omitted or replaced.

 
No line feeds are added by default, as per [RFC 4648 section 3.1](http://tools.ietf.org/html/rfc4648#section-3.1), Line Feeds in
 Encoded Data. Line feeds may be added using #withSeparator(String, int).

### `base32Hex()`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

There is no corresponding encoding in RFC 3548.

 
The character '=' is used for padding, but can be omitted or replaced.

 
No line feeds are added by default, as per [RFC 4648 section 3.1](http://tools.ietf.org/html/rfc4648#section-3.1), Line Feeds in
 Encoded Data. Line feeds may be added using #withSeparator(String, int).

### `base16()`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

(This is the same as the base 16 encoding from [RFC 3548](http://tools.ietf.org/html/rfc3548#section-6).) This is commonly known as
 "hexadecimal" format.

 
No padding is necessary in base 16, so #withPadChar(char) and #omitPadding()
 have no effect.

 
No line feeds are added by default, as per [RFC 4648 section 3.1](http://tools.ietf.org/html/rfc4648#section-3.1), Line Feeds in
 Encoded Data. Line feeds may be added using #withSeparator(String, int).

### `ignoringReader(java.io.Reader delegate, java.lang.String toIgnore)`

**Returns:** `java.io.Reader`

**Parameters:**
- `delegate` (`java.io.Reader`)
- `toIgnore` (`java.lang.String`)

### `separatingAppendable(java.lang.Appendable delegate, java.lang.String separator, int afterEveryChars)`

**Returns:** `java.lang.Appendable`

**Parameters:**
- `delegate` (`java.lang.Appendable`)
- `separator` (`java.lang.String`)
- `afterEveryChars` (`int`)

### `separatingWriter(java.io.Writer delegate, java.lang.String separator, int afterEveryChars)`

**Returns:** `java.io.Writer`

**Parameters:**
- `delegate` (`java.io.Writer`)
- `separator` (`java.lang.String`)
- `afterEveryChars` (`int`)

