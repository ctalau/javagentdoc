# Class: `ConfigResourceBasedTemplate`

**Package:** [`ro.sync.template`](README.md)

**Fully Qualified Name:** `ro.sync.template.ConfigResourceBasedTemplate`

**Extends:** [`ro.sync.template.BaseAbstractTemplate`](./BaseAbstractTemplate.md)

## Fields

### `templateURL`

**Type:** `java.lang.String`

### `otherProps`

**Type:** `ro.sync.options.SerializableLinkedHashMap<java.lang.String,java.lang.String>`

### `OTHER_PROP_TAGS`

**Type:** `java.lang.String`

## Constructors

### `<init>()`

### `<init>(java.lang.String arg0, java.lang.String arg1, ro.sync.exml.workspace.api.options.ConfigResource arg2, ro.sync.exml.workspace.api.options.ConfigResource arg3)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` ([`ro.sync.exml.workspace.api.options.ConfigResource`](../exml/workspace/api/options/ConfigResource.md))
- `arg3` ([`ro.sync.exml.workspace.api.options.ConfigResource`](../exml/workspace/api/options/ConfigResource.md))

## Methods

### `setTemplateProperties(ro.sync.template.ConfigResourceBasedTemplate arg0, java.util.Properties arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.template.ConfigResourceBasedTemplate`](./ConfigResourceBasedTemplate.md))
- `arg1` (`java.util.Properties`)

### `getAndRemove(java.util.Properties arg0, java.lang.String arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.util.Properties`)
- `arg1` (`java.lang.String`)

### `getSource()`

**Returns:** `java.lang.String`

### `getTemplateType()`

**Returns:** `int`

### `equals(java.lang.Object arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `clone()`

**Returns:** `java.lang.Object`

### `setOtherProperties(ro.sync.options.SerializableLinkedHashMap<java.lang.String,java.lang.String> arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.options.SerializableLinkedHashMap<java.lang.String,java.lang.String>`)

### `getOtherProps()`

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

### `getTemplateFileName()`

**Returns:** `java.lang.String`

### `checkValid()`

**Returns:** `void`

### `isFromFrameworks()`

**Returns:** `boolean`

