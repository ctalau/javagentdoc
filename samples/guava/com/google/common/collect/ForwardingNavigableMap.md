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

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.Map.Entry<K,V>`

### `standardLowerEntry(K key)`

If you override headMap, you may wish to override 
 lowerEntry to forward to this implementation.

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.Map.Entry<K,V>`

### `lowerKey(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `K`

### `standardLowerKey(K key)`

If you override
 #lowerEntry, you may wish to override lowerKey to forward to this
 implementation.

**Parameters:**
- `key` (`K`)

**Returns:** `K`

### `floorEntry(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.Map.Entry<K,V>`

### `standardFloorEntry(K key)`

If you override headMap, you may wish to override 
 floorEntry to forward to this implementation.

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.Map.Entry<K,V>`

### `floorKey(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `K`

### `standardFloorKey(K key)`

If you override
 floorEntry, you may wish to override floorKey to forward to this
 implementation.

**Parameters:**
- `key` (`K`)

**Returns:** `K`

### `ceilingEntry(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.Map.Entry<K,V>`

### `standardCeilingEntry(K key)`

If you override tailMap, you may wish to override 
 ceilingEntry to forward to this implementation.

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.Map.Entry<K,V>`

### `ceilingKey(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `K`

### `standardCeilingKey(K key)`

If you override
 ceilingEntry, you may wish to override ceilingKey to forward to this
 implementation.

**Parameters:**
- `key` (`K`)

**Returns:** `K`

### `higherEntry(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.Map.Entry<K,V>`

### `standardHigherEntry(K key)`

If you override tailMap, you may wish to override 
 higherEntry to forward to this implementation.

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.Map.Entry<K,V>`

### `higherKey(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `K`

### `standardHigherKey(K key)`

If you override
 higherEntry, you may wish to override higherKey to forward to this
 implementation.

**Parameters:**
- `key` (`K`)

**Returns:** `K`

### `firstEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `standardFirstEntry()`

If you override entrySet, you may wish to override firstEntry to
 forward to this implementation.

**Returns:** `java.util.Map.Entry<K,V>`

### `standardFirstKey()`

If you override
 firstEntry, you may wish to override firstKey to forward to this
 implementation.

**Returns:** `K`

### `lastEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `standardLastEntry()`

If you override descendingMap, you may wish to
 override lastEntry to forward to this implementation.

**Returns:** `java.util.Map.Entry<K,V>`

### `standardLastKey()`

If you override 
 lastEntry, you may wish to override lastKey to forward to this implementation.

**Returns:** `K`

### `pollFirstEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `standardPollFirstEntry()`

If you override entrySet, you may wish to override pollFirstEntry to
 forward to this implementation.

**Returns:** `java.util.Map.Entry<K,V>`

### `pollLastEntry()`

**Returns:** `java.util.Map.Entry<K,V>`

### `standardPollLastEntry()`

If you override descendingMap, you may wish to
 override pollFirstEntry to forward to this implementation.

**Returns:** `java.util.Map.Entry<K,V>`

### `descendingMap()`

**Returns:** `java.util.NavigableMap<K,V>`

### `navigableKeySet()`

**Returns:** `java.util.NavigableSet<K>`

### `descendingKeySet()`

**Returns:** `java.util.NavigableSet<K>`

### `standardDescendingKeySet()`

(The StandardDescendingMap implementation implements 
 navigableKeySet on its own, so as not to cause an infinite loop.) If you override 
 descendingMap, you may wish to override descendingKeySet to forward to this
 implementation.

**Returns:** `java.util.NavigableSet<K>`

### `standardSubMap(K fromKey, K toKey)`

If you override subMap(K, boolean, K, boolean), you may
 wish to override subMap to forward to this implementation.

**Parameters:**
- `fromKey` (`K`)
- `toKey` (`K`)

**Returns:** `java.util.SortedMap<K,V>`

### `subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive)`

**Parameters:**
- `fromKey` (`K`)
- `fromInclusive` (`boolean`)
- `toKey` (`K`)
- `toInclusive` (`boolean`)

**Returns:** `java.util.NavigableMap<K,V>`

### `headMap(K toKey, boolean inclusive)`

**Parameters:**
- `toKey` (`K`)
- `inclusive` (`boolean`)

**Returns:** `java.util.NavigableMap<K,V>`

### `tailMap(K fromKey, boolean inclusive)`

**Parameters:**
- `fromKey` (`K`)
- `inclusive` (`boolean`)

**Returns:** `java.util.NavigableMap<K,V>`

### `standardHeadMap(K toKey)`

If you override headMap(K, boolean), you may wish to override 
 headMap to forward to this implementation.

**Parameters:**
- `toKey` (`K`)

**Returns:** `java.util.SortedMap<K,V>`

### `standardTailMap(K fromKey)`

If you override tailMap(K, boolean), you may wish to override 
 tailMap to forward to this implementation.

**Parameters:**
- `fromKey` (`K`)

**Returns:** `java.util.SortedMap<K,V>`

