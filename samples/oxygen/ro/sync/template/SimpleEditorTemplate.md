# Class: `SimpleEditorTemplate`

**Package:** [`ro.sync.template`](README.md)

**Fully Qualified Name:** `ro.sync.template.SimpleEditorTemplate`

**Implements:** [`ro.sync.template.EditorTemplateWithContent`](./EditorTemplateWithContent.md), [`ro.sync.template.BuiltinEditorTemplate`](./BuiltinEditorTemplate.md)

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `description`

**Type:** `java.lang.String`

### `extension`

**Type:** `java.lang.String`

### `content`

**Type:** `java.lang.String`

### `customizationPageID`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

### `<init>(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)

### `<init>(java.lang.String arg0, java.lang.String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

### `<init>(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

## Methods

### `getDescription()`

**Returns:** `java.lang.String`

### `getName()`

**Returns:** `java.lang.String`

### `getExtension()`

**Returns:** `java.lang.String`

### `getSource()`

**Returns:** `java.lang.String`

### `getTemplateType()`

**Returns:** `int`

### `getContentInfo(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** [`ro.sync.template.TemplateContentInfo`](./TemplateContentInfo.md)

### `getContentInfo(java.lang.String arg0, boolean arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)

**Returns:** [`ro.sync.template.TemplateContentInfo`](./TemplateContentInfo.md)

### `getContentInfo(java.lang.String arg0, boolean arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)

**Returns:** [`ro.sync.template.TemplateContentInfo`](./TemplateContentInfo.md)

### `setContent(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getCaretPosition()`

**Returns:** `int`

### `equals(java.lang.Object arg0)`

**Parameters:**
- `arg0` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `clone()`

**Returns:** `java.lang.Object`

### `checkValid()`

**Returns:** `void`

### `getNotPersistentFieldNames()`

**Returns:** `java.lang.String[]`

### `getAdditionalInformation()`

**Returns:** `java.lang.String`

### `isCustomizable()`

**Returns:** `boolean`

### `getCustomizePageID()`

**Returns:** `java.lang.String`

### `getLongDescription()`

**Returns:** `java.lang.String`

### `getTypeProperty()`

**Returns:** `java.lang.String`

### `getFilenamePrefix()`

**Returns:** `java.lang.String`

### `getFilenameSuffix()`

**Returns:** `java.lang.String`

### `toString()`

**Returns:** `java.lang.String`

