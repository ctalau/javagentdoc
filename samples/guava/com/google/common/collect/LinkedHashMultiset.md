# Class: `LinkedHashMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.LinkedHashMultiset`

**Extends:** [`com.google.common.collect.AbstractMapBasedMultiset<E>`](./AbstractMapBasedMultiset.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A {@code Multiset} implementation with predictable iteration order. Its iterator orders elements
 according to when the first occurrence of the element was added. When the multiset contains
 multiple instances of an element, those instances are consecutive in the iteration order. If all
 occurrences of an element are removed, after which that element is added to the multiset, the
 element will appear at the end of the iteration.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#multiset">{@code Multiset}</a>.
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

**Returns:** [`com.google.common.collect.LinkedHashMultiset<E>`](./LinkedHashMultiset.md)

Creates a new, empty {@code LinkedHashMultiset} using the default initial capacity.

### `create(`int` distinctElements)`

**Returns:** [`com.google.common.collect.LinkedHashMultiset<E>`](./LinkedHashMultiset.md)

Creates a new, empty {@code LinkedHashMultiset} with the specified expected number of distinct
 elements.
@param distinctElements the expected number of distinct elements
@throws IllegalArgumentException if {@code distinctElements} is negative

### `create(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.LinkedHashMultiset<E>`](./LinkedHashMultiset.md)

Creates a new {@code LinkedHashMultiset} containing the specified elements.

 <p>This implementation is highly efficient when {@code elements} is itself a {@link Multiset}.
@param elements the elements that the multiset should contain

### `writeObject([`java.io.ObjectOutputStream`](../../../../java/io/ObjectOutputStream.md) stream)`

**Returns:** `void`

@serialData the number of distinct elements, the first element, its count, the second element,
     its count, and so on

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

