# Class: `EnumerationDefInfo`

**Package:** [`ro.sync.exml.workspace.api.editor.page.ditamap.keys`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.ditamap.keys.EnumerationDefInfo`

## Description

<enumerationdef>
  <elementdef name="p"/>
  <attributedef name="product"/>
  <subjectdef keyref="test"/>
 </enumerationdef>

## Fields

### `attributeName`

**Type:** `java.lang.String`

### `elementName`

**Type:** `java.lang.String`

### `referencedKeys`

**Type:** `java.util.Set<java.lang.String>`

### `keyScopes`

**Type:** `java.util.Stack<java.util.Set<java.lang.String>>`

### `singleValue`

**Type:** `java.lang.Boolean`

### `SINGLE_VALUE_OUTPUTCLASS_TOKEN`

**Type:** `java.lang.String`

### `MULTI_VALUE_OUTPUTCLASS_TOKEN`

**Type:** `java.lang.String`

## Constructors

### `<init>(`java.lang.String` attributeName, `java.lang.String` elementName)`

## Methods

### `getAttributeName()`

**Returns:** `java.lang.String`

### `getElementName()`

**Returns:** `java.lang.String`

### `toString()`

**Returns:** `java.lang.String`

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `verifyKSEquals(`java.util.Stack<java.util.Set<java.lang.String>>` ks1, `java.util.Stack<java.util.Set<java.lang.String>>` ks2)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `getReferencedKeys()`

**Returns:** `java.util.LinkedHashSet<java.lang.String>`

### `addReferencedKey(`java.lang.String` keyRef)`

**Returns:** `void`

### `setKeyScopes(`java.util.Stack<java.util.Set<java.lang.String>>` keyScopes)`

**Returns:** `void`

### `getKeyScopes()`

**Returns:** `java.util.Stack<java.util.Set<java.lang.String>>`

### `isSingleValue()`

**Returns:** `java.lang.Boolean`

### `setSingleValue(`java.lang.Boolean` singleValue)`

**Returns:** `void`

