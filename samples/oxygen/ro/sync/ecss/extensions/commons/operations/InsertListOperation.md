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

### `doOperation(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

**Returns:** `void`

### `removeEmptyListElements(AuthorAccess authorAccess, List<Position> positions)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `positions` (`java.util.List<javax.swing.text.Position>`): The positions where to look for empty lists.

**Returns:** `java.util.Optional<java.util.Map<java.lang.String,java.lang.String>>`

### `getSelectedList(List<ContentInterval> intervals)`

**Parameters:**
- `intervals` (`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`): The intervals.

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.node.AuthorElement>`

### `getSelectedList(ContentInterval interval)`

**Parameters:**
- `interval` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../api/ContentInterval.md)): The interval.

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.node.AuthorElement>`

### `insertFragmentsInListAtOffset(AuthorAccess authorAccess, List<CommonsOperationsUtil.SelectedFragmentInfo> fragmentsToConvert, int offset)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `fragmentsToConvert` (`java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`): The fragments to convert.
- `offset` (`int`): The offset where the list is located.

**Returns:** `void`

### `deleteEmptyFragments(List<CommonsOperationsUtil.SelectedFragmentInfo> fragmentsToConvert)`

**Parameters:**
- `fragmentsToConvert` (`java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`): The fragments to convert.

**Returns:** `void`

### `shoudConvertElementAtCaret(String convertElement, boolean isAtStart)`

**Parameters:**
- `convertElement` (`java.lang.String`)
- `isAtStart` (`boolean`): `true` if the caret is at the start of the element to be converted.

**Returns:** `boolean`

### `getFragmentsToConvert(AuthorAccess authorAccess, List<ContentInterval> intervals)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `intervals` (`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`): The intervals to convert.

**Returns:** `java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`

### `getIntervalsToConvert(String convertElementAtCaretArgValue)`

**Parameters:**
- `convertElementAtCaretArgValue` (`java.lang.String`): "true", "false" or "auto" controlling if the element at caret should be converted when 
   no selection is found in the document.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`

### `containsOnlyStartSentinels(AuthorAccess authorAccess, int startOffset, int endOffset)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `startOffset` (`int`): The start offset.
- `endOffset` (`int`): The end offset (exclusive).

**Returns:** `boolean`

### `getElementAtCaretToConvert(AuthorAccess authorAccess, CommonsOperationsUtil.ConversionElementHelper helper)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `helper` (`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`): Used to check if the elements from selection can be converted 
   in other elements (table cells or list entries)

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.node.AuthorNode>`

### `canBeConverted(AuthorAccess authorAccess, CommonsOperationsUtil.ConversionElementHelper helper, AuthorNode candidate)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `helper` (`ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`): Used to check if the elements from selection can be converted 
   in other elements (table cells or list entries)
- `candidate` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The element to check.

**Returns:** `boolean`

### `isEmptyListElement(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node to check.

**Returns:** `boolean`

### `isListElement(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The element to check.

**Returns:** `boolean`

### `isList(AuthorNode node)`

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The element to check.

**Returns:** `boolean`

### `insertAtCaret(AuthorAccess authorAccess, ArgumentsMap args, boolean schemaAware)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md)): Arguments of the operation.
- `schemaAware` (`boolean`): `true` if the insertion should be schema aware.

**Returns:** `void`

### `getParentListType(AuthorNode node)`

Can be `null`.

**Parameters:**
- `node` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node at offset.

**Returns:** `java.lang.String`

### `getConversionElementsChecker()`

**Returns:** `ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.ConversionElementHelper`

### `insertContent(AuthorAccess authorAccess, AuthorNode listNode, List<CommonsOperationsUtil.SelectedFragmentInfo> selectedFragmentsInfos)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `listNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The list node.
- `selectedFragmentsInfos` (`java.util.List<ro.sync.ecss.extensions.commons.operations.CommonsOperationsUtil.SelectedFragmentInfo>`): The fragments to be inserted.

**Returns:** `void`

### `getNamespace()`

**Returns:** `java.lang.String`

### `getXMLFragment(AuthorAccess authorAccess, String listType, String parentListType)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
- `listType` (`java.lang.String`): The type of the list to be inserted.
- `parentListType` (`java.lang.String`): The type of the parent list, can be `null`

**Returns:** `java.lang.String`

### `getListXMLFragment(String listType, Map<String,String> listAttributes, int numberOfListItems, AuthorAccess authorAccess)`

**Parameters:**
- `listType` (`java.lang.String`): The list type.
- `listAttributes` (`java.util.Map<java.lang.String,java.lang.String>`): The attributes to add to list items.
- `numberOfListItems` (`int`): The number of list items.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.

**Returns:** `java.lang.StringBuilder`

### `getListTypeDescription(String listType)`

**Parameters:**
- `listType` (`java.lang.String`): The list type.

**Returns:** `java.lang.String`

