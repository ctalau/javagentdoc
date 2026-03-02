# Class: `WSTextXMLSchemaManager`

**Package:** [`ro.sync.exml.workspace.api.editor.page.text`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.text.WSTextXMLSchemaManager`

## Description

Provides support for obtaining information about what elements, attributes can be inserted 
 in a given context.

## Constructors

### `<init>()`

## Methods

### `createWhatElementsCanGoHereContext(int offset)`

**Returns:** [`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)

**Parameters:**
- `offset` (`int`): Offset in document for which to create an element context.

### `createWhatAttributesCanGoHereContext(int offset)`

**Returns:** [`ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext`](../../../../../../contentcompletion/xml/WhatAttributesCanGoHereContext.md)

**Parameters:**
- `offset` (`int`): The current offset

### `createWhatPossibleValuesHasAttributeContext(int offset)`

**Returns:** [`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md)

**Parameters:**
- `offset` (`int`): The offset of the attribute name on the element whose attribute values interest us.

### `whatAttributesCanGoHere(ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext whatAttributesCanGoHereContext)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

**Parameters:**
- `whatAttributesCanGoHereContext` ([`ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext`](../../../../../../contentcompletion/xml/WhatAttributesCanGoHereContext.md)): the context for the call. It must
 have:
 

  - elementName              the name of the element in which will be
      done the insertion.

  - proxyNamespaceMapping    the proxy - uri mappings defined before the
      insertion point.

  - previousAttributesNames  the names of the existing attributes in the
      element, attributes that are before the insertion point.

 


### `whatElementsCanGoHere(ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext whatElementsCanGoHereContext)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

**Parameters:**
- `whatElementsCanGoHereContext` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): the context for the call. It must have:
 

  - parentElementName the qName of the parent element

  - previousElementNames the list of qNames of the previous elements

  - previousElementNamespaces the list of qNames of the previous elements

  - proxyNamespaceMapping    the proxy - uri mappings defined before the
      insertion point.

 


### `whatPossibleValuesHasAttribute(ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext ctxt)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

If the
 attribute type was an enumeration, then a list with the tokens of the
 enumeration will be returned.

**Parameters:**
- `ctxt` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md)): The context WhatPossiBleValuesHasAttributeContext.

### `whatPossibleValuesHasElement(ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext ctxt)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

If the element type was an enumeration,
 then a list with the tokens of the enumeration will be returned.

**Parameters:**
- `ctxt` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): The context.

### `getGrammarURLs()`

**Returns:** `java.net.URL[]`

These URLs were set
 using one of the update methods, and includes the URLs that were collected from the calls
 of the `update(InputSource[])` methods.

### `getAttributeDescription(ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext ctxt)`

**Returns:** [`ro.sync.contentcompletion.xml.CIAttribute`](../../../../../../contentcompletion/xml/CIAttribute.md)

This model must be human readable.

**Parameters:**
- `ctxt` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md)): the context describing the target attribute.

### `getEntities()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.NameValue>`

If the DOCTYPE declaration is not changed, the document should not be
 processed each time this method is called.

### `getElementDescription(ro.sync.contentcompletion.xml.Context ctxt)`

**Returns:** [`ro.sync.contentcompletion.xml.CIElement`](../../../../../../contentcompletion/xml/CIElement.md)

This model must be human readable.

**Parameters:**
- `ctxt` ([`ro.sync.contentcompletion.xml.Context`](../../../../../../contentcompletion/xml/Context.md)): the context describing the target element. It contains:

  - The element names stack, having at top the current element name.

  - The element namespaces stack, having at top the current element namespace.

 


### `isElementDescriptionSupported()`

**Returns:** `boolean`

### `getChildrenElements(ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext context)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

**Parameters:**
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): The element context.

### `isLearnSchema()`

**Returns:** `boolean`

### `hasLoadingErrors()`

**Returns:** `boolean`

### `getGlobalElements()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

