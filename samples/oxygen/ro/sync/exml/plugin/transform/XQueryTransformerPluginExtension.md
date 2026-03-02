# Interface: `XQueryTransformerPluginExtension`

**Package:** [`ro.sync.exml.plugin.transform`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.transform.XQueryTransformerPluginExtension`

**Extends:** [`ro.sync.exml.plugin.PluginExtension`](../PluginExtension.md)

## Description

## Methods

### `getTransformerName()`

**Returns:** `java.lang.String`

### `getDisplayTransformerName()`

**Returns:** `java.lang.String`

### `suportsAutomaticValidation()`

**Returns:** `boolean`

### `getXQueryTransformer(Source source, URIResolver uriResolver, boolean validationOnly)`

**Parameters:**
- `source` (`javax.xml.transform.Source`): The XQuery source.
- `uriResolver` (`javax.xml.transform.URIResolver`): The URI resolver.
- `validationOnly` (`boolean`): `true` if the transformer is used only to compile the query, to see
   if there are any errors.

**Returns:** `javax.xml.transform.Transformer`

