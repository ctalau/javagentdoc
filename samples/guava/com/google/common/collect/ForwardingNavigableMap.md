# Class: `ForwardingNavigableMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingNavigableMap`

**Extends:** [`com.google.common.collect.ForwardingSortedMap<K,V>`](./ForwardingSortedMap.md)

**Implements:** `java.util.NavigableMap<K,V>`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Subclasses should
 override one or more methods to modify the behavior of the backing map as desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**Warning:** The methods of ForwardingNavigableMap forward *indiscriminately*
 to the methods of the delegate. For example, overriding #put alone *will not* change
 the behavior of #putAll, which can lead to unexpected behavior. In this case, you should
 override putAll as well, either providing your own implementation, or delegating to the
 provided standardPutAll method.

 
**default method warning:** This class does *not* forward calls to 
 default methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the ForwardingNavigableMap.

 
Each of the standard methods uses the map's comparator (or the natural ordering of the
 elements, if there is no comparator) to test element equality. As a result, if the comparator is
 not consistent with equals, some of the standard implementations may violate the Map
 contract.

 
The standard methods and the collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.util.NavigableMap<K,V>`

### `lowerEntry(K key)`

**Returns:** `java.util.Map.Entry<K,V>`

**Parameters:**
- `key` (`K`)

### `standardLowerEntry(K key)`

**Returns:** `java.util.Map.Entry<K,V>`

If you override headMap, you may wish to override 
 lowerEntry to forward to this implementation.

**Parameters:**
- `key` (`K`)

### `lowerKey(K key)`

**Returns:** `K`

**Parameters:**
- `key` (`K`)

### `standardLowerKey(K key)`

**Returns:** `K`

If you override
 #lowerEntry, you may wish to override lowerKey to forward to this
 implementation.

**Parameters:**
- `key` (`K`)

### `floorEntry(K key)`

**Returns:** `java.util.Map.Entry<K,V>`

**Parameters:**
- `key` (`K`)

### `standardFloorEntry(K key)`

**Returns:** `java.util.Map.Entry<K,V>`

If you override headMap, you may wish to override 
 floorEntry to forward to this implementation.

**Parameters:**
- `key` (`K`)

### `floorKey(K key)`

**Returns:** `K`

**Parameters:**
- `key` (`K`)

### `standardFloorKey(K key)`

**Returns:** `K`

If you override
 floorEntry, you may wish to override floorKey to forward to this
 implementation.

**Parameters:**
- `key` (`K`)

### `ceilingEntry(K key)`

**Returns:** `java.util.Map.Entry<K,V>`

**Parameters:**
- `key` (`K`)

### `standardCeilingEntry(K key)`

**Returns:** `java.util.Map.Entry<K,V>`

If you override tailMap, you may wish to override 
 ceilingEntry to forward to this implementation.

**Parameters:**
- `key` (`K`)

### `ceilingKey(K key)`

**Returns:** `K`

**Parameters:**
- `key` (`K`)

### `standardCeilingKey(K key)`

**Returns:** `K`

If you override
 ceilingEntry, you may wish to override ceilingKey to forward to this
 implementation.

**Parameters:**
- `key` (`K`)

### `higherEntry(K key)`

**Returns:** `java.util.Map.Entry<K,V>`

**Parameters:**
- `key` (`K`)

### `standardHigherEntry(K key)`

**Returns:** `java.util.Map.Entry<K,V>`

If you override tailMap, you may wish to override 
 higherEntry to forward to this implementation.

**Parameters:**
- `key` (`K`)

### `higherKey(K key)`

**Returns:** `K`

**Parameters:**
- `key` (`K`)

### `standardHigherKey(K key)`

**Returns:** `K`

If you override
 higherEntry, you may wish to override higherKey to forward to this
 implementation.

**Parameters:**
- `key` (`K`)

### `firstEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `standardFirstEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

If you override entrySet, you may wish to override firstEntry to
 forward to this implementation.

### `standardFirstKey()`

**Returns:** `K`

If you override
 firstEntry, you may wish to override firstKey to forward to this
 implementation.

### `lastEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `standardLastEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

If you override descendingMap, you may wish to
 override lastEntry to forward to this implementation.

### `standardLastKey()`

**Returns:** `K`

If you override 
 lastEntry, you may wish to override lastKey to forward to this implementation.

### `pollFirstEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `standardPollFirstEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

If you override entrySet, you may wish to override pollFirstEntry to
 forward to this implementation.

### `pollLastEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `standardPollLastEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

If you override descendingMap, you may wish to
 override pollFirstEntry to forward to this implementation.

### `descendingMap()`

**Returns:** `java.util.NavigableMap<K,V>`

### `navigableKeySet()`

**Returns:** `java.util.NavigableSet<K>`

### `descendingKeySet()`

**Returns:** `java.util.NavigableSet<K>`

### `standardDescendingKeySet()`

**Returns:** `java.util.NavigableSet<K>`

(The StandardDescendingMap implementation implements 
 navigableKeySet on its own, so as not to cause an infinite loop.) If you override 
 descendingMap, you may wish to override descendingKeySet to forward to this
 implementation.

### `standardSubMap(K fromKey, K toKey)`

**Returns:** `java.util.SortedMap<K,V>`

If you override subMap(K, boolean, K, boolean), you may
 wish to override subMap to forward to this implementation.

**Parameters:**
- `fromKey` (`K`)
- `toKey` (`K`)

### `subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)`

**Returns:** `java.util.NavigableMap<K,V>`

**Parameters:**
- `fromKey` (`K`)
- `fromInclusive` (`boolean`)
- `toKey` (`K`)
- `toInclusive` (`boolean`)

### `headMap(K toKey, boolean inclusive)`

**Returns:** `java.util.NavigableMap<K,V>`

**Parameters:**
- `toKey` (`K`)
- `inclusive` (`boolean`)

### `tailMap(K fromKey, boolean inclusive)`

**Returns:** `java.util.NavigableMap<K,V>`

**Parameters:**
- `fromKey` (`K`)
- `inclusive` (`boolean`)

### `standardHeadMap(K toKey)`

**Returns:** `java.util.SortedMap<K,V>`

If you override headMap(K, boolean), you may wish to override 
 headMap to forward to this implementation.

**Parameters:**
- `toKey` (`K`)

### `standardTailMap(K fromKey)`

**Returns:** `java.util.SortedMap<K,V>`

If you override tailMap(K, boolean), you may wish to override 
 tailMap to forward to this implementation.

**Parameters:**
- `fromKey` (`K`)

