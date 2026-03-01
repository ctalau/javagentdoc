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

### `getListXMLFragment(`java.lang.String` listType, `java.util.Map<java.lang.String,java.lang.String>` attributes, `int` numberOfListItems, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess)`

**Returns:** `java.lang.StringBuilder`

### `getXMLFragment([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, `java.lang.String` listType, `java.lang.String` parentListType)`

**Returns:** `java.lang.String`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../api/ArgumentDescriptor.md)

### `getLIContent(`java.lang.String` listType, `boolean` addPara)`

**Returns:** `java.lang.String`

### `getDescription()`

**Returns:** `java.lang.String`

### `insertContent([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) listNode, `java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>` selectedFragmentsInfos)`

**Returns:** `void`

### `getFragmentToInsert([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo` selectedFragmentInfo)`

**Returns:** `java.lang.StringBuilder`

### `getConversionElementsChecker()`

**Returns:** `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`

### `computeFragment([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node, `boolean` isBlock, `int` startSelection, `int` endSelection, [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../api/AuthorDocumentController.md) controller)`

**Returns:** `java.lang.String`

### `getParentListType([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) nodeAtOffset)`

**Returns:** `java.lang.String`

### `isListElement([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `isList([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `getListTypeDescription(`java.lang.String` listType)`

**Returns:** `java.lang.String`

