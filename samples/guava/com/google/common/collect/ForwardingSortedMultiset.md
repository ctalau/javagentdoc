# Class: `ForwardingSortedMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingSortedMultiset`

**Extends:** [`com.google.common.collect.ForwardingMultiset<E>`](./ForwardingMultiset.md)

**Implements:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Subclasses
 should override one or more methods to modify the behavior of the backing multiset as desired per
 the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**Warning:** The methods of ForwardingSortedMultiset forward
 **indiscriminately** to the methods of the delegate. For example, overriding #add(Object, int) alone **will not** change the behavior of #add(Object), which can
 lead to unexpected behavior. In this case, you should override add(Object) as well,
 either providing your own implementation, or delegating to the provided standardAdd
 method.

 
**default method warning:** This class does *not* forward calls to 
 default methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the ForwardingSortedMultiset.

 
The standard methods and any collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.

## Constructors

### `<init>()`

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

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `standardFirstEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

If you override #entrySet(), you may wish to override #firstEntry() to
 forward to this implementation.

### `lastEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `standardLastEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

If you override #descendingMultiset or #entrySet(), you may wish to override
 #firstEntry() to forward to this implementation.

### `pollFirstEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `standardPollFirstEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

If you override #entrySet(), you may wish to override #pollFirstEntry() to
 forward to this implementation.

### `pollLastEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

### `standardPollLastEntry()`

**Returns:** `com.google.common.collect.Multiset.Entry<E>`

If you override #descendingMultiset() or #entrySet(), you may wish to
 override #pollLastEntry() to forward to this implementation.

### `headMultiset(E upperBound, com.google.common.collect.BoundType boundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

**Parameters:**
- `upperBound` (`E`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

### `subMultiset(E lowerBound, com.google.common.collect.BoundType lowerBoundType, E upperBound, com.google.common.collect.BoundType upperBoundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

**Parameters:**
- `lowerBound` (`E`)
- `lowerBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))
- `upperBound` (`E`)
- `upperBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

### `standardSubMultiset(E lowerBound, com.google.common.collect.BoundType lowerBoundType, E upperBound, com.google.common.collect.BoundType upperBoundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

If you override either of these methods, you may wish to override #subMultiset(Object, BoundType, Object, BoundType) to forward to this implementation.

**Parameters:**
- `lowerBound` (`E`)
- `lowerBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))
- `upperBound` (`E`)
- `upperBoundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

### `tailMultiset(E lowerBound, com.google.common.collect.BoundType boundType)`

**Returns:** [`com.google.common.collect.SortedMultiset<E>`](./SortedMultiset.md)

**Parameters:**
- `lowerBound` (`E`)
- `boundType` ([`com.google.common.collect.BoundType`](./BoundType.md))

