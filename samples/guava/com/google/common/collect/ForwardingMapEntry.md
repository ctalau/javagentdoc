# Class: `ForwardingMapEntry`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingMapEntry`

**Extends:** [`com.google.common.collect.ForwardingObject`](./ForwardingObject.md)

**Implements:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A map entry which forwards all its method calls to another map entry. Subclasses should override
 one or more methods to modify the behavior of the backing map entry as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of {@code ForwardingMapEntry} forward <i>indiscriminately</i> to
 the methods of the delegate. For example, overriding {@link #getValue} alone <i>will not</i>
 change the behavior of {@link #equals}, which can lead to unexpected behavior. In this case, you
 should override {@code equals} as well, either providing your own implementation, or delegating
 to the provided {@code standardEquals} method.

 <p>Each of the {@code standard} methods, where appropriate, use {@link Objects#equal} to test
 equality for both keys and values. This may not be the desired behavior for map implementations
 that use non-standard notions of key equality, such as the entry of a {@code SortedMap} whose
 comparator is not consistent with {@code equals}.

 <p>The {@code standard} methods are not guaranteed to be thread-safe, even when all of the
 methods that they depend on are thread-safe.
@author Mike Bostock
@author Louis Wasserman
@since 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `getKey()`

**Returns:** [`K`](K.md)

### `getValue()`

**Returns:** [`V`](V.md)

### `setValue([`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `standardEquals(`java.lang.Object` object)`

**Returns:** `boolean`

A sensible definition of {@link #equals(Object)} in terms of {@link #getKey()} and {@link #getValue()}. If you override either of these methods, you may wish to override {@link #equals(Object)} to forward to this implementation.
@since 7.0

### `standardHashCode()`

**Returns:** `int`

A sensible definition of {@link #hashCode()} in terms of {@link #getKey()} and {@link #getValue()}. If you override either of these methods, you may wish to override {@link #hashCode()} to forward to this implementation.
@since 7.0

### `standardToString()`

**Returns:** `java.lang.String`

A sensible definition of {@link #toString} in terms of {@link #getKey} and {@link #getValue}.
 If you override either of these methods, you may wish to override {@link #equals} to forward to
 this implementation.
@since 7.0

