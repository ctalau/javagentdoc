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

### `canInsertDocumentFragment(ro.sync.ecss.extensions.api.node.AuthorDocumentFragment fragment, int offset, short validationMode)`

**Returns:** `boolean`

**Parameters:**
- `fragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)): Author fragment.
- `offset` (`int`): The offset where to check if the fragment can be inserted.
- `validationMode` (`short`): VALIDATION_MODE_LAX or VALIDATION_MODE_STRICT_FIRST_CHILD_LAX_OTHERS.

### `canInsertDocumentFragments(ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, int offset, short validationMode)`

**Returns:** `boolean`

**Parameters:**
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](node/AuthorDocumentFragment.md)): Author fragment.
- `offset` (`int`): The offset where to check if the fragments can be inserted.
- `validationMode` (`short`): VALIDATION_MODE_LAX or VALIDATION_MODE_STRICT_FIRST_CHILD_LAX_OTHERS.

### `canInsertText(int offset)`

**Returns:** `boolean`

**Parameters:**
- `offset` (`int`): The offset where to check if text can be inserted.

### `canInsertDocumentFragments(ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[] fragments, ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext insertionContext, short validationMode)`

**Returns:** `boolean`

The 
 insertion context will also be used for resolving namespaces for the nodes inside the fragment.

**Parameters:**
- `fragments` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](node/AuthorDocumentFragment.md)): Author fragments.
- `insertionContext` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): Insertion context.
- `validationMode` (`short`): VALIDATION_MODE_LAX or VALIDATION_MODE_STRICT_FIRST_CHILD_LAX_OTHERS.

### `createWhatElementsCanGoHereContext(int offset)`

**Returns:** [`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)

**Parameters:**
- `offset` (`int`): Offset in document for which to create an element context.

### `createWhatAttributesCanGoHereContext(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Returns:** [`ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext`](../../../contentcompletion/xml/WhatAttributesCanGoHereContext.md)

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The element to to create WhatAttributesCanGoHereContext

### `createWhatPossibleValuesHasAttributeContext(ro.sync.ecss.extensions.api.node.AuthorElement element, java.lang.String attributeName)`

**Returns:** [`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md)

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): The element whose attribute values interest us.
- `attributeName` (`java.lang.String`): The name of attribute to create context.

### `getAuthorSchemaAwareOptions()`

**Returns:** [`ro.sync.ecss.component.AuthorSchemaAwareOptions`](../../component/AuthorSchemaAwareOptions.md)

### `whatAttributesCanGoHere(ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext whatAttributesCanGoHereContext)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

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

 


### `whatElementsCanGoHere(ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext whatElementsCanGoHereContext)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

**Parameters:**
- `whatElementsCanGoHereContext` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): the context for the call. It must have:
 

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
- `ctxt` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md)): The context WhatPossiBleValuesHasAttributeContext.

### `whatPossibleValuesHasElement(ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext ctxt)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

If the element type was an enumeration,
 then a list with the tokens of the enumeration will be returned.

**Parameters:**
- `ctxt` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): The context.

### `getGrammarURLs()`

**Returns:** `java.net.URL[]`

These URLs were set
 using one of the update methods, and includes the URLs that were collected from the calls
 of the `update(InputSource[])` methods.

### `getAttributeDescription(ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext ctxt)`

**Returns:** [`ro.sync.contentcompletion.xml.CIAttribute`](../../../contentcompletion/xml/CIAttribute.md)

This model must be human readable.

**Parameters:**
- `ctxt` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md)): the context describing the target attribute.

### `getEntities()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.NameValue>`

If the DOCTYPE declaration is not changed, the document should not be
 processed each time this method is called.

### `getElementDescription(ro.sync.contentcompletion.xml.Context ctxt)`

**Returns:** [`ro.sync.contentcompletion.xml.CIElement`](../../../contentcompletion/xml/CIElement.md)

This model must be human readable.

**Parameters:**
- `ctxt` ([`ro.sync.contentcompletion.xml.Context`](../../../contentcompletion/xml/Context.md)): the context describing the target element. It contains:

  - The element names stack, having at top the current element name.

  - The element namespaces stack, having at top the current element namespace.

 


### `isElementDescriptionSupported()`

**Returns:** `boolean`

### `getChildrenElements(ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext context)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

**Parameters:**
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): The element context.

### `isLearnSchema()`

**Returns:** `boolean`

This only happens when Oxygen does not detect an associated schema for the XML document 
 and learns the structure of the XML file directly.

### `hasLoadingErrors()`

**Returns:** `boolean`

### `createAuthorDocumentFragment(ro.sync.contentcompletion.xml.CIElement element)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

**Parameters:**
- `element` ([`ro.sync.contentcompletion.xml.CIElement`](../../../contentcompletion/xml/CIElement.md)): The CI Element from which to create a full fragment which can be inserted

### `getGlobalElements()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `getAllPossibleElements()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

We need this for instance if providing content completion
 proposals as a result schema manager for XSLT.

### `getElementToParentsMap(ro.sync.ecss.extensions.api.node.NamespaceContext namespaceContext)`

**Returns:** `java.util.Map<javax.xml.namespace.QName,java.util.Collection<javax.xml.namespace.QName>>`

**Parameters:**
- `namespaceContext` ([`ro.sync.ecss.extensions.api.node.NamespaceContext`](node/NamespaceContext.md)): The namespace declarations active in the document context where this information
 is requested. Can be `null`.

### `getElementToParentsMap(ro.sync.ecss.extensions.api.node.AuthorNode nodeContext)`

**Returns:** `java.util.Map<javax.xml.namespace.QName,java.util.Collection<javax.xml.namespace.QName>>`

**Parameters:**
- `nodeContext` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The node context where this information
 is requested. Can be `null`.

### `getGlobalElements(ro.sync.ecss.extensions.api.node.AuthorNode nodeContext)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

**Parameters:**
- `nodeContext` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md)): The context node

### `isRequiredElement(ro.sync.ecss.extensions.api.node.AuthorElement element)`

**Returns:** `boolean`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md)): the element for which the check is performed.

### `getSchemaRepresentationAsJson()`

**Returns:** `java.lang.String`

