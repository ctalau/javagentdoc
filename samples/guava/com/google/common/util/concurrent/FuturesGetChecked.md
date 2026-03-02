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

### `getChecked(Future<V> future, Class<X> exceptionClass)`

**Parameters:**
- `future` (`java.util.concurrent.Future<V>`)
- `exceptionClass` (`java.lang.Class<X>`)

**Returns:** `V`

### `getChecked(FuturesGetChecked.GetCheckedTypeValidator validator, Future<V> future, Class<X> exceptionClass)`

**Parameters:**
- `validator` (`com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator`)
- `future` (`java.util.concurrent.Future<V>`)
- `exceptionClass` (`java.lang.Class<X>`)

**Returns:** `V`

### `getChecked(Future<V> future, Class<X> exceptionClass, long timeout, TimeUnit unit)`

**Parameters:**
- `future` (`java.util.concurrent.Future<V>`)
- `exceptionClass` (`java.lang.Class<X>`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `V`

### `bestGetCheckedTypeValidator()`

**Returns:** `com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator`

### `weakSetValidator()`

**Returns:** `com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator`

### `classValueValidator()`

**Returns:** `com.google.common.util.concurrent.FuturesGetChecked.GetCheckedTypeValidator`

### `wrapAndThrowExceptionOrError(Throwable cause, Class<X> exceptionClass)`

**Parameters:**
- `cause` (`java.lang.Throwable`)
- `exceptionClass` (`java.lang.Class<X>`)

**Returns:** `void`

### `hasConstructorUsableByGetChecked(Class<? extends Exception> exceptionClass)`

**Parameters:**
- `exceptionClass` (`java.lang.Class<? extends java.lang.Exception>`)

**Returns:** `boolean`

### `newWithCause(Class<X> exceptionClass, Throwable cause)`

**Parameters:**
- `exceptionClass` (`java.lang.Class<X>`)
- `cause` (`java.lang.Throwable`)

**Returns:** `X`

### `preferringStringsThenThrowables(List<Constructor<X>> constructors)`

**Parameters:**
- `constructors` (`java.util.List<java.lang.reflect.Constructor<X>>`)

**Returns:** `java.util.List<java.lang.reflect.Constructor<X>>`

### `newFromConstructor(Constructor<X> constructor, Throwable cause)`

**Parameters:**
- `constructor` (`java.lang.reflect.Constructor<X>`)
- `cause` (`java.lang.Throwable`)

**Returns:** `X`

### `isCheckedException(Class<? extends Exception> type)`

**Parameters:**
- `type` (`java.lang.Class<? extends java.lang.Exception>`)

**Returns:** `boolean`

### `checkExceptionClassValidity(Class<? extends Exception> exceptionClass)`

**Parameters:**
- `exceptionClass` (`java.lang.Class<? extends java.lang.Exception>`)

**Returns:** `void`

