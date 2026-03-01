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

### `getAttributes([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node, `boolean` includeID)`

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

### `serializeAttributes(`java.util.Map<java.lang.String,java.lang.String>` attributes, `java.util.Collection<java.lang.String>` attributesToSkip)`

**Returns:** `java.lang.String`

### `createAuthorDocumentFragment([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md) controller, `int` start, `int` end, `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper` helper)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md)

### `unwrapTags([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) nodeToUnwrap)`

**Returns:** `void`

### `surroundWithFragment([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `boolean` schemaAware, `java.lang.String` xmlFragment)`

**Returns:** `void`

### `surroundWithFragment([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.lang.String` xmlFragment, `int` start, `int` end)`

**Returns:** `int`

### `setAttributeValue([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md) ctrl, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) targetElement, `javax.xml.namespace.QName` attributeQName, `java.lang.String` value, `boolean` removeIfEmpty)`

**Returns:** `java.lang.String`

If the value is `null` the attribute will
 be removed from the element. If the value is the empty string and removeIfEmpty
 is `true` the attribute will also be removed.

### `setAttributeValue([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md) ctrl, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) targetElement, `javax.xml.namespace.QName` attributeQName, `java.lang.String` value, `java.lang.String` normalizedValue, `boolean` removeIfEmpty)`

**Returns:** `java.lang.String`

If the value is `null` the attribute will
 be removed from the element. If the value is the empty string and removeIfEmpty
 is `true` the attribute will also be removed.

### `getAttributeQName([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element, `java.lang.String` attrLocalName, `java.lang.String` attrNSURI)`

**Returns:** `java.lang.String`

Returns the QName used in the element for that attribute.

### `buildFreshPrefix([`ro.sync.ecss.extensions.api.node.NamespaceContext`](../../api/node/NamespaceContext.md) namespaceContext)`

**Returns:** `java.lang.String`

### `locateResourceInClasspath([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.lang.String` resourceFileName)`

**Returns:** `java.net.URL`

### `locateResourceInClasspathFolder([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.lang.String` folderName, `java.lang.String` resourceFileName)`

**Returns:** `java.net.URL`

### `expandAndResolvePath([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.lang.String` path)`

**Returns:** `java.net.URL`

Editor variables are
 also accepted and expanded. The path is also passed through the catalog mappings.

### `getPrefix(`java.lang.String` qName)`

**Returns:** `java.lang.String`

### `getLocalName(`java.lang.String` qName)`

**Returns:** `java.lang.String`

### `removeUnwantedAttributes(`java.lang.String[]` skippedAttributes, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md) fragment, [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md) controller)`

**Returns:** `void`

### `removeCurrentSelection([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** `java.util.List<javax.swing.text.Position>`

### `removeIntervals([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.util.List<ro.sync.ecss.extensions.api.ContentInterval>` selectionIntervals)`

**Returns:** `java.util.List<javax.swing.text.Position>`

### `getSelectedFragmentsForConversions([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper` helper)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`

### `getFragmentsForConversions([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper` helper, `java.util.List<ro.sync.ecss.extensions.api.ContentInterval>` intervals)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`

### `getFragmentsForConversions([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper` helper, [`ro.sync.ecss.extensions.api.ContentInterval`](../../api/ContentInterval.md) contentInterval)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`

### `getFragmentForNode([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node, `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper` helper, [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md) controller)`

**Returns:** `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo`

### `finishCurrentFragment(`int` startInterval, `int` currentOffset, `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper` helper, [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md) controller)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`

### `removeEmptyElements([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.util.Collection<javax.swing.text.Position>` emptyElementsPositions)`

**Returns:** `void`

### `isAllowedElement(`java.lang.String` elementLocalName, `int` offset, [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../../api/AuthorSchemaManager.md) authorSchemaManager)`

**Returns:** `boolean`

