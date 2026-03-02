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

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

**Returns:** `void`

### `removeEmptyListElements(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<javax.swing.text.Position> positions)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `positions` (`java.util.List<javax.swing.text.Position>`): The positions where to look for empty lists.

**Returns:** `java.util.Optional<java.util.Map<java.lang.String,java.lang.String>>`

### `getSelectedList(java.util.List<ro.sync.ecss.extensions.api.ContentInterval> intervals)`

**Parameters:**
- `intervals` (`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`): The intervals.

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.node.AuthorElement>`

### `getSelectedList(ro.sync.ecss.extensions.api.ContentInterval interval)`

**Parameters:**
- `interval` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../api/ContentInterval.md)): The interval.

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.node.AuthorElement>`

### `insertFragmentsInListAtOffset(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo> fragmentsToConvert, int offset)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `fragmentsToConvert` (`java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`): The fragments to convert.
- `offset` (`int`): The offset where the list is located.

**Returns:** `void`

### `deleteEmptyFragments(java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo> fragmentsToConvert)`

**Parameters:**
- `fragmentsToConvert` (`java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`): The fragments to convert.

**Returns:** `void`

### `shoudConvertElementAtCaret(java.lang.String convertElement, boolean isAtStart)`

**Parameters:**
- `convertElement` (`java.lang.String`)
- `isAtStart` (`boolean`): `true` if the caret is at the start of the element to be converted.

**Returns:** `boolean`

### `getFragmentsToConvert(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<ro.sync.ecss.extensions.api.ContentInterval> intervals)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `intervals` (`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`): The intervals to convert.

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`

### `getIntervalsToConvert(java.lang.String convertElementAtCaretArgValue)`

**Parameters:**
- `convertElementAtCaretArgValue` (`java.lang.String`): "true", "false" or "auto" controlling if the element at caret should be converted when 
   no selection is found in the document.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`

### `containsOnlyStartSentinels(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int startOffset, int endOffset)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `startOffset` (`int`): The start offset.
- `endOffset` (`int`): The end offset (exclusive).

**Returns:** `boolean`

### `getElementAtCaretToConvert(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper helper)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `helper` (`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`): Used to check if the elements from selection can be converted 
   in other elements (table cells or list entries)

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.node.AuthorNode>`

### `canBeConverted(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper helper, ro.sync.ecss.extensions.api.node.AuthorNode candidate)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `helper` (`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`): Used to check if the elements from selection can be converted 
   in other elements (table cells or list entries)
- `candidate` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The element to check.

**Returns:** `boolean`

### `isEmptyListElement(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node to check.

**Returns:** `boolean`

### `isListElement(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The element to check.

**Returns:** `boolean`

### `isList(ro.sync.ecss.extensions.api.node.AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The element to check.

**Returns:** `boolean`

### `insertAtCaret(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args, boolean schemaAware)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md)): Arguments of the operation.
- `schemaAware` (`boolean`): `true` if the insertion should be schema aware.

**Returns:** `void`

### `getParentListType(ro.sync.ecss.extensions.api.node.AuthorNode node)`

Can be `null`.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node at offset.

**Returns:** `java.lang.String`

### `getConversionElementsChecker()`

**Returns:** `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`

### `insertContent(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorNode listNode, java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo> selectedFragmentsInfos)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `listNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The list node.
- `selectedFragmentsInfos` (`java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`): The fragments to be inserted.

**Returns:** `void`

### `getNamespace()`

**Returns:** `java.lang.String`

### `getXMLFragment(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String listType, java.lang.String parentListType)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `listType` (`java.lang.String`): The type of the list to be inserted.
- `parentListType` (`java.lang.String`): The type of the parent list, can be `null`

**Returns:** `java.lang.String`

### `getListXMLFragment(java.lang.String listType, java.util.Map<java.lang.String,java.lang.String> listAttributes, int numberOfListItems, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Parameters:**
- `listType` (`java.lang.String`): The list type.
- `listAttributes` (`java.util.Map<java.lang.String,java.lang.String>`): The attributes to add to list items.
- `numberOfListItems` (`int`): The number of list items.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.

**Returns:** `java.lang.StringBuilder`

### `getListTypeDescription(java.lang.String listType)`

**Parameters:**
- `listType` (`java.lang.String`): The list type.

**Returns:** `java.lang.String`

