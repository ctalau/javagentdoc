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

### `<init>(com.google.common.collect.ImmutableMap<K,V> map)`

**Parameters:**
- `map` ([`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md))

## Methods

### `size()`

**Returns:** `int`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<V>`](./UnmodifiableIterator.md)

### `spliterator()`

**Returns:** `java.util.Spliterator<V>`

### `contains(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `isPartialView()`

**Returns:** `boolean`

### `asList()`

**Returns:** [`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md)

### `forEach(java.util.function.Consumer<? super V> action)`

**Returns:** `void`

**Parameters:**
- `action` (`java.util.function.Consumer<? super V>`)

### `writeReplace()`

**Returns:** `java.lang.Object`

