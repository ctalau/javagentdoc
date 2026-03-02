# Class: `JdkBackedImmutableMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.JdkBackedImmutableMultiset`

**Extends:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

Used to protect
 against hash flooding attacks.

## Fields

### `delegateMap`

**Type:** `java.util.Map<E,java.lang.Integer>`

### `entries`

**Type:** [`com.google.common.collect.ImmutableList<com.google.common.collect.Multiset.Entry<E>>`](./ImmutableList.md)

### `size`

**Type:** `long`

### `elementSet`

**Type:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

## Constructors

### `<init>(java.util.Map<E,java.lang.Integer> delegateMap, com.google.common.collect.ImmutableList<com.google.common.collect.Multiset.Entry<E>> entries, long size)`

**Parameters:**
- `delegateMap` (`java.util.Map<E,java.lang.Integer>`)
- `entries` ([`com.google.common.collect.ImmutableList<com.google.common.collect.Multiset.Entry<E>>`](./ImmutableList.md))
- `size` (`long`)

## Methods

### `create(java.util.Collection<? extends com.google.common.collect.Multiset.Entry<? extends E>> entries)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

**Parameters:**
- `entries` (`java.util.Collection<? extends com.google.common.collect.Multiset.Entry<? extends E>>`)

### `count(java.lang.Object element)`

**Returns:** `int`

**Parameters:**
- `element` (`java.lang.Object`)

### `elementSet()`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

### `getEntry(int index)`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

**Parameters:**
- `index` (`int`)

### `isPartialView()`

**Returns:** `boolean`

### `size()`

**Returns:** `int`

### `writeReplace()`

**Returns:** `java.lang.Object`

