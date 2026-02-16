# Class: `Absent`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Absent`

**Extends:** [`com.google.common.base.Optional<T>`](./Optional.md)

## Type Parameters

- `T` extends `java.lang.Object`

## Description

Implementation of an `Optional` not containing a reference.

## Fields

### `INSTANCE`

**Type:** [`com.google.common.base.Absent<java.lang.Object>`](./Absent.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `withType()`

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

### `isPresent()`

**Returns:** `boolean`

### `get()`

**Returns:** `T`

### `or(`T` defaultValue)`

**Returns:** `T`

### `or([`com.google.common.base.Optional<? extends T>`](./Optional.md) secondChoice)`

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

### `or([`com.google.common.base.Supplier<? extends T>`](./Supplier.md) supplier)`

**Returns:** `T`

### `orNull()`

**Returns:** `T`

### `asSet()`

**Returns:** `java.util.Set<T>`

### `transform([`com.google.common.base.Function<? super T,V>`](./Function.md) function)`

**Returns:** [`com.google.common.base.Optional<V>`](./Optional.md)

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `readResolve()`

**Returns:** `java.lang.Object`

