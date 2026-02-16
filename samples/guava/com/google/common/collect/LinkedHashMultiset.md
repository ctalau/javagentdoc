# Class: `LinkedHashMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.LinkedHashMultiset`

**Extends:** [`com.google.common.collect.AbstractMapBasedMultiset<E>`](./AbstractMapBasedMultiset.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A `Multiset` implementation with predictable iteration order. Its iterator orders elements
 according to when the first occurrence of the element was added. When the multiset contains
 multiple instances of an element, those instances are consecutive in the iteration order. If all
 occurrences of an element are removed, after which that element is added to the multiset, the
 element will appear at the end of the iteration.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#multiset">`Multiset`</a>.
**Author:** Kevin Bourrillion
**Author:** Jared Levy
**Since:** 2.0

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

### `<init>(`int` distinctElements)`

## Methods

### `create()`

**Returns:** [`com.google.common.collect.LinkedHashMultiset<E>`](./LinkedHashMultiset.md)

Creates a new, empty `LinkedHashMultiset` using the default initial capacity.

### `create(`int` distinctElements)`

**Returns:** [`com.google.common.collect.LinkedHashMultiset<E>`](./LinkedHashMultiset.md)

Creates a new, empty `LinkedHashMultiset` with the specified expected number of distinct
 elements.
@param distinctElements the expected number of distinct elements
@throws IllegalArgumentException if `distinctElements` is negative

### `create(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.LinkedHashMultiset<E>`](./LinkedHashMultiset.md)

Creates a new `LinkedHashMultiset` containing the specified elements.

 <p>This implementation is highly efficient when `elements` is itself a `Multiset`.
@param elements the elements that the multiset should contain

### `writeObject(`java.io.ObjectOutputStream` stream)`

**Returns:** `void`

@serialData the number of distinct elements, the first element, its count, the second element,
     its count, and so on

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

