# Class: `ChangeAttributeOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.ChangeAttributeOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

## Fields

### `ARGUMENT_ATTRIBUTE_NAME`

**Type:** `java.lang.String`

The value is `name`.

### `ARGUMENT_ATTRIBUTE_NAMESPACE`

**Type:** `java.lang.String`

The value is `namespace`.

### `ARGUMENT_ELEMENT_XPATH_LOCATION`

**Type:** `java.lang.String`

Empty/null for the current element.
 The value is `elementLocation`.

### `ARGUMENT_VALUE`

**Type:** `java.lang.String`

The value is `value`.

### `ARGUMENT_EDIT_ATTRIBUTE`

**Type:** `java.lang.String`

Only possible
 if an in-place editor exists for that attribute.

### `ARGUMENT_REMOVE_IF_EMPTY_VALUE`

**Type:** `java.lang.String`

If `false` it will add/keep the attribute even if the value is empty.

### `arguments`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

