# Class: `ImmutableEnumMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableEnumMap`

**Extends:** [`com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap<K,V>`](ImmutableMap/IteratorBasedImmutableMap.md)

## Type Parameters

- `K` extends `java.lang.Enum<K>`
- `V` extends `java.lang.Object`

## Description

Implementation of {@link ImmutableMap} backed by a non-empty {@link java.util.EnumMap}.
@author Louis Wasserman

## Fields

### `delegate`

**Type:** [`java.util.EnumMap<K,V>`](../../../../java/util/EnumMap.md)

## Constructors

### `<init>([`java.util.EnumMap<K,V>`](../../../../java/util/EnumMap.md) delegate)`

## Methods

### `asImmutable([`java.util.EnumMap<K,V>`](../../../../java/util/EnumMap.md) map)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

### `keyIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<K>`](./UnmodifiableIterator.md)

### `keySpliterator()`

**Returns:** [`java.util.Spliterator<K>`](../../../../java/util/Spliterator.md)

### `size()`

**Returns:** `int`

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

### `get(`java.lang.Object` key)`

**Returns:** [`V`](V.md)

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `entryIterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K,V>>`](./UnmodifiableIterator>.md)

### `entrySpliterator()`

**Returns:** [`java.util.Spliterator<java.util.Map.Entry<K,V>>`](../../../../java/util/Spliterator>.md)

### `forEach([`java.util.function.BiConsumer<? super K,? super V>`](../../../../java/util/function/BiConsumer.md) action)`

**Returns:** `void`

### `isPartialView()`

**Returns:** `boolean`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

