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

 <p><b>Warning:</b> The methods of {@code ForwardingSortedMultiset} forward
 <b>indiscriminately</b> to the methods of the delegate. For example, overriding {@link #add(Object, int)} alone <b>will not</b> change the behavior of {@link #add(Object)}, which can
 lead to unexpected behavior. In this case, you should override {@code add(Object)} as well,
 either providing your own implementation, or delegating to the provided {@code standardAdd}
 method.

 <p><b>{@code default} method warning:</b> This class does <i>not</i> forward calls to {@code
 default} methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the {@code ForwardingSortedMultiset}.

 <p>The {@code standard} methods and any collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.
@author Louis Wasserman
@since 15.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `elementSet()`

**Returns:** [`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md)

### `comparator()`

**Returns:** [`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md)

### `descendingMultiset()`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `firstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `standardFirstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

A sensible definition of {@link #firstEntry()} in terms of {@code entrySet().iterator()}.

 <p>If you override {@link #entrySet()}, you may wish to override {@link #firstEntry()} to
 forward to this implementation.

### `lastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `standardLastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

A sensible definition of {@link #lastEntry()} in terms of {@code
 descendingMultiset().entrySet().iterator()}.

 <p>If you override {@link #descendingMultiset} or {@link #entrySet()}, you may wish to override
 {@link #firstEntry()} to forward to this implementation.

### `pollFirstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `standardPollFirstEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

A sensible definition of {@link #pollFirstEntry()} in terms of {@code entrySet().iterator()}.

 <p>If you override {@link #entrySet()}, you may wish to override {@link #pollFirstEntry()} to
 forward to this implementation.

### `pollLastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `standardPollLastEntry()`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

A sensible definition of {@link #pollLastEntry()} in terms of {@code
 descendingMultiset().entrySet().iterator()}.

 <p>If you override {@link #descendingMultiset()} or {@link #entrySet()}, you may wish to
 override {@link #pollLastEntry()} to forward to this implementation.

### `headMultiset([`E`](E.md) upperBound, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `subMultiset([`E`](E.md) lowerBound, [`com.google.common.collect.BoundType`](./BoundType.md) lowerBoundType, [`E`](E.md) upperBound, [`com.google.common.collect.BoundType`](./BoundType.md) upperBoundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

### `standardSubMultiset([`E`](E.md) lowerBound, [`com.google.common.collect.BoundType`](./BoundType.md) lowerBoundType, [`E`](E.md) upperBound, [`com.google.common.collect.BoundType`](./BoundType.md) upperBoundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

A sensible definition of {@link #subMultiset(Object, BoundType, Object, BoundType)} in terms of
 {@link #headMultiset(Object, BoundType) headMultiset} and {@link #tailMultiset(Object,
 BoundType) tailMultiset}.

 <p>If you override either of these methods, you may wish to override {@link #subMultiset(Object, BoundType, Object, BoundType)} to forward to this implementation.

### `tailMultiset([`E`](E.md) lowerBound, [`com.google.common.collect.BoundType`](./BoundType.md) boundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

