# Class: `WSTextXMLSchemaManager`

**Package:** [`ro.sync.exml.workspace.api.editor.page.text`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`

## Description

Provides support for obtaining information about what elements, attributes can be inserted 
 in a given context.

## Constructors

### `<init>()`

## Methods

### `createWhatElementsCanGoHereContext(`int` offset)`

**Returns:** [`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)

### `createWhatAttributesCanGoHereContext(`int` offset)`

**Returns:** [`ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext`](../../../../../../contentcompletion/xml/WhatAttributesCanGoHereContext.md)

### `createWhatPossibleValuesHasAttributeContext(`int` offset)`

**Returns:** [`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md)

### `whatAttributesCanGoHere([`ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext`](../../../../../../contentcompletion/xml/WhatAttributesCanGoHereContext.md) whatAttributesCanGoHereContext)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

### `whatElementsCanGoHere([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../../../../contentcompletion/xml/WhatElementsCanGoHereContext.md) whatElementsCanGoHereContext)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `whatPossibleValuesHasAttribute([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md) ctxt)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

If the
 attribute type was an enumeration, then a list with the tokens of the
 enumeration will be returned.

### `whatPossibleValuesHasElement([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../../../../contentcompletion/xml/WhatElementsCanGoHereContext.md) ctxt)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

If the element type was an enumeration,
 then a list with the tokens of the enumeration will be returned.

### `getGrammarURLs()`

**Returns:** `java.net.URL[]`

These URLs were set
 using one of the update methods, and includes the URLs that were collected from the calls
 of the `update(InputSource[])` methods.

### `getAttributeDescription([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md) ctxt)`

**Returns:** [`ro.sync.contentcompletion.xml.CIAttribute`](../../../../../../contentcompletion/xml/CIAttribute.md)

This model must be human readable.

### `getEntities()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.NameValue>`

If the DOCTYPE declaration is not changed, the document should not be
 processed each time this method is called.

### `getElementDescription([`ro.sync.contentcompletion.xml.Context`](../../../../../../contentcompletion/xml/Context.md) ctxt)`

**Returns:** [`ro.sync.contentcompletion.xml.CIElement`](../../../../../../contentcompletion/xml/CIElement.md)

This model must be human readable.

### `isElementDescriptionSupported()`

**Returns:** `boolean`

### `getChildrenElements([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../../../../contentcompletion/xml/WhatElementsCanGoHereContext.md) context)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `isLearnSchema()`

**Returns:** `boolean`

### `hasLoadingErrors()`

**Returns:** `boolean`

### `getGlobalElements()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

