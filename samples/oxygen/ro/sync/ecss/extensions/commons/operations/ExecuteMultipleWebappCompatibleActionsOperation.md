# Class: `ExecuteMultipleWebappCompatibleActionsOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.ExecuteMultipleWebappCompatibleActionsOperation`

**Extends:** [`ro.sync.ecss.extensions.commons.operations.ExecuteMultipleActionsOperation`](./ExecuteMultipleActionsOperation.md)

**Implements:** [`ro.sync.ecss.extensions.ExecuteMultipleActionsWithExtraAskValuesOperation`](../../ExecuteMultipleActionsWithExtraAskValuesOperation.md)

## Description

This class is also marked as webapp-compatible.
 
 The actions must be defined by the corresponding framework, or one of the common actions for all frameworks
 supplied by Oxygen.

## Fields

### `LOGGER`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args, java.util.List<java.lang.String> asksValues)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The Author access.
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md)): The arguments.
- `asksValues` (`java.util.List<java.lang.String>`): The list of expanded asks variables for all inner actions.

**Returns:** `void`

### `getActions(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.Map args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` (`java.util.Map`)

**Returns:** `java.util.List<java.lang.Object>`

