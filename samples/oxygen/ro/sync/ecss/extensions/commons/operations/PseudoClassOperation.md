# Class: `PseudoClassOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.PseudoClassOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `ARGUMENT_PSEUDOCLASS_NAME`

**Type:** `java.lang.String`

The value is `name`.

### `ARGUMENT_ELEMENT_XPATH_LOCATION`

**Type:** `java.lang.String`

Empty/null for the current element.
 The value is `elementLocation`.

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

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

**Returns:** `void`

### `execute(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String pseudoClassName, ro.sync.ecss.extensions.api.node.AuthorElement targetElement)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The access.
- `pseudoClassName` (`java.lang.String`): The name of the pseudo class.
- `targetElement` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md)): The element that is changed.

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

