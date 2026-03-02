# Class: `AuthorInplaceContext`

**Package:** [`ro.sync.ecss.extensions.api.editor`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`

## Fields

### `arguments`

**Type:** `java.util.Map<java.lang.String,java.lang.Object>`

### `elem`

**Type:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)

### `schemaManager`

**Type:** [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../AuthorSchemaManager.md)

### `authorAccess`

**Type:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md)

### `parentHost`

**Type:** `java.lang.Object`

### `errorMessage`

**Type:** `java.lang.String`

### `styles`

**Type:** `ro.sync.ecss.css.Styles`

### `relativeMousePosition`

**Type:** `ro.sync.exml.view.graphics.Point`

### `widthEvaluator`

**Type:** [`ro.sync.ecss.extensions.api.editor.DynamicPropertyEvaluator`](./DynamicPropertyEvaluator.md)

### `readOnlyContext`

**Type:** `boolean`

## Constructors

### `<init>(Map<String,Object> arg0, AuthorElement arg1, Styles arg2, AuthorSchemaManager arg3, AuthorAccess arg4, Object arg5, DynamicPropertyEvaluator arg6)`

**Parameters:**
- `arg0` (`java.util.Map<java.lang.String,java.lang.Object>`)
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md))
- `arg2` (`ro.sync.ecss.css.Styles`)
- `arg3` ([`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../AuthorSchemaManager.md))
- `arg4` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md))
- `arg5` (`java.lang.Object`)
- `arg6` ([`ro.sync.ecss.extensions.api.editor.DynamicPropertyEvaluator`](./DynamicPropertyEvaluator.md))

### `<init>(AuthorInplaceContext arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md))

## Methods

### `getPropertyEvaluator()`

**Returns:** [`ro.sync.ecss.extensions.api.editor.DynamicPropertyEvaluator`](./DynamicPropertyEvaluator.md)

### `getArguments()`

**Returns:** `java.util.Map<java.lang.String,java.lang.Object>`

### `getAttributeToEdit()`

**Returns:** `java.lang.String`

### `getAttributeToEditQName()`

**Returns:** `javax.xml.namespace.QName`

### `getAttributeToEdit(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getElem()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)

### `getSchemaManager()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../AuthorSchemaManager.md)

### `getAuthorAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md)

### `getParentHost()`

**Returns:** `java.lang.Object`

### `setErrorMessage(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getErrorMessage()`

**Returns:** `java.lang.String`

### `getStyles()`

**Returns:** `ro.sync.ecss.css.Styles`

### `setRelativeMousePosition(Point arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.view.graphics.Point`)

**Returns:** `void`

### `getRelativeMouseLocation()`

**Returns:** `ro.sync.exml.view.graphics.Point`

### `setReadOnlyContext(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `isReadOnlyContext()`

**Returns:** `boolean`

### `setParentHost(Object arg0)`

**Parameters:**
- `arg0` (`java.lang.Object`)

**Returns:** `void`

