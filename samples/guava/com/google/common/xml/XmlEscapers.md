# Class: `XmlEscapers`

**Package:** [`com.google.common.xml`](README.md)

**Fully Qualified Name:** `com.google.common.xml.XmlEscapers`

## Description

When possible, avoid manual escaping by using templating systems and
 high-level APIs that provide autoescaping. For example, consider [XOM](http://www.xom.nu/) or [JDOM](http://www.jdom.org/).

 
**Note:** Currently the escapers provided by this class do not escape any characters
 outside the ASCII character range. Unlike HTML escaping the XML escapers will not escape
 non-ASCII characters to their numeric entity replacements. These XML escapers provide the minimal
 level of escaping to ensure that the output can be safely included in a Unicode XML document.

 
For details on the behavior of the escapers in this class, see sections [2.2](http://www.w3.org/TR/2008/REC-xml-20081126/#charsets) and [2.4](http://www.w3.org/TR/2008/REC-xml-20081126/#syntax) of the XML specification.

## Fields

### `MIN_ASCII_CONTROL_CHAR`

**Type:** `char`

### `MAX_ASCII_CONTROL_CHAR`

**Type:** `char`

### `XML_ESCAPER`

**Type:** [`com.google.common.escape.Escaper`](../escape/Escaper.md)

### `XML_CONTENT_ESCAPER`

**Type:** [`com.google.common.escape.Escaper`](../escape/Escaper.md)

### `XML_ATTRIBUTE_ESCAPER`

**Type:** [`com.google.common.escape.Escaper`](../escape/Escaper.md)

## Constructors

### `<init>()`

## Methods

### `xmlContentEscaper()`

**Returns:** [`com.google.common.escape.Escaper`](../escape/Escaper.md)

See section [2.4](http://www.w3.org/TR/2008/REC-xml-20081126/#syntax) of the XML specification.

 
**Note:** Double and single quotes are not escaped, so it is **not safe** to use this
 escaper to escape attribute values. Use #xmlContentEscaper if the output can appear in
 element content or #xmlAttributeEscaper in attribute values.

 
This escaper substitutes 0xFFFD for non-whitespace control characters and the
 character values 0xFFFE and 0xFFFF which are not permitted in XML. For more
 detail see section [2.2](http://www.w3.org/TR/2008/REC-xml-20081126/#charsets) of
 the XML specification.

 
This escaper does not escape non-ASCII characters to their numeric character references
 (NCR). Any non-ASCII characters appearing in the input will be preserved in the output.
 Specifically "\r" (carriage return) is preserved in the output, which may result in it being
 silently converted to "\n" when the XML is parsed.

 
This escaper does not treat surrogate pairs specially and does not perform Unicode
 validation on its input.

### `xmlAttributeEscaper()`

**Returns:** [`com.google.common.escape.Escaper`](../escape/Escaper.md)

See section [3.3.3](http://www.w3.org/TR/2008/REC-xml-20081126/#AVNormalize) of the XML
 specification.

 
This escaper substitutes 0xFFFD for non-whitespace control characters and the
 character values 0xFFFE and 0xFFFF which are not permitted in XML. For more
 detail see section [2.2](http://www.w3.org/TR/2008/REC-xml-20081126/#charsets) of
 the XML specification.

 
This escaper does not escape non-ASCII characters to their numeric character references
 (NCR). However, horizontal tab '\t', line feed '\n' and carriage return 
 '\r' are escaped to a corresponding NCR "&#x9;", "&#xA;", and "&#xD;"
 respectively. Any other non-ASCII characters appearing in the input will be preserved in the
 output.

 
This escaper does not treat surrogate pairs specially and does not perform Unicode
 validation on its input.

