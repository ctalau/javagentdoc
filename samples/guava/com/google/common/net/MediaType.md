# Class: `MediaType`

**Package:** [`com.google.common.net`](README.md)

**Fully Qualified Name:** `com.google.common.net.MediaType`

## Description

This class also supports the concept of media ranges
 [defined by HTTP/1.1](http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.1).
 As such, the * character is treated as a wildcard and is used to represent any acceptable
 type or subtype value. A media type may not have wildcard type with a declared subtype. The
 * character has no special meaning as part of a parameter. All values for type, subtype,
 parameter attributes or parameter values must be valid according to RFCs [2045](https://tools.ietf.org/html/rfc2045) and [2046](https://tools.ietf.org/html/rfc2046).

 
All portions of the media type that are case-insensitive (type, subtype, parameter attributes)
 are normalized to lowercase. The value of the charset parameter is normalized to
 lowercase, but all others are left as-is.

 
Note that this specifically does **not** represent the value of the MIME 
 Content-Type header and as such has no support for header-specific considerations such as line
 folding and comments.

 
For media types that take a charset the predefined constants default to UTF-8 and have a
 "_UTF_8" suffix. To get a version without a character set, use #withoutParameters.

## Fields

### `CHARSET_ATTRIBUTE`

**Type:** `java.lang.String`

### `UTF_8_CONSTANT_PARAMETERS`

**Type:** [`com.google.common.collect.ImmutableListMultimap<java.lang.String,java.lang.String>`](../collect/ImmutableListMultimap.md)

### `TOKEN_MATCHER`

**Type:** [`com.google.common.base.CharMatcher`](../base/CharMatcher.md)

### `QUOTED_TEXT_MATCHER`

**Type:** [`com.google.common.base.CharMatcher`](../base/CharMatcher.md)

### `LINEAR_WHITE_SPACE`

**Type:** [`com.google.common.base.CharMatcher`](../base/CharMatcher.md)

### `APPLICATION_TYPE`

**Type:** `java.lang.String`

### `AUDIO_TYPE`

**Type:** `java.lang.String`

### `IMAGE_TYPE`

**Type:** `java.lang.String`

### `TEXT_TYPE`

**Type:** `java.lang.String`

### `VIDEO_TYPE`

**Type:** `java.lang.String`

### `FONT_TYPE`

**Type:** `java.lang.String`

### `WILDCARD`

**Type:** `java.lang.String`

### `KNOWN_TYPES`

**Type:** `java.util.Map<com.google.common.net.MediaType,com.google.common.net.MediaType>`

### `ANY_TYPE`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `ANY_TEXT_TYPE`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `ANY_IMAGE_TYPE`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `ANY_AUDIO_TYPE`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `ANY_VIDEO_TYPE`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `ANY_APPLICATION_TYPE`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `ANY_FONT_TYPE`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `CACHE_MANIFEST_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `CSS_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `CSV_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `HTML_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `I_CALENDAR_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `PLAIN_TEXT_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `TEXT_JAVASCRIPT_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `TSV_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `VCARD_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `WML_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `XML_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `VTT_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `BMP`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `CRW`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

It is found in
 /etc/mime.types, e.g. in [Debian 3.48-1](http://anonscm.debian.org/gitweb/?p=collab-maint/mime-support.git;a=blob;f=mime.types;hb=HEAD).

### `GIF`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `ICO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `JPEG`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `PNG`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `PSD`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

[](http://svn.apache.org/repos/asf/httpd/httpd/branches/1.3.x/conf/mime.types) of the
 Apache [HTTPD project](http://httpd.apache.org/); for the specification, see [
 Adobe Photoshop Document Format](http://www.adobe.com/devnet-apps/photoshop/fileformatashtml/PhotoshopFileFormats.htm) and [Wikipedia](http://en.wikipedia.org/wiki/Adobe_Photoshop#File_format); this is the
 regular output/input of Photoshop (which can also export to various image formats; note that
 files with extension "PSB" are in a distinct but related format).

 
This is a more recent replacement for the older, experimental type x-photoshop: [RFC-2046.6](http://tools.ietf.org/html/rfc2046#section-6).

### `SVG_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `TIFF`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `WEBP`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `HEIF`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `JP2K`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `MP4_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `MPEG_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `OGG_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `WEBM_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `L16_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `L24_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `BASIC_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `AAC_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

For more information, see [Advanced Audio Coding](https://en.wikipedia.org/wiki/Advanced_Audio_Coding).

### `VORBIS_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `WMA_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

For more information, see [file
 name extensions for Windows Media metafiles](https://msdn.microsoft.com/en-us/library/windows/desktop/dd562994(v=vs.85).aspx).

### `WAX_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

For more information, see [file
 name extensions for Windows Media metafiles](https://msdn.microsoft.com/en-us/library/windows/desktop/dd562994(v=vs.85).aspx).

### `VND_REAL_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

For more information, see [this link](http://service.real.com/help/faq/rp8/configrp8win.html).

### `VND_WAVE_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `MP4_VIDEO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `MPEG_VIDEO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `OGG_VIDEO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `QUICKTIME`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `WEBM_VIDEO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `WMV`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `FLV_VIDEO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

For more information, see [this link](http://help.adobe.com/en_US/ActionScript/3.0_ProgrammingAS3/WS5b3ccc516d4fbf351e63e3d118a9b90204-7d48.html).

### `THREE_GPP_VIDEO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

For more information, see [3GPP TS
 26.244](ftp://www.3gpp.org/tsg_sa/TSG_SA/TSGS_23/Docs/PDF/SP-040065.pdf#page=10).

### `THREE_GPP2_VIDEO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

For more information, see [3GPP2
 C.S0050-B](http://www.3gpp2.org/Public_html/specs/C.S0050-B_v1.0_070521.pdf#page=16).

### `APPLICATION_XML_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `ATOM_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `BZIP2`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `DART_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `APPLE_PASSBOOK`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `EOT`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

This is
 [registered
 ](http://www.iana.org/assignments/media-types/application/vnd.ms-fontobject) with the IANA.

### `EPUB`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

This media type is defined in the [EPUB Open Container Format](http://www.idpf.org/epub/30/spec/epub30-ocf.html)
 specification.

### `FORM_DATA`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `KEY_ARCHIVE`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `APPLICATION_BINARY`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

It *should not* be used in
 other situations as it is not specified by any RFC and does not appear in the [/IANA MIME Media Types](http://www.iana.org/assignments/media-types) list. Consider
 #OCTET_STREAM for binary data that is not being served to a browser.

### `GEO_JSON`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `GZIP`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `HAL_JSON`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `JAVASCRIPT_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `JOSE`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `JOSE_JSON`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `JSON_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `JWT`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `MANIFEST_JSON_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `KML`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `KMZ`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `MBOX`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `APPLE_MOBILE_CONFIG`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `MICROSOFT_EXCEL`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `MICROSOFT_OUTLOOK`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `MICROSOFT_POWERPOINT`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `MICROSOFT_WORD`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `MEDIA_PRESENTATION_DESCRIPTION`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

This is [registered](https://www.iana.org/assignments/media-types/application/dash+xml) with
 the IANA.

### `WASM_APPLICATION`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

For more information see [the Web Assembly
 overview](https://webassembly.org/).

### `NACL_APPLICATION`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

For more information see [the
 Developer Guide for Native Client Application Structure](https://developer.chrome.com/native-client/devguide/coding/application-structure).

### `NACL_PORTABLE_APPLICATION`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

For more information see [the
 Developer Guide for Native Client Application Structure](https://developer.chrome.com/native-client/devguide/coding/application-structure).

### `OCTET_STREAM`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `OGG_CONTAINER`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `OOXML_DOCUMENT`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `OOXML_PRESENTATION`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `OOXML_SHEET`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `OPENDOCUMENT_GRAPHICS`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `OPENDOCUMENT_PRESENTATION`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `OPENDOCUMENT_SPREADSHEET`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `OPENDOCUMENT_TEXT`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `OPENSEARCH_DESCRIPTION_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

web browsers).

### `PDF`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `POSTSCRIPT`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `PROTOBUF`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `RDF_XML_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `RTF_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `SFNT`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `SHOCKWAVE_FLASH`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `SKETCHUP`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `SOAP_XML_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

For SOAP 1.1 messages, see XML_UTF_8 per [W3C Note on Simple Object Access Protocol
 (SOAP) 1.1](http://www.w3.org/TR/2000/NOTE-SOAP-20000508/)

### `TAR`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `WOFF`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `WOFF2`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `XHTML_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `XRD_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

This is not yet registered with the IANA, but it is specified
 by OASIS in the [XRD
 definition](http://docs.oasis-open.org/xri/xrd/v1.0/cd02/xrd-1.0-cd02.html) and implemented in projects such as [WebFinger](http://code.google.com/p/webfinger/).

### `ZIP`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `FONT_COLLECTION`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `FONT_OTF`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `FONT_SFNT`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

[RFC 8081](https://tools.ietf.org/html/rfc8081) declares this to be the correct media
 type for SFNT, but application/font-sfnt may be necessary in certain situations
 for compatibility.

### `FONT_TTF`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `FONT_WOFF`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

[RFC 8081](https://tools.ietf.org/html/rfc8081) declares this to be the correct media
 type for SFNT, but application/font-woff may be necessary in certain situations
 for compatibility.

### `FONT_WOFF2`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

[RFC 8081](https://tools.ietf.org/html/rfc8081) declares this to be the correct
 media type for SFNT, but application/font-woff2 may be necessary in certain
 situations for compatibility.

### `type`

**Type:** `java.lang.String`

### `subtype`

**Type:** `java.lang.String`

### `parameters`

**Type:** [`com.google.common.collect.ImmutableListMultimap<java.lang.String,java.lang.String>`](../collect/ImmutableListMultimap.md)

### `toString`

**Type:** `java.lang.String`

### `hashCode`

**Type:** `int`

### `parsedCharset`

**Type:** [`com.google.common.base.Optional<java.nio.charset.Charset>`](../base/Optional.md)

### `PARAMETER_JOINER`

**Type:** `com.google.common.base.Joiner.MapJoiner`

## Constructors

### `<init>(String type, String subtype, ImmutableListMultimap<String,String> parameters)`

**Parameters:**
- `type` (`java.lang.String`)
- `subtype` (`java.lang.String`)
- `parameters` ([`com.google.common.collect.ImmutableListMultimap<java.lang.String,java.lang.String>`](../collect/ImmutableListMultimap.md))

## Methods

### `createConstant(String type, String subtype)`

**Parameters:**
- `type` (`java.lang.String`)
- `subtype` (`java.lang.String`)

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `createConstantUtf8(String type, String subtype)`

**Parameters:**
- `type` (`java.lang.String`)
- `subtype` (`java.lang.String`)

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `addKnownType(MediaType mediaType)`

**Parameters:**
- `mediaType` ([`com.google.common.net.MediaType`](./MediaType.md))

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `type()`

For example, "text" in "text/plain".

**Returns:** `java.lang.String`

### `subtype()`

For example, "plain" in "text/plain".

**Returns:** `java.lang.String`

### `parameters()`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<java.lang.String,java.lang.String>`](../collect/ImmutableListMultimap.md)

### `parametersAsMap()`

**Returns:** `java.util.Map<java.lang.String,com.google.common.collect.ImmutableMultiset<java.lang.String>>`

### `charset()`

**Returns:** [`com.google.common.base.Optional<java.nio.charset.Charset>`](../base/Optional.md)

### `withoutParameters()`

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `withParameters(Multimap<String,String> parameters)`

**Parameters:**
- `parameters` ([`com.google.common.collect.Multimap<java.lang.String,java.lang.String>`](../collect/Multimap.md))

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `withParameters(String attribute, Iterable<String> values)`

If there are no values, any existing parameters with the given attribute are removed.

**Parameters:**
- `attribute` (`java.lang.String`)
- `values` (`java.lang.Iterable<java.lang.String>`)

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `withParameter(String attribute, String value)`

If multiple parameters with the same attributes are necessary use #withParameters(String, Iterable). Prefer #withCharset for setting the charset
 parameter when using a Charset object.

**Parameters:**
- `attribute` (`java.lang.String`)
- `value` (`java.lang.String`)

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `withCharset(Charset charset)`

Only one 
 charset parameter will be present on the new instance regardless of the number set on this
 one.

 
If a charset must be specified that is not supported on this JVM (and thus is not
 representable as a Charset instance), use #withParameter.

**Parameters:**
- `charset` (`java.nio.charset.Charset`)

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `hasWildcard()`

**Returns:** `boolean`

### `is(MediaType mediaTypeRange)`

- The subtype of the argument is the wildcard or equal to the subtype of this instance.
   - All of the parameters present in the argument are present in this instance.
 


 
For example:

 

```

 PLAIN_TEXT_UTF_8.is(PLAIN_TEXT_UTF_8) // true
 PLAIN_TEXT_UTF_8.is(HTML_UTF_8) // false
 PLAIN_TEXT_UTF_8.is(ANY_TYPE) // true
 PLAIN_TEXT_UTF_8.is(ANY_TEXT_TYPE) // true
 PLAIN_TEXT_UTF_8.is(ANY_IMAGE_TYPE) // false
 PLAIN_TEXT_UTF_8.is(ANY_TEXT_TYPE.withCharset(UTF_8)) // true
 PLAIN_TEXT_UTF_8.withoutParameters().is(ANY_TEXT_TYPE.withCharset(UTF_8)) // false
 PLAIN_TEXT_UTF_8.is(ANY_TEXT_TYPE.withCharset(UTF_16)) // false
 
```


 
Note that while it is possible to have the same parameter declared multiple times within a
 media type this method does not consider the number of occurrences of a parameter. For example,
 "text/plain; charset=UTF-8" satisfies "text/plain; charset=UTF-8;
 charset=UTF-8".

**Parameters:**
- `mediaTypeRange` ([`com.google.common.net.MediaType`](./MediaType.md))

**Returns:** `boolean`

### `create(String type, String subtype)`

**Parameters:**
- `type` (`java.lang.String`)
- `subtype` (`java.lang.String`)

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `create(String type, String subtype, Multimap<String,String> parameters)`

**Parameters:**
- `type` (`java.lang.String`)
- `subtype` (`java.lang.String`)
- `parameters` ([`com.google.common.collect.Multimap<java.lang.String,java.lang.String>`](../collect/Multimap.md))

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `createApplicationType(String subtype)`

**Parameters:**
- `subtype` (`java.lang.String`)

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `createAudioType(String subtype)`

**Parameters:**
- `subtype` (`java.lang.String`)

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `createFontType(String subtype)`

**Parameters:**
- `subtype` (`java.lang.String`)

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `createImageType(String subtype)`

**Parameters:**
- `subtype` (`java.lang.String`)

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `createTextType(String subtype)`

**Parameters:**
- `subtype` (`java.lang.String`)

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `createVideoType(String subtype)`

**Parameters:**
- `subtype` (`java.lang.String`)

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `normalizeToken(String token)`

**Parameters:**
- `token` (`java.lang.String`)

**Returns:** `java.lang.String`

### `normalizeParameterValue(String attribute, String value)`

**Parameters:**
- `attribute` (`java.lang.String`)
- `value` (`java.lang.String`)

**Returns:** `java.lang.String`

### `parse(String input)`

**Parameters:**
- `input` (`java.lang.String`)

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `consumeSeparator(MediaType.Tokenizer tokenizer, char c)`

**Parameters:**
- `tokenizer` (`com.google.common.net.MediaType.Tokenizer`)
- `c` (`char`)

**Returns:** `void`

### `equals(Object obj)`

**Parameters:**
- `obj` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `computeToString()`

**Returns:** `java.lang.String`

### `escapeAndQuote(String value)`

**Parameters:**
- `value` (`java.lang.String`)

**Returns:** `java.lang.String`

