# Class: `Present`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.Present`

**Extends:** [`com.google.common.base.Optional<T>`](./Optional.md)

## Type Parameters

- `T` extends `java.lang.Object`

## Description

## Fields

### `reference`

**Type:** `T`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(T reference)`

**Parameters:**
- `reference` (`T`)

## Methods

### `isPresent()`

**Returns:** `boolean`

### `get()`

**Returns:** `T`

### `or(T defaultValue)`

**Parameters:**
- `defaultValue` (`T`)

**Returns:** `T`

### `or(Optional<? extends T> secondChoice)`

**Parameters:**
- `secondChoice` ([`com.google.common.base.Optional<? extends T>`](./Optional.md))

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

### `or(Supplier<? extends T> supplier)`

**Parameters:**
- `supplier` ([`com.google.common.base.Supplier<? extends T>`](./Supplier.md))

**Returns:** `T`

### `orNull()`

**Returns:** `T`

### `asSet()`

**Returns:** `java.util.Set<T>`

### `transform(Function<? super T,V> function)`

**Parameters:**
- `function` ([`com.google.common.base.Function<? super T,V>`](./Function.md))

**Returns:** [`com.google.common.base.Optional<V>`](./Optional.md)

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

