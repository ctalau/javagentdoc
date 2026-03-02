# Interface: `XSLTTransformerPluginExtension`

**Package:** [`ro.sync.exml.plugin.transform`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.transform.XSLTTransformerPluginExtension`

**Extends:** [`ro.sync.exml.plugin.PluginExtension`](../PluginExtension.md)

## Description

## Methods

### `getTransformerName()`

**Returns:** `java.lang.String`

### `getDisplayTransformerName()`

**Returns:** `java.lang.String`

### `suportsAutomaticValidation()`

**Returns:** `boolean`

### `getXSLTTransformerFactory(ro.sync.exml.plugin.transform.XSLMessageListener messageListener)`

**Parameters:**
- `messageListener` ([`ro.sync.exml.plugin.transform.XSLMessageListener`](./XSLMessageListener.md)): A listener that will receive events when an xsl:message 
   or xsl:assert is triggered.

**Returns:** `javax.xml.transform.TransformerFactory`

### `isXSLT20Transformer()`

**Returns:** `boolean`

### `isXSLT30Transformer()`

**Returns:** `boolean`

