# Class: `ForwardingSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingSet`

**Extends:** [`com.google.common.collect.ForwardingCollection<E>`](./ForwardingCollection.md)

**Implements:** [`java.util.Set<E>`](../../../../java/util/Set.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A set which forwards all its method calls to another set. Subclasses should override one or more
 methods to modify the behavior of the backing set as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of {@code ForwardingSet} forward <b>indiscriminately</b> to the
 methods of the delegate. For example, overriding {@link #add} alone <b>will not</b> change the
 behavior of {@link #addAll}, which can lead to unexpected behavior. In this case, you should
 override {@code addAll} as well, either providing your own implementation, or delegating to the
 provided {@code standardAddAll} method.

 <p><b>{@code default} method warning:</b> This class does <i>not</i> forward calls to {@code
 default} methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the {@code ForwardingSet}.

 <p>The {@code standard} methods are not guaranteed to be thread-safe, even when all of the
 methods that they depend on are thread-safe.
@author Kevin Bourrillion
@author Louis Wasserman
@since 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `standardRemoveAll([`java.util.Collection<?>`](../../../../java/util/Collection.md) collection)`

**Returns:** `boolean`

A sensible definition of {@link #removeAll} in terms of {@link #iterator} and {@link #remove}.
 If you override {@code iterator} or {@code remove}, you may wish to override {@link #removeAll}
 to forward to this implementation.
@since 7.0 (this version overrides the {@code ForwardingCollection} version as of 12.0)

### `standardEquals(`java.lang.Object` object)`

**Returns:** `boolean`

A sensible definition of {@link #equals} in terms of {@link #size} and {@link #containsAll}. If
 you override either of those methods, you may wish to override {@link #equals} to forward to
 this implementation.
@since 7.0

### `standardHashCode()`

**Returns:** `int`

A sensible definition of {@link #hashCode} in terms of {@link #iterator}. If you override
 {@link #iterator}, you may wish to override {@link #equals} to forward to this implementation.
@since 7.0

