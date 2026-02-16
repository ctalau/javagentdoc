# Class: `ForwardingCollection`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingCollection`

**Extends:** [`com.google.common.collect.ForwardingObject`](./ForwardingObject.md)

**Implements:** [`java.util.Collection<E>`](../../../../java/util/Collection.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A collection which forwards all its method calls to another collection. Subclasses should
 override one or more methods to modify the behavior of the backing collection as desired per the
 <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>Warning:</b> The methods of {@code ForwardingCollection} forward <b>indiscriminately</b> to
 the methods of the delegate. For example, overriding {@link #add} alone <b>will not</b> change
 the behavior of {@link #addAll}, which can lead to unexpected behavior. In this case, you should
 override {@code addAll} as well, either providing your own implementation, or delegating to the
 provided {@code standardAddAll} method.

 <p><b>{@code default} method warning:</b> This class does <i>not</i> forward calls to {@code
 default} methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the {@code ForwardingCollection}.

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

**Returns:** [`java.util.Collection<E>`](../../../../java/util/Collection.md)

### `iterator()`

**Returns:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

### `size()`

**Returns:** `int`

### `removeAll([`java.util.Collection<?>`](../../../../java/util/Collection.md) collection)`

**Returns:** `boolean`

### `isEmpty()`

**Returns:** `boolean`

### `contains(`java.lang.Object` object)`

**Returns:** `boolean`

### `add([`E`](E.md) element)`

**Returns:** `boolean`

### `remove(`java.lang.Object` object)`

**Returns:** `boolean`

### `containsAll([`java.util.Collection<?>`](../../../../java/util/Collection.md) collection)`

**Returns:** `boolean`

### `addAll([`java.util.Collection<? extends E>`](../../../../java/util/Collection.md) collection)`

**Returns:** `boolean`

### `retainAll([`java.util.Collection<?>`](../../../../java/util/Collection.md) collection)`

**Returns:** `boolean`

### `clear()`

**Returns:** `void`

### `toArray()`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

### `toArray([`T[]`](T.md) array)`

**Returns:** [`T[]`](T.md)

### `standardContains(`java.lang.Object` object)`

**Returns:** `boolean`

A sensible definition of {@link #contains} in terms of {@link #iterator}. If you override
 {@link #iterator}, you may wish to override {@link #contains} to forward to this
 implementation.
@since 7.0

### `standardContainsAll([`java.util.Collection<?>`](../../../../java/util/Collection.md) collection)`

**Returns:** `boolean`

A sensible definition of {@link #containsAll} in terms of {@link #contains} . If you override
 {@link #contains}, you may wish to override {@link #containsAll} to forward to this
 implementation.
@since 7.0

### `standardAddAll([`java.util.Collection<? extends E>`](../../../../java/util/Collection.md) collection)`

**Returns:** `boolean`

A sensible definition of {@link #addAll} in terms of {@link #add}. If you override {@link #add}, you may wish to override {@link #addAll} to forward to this implementation.
@since 7.0

### `standardRemove(`java.lang.Object` object)`

**Returns:** `boolean`

A sensible definition of {@link #remove} in terms of {@link #iterator}, using the iterator's
 {@code remove} method. If you override {@link #iterator}, you may wish to override {@link #remove} to forward to this implementation.
@since 7.0

### `standardRemoveAll([`java.util.Collection<?>`](../../../../java/util/Collection.md) collection)`

**Returns:** `boolean`

A sensible definition of {@link #removeAll} in terms of {@link #iterator}, using the iterator's
 {@code remove} method. If you override {@link #iterator}, you may wish to override {@link #removeAll} to forward to this implementation.
@since 7.0

### `standardRetainAll([`java.util.Collection<?>`](../../../../java/util/Collection.md) collection)`

**Returns:** `boolean`

A sensible definition of {@link #retainAll} in terms of {@link #iterator}, using the iterator's
 {@code remove} method. If you override {@link #iterator}, you may wish to override {@link #retainAll} to forward to this implementation.
@since 7.0

### `standardClear()`

**Returns:** `void`

A sensible definition of {@link #clear} in terms of {@link #iterator}, using the iterator's
 {@code remove} method. If you override {@link #iterator}, you may wish to override {@link #clear} to forward to this implementation.
@since 7.0

### `standardIsEmpty()`

**Returns:** `boolean`

A sensible definition of {@link #isEmpty} as {@code !iterator().hasNext}. If you override
 {@link #isEmpty}, you may wish to override {@link #isEmpty} to forward to this implementation.
 Alternately, it may be more efficient to implement {@code isEmpty} as {@code size() == 0}.
@since 7.0

### `standardToString()`

**Returns:** `java.lang.String`

A sensible definition of {@link #toString} in terms of {@link #iterator}. If you override
 {@link #iterator}, you may wish to override {@link #toString} to forward to this
 implementation.
@since 7.0

### `standardToArray()`

**Returns:** `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`

A sensible definition of {@link #toArray()} in terms of {@link #toArray(Object[])}. If you
 override {@link #toArray(Object[])}, you may wish to override {@link #toArray} to forward to
 this implementation.
@since 7.0

### `standardToArray([`T[]`](T.md) array)`

**Returns:** [`T[]`](T.md)

A sensible definition of {@link #toArray(Object[])} in terms of {@link #size} and {@link #iterator}. If you override either of these methods, you may wish to override {@link #toArray}
 to forward to this implementation.
@since 7.0

