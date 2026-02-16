# Class: `Synchronized`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Synchronized`

## Description

Synchronized collection views. The returned synchronized collection views are serializable if the
 backing collection and the mutex are serializable.

 <p>If `null` is passed as the `mutex` parameter to any of this class's top-level
 methods or inner class constructors, the created object uses itself as the synchronization mutex.

 <p>This class should be used by other collection classes only.
**Author:** Mike Bostock
**Author:** Jared Levy

## Constructors

### `<init>()`

## Methods

### `collection(`java.util.Collection<E>` collection, `java.lang.Object` mutex)`

**Returns:** `java.util.Collection<E>`

### `set(`java.util.Set<E>` set, `java.lang.Object` mutex)`

**Returns:** `java.util.Set<E>`

### `sortedSet(`java.util.SortedSet<E>` set, `java.lang.Object` mutex)`

**Returns:** `java.util.SortedSet<E>`

### `list(`java.util.List<E>` list, `java.lang.Object` mutex)`

**Returns:** `java.util.List<E>`

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

### `typePreservingCollection(`java.util.Collection<E>` collection, `java.lang.Object` mutex)`

**Returns:** `java.util.Collection<E>`

### `typePreservingSet(`java.util.Set<E>` set, `java.lang.Object` mutex)`

**Returns:** `java.util.Set<E>`

### `map(`java.util.Map<K,V>` map, `java.lang.Object` mutex)`

**Returns:** `java.util.Map<K,V>`

### `sortedMap(`java.util.SortedMap<K,V>` sortedMap, `java.lang.Object` mutex)`

**Returns:** `java.util.SortedMap<K,V>`

### `biMap([`com.google.common.collect.BiMap<K,V>`](./BiMap.md) bimap, `java.lang.Object` mutex)`

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

### `navigableSet(`java.util.NavigableSet<E>` navigableSet, `java.lang.Object` mutex)`

**Returns:** `java.util.NavigableSet<E>`

### `navigableSet(`java.util.NavigableSet<E>` navigableSet)`

**Returns:** `java.util.NavigableSet<E>`

### `navigableMap(`java.util.NavigableMap<K,V>` navigableMap)`

**Returns:** `java.util.NavigableMap<K,V>`

### `navigableMap(`java.util.NavigableMap<K,V>` navigableMap, `java.lang.Object` mutex)`

**Returns:** `java.util.NavigableMap<K,V>`

### `nullableSynchronizedEntry(`java.util.Map.Entry<K,V>` entry, `java.lang.Object` mutex)`

**Returns:** `java.util.Map.Entry<K,V>`

### `queue(`java.util.Queue<E>` queue, `java.lang.Object` mutex)`

**Returns:** `java.util.Queue<E>`

### `deque(`java.util.Deque<E>` deque, `java.lang.Object` mutex)`

**Returns:** `java.util.Deque<E>`

### `table([`com.google.common.collect.Table<R,C,V>`](./Table.md) table, `java.lang.Object` mutex)`

**Returns:** [`com.google.common.collect.Table<R,C,V>`](./Table.md)

