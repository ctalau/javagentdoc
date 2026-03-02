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

### `doOperation(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

**Returns:** `void`

### `doOperationInternal(AuthorAccess authorAccess, Object fragment, Object xpathLocation, Object relativeLocation, boolean goToFirstEditablePosition, Object schemaAwareArgumentValue)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access used to access the document.
- `fragment` (`java.lang.Object`): The fragment to be inserted.
- `xpathLocation` (`java.lang.Object`): The XPath location where the insertion takes place. If null, insert at caret position.
- `relativeLocation` (`java.lang.Object`): The location of the insertion relative to the node selected by the XPath.
- `goToFirstEditablePosition` (`boolean`): `true` if we should go to the first editable 
    position in the fragment after insertion.
- `schemaAwareArgumentValue` (`java.lang.Object`): `true` if the insertion should be schema aware.

**Returns:** `void`

### `doOperationInternal(AuthorAccess authorAccess, Object fragment, Object xpathLocation, Object relativeLocation, boolean goToFirstEditablePosition, Object schemaAwareArgumentValue, boolean isInsertEvenIfInvalid)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): The author access used to access the document.
- `fragment` (`java.lang.Object`): The fragment to be inserted.
- `xpathLocation` (`java.lang.Object`): The XPath location where the insertion takes place. If null, insert at caret position.
- `relativeLocation` (`java.lang.Object`): The location of the insertion relative to the node selected by the XPath.
- `goToFirstEditablePosition` (`boolean`): `true` if we should go to the first editable 
    position in the fragment after insertion.
- `schemaAwareArgumentValue` (`java.lang.Object`): `true` if the insertion should be schema aware.
- `isInsertEvenIfInvalid` (`boolean`): `true` to insert the fragment even if it would make the document invalid.

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

