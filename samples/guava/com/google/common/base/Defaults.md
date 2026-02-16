# Class: `Defaults`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Defaults`

## Description

This class provides default values for all Java types, as defined by the JLS.
**Author:** Ben Yu
**Since:** 1.0

## Fields

### `DOUBLE_DEFAULT`

**Type:** `java.lang.Double`

### `FLOAT_DEFAULT`

**Type:** `java.lang.Float`

## Constructors

### `<init>()`

## Methods

### `defaultValue(`java.lang.Class<T>` type)`

**Returns:** `T`

Returns the default value of `type` as defined by JLS --- `0` for numbers, `false` for `boolean` and `'\0'` for `char`. For non-primitive types and
 `void`, `null` is returned.

