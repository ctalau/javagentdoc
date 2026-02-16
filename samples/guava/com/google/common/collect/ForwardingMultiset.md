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

 <p><b>Warning:</b> The methods of {@code ForwardingMultiset} forward <b>indiscriminately</b> to
 the methods of the delegate. For example, overriding {@link #add(Object, int)} alone <b>will
 not</b> change the behavior of {@link #add(Object)}, which can lead to unexpected behavior. In
 this case, you should override {@code add(Object)} as well, either providing your own
 implementation, or delegating to the provided {@code standardAdd} method.

 <p><b>{@code default} method warning:</b> This class does <i>not</i> forward calls to {@code
 default} methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the {@code ForwardingMultiset}.

 <p>The {@code standard} methods and any collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.
@author Kevin Bourrillion
@author Louis Wasserman
@since 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

### `count(`java.lang.Object` element)`

**Returns:** `int`

### `add([`E`](E.md) element, `int` occurrences)`

**Returns:** `int`

### `remove(`java.lang.Object` element, `int` occurrences)`

**Returns:** `int`

### `elementSet()`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `entrySet()`

**Returns:** [`java.util.Set<com.google.common.collect.Multiset.Entry<E>>`](../../../../java/util/Set>.md)

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `setCount([`E`](E.md) element, `int` count)`

**Returns:** `int`

### `setCount([`E`](E.md) element, `int` oldCount, `int` newCount)`

**Returns:** `boolean`

### `standardContains(`java.lang.Object` object)`

**Returns:** `boolean`

A sensible definition of {@link #contains} in terms of {@link #count}. If you override {@link #count}, you may wish to override {@link #contains} to forward to this implementation.
@since 7.0

### `standardClear()`

**Returns:** `void`

A sensible definition of {@link #clear} in terms of the {@code iterator} method of {@link #entrySet}. If you override {@link #entrySet}, you may wish to override {@link #clear} to
 forward to this implementation.
@since 7.0

### `standardCount(`java.lang.Object` object)`

**Returns:** `int`

A sensible, albeit inefficient, definition of {@link #count} in terms of {@link #entrySet}. If
 you override {@link #entrySet}, you may wish to override {@link #count} to forward to this
 implementation.
@since 7.0

### `standardAdd([`E`](E.md) element)`

**Returns:** `boolean`

A sensible definition of {@link #add(Object)} in terms of {@link #add(Object, int)}. If you
 override {@link #add(Object, int)}, you may wish to override {@link #add(Object)} to forward to
 this implementation.
@since 7.0

### `standardAddAll([`java.util.Collection<? extends E>`](../../../../java/util/Collection.md) elementsToAdd)`

**Returns:** `boolean`

A sensible definition of {@link #addAll(Collection)} in terms of {@link #add(Object)} and
 {@link #add(Object, int)}. If you override either of these methods, you may wish to override
 {@link #addAll(Collection)} to forward to this implementation.
@since 7.0

### `standardRemove(`java.lang.Object` element)`

**Returns:** `boolean`

A sensible definition of {@link #remove(Object)} in terms of {@link #remove(Object, int)}. If
 you override {@link #remove(Object, int)}, you may wish to override {@link #remove(Object)} to
 forward to this implementation.
@since 7.0

### `standardRemoveAll([`java.util.Collection<?>`](../../../../java/util/Collection.md) elementsToRemove)`

**Returns:** `boolean`

A sensible definition of {@link #removeAll} in terms of the {@code removeAll} method of {@link #elementSet}. If you override {@link #elementSet}, you may wish to override {@link #removeAll}
 to forward to this implementation.
@since 7.0

### `standardRetainAll([`java.util.Collection<?>`](../../../../java/util/Collection.md) elementsToRetain)`

**Returns:** `boolean`

A sensible definition of {@link #retainAll} in terms of the {@code retainAll} method of {@link #elementSet}. If you override {@link #elementSet}, you may wish to override {@link #retainAll}
 to forward to this implementation.
@since 7.0

### `standardSetCount([`E`](E.md) element, `int` count)`

**Returns:** `int`

A sensible definition of {@link #setCount(Object, int)} in terms of {@link #count(Object)},
 {@link #add(Object, int)}, and {@link #remove(Object, int)}. {@link #entrySet()}. If you
 override any of these methods, you may wish to override {@link #setCount(Object, int)} to
 forward to this implementation.
@since 7.0

### `standardSetCount([`E`](E.md) element, `int` oldCount, `int` newCount)`

**Returns:** `boolean`

A sensible definition of {@link #setCount(Object, int, int)} in terms of {@link #count(Object)}
 and {@link #setCount(Object, int)}. If you override either of these methods, you may wish to
 override {@link #setCount(Object, int, int)} to forward to this implementation.
@since 7.0

### `standardIterator()`

**Returns:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

A sensible definition of {@link #iterator} in terms of {@link #entrySet} and {@link #remove(Object)}. If you override either of these methods, you may wish to override {@link #iterator} to forward to this implementation.
@since 7.0

### `standardSize()`

**Returns:** `int`

A sensible, albeit inefficient, definition of {@link #size} in terms of {@link #entrySet}. If
 you override {@link #entrySet}, you may wish to override {@link #size} to forward to this
 implementation.
@since 7.0

### `standardEquals(`java.lang.Object` object)`

**Returns:** `boolean`

A sensible, albeit inefficient, definition of {@link #equals} in terms of {@code
 entrySet().size()} and {@link #count}. If you override either of these methods, you may wish to
 override {@link #equals} to forward to this implementation.
@since 7.0

### `standardHashCode()`

**Returns:** `int`

A sensible definition of {@link #hashCode} as {@code entrySet().hashCode()} . If you override
 {@link #entrySet}, you may wish to override {@link #hashCode} to forward to this
 implementation.
@since 7.0

### `standardToString()`

**Returns:** `java.lang.String`

A sensible definition of {@link #toString} as {@code entrySet().toString()} . If you override
 {@link #entrySet}, you may wish to override {@link #toString} to forward to this
 implementation.
@since 7.0

