# Interface: `AuthorSchemaManager`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorSchemaManager`

## Description

Provides support for obtaining information about what elements, attributes can be inserted 
 in a given context.

## Fields

### `VALIDATION_MODE_LAX`

**Type:** `short`

### `VALIDATION_MODE_STRICT_FIRST_CHILD_LAX_OTHERS`

**Type:** `short`

## Methods

### `canInsertDocumentFragment(AuthorDocumentFragment fragment, int offset, short validationMode)`

**Parameters:**
- `fragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)): Author fragment.
- `offset` (`int`): The offset where to check if the fragment can be inserted.
- `validationMode` (`short`): VALIDATION_MODE_LAX or VALIDATION_MODE_STRICT_FIRST_CHILD_LAX_OTHERS.

**Returns:** `boolean`

### `canInsertDocumentFragments(AuthorDocumentFragment[] fragments, int offset, short validationMode)`

**Parameters:**
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](node/AuthorDocumentFragment.md)): Author fragment.
- `offset` (`int`): The offset where to check if the fragments can be inserted.
- `validationMode` (`short`): VALIDATION_MODE_LAX or VALIDATION_MODE_STRICT_FIRST_CHILD_LAX_OTHERS.

**Returns:** `boolean`

### `canInsertText(int offset)`

**Parameters:**
- `offset` (`int`): The offset where to check if text can be inserted.

**Returns:** `boolean`

### `canInsertDocumentFragments(AuthorDocumentFragment[] fragments, WhatElementsCanGoHereContext insertionContext, short validationMode)`

The 
 insertion context will also be used for resolving namespaces for the nodes inside the fragment.

**Parameters:**
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](node/AuthorDocumentFragment.md)): Author fragments.
- `insertionContext` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): Insertion context.
- `validationMode` (`short`): VALIDATION_MODE_LAX or VALIDATION_MODE_STRICT_FIRST_CHILD_LAX_OTHERS.

**Returns:** `boolean`

### `createWhatElementsCanGoHereContext(int offset)`

**Parameters:**
- `offset` (`int`): Offset in document for which to create an element context.

**Returns:** [`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)

### `createWhatAttributesCanGoHereContext(AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The element to to create WhatAttributesCanGoHereContext

**Returns:** [`ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext`](../../../contentcompletion/xml/WhatAttributesCanGoHereContext.md)

### `createWhatPossibleValuesHasAttributeContext(AuthorElement element, String attributeName)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The element whose attribute values interest us.
- `attributeName` (`java.lang.String`): The name of attribute to create context.

**Returns:** [`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md)

### `getAuthorSchemaAwareOptions()`

**Returns:** [`ro.sync.ecss.component.AuthorSchemaAwareOptions`](../../component/AuthorSchemaAwareOptions.md)

### `whatAttributesCanGoHere(WhatAttributesCanGoHereContext whatAttributesCanGoHereContext)`

The returned list of attributes does not include attribute names
 which are already set on the element.

**Parameters:**
- `whatAttributesCanGoHereContext` ([`ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext`](../../../contentcompletion/xml/WhatAttributesCanGoHereContext.md)): the context for the call. It must
   have:
   
  
    - elementName              the name of the element in which will be
        done the insertion.
  
    - proxyNamespaceMapping    the proxy - uri mappings defined before the
        insertion point.
  
    - previousAttributesNames  the names of the existing attributes in the
        element, attributes that are before the insertion point.

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

### `whatElementsCanGoHere(WhatElementsCanGoHereContext whatElementsCanGoHereContext)`

**Parameters:**
- `whatElementsCanGoHereContext` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): the context for the call. It must have:
   
  
    - parentElementName the qName of the parent element
  
    - previousElementNames the list of qNames of the previous elements
  
    - previousElementNamespaces the list of qNames of the previous elements
  
    - proxyNamespaceMapping    the proxy - uri mappings defined before the
        insertion point.

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `whatPossibleValuesHasAttribute(WhatPossibleValuesHasAttributeContext ctxt)`

If the
 attribute type was an enumeration, then a list with the tokens of the
 enumeration will be returned.

**Parameters:**
- `ctxt` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md)): The context WhatPossiBleValuesHasAttributeContext.

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `whatPossibleValuesHasElement(WhatElementsCanGoHereContext ctxt)`

If the element type was an enumeration,
 then a list with the tokens of the enumeration will be returned.

**Parameters:**
- `ctxt` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): The context.

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `getGrammarURLs()`

These URLs were set
 using one of the update methods, and includes the URLs that were collected from the calls
 of the `update(InputSource[])` methods.

**Returns:** `java.net.URL[]`

### `getAttributeDescription(WhatPossibleValuesHasAttributeContext ctxt)`

This model must be human readable.

**Parameters:**
- `ctxt` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md)): the context describing the target attribute.

**Returns:** [`ro.sync.contentcompletion.xml.CIAttribute`](../../../contentcompletion/xml/CIAttribute.md)

### `getEntities()`

If the DOCTYPE declaration is not changed, the document should not be
 processed each time this method is called.

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.NameValue>`

### `getElementDescription(Context ctxt)`

This model must be human readable.

**Parameters:**
- `ctxt` ([`ro.sync.contentcompletion.xml.Context`](../../../contentcompletion/xml/Context.md)): the context describing the target element. It contains:
  
    - The element names stack, having at top the current element name.
  
    - The element namespaces stack, having at top the current element namespace.

**Returns:** [`ro.sync.contentcompletion.xml.CIElement`](../../../contentcompletion/xml/CIElement.md)

### `isElementDescriptionSupported()`

**Returns:** `boolean`

### `getChildrenElements(WhatElementsCanGoHereContext context)`

**Parameters:**
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): The element context.

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `isLearnSchema()`

This only happens when Oxygen does not detect an associated schema for the XML document 
 and learns the structure of the XML file directly.

**Returns:** `boolean`

### `hasLoadingErrors()`

**Returns:** `boolean`

### `createAuthorDocumentFragment(CIElement element)`

**Parameters:**
- `element` ([`ro.sync.contentcompletion.xml.CIElement`](../../../contentcompletion/xml/CIElement.md)): The CI Element from which to create a full fragment which can be inserted

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

### `getGlobalElements()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `getAllPossibleElements()`

We need this for instance if providing content completion
 proposals as a result schema manager for XSLT.

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `getElementToParentsMap(NamespaceContext namespaceContext)`

**Parameters:**
- `namespaceContext` ([`ro.sync.ecss.extensions.api.node.NamespaceContext`](node/NamespaceContext.md)): The namespace declarations active in the document context where this information
   is requested. Can be `null`.

**Returns:** `java.util.Map<javax.xml.namespace.QName,java.util.Collection<javax.xml.namespace.QName>>`

### `getElementToParentsMap(AuthorNode nodeContext)`

**Parameters:**
- `nodeContext` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node context where this information
   is requested. Can be `null`.

**Returns:** `java.util.Map<javax.xml.namespace.QName,java.util.Collection<javax.xml.namespace.QName>>`

### `getGlobalElements(AuthorNode nodeContext)`

**Parameters:**
- `nodeContext` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The context node

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `isRequiredElement(AuthorElement element)`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): the element for which the check is performed.

**Returns:** `boolean`

### `getSchemaRepresentationAsJson()`

**Returns:** `java.lang.String`

