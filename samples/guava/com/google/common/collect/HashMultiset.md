# Class: `HashMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.HashMultiset`

**Extends:** [`com.google.common.collect.AbstractMapBasedMultiset<E>`](./AbstractMapBasedMultiset.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Multiset implementation backed by a {@link HashMap}.
@author Kevin Bourrillion
@author Jared Levy
@since 2.0

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

### `<init>(`int` distinctElements)`

## Methods

### `create()`

**Returns:** [`com.google.common.collect.HashMultiset<E>`](./HashMultiset.md)

Creates a new, empty {@code HashMultiset} using the default initial capacity.

### `create(`int` distinctElements)`

**Returns:** [`com.google.common.collect.HashMultiset<E>`](./HashMultiset.md)

Creates a new, empty {@code HashMultiset} with the specified expected number of distinct
 elements.
@param distinctElements the expected number of distinct elements
@throws IllegalArgumentException if {@code distinctElements} is negative

### `create(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.HashMultiset<E>`](./HashMultiset.md)

Creates a new {@code HashMultiset} containing the specified elements.

 <p>This implementation is highly efficient when {@code elements} is itself a {@link Multiset}.
@param elements the elements that the multiset should contain

### `writeObject([`java.io.ObjectOutputStream`](../../../../java/io/ObjectOutputStream.md) stream)`

**Returns:** `void`

@serialData the number of distinct elements, the first element, its count, the second element,
     its count, and so on

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

