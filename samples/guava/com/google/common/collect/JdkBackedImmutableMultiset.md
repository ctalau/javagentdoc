# Class: `JdkBackedImmutableMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.JdkBackedImmutableMultiset`

**Extends:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

An implementation of ImmutableMultiset backed by a JDK Map and a list of entries. Used to protect
 against hash flooding attacks.
@author Louis Wasserman

## Fields

### `delegateMap`

**Type:** [`java.util.Map<E,java.lang.Integer>`](../../../../java/util/Map.md)

### `entries`

**Type:** [`com.google.common.collect.ImmutableList<com.google.common.collect.Multiset.Entry<E>>`](./ImmutableList>.md)

### `size`

**Type:** `long`

### `elementSet`

**Type:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

## Constructors

### `<init>([`java.util.Map<E,java.lang.Integer>`](../../../../java/util/Map.md) delegateMap, [`com.google.common.collect.ImmutableList<com.google.common.collect.Multiset.Entry<E>>`](./ImmutableList>.md) entries, `long` size)`

## Methods

### `create([`java.util.Collection<? extends com.google.common.collect.Multiset.Entry<? extends E>>`](../../../../java/util/Collection>.md) entries)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

### `count(`java.lang.Object` element)`

**Returns:** `int`

### `elementSet()`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

### `getEntry(`int` index)`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `isPartialView()`

**Returns:** `boolean`

### `size()`

**Returns:** `int`

### `writeReplace()`

**Returns:** `java.lang.Object`

