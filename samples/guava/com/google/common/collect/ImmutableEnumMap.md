# Class: `ImmutableEnumMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableEnumMap`

**Extends:** [`com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap<K,V>`](ImmutableMap/IteratorBasedImmutableMap.md)

## Type Parameters

- `K` extends `java.lang.Enum<K>`
- `V` extends `java.lang.Object`

## Description

Implementation of `ImmutableMap` backed by a non-empty `java.util.EnumMap`.
**Author:** Louis Wasserman

## Fields

### `delegate`

**Type:** `java.util.EnumMap<K,V>`

## Constructors

### `<init>(`java.util.EnumMap<K,V>` delegate)`

## Methods

### `asImmutable(`java.util.EnumMap<K,V>` map)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

### `keyIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<K>`](./UnmodifiableIterator.md)

### `keySpliterator()`

**Returns:** `java.util.Spliterator<K>`

### `size()`

**Returns:** `int`

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

### `get(`java.lang.Object` key)`

**Returns:** `V`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `entryIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K,V>>`](./UnmodifiableIterator>.md)

### `entrySpliterator()`

**Returns:** `java.util.Spliterator<java.util.Map.Entry<K,V>>`

### `forEach(`java.util.function.BiConsumer<? super K,? super V>` action)`

**Returns:** `void`

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

