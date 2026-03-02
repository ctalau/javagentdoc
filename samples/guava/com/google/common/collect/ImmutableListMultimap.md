# Class: `ImmutableListMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableListMultimap`

**Extends:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

**Implements:** [`com.google.common.collect.ListMultimap<K,V>`](./ListMultimap.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

See the Guava User Guide article on [immutable collections](https://github.com/google/guava/wiki/ImmutableCollectionsExplained).

## Fields

### `inverse`

**Type:** [`com.google.common.collect.ImmutableListMultimap<V,K>`](./ImmutableListMultimap.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(com.google.common.collect.ImmutableMap<K,com.google.common.collect.ImmutableList<V>> map, int size)`

**Parameters:**
- `map` ([`com.google.common.collect.ImmutableMap<K,com.google.common.collect.ImmutableList<V>>`](./ImmutableMap.md))
- `size` (`int`)

## Methods

### `toImmutableListMultimap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableListMultimap<K,V>>`

For streams with defined encounter order (as defined in the Ordering section of the java.util.stream Javadoc), that order is preserved, but entries are [grouped by key](ImmutableMultimap.html#iteration).

 
Example:

 

```

 static final Multimap<Character, String> FIRST_LETTER_MULTIMAP =
     Stream.of("banana", "apple", "carrot", "asparagus", "cherry")
         .collect(toImmutableListMultimap(str -> str.charAt(0), str -> str.substring(1)));

 // is equivalent to

 static final Multimap<Character, String> FIRST_LETTER_MULTIMAP =
     new ImmutableListMultimap.Builder<Character, String>()
         .put('b', "anana")
         .putAll('a', "pple", "sparagus")
         .putAll('c', "arrot", "herry")
         .build();
 
```

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

### `flatteningToImmutableListMultimap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends java.util.stream.Stream<? extends V>> valuesFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableListMultimap<K,V>>`

Each
 input element is mapped to a key and a stream of values, each of which are put into the
 resulting Multimap, in the encounter order of the stream and the encounter order of the
 streams of values.

 
Example:

 

```

 static final ImmutableListMultimap<Character, Character> FIRST_LETTER_MULTIMAP =
     Stream.of("banana", "apple", "carrot", "asparagus", "cherry")
         .collect(
             flatteningToImmutableListMultimap(
                  str -> str.charAt(0),
                  str -> str.substring(1).chars().mapToObj(c -> (char) c));

 // is equivalent to

 static final ImmutableListMultimap<Character, Character> FIRST_LETTER_MULTIMAP =
     ImmutableListMultimap.<Character, Character>builder()
         .putAll('b', Arrays.asList('a', 'n', 'a', 'n', 'a'))
         .putAll('a', Arrays.asList('p', 'p', 'l', 'e'))
         .putAll('c', Arrays.asList('a', 'r', 'r', 'o', 't'))
         .putAll('a', Arrays.asList('s', 'p', 'a', 'r', 'a', 'g', 'u', 's'))
         .putAll('c', Arrays.asList('h', 'e', 'r', 'r', 'y'))
         .build();
 
 }
```

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valuesFunction` (`java.util.function.Function<? super T,? extends java.util.stream.Stream<? extends V>>`)

### `of()`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

**Performance note:** the instance returned is a singleton.

### `of(K k1, V v1)`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)

### `of(K k1, V v1, K k2, V v2)`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)

### `of(K k1, V v1, K k2, V v2, K k3, V v3)`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)
- `k3` (`K`)
- `v3` (`V`)

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4)`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

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

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

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

**Returns:** `com.google.common.collect.ImmutableListMultimap.Builder<K,V>`

The generated builder is equivalent to the builder created by the Builder constructor.

### `copyOf(com.google.common.collect.Multimap<? extends K,? extends V> multimap)`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

The generated
 multimap's key and value orderings correspond to the iteration ordering of the 
 multimap.asMap() view.

 
Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

**Parameters:**
- `multimap` ([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md))

### `copyOf(java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>> entries)`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

The returned multimap iterates
 over keys in the order they were first encountered in the input, and the values for each key
 are iterated in the order they were encountered.

**Parameters:**
- `entries` (`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>`)

### `fromMapEntries(java.util.Collection<? extends java.util.Map.Entry<? extends K,? extends java.util.Collection<? extends V>>> mapEntries, java.util.Comparator<? super V> valueComparator)`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

**Parameters:**
- `mapEntries` (`java.util.Collection<? extends java.util.Map.Entry<? extends K,? extends java.util.Collection<? extends V>>>`)
- `valueComparator` (`java.util.Comparator<? super V>`)

### `get(K key)`

**Returns:** [`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md)

If no mappings in the multimap have
 the provided key, an empty immutable list is returned. The values are in the same order as the
 parameters used to build this multimap.

**Parameters:**
- `key` (`K`)

### `inverse()`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<V,K>`](./ImmutableListMultimap.md)

Because an inverse of a list multimap can contain multiple pairs with the same key and
 value, this method returns an ImmutableListMultimap rather than the 
 ImmutableMultimap specified in the ImmutableMultimap class.

### `invert()`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<V,K>`](./ImmutableListMultimap.md)

### `removeAll(java.lang.Object key)`

**Returns:** [`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md)

**Parameters:**
- `key` (`java.lang.Object`)

### `replaceValues(K key, java.lang.Iterable<? extends V> values)`

**Returns:** [`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md)

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

### `writeObject(java.io.ObjectOutputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectOutputStream`)

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

