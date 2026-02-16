# Class: `ImmutableMapValues`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableMapValues`

**Extends:** [`com.google.common.collect.ImmutableCollection<V>`](./ImmutableCollection.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

{@code values()} implementation for {@link ImmutableMap}.
@author Jesse Wilson
@author Kevin Bourrillion

## Fields

### `map`

**Type:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

## Constructors

### `<init>([`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md) map)`

## Methods

### `size()`

**Returns:** `int`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<V>`](./UnmodifiableIterator.md)

### `spliterator()`

**Returns:** [`java.util.Spliterator<V>`](../../../../java/util/Spliterator.md)

### `contains(`java.lang.Object` object)`

**Returns:** `boolean`

### `isPartialView()`

**Returns:** `boolean`

### `asList()`

**Returns:** [`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md)

### `forEach([`java.util.function.Consumer<? super V>`](../../../../java/util/function/Consumer.md) action)`

**Returns:** `void`

### `writeReplace()`

**Returns:** `java.lang.Object`

