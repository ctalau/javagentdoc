# Interface: `CIElement`

**Package:** [`ro.sync.contentcompletion.xml`](README.md)

**Fully Qualified Name:** `ro.sync.contentcompletion.xml.CIElement`

**Extends:** `java.lang.Comparable<ro.sync.contentcompletion.xml.CIElement>`, [`ro.sync.contentcompletion.xml.NodeDescription`](./NodeDescription.md)

## Fields

### `CONTENT_TYPE_NOT_DETERMINED`

**Type:** `int`

### `CONTENT_TYPE_EMPTY`

**Type:** `int`

### `CONTENT_TYPE_ELEMENT_ONLY`

**Type:** `int`

### `CONTENT_TYPE_MIXED`

**Type:** `int`

## Methods

### `getGuessElements()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `addGuessElement(ro.sync.contentcompletion.xml.CIElement arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.contentcompletion.xml.CIElement`](./CIElement.md))

### `getNamespace()`

**Returns:** `java.lang.String`

### `setDeclareXmlns(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

### `setContentType(int arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`int`)

### `setHasFixedValueType(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

### `isEmpty()`

**Returns:** `boolean`

### `hasFixedValue()`

**Returns:** `boolean`

### `getContentType()`

**Returns:** `int`

### `isDeclareXmlns()`

**Returns:** `boolean`

### `setName(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `setPrefix(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `setNamespace(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getQName()`

**Returns:** `java.lang.String`

### `getAttributes()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

### `getAttributesWithDefaultValues()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

### `setAttributes(java.util.List<ro.sync.contentcompletion.xml.CIAttribute> arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`)

### `hasPrefix()`

**Returns:** `boolean`

### `getPrefix()`

**Returns:** `java.lang.String`

### `setAnnotation(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getTypeDescription()`

**Returns:** `java.lang.String`

### `setTypeDescription(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `setNillable(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

### `isNillable()`

**Returns:** `boolean`

