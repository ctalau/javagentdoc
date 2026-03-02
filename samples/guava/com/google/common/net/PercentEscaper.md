# Class: `PercentEscaper`

**Package:** [`com.google.common.net`](README.md)

**Fully Qualified Name:** `com.google.common.net.PercentEscaper`

**Extends:** [`com.google.common.escape.UnicodeEscaper`](../escape/UnicodeEscaper.md)

## Description

The set of safe characters (those which remain unescaped) can be specified on
 construction.

 
This class is primarily used for creating URI escapers in UrlEscapers but can be used
 directly if required. While URI escapers impose specific semantics on which characters are
 considered 'safe', this class has a minimal set of restrictions.

 
When escaping a String, the following rules apply:

 

   - All specified safe characters remain unchanged.
   - If plusForSpace was specified, the space character " " is converted into a plus
       sign "+".
   - All other characters are converted into one or more bytes using UTF-8 encoding and each
       byte is then represented by the 3-character string "%XX", where "XX" is the two-digit,
       uppercase, hexadecimal representation of the byte value.
 


 
For performance reasons the only currently supported character encoding of this class is
 UTF-8.

 
**Note:** This escaper produces [uppercase](https://url.spec.whatwg.org/#percent-encode) hexadecimal sequences.

## Fields

### `PLUS_SIGN`

**Type:** `char[]`

### `UPPER_HEX_DIGITS`

**Type:** `char[]`

### `plusForSpace`

**Type:** `boolean`

### `safeOctets`

**Type:** `boolean[]`

If c >= safeOctets.length then it should be
 escaped.

## Constructors

### `<init>(java.lang.String safeChars, boolean plusForSpace)`

Not that it is allowed, but not necessarily desirable to specify % as a safe
 character. This has the effect of creating an escaper which has no well-defined inverse but it
 can be useful when escaping additional characters.

**Parameters:**
- `safeChars` (`java.lang.String`): a non-null string specifying additional safe characters for this escaper (the
     ranges 0..9, a..z and A..Z are always safe and should not be specified here)
- `plusForSpace` (`boolean`): true if ASCII space should be escaped to + rather than %20

## Methods

### `createSafeOctets(java.lang.String safeChars)`

**Returns:** `boolean[]`

The array is as small as is required to hold the given character
 information.

**Parameters:**
- `safeChars` (`java.lang.String`)

### `nextEscapeIndex(java.lang.CharSequence csq, int index, int end)`

**Returns:** `int`

**Parameters:**
- `csq` (`java.lang.CharSequence`)
- `index` (`int`)
- `end` (`int`)

### `escape(java.lang.String s)`

**Returns:** `java.lang.String`

**Parameters:**
- `s` (`java.lang.String`)

### `escape(int cp)`

**Returns:** `char[]`

**Parameters:**
- `cp` (`int`)

