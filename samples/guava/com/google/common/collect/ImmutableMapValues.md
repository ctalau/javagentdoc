# Class: `ImmutableMapValues`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableMapValues`

**Extends:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

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

**Returns:** [`com.google.common.collect.UnmodifiableIterator<V>`](./UnmodifiableIterator.md)

### `spliterator()`

**Returns:** `java.util.Spliterator<V>`

### `contains(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `isPartialView()`

**Returns:** `boolean`

### `asList()`

**Returns:** [`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md)

### `forEach(Consumer<? super V> action)`

**Parameters:**
- `action` (`java.util.function.Consumer<? super V>`)

**Returns:** `void`

### `writeReplace()`

**Returns:** `java.lang.Object`

