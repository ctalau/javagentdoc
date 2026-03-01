# Class: `SetReadOnlyStatusOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.SetReadOnlyStatusOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

## Fields

### `ARGUMENT_READ_ONLY`

**Type:** `java.lang.String`

The value is `true` if the document should be made read-only.

### `ARGUMENT_READ_ONLY_REASON`

**Type:** `java.lang.String`

If the document is set as read-only and the parameter is not specified, a deafult message will 
 be presented to the user when trying to edit the document..

### `ARGUMENT_READ_ONLY_CODE`

**Type:** `java.lang.String`

It will be accessible through API.
 
 The difference between this argument and #ARGUMENT_READ_ONLY_REASON is that this code does
 not change with the UI language.

### `ARGUMENTS`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

