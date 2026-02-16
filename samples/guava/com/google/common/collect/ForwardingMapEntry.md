# Class: `ForwardingMapEntry`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingMapEntry`

**Extends:** [`com.google.common.collect.ForwardingObject`](./ForwardingObject.md)

**Implements:** `java.util.Map.Entry<K,V>`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A map entry which forwards all its method calls to another map entry. Subclasses should override
 one or more methods to modify the behavior of the backing map entry as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of `ForwardingMapEntry` forward <i>indiscriminately</i> to
 the methods of the delegate. For example, overriding `getValue` alone <i>will not</i>
 change the behavior of `equals`, which can lead to unexpected behavior. In this case, you
 should override `equals` as well, either providing your own implementation, or delegating
 to the provided `standardEquals` method.

 <p>Each of the `standard` methods, where appropriate, use `Objects.equal` to test
 equality for both keys and values. This may not be the desired behavior for map implementations
 that use non-standard notions of key equality, such as the entry of a `SortedMap` whose
 comparator is not consistent with `equals`.

 <p>The `standard` methods are not guaranteed to be thread-safe, even when all of the
 methods that they depend on are thread-safe.
**Author:** Mike Bostock
**Author:** Louis Wasserman
**Since:** 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** `java.util.Map.Entry<K,V>`

### `getKey()`

**Returns:** `K`

### `getValue()`

**Returns:** `V`

### `setValue(`V` value)`

**Returns:** `V`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `standardEquals(`java.lang.Object` object)`

**Returns:** `boolean`

A sensible definition of `equals(Object)` in terms of `getKey()` and `getValue()`. If you override either of these methods, you may wish to override `equals(Object)` to forward to this implementation.
**Since:** 7.0

### `standardHashCode()`

**Returns:** `int`

A sensible definition of `hashCode()` in terms of `getKey()` and `getValue()`. If you override either of these methods, you may wish to override `hashCode()` to forward to this implementation.
**Since:** 7.0

### `standardToString()`

**Returns:** `java.lang.String`

A sensible definition of `toString` in terms of `getKey` and `getValue`.
 If you override either of these methods, you may wish to override `equals` to forward to
 this implementation.
**Since:** 7.0

