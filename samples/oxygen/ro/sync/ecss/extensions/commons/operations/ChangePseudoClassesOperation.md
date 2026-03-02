# Class: `ChangePseudoClassesOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.ChangePseudoClassesOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

## Fields

### `ARGUMENT_ELEMENT_SET_XPATH_LOCATIONS`

**Type:** `java.lang.String`

### `ARGUMENT_SET_PSEUDOCLASS_NAMES`

**Type:** `java.lang.String`

### `ARGUMENT_ELEMENT_REMOVE_XPATH_LOCATIONS`

**Type:** `java.lang.String`

### `ARGUMENT_REMOVE_PSEUDOCLASS_NAMES`

**Type:** `java.lang.String`

### `ARGUMENT_INCLUDE_ALL_NODES`

**Type:** `java.lang.String`

The value should be `true` in order to include comments, text and CDATA nodes,
 `false` to ignore them.

### `YES`

**Type:** `java.lang.String`

### `NO`

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

### `setOrRemovePseudoClasses(AuthorAccess authorAccess, ArgumentsMap args, String xpathLocationKey, String pseudoClassNamesKey, boolean setClasses)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The Author APi Access.
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md)): Arguments map.
- `xpathLocationKey` (`java.lang.String`): Xpath locations key
- `pseudoClassNamesKey` (`java.lang.String`): Pseudo class names key
- `setClasses` (`boolean`): `true` to set the classes, `false` to remove them.

**Returns:** `void`

### `getTargetElements(AuthorAccess authorAccess, Object xpathLocations, Object includeAllNodes)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Access to Author functionality.
- `xpathLocations` (`java.lang.Object`): The Xpath locations
- `includeAllNodes` (`java.lang.Object`): ChangePseudoClassesOperation#YES in order to include comments, text and CDATA nodes,
                           ChangePseudoClassesOperation#NO to ignore them.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

