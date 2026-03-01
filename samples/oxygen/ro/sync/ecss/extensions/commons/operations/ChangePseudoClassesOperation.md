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

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `setOrRemovePseudoClasses([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args, `java.lang.String` xpathLocationKey, `java.lang.String` pseudoClassNamesKey, `boolean` setClasses)`

**Returns:** `void`

### `getTargetElements([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.lang.Object` xpathLocations, `java.lang.Object` includeAllNodes)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

