# Class: `ImmutableMapKeySet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableMapKeySet`

**Extends:** [`com.google.common.collect.IndexedImmutableSet<K>`](./IndexedImmutableSet.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

## Fields

### `map`

**Type:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

## Constructors

### `<init>(ImmutableMap<K,V> map)`

**Parameters:**
- `map` ([`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md))

## Methods

### `size()`

**Returns:** `int`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<K>`](./UnmodifiableIterator.md)

### `spliterator()`

**Returns:** `java.util.Spliterator<K>`

### `contains(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `get(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** `K`

### `forEach(Consumer<? super K> action)`

**Parameters:**
- `action` (`java.util.function.Consumer<? super K>`)

**Returns:** `void`

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

