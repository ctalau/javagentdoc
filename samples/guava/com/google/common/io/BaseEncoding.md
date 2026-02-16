# Class: `BaseEncoding`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.BaseEncoding`

## Description

A binary encoding scheme for reversibly translating between byte sequences and printable ASCII
 strings. This class includes several constants for encoding schemes specified by <a href="http://tools.ietf.org/html/rfc4648">RFC 4648</a>. For example, the expression:

 <pre>{@code
 BaseEncoding.base32().encode("foo".getBytes(Charsets.US_ASCII))
 }</pre>

 <p>returns the string {@code "MZXW6==="}, and

 <pre>{@code
 byte[] decoded = BaseEncoding.base32().decode("MZXW6===");
 }</pre>

 <p>...returns the ASCII bytes of the string {@code "foo"}.

 <p>By default, {@code BaseEncoding}'s behavior is relatively strict and in accordance with RFC
 4648. Decoding rejects characters in the wrong case, though padding is optional. To modify
 encoding and decoding behavior, use configuration methods to obtain a new encoding with modified
 behavior:

 <pre>{@code
 BaseEncoding.base16().lowerCase().decode("deadbeef");
 }</pre>

 <p>Warning: BaseEncoding instances are immutable. Invoking a configuration method has no effect
 on the receiving instance; you must store and use the new encoding instance it returns, instead.

 <pre>{@code
 // Do NOT do this
 BaseEncoding hex = BaseEncoding.base16();
 hex.lowerCase(); // does nothing!
 return hex.decode("deadbeef"); // throws an IllegalArgumentException
 }</pre>

 <p>It is guaranteed that {@code encoding.decode(encoding.encode(x))} is always equal to {@code
 x}, but the reverse does not necessarily hold.

 <table>
 <caption>Encodings</caption>
 <tr>
 <th>Encoding
 <th>Alphabet
 <th>{@code char:byte} ratio
 <th>Default padding
 <th>Comments
 <tr>
 <td>{@link #base16()}
 <td>0-9 A-F
 <td>2.00
 <td>N/A
 <td>Traditional hexadecimal. Defaults to upper case.
 <tr>
 <td>{@link #base32()}
 <td>A-Z 2-7
 <td>1.60
 <td>=
 <td>Human-readable; no possibility of mixing up 0/O or 1/I. Defaults to upper case.
 <tr>
 <td>{@link #base32Hex()}
 <td>0-9 A-V
 <td>1.60
 <td>=
 <td>"Numerical" base 32; extended from the traditional hex alphabet. Defaults to upper case.
 <tr>
 <td>{@link #base64()}
 <td>A-Z a-z 0-9 + /
 <td>1.33
 <td>=
 <td>
 <tr>
 <td>{@link #base64Url()}
 <td>A-Z a-z 0-9 - _
 <td>1.33
 <td>=
 <td>Safe to use as filenames, or to pass in URLs without escaping
 </table>

 <p>All instances of this class are immutable, so they may be stored safely as static constants.
@author Louis Wasserman
@since 14.0

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

### `encode(`byte[]` bytes)`

**Returns:** `java.lang.String`

Encodes the specified byte array, and returns the encoded {@code String}.

### `encode(`byte[]` bytes, `int` off, `int` len)`

**Returns:** `java.lang.String`

Encodes the specified range of the specified byte array, and returns the encoded {@code
 String}.

### `encodingStream([`java.io.Writer`](../../../../java/io/Writer.md) writer)`

**Returns:** [`java.io.OutputStream`](../../../../java/io/OutputStream.md)

Returns an {@code OutputStream} that encodes bytes using this encoding into the specified
 {@code Writer}. When the returned {@code OutputStream} is closed, so is the backing {@code
 Writer}.

### `encodingSink([`com.google.common.io.CharSink`](./CharSink.md) encodedSink)`

**Returns:** [`com.google.common.io.ByteSink`](./ByteSink.md)

Returns a {@code ByteSink} that writes base-encoded bytes to the specified {@code CharSink}.

### `extract(`byte[]` result, `int` length)`

**Returns:** `byte[]`

### `canDecode(`java.lang.CharSequence` chars)`

**Returns:** `boolean`

Determines whether the specified character sequence is a valid encoded string according to this
 encoding.
@since 20.0

### `decode(`java.lang.CharSequence` chars)`

**Returns:** `byte[]`

Decodes the specified character sequence, and returns the resulting {@code byte[]}. This is the
 inverse operation to {@link #encode(byte[])}.
@throws IllegalArgumentException if the input is not a valid encoded string according to this
     encoding.

### `decodeChecked(`java.lang.CharSequence` chars)`

**Returns:** `byte[]`

Decodes the specified character sequence, and returns the resulting {@code byte[]}. This is the
 inverse operation to {@link #encode(byte[])}.
@throws DecodingException if the input is not a valid encoded string according to this
     encoding.

### `decodingStream([`java.io.Reader`](../../../../java/io/Reader.md) reader)`

**Returns:** [`java.io.InputStream`](../../../../java/io/InputStream.md)

Returns an {@code InputStream} that decodes base-encoded input from the specified {@code
 Reader}. The returned stream throws a {@link DecodingException} upon decoding-specific errors.

### `decodingSource([`com.google.common.io.CharSource`](./CharSource.md) encodedSource)`

**Returns:** [`com.google.common.io.ByteSource`](./ByteSource.md)

Returns a {@code ByteSource} that reads base-encoded bytes from the specified {@code
 CharSource}.

### `maxEncodedSize(`int` bytes)`

**Returns:** `int`

### `encodeTo(`java.lang.Appendable` target, `byte[]` bytes, `int` off, `int` len)`

**Returns:** `void`

### `maxDecodedSize(`int` chars)`

**Returns:** `int`

### `decodeTo(`byte[]` target, `java.lang.CharSequence` chars)`

**Returns:** `int`

### `trimTrailingPadding(`java.lang.CharSequence` chars)`

**Returns:** `java.lang.CharSequence`

### `omitPadding()`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

Returns an encoding that behaves equivalently to this encoding, but omits any padding
 characters as specified by <a href="http://tools.ietf.org/html/rfc4648#section-3.2">RFC 4648
 section 3.2</a>, Padding of Encoded Data.

### `withPadChar(`char` padChar)`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

Returns an encoding that behaves equivalently to this encoding, but uses an alternate character
 for padding.
@throws IllegalArgumentException if this padding character is already used in the alphabet or a
     separator

### `withSeparator(`java.lang.String` separator, `int` n)`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

Returns an encoding that behaves equivalently to this encoding, but adds a separator string
 after every {@code n} characters. Any occurrences of any characters that occur in the separator
 are skipped over in decoding.
@throws IllegalArgumentException if any alphabet or padding characters appear in the separator
     string, or if {@code n <= 0}
@throws UnsupportedOperationException if this encoding already uses a separator

### `upperCase()`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

Returns an encoding that behaves equivalently to this encoding, but encodes and decodes with
 uppercase letters. Padding and separator characters remain in their original case.
@throws IllegalStateException if the alphabet used by this encoding contains mixed upper- and
     lower-case characters

### `lowerCase()`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

Returns an encoding that behaves equivalently to this encoding, but encodes and decodes with
 lowercase letters. Padding and separator characters remain in their original case.
@throws IllegalStateException if the alphabet used by this encoding contains mixed upper- and
     lower-case characters

### `ignoreCase()`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

Returns an encoding that behaves equivalently to this encoding, but decodes letters without
 regard to case.
@throws IllegalStateException if the alphabet used by this encoding contains mixed upper- and
     lower-case characters
@since 32.0.0

### `base64()`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

The "base64" base encoding specified by <a href="http://tools.ietf.org/html/rfc4648#section-4">RFC 4648 section 4</a>, Base 64 Encoding.
 (This is the same as the base 64 encoding from <a href="http://tools.ietf.org/html/rfc3548#section-3">RFC 3548</a>.)

 <p>The character {@code '='} is used for padding, but can be {@linkplain #omitPadding() omitted} or {@linkplain #withPadChar(char) replaced}.

 <p>No line feeds are added by default, as per <a href="http://tools.ietf.org/html/rfc4648#section-3.1">RFC 4648 section 3.1</a>, Line Feeds in
 Encoded Data. Line feeds may be added using {@link #withSeparator(String, int)}.

### `base64Url()`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

The "base64url" encoding specified by <a href="http://tools.ietf.org/html/rfc4648#section-5">RFC 4648 section 5</a>, Base 64 Encoding
 with URL and Filename Safe Alphabet, also sometimes referred to as the "web safe Base64." (This
 is the same as the base 64 encoding with URL and filename safe alphabet from <a href="http://tools.ietf.org/html/rfc3548#section-4">RFC 3548</a>.)

 <p>The character {@code '='} is used for padding, but can be {@linkplain #omitPadding() omitted} or {@linkplain #withPadChar(char) replaced}.

 <p>No line feeds are added by default, as per <a href="http://tools.ietf.org/html/rfc4648#section-3.1">RFC 4648 section 3.1</a>, Line Feeds in
 Encoded Data. Line feeds may be added using {@link #withSeparator(String, int)}.

### `base32()`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

The "base32" encoding specified by <a href="http://tools.ietf.org/html/rfc4648#section-6">RFC
 4648 section 6</a>, Base 32 Encoding. (This is the same as the base 32 encoding from <a href="http://tools.ietf.org/html/rfc3548#section-5">RFC 3548</a>.)

 <p>The character {@code '='} is used for padding, but can be {@linkplain #omitPadding() omitted} or {@linkplain #withPadChar(char) replaced}.

 <p>No line feeds are added by default, as per <a href="http://tools.ietf.org/html/rfc4648#section-3.1">RFC 4648 section 3.1</a>, Line Feeds in
 Encoded Data. Line feeds may be added using {@link #withSeparator(String, int)}.

### `base32Hex()`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

The "base32hex" encoding specified by <a href="http://tools.ietf.org/html/rfc4648#section-7">RFC 4648 section 7</a>, Base 32 Encoding
 with Extended Hex Alphabet. There is no corresponding encoding in RFC 3548.

 <p>The character {@code '='} is used for padding, but can be {@linkplain #omitPadding() omitted} or {@linkplain #withPadChar(char) replaced}.

 <p>No line feeds are added by default, as per <a href="http://tools.ietf.org/html/rfc4648#section-3.1">RFC 4648 section 3.1</a>, Line Feeds in
 Encoded Data. Line feeds may be added using {@link #withSeparator(String, int)}.

### `base16()`

**Returns:** [`com.google.common.io.BaseEncoding`](./BaseEncoding.md)

The "base16" encoding specified by <a href="http://tools.ietf.org/html/rfc4648#section-8">RFC
 4648 section 8</a>, Base 16 Encoding. (This is the same as the base 16 encoding from <a href="http://tools.ietf.org/html/rfc3548#section-6">RFC 3548</a>.) This is commonly known as
 "hexadecimal" format.

 <p>No padding is necessary in base 16, so {@link #withPadChar(char)} and {@link #omitPadding()}
 have no effect.

 <p>No line feeds are added by default, as per <a href="http://tools.ietf.org/html/rfc4648#section-3.1">RFC 4648 section 3.1</a>, Line Feeds in
 Encoded Data. Line feeds may be added using {@link #withSeparator(String, int)}.

### `ignoringReader([`java.io.Reader`](../../../../java/io/Reader.md) delegate, `java.lang.String` toIgnore)`

**Returns:** [`java.io.Reader`](../../../../java/io/Reader.md)

### `separatingAppendable(`java.lang.Appendable` delegate, `java.lang.String` separator, `int` afterEveryChars)`

**Returns:** `java.lang.Appendable`

### `separatingWriter([`java.io.Writer`](../../../../java/io/Writer.md) delegate, `java.lang.String` separator, `int` afterEveryChars)`

**Returns:** [`java.io.Writer`](../../../../java/io/Writer.md)

