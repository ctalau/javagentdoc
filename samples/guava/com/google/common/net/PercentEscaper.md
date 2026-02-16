# Class: `PercentEscaper`

**Package:** [`com.google.common.net`](README.md)

**Fully Qualified Name:** `com.google.common.net.PercentEscaper`

**Extends:** [`com.google.common.escape.UnicodeEscaper`](../escape/UnicodeEscaper.md)

## Description

A `UnicodeEscaper` that escapes some set of Java characters using a UTF-8 based percent
 encoding scheme. The set of safe characters (those which remain unescaped) can be specified on
 construction.

 <p>This class is primarily used for creating URI escapers in `UrlEscapers` but can be used
 directly if required. While URI escapers impose specific semantics on which characters are
 considered 'safe', this class has a minimal set of restrictions.

 <p>When escaping a String, the following rules apply:

 <ul>
   <li>All specified safe characters remain unchanged.
   <li>If `plusForSpace` was specified, the space character " " is converted into a plus
       sign `"+"`.
   <li>All other characters are converted into one or more bytes using UTF-8 encoding and each
       byte is then represented by the 3-character string "%XX", where "XX" is the two-digit,
       uppercase, hexadecimal representation of the byte value.
 </ul>

 <p>For performance reasons the only currently supported character encoding of this class is
 UTF-8.

 <p><b>Note:</b> This escaper produces <a href="https://url.spec.whatwg.org/#percent-encode">uppercase</a> hexadecimal sequences.
**Author:** David Beaumont
**Since:** 15.0

## Fields

### `PLUS_SIGN`

**Type:** `char[]`

### `UPPER_HEX_DIGITS`

**Type:** `char[]`

### `plusForSpace`

**Type:** `boolean`

If true we should convert space to the `+` character.

### `safeOctets`

**Type:** `boolean[]`

An array of flags where for any `char c` if `safeOctets[c]` is true then `c`
 should remain unmodified in the output. If `c >= safeOctets.length` then it should be
 escaped.

## Constructors

### `<init>(`java.lang.String` safeChars, `boolean` plusForSpace)`

Constructs a percent escaper with the specified safe characters and optional handling of the
 space character.

 <p>Not that it is allowed, but not necessarily desirable to specify `%` as a safe
 character. This has the effect of creating an escaper which has no well-defined inverse but it
 can be useful when escaping additional characters.
@param safeChars a non-null string specifying additional safe characters for this escaper (the
     ranges 0..9, a..z and A..Z are always safe and should not be specified here)
@param plusForSpace true if ASCII space should be escaped to `+` rather than `%20`
@throws IllegalArgumentException if any of the parameters were invalid

## Methods

### `createSafeOctets(`java.lang.String` safeChars)`

**Returns:** `boolean[]`

Creates a boolean array with entries corresponding to the character values specified in
 safeChars set to true. The array is as small as is required to hold the given character
 information.

### `nextEscapeIndex(`java.lang.CharSequence` csq, `int` index, `int` end)`

**Returns:** `int`

### `escape(`java.lang.String` s)`

**Returns:** `java.lang.String`

### `escape(`int` cp)`

**Returns:** `char[]`

Escapes the given Unicode code point in UTF-8.

