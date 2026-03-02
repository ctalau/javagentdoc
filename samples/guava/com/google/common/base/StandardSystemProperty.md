# Enum: `StandardSystemProperty`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.StandardSystemProperty`

## Description

## Fields

### `key`

**Type:** `java.lang.String`

## Constructors

### `<init>(java.lang.String key)`

**Parameters:**
- `key` (`java.lang.String`)

## Methods

### `values()`

**Returns:** [`com.google.common.base.StandardSystemProperty[]`](./StandardSystemProperty.md)

### `valueOf(java.lang.String name)`

**Returns:** [`com.google.common.base.StandardSystemProperty`](./StandardSystemProperty.md)

**Parameters:**
- `name` (`java.lang.String`)

### `key()`

**Returns:** `java.lang.String`

### `value()`

**Returns:** `java.lang.String`

The value returned by this method is non-null except in rare circumstances:

 

   - #JAVA_EXT_DIRS was deprecated in Java 8 and removed in Java 9. We have not
       confirmed whether it is available under older versions.
   - #JAVA_COMPILER, while still listed as required as of Java 15, is typically not
       available even under older version.
   - Any property may be cleared through APIs like System#clearProperty.
   - Unusual environments like GWT may have their own special handling of system properties.
 


 
Note that StandardSystemProperty does not provide constants for more recently added
 properties, including:

 

   - java.vendor.version (added in Java 11, listed as optional as of Java 13)
   - jdk.module.* (added in Java 9, optional)

### `toString()`

**Returns:** `java.lang.String`

