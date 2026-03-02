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

### `addGuessElement(CIElement arg0)`

**Parameters:**
- `arg0` ([`ro.sync.contentcompletion.xml.CIElement`](./CIElement.md))

**Returns:** `void`

### `getNamespace()`

**Returns:** `java.lang.String`

### `setDeclareXmlns(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `setContentType(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `void`

### `setHasFixedValueType(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `isEmpty()`

**Returns:** `boolean`

### `hasFixedValue()`

**Returns:** `boolean`

### `getContentType()`

**Returns:** `int`

### `isDeclareXmlns()`

**Returns:** `boolean`

### `setName(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `setPrefix(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `setNamespace(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getQName()`

**Returns:** `java.lang.String`

### `getAttributes()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

### `getAttributesWithDefaultValues()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

### `setAttributes(List<CIAttribute> arg0)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`)

**Returns:** `void`

### `hasPrefix()`

**Returns:** `boolean`

### `getPrefix()`

**Returns:** `java.lang.String`

### `setAnnotation(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getTypeDescription()`

**Returns:** `java.lang.String`

### `setTypeDescription(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `setNillable(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `isNillable()`

**Returns:** `boolean`

