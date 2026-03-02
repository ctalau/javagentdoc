# Interface: `SaxonXQueryTransformerPluginExtension`

**Package:** [`ro.sync.exml.plugin.transform`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.transform.SaxonXQueryTransformerPluginExtension`

**Extends:** [`ro.sync.exml.plugin.transform.XQueryTransformerPluginExtension`](./XQueryTransformerPluginExtension.md)

## Description

## Methods

### `getXQueryTransformer(Source source, XQuerySaxonHEAdvancedOptions advOptions, URIResolver uriResolver, boolean validationOnly)`

**Parameters:**
- `source` (`javax.xml.transform.Source`): The XQuery source.
- `advOptions` (`ro.sync.exml.editor.xmleditor.transform.advanced.XQuerySaxonHEAdvancedOptions`): Advanced options. Can be XQuerySaxonHEAdvancedOptions, XQuerySaxonPEAdvancedOptions
   or XQuerySaxonEEAdvancedOptions.
- `uriResolver` (`javax.xml.transform.URIResolver`): The URI resolver.
- `validationOnly` (`boolean`): `true` if the transformer is used only to compile the query, to see
   if there are any errors.

**Returns:** `javax.xml.transform.Transformer`

### `getEdition()`

**Returns:** [`ro.sync.exml.plugin.transform.SaxonEdition`](./SaxonEdition.md)

