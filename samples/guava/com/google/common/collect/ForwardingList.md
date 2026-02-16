# Class: `ForwardingList`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingList`

**Extends:** [`com.google.common.collect.ForwardingCollection<E>`](./ForwardingCollection.md)

**Implements:** `java.util.List<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A list which forwards all its method calls to another list. Subclasses should override one or
 more methods to modify the behavior of the backing list as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p>This class does not implement `java.util.RandomAccess`. If the delegate supports random
 access, the `ForwardingList` subclass should implement the `RandomAccess` interface.

 <p><b>Warning:</b> The methods of `ForwardingList` forward <b>indiscriminately</b> to the
 methods of the delegate. For example, overriding `add` alone <b>will not</b> change the
 behavior of `addAll`, which can lead to unexpected behavior. In this case, you should
 override `addAll` as well, either providing your own implementation, or delegating to the
 provided `standardAddAll` method.

 <p><b>`default` method warning:</b> This class does <i>not</i> forward calls to `default` methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the `ForwardingList`.

 <p>The `standard` methods and any collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.
**Author:** Mike Bostock
**Author:** Louis Wasserman
**Since:** 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** `java.util.List<E>`

### `add(`int` index, `E` element)`

**Returns:** `void`

### `addAll(`int` index, `java.util.Collection<? extends E>` elements)`

**Returns:** `boolean`

### `get(`int` index)`

**Returns:** `E`

### `indexOf(`java.lang.Object` element)`

**Returns:** `int`

### `lastIndexOf(`java.lang.Object` element)`

**Returns:** `int`

### `listIterator()`

**Returns:** `java.util.ListIterator<E>`

### `listIterator(`int` index)`

**Returns:** `java.util.ListIterator<E>`

### `remove(`int` index)`

**Returns:** `E`

### `set(`int` index, `E` element)`

**Returns:** `E`

### `subList(`int` fromIndex, `int` toIndex)`

**Returns:** `java.util.List<E>`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `standardAdd(`E` element)`

**Returns:** `boolean`

A sensible default implementation of `add(Object)`, in terms of `add(int,
 Object)`. If you override `add(int, Object)`, you may wish to override `add(Object)` to forward to this implementation.
**Since:** 7.0

### `standardAddAll(`int` index, `java.lang.Iterable<? extends E>` elements)`

**Returns:** `boolean`

A sensible default implementation of `addAll(int, Collection)`, in terms of the `add` method of `listIterator(int)`. If you override `listIterator(int)`, you may
 wish to override `addAll(int, Collection)` to forward to this implementation.
**Since:** 7.0

### `standardIndexOf(`java.lang.Object` element)`

**Returns:** `int`

A sensible default implementation of `indexOf`, in terms of `listIterator()`. If
 you override `listIterator()`, you may wish to override `indexOf` to forward to
 this implementation.
**Since:** 7.0

### `standardLastIndexOf(`java.lang.Object` element)`

**Returns:** `int`

A sensible default implementation of `lastIndexOf`, in terms of `listIterator(int)`. If you override `listIterator(int)`, you may wish to override
 `lastIndexOf` to forward to this implementation.
**Since:** 7.0

### `standardIterator()`

**Returns:** `java.util.Iterator<E>`

A sensible default implementation of `iterator`, in terms of `listIterator()`. If
 you override `listIterator()`, you may wish to override `iterator` to forward to
 this implementation.
**Since:** 7.0

### `standardListIterator()`

**Returns:** `java.util.ListIterator<E>`

A sensible default implementation of `listIterator()`, in terms of `listIterator(int)`. If you override `listIterator(int)`, you may wish to override
 `listIterator()` to forward to this implementation.
**Since:** 7.0

### `standardListIterator(`int` start)`

**Returns:** `java.util.ListIterator<E>`

A sensible default implementation of `listIterator(int)`, in terms of `size`,
 `get(int)`, `set(int, Object)`, `add(int, Object)`, and `remove(int)`. If you override any of these methods, you may wish to override `listIterator(int)` to forward to this implementation.
**Since:** 7.0

### `standardSubList(`int` fromIndex, `int` toIndex)`

**Returns:** `java.util.List<E>`

A sensible default implementation of `subList(int, int)`. If you override any other
 methods, you may wish to override `subList(int, int)` to forward to this implementation.
**Since:** 7.0

### `standardEquals(`java.lang.Object` object)`

**Returns:** `boolean`

A sensible definition of `equals(Object)` in terms of `size` and `iterator`. If you override either of those methods, you may wish to override `equals(Object)` to forward to this implementation.
**Since:** 7.0

### `standardHashCode()`

**Returns:** `int`

A sensible definition of `hashCode` in terms of `iterator`. If you override
 `iterator`, you may wish to override `hashCode` to forward to this
 implementation.
**Since:** 7.0

