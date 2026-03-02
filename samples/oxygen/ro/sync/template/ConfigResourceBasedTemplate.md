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

### `<init>(String arg0, String arg1, ConfigResource arg2, ConfigResource arg3)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` ([`ro.sync.exml.workspace.api.options.ConfigResource`](../exml/workspace/api/options/ConfigResource.md))
- `arg3` ([`ro.sync.exml.workspace.api.options.ConfigResource`](../exml/workspace/api/options/ConfigResource.md))

## Methods

### `setTemplateProperties(ConfigResourceBasedTemplate arg0, Properties arg1)`

**Parameters:**
- `arg0` ([`ro.sync.template.ConfigResourceBasedTemplate`](./ConfigResourceBasedTemplate.md))
- `arg1` (`java.util.Properties`)

**Returns:** `void`

### `getAndRemove(Properties arg0, String arg1)`

**Parameters:**
- `arg0` (`java.util.Properties`)
- `arg1` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getSource()`

**Returns:** `java.lang.String`

### `getTemplateType()`

**Returns:** `int`

### `equals(Object arg0)`

**Parameters:**
- `arg0` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `clone()`

**Returns:** `java.lang.Object`

### `setOtherProperties(SerializableLinkedHashMap<String,String> arg0)`

**Parameters:**
- `arg0` (`ro.sync.options.SerializableLinkedHashMap<java.lang.String,java.lang.String>`)

**Returns:** `void`

### `getOtherProps()`

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

### `getTemplateFileName()`

**Returns:** `java.lang.String`

### `checkValid()`

**Returns:** `void`

### `isFromFrameworks()`

**Returns:** `boolean`

