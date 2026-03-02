# Class: `ForwardingSortedSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingSortedSet`

**Extends:** [`com.google.common.collect.ForwardingSet<E>`](./ForwardingSet.md)

**Implements:** `java.util.SortedSet<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Subclasses should
 override one or more methods to modify the behavior of the backing sorted set as desired per the
 [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**Warning:** The methods of ForwardingSortedSet forward *indiscriminately* to
 the methods of the delegate. For example, overriding #add alone *will not* change
 the behavior of #addAll, which can lead to unexpected behavior. In this case, you should
 override addAll as well, either providing your own implementation, or delegating to the
 provided standardAddAll method.

 
**default method warning:** This class does *not* forward calls to 
 default methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the ForwardingSortedSet.

 
Each of the standard methods, where appropriate, uses the set's comparator (or the
 natural ordering of the elements, if there is no comparator) to test element equality. As a
 result, if the comparator is not consistent with equals, some of the standard implementations may
 violate the Set contract.

 
The standard methods and the collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.util.SortedSet<E>`

### `comparator()`

**Returns:** `java.util.Comparator<? super E>`

### `first()`

**Returns:** `E`

### `headSet(E toElement)`

**Parameters:**
- `toElement` (`E`)

**Returns:** `java.util.SortedSet<E>`

### `last()`

**Returns:** `E`

### `subSet(E fromElement, E toElement)`

**Parameters:**
- `fromElement` (`E`)
- `toElement` (`E`)

**Returns:** `java.util.SortedSet<E>`

### `tailSet(E fromElement)`

**Parameters:**
- `fromElement` (`E`)

**Returns:** `java.util.SortedSet<E>`

### `standardContains(Object object)`

If you override #tailSet, you may wish to override #contains to
 forward to this implementation.

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `standardRemove(Object object)`

If you override #tailSet, you may wish to override #remove to
 forward to this implementation.

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `standardSubSet(E fromElement, E toElement)`

In some situations, you may wish to override
 #subSet(Object, Object) to forward to this implementation.

**Parameters:**
- `fromElement` (`E`)
- `toElement` (`E`)

**Returns:** `java.util.SortedSet<E>`

