# Class: `HeavyViewModeOperation`

**Package:** [`ro.sync.ecss.extensions.dita.map.topicref`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.map.topicref.HeavyViewModeOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../../api/AuthorOperation.md)

## Description

Heavy means that the operation require to open all topic references.
 
 Will show an error if the operation is invoked for documents with many references.

## Fields

### `ARGUMENT_KEY`

**Type:** `java.lang.String`

### `ARGUMENT_ENABLE_VALUE`

**Type:** `java.lang.String`

### `ARGUMENT_DISABLE_VALUE`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

**Returns:** `void`

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, boolean enable)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Author access.
- `enable` (`boolean`): `true` to enable the mode, `false` otherwise.

**Returns:** `void`

### `setPseudoclass(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, boolean enable)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Access to author.
- `enable` (`boolean`): `true` if the pseudoClass should be enabled or not.

**Returns:** `void`

### `getPseudoclass()`

**Returns:** `java.lang.String`

### `doOperationInternal(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, boolean enable)`

Called only if references threshold isn't reached.

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Author access.
- `enable` (`boolean`): `true` if should enable the mode.

**Returns:** `void`

### `showError(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int refsFound, int refsLimit)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)): Author access.
- `refsFound` (`int`): The number of references that the current map lead to.
- `refsLimit` (`int`): The references limit.

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

