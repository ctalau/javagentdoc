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

### `getAttributes(AuthorNode node, boolean includeID)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node.
- `includeID` (`boolean`): `true` to also include the id attribute.

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

### `serializeAttributes(Map<String,String> attributes, Collection<String> attributesToSkip)`

**Parameters:**
- `attributes` (`java.util.Map<java.lang.String,java.lang.String>`): The attributes to serialize.
- `attributesToSkip` (`java.util.Collection<java.lang.String>`): The names of the attributes to skip.

**Returns:** `java.lang.String`

### `createAuthorDocumentFragment(AuthorDocumentController controller, int start, int end, CommonsOperationsUtil.ConversionElementHelper helper)`

**Parameters:**
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md)): Author document controller.
- `start` (`int`): Start offset
- `end` (`int`): End offset
- `helper` (`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`): The conversion helper

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md)

### `unwrapTags(AuthorAccess authorAccess, AuthorNode nodeToUnwrap)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The Author access.
- `nodeToUnwrap` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node to unwrap.

**Returns:** `void`

### `surroundWithFragment(AuthorAccess authorAccess, boolean schemaAware, String xmlFragment)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `schemaAware` (`boolean`): `true` for schema aware operation
- `xmlFragment` (`java.lang.String`): The xml fragment

**Returns:** `void`

### `surroundWithFragment(AuthorAccess authorAccess, String xmlFragment, int start, int end)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `xmlFragment` (`java.lang.String`): The xml fragment
- `start` (`int`): The start offset. Inclusive.
- `end` (`int`): The end offset. Inclusive.

**Returns:** `int`

### `setAttributeValue(AuthorDocumentController ctrl, AuthorElement targetElement, QName attributeQName, String value, boolean removeIfEmpty)`

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

**Returns:** `java.lang.String`

### `setAttributeValue(AuthorDocumentController ctrl, AuthorElement targetElement, QName attributeQName, String value, String normalizedValue, boolean removeIfEmpty)`

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

**Returns:** `java.lang.String`

### `getAttributeQName(AuthorElement element, String attrLocalName, String attrNSURI)`

Returns the QName used in the element for that attribute.

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element.
- `attrLocalName` (`java.lang.String`): Attribute local name
- `attrNSURI` (`java.lang.String`): Attribute namespace URI.

**Returns:** `java.lang.String`

### `buildFreshPrefix(NamespaceContext namespaceContext)`

**Parameters:**
- `namespaceContext` ([`ro.sync.ecss.extensions.api.node.NamespaceContext`](../../api/node/NamespaceContext.md)): Namespace context.

**Returns:** `java.lang.String`

### `locateResourceInClasspath(AuthorAccess authorAccess, String resourceFileName)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `resourceFileName` (`java.lang.String`): The resource file name.

**Returns:** `java.net.URL`

### `locateResourceInClasspathFolder(AuthorAccess authorAccess, String folderName, String resourceFileName)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `folderName` (`java.lang.String`): The name of the folder.
- `resourceFileName` (`java.lang.String`): The resource file name.

**Returns:** `java.net.URL`

### `expandAndResolvePath(AuthorAccess authorAccess, String path)`

Editor variables are
 also accepted and expanded. The path is also passed through the catalog mappings.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `path` (`java.lang.String`): The path to resolve. Can be a file path, an URL path or a path relative
   to the framework directory. Editor variables are also accepted. The path is 
   also passed through the catalog mappings.

**Returns:** `java.net.URL`

### `getPrefix(String qName)`

**Parameters:**
- `qName` (`java.lang.String`): q name

**Returns:** `java.lang.String`

### `getLocalName(String qName)`

**Parameters:**
- `qName` (`java.lang.String`): q name

**Returns:** `java.lang.String`

### `removeUnwantedAttributes(String[] skippedAttributes, AuthorDocumentFragment fragment, AuthorDocumentController controller)`

**Parameters:**
- `skippedAttributes` (`java.lang.String[]`): The attributes to be deleted.
- `fragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md)): The author document fragment to be cleared.
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md)): The author document controller.

**Returns:** `void`

### `removeCurrentSelection(AuthorAccess authorAccess)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.

**Returns:** `java.util.List<javax.swing.text.Position>`

### `removeIntervals(AuthorAccess authorAccess, List<ContentInterval> selectionIntervals)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `selectionIntervals` (`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`): The intervals.

**Returns:** `java.util.List<javax.swing.text.Position>`

### `getSelectedFragmentsForConversions(AuthorAccess authorAccess, CommonsOperationsUtil.ConversionElementHelper helper)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `helper` (`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`): Used to check if the elements from selection can be converted 
   in other elements (table cells or list entries)

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`

### `getFragmentsForConversions(AuthorAccess authorAccess, CommonsOperationsUtil.ConversionElementHelper helper, List<ContentInterval> intervals)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `helper` (`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`): Used to check if the elements from selection can be converted 
   in other elements (table cells or list entries)
- `intervals` (`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`): The intervals to convert.

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`

### `getFragmentsForConversions(AuthorAccess authorAccess, CommonsOperationsUtil.ConversionElementHelper helper, ContentInterval contentInterval)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `helper` (`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`): Used to check if the elements from selection can be converted 
   in other elements (table cells or list entries)
- `contentInterval` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../api/ContentInterval.md))

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`

### `getFragmentForNode(AuthorNode node, CommonsOperationsUtil.ConversionElementHelper helper, AuthorDocumentController controller)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node to be converted.
- `helper` (`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`): Used to check if the elements from selection can be converted 
   in other elements (table cells or list entries)
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md)): The document controller.

**Returns:** `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo`

### `finishCurrentFragment(int startInterval, int currentOffset, CommonsOperationsUtil.ConversionElementHelper helper, AuthorDocumentController controller)`

**Parameters:**
- `startInterval` (`int`): The start of the interval.
- `currentOffset` (`int`): The current offset - the end of the interval.
- `helper` (`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`): Used to check if the elements from selection can be converted 
   in other elements (table cells or list entries)
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md)): The document controller.

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`

### `removeEmptyElements(AuthorAccess authorAccess, Collection<Position> emptyElementsPositions)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The Author access.
- `emptyElementsPositions` (`java.util.Collection<javax.swing.text.Position>`): Positions for empty elements

**Returns:** `void`

### `isAllowedElement(String elementLocalName, int offset, AuthorSchemaManager authorSchemaManager)`

**Parameters:**
- `elementLocalName` (`java.lang.String`): the local name of the element whose allowance we check.
- `offset` (`int`): the offset where the allowance of the element is checked.
- `authorSchemaManager` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../../api/AuthorSchemaManager.md)): the Author schema manager.

**Returns:** `boolean`

