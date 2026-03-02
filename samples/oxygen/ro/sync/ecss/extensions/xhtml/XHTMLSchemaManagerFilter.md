# Class: `XHTMLSchemaManagerFilter`

**Package:** [`ro.sync.ecss.extensions.xhtml`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.xhtml.XHTMLSchemaManagerFilter`

**Implements:** [`ro.sync.contentcompletion.xml.SchemaManagerFilter`](../../../contentcompletion/xml/SchemaManagerFilter.md)

## Description

## Fields

### `scriptTypes`

**Type:** `java.lang.String[]`

### `styleTypes`

**Type:** `java.lang.String[]`

## Constructors

### `<init>()`

## Methods

### `filterElements(List<CIElement> elements, WhatElementsCanGoHereContext context)`

**Parameters:**
- `elements` (`java.util.List<ro.sync.contentcompletion.xml.CIElement>`)
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `filterAttributes(List<CIAttribute> attributes, WhatAttributesCanGoHereContext context)`

**Parameters:**
- `attributes` (`java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`)
- `context` ([`ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext`](../../../contentcompletion/xml/WhatAttributesCanGoHereContext.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

### `filterAttributeValues(List<CIValue> attributeValues, WhatPossibleValuesHasAttributeContext context)`

**Parameters:**
- `attributeValues` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `context` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `getLocalName(String qName)`

**Parameters:**
- `qName` (`java.lang.String`): Qualified name.

**Returns:** `java.lang.String`

### `filterElementValues(List<CIValue> elementValues, Context context)`

**Parameters:**
- `elementValues` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `context` ([`ro.sync.contentcompletion.xml.Context`](../../../contentcompletion/xml/Context.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `getDescription()`

**Returns:** `java.lang.String`

