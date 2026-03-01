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

### `<init>(`java.lang.String` specifiedValue)`

### `<init>(`java.lang.String` normalizedValue, `java.lang.String` rawValue, `boolean` isSpecified)`

## Methods

### `getValue()`

**Returns:** `java.lang.String`

### `getRawValue()`

**Returns:** `java.lang.String`

### `isSpecified()`

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

