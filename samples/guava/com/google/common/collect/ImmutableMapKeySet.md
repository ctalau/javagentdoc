# Class: `ImmutableMapKeySet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableMapKeySet`

**Extends:** [`com.google.common.collect.IndexedImmutableSet<K>`](./IndexedImmutableSet.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

`keySet()` implementation for `ImmutableMap`.
**Author:** Jesse Wilson
**Author:** Kevin Bourrillion

## Fields

### `map`

**Type:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

## Constructors

### `<init>([`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md) map)`

## Methods

### `size()`

**Returns:** `int`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<K>`](./UnmodifiableIterator.md)

### `spliterator()`

**Returns:** `java.util.Spliterator<K>`

### `contains(`java.lang.Object` object)`

**Returns:** `boolean`

### `get(`int` index)`

**Returns:** `K`

### `forEach(`java.util.function.Consumer<? super K>` action)`

**Returns:** `void`

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

