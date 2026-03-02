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

### `<init>(ImmutableMap<K,ImmutableList<V>> map, int size)`

**Parameters:**
- `map` ([`com.google.common.collect.ImmutableMap<K,com.google.common.collect.ImmutableList<V>>`](./ImmutableMap.md))
- `size` (`int`)

## Methods

### `toImmutableListMultimap(Function<? super T,? extends K> keyFunction, Function<? super T,? extends V> valueFunction)`

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

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableListMultimap<K,V>>`

### `flatteningToImmutableListMultimap(Function<? super T,? extends K> keyFunction, Function<? super T,? extends Stream<? extends V>> valuesFunction)`

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

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableListMultimap<K,V>>`

### `of()`

**Performance note:** the instance returned is a singleton.

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

### `of(K k1, V v1)`

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

### `of(K k1, V v1, K k2, V v2)`

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

### `of(K k1, V v1, K k2, V v2, K k3, V v3)`

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)
- `k3` (`K`)
- `v3` (`V`)

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4)`

**Parameters:**
- `k1` (`K`)
- `v1` (`V`)
- `k2` (`K`)
- `v2` (`V`)
- `k3` (`K`)
- `v3` (`V`)
- `k4` (`K`)
- `v4` (`V`)

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

### `of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5)`

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

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

### `builder()`

The generated builder is equivalent to the builder created by the Builder constructor.

**Returns:** `com.google.common.collect.ImmutableListMultimap.Builder<K,V>`

### `copyOf(Multimap<? extends K,? extends V> multimap)`

The generated
 multimap's key and value orderings correspond to the iteration ordering of the 
 multimap.asMap() view.

 
Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.

**Parameters:**
- `multimap` ([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md))

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

### `copyOf(Iterable<? extends Map.Entry<? extends K,? extends V>> entries)`

The returned multimap iterates
 over keys in the order they were first encountered in the input, and the values for each key
 are iterated in the order they were encountered.

**Parameters:**
- `entries` (`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>`)

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

### `fromMapEntries(Collection<? extends Map.Entry<? extends K,? extends Collection<? extends V>>> mapEntries, Comparator<? super V> valueComparator)`

**Parameters:**
- `mapEntries` (`java.util.Collection<? extends java.util.Map.Entry<? extends K,? extends java.util.Collection<? extends V>>>`)
- `valueComparator` (`java.util.Comparator<? super V>`)

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

### `get(K key)`

If no mappings in the multimap have
 the provided key, an empty immutable list is returned. The values are in the same order as the
 parameters used to build this multimap.

**Parameters:**
- `key` (`K`)

**Returns:** [`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md)

### `inverse()`

Because an inverse of a list multimap can contain multiple pairs with the same key and
 value, this method returns an ImmutableListMultimap rather than the 
 ImmutableMultimap specified in the ImmutableMultimap class.

**Returns:** [`com.google.common.collect.ImmutableListMultimap<V,K>`](./ImmutableListMultimap.md)

### `invert()`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<V,K>`](./ImmutableListMultimap.md)

### `removeAll(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** [`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md)

### `replaceValues(K key, Iterable<? extends V> values)`

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

**Returns:** [`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md)

### `writeObject(ObjectOutputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectOutputStream`)

**Returns:** `void`

### `readObject(ObjectInputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

**Returns:** `void`

