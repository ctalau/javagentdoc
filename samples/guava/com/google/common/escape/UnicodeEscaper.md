# Class: `UnicodeEscaper`

**Package:** [`com.google.common.escape`](README.md)

**Fully Qualified Name:** `com.google.common.escape.UnicodeEscaper`

**Extends:** [`com.google.common.escape.Escaper`](./Escaper.md)

## Description

An `Escaper` that converts literal text into a format safe for inclusion in a particular
 context (such as an XML document). Typically (but not always), the inverse process of
 "unescaping" the text is performed automatically by the relevant parser.

 <p>For example, an XML escaper would convert the literal string `"Foo<Bar>"` into `"Foo&lt;Bar&gt;"` to prevent `"<Bar>"` from being confused with an XML tag. When the
 resulting XML document is parsed, the parser API will return this text as the original literal
 string `"Foo<Bar>"`.

 <p><b>Note:</b> This class is similar to `CharEscaper` but with one very important
 difference. A CharEscaper can only process Java <a href="http://en.wikipedia.org/wiki/UTF-16">UTF16</a> characters in isolation and may not cope
 when it encounters surrogate pairs. This class facilitates the correct escaping of all Unicode
 characters.

 <p>As there are important reasons, including potential security issues, to handle Unicode
 correctly if you are considering implementing a new escaper you should favor using UnicodeEscaper
 wherever possible.

 <p>A `UnicodeEscaper` instance is required to be stateless, and safe when used concurrently
 by multiple threads.

 <p>Popular escapers are defined as constants in classes like `com.google.common.html.HtmlEscapers` and `com.google.common.xml.XmlEscapers`. To create
 your own escapers extend this class and implement the `escape(int)` method.
**Author:** David Beaumont
**Since:** 15.0

## Fields

### `DEST_PAD`

**Type:** `int`

The amount of padding (chars) to use when growing the escape buffer.

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `escape(`int` cp)`

**Returns:** `char[]`

Returns the escaped form of the given Unicode code point, or `null` if this code point
 does not need to be escaped. When called as part of an escaping operation, the given code point
 is guaranteed to be in the range `0 <= cp <= Character#MAX_CODE_POINT`.

 <p>If an empty array is returned, this effectively strips the input character from the
 resulting text.

 <p>If the character does not need to be escaped, this method should return `null`, rather
 than an array containing the character representation of the code point. This enables the
 escaping algorithm to perform more efficiently.

 <p>If the implementation of this method cannot correctly handle a particular code point then it
 should either throw an appropriate runtime exception or return a suitable replacement
 character. It must never silently discard invalid input as this may constitute a security risk.
@param cp the Unicode code point to escape if necessary
@return the replacement characters, or `null` if no escaping was needed

### `escape(`java.lang.String` string)`

**Returns:** `java.lang.String`

Returns the escaped form of a given literal string.

 <p>If you are escaping input in arbitrary successive chunks, then it is not generally safe to
 use this method. If an input string ends with an unmatched high surrogate character, then this
 method will throw `IllegalArgumentException`. You should ensure your input is valid <a href="http://en.wikipedia.org/wiki/UTF-16">UTF-16</a> before calling this method.

 <p><b>Note:</b> When implementing an escaper it is a good idea to override this method for
 efficiency by inlining the implementation of `nextEscapeIndex(CharSequence, int, int)`
 directly. Doing this for `com.google.common.net.PercentEscaper` more than doubled the
 performance for unescaped strings (as measured by `CharEscapersBenchmark`).
@param string the literal string to be escaped
@return the escaped form of `string`
@throws NullPointerException if `string` is null
@throws IllegalArgumentException if invalid surrogate characters are encountered

### `nextEscapeIndex(`java.lang.CharSequence` csq, `int` start, `int` end)`

**Returns:** `int`

Scans a sub-sequence of characters from a given `CharSequence`, returning the index of
 the next character that requires escaping.

 <p><b>Note:</b> When implementing an escaper, it is a good idea to override this method for
 efficiency. The base class implementation determines successive Unicode code points and invokes
 `escape(int)` for each of them. If the semantics of your escaper are such that code
 points in the supplementary range are either all escaped or all unescaped, this method can be
 implemented more efficiently using `CharSequence.charAt(int)`.

 <p>Note however that if your escaper does not escape characters in the supplementary range, you
 should either continue to validate the correctness of any surrogate characters encountered or
 provide a clear warning to users that your escaper does not validate its input.

 <p>See `com.google.common.net.PercentEscaper` for an example.
@param csq a sequence of characters
@param start the index of the first character to be scanned
@param end the index immediately after the last character to be scanned
@throws IllegalArgumentException if the scanned sub-sequence of `csq` contains invalid
     surrogate pairs

### `escapeSlow(`java.lang.String` s, `int` index)`

**Returns:** `java.lang.String`

Returns the escaped form of a given literal string, starting at the given index. This method is
 called by the `escape(String)` method when it discovers that escaping is required. It is
 protected to allow subclasses to override the fastpath escaping function to inline their
 escaping test. See `CharEscaperBuilder` for an example usage.

 <p>This method is not reentrant and may only be invoked by the top level `escape(String)` method.
@param s the literal string to be escaped
@param index the index to start escaping from
@return the escaped form of `string`
@throws NullPointerException if `string` is null
@throws IllegalArgumentException if invalid surrogate characters are encountered

### `codePointAt(`java.lang.CharSequence` seq, `int` index, `int` end)`

**Returns:** `int`

Returns the Unicode code point of the character at the given index.

 <p>Unlike `Character.codePointAt(CharSequence, int)` or `String.codePointAt(int)`
 this method will never fail silently when encountering an invalid surrogate pair.

 <p>The behaviour of this method is as follows:

 <ol>
   <li>If `index >= end`, `IndexOutOfBoundsException` is thrown.
   <li><b>If the character at the specified index is not a surrogate, it is returned.</b>
   <li>If the first character was a high surrogate value, then an attempt is made to read the
       next character.
       <ol>
         <li><b>If the end of the sequence was reached, the negated value of the trailing high
             surrogate is returned.</b>
         <li><b>If the next character was a valid low surrogate, the code point value of the
             high/low surrogate pair is returned.</b>
         <li>If the next character was not a low surrogate value, then `IllegalArgumentException` is thrown.
       </ol>
   <li>If the first character was a low surrogate value, `IllegalArgumentException` is
       thrown.
 </ol>
@param seq the sequence of characters from which to decode the code point
@param index the index of the first character to decode
@param end the index beyond the last valid character to decode
@return the Unicode code point for the given index or the negated value of the trailing high
     surrogate character at the end of the sequence

### `growBuffer(`char[]` dest, `int` index, `int` size)`

**Returns:** `char[]`

Helper method to grow the character buffer as needed, this only happens once in a while so it's
 ok if it's in a method call. If the index passed in is 0 then no copying will be done.

