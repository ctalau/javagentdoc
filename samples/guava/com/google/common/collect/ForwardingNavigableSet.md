# Class: `ForwardingNavigableSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingNavigableSet`

**Extends:** [`com.google.common.collect.ForwardingSortedSet<E>`](./ForwardingSortedSet.md)

**Implements:** `java.util.NavigableSet<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A navigable set which forwards all its method calls to another navigable set. Subclasses should
 override one or more methods to modify the behavior of the backing set as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of `ForwardingNavigableSet` forward <i>indiscriminately</i>
 to the methods of the delegate. For example, overriding `add` alone <i>will not</i> change
 the behavior of `addAll`, which can lead to unexpected behavior. In this case, you should
 override `addAll` as well, either providing your own implementation, or delegating to the
 provided `standardAddAll` method.

 <p><b>`default` method warning:</b> This class does <i>not</i> forward calls to `default` methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the `ForwardingNavigableSet`.

 <p>Each of the `standard` methods uses the set's comparator (or the natural ordering of the
 elements, if there is no comparator) to test element equality. As a result, if the comparator is
 not consistent with equals, some of the standard implementations may violate the `Set`
 contract.

 <p>The `standard` methods and the collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.
**Author:** Louis Wasserman
**Since:** 12.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** `java.util.NavigableSet<E>`

### `lower(`E` e)`

**Returns:** `E`

### `standardLower(`E` e)`

**Returns:** `E`

A sensible definition of `lower` in terms of the `descendingIterator` method of
 `headSet(Object, boolean)`. If you override `headSet(Object, boolean)`, you may
 wish to override `lower` to forward to this implementation.

### `floor(`E` e)`

**Returns:** `E`

### `standardFloor(`E` e)`

**Returns:** `E`

A sensible definition of `floor` in terms of the `descendingIterator` method of
 `headSet(Object, boolean)`. If you override `headSet(Object, boolean)`, you may
 wish to override `floor` to forward to this implementation.

### `ceiling(`E` e)`

**Returns:** `E`

### `standardCeiling(`E` e)`

**Returns:** `E`

A sensible definition of `ceiling` in terms of the `iterator` method of `tailSet(Object, boolean)`. If you override `tailSet(Object, boolean)`, you may wish to
 override `ceiling` to forward to this implementation.

### `higher(`E` e)`

**Returns:** `E`

### `standardHigher(`E` e)`

**Returns:** `E`

A sensible definition of `higher` in terms of the `iterator` method of `tailSet(Object, boolean)`. If you override `tailSet(Object, boolean)`, you may wish to
 override `higher` to forward to this implementation.

### `pollFirst()`

**Returns:** `E`

### `standardPollFirst()`

**Returns:** `E`

A sensible definition of `pollFirst` in terms of the `iterator` method. If you
 override `iterator` you may wish to override `pollFirst` to forward to this
 implementation.

### `pollLast()`

**Returns:** `E`

### `standardPollLast()`

**Returns:** `E`

A sensible definition of `pollLast` in terms of the `descendingIterator` method.
 If you override `descendingIterator` you may wish to override `pollLast` to
 forward to this implementation.

### `standardFirst()`

**Returns:** `E`

### `standardLast()`

**Returns:** `E`

### `descendingSet()`

**Returns:** `java.util.NavigableSet<E>`

### `descendingIterator()`

**Returns:** `java.util.Iterator<E>`

### `subSet(`E` fromElement, `boolean` fromInclusive, `E` toElement, `boolean` toInclusive)`

**Returns:** `java.util.NavigableSet<E>`

### `standardSubSet(`E` fromElement, `boolean` fromInclusive, `E` toElement, `boolean` toInclusive)`

**Returns:** `java.util.NavigableSet<E>`

A sensible definition of `subSet(Object, boolean, Object, boolean)` in terms of the
 `headSet` and `tailSet` methods. In many cases, you may wish to override `subSet(Object, boolean, Object, boolean)` to forward to this implementation.

### `standardSubSet(`E` fromElement, `E` toElement)`

**Returns:** `java.util.SortedSet<E>`

A sensible definition of `subSet(Object, Object)` in terms of the `subSet(Object,
 boolean, Object, boolean)` method. If you override `subSet(Object, boolean, Object,
 boolean)`, you may wish to override `subSet(Object, Object)` to forward to this
 implementation.

### `headSet(`E` toElement, `boolean` inclusive)`

**Returns:** `java.util.NavigableSet<E>`

### `standardHeadSet(`E` toElement)`

**Returns:** `java.util.SortedSet<E>`

A sensible definition of `headSet(Object)` in terms of the `headSet(Object,
 boolean)` method. If you override `headSet(Object, boolean)`, you may wish to override
 `headSet(Object)` to forward to this implementation.

### `tailSet(`E` fromElement, `boolean` inclusive)`

**Returns:** `java.util.NavigableSet<E>`

### `standardTailSet(`E` fromElement)`

**Returns:** `java.util.SortedSet<E>`

A sensible definition of `tailSet(Object)` in terms of the `tailSet(Object,
 boolean)` method. If you override `tailSet(Object, boolean)`, you may wish to override
 `tailSet(Object)` to forward to this implementation.

