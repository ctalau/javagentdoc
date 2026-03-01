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

### `isDelimiterBeforeTextNode([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, `int` contentOffset)`

**Returns:** `boolean`

### `isWordDelimiter(`char` ch)`

**Returns:** `boolean`

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) arguments)`

**Returns:** `void`

### `processContentRange([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md) documentController, `int` selStart, `int` selEnd)`

**Returns:** `void`

### `processTextContent(`char[]` charArray, `boolean` isDelimiterBefore)`

**Returns:** `char[]`

