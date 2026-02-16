# Class: `ForwardingCollection`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingCollection`

**Extends:** [`com.google.common.collect.ForwardingObject`](./ForwardingObject.md)

**Implements:** `java.util.Collection<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A collection which forwards all its method calls to another collection. Subclasses should
 override one or more methods to modify the behavior of the backing collection as desired per the
 <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of `ForwardingCollection` forward <b>indiscriminately</b> to
 the methods of the delegate. For example, overriding `add` alone <b>will not</b> change
 the behavior of `addAll`, which can lead to unexpected behavior. In this case, you should
 override `addAll` as well, either providing your own implementation, or delegating to the
 provided `standardAddAll` method.

 <p><b>`default` method warning:</b> This class does <i>not</i> forward calls to `default` methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the `ForwardingCollection`.

 <p>The `standard` methods are not guaranteed to be thread-safe, even when all of the
 methods that they depend on are thread-safe.
**Author:** Kevin Bourrillion
**Author:** Louis Wasserman
**Since:** 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** `java.util.Collection<E>`

### `iterator()`

**Returns:** `java.util.Iterator<E>`

### `size()`

**Returns:** `int`

### `removeAll(`java.util.Collection<?>` collection)`

**Returns:** `boolean`

### `isEmpty()`

**Returns:** `boolean`

### `contains(`java.lang.Object` object)`

**Returns:** `boolean`

### `add(`E` element)`

**Returns:** `boolean`

### `remove(`java.lang.Object` object)`

**Returns:** `boolean`

### `containsAll(`java.util.Collection<?>` collection)`

**Returns:** `boolean`

### `addAll(`java.util.Collection<? extends E>` collection)`

**Returns:** `boolean`

### `retainAll(`java.util.Collection<?>` collection)`

**Returns:** `boolean`

### `clear()`

**Returns:** `void`

### `toArray()`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `toArray(`T[]` array)`

**Returns:** `T[]`

### `standardContains(`java.lang.Object` object)`

**Returns:** `boolean`

A sensible definition of `contains` in terms of `iterator`. If you override
 `iterator`, you may wish to override `contains` to forward to this
 implementation.
**Since:** 7.0

### `standardContainsAll(`java.util.Collection<?>` collection)`

**Returns:** `boolean`

A sensible definition of `containsAll` in terms of `contains` . If you override
 `contains`, you may wish to override `containsAll` to forward to this
 implementation.
**Since:** 7.0

### `standardAddAll(`java.util.Collection<? extends E>` collection)`

**Returns:** `boolean`

A sensible definition of `addAll` in terms of `add`. If you override `add`, you may wish to override `addAll` to forward to this implementation.
**Since:** 7.0

### `standardRemove(`java.lang.Object` object)`

**Returns:** `boolean`

A sensible definition of `remove` in terms of `iterator`, using the iterator's
 `remove` method. If you override `iterator`, you may wish to override `remove` to forward to this implementation.
**Since:** 7.0

### `standardRemoveAll(`java.util.Collection<?>` collection)`

**Returns:** `boolean`

A sensible definition of `removeAll` in terms of `iterator`, using the iterator's
 `remove` method. If you override `iterator`, you may wish to override `removeAll` to forward to this implementation.
**Since:** 7.0

### `standardRetainAll(`java.util.Collection<?>` collection)`

**Returns:** `boolean`

A sensible definition of `retainAll` in terms of `iterator`, using the iterator's
 `remove` method. If you override `iterator`, you may wish to override `retainAll` to forward to this implementation.
**Since:** 7.0

### `standardClear()`

**Returns:** `void`

A sensible definition of `clear` in terms of `iterator`, using the iterator's
 `remove` method. If you override `iterator`, you may wish to override `clear` to forward to this implementation.
**Since:** 7.0

### `standardIsEmpty()`

**Returns:** `boolean`

A sensible definition of `isEmpty` as `!iterator().hasNext`. If you override
 `isEmpty`, you may wish to override `isEmpty` to forward to this implementation.
 Alternately, it may be more efficient to implement `isEmpty` as `size() == 0`.
**Since:** 7.0

### `standardToString()`

**Returns:** `java.lang.String`

A sensible definition of `toString` in terms of `iterator`. If you override
 `iterator`, you may wish to override `toString` to forward to this
 implementation.
**Since:** 7.0

### `standardToArray()`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

A sensible definition of `toArray()` in terms of `toArray(Object[])`. If you
 override `toArray(Object[])`, you may wish to override `toArray` to forward to
 this implementation.
**Since:** 7.0

### `standardToArray(`T[]` array)`

**Returns:** `T[]`

A sensible definition of `toArray(Object[])` in terms of `size` and `iterator`. If you override either of these methods, you may wish to override `toArray`
 to forward to this implementation.
**Since:** 7.0

