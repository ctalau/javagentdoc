# Class: `Defaults`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Defaults`

## Description

This class provides default values for all Java types, as defined by the JLS.
@author Ben Yu
@since 1.0

## Fields

### `DOUBLE_DEFAULT`

**Type:** `java.lang.Double`

### `FLOAT_DEFAULT`

**Type:** `java.lang.Float`

## Constructors

### `<init>()`

## Methods

### `defaultValue(`java.lang.Class<T>` type)`

**Returns:** [`T`](T.md)

Returns the default value of {@code type} as defined by JLS --- {@code 0} for numbers, {@code
 false} for {@code boolean} and {@code '\0'} for {@code char}. For non-primitive types and
 {@code void}, {@code null} is returned.

