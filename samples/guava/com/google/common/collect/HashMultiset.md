# Class: `HashMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.HashMultiset`

**Extends:** [`com.google.common.collect.AbstractMapBasedMultiset<E>`](./AbstractMapBasedMultiset.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

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

**Returns:** [`com.google.common.collect.HashMultiset<E>`](./HashMultiset.md)

### `create(int distinctElements)`

**Returns:** [`com.google.common.collect.HashMultiset<E>`](./HashMultiset.md)

**Parameters:**
- `distinctElements` (`int`): the expected number of distinct elements

### `create(java.lang.Iterable<? extends E> elements)`

**Returns:** [`com.google.common.collect.HashMultiset<E>`](./HashMultiset.md)

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

