# Class: `FormSelectedTextOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations.text`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.text.FormSelectedTextOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../../api/AuthorOperation.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `WORD_DELIMITERS_CHARS`

**Type:** `char[]`

### `authorAccess`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md)

## Constructors

### `<init>()`

## Methods

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `isDelimiterBeforeTextNode(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, int contentOffset)`

**Returns:** `boolean`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `contentOffset` (`int`): The offset where search is started.

### `isWordDelimiter(char ch)`

**Returns:** `boolean`

**Parameters:**
- `ch` (`char`): The character that must be evaluated.

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap arguments)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `arguments` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

### `processContentRange(ro.sync.ecss.extensions.api.AuthorDocumentController documentController, int selStart, int selEnd)`

**Returns:** `void`

**Parameters:**
- `documentController` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md)): The document controller.
- `selStart` (`int`): The start of the selection.
- `selEnd` (`int`): The end of the selection.

### `processTextContent(char[] charArray, boolean isDelimiterBefore)`

**Returns:** `char[]`

**Parameters:**
- `charArray` (`char[]`): The character array that must be processed.
- `isDelimiterBefore` (`boolean`): `true` if we have a delimiter before the given char array,
                          `false` otherwise.

