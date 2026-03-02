# Class: `TEIInsertListOperation`

**Package:** [`ro.sync.ecss.extensions.tei`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.tei.TEIInsertListOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.operations.InsertListOperation`](../commons/operations/InsertListOperation.md)

## Description

## Fields

### `ORDERED_LIST`

**Type:** `java.lang.String`

### `ITEMIZED_LIST`

**Type:** `java.lang.String`

### `logger`

**Type:** `org.slf4j.Logger`

### `ARGUMENTS`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `getListXMLFragment(String listType, Map<String,String> attributes, int numberOfListItems, AuthorAccess authorAccess)`

**Parameters:**
- `listType` (`java.lang.String`)
- `attributes` (`java.util.Map<java.lang.String,java.lang.String>`)
- `numberOfListItems` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))

**Returns:** `java.lang.StringBuilder`

### `getXMLFragment(AuthorAccess authorAccess, String listType, String parentListType)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `listType` (`java.lang.String`)
- `parentListType` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getNamespace()`

**Returns:** `java.lang.String`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../api/ArgumentDescriptor.md)

### `insertContent(AuthorAccess authorAccess, AuthorNode listNode, List<CommonsOperationsUtil.SelectedFragmentInfo> selectedFragmentsInfos)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `listNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))
- `selectedFragmentsInfos` (`java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`)

**Returns:** `void`

### `getDescription()`

**Returns:** `java.lang.String`

### `getConversionElementsChecker()`

**Returns:** `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`

### `getParentListType(AuthorNode nodeAtOffset)`

**Parameters:**
- `nodeAtOffset` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))

**Returns:** `java.lang.String`

### `isListElement(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))

**Returns:** `boolean`

### `isList(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))

**Returns:** `boolean`

### `getListTypeDescription(String listType)`

**Parameters:**
- `listType` (`java.lang.String`)

**Returns:** `java.lang.String`

