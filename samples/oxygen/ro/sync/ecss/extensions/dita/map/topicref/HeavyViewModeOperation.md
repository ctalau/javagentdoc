# Class: `HeavyViewModeOperation`

**Package:** [`ro.sync.ecss.extensions.dita.map.topicref`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.map.topicref.HeavyViewModeOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../../api/AuthorOperation.md)

## Description

Heavy means that the operation require to open all topic references.
 
 Will show an error if the operation is invoked for documents with many references.

## Fields

### `ARGUMENT_KEY`

**Type:** `java.lang.String`

### `ARGUMENT_ENABLE_VALUE`

**Type:** `java.lang.String`

### `ARGUMENT_DISABLE_VALUE`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

## Methods

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `boolean` enable)`

**Returns:** `void`

### `setPseudoclass([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `boolean` enable)`

**Returns:** `void`

### `getPseudoclass()`

**Returns:** `java.lang.String`

### `doOperationInternal([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `boolean` enable)`

**Returns:** `void`

Called only if references threshold isn't reached.

### `showError([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `int` refsFound, `int` refsLimit)`

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

