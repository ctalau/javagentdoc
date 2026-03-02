# Class: `StyleGuideSchemaManagerFilterBase`

**Package:** [`ro.sync.contentcompletion.xml`](README.md)

**Fully Qualified Name:** `ro.sync.contentcompletion.xml.StyleGuideSchemaManagerFilterBase`

**Extends:** [`ro.sync.contentcompletion.xml.SchemaManagerFilterBase`](./SchemaManagerFilterBase.md)

## Fields

### `messages`

**Type:** `ro.sync.i18n.c`

### `logger`

**Type:** `org.slf4j.Logger`

### `locationOfMappingFile`

**Type:** `java.lang.String`

### `STYLE_GUIDE_ELEM_TO_HTML_CONTENT`

**Type:** `java.util.Map<java.lang.String,java.util.Map<java.lang.String,ro.sync.contentcompletion.xml.styleguide.StyleGuideAnnotation>>`

## Constructors

### `<init>()`

### `<init>(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

## Methods

### `filterElements(List<CIElement> arg0, WhatElementsCanGoHereContext arg1)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIElement>`)
- `arg1` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](./WhatElementsCanGoHereContext.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `getMappingFileLocation(Context arg0)`

**Parameters:**
- `arg0` ([`ro.sync.contentcompletion.xml.Context`](./Context.md))

**Returns:** `java.lang.String`

### `mergeExistingAnnotation(String arg0, StyleGuideAnnotation arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`ro.sync.contentcompletion.xml.styleguide.StyleGuideAnnotation`)

**Returns:** `java.lang.String`

### `filterAttributes(List<CIAttribute> arg0, WhatAttributesCanGoHereContext arg1)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`)
- `arg1` ([`ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext`](./WhatAttributesCanGoHereContext.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

### `getElementDescription(CIElement arg0, Context arg1)`

**Parameters:**
- `arg0` ([`ro.sync.contentcompletion.xml.CIElement`](./CIElement.md))
- `arg1` ([`ro.sync.contentcompletion.xml.Context`](./Context.md))

**Returns:** [`ro.sync.contentcompletion.xml.CIElement`](./CIElement.md)

### `getAttributeDescription(CIAttribute arg0, WhatPossibleValuesHasAttributeContext arg1)`

**Parameters:**
- `arg0` ([`ro.sync.contentcompletion.xml.CIAttribute`](./CIAttribute.md))
- `arg1` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](./WhatPossibleValuesHasAttributeContext.md))

**Returns:** [`ro.sync.contentcompletion.xml.CIAttribute`](./CIAttribute.md)

### `getHTMLDocumentation(String arg0, String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `ro.sync.contentcompletion.xml.styleguide.StyleGuideAnnotation`

### `getDocumentation(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.util.Map<java.lang.String,ro.sync.contentcompletion.xml.styleguide.StyleGuideAnnotation>`

### `getHTMLDocumentationForAttribute(String arg0, String arg1, String arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

**Returns:** `ro.sync.contentcompletion.xml.styleguide.StyleGuideAnnotation`

### `invalidate()`

**Returns:** `void`

### `parseStyleGuideConfigurationMap(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `shouldRedirectThroughOxygenWebSite()`

**Returns:** `boolean`

