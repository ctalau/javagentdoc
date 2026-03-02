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

### `isDelimiterBeforeTextNode(AuthorAccess authorAccess, int contentOffset)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `contentOffset` (`int`): The offset where search is started.

**Returns:** `boolean`

### `isWordDelimiter(char ch)`

**Parameters:**
- `ch` (`char`): The character that must be evaluated.

**Returns:** `boolean`

### `doOperation(AuthorAccess authorAccess, ArgumentsMap arguments)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `arguments` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

**Returns:** `void`

### `processContentRange(AuthorDocumentController documentController, int selStart, int selEnd)`

**Parameters:**
- `documentController` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md)): The document controller.
- `selStart` (`int`): The start of the selection.
- `selEnd` (`int`): The end of the selection.

**Returns:** `void`

### `processTextContent(char[] charArray, boolean isDelimiterBefore)`

**Parameters:**
- `charArray` (`char[]`): The character array that must be processed.
- `isDelimiterBefore` (`boolean`): `true` if we have a delimiter before the given char array,
                            `false` otherwise.

**Returns:** `char[]`

