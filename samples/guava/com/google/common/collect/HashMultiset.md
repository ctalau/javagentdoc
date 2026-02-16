# Class: `HashMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.HashMultiset`

**Extends:** [`com.google.common.collect.AbstractMapBasedMultiset<E>`](./AbstractMapBasedMultiset.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Multiset implementation backed by a `HashMap`.
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

**Returns:** [`com.google.common.collect.HashMultiset<E>`](./HashMultiset.md)

Creates a new, empty `HashMultiset` using the default initial capacity.

### `create(`int` distinctElements)`

**Returns:** [`com.google.common.collect.HashMultiset<E>`](./HashMultiset.md)

Creates a new, empty `HashMultiset` with the specified expected number of distinct
 elements.
@param distinctElements the expected number of distinct elements
@throws IllegalArgumentException if `distinctElements` is negative

### `create(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.HashMultiset<E>`](./HashMultiset.md)

Creates a new `HashMultiset` containing the specified elements.

 <p>This implementation is highly efficient when `elements` is itself a `Multiset`.
@param elements the elements that the multiset should contain

### `writeObject(`java.io.ObjectOutputStream` stream)`

**Returns:** `void`

@serialData the number of distinct elements, the first element, its count, the second element,
     its count, and so on

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

