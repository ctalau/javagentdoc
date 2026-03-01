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

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `isArgumentTrue([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args, `java.lang.String` argumentName)`

**Returns:** `boolean`

### `reloadFromReaderIfModified([`ro.sync.ecss.extensions.api.access.AuthorEditorAccess`](../../api/access/AuthorEditorAccess.md) editorAccess, `java.io.Reader` contentReader)`

**Returns:** `boolean`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

