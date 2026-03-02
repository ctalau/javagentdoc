# Class: `CharEscaper`

**Package:** [`com.google.common.escape`](README.md)

**Fully Qualified Name:** `com.google.common.escape.CharEscaper`

**Extends:** [`com.google.common.escape.Escaper`](./Escaper.md)

## Description

Typically (but not always), the inverse process of "unescaping" the
 text is performed automatically by the relevant parser.

 
For example, an XML escaper would convert the literal string "Foo<Bar>" into 
 "Foo&lt;Bar&gt;" to prevent "<Bar>" from being confused with an XML tag. When the
 resulting XML document is parsed, the parser API will return this text as the original literal
 string "Foo<Bar>".

 
A CharEscaper instance is required to be stateless, and safe when used concurrently by
 multiple threads.

 
Popular escapers are defined as constants in classes like com.google.common.html.HtmlEscapers and com.google.common.xml.XmlEscapers. To create
 your own escapers extend this class and implement the #escape(char) method.

## Fields

### `DEST_PAD_MULTIPLIER`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `escape(java.lang.String string)`

**Returns:** `java.lang.String`

**Parameters:**
- `string` (`java.lang.String`): the literal string to be escaped

### `escape(char c)`

**Returns:** `char[]`

If an empty array is returned, this effectively strips the input character
 from the resulting text.

 
If the character does not need to be escaped, this method should return null, rather
 than a one-character array containing the character itself. This enables the escaping algorithm
 to perform more efficiently.

 
An escaper is expected to be able to deal with any char value, so this method should
 not throw any exceptions.

**Parameters:**
- `c` (`char`): the character to escape if necessary

### `escapeSlow(java.lang.String s, int index)`

**Returns:** `java.lang.String`

This method is
 called by the #escape(String) method when it discovers that escaping is required. It is
 protected to allow subclasses to override the fastpath escaping function to inline their
 escaping test. See CharEscaperBuilder for an example usage.

**Parameters:**
- `s` (`java.lang.String`): the literal string to be escaped
- `index` (`int`): the index to start escaping from

### `growBuffer(char[] dest, int index, int size)`

**Returns:** `char[]`

If the index passed in is 0 then no copying will be done.

**Parameters:**
- `dest` (`char[]`)
- `index` (`int`)
- `size` (`int`)

