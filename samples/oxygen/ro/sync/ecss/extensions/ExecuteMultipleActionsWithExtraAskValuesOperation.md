# Interface: `ExecuteMultipleActionsWithExtraAskValuesOperation`

**Package:** [`ro.sync.ecss.extensions`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.ExecuteMultipleActionsWithExtraAskValuesOperation`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorOperation`](api/AuthorOperation.md)

## Description

## Methods

### `doOperation(AuthorAccess authorAccess, ArgumentsMap args, List<String> asksValues)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](api/AuthorAccess.md)): The Author access.
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](api/ArgumentsMap.md)): The arguments.
- `asksValues` (`java.util.List<java.lang.String>`): The list of expanded asks variables for all inner actions.

**Returns:** `void`

### `getActions(AuthorAccess authorAccess, Map arguments)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](api/AuthorAccess.md)): Author access.
- `arguments` (`java.util.Map`): The arguments.

**Returns:** `java.util.List<java.lang.Object>`

