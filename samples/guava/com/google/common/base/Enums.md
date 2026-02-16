# Class: `Enums`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Enums`

## Description

Utility methods for working with {@link Enum} instances.
@author Steve McKay
@since 9.0

## Fields

### `enumConstantCache`

**Type:** [`java.util.Map<java.lang.Class<? extends java.lang.Enum<?>>,java.util.Map<java.lang.String,java.lang.ref.WeakReference<? extends java.lang.Enum<?>>>>`](../../../../java/util/Map>,java/util/Map>>>.md)

## Constructors

### `<init>()`

## Methods

### `getField(`java.lang.Enum<?>` enumValue)`

**Returns:** `java.lang.reflect.Field`

Returns the {@link Field} in which {@code enumValue} is defined. For example, to get the {@code
 Description} annotation on the {@code GOLF} constant of enum {@code Sport}, use {@code
 Enums.getField(Sport.GOLF).getAnnotation(Description.class)}.
@since 12.0

### `getIfPresent(`java.lang.Class<T>` enumClass, `java.lang.String` value)`

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

Returns an optional enum constant for the given type, using {@link Enum#valueOf}. If the
 constant does not exist, {@link Optional#absent} is returned. A common use case is for parsing
 user input or falling back to a default enum constant. For example, {@code
 Enums.getIfPresent(Country.class, countryInput).or(Country.DEFAULT);}
@since 12.0

### `populateCache(`java.lang.Class<T>` enumClass)`

**Returns:** [`java.util.Map<java.lang.String,java.lang.ref.WeakReference<? extends java.lang.Enum<?>>>`](../../../../java/util/Map>>.md)

### `getEnumConstants(`java.lang.Class<T>` enumClass)`

**Returns:** [`java.util.Map<java.lang.String,java.lang.ref.WeakReference<? extends java.lang.Enum<?>>>`](../../../../java/util/Map>>.md)

### `stringConverter(`java.lang.Class<T>` enumClass)`

**Returns:** [`com.google.common.base.Converter<java.lang.String,T>`](./Converter.md)

Returns a serializable converter that converts between strings and {@code enum} values of type
 {@code enumClass} using {@link Enum#valueOf(Class, String)} and {@link Enum#name()}. The
 converter will throw an {@code IllegalArgumentException} if the argument is not the name of any
 enum constant in the specified enum.
@since 16.0

