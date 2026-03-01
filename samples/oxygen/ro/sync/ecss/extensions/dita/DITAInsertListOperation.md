# Class: `DITAInsertListOperation`

**Package:** [`ro.sync.ecss.extensions.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.DITAInsertListOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.operations.InsertListOperation`](../commons/operations/InsertListOperation.md)

## Description

## Fields

### `ORDERED_LIST`

**Type:** `java.lang.String`

### `UNORDERED_LIST`

**Type:** `java.lang.String`

### `SIMPLE_LIST`

**Type:** `java.lang.String`

### `logger`

**Type:** `org.slf4j.Logger`

### `ARGUMENTS`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `getConversionElementsChecker()`

**Returns:** `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`

### `insertContent([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) listNode, `java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>` selectedFragmentsInfos)`

**Returns:** `void`

### `getNamespace()`

**Returns:** `java.lang.String`

### `getXMLFragment([`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess, `java.lang.String` listType, `java.lang.String` parentListType)`

**Returns:** `java.lang.String`

### `getListXMLFragment(`java.lang.String` listType, `java.util.Map<java.lang.String,java.lang.String>` attributes, `int` numberOfListItems, [`ro.sync.ecss.extensions.api.AuthorAccess`](../api/AuthorAccess.md) authorAccess)`

**Returns:** `java.lang.StringBuilder`

### `getParentListType([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node)`

**Returns:** `java.lang.String`

### `isListElement([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `isList([`ro.sync.ecss.extensions.api.node.AuthorNode`](../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `getListTypeDescription(`java.lang.String` listType)`

**Returns:** `java.lang.String`

