# Class: `CommonsOperationsUtil`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil`

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `getAttributes(ro.sync.ecss.extensions.api.node.AuthorNode node, boolean includeID)`

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node.
- `includeID` (`boolean`): `true` to also include the id attribute.

### `serializeAttributes(java.util.Map<java.lang.String,java.lang.String> attributes, java.util.Collection<java.lang.String> attributesToSkip)`

**Returns:** `java.lang.String`

**Parameters:**
- `attributes` (`java.util.Map<java.lang.String,java.lang.String>`): The attributes to serialize.
- `attributesToSkip` (`java.util.Collection<java.lang.String>`): The names of the attributes to skip.

### `createAuthorDocumentFragment(ro.sync.ecss.extensions.api.AuthorDocumentController controller, int start, int end, ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper helper)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md)

**Parameters:**
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md)): Author document controller.
- `start` (`int`): Start offset
- `end` (`int`): End offset
- `helper` (`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`): The conversion helper

### `unwrapTags(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorNode nodeToUnwrap)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The Author access.
- `nodeToUnwrap` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node to unwrap.

### `surroundWithFragment(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, boolean schemaAware, java.lang.String xmlFragment)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `schemaAware` (`boolean`): `true` for schema aware operation
- `xmlFragment` (`java.lang.String`): The xml fragment

### `surroundWithFragment(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String xmlFragment, int start, int end)`

**Returns:** `int`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `xmlFragment` (`java.lang.String`): The xml fragment
- `start` (`int`): The start offset. Inclusive.
- `end` (`int`): The end offset. Inclusive.

### `setAttributeValue(ro.sync.ecss.extensions.api.AuthorDocumentController ctrl, ro.sync.ecss.extensions.api.node.AuthorElement targetElement, javax.xml.namespace.QName attributeQName, java.lang.String value, boolean removeIfEmpty)`

**Returns:** `java.lang.String`

If the value is `null` the attribute will
 be removed from the element. If the value is the empty string and removeIfEmpty
 is `true` the attribute will also be removed.

**Parameters:**
- `ctrl` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md)): Attribute controller.
- `targetElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The target element.
- `attributeQName` (`javax.xml.namespace.QName`): Attribute to edit.
- `value` (`java.lang.String`): Current value. Illegal characters in the value WILL NOT be escaped.
- `removeIfEmpty` (`boolean`): `true` to remove the attribute when an empty 
 value is set.

### `setAttributeValue(ro.sync.ecss.extensions.api.AuthorDocumentController ctrl, ro.sync.ecss.extensions.api.node.AuthorElement targetElement, javax.xml.namespace.QName attributeQName, java.lang.String value, java.lang.String normalizedValue, boolean removeIfEmpty)`

**Returns:** `java.lang.String`

If the value is `null` the attribute will
 be removed from the element. If the value is the empty string and removeIfEmpty
 is `true` the attribute will also be removed.

**Parameters:**
- `ctrl` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md)): Attribute controller.
- `targetElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The target element.
- `attributeQName` (`javax.xml.namespace.QName`): Attribute to edit.
- `value` (`java.lang.String`): Current value. Illegal characters in the value WILL NOT be escaped. All entities
 must be already escaped in this value. For example:   

```
ab&quot;c&amp;&#36;
```

- `normalizedValue` (`java.lang.String`): The value with normalized whitespaces and expanded entities. For example: 

```
ab"c&$
```

- `removeIfEmpty` (`boolean`): `true` to remove the attribute when an empty 
 value is set.

### `getAttributeQName(ro.sync.ecss.extensions.api.node.AuthorElement element, java.lang.String attrLocalName, java.lang.String attrNSURI)`

**Returns:** `java.lang.String`

Returns the QName used in the element for that attribute.

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element.
- `attrLocalName` (`java.lang.String`): Attribute local name
- `attrNSURI` (`java.lang.String`): Attribute namespace URI.

### `buildFreshPrefix(ro.sync.ecss.extensions.api.node.NamespaceContext namespaceContext)`

**Returns:** `java.lang.String`

**Parameters:**
- `namespaceContext` ([`ro.sync.ecss.extensions.api.node.NamespaceContext`](../../api/node/NamespaceContext.md)): Namespace context.

### `locateResourceInClasspath(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String resourceFileName)`

**Returns:** `java.net.URL`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `resourceFileName` (`java.lang.String`): The resource file name.

### `locateResourceInClasspathFolder(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String folderName, java.lang.String resourceFileName)`

**Returns:** `java.net.URL`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `folderName` (`java.lang.String`): The name of the folder.
- `resourceFileName` (`java.lang.String`): The resource file name.

### `expandAndResolvePath(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String path)`

**Returns:** `java.net.URL`

Editor variables are
 also accepted and expanded. The path is also passed through the catalog mappings.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `path` (`java.lang.String`): The path to resolve. Can be a file path, an URL path or a path relative
 to the framework directory. Editor variables are also accepted. The path is 
 also passed through the catalog mappings.

### `getPrefix(java.lang.String qName)`

**Returns:** `java.lang.String`

**Parameters:**
- `qName` (`java.lang.String`): q name

### `getLocalName(java.lang.String qName)`

**Returns:** `java.lang.String`

**Parameters:**
- `qName` (`java.lang.String`): q name

### `removeUnwantedAttributes(java.lang.String[] skippedAttributes, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment fragment, ro.sync.ecss.extensions.api.AuthorDocumentController controller)`

**Returns:** `void`

**Parameters:**
- `skippedAttributes` (`java.lang.String[]`): The attributes to be deleted.
- `fragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md)): The author document fragment to be cleared.
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md)): The author document controller.

### `removeCurrentSelection(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `java.util.List<javax.swing.text.Position>`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.

### `removeIntervals(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<ro.sync.ecss.extensions.api.ContentInterval> selectionIntervals)`

**Returns:** `java.util.List<javax.swing.text.Position>`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `selectionIntervals` (`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`): The intervals.

### `getSelectedFragmentsForConversions(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper helper)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `helper` (`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`): Used to check if the elements from selection can be converted 
 in other elements (table cells or list entries)

### `getFragmentsForConversions(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper helper, java.util.List<ro.sync.ecss.extensions.api.ContentInterval> intervals)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `helper` (`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`): Used to check if the elements from selection can be converted 
 in other elements (table cells or list entries)
- `intervals` (`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`): The intervals to convert.

### `getFragmentsForConversions(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper helper, ro.sync.ecss.extensions.api.ContentInterval contentInterval)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `helper` (`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`): Used to check if the elements from selection can be converted 
 in other elements (table cells or list entries)
- `contentInterval` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../api/ContentInterval.md))

### `getFragmentForNode(ro.sync.ecss.extensions.api.node.AuthorNode node, ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper helper, ro.sync.ecss.extensions.api.AuthorDocumentController controller)`

**Returns:** `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node to be converted.
- `helper` (`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`): Used to check if the elements from selection can be converted 
 in other elements (table cells or list entries)
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md)): The document controller.

### `finishCurrentFragment(int startInterval, int currentOffset, ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper helper, ro.sync.ecss.extensions.api.AuthorDocumentController controller)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`

**Parameters:**
- `startInterval` (`int`): The start of the interval.
- `currentOffset` (`int`): The current offset - the end of the interval.
- `helper` (`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`): Used to check if the elements from selection can be converted 
 in other elements (table cells or list entries)
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md)): The document controller.

### `removeEmptyElements(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.Collection<javax.swing.text.Position> emptyElementsPositions)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The Author access.
- `emptyElementsPositions` (`java.util.Collection<javax.swing.text.Position>`): Positions for empty elements

### `isAllowedElement(java.lang.String elementLocalName, int offset, ro.sync.ecss.extensions.api.AuthorSchemaManager authorSchemaManager)`

**Returns:** `boolean`

**Parameters:**
- `elementLocalName` (`java.lang.String`): the local name of the element whose allowance we check.
- `offset` (`int`): the offset where the allowance of the element is checked.
- `authorSchemaManager` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../../api/AuthorSchemaManager.md)): the Author schema manager.

