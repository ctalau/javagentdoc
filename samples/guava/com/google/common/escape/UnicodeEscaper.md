# Class: `UnicodeEscaper`

**Package:** [`com.google.common.escape`](README.md)

**Fully Qualified Name:** `com.google.common.escape.UnicodeEscaper`

**Extends:** [`com.google.common.escape.Escaper`](./Escaper.md)

## Description

Typically (but not always), the inverse process of
 "unescaping" the text is performed automatically by the relevant parser.

 
For example, an XML escaper would convert the literal string "Foo<Bar>" into 
 "Foo&lt;Bar&gt;" to prevent "<Bar>" from being confused with an XML tag. When the
 resulting XML document is parsed, the parser API will return this text as the original literal
 string "Foo<Bar>".

 
**Note:** This class is similar to CharEscaper but with one very important
 difference. A CharEscaper can only process Java [UTF16](http://en.wikipedia.org/wiki/UTF-16) characters in isolation and may not cope
 when it encounters surrogate pairs. This class facilitates the correct escaping of all Unicode
 characters.

 
As there are important reasons, including potential security issues, to handle Unicode
 correctly if you are considering implementing a new escaper you should favor using UnicodeEscaper
 wherever possible.

 
A UnicodeEscaper instance is required to be stateless, and safe when used concurrently
 by multiple threads.

 
Popular escapers are defined as constants in classes like com.google.common.html.HtmlEscapers and com.google.common.xml.XmlEscapers. To create
 your own escapers extend this class and implement the #escape(int) method.

## Fields

### `DEST_PAD`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `escape(int cp)`

**Returns:** `char[]`

When called as part of an escaping operation, the given code point
 is guaranteed to be in the range 0 <= cp <= Character#MAX_CODE_POINT.

 
If an empty array is returned, this effectively strips the input character from the
 resulting text.

 
If the character does not need to be escaped, this method should return null, rather
 than an array containing the character representation of the code point. This enables the
 escaping algorithm to perform more efficiently.

 
If the implementation of this method cannot correctly handle a particular code point then it
 should either throw an appropriate runtime exception or return a suitable replacement
 character. It must never silently discard invalid input as this may constitute a security risk.

**Parameters:**
- `cp` (`int`): the Unicode code point to escape if necessary

### `escape(java.lang.String string)`

**Returns:** `java.lang.String`

If you are escaping input in arbitrary successive chunks, then it is not generally safe to
 use this method. If an input string ends with an unmatched high surrogate character, then this
 method will throw IllegalArgumentException. You should ensure your input is valid [UTF-16](http://en.wikipedia.org/wiki/UTF-16) before calling this method.

 
**Note:** When implementing an escaper it is a good idea to override this method for
 efficiency by inlining the implementation of #nextEscapeIndex(CharSequence, int, int)
 directly. Doing this for com.google.common.net.PercentEscaper more than doubled the
 performance for unescaped strings (as measured by CharEscapersBenchmark).

**Parameters:**
- `string` (`java.lang.String`): the literal string to be escaped

### `nextEscapeIndex(java.lang.CharSequence csq, int start, int end)`

**Returns:** `int`

**Note:** When implementing an escaper, it is a good idea to override this method for
 efficiency. The base class implementation determines successive Unicode code points and invokes
 #escape(int) for each of them. If the semantics of your escaper are such that code
 points in the supplementary range are either all escaped or all unescaped, this method can be
 implemented more efficiently using CharSequence#charAt(int).

 
Note however that if your escaper does not escape characters in the supplementary range, you
 should either continue to validate the correctness of any surrogate characters encountered or
 provide a clear warning to users that your escaper does not validate its input.

 
See com.google.common.net.PercentEscaper for an example.

**Parameters:**
- `csq` (`java.lang.CharSequence`): a sequence of characters
- `start` (`int`): the index of the first character to be scanned
- `end` (`int`): the index immediately after the last character to be scanned

### `escapeSlow(java.lang.String s, int index)`

**Returns:** `java.lang.String`

This method is
 called by the #escape(String) method when it discovers that escaping is required. It is
 protected to allow subclasses to override the fastpath escaping function to inline their
 escaping test. See CharEscaperBuilder for an example usage.

 
This method is not reentrant and may only be invoked by the top level #escape(String) method.

**Parameters:**
- `s` (`java.lang.String`): the literal string to be escaped
- `index` (`int`): the index to start escaping from

### `codePointAt(java.lang.CharSequence seq, int index, int end)`

**Returns:** `int`

Unlike Character#codePointAt(CharSequence, int) or String#codePointAt(int)
 this method will never fail silently when encountering an invalid surrogate pair.

 
The behaviour of this method is as follows:

 

   - If index >= end, IndexOutOfBoundsException is thrown.
   - **If the character at the specified index is not a surrogate, it is returned.**
   - If the first character was a high surrogate value, then an attempt is made to read the
       next character.
       

         - **If the end of the sequence was reached, the negated value of the trailing high
             surrogate is returned.**
         - **If the next character was a valid low surrogate, the code point value of the
             high/low surrogate pair is returned.**
         - If the next character was not a low surrogate value, then IllegalArgumentException is thrown.
       

   - If the first character was a low surrogate value, IllegalArgumentException is
       thrown.

**Parameters:**
- `seq` (`java.lang.CharSequence`): the sequence of characters from which to decode the code point
- `index` (`int`): the index of the first character to decode
- `end` (`int`): the index beyond the last valid character to decode

### `growBuffer(char[] dest, int index, int size)`

**Returns:** `char[]`

If the index passed in is 0 then no copying will be done.

**Parameters:**
- `dest` (`char[]`)
- `index` (`int`)
- `size` (`int`)

