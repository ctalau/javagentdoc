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

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `execute([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.lang.String` pseudoClassName, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../../api/node/AuthorElement.md) targetElement)`

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

