# Class: `AttrValue`

**Package:** [`ro.sync.ecss.extensions.api.node`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.node.AttrValue`

## Description

WARNING: This class should be immutable. Objects of this class are sometimes cached in the AuthorDocumentHandler

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `EMPTY_VALUE`

**Type:** [`ro.sync.ecss.extensions.api.node.AttrValue`](./AttrValue.md)

### `normalizedValue`

**Type:** `java.lang.String`

Usually the raw and normalized values point to the same string.

### `rawValue`

**Type:** `java.lang.String`

Usually the raw and normalized values point to the same string.

### `isSpecified`

**Type:** `boolean`

## Constructors

### `<init>(String specifiedValue)`

**Parameters:**
- `specifiedValue` (`java.lang.String`): The simple attribute value which will be used both as
   raw value and normalized value.

### `<init>(String normalizedValue, String rawValue, boolean isSpecified)`

**Parameters:**
- `normalizedValue` (`java.lang.String`): Attribute normalized value (with entities expanded 
   and WS's collapsed).
- `rawValue` (`java.lang.String`): Attribute raw value (as it is specified in text with no white space collapsed and **entities** not expanded).
- `isSpecified` (`boolean`): `true` if specified in XML, `false` 
   if this is a default value.

## Methods

### `getValue()`

**Returns:** `java.lang.String`

### `getRawValue()`

**Returns:** `java.lang.String`

### `isSpecified()`

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

### `equals(Object obj)`

**Parameters:**
- `obj` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

