# Class: `Charsets`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Charsets`

## Description

Contains constant definitions for the six standard {@link Charset} instances, which are
 guaranteed to be supported by all Java platform implementations.

 <p>Assuming you're free to choose, note that <b>{@link #UTF_8} is widely preferred</b>.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/StringsExplained#charsets">{@code Charsets}</a>.
@author Mike Bostock
@since 1.0

## Fields

### `US_ASCII`

**Type:** [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md)

US-ASCII: seven-bit ASCII, the Basic Latin block of the Unicode character set (ISO646-US).

 <p><b>Note for Java 7 and later:</b> this constant should be treated as deprecated; use {@link java.nio.charset.StandardCharsets#US_ASCII} instead.

### `ISO_8859_1`

**Type:** [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md)

ISO-8859-1: ISO Latin Alphabet Number 1 (ISO-LATIN-1).

 <p><b>Note for Java 7 and later:</b> this constant should be treated as deprecated; use {@link java.nio.charset.StandardCharsets#ISO_8859_1} instead.

### `UTF_8`

**Type:** [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md)

UTF-8: eight-bit UCS Transformation Format.

 <p><b>Note for Java 7 and later:</b> this constant should be treated as deprecated; use {@link java.nio.charset.StandardCharsets#UTF_8} instead.

### `UTF_16BE`

**Type:** [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md)

UTF-16BE: sixteen-bit UCS Transformation Format, big-endian byte order.

 <p><b>Note for Java 7 and later:</b> this constant should be treated as deprecated; use {@link java.nio.charset.StandardCharsets#UTF_16BE} instead.

### `UTF_16LE`

**Type:** [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md)

UTF-16LE: sixteen-bit UCS Transformation Format, little-endian byte order.

 <p><b>Note for Java 7 and later:</b> this constant should be treated as deprecated; use {@link java.nio.charset.StandardCharsets#UTF_16LE} instead.

### `UTF_16`

**Type:** [`java.nio.charset.Charset`](../../../../java/nio/charset/Charset.md)

UTF-16: sixteen-bit UCS Transformation Format, byte order identified by an optional byte-order
 mark.

 <p><b>Note for Java 7 and later:</b> this constant should be treated as deprecated; use {@link java.nio.charset.StandardCharsets#UTF_16} instead.

## Constructors

### `<init>()`

