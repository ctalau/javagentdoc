# Class: `ForwardingMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingMultiset`

**Extends:** [`com.google.common.collect.ForwardingCollection<E>`](./ForwardingCollection.md)

**Implements:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A multiset which forwards all its method calls to another multiset. Subclasses should override
 one or more methods to modify the behavior of the backing multiset as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of `ForwardingMultiset` forward <b>indiscriminately</b> to
 the methods of the delegate. For example, overriding `add(Object, int)` alone <b>will
 not</b> change the behavior of `add(Object)`, which can lead to unexpected behavior. In
 this case, you should override `add(Object)` as well, either providing your own
 implementation, or delegating to the provided `standardAdd` method.

 <p><b>`default` method warning:</b> This class does <i>not</i> forward calls to `default` methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the `ForwardingMultiset`.

 <p>The `standard` methods and any collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.
**Author:** Kevin Bourrillion
**Author:** Louis Wasserman
**Since:** 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

### `count(`java.lang.Object` element)`

**Returns:** `int`

### `add(`E` element, `int` occurrences)`

**Returns:** `int`

### `remove(`java.lang.Object` element, `int` occurrences)`

**Returns:** `int`

### `elementSet()`

**Returns:** `java.util.Set<E>`

### `entrySet()`

**Returns:** `java.util.Set<com.google.common.collect.Multiset.Entry<E>>`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `setCount(`E` element, `int` count)`

**Returns:** `int`

### `setCount(`E` element, `int` oldCount, `int` newCount)`

**Returns:** `boolean`

### `standardContains(`java.lang.Object` object)`

**Returns:** `boolean`

A sensible definition of `contains` in terms of `count`. If you override `count`, you may wish to override `contains` to forward to this implementation.
**Since:** 7.0

### `standardClear()`

**Returns:** `void`

A sensible definition of `clear` in terms of the `iterator` method of `entrySet`. If you override `entrySet`, you may wish to override `clear` to
 forward to this implementation.
**Since:** 7.0

### `standardCount(`java.lang.Object` object)`

**Returns:** `int`

A sensible, albeit inefficient, definition of `count` in terms of `entrySet`. If
 you override `entrySet`, you may wish to override `count` to forward to this
 implementation.
**Since:** 7.0

### `standardAdd(`E` element)`

**Returns:** `boolean`

A sensible definition of `add(Object)` in terms of `add(Object, int)`. If you
 override `add(Object, int)`, you may wish to override `add(Object)` to forward to
 this implementation.
**Since:** 7.0

### `standardAddAll(`java.util.Collection<? extends E>` elementsToAdd)`

**Returns:** `boolean`

A sensible definition of `addAll(Collection)` in terms of `add(Object)` and
 `add(Object, int)`. If you override either of these methods, you may wish to override
 `addAll(Collection)` to forward to this implementation.
**Since:** 7.0

### `standardRemove(`java.lang.Object` element)`

**Returns:** `boolean`

A sensible definition of `remove(Object)` in terms of `remove(Object, int)`. If
 you override `remove(Object, int)`, you may wish to override `remove(Object)` to
 forward to this implementation.
**Since:** 7.0

### `standardRemoveAll(`java.util.Collection<?>` elementsToRemove)`

**Returns:** `boolean`

A sensible definition of `removeAll` in terms of the `removeAll` method of `elementSet`. If you override `elementSet`, you may wish to override `removeAll`
 to forward to this implementation.
**Since:** 7.0

### `standardRetainAll(`java.util.Collection<?>` elementsToRetain)`

**Returns:** `boolean`

A sensible definition of `retainAll` in terms of the `retainAll` method of `elementSet`. If you override `elementSet`, you may wish to override `retainAll`
 to forward to this implementation.
**Since:** 7.0

### `standardSetCount(`E` element, `int` count)`

**Returns:** `int`

A sensible definition of `setCount(Object, int)` in terms of `count(Object)`,
 `add(Object, int)`, and `remove(Object, int)`. `entrySet()`. If you
 override any of these methods, you may wish to override `setCount(Object, int)` to
 forward to this implementation.
**Since:** 7.0

### `standardSetCount(`E` element, `int` oldCount, `int` newCount)`

**Returns:** `boolean`

A sensible definition of `setCount(Object, int, int)` in terms of `count(Object)`
 and `setCount(Object, int)`. If you override either of these methods, you may wish to
 override `setCount(Object, int, int)` to forward to this implementation.
**Since:** 7.0

### `standardIterator()`

**Returns:** `java.util.Iterator<E>`

A sensible definition of `iterator` in terms of `entrySet` and `remove(Object)`. If you override either of these methods, you may wish to override `iterator` to forward to this implementation.
**Since:** 7.0

### `standardSize()`

**Returns:** `int`

A sensible, albeit inefficient, definition of `size` in terms of `entrySet`. If
 you override `entrySet`, you may wish to override `size` to forward to this
 implementation.
**Since:** 7.0

### `standardEquals(`java.lang.Object` object)`

**Returns:** `boolean`

A sensible, albeit inefficient, definition of `equals` in terms of `entrySet().size()` and `count`. If you override either of these methods, you may wish to
 override `equals` to forward to this implementation.
**Since:** 7.0

### `standardHashCode()`

**Returns:** `int`

A sensible definition of `hashCode` as `entrySet().hashCode()` . If you override
 `entrySet`, you may wish to override `hashCode` to forward to this
 implementation.
**Since:** 7.0

### `standardToString()`

**Returns:** `java.lang.String`

A sensible definition of `toString` as `entrySet().toString()` . If you override
 `entrySet`, you may wish to override `toString` to forward to this
 implementation.
**Since:** 7.0

