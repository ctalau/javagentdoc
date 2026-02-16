# Class: `ForwardingSortedMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingSortedMultiset`

**Extends:** [`com.google.common.collect.ForwardingMultiset<E>`](./ForwardingMultiset.md)

**Implements:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A sorted multiset which forwards all its method calls to another sorted multiset. Subclasses
 should override one or more methods to modify the behavior of the backing multiset as desired per
 the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of `ForwardingSortedMultiset` forward
 <b>indiscriminately</b> to the methods of the delegate. For example, overriding `add(Object, int)` alone <b>will not</b> change the behavior of `add(Object)`, which can
 lead to unexpected behavior. In this case, you should override `add(Object)` as well,
 either providing your own implementation, or delegating to the provided `standardAdd`
 method.

 <p><b>`default` method warning:</b> This class does <i>not</i> forward calls to `default` methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the `ForwardingSortedMultiset`.

 <p>The `standard` methods and any collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.
**Author:** Louis Wasserman
**Since:** 15.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `elementSet()`

**Returns:** `java.util.NavigableSet<E>`

### `comparator()`

**Returns:** `java.util.Comparator<? super E>`

### `descendingMultiset()`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `firstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `standardFirstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

A sensible definition of `firstEntry()` in terms of `entrySet().iterator()`.

 <p>If you override `entrySet()`, you may wish to override `firstEntry()` to
 forward to this implementation.

### `lastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `standardLastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

A sensible definition of `lastEntry()` in terms of `descendingMultiset().entrySet().iterator()`.

 <p>If you override `descendingMultiset` or `entrySet()`, you may wish to override
 `firstEntry()` to forward to this implementation.

### `pollFirstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `standardPollFirstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

A sensible definition of `pollFirstEntry()` in terms of `entrySet().iterator()`.

 <p>If you override `entrySet()`, you may wish to override `pollFirstEntry()` to
 forward to this implementation.

### `pollLastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `standardPollLastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

A sensible definition of `pollLastEntry()` in terms of `descendingMultiset().entrySet().iterator()`.

 <p>If you override `descendingMultiset()` or `entrySet()`, you may wish to
 override `pollLastEntry()` to forward to this implementation.

### `headMultiset(`E` upperBound, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `subMultiset(`E` lowerBound, [`com.google.common.collect.BoundType`](./BoundType.md) lowerBoundType, `E` upperBound, [`com.google.common.collect.BoundType`](./BoundType.md) upperBoundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `standardSubMultiset(`E` lowerBound, [`com.google.common.collect.BoundType`](./BoundType.md) lowerBoundType, `E` upperBound, [`com.google.common.collect.BoundType`](./BoundType.md) upperBoundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

A sensible definition of `subMultiset(Object, BoundType, Object, BoundType)` in terms of
 `headMultiset(Object, BoundType) headMultiset` and `tailMultiset(Object,
 BoundType) tailMultiset`.

 <p>If you override either of these methods, you may wish to override `subMultiset(Object, BoundType, Object, BoundType)` to forward to this implementation.

### `tailMultiset(`E` lowerBound, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

