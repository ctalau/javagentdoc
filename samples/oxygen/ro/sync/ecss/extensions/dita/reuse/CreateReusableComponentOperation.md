# Class: `CreateReusableComponentOperation`

**Package:** [`ro.sync.ecss.extensions.dita.reuse`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.reuse.CreateReusableComponentOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md), [`ro.sync.ecss.extensions.api.DITAUniqueIDAssigner`](../../api/DITAUniqueIDAssigner.md)

## Description

## Constructors

### `<init>()`

## Methods

### `doOperation(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

**Returns:** `void`

### `getArguments()`

The reuse content operation will display a dialog for choosing the file to save to.

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `generateID(AuthorAccess authorAccess, String seed)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `seed` (`java.lang.String`)

**Returns:** `java.lang.String`

