# Class: `Escaper`

**Package:** [`com.google.common.escape`](README.md)

**Fully Qualified Name:** `com.google.common.escape.Escaper`

## Description

Typically (but not always), the inverse process of "unescaping" the
 text is performed automatically by the relevant parser.

 
For example, an XML escaper would convert the literal string "Foo<Bar>" into 
 "Foo&lt;Bar&gt;" to prevent "<Bar>" from being confused with an XML tag. When the
 resulting XML document is parsed, the parser API will return this text as the original literal
 string "Foo<Bar>".

 
An Escaper instance is required to be stateless, and safe when used concurrently by
 multiple threads.

 
Because, in general, escaping operates on the code points of a string and not on its
 individual char values, it is not safe to assume that escape(s) is equivalent to
 escape(s.substring(0, n)) + escape(s.substring(n)) for arbitrary n. This is
 because of the possibility of splitting a surrogate pair. The only case in which it is safe to
 escape strings and concatenate the results is if you can rule out this possibility, either by
 splitting an existing long string into short strings adaptively around surrogate pairs, or by starting
 with short strings already known to be free of unpaired surrogates.

 
The two primary implementations of this interface are CharEscaper and UnicodeEscaper. They are heavily optimized for performance and greatly simplify the task of
 implementing new escapers. It is strongly recommended that when implementing a new escaper you
 extend one of these classes. If you find that you are unable to achieve the desired behavior
 using either of these classes, please contact the Java libraries team for advice.

 
Popular escapers are defined as constants in classes like com.google.common.html.HtmlEscapers and com.google.common.xml.XmlEscapers. To create
 your own escapers, use CharEscaperBuilder, or extend CharEscaper or 
 UnicodeEscaper.

## Fields

### `asFunction`

**Type:** [`com.google.common.base.Function<java.lang.String,java.lang.String>`](../base/Function.md)

## Constructors

### `<init>()`

## Methods

### `escape(java.lang.String string)`

**Returns:** `java.lang.String`

Note that this method may treat input characters differently depending on the specific
 escaper implementation.

 

   - UnicodeEscaper handles [UTF-16](http://en.wikipedia.org/wiki/UTF-16)
       correctly, including surrogate character pairs. If the input is badly formed the escaper
       should throw IllegalArgumentException.
   - CharEscaper handles Java characters independently and does not verify the input
       for well formed characters. A CharEscaper should not be used in situations where
       input is not guaranteed to be restricted to the Basic Multilingual Plane (BMP).

**Parameters:**
- `string` (`java.lang.String`): the literal string to be escaped

### `asFunction()`

**Returns:** [`com.google.common.base.Function<java.lang.String,java.lang.String>`](../base/Function.md)

