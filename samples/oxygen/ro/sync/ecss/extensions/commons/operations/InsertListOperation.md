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

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

### `removeEmptyListElements(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<javax.swing.text.Position> positions)`

**Returns:** `java.util.Optional<java.util.Map<java.lang.String,java.lang.String>>`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `positions` (`java.util.List<javax.swing.text.Position>`): The positions where to look for empty lists.

### `getSelectedList(java.util.List<ro.sync.ecss.extensions.api.ContentInterval> intervals)`

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.node.AuthorElement>`

**Parameters:**
- `intervals` (`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`): The intervals.

### `getSelectedList(ro.sync.ecss.extensions.api.ContentInterval interval)`

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.node.AuthorElement>`

**Parameters:**
- `interval` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../api/ContentInterval.md)): The interval.

### `insertFragmentsInListAtOffset(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo> fragmentsToConvert, int offset)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `fragmentsToConvert` (`java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`): The fragments to convert.
- `offset` (`int`): The offset where the list is located.

### `deleteEmptyFragments(java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo> fragmentsToConvert)`

**Returns:** `void`

**Parameters:**
- `fragmentsToConvert` (`java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`): The fragments to convert.

### `shoudConvertElementAtCaret(java.lang.String convertElement, boolean isAtStart)`

**Returns:** `boolean`

**Parameters:**
- `convertElement` (`java.lang.String`)
- `isAtStart` (`boolean`): `true` if the caret is at the start of the element to be converted.

### `getFragmentsToConvert(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<ro.sync.ecss.extensions.api.ContentInterval> intervals)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `intervals` (`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`): The intervals to convert.

### `getIntervalsToConvert(java.lang.String convertElementAtCaretArgValue)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`

**Parameters:**
- `convertElementAtCaretArgValue` (`java.lang.String`): "true", "false" or "auto" controlling if the element at caret should be converted when 
 no selection is found in the document.

### `containsOnlyStartSentinels(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int startOffset, int endOffset)`

**Returns:** `boolean`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `startOffset` (`int`): The start offset.
- `endOffset` (`int`): The end offset (exclusive).

### `getElementAtCaretToConvert(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper helper)`

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.node.AuthorNode>`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `helper` (`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`): Used to check if the elements from selection can be converted 
 in other elements (table cells or list entries)

### `canBeConverted(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper helper, ro.sync.ecss.extensions.api.node.AuthorNode candidate)`

**Returns:** `boolean`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `helper` (`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`): Used to check if the elements from selection can be converted 
 in other elements (table cells or list entries)
- `candidate` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The element to check.

### `isEmptyListElement(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node to check.

### `isListElement(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The element to check.

### `isList(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `boolean`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The element to check.

### `insertAtCaret(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args, boolean schemaAware)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md)): Arguments of the operation.
- `schemaAware` (`boolean`): `true` if the insertion should be schema aware.

### `getParentListType(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Returns:** `java.lang.String`

Can be `null`.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node at offset.

### `getConversionElementsChecker()`

**Returns:** `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`

### `insertContent(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorNode listNode, java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo> selectedFragmentsInfos)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `listNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The list node.
- `selectedFragmentsInfos` (`java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`): The fragments to be inserted.

### `getNamespace()`

**Returns:** `java.lang.String`

### `getXMLFragment(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String listType, java.lang.String parentListType)`

**Returns:** `java.lang.String`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `listType` (`java.lang.String`): The type of the list to be inserted.
- `parentListType` (`java.lang.String`): The type of the parent list, can be `null`

### `getListXMLFragment(java.lang.String listType, java.util.Map<java.lang.String,java.lang.String> listAttributes, int numberOfListItems, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `java.lang.StringBuilder`

**Parameters:**
- `listType` (`java.lang.String`): The list type.
- `listAttributes` (`java.util.Map<java.lang.String,java.lang.String>`): The attributes to add to list items.
- `numberOfListItems` (`int`): The number of list items.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.

### `getListTypeDescription(java.lang.String listType)`

**Returns:** `java.lang.String`

**Parameters:**
- `listType` (`java.lang.String`): The list type.

