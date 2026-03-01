# Interface: `AuthorDifferencePerformer`

**Package:** [`ro.sync.diff.api`](README.md)

**Fully Qualified Name:** `ro.sync.diff.api.AuthorDifferencePerformer`

## Description

The result of the diff is a list with the differences between the resources.

## Methods

### `setBaseDocument([`ro.sync.ecss.extensions.api.AuthorAccess`](../../ecss/extensions/api/AuthorAccess.md) baseAuthorAccess)`

**Returns:** `void`

It can be `null`.

### `setDocumentsToCompare([`ro.sync.ecss.extensions.api.AuthorAccess`](../../ecss/extensions/api/AuthorAccess.md) leftAuthorAccess, [`ro.sync.ecss.extensions.api.AuthorAccess`](../../ecss/extensions/api/AuthorAccess.md) rightAuthorAccess)`

**Returns:** `void`

### `setOptions([`ro.sync.diff.api.DiffOptions`](./DiffOptions.md) diffOptions)`

**Returns:** `void`

It can be `null` meaning a default set of options will be used.

### `performDiff([`ro.sync.diff.api.DiffProgressListener`](./DiffProgressListener.md) diffProgressListener)`

**Returns:** `java.util.List<ro.sync.diff.api.Difference>`

### `stop()`

**Returns:** `void`

