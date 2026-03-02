# Class: `ToggleSurroundWithElementOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.ToggleSurroundWithElementOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

Case 1: If there is no selection in the document:
  - if the caret is inside a word
 then the word is wrapped in the given element (or unwrapped if it is already included in the element)
  - else the element is inserted at caret position. 
  
  Case 2: If there is a selection, it is wrapped in the given element 
  (or unwrapped if it is already included in the element)

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `ARGUMENT_ELEMENT`

**Type:** `java.lang.String`

### `ARGUMENTS`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

### `getSelectedIntervals(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `java.util.List<int[]>`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.

### `performToggleSelection(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String fragment, ro.sync.ecss.extensions.api.node.AuthorElement wrapNode, boolean schemaAware)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `fragment` (`java.lang.String`): The fragment to either wrap or unwrap the selection.
- `wrapNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The actual node that is wrapped/unwrapped from the previous fragment.
 We give both to avoid being computed again.
- `schemaAware` (`boolean`): `true` if the operation can interogate the schema.

### `isAllWrapped(java.util.List<ro.sync.ecss.extensions.commons.operations.ToggleSurroundWithElementOperation.IntervalAndAction> toProcess)`

**Returns:** `boolean`

**Parameters:**
- `toProcess` (`java.util.List<ro.sync.ecss.extensions.commons.operations.ToggleSurroundWithElementOperation.IntervalAndAction>`): The intervals to process.

### `sortAscending(java.util.List<ro.sync.ecss.extensions.commons.operations.ToggleSurroundWithElementOperation.IntervalAndAction> toProcess)`

**Returns:** `void`

**Parameters:**
- `toProcess` (`java.util.List<ro.sync.ecss.extensions.commons.operations.ToggleSurroundWithElementOperation.IntervalAndAction>`): Intervals to sort.

### `collectToggleIntervals(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.List<ro.sync.ecss.extensions.commons.operations.ToggleSurroundWithElementOperation.IntervalAndAction> collectedIntervals, ro.sync.ecss.extensions.api.AuthorDocumentController ctrl, ro.sync.ecss.extensions.api.node.AuthorElement wrapNode, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment authorFragment, int[] balancedInterval, boolean raw, boolean schemaAware)`

**Returns:** `void`

Either wrapped or unwrapped.
 If an interval can't be toggled it will be split into smaller parts.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `collectedIntervals` (`java.util.List<ro.sync.ecss.extensions.commons.operations.ToggleSurroundWithElementOperation.IntervalAndAction>`): The list with the intervals that can be toggled.
- `ctrl` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md)): Author document controller.
- `wrapNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The node to wrap/unwrap. We pass this to avoid the overhead of 
 computing it from the fragment.
- `authorFragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md)): The fragment to wrap/unwrap.
- `balancedInterval` (`int[]`): The interval to process.
- `raw` (`boolean`): `true` if this interval comes from the selection model (unprocessed).
- `schemaAware` (`boolean`): `true` if schema information should be used to decide if the toggle is possible.

### `extendSelectionOverSentinels(int startOffset, int endOffset, int maxStartOffset, int maxEndOffset, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `int[]`

**Parameters:**
- `startOffset` (`int`): Start selection offset.
- `endOffset` (`int`): End selection offset.
- `maxStartOffset` (`int`): Maxim start offset.
- `maxEndOffset` (`int`): Maxim end offset.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The object which provides access to Author functions.

### `getElementAtCaretOffset(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.

### `getElementMatchingReferenceElement(ro.sync.ecss.extensions.api.node.AuthorElement element, ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorElement referenceElement, boolean topElement)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

The search starts from the given `startElement ` and continues with its parents. 
 If `topElement` is `true` then the top parent matching element 
 is returned.

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The starting element.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `referenceElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The reference element.
- `topElement` (`boolean`): `true` to return the top matching element.

### `elementMatchesReferenceElement(ro.sync.ecss.extensions.api.node.AuthorElement element, ro.sync.ecss.extensions.api.node.AuthorElement referenceElement)`

**Returns:** `boolean`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element.
- `referenceElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The reference element.

### `getElementFromFragment(java.lang.String fragment, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

If the fragment contains more 
 than one element then an exception is thrown.

**Parameters:**
- `fragment` (`java.lang.String`): The given fragment.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `unwrap(ro.sync.ecss.extensions.api.node.AuthorElement element, int start, int end, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `int[]`

**Parameters:**
- `element` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): Element to unwrap.
- `start` (`int`): Interval start offset (inclusive).
- `end` (`int`): Interval end offset (inclusive).
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.

### `unwrapElementsMatchingReferenceElement(int start, int end, ro.sync.ecss.extensions.api.node.AuthorElement referenceElement, ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** `ro.sync.ecss.extensions.commons.operations.ToggleSurroundWithElementOperation.UnwrapResult`

**Parameters:**
- `start` (`int`): Interval start offset.
- `end` (`int`): Interval end offset.
- `referenceElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The reference element.
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The Author access.

### `canToggleSchemaAware(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int start, int end, ro.sync.ecss.extensions.api.node.AuthorElement wrapNode, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment surroundFragment)`

**Returns:** `ro.sync.ecss.extensions.commons.operations.ToggleSurroundWithElementOperation.IntervalAndAction`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `start` (`int`): The interval start.
- `end` (`int`): The interval end. Inclusive.
- `wrapNode` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The node to wrap/unwrap.
- `surroundFragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md)): The fragment to surround with.

### `isFullyWrappedInterval(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int start, int end, ro.sync.ecss.extensions.api.node.AuthorElement referenceElement)`

**Returns:** `boolean`

Some code based on the one
 from #unwrapElementsMatchingReferenceElement(int, int, AuthorElement, AuthorAccess)
 (unfortunately copied-it was difficult to extract something sommon) but with a little different interpretations.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `start` (`int`): Interval start.
- `end` (`int`): Interval end. Inclusive.
- `referenceElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element to toggle.

### `canWrap(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment surroundInFragment, int start, int end, ro.sync.ecss.extensions.api.node.AuthorNode parentOfChange, short validationMode)`

**Returns:** `boolean`

It first checks if the surrounding fragment is accepted by the schema at the given offset.
 The second check is performed by altering the elements context adding the elements from the surrounding fragment, and
 then it checks if the fragments to be surrounded are accepted in the new context.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `surroundInFragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md)): The fragment used to surround the array of document fragments.
- `start` (`int`): The offset of the surround operation.
- `end` (`int`): The end offset to wrap. Inclusive.
- `parentOfChange` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node containing the change.
- `validationMode` (`short`): The validation mode.

### `pushContextElement(ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext context, java.lang.String elementName)`

**Returns:** `void`

**Parameters:**
- `context` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../../contentcompletion/xml/WhatElementsCanGoHereContext.md)): An element context.
- `elementName` (`java.lang.String`): Element name to push in the context.

### `getElementsPath(ro.sync.ecss.extensions.api.node.AuthorDocumentFragment fragment)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../../api/node/AuthorElement.md)

**Parameters:**
- `fragment` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md)): The document fragment to check.

### `getEquiIntervalFromMarker(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int[] interval)`

**Returns:** `java.util.List<int[]>`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `interval` (`int[]`): The interval to split..

