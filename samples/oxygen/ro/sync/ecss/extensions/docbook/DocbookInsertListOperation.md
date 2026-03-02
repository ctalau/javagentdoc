# Class: `DocbookInsertListOperation`

**Package:** [`ro.sync.ecss.extensions.docbook`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.docbook.DocbookInsertListOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.operations.InsertListOperation`](../commons/operations/InsertListOperation.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `ORDERED_LIST`

**Type:** `java.lang.String`

### `ITEMIZED_LIST`

**Type:** `java.lang.String`

### `VARIABLE_LIST`

**Type:** `java.lang.String`

### `PROCEDURE`

**Type:** `java.lang.String`

### `LIST_ITEM`

**Type:** `java.lang.String`

### `VARLIST_ENTRY`

**Type:** `java.lang.String`

### `STEP`

**Type:** `java.lang.String`

### `LIST_ELEMENTS`

**Type:** `java.util.Set<java.lang.String>`

### `LIST_ITEM_ELEMENTS`

**Type:** `java.util.Set<java.lang.String>`

### `LIST_TYPE_ARGUMENT`

**Type:** `java.lang.String`

### `ARGUMENTS`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `getListXMLFragment(java.lang.String listType, java.util.Map<java.lang.String,java.lang.String> attributes, int numberOfListItems, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `java.lang.StringBuilder`

**Parameters:**
- `listType` (`java.lang.String`)
- `attributes` (`java.util.Map<java.lang.String,java.lang.String>`)
- `numberOfListItems` (`int`)
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))

### `getXMLFragment(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String listType, java.lang.String parentListType)`

**Returns:** `java.lang.String`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `listType` (`java.lang.String`)
- `parentListType` (`java.lang.String`)

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../api/ArgumentDescriptor.md)

### `getLIContent(java.lang.String listType, boolean addPara)`

**Returns:** `java.lang.String`

**Parameters:**
- `listType` (`java.lang.String`): The list type. Allowed values: #ORDERED_LIST, #UNORDERED_LIST,
 #VARIABLE_LIST, and #PROCEDURE
- `addPara` (`boolean`)

### `getDescription()`

**Returns:** `java.lang.String`

### `insertContent(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorNode listNode, java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo> selectedFragmentsInfos)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `listNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))
- `selectedFragmentsInfos` (`java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`)

### `getFragmentToInsert(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo selectedFragmentInfo)`

**Returns:** `java.lang.StringBuilder`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): The author access.
- `selectedFragmentInfo` (`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo`): The selected fragment info.

### `getConversionElementsChecker()`

**Returns:** `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`

### `computeFragment(ro.sync.ecss.extensions.api.node.AuthorNode node, boolean isBlock, int startSelection, int endSelection, ro.sync.ecss.extensions.api.AuthorDocumentController controller)`

**Returns:** `java.lang.String`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): The content node.
- `isBlock` (`boolean`): `true` if the node has display block.
- `startSelection` (`int`): The start of the selection.
- `endSelection` (`int`): The end of the selection.
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../api/AuthorDocumentController.md)): The document controller.

### `getParentListType(ro.sync.ecss.extensions.api.node.AuthorNode nodeAtOffset)`

**Returns:** `java.lang.String`

**Parameters:**
- `nodeAtOffset` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))

### `isListElement(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))

### `isList(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))

### `getListTypeDescription(java.lang.String listType)`

**Returns:** `java.lang.String`

**Parameters:**
- `listType` (`java.lang.String`)

