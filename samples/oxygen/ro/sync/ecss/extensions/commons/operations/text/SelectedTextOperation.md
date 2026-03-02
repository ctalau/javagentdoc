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

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap arguments)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md))
- `arguments` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md))

### `convertSelectionIntervals(java.util.List<ro.sync.ecss.extensions.api.ContentInterval> intervals)`

**Returns:** `java.util.List<int[]>`

**Parameters:**
- `intervals` (`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>`): The list of ContentIntervals.

### `processContentRange(ro.sync.ecss.extensions.api.AuthorDocumentController controller, int selStart, int selEnd)`

**Returns:** `void`

**Parameters:**
- `controller` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md)): Document controller.
- `selStart` (`int`): The start of the selection.
- `selEnd` (`int`): The end of the selection.

### `processText(java.lang.String text)`

**Returns:** `java.lang.String`

**Parameters:**
- `text` (`java.lang.String`): The text to be processed.

