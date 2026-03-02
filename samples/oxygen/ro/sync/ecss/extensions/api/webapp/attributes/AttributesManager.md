# Interface: `AttributesManager`

**Package:** [`ro.sync.ecss.extensions.api.webapp.attributes`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.attributes.AttributesManager`

## Description

## Methods

### `getAllAttributes(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../node/AuthorElement.md)): The author element.

### `getPossibleCIValues(ro.sync.ecss.extensions.api.node.AuthorElement element, ro.sync.contentcompletion.xml.CIAttribute attribute)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../node/AuthorElement.md)): The current element.
- `attribute` ([`ro.sync.contentcompletion.xml.CIAttribute`](../../../../../contentcompletion/xml/CIAttribute.md)): The attribute to determine current allowed values for.

