# Class: `ChangeAttributesOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.ChangeAttributesOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `ARGUMENT_ATTRIBUTE_NAMES`

**Type:** `java.lang.String`

### `ARGUMENT_ATTRIBUTE_VALUES`

**Type:** `java.lang.String`

### `ARGUMENT_ELEMENTS_XPATH_LOCATIONS`

**Type:** `java.lang.String`

The value of the argument is an XPath expression.


 Empty or `null` for the current element.

### `ARGUMENT_REMOVE_IF_EMPTY_VALUE`

**Type:** `java.lang.String`

### `arguments`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

### `detectTargetElements(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, java.lang.Object xpathLocations)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../../api/node/AuthorElement.md)

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Access to Author functionality.
- `xpathLocations` (`java.lang.Object`): The XPath location provided by the user for the target elements.

### `detectElementAtOffset(ro.sync.ecss.extensions.api.AuthorAccess authorAccess)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../../api/node/AuthorElement.md)

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Access to Author API.

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

