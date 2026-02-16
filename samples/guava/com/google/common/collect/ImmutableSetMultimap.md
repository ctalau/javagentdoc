# Class: `ImmutableSetMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableSetMultimap`

**Extends:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

**Implements:** [`com.google.common.collect.SetMultimap<K,V>`](./SetMultimap.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A `SetMultimap` whose contents will never change, with many other important properties
 detailed at `ImmutableCollection`.

 <p><b>Warning:</b> As in all `SetMultimap`s, do not modify either a key <i>or a value</i>
 of a `ImmutableSetMultimap` in a way that affects its `Object.equals` behavior.
 Undefined behavior and bugs will result.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/ImmutableCollectionsExplained">immutable collections</a>.
**Author:** Mike Ward
**Since:** 2.0

## Fields

### `emptySet`

**Type:** [`com.google.common.collect.ImmutableSet<V>`](./ImmutableSet.md)

Returned by get() when a missing key is provided. Also holds the comparator, if any, used for
 values.

### `inverse`

**Type:** [`com.google.common.collect.ImmutableSetMultimap<V,K>`](./ImmutableSetMultimap.md)

### `entries`

**Type:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet>.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`com.google.common.collect.ImmutableMap<K,com.google.common.collect.ImmutableSet<V>>`](./ImmutableMap>.md) map, `int` size, `java.util.Comparator<? super V>` valueComparator)`

## Methods

### `toImmutableSetMultimap(`java.util.function.Function<? super T,? extends K>` keyFunction, `java.util.function.Function<? super T,? extends V>` valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSetMultimap<K,V>>`

Returns a `Collector` that accumulates elements into an `ImmutableSetMultimap`
 whose keys and values are the result of applying the provided mapping functions to the input
 elements.

 <p>For streams with defined encounter order (as defined in the Ordering section of the `java.util.stream` Javadoc), that order is preserved, but entries are <a href="ImmutableMultimap.html#iteration">grouped by key</a>.

 <p>Example:

 <pre>`static final Multimap<Character, String> FIRST_LETTER_MULTIMAP =
     Stream.of("banana", "apple", "carrot", "asparagus", "cherry")
         .collect(toImmutableSetMultimap(str -> str.charAt(0), str -> str.substring(1)));

 // is equivalent to

 static final Multimap<Character, String> FIRST_LETTER_MULTIMAP =
     new ImmutableSetMultimap.Builder<Character, String>()
         .put('b', "anana")
         .putAll('a', "pple", "sparagus")
         .putAll('c', "arrot", "herry")
         .build();
 `</pre>
**Since:** 21.0

### `flatteningToImmutableSetMultimap(`java.util.function.Function<? super T,? extends K>` keyFunction, `java.util.function.Function<? super T,? extends java.util.stream.Stream<? extends V>>` valuesFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSetMultimap<K,V>>`

Returns a `Collector` accumulating entries into an `ImmutableSetMultimap`. Each
 input element is mapped to a key and a stream of values, each of which are put into the
 resulting `Multimap`, in the encounter order of the stream and the encounter order of the
 streams of values.

 <p>Example:

 <pre>`static final ImmutableSetMultimap<Character, Character> FIRST_LETTER_MULTIMAP =
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
 `
 }</pre>
**Since:** 21.0

### `of()`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

Returns the empty multimap.

 <p><b>Performance note:</b> the instance returned is a singleton.

### `of(`K` k1, `V` v1)`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

Returns an immutable multimap containing a single entry.

### `of(`K` k1, `V` v1, `K` k2, `V` v2)`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

Returns an immutable multimap containing the given entries, in order. Repeated occurrences of
 an entry (according to `Object.equals`) after the first are ignored.

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3)`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

Returns an immutable multimap containing the given entries, in order. Repeated occurrences of
 an entry (according to `Object.equals`) after the first are ignored.

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4)`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

Returns an immutable multimap containing the given entries, in order. Repeated occurrences of
 an entry (according to `Object.equals`) after the first are ignored.

### `of(`K` k1, `V` v1, `K` k2, `V` v2, `K` k3, `V` v3, `K` k4, `V` v4, `K` k5, `V` v5)`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

Returns an immutable multimap containing the given entries, in order. Repeated occurrences of
 an entry (according to `Object.equals`) after the first are ignored.

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap.Builder<K,V>`](ImmutableSetMultimap/Builder.md)

Returns a new `Builder`.

### `copyOf([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md) multimap)`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

Returns an immutable set multimap containing the same mappings as `multimap`. The
 generated multimap's key and value orderings correspond to the iteration ordering of the `multimap.asMap()` view. Repeated occurrences of an entry in the multimap after the first are
 ignored.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.
@throws NullPointerException if any key or value in `multimap` is null

### `copyOf([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md) multimap, `java.util.Comparator<? super V>` valueComparator)`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

### `copyOf(`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>` entries)`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

Returns an immutable multimap containing the specified entries. The returned multimap iterates
 over keys in the order they were first encountered in the input, and the values for each key
 are iterated in the order they were encountered. If two values for the same key are equal, the first value encountered is used.
@throws NullPointerException if any key, value, or entry is null
**Since:** 19.0

### `fromMapEntries(`java.util.Collection<? extends java.util.Map.Entry<? extends K,? extends java.util.Collection<? extends V>>>` mapEntries, `java.util.Comparator<? super V>` valueComparator)`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<K,V>`](./ImmutableSetMultimap.md)

Creates an ImmutableSetMultimap from an asMap.entrySet.

### `get(`K` key)`

**Returns:** [`com.google.common.collect.ImmutableSet<V>`](./ImmutableSet.md)

Returns an immutable set of the values for the given key. If no mappings in the multimap have
 the provided key, an empty immutable set is returned. The values are in the same order as the
 parameters used to build this multimap.

### `inverse()`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<V,K>`](./ImmutableSetMultimap.md)

{@inheritDoc}

 <p>Because an inverse of a set multimap cannot contain multiple pairs with the same key and
 value, this method returns an `ImmutableSetMultimap` rather than the `ImmutableMultimap` specified in the `ImmutableMultimap` class.

### `invert()`

**Returns:** [`com.google.common.collect.ImmutableSetMultimap<V,K>`](./ImmutableSetMultimap.md)

### `removeAll(`java.lang.Object` key)`

**Returns:** [`com.google.common.collect.ImmutableSet<V>`](./ImmutableSet.md)

Guaranteed to throw an exception and leave the multimap unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `replaceValues(`K` key, `java.lang.Iterable<? extends V>` values)`

**Returns:** [`com.google.common.collect.ImmutableSet<V>`](./ImmutableSet.md)

Guaranteed to throw an exception and leave the multimap unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `entries()`

**Returns:** [`com.google.common.collect.ImmutableSet<java.util.Map.Entry<K,V>>`](./ImmutableSet>.md)

Returns an immutable collection of all key-value pairs in the multimap. Its iterator traverses
 the values for the first key, the values for the second key, and so on.

### `valueSet(`java.util.Comparator<? super V>` valueComparator, `java.util.Collection<? extends V>` values)`

**Returns:** [`com.google.common.collect.ImmutableSet<V>`](./ImmutableSet.md)

### `emptySet(`java.util.Comparator<? super V>` valueComparator)`

**Returns:** [`com.google.common.collect.ImmutableSet<V>`](./ImmutableSet.md)

### `valuesBuilder(`java.util.Comparator<? super V>` valueComparator)`

**Returns:** [`com.google.common.collect.ImmutableSet.Builder<V>`](ImmutableSet/Builder.md)

### `writeObject(`java.io.ObjectOutputStream` stream)`

**Returns:** `void`

@serialData number of distinct keys, and then for each distinct key: the key, the number of
     values for that key, and the key's values

### `valueComparator()`

**Returns:** `java.util.Comparator<? super V>`

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

