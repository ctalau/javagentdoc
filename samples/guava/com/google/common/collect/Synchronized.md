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

### `collection(Collection<E> collection, Object mutex)`

**Parameters:**
- `collection` (`java.util.Collection<E>`)
- `mutex` (`java.lang.Object`)

**Returns:** `java.util.Collection<E>`

### `set(Set<E> set, Object mutex)`

**Parameters:**
- `set` (`java.util.Set<E>`)
- `mutex` (`java.lang.Object`)

**Returns:** `java.util.Set<E>`

### `sortedSet(SortedSet<E> set, Object mutex)`

**Parameters:**
- `set` (`java.util.SortedSet<E>`)
- `mutex` (`java.lang.Object`)

**Returns:** `java.util.SortedSet<E>`

### `list(List<E> list, Object mutex)`

**Parameters:**
- `list` (`java.util.List<E>`)
- `mutex` (`java.lang.Object`)

**Returns:** `java.util.List<E>`

### `multiset(Multiset<E> multiset, Object mutex)`

**Parameters:**
- `multiset` ([`com.google.common.collect.Multiset<E>`](./Multiset.md))
- `mutex` (`java.lang.Object`)

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

### `multimap(Multimap<K,V> multimap, Object mutex)`

**Parameters:**
- `multimap` ([`com.google.common.collect.Multimap<K,V>`](./Multimap.md))
- `mutex` (`java.lang.Object`)

**Returns:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

### `listMultimap(ListMultimap<K,V> multimap, Object mutex)`

**Parameters:**
- `multimap` ([`com.google.common.collect.ListMultimap<K,V>`](./ListMultimap.md))
- `mutex` (`java.lang.Object`)

**Returns:** [`com.google.common.collect.ListMultimap<K,V>`](./ListMultimap.md)

### `setMultimap(SetMultimap<K,V> multimap, Object mutex)`

**Parameters:**
- `multimap` ([`com.google.common.collect.SetMultimap<K,V>`](./SetMultimap.md))
- `mutex` (`java.lang.Object`)

**Returns:** [`com.google.common.collect.SetMultimap<K,V>`](./SetMultimap.md)

### `sortedSetMultimap(SortedSetMultimap<K,V> multimap, Object mutex)`

**Parameters:**
- `multimap` ([`com.google.common.collect.SortedSetMultimap<K,V>`](./SortedSetMultimap.md))
- `mutex` (`java.lang.Object`)

**Returns:** [`com.google.common.collect.SortedSetMultimap<K,V>`](./SortedSetMultimap.md)

### `typePreservingCollection(Collection<E> collection, Object mutex)`

**Parameters:**
- `collection` (`java.util.Collection<E>`)
- `mutex` (`java.lang.Object`)

**Returns:** `java.util.Collection<E>`

### `typePreservingSet(Set<E> set, Object mutex)`

**Parameters:**
- `set` (`java.util.Set<E>`)
- `mutex` (`java.lang.Object`)

**Returns:** `java.util.Set<E>`

### `map(Map<K,V> map, Object mutex)`

**Parameters:**
- `map` (`java.util.Map<K,V>`)
- `mutex` (`java.lang.Object`)

**Returns:** `java.util.Map<K,V>`

### `sortedMap(SortedMap<K,V> sortedMap, Object mutex)`

**Parameters:**
- `sortedMap` (`java.util.SortedMap<K,V>`)
- `mutex` (`java.lang.Object`)

**Returns:** `java.util.SortedMap<K,V>`

### `biMap(BiMap<K,V> bimap, Object mutex)`

**Parameters:**
- `bimap` ([`com.google.common.collect.BiMap<K,V>`](./BiMap.md))
- `mutex` (`java.lang.Object`)

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

### `navigableSet(NavigableSet<E> navigableSet, Object mutex)`

**Parameters:**
- `navigableSet` (`java.util.NavigableSet<E>`)
- `mutex` (`java.lang.Object`)

**Returns:** `java.util.NavigableSet<E>`

### `navigableSet(NavigableSet<E> navigableSet)`

**Parameters:**
- `navigableSet` (`java.util.NavigableSet<E>`)

**Returns:** `java.util.NavigableSet<E>`

### `navigableMap(NavigableMap<K,V> navigableMap)`

**Parameters:**
- `navigableMap` (`java.util.NavigableMap<K,V>`)

**Returns:** `java.util.NavigableMap<K,V>`

### `navigableMap(NavigableMap<K,V> navigableMap, Object mutex)`

**Parameters:**
- `navigableMap` (`java.util.NavigableMap<K,V>`)
- `mutex` (`java.lang.Object`)

**Returns:** `java.util.NavigableMap<K,V>`

### `nullableSynchronizedEntry(Map.Entry<K,V> entry, Object mutex)`

**Parameters:**
- `entry` (`java.util.Map.Entry<K,V>`)
- `mutex` (`java.lang.Object`)

**Returns:** `java.util.Map.Entry<K,V>`

### `queue(Queue<E> queue, Object mutex)`

**Parameters:**
- `queue` (`java.util.Queue<E>`)
- `mutex` (`java.lang.Object`)

**Returns:** `java.util.Queue<E>`

### `deque(Deque<E> deque, Object mutex)`

**Parameters:**
- `deque` (`java.util.Deque<E>`)
- `mutex` (`java.lang.Object`)

**Returns:** `java.util.Deque<E>`

### `table(Table<R,C,V> table, Object mutex)`

**Parameters:**
- `table` ([`com.google.common.collect.Table<R,C,V>`](./Table.md))
- `mutex` (`java.lang.Object`)

**Returns:** [`com.google.common.collect.Table<R,C,V>`](./Table.md)

