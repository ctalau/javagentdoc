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

### `<init>(Equivalence<E> elementEquivalence)`

**Parameters:**
- `elementEquivalence` ([`com.google.common.base.Equivalence<E>`](./Equivalence.md))

## Methods

### `doEquivalent(Iterable<T> iterableA, Iterable<T> iterableB)`

**Parameters:**
- `iterableA` (`java.lang.Iterable<T>`)
- `iterableB` (`java.lang.Iterable<T>`)

**Returns:** `boolean`

### `doHash(Iterable<T> iterable)`

**Parameters:**
- `iterable` (`java.lang.Iterable<T>`)

**Returns:** `int`

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

