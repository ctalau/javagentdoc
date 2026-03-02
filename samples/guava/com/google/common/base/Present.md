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

**Returns:** `T`

**Parameters:**
- `defaultValue` (`T`)

### `or(com.google.common.base.Optional<? extends T> secondChoice)`

**Returns:** [`com.google.common.base.Optional<T>`](./Optional.md)

**Parameters:**
- `secondChoice` ([`com.google.common.base.Optional<? extends T>`](./Optional.md))

### `or(com.google.common.base.Supplier<? extends T> supplier)`

**Returns:** `T`

**Parameters:**
- `supplier` ([`com.google.common.base.Supplier<? extends T>`](./Supplier.md))

### `orNull()`

**Returns:** `T`

### `asSet()`

**Returns:** `java.util.Set<T>`

### `transform(com.google.common.base.Function<? super T,V> function)`

**Returns:** [`com.google.common.base.Optional<V>`](./Optional.md)

**Parameters:**
- `function` ([`com.google.common.base.Function<? super T,V>`](./Function.md))

### `equals(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

