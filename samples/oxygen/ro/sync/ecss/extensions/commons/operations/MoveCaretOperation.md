# Class: `MoveCaretOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.MoveCaretOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

The operation can also select an
 XML element or its content.

## Fields

### `XPATH_LOCATION`

**Type:** `java.lang.String`

This argument specifies the location relative to which the caret is moved.

### `POSITION`

**Type:** `java.lang.String`

This argument specifies the position relative to the node obtained from the XPath location
 where the caret will be moved.

### `SELECTION`

**Type:** `java.lang.String`

This argument specifies if the operation should select something related to the node
 obtained from the XPath location.

### `XPATH_LOCATION_ARGUMENT_DESCRIPTOR`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor`](../../api/ArgumentDescriptor.md)

### `POSITION_DESCRIPTOR`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor`](../../api/ArgumentDescriptor.md)

### `SELECTION_DESCRIPTOR`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor`](../../api/ArgumentDescriptor.md)

### `ARGUMENTS`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

