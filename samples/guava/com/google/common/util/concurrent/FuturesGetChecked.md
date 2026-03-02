# Class: `FuturesGetChecked`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.FuturesGetChecked`

## Description

## Fields

### `ORDERING_BY_CONSTRUCTOR_PARAMETER_LIST`

**Type:** [`com.google.common.collect.Ordering<java.util.List<java.lang.Class<?>>>`](../../collect/Ordering.md)

### `WITH_STRING_PARAM_THEN_WITH_THROWABLE_PARAM`

**Type:** [`com.google.common.collect.Ordering<java.lang.reflect.Constructor<?>>`](../../collect/Ordering.md)

## Constructors

### `<init>()`

## Methods

### `getChecked(java.util.concurrent.Future<V> future, java.lang.Class<X> exceptionClass)`

**Returns:** `V`

**Parameters:**
- `future` (`java.util.concurrent.Future<V>`)
- `exceptionClass` (`java.lang.Class<X>`)

### `getChecked(com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator validator, java.util.concurrent.Future<V> future, java.lang.Class<X> exceptionClass)`

**Returns:** `V`

**Parameters:**
- `validator` (`com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator`)
- `future` (`java.util.concurrent.Future<V>`)
- `exceptionClass` (`java.lang.Class<X>`)

### `getChecked(java.util.concurrent.Future<V> future, java.lang.Class<X> exceptionClass, long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `V`

**Parameters:**
- `future` (`java.util.concurrent.Future<V>`)
- `exceptionClass` (`java.lang.Class<X>`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `bestGetCheckedTypeValidator()`

**Returns:** `com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator`

### `weakSetValidator()`

**Returns:** `com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator`

### `classValueValidator()`

**Returns:** `com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator`

### `wrapAndThrowExceptionOrError(java.lang.Throwable cause, java.lang.Class<X> exceptionClass)`

**Returns:** `void`

**Parameters:**
- `cause` (`java.lang.Throwable`)
- `exceptionClass` (`java.lang.Class<X>`)

### `hasConstructorUsableByGetChecked(java.lang.Class<? extends java.lang.Exception> exceptionClass)`

**Returns:** `boolean`

**Parameters:**
- `exceptionClass` (`java.lang.Class<? extends java.lang.Exception>`)

### `newWithCause(java.lang.Class<X> exceptionClass, java.lang.Throwable cause)`

**Returns:** `X`

**Parameters:**
- `exceptionClass` (`java.lang.Class<X>`)
- `cause` (`java.lang.Throwable`)

### `preferringStringsThenThrowables(java.util.List<java.lang.reflect.Constructor<X>> constructors)`

**Returns:** `java.util.List<java.lang.reflect.Constructor<X>>`

**Parameters:**
- `constructors` (`java.util.List<java.lang.reflect.Constructor<X>>`)

### `newFromConstructor(java.lang.reflect.Constructor<X> constructor, java.lang.Throwable cause)`

**Returns:** `X`

**Parameters:**
- `constructor` (`java.lang.reflect.Constructor<X>`)
- `cause` (`java.lang.Throwable`)

### `isCheckedException(java.lang.Class<? extends java.lang.Exception> type)`

**Returns:** `boolean`

**Parameters:**
- `type` (`java.lang.Class<? extends java.lang.Exception>`)

### `checkExceptionClassValidity(java.lang.Class<? extends java.lang.Exception> exceptionClass)`

**Returns:** `void`

**Parameters:**
- `exceptionClass` (`java.lang.Class<? extends java.lang.Exception>`)

