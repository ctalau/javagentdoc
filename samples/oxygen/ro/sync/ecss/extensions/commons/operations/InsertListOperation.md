# Class: `InsertListOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.InsertListOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

## Fields

### `SCHEMA_AWARE_ARGUMENT_DESCRIPTOR`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor`](../../api/ArgumentDescriptor.md)

### `CONVERT_ELEMENT_AT_CARET_ARGUMENT`

**Type:** `java.lang.String`

### `ARG_VALUE_AUTO`

**Type:** `java.lang.String`

### `CONVERT_ELEMENT_AT_CARET_ARGUMENT_DESCRIPTOR`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor`](../../api/ArgumentDescriptor.md)

### `LIST_TYPE_ARGUMENT`

**Type:** `java.lang.String`

### `logger`

**Type:** `org.slf4j.Logger`

### `authorAccess`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)

### `listType`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `removeEmptyListElements([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.util.List<javax.swing.text.Position>` positions)`

**Returns:** `java.util.Optional<java.util.Map<java.lang.String,java.lang.String>>`

### `getSelectedList(`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>` intervals)`

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.node.AuthorElement>`

### `getSelectedList([`ro.sync.ecss.extensions.api.ContentInterval`](../../api/ContentInterval.md) interval)`

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.node.AuthorElement>`

### `insertFragmentsInListAtOffset([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>` fragmentsToConvert, `int` offset)`

**Returns:** `void`

### `deleteEmptyFragments(`java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>` fragmentsToConvert)`

**Returns:** `void`

### `shoudConvertElementAtCaret(`java.lang.String` convertElement, `boolean` isAtStart)`

**Returns:** `boolean`

### `getFragmentsToConvert([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.util.List<ro.sync.ecss.extensions.api.ContentInterval>` intervals)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`

### `getIntervalsToConvert(`java.lang.String` convertElementAtCaretArgValue)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`

### `containsOnlyStartSentinels([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `int` startOffset, `int` endOffset)`

**Returns:** `boolean`

### `getElementAtCaretToConvert([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper` helper)`

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.node.AuthorNode>`

### `canBeConverted([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper` helper, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) candidate)`

**Returns:** `boolean`

### `isEmptyListElement([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `isListElement([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `isList([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node)`

**Returns:** `boolean`

### `insertAtCaret([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args, `boolean` schemaAware)`

**Returns:** `void`

### `getParentListType([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) node)`

**Returns:** `java.lang.String`

Can be `null`.

### `getConversionElementsChecker()`

**Returns:** `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`

### `insertContent([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) listNode, `java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>` selectedFragmentsInfos)`

**Returns:** `void`

### `getNamespace()`

**Returns:** `java.lang.String`

### `getXMLFragment([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.lang.String` listType, `java.lang.String` parentListType)`

**Returns:** `java.lang.String`

### `getListXMLFragment(`java.lang.String` listType, `java.util.Map<java.lang.String,java.lang.String>` listAttributes, `int` numberOfListItems, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** `java.lang.StringBuilder`

### `getListTypeDescription(`java.lang.String` listType)`

**Returns:** `java.lang.String`

