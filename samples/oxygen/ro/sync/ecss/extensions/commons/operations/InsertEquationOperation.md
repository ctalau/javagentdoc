# Class: `InsertEquationOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.InsertEquationOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

## Fields

### `ARGUMENT_FRAGMENT_WITH_MATHML`

**Type:** `java.lang.String`

The value is `fragment`.

### `arguments`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `MATH_ML_NAMESPACE`

**Type:** `java.lang.String`

### `MATH_ML`

**Type:** `java.lang.String`

### `MATH_ML_FOR_HTML_DOC_TYPE`

**Type:** `java.lang.String`

### `WEBAPP_MATH_ML`

**Type:** `java.lang.String`

We need some initial equation so that we can render a equation 
 for the user to click on.

## Constructors

### `<init>()`

## Methods

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

**Returns:** `void`

### `editImage(ro.sync.exml.workspace.api.images.handlers.ImageHandler handler, ro.sync.exml.workspace.api.images.handlers.providers.EmbeddedImageContentProvider cp)`

**Parameters:**
- `handler` ([`ro.sync.exml.workspace.api.images.handlers.ImageHandler`](../../../../exml/workspace/api/images/handlers/ImageHandler.md)): The image handler
- `cp` ([`ro.sync.exml.workspace.api.images.handlers.providers.EmbeddedImageContentProvider`](../../../../exml/workspace/api/images/handlers/providers/EmbeddedImageContentProvider.md)): The image provider

**Returns:** `java.lang.String`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `createDefaultFragmentToEdit(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.AuthorSchemaManager asm)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Author access.
- `asm` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../../api/AuthorSchemaManager.md)): The author schema manager.

**Returns:** `java.lang.String`

### `extractMathMLFragment(java.lang.String xmlFragment)`

**Parameters:**
- `xmlFragment` (`java.lang.String`): The XML fragment.

**Returns:** `java.lang.String`

