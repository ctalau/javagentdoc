# Class: `Enums`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Enums`

## Description

## Fields

### `enumConstantCache`

**Type:** `java.util.Map<java.lang.Class<? extends java.lang.Enum<?>>,java.util.Map<java.lang.String,java.lang.ref.WeakReference<? extends java.lang.Enum<?>>>>`

## Constructors

### `<init>()`

## Methods

### `getField(java.lang.Enum<?> enumValue)`

**Returns:** `java.lang.reflect.Field`

For example, to get the 
 Description annotation on the GOLF constant of enum Sport, use 
 Enums.getField(Sport.GOLF).getAnnotation(Description.class).

**Parameters:**
- `enumValue` (`java.lang.Enum<?>`)

### `getIfPresent(java.lang.Class<T> enumClass, java.lang.String value)`

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

If the
 constant does not exist, Optional#absent is returned. A common use case is for parsing
 user input or falling back to a default enum constant. For example, 
 Enums.getIfPresent(Country.class, countryInput).or(Country.DEFAULT);

**Parameters:**
- `enumClass` (`java.lang.Class<T>`)
- `value` (`java.lang.String`)

### `populateCache(java.lang.Class<T> enumClass)`

**Returns:** `java.util.Map<java.lang.String,java.lang.ref.WeakReference<? extends java.lang.Enum<?>>>`

**Parameters:**
- `enumClass` (`java.lang.Class<T>`)

### `getEnumConstants(java.lang.Class<T> enumClass)`

**Returns:** `java.util.Map<java.lang.String,java.lang.ref.WeakReference<? extends java.lang.Enum<?>>>`

**Parameters:**
- `enumClass` (`java.lang.Class<T>`)

### `stringConverter(java.lang.Class<T> enumClass)`

**Returns:** [`com.google.common.base.Converter<java.lang.String,T>`](./Converter.md)

The
 converter will throw an IllegalArgumentException if the argument is not the name of any
 enum constant in the specified enum.

**Parameters:**
- `enumClass` (`java.lang.Class<T>`)

