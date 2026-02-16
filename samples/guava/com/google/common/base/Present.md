# Class: `Present`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Present`

**Extends:** [`com.google.common.base.Optional<T>`](./Optional.md)

## Type Parameters

- `T` extends `java.lang.Object`

## Description

Implementation of an {@link Optional} containing a reference.

## Fields

### `reference`

**Type:** [`T`](T.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`T`](T.md) reference)`

## Methods

### `isPresent()`

**Returns:** `boolean`

### `get()`

**Returns:** [`T`](T.md)

### `or([`T`](T.md) defaultValue)`

**Returns:** [`T`](T.md)

### `or([`com.google.common.base.Optional<? extends T>`](./Optional.md) secondChoice)`

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

### `or([`com.google.common.base.Supplier<? extends T>`](./Supplier.md) supplier)`

**Returns:** [`T`](T.md)

### `orNull()`

**Returns:** [`T`](T.md)

### `asSet()`

**Returns:** [`java.util.Set<T>`](../../../../java/util/Set.md)

### `transform([`com.google.common.base.Function<? super T,V>`](./Function.md) function)`

**Returns:** [`com.google.common.base.Optional<V>`](./Optional.md)

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

