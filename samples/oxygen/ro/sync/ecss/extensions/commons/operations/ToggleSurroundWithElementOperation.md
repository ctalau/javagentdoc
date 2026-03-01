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

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `getSelectedIntervals([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** `java.util.List<int[]>`

### `performToggleSelection([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.lang.String` fragment, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) wrapNode, `boolean` schemaAware)`

**Returns:** `void`

### `isAllWrapped(`java.util.List<ro.sync.ecss.extensions.commons.operations.ToggleSurroundWithElementOperation.IntervalAndAction>` toProcess)`

**Returns:** `boolean`

### `sortAscending(`java.util.List<ro.sync.ecss.extensions.commons.operations.ToggleSurroundWithElementOperation.IntervalAndAction>` toProcess)`

**Returns:** `void`

### `collectToggleIntervals([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.util.List<ro.sync.ecss.extensions.commons.operations.ToggleSurroundWithElementOperation.IntervalAndAction>` collectedIntervals, [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md) ctrl, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) wrapNode, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md) authorFragment, `int[]` balancedInterval, `boolean` raw, `boolean` schemaAware)`

**Returns:** `void`

Either wrapped or unwrapped.
 If an interval can't be toggled it will be split into smaller parts.

### `extendSelectionOverSentinels(`int` startOffset, `int` endOffset, `int` maxStartOffset, `int` maxEndOffset, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** `int[]`

### `getElementAtCaretOffset([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

### `getElementMatchingReferenceElement([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) referenceElement, `boolean` topElement)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

The search starts from the given `startElement ` and continues with its parents. 
 If `topElement` is `true` then the top parent matching element 
 is returned.

### `elementMatchesReferenceElement([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) referenceElement)`

**Returns:** `boolean`

### `getElementFromFragment(`java.lang.String` fragment, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)

If the fragment contains more 
 than one element then an exception is thrown.

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `unwrap([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) element, `int` start, `int` end, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** `int[]`

### `unwrapElementsMatchingReferenceElement(`int` start, `int` end, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) referenceElement, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess)`

**Returns:** `ro.sync.ecss.extensions.commons.operations.ToggleSurroundWithElementOperation.UnwrapResult`

### `canToggleSchemaAware([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `int` start, `int` end, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) wrapNode, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md) surroundFragment)`

**Returns:** `ro.sync.ecss.extensions.commons.operations.ToggleSurroundWithElementOperation.IntervalAndAction`

### `isFullyWrappedInterval([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `int` start, `int` end, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) referenceElement)`

**Returns:** `boolean`

Some code based on the one
 from #unwrapElementsMatchingReferenceElement(int, int, AuthorElement, AuthorAccess)
 (unfortunately copied-it was difficult to extract something sommon) but with a little different interpretations.

### `canWrap([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md) surroundInFragment, `int` start, `int` end, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) parentOfChange, `short` validationMode)`

**Returns:** `boolean`

It first checks if the surrounding fragment is accepted by the schema at the given offset.
 The second check is performed by altering the elements context adding the elements from the surrounding fragment, and
 then it checks if the fragments to be surrounded are accepted in the new context.

### `pushContextElement([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../../../contentcompletion/xml/WhatElementsCanGoHereContext.md) context, `java.lang.String` elementName)`

**Returns:** `void`

### `getElementsPath([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md) fragment)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../../api/node/AuthorElement.md)

### `getEquiIntervalFromMarker([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `int[]` interval)`

**Returns:** `java.util.List<int[]>`

