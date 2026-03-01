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

### `canInsertDocumentFragment([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md) fragment, `int` offset, `short` validationMode)`

**Returns:** `boolean`

### `canInsertDocumentFragments([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](node/AuthorDocumentFragment.md) fragments, `int` offset, `short` validationMode)`

**Returns:** `boolean`

### `canInsertText(`int` offset)`

**Returns:** `boolean`

### `canInsertDocumentFragments([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment[]`](node/AuthorDocumentFragment.md) fragments, [`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md) insertionContext, `short` validationMode)`

**Returns:** `boolean`

The 
 insertion context will also be used for resolving namespaces for the nodes inside the fragment.

### `createWhatElementsCanGoHereContext(`int` offset)`

**Returns:** [`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)

### `createWhatAttributesCanGoHereContext([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) element)`

**Returns:** [`ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext`](../../../contentcompletion/xml/WhatAttributesCanGoHereContext.md)

### `createWhatPossibleValuesHasAttributeContext([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) element, `java.lang.String` attributeName)`

**Returns:** [`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md)

### `getAuthorSchemaAwareOptions()`

**Returns:** [`ro.sync.ecss.component.AuthorSchemaAwareOptions`](../../component/AuthorSchemaAwareOptions.md)

### `whatAttributesCanGoHere([`ro.sync.contentcompletion.xml.WhatAttributesCanGoHereContext`](../../../contentcompletion/xml/WhatAttributesCanGoHereContext.md) whatAttributesCanGoHereContext)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

The returned list of attributes does not include attribute names
 which are already set on the element.

### `whatElementsCanGoHere([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md) whatElementsCanGoHereContext)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `whatPossibleValuesHasAttribute([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md) ctxt)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

If the
 attribute type was an enumeration, then a list with the tokens of the
 enumeration will be returned.

### `whatPossibleValuesHasElement([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md) ctxt)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

If the element type was an enumeration,
 then a list with the tokens of the enumeration will be returned.

### `getGrammarURLs()`

**Returns:** `java.net.URL[]`

These URLs were set
 using one of the update methods, and includes the URLs that were collected from the calls
 of the `update(InputSource[])` methods.

### `getAttributeDescription([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md) ctxt)`

**Returns:** [`ro.sync.contentcompletion.xml.CIAttribute`](../../../contentcompletion/xml/CIAttribute.md)

This model must be human readable.

### `getEntities()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.NameValue>`

If the DOCTYPE declaration is not changed, the document should not be
 processed each time this method is called.

### `getElementDescription([`ro.sync.contentcompletion.xml.Context`](../../../contentcompletion/xml/Context.md) ctxt)`

**Returns:** [`ro.sync.contentcompletion.xml.CIElement`](../../../contentcompletion/xml/CIElement.md)

This model must be human readable.

### `isElementDescriptionSupported()`

**Returns:** `boolean`

### `getChildrenElements([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../contentcompletion/xml/WhatElementsCanGoHereContext.md) context)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `isLearnSchema()`

**Returns:** `boolean`

This only happens when Oxygen does not detect an associated schema for the XML document 
 and learns the structure of the XML file directly.

### `hasLoadingErrors()`

**Returns:** `boolean`

### `createAuthorDocumentFragment([`ro.sync.contentcompletion.xml.CIElement`](../../../contentcompletion/xml/CIElement.md) element)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](node/AuthorDocumentFragment.md)

### `getGlobalElements()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `getAllPossibleElements()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

We need this for instance if providing content completion
 proposals as a result schema manager for XSLT.

### `getElementToParentsMap([`ro.sync.ecss.extensions.api.node.NamespaceContext`](node/NamespaceContext.md) namespaceContext)`

**Returns:** `java.util.Map<javax.xml.namespace.QName,java.util.Collection<javax.xml.namespace.QName>>`

### `getElementToParentsMap([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) nodeContext)`

**Returns:** `java.util.Map<javax.xml.namespace.QName,java.util.Collection<javax.xml.namespace.QName>>`

### `getGlobalElements([`ro.sync.ecss.extensions.api.node.AuthorNode`](node/AuthorNode.md) nodeContext)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `isRequiredElement([`ro.sync.ecss.extensions.api.node.AuthorElement`](node/AuthorElement.md) element)`

**Returns:** `boolean`

### `getSchemaRepresentationAsJson()`

**Returns:** `java.lang.String`

