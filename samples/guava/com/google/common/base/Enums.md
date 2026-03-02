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

### `getField(Enum<?> enumValue)`

For example, to get the 
 Description annotation on the GOLF constant of enum Sport, use 
 Enums.getField(Sport.GOLF).getAnnotation(Description.class).

**Parameters:**
- `enumValue` (`java.lang.Enum<?>`)

**Returns:** `java.lang.reflect.Field`

### `getIfPresent(Class<T> enumClass, String value)`

If the
 constant does not exist, Optional#absent is returned. A common use case is for parsing
 user input or falling back to a default enum constant. For example, 
 Enums.getIfPresent(Country.class, countryInput).or(Country.DEFAULT);

**Parameters:**
- `enumClass` (`java.lang.Class<T>`)
- `value` (`java.lang.String`)

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

### `populateCache(Class<T> enumClass)`

**Parameters:**
- `enumClass` (`java.lang.Class<T>`)

**Returns:** `java.util.Map<java.lang.String,java.lang.ref.WeakReference<? extends java.lang.Enum<?>>>`

### `getEnumConstants(Class<T> enumClass)`

**Parameters:**
- `enumClass` (`java.lang.Class<T>`)

**Returns:** `java.util.Map<java.lang.String,java.lang.ref.WeakReference<? extends java.lang.Enum<?>>>`

### `stringConverter(Class<T> enumClass)`

The
 converter will throw an IllegalArgumentException if the argument is not the name of any
 enum constant in the specified enum.

**Parameters:**
- `enumClass` (`java.lang.Class<T>`)

**Returns:** [`com.google.common.base.Converter<java.lang.String,T>`](./Converter.md)

