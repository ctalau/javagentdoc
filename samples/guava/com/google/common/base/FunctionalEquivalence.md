# Class: `FunctionalEquivalence`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.FunctionalEquivalence`

**Extends:** [`com.google.common.base.Equivalence<F>`](./Equivalence.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `F` extends `java.lang.Object`
- `T` extends `java.lang.Object`

## Description

Equivalence applied on functional result.
@author Bob Lee
@since 10.0

## Fields

### `serialVersionUID`

**Type:** `long`

### `function`

**Type:** [`com.google.common.base.Function<? super F,? extends @org.checkerframework.checker.nullness.qual.Nullable T>`](./Function.md)

### `resultEquivalence`

**Type:** [`com.google.common.base.Equivalence<T>`](./Equivalence.md)

## Constructors

### `<init>([`com.google.common.base.Function<? super F,? extends @org.checkerframework.checker.nullness.qual.Nullable T>`](./Function.md) function, [`com.google.common.base.Equivalence<T>`](./Equivalence.md) resultEquivalence)`

## Methods

### `doEquivalent([`F`](F.md) a, [`F`](F.md) b)`

**Returns:** `boolean`

### `doHash([`F`](F.md) a)`

**Returns:** `int`

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

