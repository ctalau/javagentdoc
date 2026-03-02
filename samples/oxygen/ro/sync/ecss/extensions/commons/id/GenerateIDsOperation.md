# Class: `GenerateIDsOperation`

**Package:** [`ro.sync.ecss.extensions.commons.id`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.id.GenerateIDsOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

## Fields

### `LOGGER`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

### `generateIDs(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.UniqueAttributesRecognizer attrsAssigner, int startSel, int endSel)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access.
                      Provides access to specific informations and actions for 
                      editor, document, workspace, tables, change tracking, utility a.s.o.
- `attrsAssigner` ([`ro.sync.ecss.extensions.api.UniqueAttributesRecognizer`](../../api/UniqueAttributesRecognizer.md)): The unique attributes handler.
- `startSel` (`int`): The selection start.
- `endSel` (`int`): The selection end.

### `getUniqueAttributesRecognizer()`

**Returns:** [`ro.sync.ecss.extensions.api.UniqueAttributesRecognizer`](../../api/UniqueAttributesRecognizer.md)

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

