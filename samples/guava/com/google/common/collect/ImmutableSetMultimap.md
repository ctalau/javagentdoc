# Class: `ImmutableSetMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableSetMultimap`

**Extends:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

**Implements:** [`com.google.common.collect.SetMultimap<K,V>`](./SetMultimap.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

**Warning:** As in all SetMultimaps, do not modify either a key *or a value*
 of a ImmutableSetMultimap in a way that affects its Object#equals behavior.
 Undefined behavior and bugs will result.

 
See the Guava User Guide article on [immutable collections](https://github.com/google/guava/wiki/ImmutableCollectionsExplained).

## Fields

### `emptySet`

**Type:** [`com.google.common.collect.ImmutableSet<V>`](./ImmutableSet.md)

Also holds the comparator, if any, used for
 values.

### `inverse`

**Type:** [`com.google.common.collect.ImmutableSetMultimap<V,K>`](./ImmutableSetMultimap.md)

### `entries`

**Type:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(com.google.common.collect.ImmutableMap<K,com.google.common.collect.ImmutableSet<V>> map, int size, java.util.Comparator<? super V> valueComparator)`

**Parameters:**
- `map` ([`com.google.common.collect.ImmutableMap<K,com.google.common.collect.ImmutableSet<V>>`](./ImmutableMap.md))
- `size` (`int`)
- `valueComparator` (`java.util.Comparator<? super V>`)

## Methods

### `toImmutableSetMultimap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSetMultimap<K,V>>`

For streams with defined encounter order (as defined in the Ordering section of the java.util.stream Javadoc), that order is preserved, but entries are [grouped by key](ImmutableMultimap.html#iteration).

 
Example:

 

```

 static final Multimap<Character, String> FIRST_LETTER_MULTIMAP =
     Stream.of("banana", "apple", "carrot", "asparagus", "cherry")
         .collect(toImmutableSetMultimap(str -> str.charAt(0), str -> str.substring(1)));

 // is equivalent to

 static final Multimap<Character, String> FIRST_LETTER_MULTIMAP =
     new ImmutableSetMultimap.Builder<Character, String>()
         .put('b', "anana")
         .putAll('a', "pple", "sparagus")
         .putAll('c', "arrot", "herry")
         .build();
 
```

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

### `flatteningToImmutableSetMultimap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends java.util.stream.Stream<? extends V>> valuesFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSetMultimap<K,V>>`

Each
 input element is mapped to a key and a stream of values, each of which are put into the
 resulting Multimap, in the encounter order of the stream and the encounter order of the
 streams of values.

 
Example:

 

```

 static final ImmutableSetMultimap<Character, Character> FIRST_LETTER_MULTIMAP =
     Stream.of("banana", "apple", "carrot", "asparagus", "cherry")
         .collect(
             flatteningToImmutableSetMultimap(
                  str -> str.charAt(0),
                  str -> str.substring(1).chars().mapToObj(c -> (char) c));

 // is equivalent to

 static final ImmutableSetMultimap<Character, Character> FIRST_LETTER_MULTIMAP =
     ImmutableSetMultimap.<Character, Character>builder()
         .putAll('b', Arrays.asList('a', 'n', 'a', 'n', 'a'))
         .putAll('a', Arrays.asList('p', 'p', 'l', 'e'))
         .putAll('c', Arrays.asList('a', 'r', 'r', 'o', 't'))
         .putAll('a', Arrays.asList('s', 'p', 'a', 'r', 'a', 'g', 'u', 's'))
         .putAll('c', Arrays.asList('h', 'e', 'r', 'r', 'y'))
         .build();

 // after deduplication, the resulting multimap is equivalent to

 static final ImmutableSetMultimap<Character, Character> FIRST_LETTER_MULTIMAP =
     ImmutableSetMultimap.<Character, Character>builder()
         .putAll('b', Arrays.asList('a', 'n'))
         .putAll('a', Arrays.asList('p', 'l', 'e', 's', 'a', 'r', 'g', 'u'))
         .putAll('c', Arrays.asList('a', 'r', 'o', 't', 'h', 'e', 'y'))
         .build();
 
 }
```

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valuesFunction` (`java.util.function.Function<? super T,? extends java.util.stream.Stream<? extends V>>`)

### `of()`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

**Performance note:** the instance returned is a singleton.

### `of(K k1, V v1)`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)

### `of(K k1, V v1, K k2, V v2)`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

Repeated occurrences of
 an entry (according to Object#equals) after the first are ignored.

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)

### `of(K k1, V v1, K k2, V v2, K k3, V v3)`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

Repeated occurrences of
 an entry (according to Object#equals) after the first are ignored.

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)
- `k3` (`K`)
- `v3` (`V`)

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4)`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

Repeated occurrences of
 an entry (according to Object#equals) after the first are ignored.

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)
- `k3` (`K`)
- `v3` (`V`)
- `k4` (`K`)
- `v4` (`V`)

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5)`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

Repeated occurrences of
 an entry (according to Object#equals) after the first are ignored.

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)
- `k3` (`K`)
- `v3` (`V`)
- `k4` (`K`)
- `v4` (`V`)
- `k5` (`K`)
- `v5` (`V`)

### `builder()`

**Returns:** `com.google.common.collect.ImmutableSetMultimap.Builder<K,V>`

### `copyOf(com.google.common.collect.Multimap<? extends K,? extends V> multimap)`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

The
 generated multimap's key and value orderings correspond to the iteration ordering of the 
 multimap.asMap() view. Repeated occurrences of an entry in the multimap after the first are
 ignored.

 
Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

**Parameters:**
- `multimap` ([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md))

### `copyOf(com.google.common.collect.Multimap<? extends K,? extends V> multimap, java.util.Comparator<? super V> valueComparator)`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

**Parameters:**
- `multimap` ([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md))
- `valueComparator` (`java.util.Comparator<? super V>`)

### `copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>> entries)`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

The returned multimap iterates
 over keys in the order they were first encountered in the input, and the values for each key
 are iterated in the order they were encountered. If two values for the same key are equal, the first value encountered is used.

**Parameters:**
- `entries` (`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>`)

### `fromMapEntries(java.util.Collection<? extends java.util.Map.Entry<? extends K,? extends java.util.Collection<? extends V>>> mapEntries, java.util.Comparator<? super V> valueComparator)`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

**Parameters:**
- `mapEntries` (`java.util.Collection<? extends java.util.Map.Entry<? extends K,? extends java.util.Collection<? extends V>>>`)
- `valueComparator` (`java.util.Comparator<? super V>`)

### `get(K key)`

**Returns:** [`com.google.common.collect.ImmutableSet<V>`](./ImmutableSet.md)

If no mappings in the multimap have
 the provided key, an empty immutable set is returned. The values are in the same order as the
 parameters used to build this multimap.

**Parameters:**
- `key` (`K`)

### `inverse()`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<V,K>`](./ImmutableSetMultimap.md)

Because an inverse of a set multimap cannot contain multiple pairs with the same key and
 value, this method returns an ImmutableSetMultimap rather than the 
 ImmutableMultimap specified in the ImmutableMultimap class.

### `invert()`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<V,K>`](./ImmutableSetMultimap.md)

### `removeAll(java.lang.Object key)`

**Returns:** [`com.google.common.collect.ImmutableSet<V>`](./ImmutableSet.md)

**Parameters:**
- `key` (`java.lang.Object`)

### `replaceValues(K key, java.lang.Iterable<? extends V> values)`

**Returns:** [`com.google.common.collect.ImmutableSet<V>`](./ImmutableSet.md)

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

### `entries()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet.md)

Its iterator traverses
 the values for the first key, the values for the second key, and so on.

### `valueSet(java.util.Comparator<? super V> valueComparator, java.util.Collection<? extends V> values)`

**Returns:** [`com.google.common.collect.ImmutableSet<V>`](./ImmutableSet.md)

**Parameters:**
- `valueComparator` (`java.util.Comparator<? super V>`)
- `values` (`java.util.Collection<? extends V>`)

### `emptySet(java.util.Comparator<? super V> valueComparator)`

**Returns:** [`com.google.common.collect.ImmutableSet<V>`](./ImmutableSet.md)

**Parameters:**
- `valueComparator` (`java.util.Comparator<? super V>`)

### `valuesBuilder(java.util.Comparator<? super V> valueComparator)`

**Returns:** `com.google.common.collect.ImmutableSet.Builder<V>`

**Parameters:**
- `valueComparator` (`java.util.Comparator<? super V>`)

### `writeObject(java.io.ObjectOutputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectOutputStream`)

### `valueComparator()`

**Returns:** `java.util.Comparator<? super V>`

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

