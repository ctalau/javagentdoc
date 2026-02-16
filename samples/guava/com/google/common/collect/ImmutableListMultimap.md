# Class: `ImmutableListMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableListMultimap`

**Extends:** [`com.google.common.collect.ImmutableMultimap<K,V>`](./ImmutableMultimap.md)

**Implements:** [`com.google.common.collect.ListMultimap<K,V>`](./ListMultimap.md)

## Type Parameters

- `K` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

A {@link ListMultimap} whose contents will never change, with many other important properties
 detailed at {@link ImmutableCollection}.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/ImmutableCollectionsExplained">immutable collections</a>.
@author Jared Levy
@since 2.0

## Fields

### `inverse`

**Type:** [`com.google.common.collect.ImmutableListMultimap<V,K>`](./ImmutableListMultimap.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`com.google.common.collect.ImmutableMap<K,com.google.common.collect.ImmutableList<V>>`](./ImmutableMap>.md) map, `int` size)`

## Methods

### `toImmutableListMultimap([`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableListMultimap<K,V>>`](../../../../java/util/stream/Collector>.md)

Returns a {@link Collector} that accumulates elements into an {@code ImmutableListMultimap}
 whose keys and values are the result of applying the provided mapping functions to the input
 elements.

 <p>For streams with defined encounter order (as defined in the Ordering section of the {@link java.util.stream} Javadoc), that order is preserved, but entries are <a href="ImmutableMultimap.html#iteration">grouped by key</a>.

 <p>Example:

 <pre>{@code
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
 }</pre>
@since 21.0

### `flatteningToImmutableListMultimap([`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends java.util.stream.Stream<? extends V>>`](../../../../java/util/function/Function>.md) valuesFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableListMultimap<K,V>>`](../../../../java/util/stream/Collector>.md)

Returns a {@code Collector} accumulating entries into an {@code ImmutableListMultimap}. Each
 input element is mapped to a key and a stream of values, each of which are put into the
 resulting {@code Multimap}, in the encounter order of the stream and the encounter order of the
 streams of values.

 <p>Example:

 <pre>{@code
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
 }</pre>
@since 21.0

### `of()`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

Returns the empty multimap.

 <p><b>Performance note:</b> the instance returned is a singleton.

### `of([`K`](K.md) k1, [`V`](V.md) v1)`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

Returns an immutable multimap containing a single entry.

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2)`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

Returns an immutable multimap containing the given entries, in order.

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3)`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

Returns an immutable multimap containing the given entries, in order.

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4)`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

Returns an immutable multimap containing the given entries, in order.

### `of([`K`](K.md) k1, [`V`](V.md) v1, [`K`](K.md) k2, [`V`](V.md) v2, [`K`](K.md) k3, [`V`](V.md) v3, [`K`](K.md) k4, [`V`](V.md) v4, [`K`](K.md) k5, [`V`](V.md) v5)`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

Returns an immutable multimap containing the given entries, in order.

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableListMultimap.Builder<K,V>`](ImmutableListMultimap/Builder.md)

Returns a new builder. The generated builder is equivalent to the builder created by the {@link Builder} constructor.

### `copyOf([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md) multimap)`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

Returns an immutable multimap containing the same mappings as {@code multimap}. The generated
 multimap's key and value orderings correspond to the iteration ordering of the {@code
 multimap.asMap()} view.

 <p>Despite the method name, this method attempts to avoid actually copying the data when it is
 safe to do so. The exact circumstances under which a copy will or will not be performed are
 undocumented and subject to change.
@throws NullPointerException if any key or value in {@code multimap} is null

### `copyOf(`java.lang.Iterable<? extends java.util.Map.Entry<? extends K,? extends V>>` entries)`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

Returns an immutable multimap containing the specified entries. The returned multimap iterates
 over keys in the order they were first encountered in the input, and the values for each key
 are iterated in the order they were encountered.
@throws NullPointerException if any key, value, or entry is null
@since 19.0

### `fromMapEntries([`java.util.Collection<? extends java.util.Map.Entry<? extends K,? extends java.util.Collection<? extends V>>>`](../../../../java/util/Collection>>.md) mapEntries, [`java.util.Comparator<? super V>`](../../../../java/util/Comparator.md) valueComparator)`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<K,V>`](./ImmutableListMultimap.md)

Creates an ImmutableListMultimap from an asMap.entrySet.

### `get([`K`](K.md) key)`

**Returns:** [`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md)

Returns an immutable list of the values for the given key. If no mappings in the multimap have
 the provided key, an empty immutable list is returned. The values are in the same order as the
 parameters used to build this multimap.

### `inverse()`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<V,K>`](./ImmutableListMultimap.md)

{@inheritDoc}

 <p>Because an inverse of a list multimap can contain multiple pairs with the same key and
 value, this method returns an {@code ImmutableListMultimap} rather than the {@code
 ImmutableMultimap} specified in the {@code ImmutableMultimap} class.
@since 11.0

### `invert()`

**Returns:** [`com.google.common.collect.ImmutableListMultimap<V,K>`](./ImmutableListMultimap.md)

### `removeAll(`java.lang.Object` key)`

**Returns:** [`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md)

Guaranteed to throw an exception and leave the multimap unmodified.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `replaceValues([`K`](K.md) key, `java.lang.Iterable<? extends V>` values)`

**Returns:** [`com.google.common.collect.ImmutableList<V>`](./ImmutableList.md)

Guaranteed to throw an exception and leave the multimap unmodified.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `writeObject([`java.io.ObjectOutputStream`](../../../../java/io/ObjectOutputStream.md) stream)`

**Returns:** `void`

@serialData number of distinct keys, and then for each distinct key: the key, the number of
     values for that key, and the key's values

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

