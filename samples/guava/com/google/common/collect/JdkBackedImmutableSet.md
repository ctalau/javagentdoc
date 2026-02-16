# Class: `JdkBackedImmutableSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.JdkBackedImmutableSet`

**Extends:** [`com.google.common.collect.IndexedImmutableSet<E>`](./IndexedImmutableSet.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

ImmutableSet implementation backed by a JDK HashSet, used to defend against apparent hash
 flooding. This implementation is never used on the GWT client side, but it must be present there
 for serialization to work.
**Author:** Louis Wasserman

## Fields

### `delegate`

**Type:** `java.util.Set<?>`

### `delegateList`

**Type:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

## Constructors

### `<init>(`java.util.Set<?>` delegate, [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md) delegateList)`

## Methods

### `get(`int` index)`

**Returns:** `E`

### `contains(`java.lang.Object` object)`

**Returns:** `boolean`

### `isPartialView()`

**Returns:** `boolean`

### `size()`

**Returns:** `int`

### `writeReplace()`

**Returns:** `java.lang.Object`

