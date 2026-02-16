# Class: `ForwardingSortedMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingSortedMap`

**Extends:** [`com.google.common.collect.ForwardingMap<K,V>`](./ForwardingMap.md)

**Implements:** `java.util.SortedMap<K,V>`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A sorted map which forwards all its method calls to another sorted map. Subclasses should
 override one or more methods to modify the behavior of the backing sorted map as desired per the
 <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of `ForwardingSortedMap` forward <i>indiscriminately</i> to
 the methods of the delegate. For example, overriding `put` alone <i>will not</i> change
 the behavior of `putAll`, which can lead to unexpected behavior. In this case, you should
 override `putAll` as well, either providing your own implementation, or delegating to the
 provided `standardPutAll` method.

 <p><b>`default` method warning:</b> This class does <i>not</i> forward calls to `default` methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the `ForwardingSortedMap`.

 <p>Each of the `standard` methods, where appropriate, use the comparator of the map to test
 equality for both keys and values, unlike `ForwardingMap`.

 <p>The `standard` methods and the collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.
**Author:** Mike Bostock
**Author:** Louis Wasserman
**Since:** 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** `java.util.SortedMap<K,V>`

### `comparator()`

**Returns:** `java.util.Comparator<? super K>`

### `firstKey()`

**Returns:** `K`

### `headMap(`K` toKey)`

**Returns:** `java.util.SortedMap<K,V>`

### `lastKey()`

**Returns:** `K`

### `subMap(`K` fromKey, `K` toKey)`

**Returns:** `java.util.SortedMap<K,V>`

### `tailMap(`K` fromKey)`

**Returns:** `java.util.SortedMap<K,V>`

### `unsafeCompare(`java.util.Comparator<?>` comparator, `java.lang.Object` o1, `java.lang.Object` o2)`

**Returns:** `int`

### `standardContainsKey(`java.lang.Object` key)`

**Returns:** `boolean`

A sensible definition of `containsKey` in terms of the `firstKey()` method of
 `tailMap`. If you override `tailMap`, you may wish to override `containsKey` to forward to this implementation.
**Since:** 7.0

### `standardSubMap(`K` fromKey, `K` toKey)`

**Returns:** `java.util.SortedMap<K,V>`

A sensible default implementation of `subMap(Object, Object)` in terms of `headMap(Object)` and `tailMap(Object)`. In some situations, you may wish to override
 `subMap(Object, Object)` to forward to this implementation.
**Since:** 7.0

