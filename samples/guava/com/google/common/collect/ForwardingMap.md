# Class: `ForwardingMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingMap`

**Extends:** [`com.google.common.collect.ForwardingObject`](./ForwardingObject.md)

**Implements:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A map which forwards all its method calls to another map. Subclasses should override one or more
 methods to modify the behavior of the backing map as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of {@code ForwardingMap} forward <i>indiscriminately</i> to the
 methods of the delegate. For example, overriding {@link #put} alone <i>will not</i> change the
 behavior of {@link #putAll}, which can lead to unexpected behavior. In this case, you should
 override {@code putAll} as well, either providing your own implementation, or delegating to the
 provided {@code standardPutAll} method.

 <p><b>{@code default} method warning:</b> This class does <i>not</i> forward calls to {@code
 default} methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the {@code ForwardingMap}.

 <p>Each of the {@code standard} methods, where appropriate, use {@link Objects#equal} to test
 equality for both keys and values. This may not be the desired behavior for map implementations
 that use non-standard notions of key equality, such as a {@code SortedMap} whose comparator is
 not consistent with {@code equals}.

 <p>The {@code standard} methods and the collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.
@author Kevin Bourrillion
@author Jared Levy
@author Louis Wasserman
@since 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

### `size()`

**Returns:** `int`

### `isEmpty()`

**Returns:** `boolean`

### `remove(`java.lang.Object` key)`

**Returns:** [`V`](V.md)

### `clear()`

**Returns:** `void`

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

### `containsValue(`java.lang.Object` value)`

**Returns:** `boolean`

### `get(`java.lang.Object` key)`

**Returns:** [`V`](V.md)

### `put([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** [`V`](V.md)

### `putAll([`java.util.Map<? extends K,? extends V>`](../../../../java/util/Map.md) map)`

**Returns:** `void`

### `keySet()`

**Returns:** [`java.util.Set<K>`](../../../../java/util/Set.md)

### `values()`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `entrySet()`

**Returns:** [`java.util.Set<java.util.Map.Entry<K,V>>`](../../../../java/util/Set>.md)

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `standardPutAll([`java.util.Map<? extends K,? extends V>`](../../../../java/util/Map.md) map)`

**Returns:** `void`

A sensible definition of {@link #putAll(Map)} in terms of {@link #put(Object, Object)}. If you
 override {@link #put(Object, Object)}, you may wish to override {@link #putAll(Map)} to forward
 to this implementation.
@since 7.0

### `standardRemove(`java.lang.Object` key)`

**Returns:** [`V`](V.md)

A sensible, albeit inefficient, definition of {@link #remove} in terms of the {@code iterator}
 method of {@link #entrySet}. If you override {@link #entrySet}, you may wish to override {@link #remove} to forward to this implementation.

 <p>Alternately, you may wish to override {@link #remove} with {@code keySet().remove}, assuming
 that approach would not lead to an infinite loop.
@since 7.0

### `standardClear()`

**Returns:** `void`

A sensible definition of {@link #clear} in terms of the {@code iterator} method of {@link #entrySet}. In many cases, you may wish to override {@link #clear} to forward to this
 implementation.
@since 7.0

### `standardContainsKey(`java.lang.Object` key)`

**Returns:** `boolean`

A sensible, albeit inefficient, definition of {@link #containsKey} in terms of the {@code
 iterator} method of {@link #entrySet}. If you override {@link #entrySet}, you may wish to
 override {@link #containsKey} to forward to this implementation.
@since 7.0

### `standardContainsValue(`java.lang.Object` value)`

**Returns:** `boolean`

A sensible definition of {@link #containsValue} in terms of the {@code iterator} method of
 {@link #entrySet}. If you override {@link #entrySet}, you may wish to override {@link #containsValue} to forward to this implementation.
@since 7.0

### `standardIsEmpty()`

**Returns:** `boolean`

A sensible definition of {@link #isEmpty} in terms of the {@code iterator} method of {@link #entrySet}. If you override {@link #entrySet}, you may wish to override {@link #isEmpty} to
 forward to this implementation.
@since 7.0

### `standardEquals(`java.lang.Object` object)`

**Returns:** `boolean`

A sensible definition of {@link #equals} in terms of the {@code equals} method of {@link #entrySet}. If you override {@link #entrySet}, you may wish to override {@link #equals} to
 forward to this implementation.
@since 7.0

### `standardHashCode()`

**Returns:** `int`

A sensible definition of {@link #hashCode} in terms of the {@code iterator} method of {@link #entrySet}. If you override {@link #entrySet}, you may wish to override {@link #hashCode} to
 forward to this implementation.
@since 7.0

### `standardToString()`

**Returns:** `java.lang.String`

A sensible definition of {@link #toString} in terms of the {@code iterator} method of {@link #entrySet}. If you override {@link #entrySet}, you may wish to override {@link #toString} to
 forward to this implementation.
@since 7.0

