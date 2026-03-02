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

**Parameters:**
- `offset` (`int`): Offset in document for which to create an element context.

**Returns:** [`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)

### `createWhatAttributesCanGoHereContext(int offset)`

**Parameters:**
- `offset` (`int`): The current offset

**Returns:** [`ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext`](../../../../../../contentcompletion/xml/WhatAttributesCanGoHereContext.md)

### `createWhatPossibleValuesHasAttributeContext(int offset)`

**Parameters:**
- `offset` (`int`): The offset of the attribute name on the element whose attribute values interest us.

**Returns:** [`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md)

### `whatAttributesCanGoHere(ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext whatAttributesCanGoHereContext)`

**Parameters:**
- `whatAttributesCanGoHereContext` ([`ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext`](../../../../../../contentcompletion/xml/WhatAttributesCanGoHereContext.md)): the context for the call. It must
   have:
   
  
    - elementName              the name of the element in which will be
        done the insertion.
  
    - proxyNamespaceMapping    the proxy - uri mappings defined before the
        insertion point.
  
    - previousAttributesNames  the names of the existing attributes in the
        element, attributes that are before the insertion point.

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

### `whatElementsCanGoHere(ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext whatElementsCanGoHereContext)`

**Parameters:**
- `whatElementsCanGoHereContext` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): the context for the call. It must have:
   
  
    - parentElementName the qName of the parent element
  
    - previousElementNames the list of qNames of the previous elements
  
    - previousElementNamespaces the list of qNames of the previous elements
  
    - proxyNamespaceMapping    the proxy - uri mappings defined before the
        insertion point.

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `whatPossibleValuesHasAttribute(ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext ctxt)`

If the
 attribute type was an enumeration, then a list with the tokens of the
 enumeration will be returned.

**Parameters:**
- `ctxt` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md)): The context WhatPossiBleValuesHasAttributeContext.

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `whatPossibleValuesHasElement(ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext ctxt)`

If the element type was an enumeration,
 then a list with the tokens of the enumeration will be returned.

**Parameters:**
- `ctxt` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): The context.

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `getGrammarURLs()`

These URLs were set
 using one of the update methods, and includes the URLs that were collected from the calls
 of the `update(InputSource[])` methods.

**Returns:** `java.net.URL[]`

### `getAttributeDescription(ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext ctxt)`

This model must be human readable.

**Parameters:**
- `ctxt` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md)): the context describing the target attribute.

**Returns:** [`ro.sync.contentcompletion.xml.CIAttribute`](../../../../../../contentcompletion/xml/CIAttribute.md)

### `getEntities()`

If the DOCTYPE declaration is not changed, the document should not be
 processed each time this method is called.

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.NameValue>`

### `getElementDescription(ro.sync.contentcompletion.xml.Context ctxt)`

This model must be human readable.

**Parameters:**
- `ctxt` ([`ro.sync.contentcompletion.xml.Context`](../../../../../../contentcompletion/xml/Context.md)): the context describing the target element. It contains:
  
    - The element names stack, having at top the current element name.
  
    - The element namespaces stack, having at top the current element namespace.

**Returns:** [`ro.sync.contentcompletion.xml.CIElement`](../../../../../../contentcompletion/xml/CIElement.md)

### `isElementDescriptionSupported()`

**Returns:** `boolean`

### `getChildrenElements(ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext context)`

**Parameters:**
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): The element context.

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `isLearnSchema()`

**Returns:** `boolean`

### `hasLoadingErrors()`

**Returns:** `boolean`

### `getGlobalElements()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

