# Class: `SelectedTextOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations.text`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.text.SelectedTextOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../../api/AuthorOperation.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `doOperation(AuthorAccess authorAccess, ArgumentsMap arguments)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `arguments` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

**Returns:** `void`

### `convertSelectionIntervals(List<ContentInterval> intervals)`

**Parameters:**
- `intervals` (`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`): The list of ContentIntervals.

**Returns:** `java.util.List<int[]>`

### `processContentRange(AuthorDocumentController controller, int selStart, int selEnd)`

**Parameters:**
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md)): Document controller.
- `selStart` (`int`): The start of the selection.
- `selEnd` (`int`): The end of the selection.

**Returns:** `void`

### `processText(String text)`

**Parameters:**
- `text` (`java.lang.String`): The text to be processed.

**Returns:** `java.lang.String`

