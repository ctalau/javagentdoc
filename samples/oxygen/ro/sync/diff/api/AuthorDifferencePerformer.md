# Interface: `AuthorDifferencePerformer`

**Package:** [`ro.sync.diff.api`](README.md)

**Fully Qualified Name:** `ro.sync.diff.api.AuthorDifferencePerformer`

## Description

The result of the diff is a list with the differences between the resources.

## Methods

### `setBaseDocument(ro.sync.ecss.extensions.api.AuthorAccess baseAuthorAccess)`

It can be `null`.

**Parameters:**
- `baseAuthorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../ecss/extensions/api/AuthorAccess.md)): The access to the base Author document.

**Returns:** `void`

### `setDocumentsToCompare(ro.sync.ecss.extensions.api.AuthorAccess leftAuthorAccess, ro.sync.ecss.extensions.api.AuthorAccess rightAuthorAccess)`

**Parameters:**
- `leftAuthorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../ecss/extensions/api/AuthorAccess.md)): The access to the left Author document.
- `rightAuthorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../ecss/extensions/api/AuthorAccess.md)): The access to the right Author document.

**Returns:** `void`

### `setOptions(ro.sync.diff.api.DiffOptions diffOptions)`

It can be `null` meaning a default set of options will be used.

**Parameters:**
- `diffOptions` ([`ro.sync.diff.api.DiffOptions`](./DiffOptions.md)): The options.

**Returns:** `void`

### `performDiff(ro.sync.diff.api.DiffProgressListener diffProgressListener)`

**Parameters:**
- `diffProgressListener` ([`ro.sync.diff.api.DiffProgressListener`](./DiffProgressListener.md)): The DiffProgressListener notified about the progress of the diff.
          It can be `null` when the diff progress doesn't need to be monitored.

**Returns:** `java.util.List<ro.sync.diff.api.Difference>`

### `stop()`

**Returns:** `void`

