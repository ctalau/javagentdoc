# Class: `ForwardingSortedMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingSortedMap`

**Extends:** [`com.google.common.collect.ForwardingMap<K,V>`](./ForwardingMap.md)

**Implements:** `java.util.SortedMap<K,V>`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Subclasses should
 override one or more methods to modify the behavior of the backing sorted map as desired per the
 [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**Warning:** The methods of ForwardingSortedMap forward *indiscriminately* to
 the methods of the delegate. For example, overriding #put alone *will not* change
 the behavior of #putAll, which can lead to unexpected behavior. In this case, you should
 override putAll as well, either providing your own implementation, or delegating to the
 provided standardPutAll method.

 
**default method warning:** This class does *not* forward calls to 
 default methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the ForwardingSortedMap.

 
Each of the standard methods, where appropriate, use the comparator of the map to test
 equality for both keys and values, unlike ForwardingMap.

 
The standard methods and the collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.util.SortedMap<K,V>`

### `comparator()`

**Returns:** `java.util.Comparator<? super K>`

### `firstKey()`

**Returns:** `K`

### `headMap(K toKey)`

**Returns:** `java.util.SortedMap<K,V>`

**Parameters:**
- `toKey` (`K`)

### `lastKey()`

**Returns:** `K`

### `subMap(K fromKey, K toKey)`

**Returns:** `java.util.SortedMap<K,V>`

**Parameters:**
- `fromKey` (`K`)
- `toKey` (`K`)

### `tailMap(K fromKey)`

**Returns:** `java.util.SortedMap<K,V>`

**Parameters:**
- `fromKey` (`K`)

### `unsafeCompare(java.util.Comparator<?> comparator, java.lang.Object o1, java.lang.Object o2)`

**Returns:** `int`

**Parameters:**
- `comparator` (`java.util.Comparator<?>`)
- `o1` (`java.lang.Object`)
- `o2` (`java.lang.Object`)

### `standardContainsKey(java.lang.Object key)`

**Returns:** `boolean`

If you override #tailMap, you may wish to override #containsKey to forward to this implementation.

**Parameters:**
- `key` (`java.lang.Object`)

### `standardSubMap(K fromKey, K toKey)`

**Returns:** `java.util.SortedMap<K,V>`

In some situations, you may wish to override
 #subMap(Object, Object) to forward to this implementation.

**Parameters:**
- `fromKey` (`K`)
- `toKey` (`K`)

