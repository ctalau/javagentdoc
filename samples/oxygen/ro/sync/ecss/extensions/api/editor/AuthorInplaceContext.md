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

### `<init>(`java.util.Map<java.lang.String,java.lang.Object>` arg0, [`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md) arg1, `ro.sync.ecss.css.Styles` arg2, [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../AuthorSchemaManager.md) arg3, [`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md) arg4, `java.lang.Object` arg5, [`ro.sync.ecss.extensions.api.editor.DynamicPropertyEvaluator`](./DynamicPropertyEvaluator.md) arg6)`

### `<init>([`ro.sync.ecss.extensions.api.editor.AuthorInplaceContext`](./AuthorInplaceContext.md) arg0)`

## Methods

### `getPropertyEvaluator()`

**Returns:** [`ro.sync.ecss.extensions.api.editor.DynamicPropertyEvaluator`](./DynamicPropertyEvaluator.md)

### `getArguments()`

**Returns:** `java.util.Map<java.lang.String,java.lang.Object>`

### `getAttributeToEdit()`

**Returns:** `java.lang.String`

### `getAttributeToEditQName()`

**Returns:** `javax.xml.namespace.QName`

### `getAttributeToEdit(`java.lang.String` arg0)`

**Returns:** `java.lang.String`

### `getElem()`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorElement`](../node/AuthorElement.md)

### `getSchemaManager()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorSchemaManager`](../AuthorSchemaManager.md)

### `getAuthorAccess()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorAccess`](../AuthorAccess.md)

### `getParentHost()`

**Returns:** `java.lang.Object`

### `setErrorMessage(`java.lang.String` arg0)`

**Returns:** `void`

### `getErrorMessage()`

**Returns:** `java.lang.String`

### `getStyles()`

**Returns:** `ro.sync.ecss.css.Styles`

### `setRelativeMousePosition(`ro.sync.exml.view.graphics.Point` arg0)`

**Returns:** `void`

### `getRelativeMouseLocation()`

**Returns:** `ro.sync.exml.view.graphics.Point`

### `setReadOnlyContext(`boolean` arg0)`

**Returns:** `void`

### `isReadOnlyContext()`

**Returns:** `boolean`

### `setParentHost(`java.lang.Object` arg0)`

**Returns:** `void`

