# Class: `Synchronized`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Synchronized`

## Description

The returned synchronized collection views are serializable if the
 backing collection and the mutex are serializable.

 
If null is passed as the mutex parameter to any of this class's top-level
 methods or inner class constructors, the created object uses itself as the synchronization mutex.

 
This class should be used by other collection classes only.

## Constructors

### `<init>()`

## Methods

### `collection(java.util.Collection<E> collection, java.lang.Object mutex)`

**Returns:** `java.util.Collection<E>`

**Parameters:**
- `collection` (`java.util.Collection<E>`)
- `mutex` (`java.lang.Object`)

### `set(java.util.Set<E> set, java.lang.Object mutex)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `set` (`java.util.Set<E>`)
- `mutex` (`java.lang.Object`)

### `sortedSet(java.util.SortedSet<E> set, java.lang.Object mutex)`

**Returns:** `java.util.SortedSet<E>`

**Parameters:**
- `set` (`java.util.SortedSet<E>`)
- `mutex` (`java.lang.Object`)

### `list(java.util.List<E> list, java.lang.Object mutex)`

**Returns:** `java.util.List<E>`

**Parameters:**
- `list` (`java.util.List<E>`)
- `mutex` (`java.lang.Object`)

### `multiset(com.google.common.collect.Multiset<E> multiset, java.lang.Object mutex)`

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

**Parameters:**
- `multiset` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))
- `mutex` (`java.lang.Object`)

### `multimap(com.google.common.collect.Multimap<K,V> multimap, java.lang.Object mutex)`

**Returns:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

**Parameters:**
- `multimap` ([`com.google.common.collect.Multimap<K,V>`](./Multimap.md))
- `mutex` (`java.lang.Object`)

### `listMultimap(com.google.common.collect.ListMultimap<K,V> multimap, java.lang.Object mutex)`

**Returns:** [`com.google.common.collect.ListMultimap<K,V>`](./ListMultimap.md)

**Parameters:**
- `multimap` ([`com.google.common.collect.ListMultimap<K,V>`](./ListMultimap.md))
- `mutex` (`java.lang.Object`)

### `setMultimap(com.google.common.collect.SetMultimap<K,V> multimap, java.lang.Object mutex)`

**Returns:** [`com.google.common.collect.SetMultimap<K,V>`](./SetMultimap.md)

**Parameters:**
- `multimap` ([`com.google.common.collect.SetMultimap<K,V>`](./SetMultimap.md))
- `mutex` (`java.lang.Object`)

### `sortedSetMultimap(com.google.common.collect.SortedSetMultimap<K,V> multimap, java.lang.Object mutex)`

**Returns:** [`com.google.common.collect.SortedSetMultimap<K,V>`](./SortedSetMultimap.md)

**Parameters:**
- `multimap` ([`com.google.common.collect.SortedSetMultimap<K,V>`](./SortedSetMultimap.md))
- `mutex` (`java.lang.Object`)

### `typePreservingCollection(java.util.Collection<E> collection, java.lang.Object mutex)`

**Returns:** `java.util.Collection<E>`

**Parameters:**
- `collection` (`java.util.Collection<E>`)
- `mutex` (`java.lang.Object`)

### `typePreservingSet(java.util.Set<E> set, java.lang.Object mutex)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `set` (`java.util.Set<E>`)
- `mutex` (`java.lang.Object`)

### `map(java.util.Map<K,V> map, java.lang.Object mutex)`

**Returns:** `java.util.Map<K,V>`

**Parameters:**
- `map` (`java.util.Map<K,V>`)
- `mutex` (`java.lang.Object`)

### `sortedMap(java.util.SortedMap<K,V> sortedMap, java.lang.Object mutex)`

**Returns:** `java.util.SortedMap<K,V>`

**Parameters:**
- `sortedMap` (`java.util.SortedMap<K,V>`)
- `mutex` (`java.lang.Object`)

### `biMap(com.google.common.collect.BiMap<K,V> bimap, java.lang.Object mutex)`

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

**Parameters:**
- `bimap` ([`com.google.common.collect.BiMap<K,V>`](./BiMap.md))
- `mutex` (`java.lang.Object`)

### `navigableSet(java.util.NavigableSet<E> navigableSet, java.lang.Object mutex)`

**Returns:** `java.util.NavigableSet<E>`

**Parameters:**
- `navigableSet` (`java.util.NavigableSet<E>`)
- `mutex` (`java.lang.Object`)

### `navigableSet(java.util.NavigableSet<E> navigableSet)`

**Returns:** `java.util.NavigableSet<E>`

**Parameters:**
- `navigableSet` (`java.util.NavigableSet<E>`)

### `navigableMap(java.util.NavigableMap<K,V> navigableMap)`

**Returns:** `java.util.NavigableMap<K,V>`

**Parameters:**
- `navigableMap` (`java.util.NavigableMap<K,V>`)

### `navigableMap(java.util.NavigableMap<K,V> navigableMap, java.lang.Object mutex)`

**Returns:** `java.util.NavigableMap<K,V>`

**Parameters:**
- `navigableMap` (`java.util.NavigableMap<K,V>`)
- `mutex` (`java.lang.Object`)

### `nullableSynchronizedEntry(java.util.Map.Entry<K,V> entry, java.lang.Object mutex)`

**Returns:** `java.util.Map.Entry<K,V>`

**Parameters:**
- `entry` (`java.util.Map.Entry<K,V>`)
- `mutex` (`java.lang.Object`)

### `queue(java.util.Queue<E> queue, java.lang.Object mutex)`

**Returns:** `java.util.Queue<E>`

**Parameters:**
- `queue` (`java.util.Queue<E>`)
- `mutex` (`java.lang.Object`)

### `deque(java.util.Deque<E> deque, java.lang.Object mutex)`

**Returns:** `java.util.Deque<E>`

**Parameters:**
- `deque` (`java.util.Deque<E>`)
- `mutex` (`java.lang.Object`)

### `table(com.google.common.collect.Table<R,C,V> table, java.lang.Object mutex)`

**Returns:** [`com.google.common.collect.Table<R,C,V>`](./Table.md)

**Parameters:**
- `table` ([`com.google.common.collect.Table<R,C,V>`](./Table.md))
- `mutex` (`java.lang.Object`)

