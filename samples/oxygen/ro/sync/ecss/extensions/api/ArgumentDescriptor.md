# Class: `ArgumentDescriptor`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.ArgumentDescriptor`

## Description

## Fields

### `TYPE_STRING`

**Type:** `int`

The value is `0`.

### `TYPE_FRAGMENT`

**Type:** `int`

It is represented as a String
 The value is `1`.

### `TYPE_XPATH_EXPRESSION`

**Type:** `int`

It is represented as a String
 The value is `2`.

### `TYPE_CONSTANT_LIST`

**Type:** `int`

The value is `3`.

### `TYPE_SCRIPT`

**Type:** `int`

It is represented as a String
 The value is `4`.

### `TYPE_JAVA_OBJECT`

**Type:** `int`

This Map 
 is interpreted by the operation that receives it.

### `name`

**Type:** `java.lang.String`

### `type`

**Type:** `int`

### `description`

**Type:** `java.lang.String`

### `allowedValues`

**Type:** `java.lang.String[]`

### `defaultValue`

**Type:** `java.lang.String`

## Constructors

### `<init>(`java.lang.String` name, `int` type, `java.lang.String` description)`

### `<init>(`java.lang.String` name, `int` type, `java.lang.String` description, `java.lang.String` defaultValue)`

### `<init>(`java.lang.String` name, `int` type, `java.lang.String` description, `java.lang.String[]` allowedValues, `java.lang.String` defaultValue)`

## Methods

### `getName()`

**Returns:** `java.lang.String`

### `getType()`

**Returns:** `int`

### `getDescription()`

**Returns:** `java.lang.String`

### `decodeType(`int` type)`

**Returns:** `java.lang.String`

### `getAllowedValues()`

**Returns:** `java.lang.String[]`

### `getDefaultValue()`

**Returns:** `java.lang.String`

### `toString()`

**Returns:** `java.lang.String`

