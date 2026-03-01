# Class: `InsertFragmentOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.InsertFragmentOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `ARGUMENT_FRAGMENT`

**Type:** `java.lang.String`

The value is `fragment`.

### `ARGUMENT_DESCRIPTOR_FRAGMENT`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor`](../../api/ArgumentDescriptor.md)

### `ARGUMENT_XPATH_LOCATION`

**Type:** `java.lang.String`

The value is `insertLocation`.

### `ARGUMENT_DESCRIPTOR_XPATH_LOCATION`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor`](../../api/ArgumentDescriptor.md)

### `ARGUMENT_RELATIVE_LOCATION`

**Type:** `java.lang.String`

The value is `insertPosition`.

### `ARGUMENT_DESCRIPTOR_RELATIVE_LOCATION`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor`](../../api/ArgumentDescriptor.md)

### `ARGUMENT_GO_TO_NEXT_EDITABLE_POSITION`

**Type:** `java.lang.String`

It can be either 
 an offset inside the content or an in-place editor.

### `ARGUMENT_DESCRIPTOR_GO_TO_NEXT_EDITABLE_POSITION`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor`](../../api/ArgumentDescriptor.md)

### `ARGUMENT_INSERT_FRAG_EVEN_IF_INVALID`

**Type:** `java.lang.String`

### `ARGUMENT_DESCR_INSERT_FRAG_EVEN_IF_INVALID`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor`](../../api/ArgumentDescriptor.md)

### `arguments`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `doOperationInternal([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.lang.Object` fragment, `java.lang.Object` xpathLocation, `java.lang.Object` relativeLocation, `boolean` goToFirstEditablePosition, `java.lang.Object` schemaAwareArgumentValue)`

**Returns:** `void`

### `doOperationInternal([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md) authorAccess, `java.lang.Object` fragment, `java.lang.Object` xpathLocation, `java.lang.Object` relativeLocation, `boolean` goToFirstEditablePosition, `java.lang.Object` schemaAwareArgumentValue, `boolean` isInsertEvenIfInvalid)`

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

