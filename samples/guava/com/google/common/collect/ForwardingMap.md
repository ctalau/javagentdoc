# Class: `ForwardingMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingMap`

**Extends:** [`com.google.common.collect.ForwardingObject`](./ForwardingObject.md)

**Implements:** `java.util.Map<K,V>`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A map which forwards all its method calls to another map. Subclasses should override one or more
 methods to modify the behavior of the backing map as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of `ForwardingMap` forward <i>indiscriminately</i> to the
 methods of the delegate. For example, overriding `put` alone <i>will not</i> change the
 behavior of `putAll`, which can lead to unexpected behavior. In this case, you should
 override `putAll` as well, either providing your own implementation, or delegating to the
 provided `standardPutAll` method.

 <p><b>`default` method warning:</b> This class does <i>not</i> forward calls to `default` methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the `ForwardingMap`.

 <p>Each of the `standard` methods, where appropriate, use `Objects.equal` to test
 equality for both keys and values. This may not be the desired behavior for map implementations
 that use non-standard notions of key equality, such as a `SortedMap` whose comparator is
 not consistent with `equals`.

 <p>The `standard` methods and the collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.
**Author:** Kevin Bourrillion
**Author:** Jared Levy
**Author:** Louis Wasserman
**Since:** 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** `java.util.Map<K,V>`

### `size()`

**Returns:** `int`

### `isEmpty()`

**Returns:** `boolean`

### `remove(`java.lang.Object` key)`

**Returns:** `V`

### `clear()`

**Returns:** `void`

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

### `containsValue(`java.lang.Object` value)`

**Returns:** `boolean`

### `get(`java.lang.Object` key)`

**Returns:** `V`

### `put(`K` key, `V` value)`

**Returns:** `V`

### `putAll(`java.util.Map<? extends K,? extends V>` map)`

**Returns:** `void`

### `keySet()`

**Returns:** `java.util.Set<K>`

### `values()`

**Returns:** `java.util.Collection<V>`

### `entrySet()`

**Returns:** `java.util.Set<java.util.Map.Entry<K,V>>`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `standardPutAll(`java.util.Map<? extends K,? extends V>` map)`

**Returns:** `void`

A sensible definition of `putAll(Map)` in terms of `put(Object, Object)`. If you
 override `put(Object, Object)`, you may wish to override `putAll(Map)` to forward
 to this implementation.
**Since:** 7.0

### `standardRemove(`java.lang.Object` key)`

**Returns:** `V`

A sensible, albeit inefficient, definition of `remove` in terms of the `iterator`
 method of `entrySet`. If you override `entrySet`, you may wish to override `remove` to forward to this implementation.

 <p>Alternately, you may wish to override `remove` with `keySet().remove`, assuming
 that approach would not lead to an infinite loop.
**Since:** 7.0

### `standardClear()`

**Returns:** `void`

A sensible definition of `clear` in terms of the `iterator` method of `entrySet`. In many cases, you may wish to override `clear` to forward to this
 implementation.
**Since:** 7.0

### `standardContainsKey(`java.lang.Object` key)`

**Returns:** `boolean`

A sensible, albeit inefficient, definition of `containsKey` in terms of the `iterator` method of `entrySet`. If you override `entrySet`, you may wish to
 override `containsKey` to forward to this implementation.
**Since:** 7.0

### `standardContainsValue(`java.lang.Object` value)`

**Returns:** `boolean`

A sensible definition of `containsValue` in terms of the `iterator` method of
 `entrySet`. If you override `entrySet`, you may wish to override `containsValue` to forward to this implementation.
**Since:** 7.0

### `standardIsEmpty()`

**Returns:** `boolean`

A sensible definition of `isEmpty` in terms of the `iterator` method of `entrySet`. If you override `entrySet`, you may wish to override `isEmpty` to
 forward to this implementation.
**Since:** 7.0

### `standardEquals(`java.lang.Object` object)`

**Returns:** `boolean`

A sensible definition of `equals` in terms of the `equals` method of `entrySet`. If you override `entrySet`, you may wish to override `equals` to
 forward to this implementation.
**Since:** 7.0

### `standardHashCode()`

**Returns:** `int`

A sensible definition of `hashCode` in terms of the `iterator` method of `entrySet`. If you override `entrySet`, you may wish to override `hashCode` to
 forward to this implementation.
**Since:** 7.0

### `standardToString()`

**Returns:** `java.lang.String`

A sensible definition of `toString` in terms of the `iterator` method of `entrySet`. If you override `entrySet`, you may wish to override `toString` to
 forward to this implementation.
**Since:** 7.0

