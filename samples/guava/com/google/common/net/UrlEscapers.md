# Class: `UrlEscapers`

**Package:** [`com.google.common.net`](README.md)

**Fully Qualified Name:** `com.google.common.net.UrlEscapers`

## Description

If the resulting URLs are inserted into an HTML or XML document, they will require additional
 escaping with com.google.common.html.HtmlEscapers or com.google.common.xml.XmlEscapers.

## Fields

### `URL_FORM_PARAMETER_OTHER_SAFE_CHARS`

**Type:** `java.lang.String`

### `URL_PATH_OTHER_SAFE_CHARS_LACKING_PLUS`

**Type:** `java.lang.String`

### `URL_FORM_PARAMETER_ESCAPER`

**Type:** [`com.google.common.escape.Escaper`](../escape/Escaper.md)

### `URL_PATH_SEGMENT_ESCAPER`

**Type:** [`com.google.common.escape.Escaper`](../escape/Escaper.md)

### `URL_FRAGMENT_ESCAPER`

**Type:** [`com.google.common.escape.Escaper`](../escape/Escaper.md)

## Constructors

### `<init>()`

## Methods

### `urlFormParameterEscaper()`

**Returns:** [`com.google.common.escape.Escaper`](../escape/Escaper.md)

Escaping is performed
 with the UTF-8 character encoding. The caller is responsible for [replacing any unpaired carriage return or line feed characters
 with a CR+LF pair](https://goo.gl/9EfkM1) on any non-file inputs before escaping them with this escaper.

 
When escaping a String, the following rules apply:

 

   - The alphanumeric characters "a" through "z", "A" through "Z" and "0" through "9" remain
       the same.
   - The special characters ".", "-", "*", and "_" remain the same.
   - The space character " " is converted into a plus sign "+".
   - All other characters are converted into one or more bytes using UTF-8 encoding and each
       byte is then represented by the 3-character string "%XY", where "XY" is the two-digit,
       uppercase, hexadecimal representation of the byte value.
 


 
This escaper is suitable for escaping parameter names and values even when [using the non-standard semicolon](https://goo.gl/utn6M), rather than the ampersand, as
 a parameter delimiter. Nevertheless, we recommend using the ampersand unless you must
 interoperate with systems that require semicolons.

 
**Note:** Unlike other escapers, URL escapers produce [uppercase](https://url.spec.whatwg.org/#percent-encode) hexadecimal sequences.

### `urlPathSegmentEscaper()`

**Returns:** [`com.google.common.escape.Escaper`](../escape/Escaper.md)

The returned escaper escapes all non-ASCII
 characters, even though [many of these are accepted in modern
 URLs](https://goo.gl/e7E0In). ([If the escaper were to leave these characters
 unescaped, they would be escaped by the consumer at parse time, anyway.](https://goo.gl/jfVxXW)) Additionally, the
 escaper escapes the slash character ("/"). While slashes are acceptable in URL paths, they are
 considered by the specification to be separators between "path segments." This implies that, if
 you wish for your path to contain slashes, you must escape each segment separately and then
 join them.

 
When escaping a String, the following rules apply:

 

   - The alphanumeric characters "a" through "z", "A" through "Z" and "0" through "9" remain
       the same.
   - The unreserved characters ".", "-", "~", and "_" remain the same.
   - The general delimiters "@" and ":" remain the same.
   - The subdelimiters "!", "$", "&", "'", "(", ")", "*", "+", ",", ";", and "=" remain
       the same.
   - The space character " " is converted into %20.
   - All other characters are converted into one or more bytes using UTF-8 encoding and each
       byte is then represented by the 3-character string "%XY", where "XY" is the two-digit,
       uppercase, hexadecimal representation of the byte value.
 


 
**Note:** Unlike other escapers, URL escapers produce [uppercase](https://url.spec.whatwg.org/#percent-encode) hexadecimal sequences.

### `urlFragmentEscaper()`

**Returns:** [`com.google.common.escape.Escaper`](../escape/Escaper.md)

The returned escaper escapes all non-ASCII
 characters, even though [many of these are accepted in modern
 URLs](https://goo.gl/e7E0In).

 
When escaping a String, the following rules apply:

 

   - The alphanumeric characters "a" through "z", "A" through "Z" and "0" through "9" remain
       the same.
   - The unreserved characters ".", "-", "~", and "_" remain the same.
   - The general delimiters "@" and ":" remain the same.
   - The subdelimiters "!", "$", "&", "'", "(", ")", "*", "+", ",", ";", and "=" remain
       the same.
   - The space character " " is converted into %20.
   - Fragments allow unescaped "/" and "?", so they remain the same.
   - All other characters are converted into one or more bytes using UTF-8 encoding and each
       byte is then represented by the 3-character string "%XY", where "XY" is the two-digit,
       uppercase, hexadecimal representation of the byte value.
 


 
**Note:** Unlike other escapers, URL escapers produce [uppercase](https://url.spec.whatwg.org/#percent-encode) hexadecimal sequences.

