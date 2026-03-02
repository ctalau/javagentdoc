# Class: `XHTMLInsertListOperation`

**Package:** [`ro.sync.ecss.extensions.xhtml`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.xhtml.XHTMLInsertListOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.operations.InsertListOperation`](../commons/operations/InsertListOperation.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `ORDERED_LIST`

**Type:** `java.lang.String`

### `UNORDERED_LIST`

**Type:** `java.lang.String`

### `DEFINITION_LIST`

**Type:** `java.lang.String`

### `LIST_ELEMENTS`

**Type:** `java.util.Set<java.lang.String>`

### `ARGUMENTS`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `insertContent(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorNode listNode, java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo> selectedFragmentsInfos)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `listNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))
- `selectedFragmentsInfos` (`java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`)

**Returns:** `void`

### `getNamespace()`

**Returns:** `java.lang.String`

### `getXMLFragment(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String listType, java.lang.String parentListType)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `listType` (`java.lang.String`)
- `parentListType` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getListXMLFragment(java.lang.String listType, java.util.Map<java.lang.String,java.lang.String> attributes, int numberOfListItems, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `listType` (`java.lang.String`)
- `attributes` (`java.util.Map<java.lang.String,java.lang.String>`)
- `numberOfListItems` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))

**Returns:** `java.lang.StringBuilder`

### `getConversionElementsChecker()`

**Returns:** `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`

### `computeFragment(ro.sync.ecss.extensions.api.node.AuthorNode node, boolean isBlock, ro.sync.ecss.extensions.api.AuthorDocumentController controller)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): The content node.
- `isBlock` (`boolean`): `true` if the node has display block.
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../api/AuthorDocumentController.md)): The document controller.

**Returns:** `java.lang.String`

### `getParentListType(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))

**Returns:** `java.lang.String`

### `isListElement(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))

**Returns:** `boolean`

### `isList(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))

**Returns:** `boolean`

### `getListTypeDescription(java.lang.String listType)`

**Parameters:**
- `listType` (`java.lang.String`)

**Returns:** `java.lang.String`

