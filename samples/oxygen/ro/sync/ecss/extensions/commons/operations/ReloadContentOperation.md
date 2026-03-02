# Class: `ReloadContentOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.ReloadContentOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md), [`ro.sync.ecss.extensions.api.AuthorOperationWithCustomUndoBehavior`](../../api/AuthorOperationWithCustomUndoBehavior.md)

## Description

## Fields

### `LOGGER`

**Type:** `org.slf4j.Logger`

### `ARGUMENT_MARK_AS_NOT_MODIFIED`

**Type:** `java.lang.String`

### `ARGUMENT_FORCED`

**Type:** `java.lang.String`

### `ARGUMENT_DISCARD_UNDOABLE_EDITS`

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

### `isArgumentTrue(ArgumentsMap args, String argumentName)`

**Parameters:**
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md)): The arguments map.
- `argumentName` (`java.lang.String`): The argument name.

**Returns:** `boolean`

### `reloadFromReaderIfModified(AuthorEditorAccess editorAccess, Reader contentReader)`

**Parameters:**
- `editorAccess` ([`ro.sync.ecss.extensions.api.access.AuthorEditorAccess`](../../api/access/AuthorEditorAccess.md)): The editor access.
- `contentReader` (`java.io.Reader`): The reader.

**Returns:** `boolean`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

