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

### `<init>(java.lang.String name, int type, java.lang.String description)`

**Parameters:**
- `name` (`java.lang.String`): The name of the argument.
- `type` (`int`): The type of the argument, one of:
 ArgumentDescriptor#TYPE_STRING,
 ArgumentDescriptor#TYPE_FRAGMENT,
 ArgumentDescriptor#TYPE_SCRIPT,
 ArgumentDescriptor#TYPE_XPATH_EXPRESSION,
 ArgumentDescriptor#TYPE_CONSTANT_LIST,
- `description` (`java.lang.String`): The description of the argument.

### `<init>(java.lang.String name, int type, java.lang.String description, java.lang.String defaultValue)`

**Parameters:**
- `name` (`java.lang.String`): The name of the argument.
- `type` (`int`): The type of the argument, one of:
 ArgumentDescriptor#TYPE_STRING,
 ArgumentDescriptor#TYPE_FRAGMENT,
 ArgumentDescriptor#TYPE_SCRIPT,
 ArgumentDescriptor#TYPE_XPATH_EXPRESSION,
 ArgumentDescriptor#TYPE_CONSTANT_LIST,
- `description` (`java.lang.String`): The description of the argument.
- `defaultValue` (`java.lang.String`): The default value of the argument.

### `<init>(java.lang.String name, int type, java.lang.String description, java.lang.String[] allowedValues, java.lang.String defaultValue)`

**Parameters:**
- `name` (`java.lang.String`): The name of the argument.
- `type` (`int`): The type of the argument, one of:
 ArgumentDescriptor#TYPE_STRING,
 ArgumentDescriptor#TYPE_FRAGMENT,
 ArgumentDescriptor#TYPE_SCRIPT,
 ArgumentDescriptor#TYPE_XPATH_EXPRESSION,
 ArgumentDescriptor#TYPE_CONSTANT_LIST,
- `description` (`java.lang.String`): The description of the argument.
- `allowedValues` (`java.lang.String[]`): The allowed values for the defined argument.
- `defaultValue` (`java.lang.String`): The default value of the argument.

## Methods

### `getName()`

**Returns:** `java.lang.String`

### `getType()`

**Returns:** `int`

### `getDescription()`

**Returns:** `java.lang.String`

### `decodeType(int type)`

**Returns:** `java.lang.String`

**Parameters:**
- `type` (`int`): The argument type, one of:
 ArgumentDescriptor#TYPE_STRING,
 ArgumentDescriptor#TYPE_FRAGMENT,
 ArgumentDescriptor#TYPE_SCRIPT,
 ArgumentDescriptor#TYPE_XPATH_EXPRESSION,
 ArgumentDescriptor#TYPE_CONSTANT_LIST,

### `getAllowedValues()`

**Returns:** `java.lang.String[]`

### `getDefaultValue()`

**Returns:** `java.lang.String`

### `toString()`

**Returns:** `java.lang.String`

