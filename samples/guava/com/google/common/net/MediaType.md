# Class: `MediaType`

**Package:** [`com.google.common.net`](README.md)

**Fully Qualified Name:** `com.google.common.net.MediaType`

## Description

Represents an <a href="http://en.wikipedia.org/wiki/Internet_media_type">Internet Media Type</a>
 (also known as a MIME Type or Content Type). This class also supports the concept of media ranges
 <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.1">defined by HTTP/1.1</a>.
 As such, the `*` character is treated as a wildcard and is used to represent any acceptable
 type or subtype value. A media type may not have wildcard type with a declared subtype. The
 `*` character has no special meaning as part of a parameter. All values for type, subtype,
 parameter attributes or parameter values must be valid according to RFCs <a href="https://tools.ietf.org/html/rfc2045">2045</a> and <a href="https://tools.ietf.org/html/rfc2046">2046</a>.

 <p>All portions of the media type that are case-insensitive (type, subtype, parameter attributes)
 are normalized to lowercase. The value of the `charset` parameter is normalized to
 lowercase, but all others are left as-is.

 <p>Note that this specifically does <strong>not</strong> represent the value of the MIME `Content-Type` header and as such has no support for header-specific considerations such as line
 folding and comments.

 <p>For media types that take a charset the predefined constants default to UTF-8 and have a
 "_UTF_8" suffix. To get a version without a character set, use `withoutParameters`.
**Since:** 12.0
**Author:** Gregory Kick

## Fields

### `CHARSET_ATTRIBUTE`

**Type:** `java.lang.String`

### `UTF_8_CONSTANT_PARAMETERS`

**Type:** [`com.google.common.collect.ImmutableListMultimap<java.lang.String,java.lang.String>`](../collect/ImmutableListMultimap.md)

### `TOKEN_MATCHER`

**Type:** [`com.google.common.base.CharMatcher`](../base/CharMatcher.md)

Matcher for type, subtype and attributes.

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

Wildcard matching any "font" top-level media type.
**Since:** 30.0

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

<a href="http://www.rfc-editor.org/rfc/rfc4329.txt">RFC 4329</a> declares `JAVASCRIPT_UTF_8 application/javascript` to be the correct media type for JavaScript, but this
 may be necessary in certain situations for compatibility.

### `TSV_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="http://www.iana.org/assignments/media-types/text/tab-separated-values">Tab separated
 values</a>.
**Since:** 15.0

### `VCARD_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `WML_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

UTF-8 encoded <a href="https://en.wikipedia.org/wiki/Wireless_Markup_Language">Wireless Markup
 Language</a>.
**Since:** 13.0

### `XML_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

As described in <a href="http://www.ietf.org/rfc/rfc3023.txt">RFC 3023</a>, this constant
 (`text/xml`) is used for XML documents that are "readable by casual users." `APPLICATION_XML_UTF_8` is provided for documents that are intended for applications.

### `VTT_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

As described in <a href="https://w3c.github.io/webvtt/#iana-text-vtt">the VTT spec</a>, this is
 used for Web Video Text Tracks (WebVTT) files, used with the HTML5 track element.
**Since:** 20.0

### `BMP`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="https://en.wikipedia.org/wiki/BMP_file_format">Bitmap file format</a> (`bmp`
 files).
**Since:** 13.0

### `CRW`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

The <a href="https://en.wikipedia.org/wiki/Camera_Image_File_Format">Canon Image File
 Format</a> (`crw` files), a widely-used "raw image" format for cameras. It is found in
 `/etc/mime.types`, e.g. in <a href="http://anonscm.debian.org/gitweb/?p=collab-maint/mime-support.git;a=blob;f=mime.types;hb=HEAD">Debian 3.48-1</a>.
**Since:** 15.0

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

The Photoshop File Format (`psd` files) as defined by <a href="http://www.iana.org/assignments/media-types/image/vnd.adobe.photoshop">IANA</a>, and
 found in `/etc/mime.types`, e.g. <a href="http://svn.apache.org/repos/asf/httpd/httpd/branches/1.3.x/conf/mime.types"></a> of the
 Apache <a href="http://httpd.apache.org/">HTTPD project</a>; for the specification, see <a href="http://www.adobe.com/devnet-apps/photoshop/fileformatashtml/PhotoshopFileFormats.htm">
 Adobe Photoshop Document Format</a> and <a href="http://en.wikipedia.org/wiki/Adobe_Photoshop#File_format">Wikipedia</a>; this is the
 regular output/input of Photoshop (which can also export to various image formats; note that
 files with extension "PSB" are in a distinct but related format).

 <p>This is a more recent replacement for the older, experimental type `x-photoshop`: <a href="http://tools.ietf.org/html/rfc2046#section-6">RFC-2046.6</a>.
**Since:** 15.0

### `SVG_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `TIFF`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `WEBP`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="https://en.wikipedia.org/wiki/WebP">WebP image format</a>.
**Since:** 13.0

### `HEIF`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="https://www.iana.org/assignments/media-types/image/heif">HEIF image format</a>.
**Since:** 28.1

### `JP2K`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="https://tools.ietf.org/html/rfc3745">JP2K image format</a>.
**Since:** 28.1

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

L16 audio, as defined by <a href="https://tools.ietf.org/html/rfc2586">RFC 2586</a>.
**Since:** 24.1

### `L24_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

L24 audio, as defined by <a href="https://tools.ietf.org/html/rfc3190">RFC 3190</a>.
**Since:** 20.0

### `BASIC_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

Basic Audio, as defined by <a href="http://tools.ietf.org/html/rfc2046#section-4.3">RFC
 2046</a>.
**Since:** 20.0

### `AAC_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

Advanced Audio Coding. For more information, see <a href="https://en.wikipedia.org/wiki/Advanced_Audio_Coding">Advanced Audio Coding</a>.
**Since:** 20.0

### `VORBIS_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

Vorbis Audio, as defined by <a href="http://tools.ietf.org/html/rfc5215">RFC 5215</a>.
**Since:** 20.0

### `WMA_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

Windows Media Audio. For more information, see <a href="https://msdn.microsoft.com/en-us/library/windows/desktop/dd562994(v=vs.85).aspx">file
 name extensions for Windows Media metafiles</a>.
**Since:** 20.0

### `WAX_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

Windows Media metafiles. For more information, see <a href="https://msdn.microsoft.com/en-us/library/windows/desktop/dd562994(v=vs.85).aspx">file
 name extensions for Windows Media metafiles</a>.
**Since:** 20.0

### `VND_REAL_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

Real Audio. For more information, see <a href="http://service.real.com/help/faq/rp8/configrp8win.html">this link</a>.
**Since:** 20.0

### `VND_WAVE_AUDIO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

WAVE format, as defined by <a href="https://tools.ietf.org/html/rfc2361">RFC 2361</a>.
**Since:** 20.0

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

Flash video. For more information, see <a href="http://help.adobe.com/en_US/ActionScript/3.0_ProgrammingAS3/WS5b3ccc516d4fbf351e63e3d118a9b90204-7d48.html">this link</a>.
**Since:** 20.0

### `THREE_GPP_VIDEO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

The 3GP multimedia container format. For more information, see <a href="ftp://www.3gpp.org/tsg_sa/TSG_SA/TSGS_23/Docs/PDF/SP-040065.pdf#page=10">3GPP TS
 26.244</a>.
**Since:** 20.0

### `THREE_GPP2_VIDEO`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

The 3G2 multimedia container format. For more information, see <a href="http://www.3gpp2.org/Public_html/specs/C.S0050-B_v1.0_070521.pdf#page=16">3GPP2
 C.S0050-B</a>.
**Since:** 20.0

### `APPLICATION_XML_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

As described in <a href="http://www.ietf.org/rfc/rfc3023.txt">RFC 3023</a>, this constant
 (`application/xml`) is used for XML documents that are "unreadable by casual users."
 `XML_UTF_8` is provided for documents that may be read by users.
**Since:** 14.0

### `ATOM_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `BZIP2`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `DART_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

Files in the <a href="https://www.dartlang.org/articles/embedding-in-html/">dart</a>
 programming language.
**Since:** 19.0

### `APPLE_PASSBOOK`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="https://goo.gl/2QoMvg">Apple Passbook</a>.
**Since:** 19.0

### `EOT`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="http://en.wikipedia.org/wiki/Embedded_OpenType">Embedded OpenType</a> fonts. This is
 <a href="http://www.iana.org/assignments/media-types/application/vnd.ms-fontobject">registered
 </a> with the IANA.
**Since:** 17.0

### `EPUB`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

As described in the <a href="http://idpf.org/epub">International Digital Publishing Forum</a>
 EPUB is the distribution and interchange format standard for digital publications and
 documents. This media type is defined in the <a href="http://www.idpf.org/epub/30/spec/epub30-ocf.html">EPUB Open Container Format</a>
 specification.
**Since:** 15.0

### `FORM_DATA`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `KEY_ARCHIVE`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

As described in <a href="https://www.rsa.com/rsalabs/node.asp?id=2138">PKCS #12: Personal
 Information Exchange Syntax Standard</a>, PKCS #12 defines an archive file format for storing
 many cryptography objects as a single file.
**Since:** 15.0

### `APPLICATION_BINARY`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

This is a non-standard media type, but is commonly used in serving hosted binary files as it is
 <a href="http://code.google.com/p/browsersec/wiki/Part2#Survey_of_content_sniffing_behaviors">
 known not to trigger content sniffing in current browsers</a>. It <i>should not</i> be used in
 other situations as it is not specified by any RFC and does not appear in the <a href="http://www.iana.org/assignments/media-types">/IANA MIME Media Types</a> list. Consider
 `OCTET_STREAM` for binary data that is not being served to a browser.
**Since:** 14.0

### `GEO_JSON`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

Media type for the <a href="https://tools.ietf.org/html/rfc7946">GeoJSON Format</a>, a
 geospatial data interchange format based on JSON.
**Since:** 28.0

### `GZIP`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `HAL_JSON`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="https://tools.ietf.org/html/draft-kelly-json-hal-08#section-3">JSON Hypertext
 Application Language (HAL) documents</a>.
**Since:** 26.0

### `JAVASCRIPT_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="http://www.rfc-editor.org/rfc/rfc4329.txt">RFC 4329</a> declares this to be the
 correct media type for JavaScript, but `TEXT_JAVASCRIPT_UTF_8 text/javascript` may be
 necessary in certain situations for compatibility.

### `JOSE`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

For <a href="https://tools.ietf.org/html/rfc7515">JWS or JWE objects using the Compact
 Serialization</a>.
**Since:** 27.1

### `JOSE_JSON`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

For <a href="https://tools.ietf.org/html/rfc7515">JWS or JWE objects using the JSON
 Serialization</a>.
**Since:** 27.1

### `JSON_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `JWT`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

For <a href="https://tools.ietf.org/html/7519">JWT objects using the compact Serialization</a>.
**Since:** 32.0.0

### `MANIFEST_JSON_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

The <a href="http://www.w3.org/TR/appmanifest/">Manifest for a web application</a>.
**Since:** 19.0

### `KML`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="http://www.opengeospatial.org/standards/kml/">OGC KML (Keyhole Markup Language)</a>.

### `KMZ`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="http://www.opengeospatial.org/standards/kml/">OGC KML (Keyhole Markup Language)</a>,
 compressed using the ZIP format into KMZ archives.

### `MBOX`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

The <a href="https://tools.ietf.org/html/rfc4155">mbox database format</a>.
**Since:** 13.0

### `APPLE_MOBILE_CONFIG`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="http://goo.gl/1pGBFm">Apple over-the-air mobile configuration profiles</a>.
**Since:** 18.0

### `MICROSOFT_EXCEL`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="http://goo.gl/XDQ1h2">Microsoft Excel</a> spreadsheets.

### `MICROSOFT_OUTLOOK`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="http://goo.gl/XrTEqG">Microsoft Outlook</a> items.
**Since:** 27.1

### `MICROSOFT_POWERPOINT`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="http://goo.gl/XDQ1h2">Microsoft Powerpoint</a> presentations.

### `MICROSOFT_WORD`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="http://goo.gl/XDQ1h2">Microsoft Word</a> documents.

### `MEDIA_PRESENTATION_DESCRIPTION`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

Media type for <a href="https://en.wikipedia.org/wiki/Dynamic_Adaptive_Streaming_over_HTTP">Dynamic Adaptive
 Streaming over HTTP (DASH)</a>. This is <a href="https://www.iana.org/assignments/media-types/application/dash+xml">registered</a> with
 the IANA.
**Since:** 28.2

### `WASM_APPLICATION`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

WASM applications. For more information see <a href="https://webassembly.org/">the Web Assembly
 overview</a>.
**Since:** 27.0

### `NACL_APPLICATION`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

NaCl applications. For more information see <a href="https://developer.chrome.com/native-client/devguide/coding/application-structure">the
 Developer Guide for Native Client Application Structure</a>.
**Since:** 20.0

### `NACL_PORTABLE_APPLICATION`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

NaCl portable applications. For more information see <a href="https://developer.chrome.com/native-client/devguide/coding/application-structure">the
 Developer Guide for Native Client Application Structure</a>.
**Since:** 20.0

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

<a href="https://tools.ietf.org/id/draft-ellermann-opensearch-01.html">OpenSearch</a>
 Description files are XML files that describe how a website can be used as a search engine by
 consumers (e.g. web browsers).
**Since:** 28.2

### `PDF`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `POSTSCRIPT`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `PROTOBUF`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="http://tools.ietf.org/html/draft-rfernando-protocol-buffers-00">Protocol buffers</a>
**Since:** 15.0

### `RDF_XML_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="https://en.wikipedia.org/wiki/RDF/XML">RDF/XML</a> documents, which are XML
 serializations of <a href="https://en.wikipedia.org/wiki/Resource_Description_Framework">Resource Description
 Framework</a> graphs.
**Since:** 14.0

### `RTF_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `SFNT`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="https://tools.ietf.org/html/rfc8081">RFC 8081</a> declares `FONT_SFNT font/sfnt` to be the correct media type for SFNT, but this may be necessary in certain
 situations for compatibility.
**Since:** 17.0

### `SHOCKWAVE_FLASH`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `SKETCHUP`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

`skp` files produced by the 3D Modeling software <a href="https://www.sketchup.com/">SketchUp</a>
**Since:** 13.0

### `SOAP_XML_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

As described in <a href="http://www.ietf.org/rfc/rfc3902.txt">RFC 3902</a>, this constant
 (`application/soap+xml`) is used to identify SOAP 1.2 message envelopes that have been
 serialized with XML 1.0.

 <p>For SOAP 1.1 messages, see `XML_UTF_8` per <a href="http://www.w3.org/TR/2000/NOTE-SOAP-20000508/">W3C Note on Simple Object Access Protocol
 (SOAP) 1.1</a>
**Since:** 20.0

### `TAR`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `WOFF`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="https://tools.ietf.org/html/rfc8081">RFC 8081</a> declares `FONT_WOFF font/woff` to be the correct media type for WOFF, but this may be necessary in certain
 situations for compatibility.
**Since:** 17.0

### `WOFF2`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="https://tools.ietf.org/html/rfc8081">RFC 8081</a> declares `FONT_WOFF2 font/woff2` to be the correct media type for WOFF2, but this may be necessary in certain
 situations for compatibility.
**Since:** 20.0

### `XHTML_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `XRD_UTF_8`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

Extensible Resource Descriptors. This is not yet registered with the IANA, but it is specified
 by OASIS in the <a href="http://docs.oasis-open.org/xri/xrd/v1.0/cd02/xrd-1.0-cd02.html">XRD
 definition</a> and implemented in projects such as <a href="http://code.google.com/p/webfinger/">WebFinger</a>.
**Since:** 14.0

### `ZIP`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

### `FONT_COLLECTION`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

A collection of font outlines as defined by <a href="https://tools.ietf.org/html/rfc8081">RFC
 8081</a>.
**Since:** 30.0

### `FONT_OTF`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="https://en.wikipedia.org/wiki/OpenType">Open Type Font Format</a> (OTF) as defined by
 <a href="https://tools.ietf.org/html/rfc8081">RFC 8081</a>.
**Since:** 30.0

### `FONT_SFNT`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="https://en.wikipedia.org/wiki/SFNT">Spline or Scalable Font Format</a> (SFNT). <a href="https://tools.ietf.org/html/rfc8081">RFC 8081</a> declares this to be the correct media
 type for SFNT, but `SFNT application/font-sfnt` may be necessary in certain situations
 for compatibility.
**Since:** 30.0

### `FONT_TTF`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="https://en.wikipedia.org/wiki/TrueType">True Type Font Format</a> (TTF) as defined by
 <a href="https://tools.ietf.org/html/rfc8081">RFC 8081</a>.
**Since:** 30.0

### `FONT_WOFF`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="http://en.wikipedia.org/wiki/Web_Open_Font_Format">Web Open Font Format</a> (WOFF). <a href="https://tools.ietf.org/html/rfc8081">RFC 8081</a> declares this to be the correct media
 type for SFNT, but `WOFF application/font-woff` may be necessary in certain situations
 for compatibility.
**Since:** 30.0

### `FONT_WOFF2`

**Type:** [`com.google.common.net.MediaType`](./MediaType.md)

<a href="http://en.wikipedia.org/wiki/Web_Open_Font_Format">Web Open Font Format</a> (WOFF2).
 <a href="https://tools.ietf.org/html/rfc8081">RFC 8081</a> declares this to be the correct
 media type for SFNT, but `WOFF2 application/font-woff2` may be necessary in certain
 situations for compatibility.
**Since:** 30.0

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

**Type:** [`com.google.common.base.Joiner.MapJoiner`](../base/Joiner/MapJoiner.md)

## Constructors

### `<init>(`java.lang.String` type, `java.lang.String` subtype, [`com.google.common.collect.ImmutableListMultimap<java.lang.String,java.lang.String>`](../collect/ImmutableListMultimap.md) parameters)`

## Methods

### `createConstant(`java.lang.String` type, `java.lang.String` subtype)`

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `createConstantUtf8(`java.lang.String` type, `java.lang.String` subtype)`

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `addKnownType([`com.google.common.net.MediaType`](./MediaType.md) mediaType)`

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `type()`

**Returns:** `java.lang.String`

Returns the top-level media type. For example, `"text"` in `"text/plain"`.

### `subtype()`

**Returns:** `java.lang.String`

Returns the media subtype. For example, `"plain"` in `"text/plain"`.

### `parameters()`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<java.lang.String,java.lang.String>`](../collect/ImmutableListMultimap.md)

Returns a multimap containing the parameters of this media type.

### `parametersAsMap()`

**Returns:** `java.util.Map<java.lang.String,com.google.common.collect.ImmutableMultiset<java.lang.String>>`

### `charset()`

**Returns:** [`com.google.common.base.Optional<java.nio.charset.Charset>`](../base/Optional.md)

Returns an optional charset for the value of the charset parameter if it is specified.
@throws IllegalStateException if multiple charset values have been set for this media type
@throws IllegalCharsetNameException if a charset value is present, but illegal
@throws UnsupportedCharsetException if a charset value is present, but no support is available
     in this instance of the Java virtual machine

### `withoutParameters()`

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

Returns a new instance with the same type and subtype as this instance, but without any
 parameters.

### `withParameters([`com.google.common.collect.Multimap<java.lang.String,java.lang.String>`](../collect/Multimap.md) parameters)`

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

<em>Replaces</em> all parameters with the given parameters.
@throws IllegalArgumentException if any parameter or value is invalid

### `withParameters(`java.lang.String` attribute, `java.lang.Iterable<java.lang.String>` values)`

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

<em>Replaces</em> all parameters with the given attribute with parameters using the given
 values. If there are no values, any existing parameters with the given attribute are removed.
@throws IllegalArgumentException if either `attribute` or `values` is invalid
**Since:** 24.0

### `withParameter(`java.lang.String` attribute, `java.lang.String` value)`

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

<em>Replaces</em> all parameters with the given attribute with a single parameter with the
 given value. If multiple parameters with the same attributes are necessary use `withParameters(String, Iterable)`. Prefer `withCharset` for setting the `charset`
 parameter when using a `Charset` object.
@throws IllegalArgumentException if either `attribute` or `value` is invalid

### `withCharset(`java.nio.charset.Charset` charset)`

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

Returns a new instance with the same type and subtype as this instance, with the `charset` parameter set to the `Charset.name name` of the given charset. Only one `charset` parameter will be present on the new instance regardless of the number set on this
 one.

 <p>If a charset must be specified that is not supported on this JVM (and thus is not
 representable as a `Charset` instance), use `withParameter`.

### `hasWildcard()`

**Returns:** `boolean`

Returns true if either the type or subtype is the wildcard.

### `is([`com.google.common.net.MediaType`](./MediaType.md) mediaTypeRange)`

**Returns:** `boolean`

Returns `true` if this instance falls within the range (as defined by <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html">the HTTP Accept header</a>) given
 by the argument according to three criteria:

 <ol>
   <li>The type of the argument is the wildcard or equal to the type of this instance.
   <li>The subtype of the argument is the wildcard or equal to the subtype of this instance.
   <li>All of the parameters present in the argument are present in this instance.
 </ol>

 <p>For example:

 <pre>`PLAIN_TEXT_UTF_8.is(PLAIN_TEXT_UTF_8) // true
 PLAIN_TEXT_UTF_8.is(HTML_UTF_8) // false
 PLAIN_TEXT_UTF_8.is(ANY_TYPE) // true
 PLAIN_TEXT_UTF_8.is(ANY_TEXT_TYPE) // true
 PLAIN_TEXT_UTF_8.is(ANY_IMAGE_TYPE) // false
 PLAIN_TEXT_UTF_8.is(ANY_TEXT_TYPE.withCharset(UTF_8)) // true
 PLAIN_TEXT_UTF_8.withoutParameters().is(ANY_TEXT_TYPE.withCharset(UTF_8)) // false
 PLAIN_TEXT_UTF_8.is(ANY_TEXT_TYPE.withCharset(UTF_16)) // false
 `</pre>

 <p>Note that while it is possible to have the same parameter declared multiple times within a
 media type this method does not consider the number of occurrences of a parameter. For example,
 `"text/plain; charset=UTF-8"` satisfies `"text/plain; charset=UTF-8;
 charset=UTF-8"`.

### `create(`java.lang.String` type, `java.lang.String` subtype)`

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

Creates a new media type with the given type and subtype.
@throws IllegalArgumentException if type or subtype is invalid or if a wildcard is used for the
     type, but not the subtype.

### `create(`java.lang.String` type, `java.lang.String` subtype, [`com.google.common.collect.Multimap<java.lang.String,java.lang.String>`](../collect/Multimap.md) parameters)`

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

### `createApplicationType(`java.lang.String` subtype)`

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

Creates a media type with the "application" type and the given subtype.
@throws IllegalArgumentException if subtype is invalid

### `createAudioType(`java.lang.String` subtype)`

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

Creates a media type with the "audio" type and the given subtype.
@throws IllegalArgumentException if subtype is invalid

### `createFontType(`java.lang.String` subtype)`

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

Creates a media type with the "font" type and the given subtype.
@throws IllegalArgumentException if subtype is invalid

### `createImageType(`java.lang.String` subtype)`

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

Creates a media type with the "image" type and the given subtype.
@throws IllegalArgumentException if subtype is invalid

### `createTextType(`java.lang.String` subtype)`

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

Creates a media type with the "text" type and the given subtype.
@throws IllegalArgumentException if subtype is invalid

### `createVideoType(`java.lang.String` subtype)`

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

Creates a media type with the "video" type and the given subtype.
@throws IllegalArgumentException if subtype is invalid

### `normalizeToken(`java.lang.String` token)`

**Returns:** `java.lang.String`

### `normalizeParameterValue(`java.lang.String` attribute, `java.lang.String` value)`

**Returns:** `java.lang.String`

### `parse(`java.lang.String` input)`

**Returns:** [`com.google.common.net.MediaType`](./MediaType.md)

Parses a media type from its string representation.
@throws IllegalArgumentException if the input is not parsable

### `consumeSeparator([`com.google.common.net.MediaType.Tokenizer`](MediaType/Tokenizer.md) tokenizer, `char` c)`

**Returns:** `void`

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

Returns the string representation of this media type in the format described in <a href="http://www.ietf.org/rfc/rfc2045.txt">RFC 2045</a>.

### `computeToString()`

**Returns:** `java.lang.String`

### `escapeAndQuote(`java.lang.String` value)`

**Returns:** `java.lang.String`

