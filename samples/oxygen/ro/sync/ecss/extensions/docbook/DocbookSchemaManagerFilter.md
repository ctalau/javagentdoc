# Class: `DocbookSchemaManagerFilter`

**Package:** [`ro.sync.ecss.extensions.docbook`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.docbook.DocbookSchemaManagerFilter`

**Extends:** [`ro.sync.contentcompletion.xml.SchemaManagerFilterBase`](../../../contentcompletion/xml/SchemaManagerFilterBase.md)

## Description

## Fields

### `documentTypeName`

**Type:** `java.lang.String`

## Constructors

### `<init>(String documentTypeName)`

**Parameters:**
- `documentTypeName` (`java.lang.String`): The document type name

## Methods

### `filterAttributeValues(List<CIValue> attributeValues, WhatPossibleValuesHasAttributeContext context)`

**Parameters:**
- `attributeValues` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `context` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `filterAttributes(List<CIAttribute> attributes, WhatAttributesCanGoHereContext context)`

**Parameters:**
- `attributes` (`java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`)
- `context` ([`ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext`](../../../contentcompletion/xml/WhatAttributesCanGoHereContext.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

### `filterElementValues(List<CIValue> elementValues, Context context)`

**Parameters:**
- `elementValues` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `context` ([`ro.sync.contentcompletion.xml.Context`](../../../contentcompletion/xml/Context.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `getDescription()`

**Returns:** `java.lang.String`

### `filterElements(List<CIElement> elements, WhatElementsCanGoHereContext context)`

**Parameters:**
- `elements` (`java.util.List<ro.sync.contentcompletion.xml.CIElement>`)
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

