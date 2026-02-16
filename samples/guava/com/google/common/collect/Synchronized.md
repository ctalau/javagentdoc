# Class: `Synchronized`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Synchronized`

## Description

Synchronized collection views. The returned synchronized collection views are serializable if the
 backing collection and the mutex are serializable.

 <p>If {@code null} is passed as the {@code mutex} parameter to any of this class's top-level
 methods or inner class constructors, the created object uses itself as the synchronization mutex.

 <p>This class should be used by other collection classes only.
@author Mike Bostock
@author Jared Levy

## Constructors

### `<init>()`

## Methods

### `collection([`java.util.Collection<E>`](../../../../java/util/Collection.md) collection, `java.lang.Object` mutex)`

**Returns:** [`java.util.Collection<E>`](../../../../java/util/Collection.md)

### `set([`java.util.Set<E>`](../../../../java/util/Set.md) set, `java.lang.Object` mutex)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `sortedSet([`java.util.SortedSet<E>`](../../../../java/util/SortedSet.md) set, `java.lang.Object` mutex)`

**Returns:** [`java.util.SortedSet<E>`](../../../../java/util/SortedSet.md)

### `list([`java.util.List<E>`](../../../../java/util/List.md) list, `java.lang.Object` mutex)`

**Returns:** [`java.util.List<E>`](../../../../java/util/List.md)

### `multiset([`com.google.common.collect.Multiset<E>`](./Multiset.md) multiset, `java.lang.Object` mutex)`

**Returns:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

### `multimap([`com.google.common.collect.Multimap<K,V>`](./Multimap.md) multimap, `java.lang.Object` mutex)`

**Returns:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

### `listMultimap([`com.google.common.collect.ListMultimap<K,V>`](./ListMultimap.md) multimap, `java.lang.Object` mutex)`

**Returns:** [`com.google.common.collect.ListMultimap<K,V>`](./ListMultimap.md)

### `setMultimap([`com.google.common.collect.SetMultimap<K,V>`](./SetMultimap.md) multimap, `java.lang.Object` mutex)`

**Returns:** [`com.google.common.collect.SetMultimap<K,V>`](./SetMultimap.md)

### `sortedSetMultimap([`com.google.common.collect.SortedSetMultimap<K,V>`](./SortedSetMultimap.md) multimap, `java.lang.Object` mutex)`

**Returns:** [`com.google.common.collect.SortedSetMultimap<K,V>`](./SortedSetMultimap.md)

### `typePreservingCollection([`java.util.Collection<E>`](../../../../java/util/Collection.md) collection, `java.lang.Object` mutex)`

**Returns:** [`java.util.Collection<E>`](../../../../java/util/Collection.md)

### `typePreservingSet([`java.util.Set<E>`](../../../../java/util/Set.md) set, `java.lang.Object` mutex)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `map([`java.util.Map<K,V>`](../../../../java/util/Map.md) map, `java.lang.Object` mutex)`

**Returns:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

### `sortedMap([`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md) sortedMap, `java.lang.Object` mutex)`

**Returns:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

### `biMap([`com.google.common.collect.BiMap<K,V>`](./BiMap.md) bimap, `java.lang.Object` mutex)`

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

### `navigableSet([`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md) navigableSet, `java.lang.Object` mutex)`

**Returns:** [`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md)

### `navigableSet([`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md) navigableSet)`

**Returns:** [`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md)

### `navigableMap([`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md) navigableMap)`

**Returns:** [`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md)

### `navigableMap([`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md) navigableMap, `java.lang.Object` mutex)`

**Returns:** [`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md)

### `nullableSynchronizedEntry([`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md) entry, `java.lang.Object` mutex)`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `queue([`java.util.Queue<E>`](../../../../java/util/Queue.md) queue, `java.lang.Object` mutex)`

**Returns:** [`java.util.Queue<E>`](../../../../java/util/Queue.md)

### `deque([`java.util.Deque<E>`](../../../../java/util/Deque.md) deque, `java.lang.Object` mutex)`

**Returns:** [`java.util.Deque<E>`](../../../../java/util/Deque.md)

### `table([`com.google.common.collect.Table<R,C,V>`](./Table.md) table, `java.lang.Object` mutex)`

**Returns:** [`com.google.common.collect.Table<R,C,V>`](./Table.md)

