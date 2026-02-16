# Class: `ForwardingSortedSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingSortedSet`

**Extends:** [`com.google.common.collect.ForwardingSet<E>`](./ForwardingSet.md)

**Implements:** `java.util.SortedSet<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A sorted set which forwards all its method calls to another sorted set. Subclasses should
 override one or more methods to modify the behavior of the backing sorted set as desired per the
 <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of `ForwardingSortedSet` forward <i>indiscriminately</i> to
 the methods of the delegate. For example, overriding `add` alone <i>will not</i> change
 the behavior of `addAll`, which can lead to unexpected behavior. In this case, you should
 override `addAll` as well, either providing your own implementation, or delegating to the
 provided `standardAddAll` method.

 <p><b>`default` method warning:</b> This class does <i>not</i> forward calls to `default` methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the `ForwardingSortedSet`.

 <p>Each of the `standard` methods, where appropriate, uses the set's comparator (or the
 natural ordering of the elements, if there is no comparator) to test element equality. As a
 result, if the comparator is not consistent with equals, some of the standard implementations may
 violate the `Set` contract.

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

**Returns:** `java.util.SortedSet<E>`

### `comparator()`

**Returns:** `java.util.Comparator<? super E>`

### `first()`

**Returns:** `E`

### `headSet(`E` toElement)`

**Returns:** `java.util.SortedSet<E>`

### `last()`

**Returns:** `E`

### `subSet(`E` fromElement, `E` toElement)`

**Returns:** `java.util.SortedSet<E>`

### `tailSet(`E` fromElement)`

**Returns:** `java.util.SortedSet<E>`

### `standardContains(`java.lang.Object` object)`

**Returns:** `boolean`

A sensible definition of `contains` in terms of the `first()` method of `tailSet`. If you override `tailSet`, you may wish to override `contains` to
 forward to this implementation.
**Since:** 7.0

### `standardRemove(`java.lang.Object` object)`

**Returns:** `boolean`

A sensible definition of `remove` in terms of the `iterator()` method of `tailSet`. If you override `tailSet`, you may wish to override `remove` to
 forward to this implementation.
**Since:** 7.0

### `standardSubSet(`E` fromElement, `E` toElement)`

**Returns:** `java.util.SortedSet<E>`

A sensible default implementation of `subSet(Object, Object)` in terms of `headSet(Object)` and `tailSet(Object)`. In some situations, you may wish to override
 `subSet(Object, Object)` to forward to this implementation.
**Since:** 7.0

