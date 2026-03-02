# Class: `FileTemplate`

**Package:** [`ro.sync.template`](README.md)

**Fully Qualified Name:** `ro.sync.template.FileTemplate`

**Extends:** [`ro.sync.template.AbstractTemplate`](./AbstractTemplate.md)

**Implements:** [`ro.sync.template.EditorTemplateWithContent`](./EditorTemplateWithContent.md)

## Fields

### `otherProps`

**Type:** `ro.sync.options.SerializableLinkedHashMap<java.lang.String,java.lang.String>`

### `OTHER_PROP_TAGS`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

### `<init>(java.io.File arg0, java.lang.String arg1, boolean arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, java.lang.String arg7, java.lang.String arg8)`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`java.lang.String`)
- `arg2` (`boolean`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)
- `arg5` (`java.lang.String`)
- `arg6` (`java.lang.String`)
- `arg7` (`java.lang.String`)
- `arg8` (`java.lang.String`)

### `<init>(java.io.File arg0, java.lang.String arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`java.lang.String`)
- `arg2` (`boolean`)

## Methods

### `equals(java.lang.Object arg0)`

**Parameters:**
- `arg0` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `clone()`

**Returns:** `java.lang.Object`

### `setOtherProperties(ro.sync.options.SerializableLinkedHashMap<java.lang.String,java.lang.String> arg0)`

**Parameters:**
- `arg0` (`ro.sync.options.SerializableLinkedHashMap<java.lang.String,java.lang.String>`)

**Returns:** `void`

### `getOtherProps()`

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

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

### `getTemplateFileName()`

**Returns:** `java.lang.String`

### `getTemplateType()`

**Returns:** `int`

### `checkValid()`

**Returns:** `void`

### `getTemplateLocation()`

**Returns:** `java.io.File`

