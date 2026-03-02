# Class: `PairwiseEquivalence`

**Package:** [`com.google.common.base`](README.md)

**Fully Qualified Name:** `com.google.common.base.PairwiseEquivalence`

**Extends:** [`com.google.common.base.Equivalence<java.lang.Iterable<T>>`](./Equivalence.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `E` extends `java.lang.Object`
- `T` extends `@org.checkerframework.checker.nullness.qual.Nullable E`

## Fields

### `elementEquivalence`

**Type:** [`com.google.common.base.Equivalence<E>`](./Equivalence.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(com.google.common.base.Equivalence<E> elementEquivalence)`

**Parameters:**
- `elementEquivalence` ([`com.google.common.base.Equivalence<E>`](./Equivalence.md))

## Methods

### `doEquivalent(java.lang.Iterable<T> iterableA, java.lang.Iterable<T> iterableB)`

**Returns:** `boolean`

**Parameters:**
- `iterableA` (`java.lang.Iterable<T>`)
- `iterableB` (`java.lang.Iterable<T>`)

### `doHash(java.lang.Iterable<T> iterable)`

**Returns:** `int`

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`)

### `equals(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

