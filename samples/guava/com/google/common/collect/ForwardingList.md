# Class: `ForwardingList`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingList`

**Extends:** [`com.google.common.collect.ForwardingCollection<E>`](./ForwardingCollection.md)

**Implements:** [`java.util.List<E>`](../../../../java/util/List.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A list which forwards all its method calls to another list. Subclasses should override one or
 more methods to modify the behavior of the backing list as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p>This class does not implement {@link java.util.RandomAccess}. If the delegate supports random
 access, the {@code ForwardingList} subclass should implement the {@code RandomAccess} interface.

 <p><b>Warning:</b> The methods of {@code ForwardingList} forward <b>indiscriminately</b> to the
 methods of the delegate. For example, overriding {@link #add} alone <b>will not</b> change the
 behavior of {@link #addAll}, which can lead to unexpected behavior. In this case, you should
 override {@code addAll} as well, either providing your own implementation, or delegating to the
 provided {@code standardAddAll} method.

 <p><b>{@code default} method warning:</b> This class does <i>not</i> forward calls to {@code
 default} methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the {@code ForwardingList}.

 <p>The {@code standard} methods and any collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.
@author Mike Bostock
@author Louis Wasserman
@since 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`java.util.List<E>`](../../../../java/util/List.md)

### `add(`int` index, [`E`](E.md) element)`

**Returns:** `void`

### `addAll(`int` index, [`java.util.Collection<? extends E>`](../../../../java/util/Collection.md) elements)`

**Returns:** `boolean`

### `get(`int` index)`

**Returns:** [`E`](E.md)

### `indexOf(`java.lang.Object` element)`

**Returns:** `int`

### `lastIndexOf(`java.lang.Object` element)`

**Returns:** `int`

### `listIterator()`

**Returns:** [`java.util.ListIterator<E>`](../../../../java/util/ListIterator.md)

### `listIterator(`int` index)`

**Returns:** [`java.util.ListIterator<E>`](../../../../java/util/ListIterator.md)

### `remove(`int` index)`

**Returns:** [`E`](E.md)

### `set(`int` index, [`E`](E.md) element)`

**Returns:** [`E`](E.md)

### `subList(`int` fromIndex, `int` toIndex)`

**Returns:** [`java.util.List<E>`](../../../../java/util/List.md)

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `standardAdd([`E`](E.md) element)`

**Returns:** `boolean`

A sensible default implementation of {@link #add(Object)}, in terms of {@link #add(int,
 Object)}. If you override {@link #add(int, Object)}, you may wish to override {@link #add(Object)} to forward to this implementation.
@since 7.0

### `standardAddAll(`int` index, `java.lang.Iterable<? extends E>` elements)`

**Returns:** `boolean`

A sensible default implementation of {@link #addAll(int, Collection)}, in terms of the {@code
 add} method of {@link #listIterator(int)}. If you override {@link #listIterator(int)}, you may
 wish to override {@link #addAll(int, Collection)} to forward to this implementation.
@since 7.0

### `standardIndexOf(`java.lang.Object` element)`

**Returns:** `int`

A sensible default implementation of {@link #indexOf}, in terms of {@link #listIterator()}. If
 you override {@link #listIterator()}, you may wish to override {@link #indexOf} to forward to
 this implementation.
@since 7.0

### `standardLastIndexOf(`java.lang.Object` element)`

**Returns:** `int`

A sensible default implementation of {@link #lastIndexOf}, in terms of {@link #listIterator(int)}. If you override {@link #listIterator(int)}, you may wish to override
 {@link #lastIndexOf} to forward to this implementation.
@since 7.0

### `standardIterator()`

**Returns:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

A sensible default implementation of {@link #iterator}, in terms of {@link #listIterator()}. If
 you override {@link #listIterator()}, you may wish to override {@link #iterator} to forward to
 this implementation.
@since 7.0

### `standardListIterator()`

**Returns:** [`java.util.ListIterator<E>`](../../../../java/util/ListIterator.md)

A sensible default implementation of {@link #listIterator()}, in terms of {@link #listIterator(int)}. If you override {@link #listIterator(int)}, you may wish to override
 {@link #listIterator()} to forward to this implementation.
@since 7.0

### `standardListIterator(`int` start)`

**Returns:** [`java.util.ListIterator<E>`](../../../../java/util/ListIterator.md)

A sensible default implementation of {@link #listIterator(int)}, in terms of {@link #size},
 {@link #get(int)}, {@link #set(int, Object)}, {@link #add(int, Object)}, and {@link #remove(int)}. If you override any of these methods, you may wish to override {@link #listIterator(int)} to forward to this implementation.
@since 7.0

### `standardSubList(`int` fromIndex, `int` toIndex)`

**Returns:** [`java.util.List<E>`](../../../../java/util/List.md)

A sensible default implementation of {@link #subList(int, int)}. If you override any other
 methods, you may wish to override {@link #subList(int, int)} to forward to this implementation.
@since 7.0

### `standardEquals(`java.lang.Object` object)`

**Returns:** `boolean`

A sensible definition of {@link #equals(Object)} in terms of {@link #size} and {@link #iterator}. If you override either of those methods, you may wish to override {@link #equals(Object)} to forward to this implementation.
@since 7.0

### `standardHashCode()`

**Returns:** `int`

A sensible definition of {@link #hashCode} in terms of {@link #iterator}. If you override
 {@link #iterator}, you may wish to override {@link #hashCode} to forward to this
 implementation.
@since 7.0

