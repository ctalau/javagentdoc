# Class: `ReplaceElementContentOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.ReplaceElementContentOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

## Fields

### `ARGUMENT_FRAGMENT`

**Type:** `java.lang.String`

### `ARGUMENT_ELEMENT_XPATH_LOCATION`

**Type:** `java.lang.String`

Empty/null for the current element.

### `arguments`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `getFragmentToInsert([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args)`

**Returns:** `java.lang.String`

### `getNodeToReplaceContent([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

