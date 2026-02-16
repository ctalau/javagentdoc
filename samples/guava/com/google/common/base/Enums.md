# Class: `Enums`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Enums`

## Description

Utility methods for working with `Enum` instances.
**Author:** Steve McKay
**Since:** 9.0

## Fields

### `enumConstantCache`

**Type:** `java.util.Map<java.lang.Class<? extends java.lang.Enum<?>>,java.util.Map<java.lang.String,java.lang.ref.WeakReference<? extends java.lang.Enum<?>>>>`

## Constructors

### `<init>()`

## Methods

### `getField(`java.lang.Enum<?>` enumValue)`

**Returns:** `java.lang.reflect.Field`

Returns the `Field` in which `enumValue` is defined. For example, to get the `Description` annotation on the `GOLF` constant of enum `Sport`, use `Enums.getField(Sport.GOLF).getAnnotation(Description.class)`.
**Since:** 12.0

### `getIfPresent(`java.lang.Class<T>` enumClass, `java.lang.String` value)`

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

Returns an optional enum constant for the given type, using `Enum.valueOf`. If the
 constant does not exist, `Optional.absent` is returned. A common use case is for parsing
 user input or falling back to a default enum constant. For example, `Enums.getIfPresent(Country.class, countryInput).or(Country.DEFAULT);`
**Since:** 12.0

### `populateCache(`java.lang.Class<T>` enumClass)`

**Returns:** `java.util.Map<java.lang.String,java.lang.ref.WeakReference<? extends java.lang.Enum<?>>>`

### `getEnumConstants(`java.lang.Class<T>` enumClass)`

**Returns:** `java.util.Map<java.lang.String,java.lang.ref.WeakReference<? extends java.lang.Enum<?>>>`

### `stringConverter(`java.lang.Class<T>` enumClass)`

**Returns:** [`com.google.common.base.Converter<java.lang.String,T>`](./Converter.md)

Returns a serializable converter that converts between strings and `enum` values of type
 `enumClass` using `Enum.valueOf(Class, String)` and `Enum.name()`. The
 converter will throw an `IllegalArgumentException` if the argument is not the name of any
 enum constant in the specified enum.
**Since:** 16.0

