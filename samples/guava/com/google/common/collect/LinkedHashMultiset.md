# Class: `LinkedHashMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.LinkedHashMultiset`

**Extends:** [`com.google.common.collect.AbstractMapBasedMultiset<E>`](./AbstractMapBasedMultiset.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Its iterator orders elements
 according to when the first occurrence of the element was added. When the multiset contains
 multiple instances of an element, those instances are consecutive in the iteration order. If all
 occurrences of an element are removed, after which that element is added to the multiset, the
 element will appear at the end of the iteration.

 
See the Guava User Guide article on [Multiset](https://github.com/google/guava/wiki/NewCollectionTypesExplained#multiset).

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

### `<init>(int distinctElements)`

**Parameters:**
- `distinctElements` (`int`)

## Methods

### `create()`

**Returns:** [`com.google.common.collect.LinkedHashMultiset<E>`](./LinkedHashMultiset.md)

### `create(int distinctElements)`

**Returns:** [`com.google.common.collect.LinkedHashMultiset<E>`](./LinkedHashMultiset.md)

**Parameters:**
- `distinctElements` (`int`): the expected number of distinct elements

### `create(java.lang.Iterable<? extends E> elements)`

**Returns:** [`com.google.common.collect.LinkedHashMultiset<E>`](./LinkedHashMultiset.md)

This implementation is highly efficient when elements is itself a Multiset.

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`): the elements that the multiset should contain

### `writeObject(java.io.ObjectOutputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectOutputStream`)

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

