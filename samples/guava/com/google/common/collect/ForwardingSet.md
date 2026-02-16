# Class: `ForwardingSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingSet`

**Extends:** [`com.google.common.collect.ForwardingCollection<E>`](./ForwardingCollection.md)

**Implements:** `java.util.Set<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A set which forwards all its method calls to another set. Subclasses should override one or more
 methods to modify the behavior of the backing set as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of `ForwardingSet` forward <b>indiscriminately</b> to the
 methods of the delegate. For example, overriding `add` alone <b>will not</b> change the
 behavior of `addAll`, which can lead to unexpected behavior. In this case, you should
 override `addAll` as well, either providing your own implementation, or delegating to the
 provided `standardAddAll` method.

 <p><b>`default` method warning:</b> This class does <i>not</i> forward calls to `default` methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the `ForwardingSet`.

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

**Returns:** `java.util.Set<E>`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `standardRemoveAll(`java.util.Collection<?>` collection)`

**Returns:** `boolean`

A sensible definition of `removeAll` in terms of `iterator` and `remove`.
 If you override `iterator` or `remove`, you may wish to override `removeAll`
 to forward to this implementation.
**Since:** 7.0 (this version overrides the `ForwardingCollection` version as of 12.0)

### `standardEquals(`java.lang.Object` object)`

**Returns:** `boolean`

A sensible definition of `equals` in terms of `size` and `containsAll`. If
 you override either of those methods, you may wish to override `equals` to forward to
 this implementation.
**Since:** 7.0

### `standardHashCode()`

**Returns:** `int`

A sensible definition of `hashCode` in terms of `iterator`. If you override
 `iterator`, you may wish to override `equals` to forward to this implementation.
**Since:** 7.0

