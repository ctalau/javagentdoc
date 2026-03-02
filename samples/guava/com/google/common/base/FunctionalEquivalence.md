# Class: `FunctionalEquivalence`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.FunctionalEquivalence`

**Extends:** [`com.google.common.base.Equivalence<F>`](./Equivalence.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `F` extends `java.lang.Object`
- `T` extends `java.lang.Object`

## Description

## Fields

### `serialVersionUID`

**Type:** `long`

### `function`

**Type:** [`com.google.common.base.Function<? super F,? extends @org.checkerframework.checker.nullness.qual.Nullable T>`](./Function.md)

### `resultEquivalence`

**Type:** [`com.google.common.base.Equivalence<T>`](./Equivalence.md)

## Constructors

### `<init>(com.google.common.base.Function<? super F,? extends @org.checkerframework.checker.nullness.qual.Nullable T> function, com.google.common.base.Equivalence<T> resultEquivalence)`

**Parameters:**
- `function` ([`com.google.common.base.Function<? super F,? extends @org.checkerframework.checker.nullness.qual.Nullable T>`](./Function.md))
- `resultEquivalence` ([`com.google.common.base.Equivalence<T>`](./Equivalence.md))

## Methods

### `doEquivalent(F a, F b)`

**Returns:** `boolean`

**Parameters:**
- `a` (`F`)
- `b` (`F`)

### `doHash(F a)`

**Returns:** `int`

**Parameters:**
- `a` (`F`)

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

**Parameters:**
- `obj` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

