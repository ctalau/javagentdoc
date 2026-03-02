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

### `doOperation(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

**Returns:** `void`

### `moveNode(AuthorNode toMoveNode, AuthorNode toDeleteNode, boolean selectNode, AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `toMoveNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node to be moved.
- `toDeleteNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node to be deleted
- `selectNode` (`boolean`): `true` if the node should be selected after the move operation
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
   Provides access to specific informations and actions for 
   editor, document, workspace, tables, change tracking, utility a.s.o.
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md)): The map of arguments.

**Returns:** `void`

### `getFragmentToMove(AuthorNode toMoveNode, AuthorDocumentController ctrl, boolean alwaysPreserveTrackedChanges, boolean moveOnlyContent)`

**Parameters:**
- `toMoveNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The context node.
- `ctrl` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../api/AuthorDocumentController.md)): Author document controller.
- `alwaysPreserveTrackedChanges` (`boolean`): `true` to preserve track changes
- `moveOnlyContent` (`boolean`): `true` if only the content of the node is moved.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md)

### `moveFragment(AuthorDocumentFragment fragmentToMove, int insertionOffset, boolean selectNode, AuthorNode toDeleteNode, AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `fragmentToMove` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../../api/node/AuthorDocumentFragment.md)): The fragment to be moved.
- `insertionOffset` (`int`): The location where the fragement is moved.
- `selectNode` (`boolean`): `true` if the node should be selected after the move operation
- `toDeleteNode` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The node to be deleted
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
   Provides access to specific informations and actions for 
   editor, document, workspace, tables, change tracking, utility a.s.o.
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md)): The map of arguments.

**Returns:** `void`

### `isAlwaysPreserveTrackChangesTrue(ArgumentsMap args)`

**Parameters:**
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md)): The arguments.

**Returns:** `boolean`

### `executeLocationXPath(AuthorAccess authorAccess, String xPathExpression, boolean processTrackChanges)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author Access.
- `xPathExpression` (`java.lang.String`): Xpath expression.
- `processTrackChanges` (`boolean`): Process track changes.

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

