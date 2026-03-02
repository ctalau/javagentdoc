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

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../api/ArgumentDescriptor.md)

### `getLIContent(String listType, boolean addPara)`

**Parameters:**
- `listType` (`java.lang.String`): The list type. Allowed values: #ORDERED_LIST, #UNORDERED_LIST,
   #VARIABLE_LIST, and #PROCEDURE
- `addPara` (`boolean`)

**Returns:** `java.lang.String`

### `getDescription()`

**Returns:** `java.lang.String`

### `insertContent(AuthorAccess authorAccess, AuthorNode listNode, List<CommonsOperationsUtil.SelectedFragmentInfo> selectedFragmentsInfos)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md))
- `listNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md))
- `selectedFragmentsInfos` (`java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`)

**Returns:** `void`

### `getFragmentToInsert(AuthorAccess authorAccess, CommonsOperationsUtil.SelectedFragmentInfo selectedFragmentInfo)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md)): The author access.
- `selectedFragmentInfo` (`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo`): The selected fragment info.

**Returns:** `java.lang.StringBuilder`

### `getConversionElementsChecker()`

**Returns:** `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`

### `computeFragment(AuthorNode node, boolean isBlock, int startSelection, int endSelection, AuthorDocumentController controller)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md)): The content node.
- `isBlock` (`boolean`): `true` if the node has display block.
- `startSelection` (`int`): The start of the selection.
- `endSelection` (`int`): The end of the selection.
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../api/AuthorDocumentController.md)): The document controller.

**Returns:** `java.lang.String`

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

