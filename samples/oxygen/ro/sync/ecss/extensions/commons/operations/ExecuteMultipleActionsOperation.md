# Class: `ExecuteMultipleActionsOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.ExecuteMultipleActionsOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

The actions must be defined by the corresponding framework, or one of the common actions for all frameworks
 supplied by Oxygen.

## Fields

### `arguments`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `ACTION_IDS`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

**Returns:** `void`

### `getActions(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.Object actionIDs)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `actionIDs` (`java.lang.Object`): Action ids.

**Returns:** `java.util.List<java.lang.Object>`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

