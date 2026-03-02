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

### `getXQueryTransformer(javax.xml.transform.Source source, javax.xml.transform.URIResolver uriResolver, boolean validationOnly)`

**Returns:** `javax.xml.transform.Transformer`

**Parameters:**
- `source` (`javax.xml.transform.Source`): The XQuery source.
- `uriResolver` (`javax.xml.transform.URIResolver`): The URI resolver.
- `validationOnly` (`boolean`): `true` if the transformer is used only to compile the query, to see
 if there are any errors.

