# Interface: `ExecuteMultipleActionsWithExtraAskValuesOperation`

**Package:** [`ro.sync.ecss.extensions`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.ExecuteMultipleActionsWithExtraAskValuesOperation`

**Extends:** [`ro.sync.ecss.extensions.api.AuthorOperation`](api/AuthorOperation.md)

## Description

## Methods

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args, java.util.List<java.lang.String> asksValues)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](api/AuthorAccess.md)): The Author access.
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](api/ArgumentsMap.md)): The arguments.
- `asksValues` (`java.util.List<java.lang.String>`): The list of expanded asks variables for all inner actions.

### `getActions(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.util.Map arguments)`

**Returns:** `java.util.List<java.lang.Object>`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](api/AuthorAccess.md)): Author access.
- `arguments` (`java.util.Map`): The arguments.

