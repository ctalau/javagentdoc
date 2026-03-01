# Class: `MoveElementOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.MoveElementOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

XPath expressions
 are used to identify the source element and the target location.

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `ARGUMENT_SOURCE_LOCATION`

**Type:** `java.lang.String`

### `ARGUMENT_DELETE_LOCATION`

**Type:** `java.lang.String`

Optional. If missing
 the same node identified as being moved will be removed.

### `ARGUMENT_SURROUND_FRAGMENT`

**Type:** `java.lang.String`

The moved node will be inserted in the first leaf will be this fragment 
 and this fragment containing the moved node will be placed at the destination.

### `ARGUMENT_TARGET_LOCATION`

**Type:** `java.lang.String`

### `ARGUMENT_RELATIVE_LOCATION`

**Type:** `java.lang.String`

### `ARGUMENT_MOVE_ONLY_CONTENT`

**Type:** `java.lang.String`

### `ARGUMENT_PROCESS_CHANGE_MARKERS`

**Type:** `java.lang.String`

### `ARGUMENT_ALWAYS_PRESERVE_TRACKED_CHANGES_IN_MOVED_CONTENT`

**Type:** `java.lang.String`

### `arguments`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `moveNode([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) toMoveNode, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) toDeleteNode, `boolean` selectNode, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `getFragmentToMove([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) toMoveNode, [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md) ctrl, `boolean` alwaysPreserveTrackedChanges, `boolean` moveOnlyContent)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md)

### `moveFragment([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md) fragmentToMove, `int` insertionOffset, `boolean` selectNode, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md) toDeleteNode, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `isAlwaysPreserveTrackChangesTrue([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args)`

**Returns:** `boolean`

### `executeLocationXPath([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.lang.String` xPathExpression, `boolean` processTrackChanges)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

