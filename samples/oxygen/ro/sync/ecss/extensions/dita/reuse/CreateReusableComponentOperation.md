# Class: `CreateReusableComponentOperation`

**Package:** [`ro.sync.ecss.extensions.dita.reuse`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.reuse.CreateReusableComponentOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md), [`ro.sync.ecss.extensions.api.DITAUniqueIDAssigner`](../../api/DITAUniqueIDAssigner.md)

## Description

## Constructors

### `<init>()`

## Methods

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

The reuse content operation will display a dialog for choosing the file to save to.

### `getDescription()`

**Returns:** `java.lang.String`

### `generateID(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.String seed)`

**Returns:** `java.lang.String`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `seed` (`java.lang.String`)

