# Class: `CharEscaper`

**Package:** [`com.google.common.escape`](README.md)

**Fully Qualified Name:** `com.google.common.escape.CharEscaper`

**Extends:** [`com.google.common.escape.Escaper`](./Escaper.md)

## Description

An object that converts literal text into a format safe for inclusion in a particular context
 (such as an XML document). Typically (but not always), the inverse process of "unescaping" the
 text is performed automatically by the relevant parser.

 <p>For example, an XML escaper would convert the literal string {@code "Foo<Bar>"} into {@code
 "Foo&lt;Bar&gt;"} to prevent {@code "<Bar>"} from being confused with an XML tag. When the
 resulting XML document is parsed, the parser API will return this text as the original literal
 string {@code "Foo<Bar>"}.

 <p>A {@code CharEscaper} instance is required to be stateless, and safe when used concurrently by
 multiple threads.

 <p>Popular escapers are defined as constants in classes like {@link com.google.common.html.HtmlEscapers} and {@link com.google.common.xml.XmlEscapers}. To create
 your own escapers extend this class and implement the {@link #escape(char)} method.
@author Sven Mawson
@since 15.0

## Fields

### `DEST_PAD_MULTIPLIER`

**Type:** `int`

The multiplier for padding to use when growing the escape buffer.

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `escape(`java.lang.String` string)`

**Returns:** `java.lang.String`

Returns the escaped form of a given literal string.
@param string the literal string to be escaped
@return the escaped form of {@code string}
@throws NullPointerException if {@code string} is null

### `escape(`char` c)`

**Returns:** `char[]`

Returns the escaped form of the given character, or {@code null} if this character does not
 need to be escaped. If an empty array is returned, this effectively strips the input character
 from the resulting text.

 <p>If the character does not need to be escaped, this method should return {@code null}, rather
 than a one-character array containing the character itself. This enables the escaping algorithm
 to perform more efficiently.

 <p>An escaper is expected to be able to deal with any {@code char} value, so this method should
 not throw any exceptions.
@param c the character to escape if necessary
@return the replacement characters, or {@code null} if no escaping was needed

### `escapeSlow(`java.lang.String` s, `int` index)`

**Returns:** `java.lang.String`

Returns the escaped form of a given literal string, starting at the given index. This method is
 called by the {@link #escape(String)} method when it discovers that escaping is required. It is
 protected to allow subclasses to override the fastpath escaping function to inline their
 escaping test. See {@link CharEscaperBuilder} for an example usage.
@param s the literal string to be escaped
@param index the index to start escaping from
@return the escaped form of {@code string}
@throws NullPointerException if {@code string} is null

### `growBuffer(`char[]` dest, `int` index, `int` size)`

**Returns:** `char[]`

Helper method to grow the character buffer as needed, this only happens once in a while so it's
 ok if it's in a method call. If the index passed in is 0 then no copying will be done.

