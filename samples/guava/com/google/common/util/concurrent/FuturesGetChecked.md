# Class: `FuturesGetChecked`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.FuturesGetChecked`

## Description

Static methods used to implement `Futures.getChecked(Future, Class)`.

## Fields

### `ORDERING_BY_CONSTRUCTOR_PARAMETER_LIST`

**Type:** [`com.google.common.collect.Ordering<java.util.List<java.lang.Class<?>>>`](../../collect/Ordering>>.md)

### `WITH_STRING_PARAM_THEN_WITH_THROWABLE_PARAM`

**Type:** [`com.google.common.collect.Ordering<java.lang.reflect.Constructor<?>>`](../../collect/Ordering>.md)

## Constructors

### `<init>()`

## Methods

### `getChecked(`java.util.concurrent.Future<V>` future, `java.lang.Class<X>` exceptionClass)`

**Returns:** `V`

### `getChecked([`com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator`](FuturesGetChecked/GetCheckedTypeValidator.md) validator, `java.util.concurrent.Future<V>` future, `java.lang.Class<X>` exceptionClass)`

**Returns:** `V`

Implementation of `Futures.getChecked(Future, Class)`.

### `getChecked(`java.util.concurrent.Future<V>` future, `java.lang.Class<X>` exceptionClass, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `V`

Implementation of `Futures.getChecked(Future, Class, long, TimeUnit)`.

### `bestGetCheckedTypeValidator()`

**Returns:** [`com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator`](FuturesGetChecked/GetCheckedTypeValidator.md)

### `weakSetValidator()`

**Returns:** [`com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator`](FuturesGetChecked/GetCheckedTypeValidator.md)

### `classValueValidator()`

**Returns:** [`com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator`](FuturesGetChecked/GetCheckedTypeValidator.md)

### `wrapAndThrowExceptionOrError(`java.lang.Throwable` cause, `java.lang.Class<X>` exceptionClass)`

**Returns:** `void`

### `hasConstructorUsableByGetChecked(`java.lang.Class<? extends java.lang.Exception>` exceptionClass)`

**Returns:** `boolean`

### `newWithCause(`java.lang.Class<X>` exceptionClass, `java.lang.Throwable` cause)`

**Returns:** `X`

### `preferringStringsThenThrowables(`java.util.List<java.lang.reflect.Constructor<X>>` constructors)`

**Returns:** `java.util.List<java.lang.reflect.Constructor<X>>`

### `newFromConstructor(`java.lang.reflect.Constructor<X>` constructor, `java.lang.Throwable` cause)`

**Returns:** `X`

### `isCheckedException(`java.lang.Class<? extends java.lang.Exception>` type)`

**Returns:** `boolean`

### `checkExceptionClassValidity(`java.lang.Class<? extends java.lang.Exception>` exceptionClass)`

**Returns:** `void`

