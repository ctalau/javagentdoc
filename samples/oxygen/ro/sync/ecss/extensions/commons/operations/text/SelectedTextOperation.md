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

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) arguments)`

**Returns:** `void`

### `convertSelectionIntervals(`java.util.List<ro.sync.ecss.extensions.api.ContentInterval>` intervals)`

**Returns:** `java.util.List<int[]>`

### `processContentRange([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../api/AuthorDocumentController.md) controller, `int` selStart, `int` selEnd)`

**Returns:** `void`

### `processText(`java.lang.String` text)`

**Returns:** `java.lang.String`

