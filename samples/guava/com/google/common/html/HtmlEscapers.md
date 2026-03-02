# Class: `HtmlEscapers`

**Package:** [`com.google.common.html`](README.md)

**Fully Qualified Name:** `com.google.common.html.HtmlEscapers`

## Description

When possible, avoid manual escaping by using templating
 systems and high-level APIs that provide autoescaping.
 One Google-authored templating system available for external use is [Closure Templates](https://developers.google.com/closure/templates/).

 
HTML escaping is particularly tricky: For example, [some
 elements' text contents must not be HTML escaped](http://goo.gl/5TgZb). As a result, it is impossible to escape an
 HTML document correctly without domain-specific knowledge beyond what HtmlEscapers
 provides. We strongly encourage the use of HTML templating systems.

## Fields

### `HTML_ESCAPER`

**Type:** [`com.google.common.escape.Escaper`](../escape/Escaper.md)

## Constructors

### `<init>()`

## Methods

### `htmlEscaper()`

**Returns:** [`com.google.common.escape.Escaper`](../escape/Escaper.md)

The resulting strings can be used both in
 attribute values and in *most* elements' text contents, provided that the HTML
 document's character encoding can encode any non-ASCII code points in the input (as UTF-8 and
 other Unicode encodings can).

 
**Note:** This escaper only performs minimal escaping to make content structurally
 compatible with HTML. Specifically, it does not perform entity replacement (symbolic or
 numeric), so it does not replace non-ASCII code points with character references. This escaper
 escapes only the following five ASCII characters: '"&<>.

