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

### `<init>(`java.lang.String` arg0)`

## Methods

### `filterElements(`java.util.List<ro.sync.contentcompletion.xml.CIElement>` arg0, [`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](./WhatElementsCanGoHereContext.md) arg1)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `getMappingFileLocation([`ro.sync.contentcompletion.xml.Context`](./Context.md) arg0)`

**Returns:** `java.lang.String`

### `mergeExistingAnnotation(`java.lang.String` arg0, `ro.sync.contentcompletion.xml.styleguide.StyleGuideAnnotation` arg1)`

**Returns:** `java.lang.String`

### `filterAttributes(`java.util.List<ro.sync.contentcompletion.xml.CIAttribute>` arg0, [`ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext`](./WhatAttributesCanGoHereContext.md) arg1)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

### `getElementDescription([`ro.sync.contentcompletion.xml.CIElement`](./CIElement.md) arg0, [`ro.sync.contentcompletion.xml.Context`](./Context.md) arg1)`

**Returns:** [`ro.sync.contentcompletion.xml.CIElement`](./CIElement.md)

### `getAttributeDescription([`ro.sync.contentcompletion.xml.CIAttribute`](./CIAttribute.md) arg0, [`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](./WhatPossibleValuesHasAttributeContext.md) arg1)`

**Returns:** [`ro.sync.contentcompletion.xml.CIAttribute`](./CIAttribute.md)

### `getHTMLDocumentation(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `ro.sync.contentcompletion.xml.styleguide.StyleGuideAnnotation`

### `getDocumentation(`java.lang.String` arg0)`

**Returns:** `java.util.Map<java.lang.String,ro.sync.contentcompletion.xml.styleguide.StyleGuideAnnotation>`

### `getHTMLDocumentationForAttribute(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** `ro.sync.contentcompletion.xml.styleguide.StyleGuideAnnotation`

### `invalidate()`

**Returns:** `void`

### `parseStyleGuideConfigurationMap(`java.lang.String` arg0)`

**Returns:** `void`

### `shouldRedirectThroughOxygenWebSite()`

**Returns:** `boolean`

