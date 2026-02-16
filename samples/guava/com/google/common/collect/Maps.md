# Class: `Maps`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Maps`

## Description

Static utility methods pertaining to {@link Map} instances (including instances of {@link SortedMap}, {@link BiMap}, etc.). Also see this class's counterparts {@link Lists}, {@link Sets}
 and {@link Queues}.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/CollectionUtilitiesExplained#maps">{@code Maps}</a>.
@author Kevin Bourrillion
@author Mike Bostock
@author Isaac Shum
@author Louis Wasserman
@since 2.0

## Constructors

### `<init>()`

## Methods

### `keyFunction()`

**Returns:** [`com.google.common.base.Function<java.util.Map.Entry<K,?>,K>`](../base/Function,K>.md)

### `valueFunction()`

**Returns:** [`com.google.common.base.Function<java.util.Map.Entry<?,V>,V>`](../base/Function,V>.md)

### `keyIterator([`java.util.Iterator<java.util.Map.Entry<K,V>>`](../../../../java/util/Iterator>.md) entryIterator)`

**Returns:** [`java.util.Iterator<K>`](../../../../java/util/Iterator.md)

### `valueIterator([`java.util.Iterator<java.util.Map.Entry<K,V>>`](../../../../java/util/Iterator>.md) entryIterator)`

**Returns:** [`java.util.Iterator<V>`](../../../../java/util/Iterator.md)

### `immutableEnumMap([`java.util.Map<K,? extends V>`](../../../../java/util/Map.md) map)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns an immutable map instance containing the given entries. Internally, the returned map
 will be backed by an {@link EnumMap}.

 <p>The iteration order of the returned map follows the enum's iteration order, not the order in
 which the elements appear in the given map.
@param map the map to make an immutable copy of
@return an immutable map containing those entries
@since 14.0

### `toImmutableEnumMap([`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`](../../../../java/util/stream/Collector>.md)

Returns a {@link Collector} that accumulates elements into an {@code ImmutableMap} whose keys
 and values are the result of applying the provided mapping functions to the input elements. The
 resulting implementation is specialized for enum key types. The returned map and its views will
 iterate over keys in their enum definition order, not encounter order.

 <p>If the mapped keys contain duplicates, an {@code IllegalArgumentException} is thrown when
 the collection operation is performed. (This differs from the {@code Collector} returned by
 {@link java.util.stream.Collectors#toMap(java.util.function.Function,
 java.util.function.Function) Collectors.toMap(Function, Function)}, which throws an {@code
 IllegalStateException}.)
@since 21.0

### `toImmutableEnumMap([`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction, [`java.util.function.BinaryOperator<V>`](../../../../java/util/function/BinaryOperator.md) mergeFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`](../../../../java/util/stream/Collector>.md)

Returns a {@link Collector} that accumulates elements into an {@code ImmutableMap} whose keys
 and values are the result of applying the provided mapping functions to the input elements. The
 resulting implementation is specialized for enum key types. The returned map and its views will
 iterate over keys in their enum definition order, not encounter order.

 <p>If the mapped keys contain duplicates, the values are merged using the specified merging
 function.
@since 21.0

### `newHashMap()`

**Returns:** [`java.util.HashMap<K,V>`](../../../../java/util/HashMap.md)

Creates a <i>mutable</i>, empty {@code HashMap} instance.

 <p><b>Note:</b> if mutability is not required, use {@link ImmutableMap#of()} instead.

 <p><b>Note:</b> if {@code K} is an {@code enum} type, use {@link #newEnumMap} instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the {@code HashMap} constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@return a new, empty {@code HashMap}

### `newHashMap([`java.util.Map<? extends K,? extends V>`](../../../../java/util/Map.md) map)`

**Returns:** [`java.util.HashMap<K,V>`](../../../../java/util/HashMap.md)

Creates a <i>mutable</i> {@code HashMap} instance with the same mappings as the specified map.

 <p><b>Note:</b> if mutability is not required, use {@link ImmutableMap#copyOf(Map)} instead.

 <p><b>Note:</b> if {@code K} is an {@link Enum} type, use {@link #newEnumMap} instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the {@code HashMap} constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@param map the mappings to be placed in the new map
@return a new {@code HashMap} initialized with the mappings from {@code map}

### `newHashMapWithExpectedSize(`int` expectedSize)`

**Returns:** [`java.util.HashMap<K,V>`](../../../../java/util/HashMap.md)

Creates a {@code HashMap} instance, with a high enough "initial capacity" that it <i>should</i>
 hold {@code expectedSize} elements without growth. This behavior cannot be broadly guaranteed,
 but it is observed to be true for OpenJDK 1.7. It also can't be guaranteed that the method
 isn't inadvertently <i>oversizing</i> the returned map.
@param expectedSize the number of entries you expect to add to the returned map
@return a new, empty {@code HashMap} with enough capacity to hold {@code expectedSize} entries
     without resizing
@throws IllegalArgumentException if {@code expectedSize} is negative

### `capacity(`int` expectedSize)`

**Returns:** `int`

Returns a capacity that is sufficient to keep the map from being resized as long as it grows no
 larger than expectedSize and the load factor is \u2265 its default (0.75).

### `newLinkedHashMap()`

**Returns:** [`java.util.LinkedHashMap<K,V>`](../../../../java/util/LinkedHashMap.md)

Creates a <i>mutable</i>, empty, insertion-ordered {@code LinkedHashMap} instance.

 <p><b>Note:</b> if mutability is not required, use {@link ImmutableMap#of()} instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the {@code LinkedHashMap} constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@return a new, empty {@code LinkedHashMap}

### `newLinkedHashMap([`java.util.Map<? extends K,? extends V>`](../../../../java/util/Map.md) map)`

**Returns:** [`java.util.LinkedHashMap<K,V>`](../../../../java/util/LinkedHashMap.md)

Creates a <i>mutable</i>, insertion-ordered {@code LinkedHashMap} instance with the same
 mappings as the specified map.

 <p><b>Note:</b> if mutability is not required, use {@link ImmutableMap#copyOf(Map)} instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the {@code LinkedHashMap} constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@param map the mappings to be placed in the new map
@return a new, {@code LinkedHashMap} initialized with the mappings from {@code map}

### `newLinkedHashMapWithExpectedSize(`int` expectedSize)`

**Returns:** [`java.util.LinkedHashMap<K,V>`](../../../../java/util/LinkedHashMap.md)

Creates a {@code LinkedHashMap} instance, with a high enough "initial capacity" that it
 <i>should</i> hold {@code expectedSize} elements without growth. This behavior cannot be
 broadly guaranteed, but it is observed to be true for OpenJDK 1.7. It also can't be guaranteed
 that the method isn't inadvertently <i>oversizing</i> the returned map.
@param expectedSize the number of entries you expect to add to the returned map
@return a new, empty {@code LinkedHashMap} with enough capacity to hold {@code expectedSize}
     entries without resizing
@throws IllegalArgumentException if {@code expectedSize} is negative
@since 19.0

### `newConcurrentMap()`

**Returns:** [`java.util.concurrent.ConcurrentMap<K,V>`](../../../../java/util/concurrent/ConcurrentMap.md)

Creates a new empty {@link ConcurrentHashMap} instance.
@since 3.0

### `newTreeMap()`

**Returns:** [`java.util.TreeMap<K,V>`](../../../../java/util/TreeMap.md)

Creates a <i>mutable</i>, empty {@code TreeMap} instance using the natural ordering of its
 elements.

 <p><b>Note:</b> if mutability is not required, use {@link ImmutableSortedMap#of()} instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the {@code TreeMap} constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@return a new, empty {@code TreeMap}

### `newTreeMap([`java.util.SortedMap<K,? extends V>`](../../../../java/util/SortedMap.md) map)`

**Returns:** [`java.util.TreeMap<K,V>`](../../../../java/util/TreeMap.md)

Creates a <i>mutable</i> {@code TreeMap} instance with the same mappings as the specified map
 and using the same ordering as the specified map.

 <p><b>Note:</b> if mutability is not required, use {@link ImmutableSortedMap#copyOfSorted(SortedMap)} instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the {@code TreeMap} constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@param map the sorted map whose mappings are to be placed in the new map and whose comparator
     is to be used to sort the new map
@return a new {@code TreeMap} initialized with the mappings from {@code map} and using the
     comparator of {@code map}

### `newTreeMap([`java.util.Comparator<C>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`java.util.TreeMap<K,V>`](../../../../java/util/TreeMap.md)

Creates a <i>mutable</i>, empty {@code TreeMap} instance using the given comparator.

 <p><b>Note:</b> if mutability is not required, use {@code
 ImmutableSortedMap.orderedBy(comparator).build()} instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the {@code TreeMap} constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@param comparator the comparator to sort the keys with
@return a new, empty {@code TreeMap}

### `newEnumMap(`java.lang.Class<K>` type)`

**Returns:** [`java.util.EnumMap<K,V>`](../../../../java/util/EnumMap.md)

Creates an {@code EnumMap} instance.
@param type the key type for this map
@return a new, empty {@code EnumMap}

### `newEnumMap([`java.util.Map<K,? extends V>`](../../../../java/util/Map.md) map)`

**Returns:** [`java.util.EnumMap<K,V>`](../../../../java/util/EnumMap.md)

Creates an {@code EnumMap} with the same mappings as the specified map.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the {@code EnumMap} constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@param map the map from which to initialize this {@code EnumMap}
@return a new {@code EnumMap} initialized with the mappings from {@code map}
@throws IllegalArgumentException if {@code m} is not an {@code EnumMap} instance and contains
     no mappings

### `newIdentityHashMap()`

**Returns:** [`java.util.IdentityHashMap<K,V>`](../../../../java/util/IdentityHashMap.md)

Creates an {@code IdentityHashMap} instance.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the {@code IdentityHashMap} constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@return a new, empty {@code IdentityHashMap}

### `difference([`java.util.Map<? extends K,? extends V>`](../../../../java/util/Map.md) left, [`java.util.Map<? extends K,? extends V>`](../../../../java/util/Map.md) right)`

**Returns:** [`com.google.common.collect.MapDifference<K,V>`](./MapDifference.md)

Computes the difference between two maps. This difference is an immutable snapshot of the state
 of the maps at the time this method is called. It will never change, even if the maps change at
 a later time.

 <p>Since this method uses {@code HashMap} instances internally, the keys of the supplied maps
 must be well-behaved with respect to {@link Object#equals} and {@link Object#hashCode}.

 <p><b>Note:</b>If you only need to know whether two maps have the same mappings, call {@code
 left.equals(right)} instead of this method.
@param left the map to treat as the "left" map for purposes of comparison
@param right the map to treat as the "right" map for purposes of comparison
@return the difference between the two maps

### `difference([`java.util.Map<? extends K,? extends V>`](../../../../java/util/Map.md) left, [`java.util.Map<? extends K,? extends V>`](../../../../java/util/Map.md) right, [`com.google.common.base.Equivalence<? super @org.checkerframework.checker.nullness.qual.NonNull V>`](../base/Equivalence.md) valueEquivalence)`

**Returns:** [`com.google.common.collect.MapDifference<K,V>`](./MapDifference.md)

Computes the difference between two maps. This difference is an immutable snapshot of the state
 of the maps at the time this method is called. It will never change, even if the maps change at
 a later time.

 <p>Since this method uses {@code HashMap} instances internally, the keys of the supplied maps
 must be well-behaved with respect to {@link Object#equals} and {@link Object#hashCode}.
@param left the map to treat as the "left" map for purposes of comparison
@param right the map to treat as the "right" map for purposes of comparison
@param valueEquivalence the equivalence relationship to use to compare values
@return the difference between the two maps
@since 10.0

### `difference([`java.util.SortedMap<K,? extends V>`](../../../../java/util/SortedMap.md) left, [`java.util.Map<? extends K,? extends V>`](../../../../java/util/Map.md) right)`

**Returns:** [`com.google.common.collect.SortedMapDifference<K,V>`](./SortedMapDifference.md)

Computes the difference between two sorted maps, using the comparator of the left map, or
 {@code Ordering.natural()} if the left map uses the natural ordering of its elements. This
 difference is an immutable snapshot of the state of the maps at the time this method is called.
 It will never change, even if the maps change at a later time.

 <p>Since this method uses {@code TreeMap} instances internally, the keys of the right map must
 all compare as distinct according to the comparator of the left map.

 <p><b>Note:</b>If you only need to know whether two sorted maps have the same mappings, call
 {@code left.equals(right)} instead of this method.
@param left the map to treat as the "left" map for purposes of comparison
@param right the map to treat as the "right" map for purposes of comparison
@return the difference between the two maps
@since 11.0

### `doDifference([`java.util.Map<? extends K,? extends V>`](../../../../java/util/Map.md) left, [`java.util.Map<? extends K,? extends V>`](../../../../java/util/Map.md) right, [`com.google.common.base.Equivalence<? super @org.checkerframework.checker.nullness.qual.NonNull V>`](../base/Equivalence.md) valueEquivalence, [`java.util.Map<K,V>`](../../../../java/util/Map.md) onlyOnLeft, [`java.util.Map<K,V>`](../../../../java/util/Map.md) onlyOnRight, [`java.util.Map<K,V>`](../../../../java/util/Map.md) onBoth, [`java.util.Map<K,com.google.common.collect.MapDifference.ValueDifference<V>>`](../../../../java/util/Map>.md) differences)`

**Returns:** `void`

### `unmodifiableMap([`java.util.Map<K,? extends V>`](../../../../java/util/Map.md) map)`

**Returns:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

### `orNaturalOrder([`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md)

Returns the specified comparator if not null; otherwise returns {@code Ordering.natural()}.
 This method is an abomination of generics; the only purpose of this method is to contain the
 ugly type-casting in one place.

### `asMap([`java.util.Set<K>`](../../../../java/util/Set.md) set, [`com.google.common.base.Function<? super K,V>`](../base/Function.md) function)`

**Returns:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

Returns a live {@link Map} view whose keys are the contents of {@code set} and whose values are
 computed on demand using {@code function}. To get an immutable <i>copy</i> instead, use {@link #toMap(Iterable, Function)}.

 <p>Specifically, for each {@code k} in the backing set, the returned map has an entry mapping
 {@code k} to {@code function.apply(k)}. The {@code keySet}, {@code values}, and {@code
 entrySet} views of the returned map iterate in the same order as the backing set.

 <p>Modifications to the backing set are read through to the returned map. The returned map
 supports removal operations if the backing set does. Removal operations write through to the
 backing set. The returned map does not support put operations.

 <p><b>Warning:</b> If the function rejects {@code null}, caution is required to make sure the
 set does not contain {@code null}, because the view cannot stop {@code null} from being added
 to the set.

 <p><b>Warning:</b> This method assumes that for any instance {@code k} of key type {@code K},
 {@code k.equals(k2)} implies that {@code k2} is also of type {@code K}. Using a key type for
 which this may not hold, such as {@code ArrayList}, may risk a {@code ClassCastException} when
 calling methods on the resulting map view.
@since 14.0

### `asMap([`java.util.SortedSet<K>`](../../../../java/util/SortedSet.md) set, [`com.google.common.base.Function<? super K,V>`](../base/Function.md) function)`

**Returns:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

Returns a view of the sorted set as a map, mapping keys from the set according to the specified
 function.

 <p>Specifically, for each {@code k} in the backing set, the returned map has an entry mapping
 {@code k} to {@code function.apply(k)}. The {@code keySet}, {@code values}, and {@code
 entrySet} views of the returned map iterate in the same order as the backing set.

 <p>Modifications to the backing set are read through to the returned map. The returned map
 supports removal operations if the backing set does. Removal operations write through to the
 backing set. The returned map does not support put operations.

 <p><b>Warning:</b> If the function rejects {@code null}, caution is required to make sure the
 set does not contain {@code null}, because the view cannot stop {@code null} from being added
 to the set.

 <p><b>Warning:</b> This method assumes that for any instance {@code k} of key type {@code K},
 {@code k.equals(k2)} implies that {@code k2} is also of type {@code K}. Using a key type for
 which this may not hold, such as {@code ArrayList}, may risk a {@code ClassCastException} when
 calling methods on the resulting map view.
@since 14.0

### `asMap([`java.util.NavigableSet<K>`](../../../../java/util/NavigableSet.md) set, [`com.google.common.base.Function<? super K,V>`](../base/Function.md) function)`

**Returns:** [`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md)

Returns a view of the navigable set as a map, mapping keys from the set according to the
 specified function.

 <p>Specifically, for each {@code k} in the backing set, the returned map has an entry mapping
 {@code k} to {@code function.apply(k)}. The {@code keySet}, {@code values}, and {@code
 entrySet} views of the returned map iterate in the same order as the backing set.

 <p>Modifications to the backing set are read through to the returned map. The returned map
 supports removal operations if the backing set does. Removal operations write through to the
 backing set. The returned map does not support put operations.

 <p><b>Warning:</b> If the function rejects {@code null}, caution is required to make sure the
 set does not contain {@code null}, because the view cannot stop {@code null} from being added
 to the set.

 <p><b>Warning:</b> This method assumes that for any instance {@code k} of key type {@code K},
 {@code k.equals(k2)} implies that {@code k2} is also of type {@code K}. Using a key type for
 which this may not hold, such as {@code ArrayList}, may risk a {@code ClassCastException} when
 calling methods on the resulting map view.
@since 14.0

### `asMapEntryIterator([`java.util.Set<K>`](../../../../java/util/Set.md) set, [`com.google.common.base.Function<? super K,V>`](../base/Function.md) function)`

**Returns:** [`java.util.Iterator<java.util.Map.Entry<K,V>>`](../../../../java/util/Iterator>.md)

### `removeOnlySet([`java.util.Set<E>`](../../../../java/util/Set.md) set)`

**Returns:** [`java.util.Set<E>`](../../../../java/util/Set.md)

### `removeOnlySortedSet([`java.util.SortedSet<E>`](../../../../java/util/SortedSet.md) set)`

**Returns:** [`java.util.SortedSet<E>`](../../../../java/util/SortedSet.md)

### `removeOnlyNavigableSet([`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md) set)`

**Returns:** [`java.util.NavigableSet<E>`](../../../../java/util/NavigableSet.md)

### `toMap(`java.lang.Iterable<K>` keys, [`com.google.common.base.Function<? super K,V>`](../base/Function.md) valueFunction)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns an immutable map whose keys are the distinct elements of {@code keys} and whose value
 for each key was computed by {@code valueFunction}. The map's iteration order is the order of
 the first appearance of each key in {@code keys}.

 <p>When there are multiple instances of a key in {@code keys}, it is unspecified whether {@code
 valueFunction} will be applied to more than one instance of that key and, if it is, which
 result will be mapped to that key in the returned map.

 <p>If {@code keys} is a {@link Set}, a live view can be obtained instead of a copy using {@link Maps#asMap(Set, Function)}.
@throws NullPointerException if any element of {@code keys} is {@code null}, or if {@code
     valueFunction} produces {@code null} for any key
@since 14.0

### `toMap([`java.util.Iterator<K>`](../../../../java/util/Iterator.md) keys, [`com.google.common.base.Function<? super K,V>`](../base/Function.md) valueFunction)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns an immutable map whose keys are the distinct elements of {@code keys} and whose value
 for each key was computed by {@code valueFunction}. The map's iteration order is the order of
 the first appearance of each key in {@code keys}.

 <p>When there are multiple instances of a key in {@code keys}, it is unspecified whether {@code
 valueFunction} will be applied to more than one instance of that key and, if it is, which
 result will be mapped to that key in the returned map.
@throws NullPointerException if any element of {@code keys} is {@code null}, or if {@code
     valueFunction} produces {@code null} for any key
@since 14.0

### `uniqueIndex(`java.lang.Iterable<V>` values, [`com.google.common.base.Function<? super V,K>`](../base/Function.md) keyFunction)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns a map with the given {@code values}, indexed by keys derived from those values. In
 other words, each input value produces an entry in the map whose key is the result of applying
 {@code keyFunction} to that value. These entries appear in the same order as the input values.
 Example usage:

 <pre>{@code
 Color red = new Color("red", 255, 0, 0);
 ...
 ImmutableSet<Color> allColors = ImmutableSet.of(red, green, blue);

 ImmutableMap<String, Color> colorForName =
     uniqueIndex(allColors, c -> c.toString());
 assertThat(colorForName).containsEntry("red", red);
 }</pre>

 <p>If your index may associate multiple values with each key, use {@link Multimaps#index(Iterable, Function) Multimaps.index}.

 <p><b>Note:</b> on Java 8 and later, it is usually better to use streams. For example:

 <pre>{@code
 import static com.google.common.collect.ImmutableMap.toImmutableMap;
 ...
 ImmutableMap<String, Color> colorForName =
     allColors.stream().collect(toImmutableMap(c -> c.toString(), c -> c));
 }</pre>

 <p>Streams provide a more standard and flexible API and the lambdas make it clear what the keys
 and values in the map are.
@param values the values to use when constructing the {@code Map}
@param keyFunction the function used to produce the key for each value
@return a map mapping the result of evaluating the function {@code keyFunction} on each value
     in the input collection to that value
@throws IllegalArgumentException if {@code keyFunction} produces the same key for more than one
     value in the input collection
@throws NullPointerException if any element of {@code values} is {@code null}, or if {@code
     keyFunction} produces {@code null} for any value

### `uniqueIndex([`java.util.Iterator<V>`](../../../../java/util/Iterator.md) values, [`com.google.common.base.Function<? super V,K>`](../base/Function.md) keyFunction)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns a map with the given {@code values}, indexed by keys derived from those values. In
 other words, each input value produces an entry in the map whose key is the result of applying
 {@code keyFunction} to that value. These entries appear in the same order as the input values.
 Example usage:

 <pre>{@code
 Color red = new Color("red", 255, 0, 0);
 ...
 Iterator<Color> allColors = ImmutableSet.of(red, green, blue).iterator();

 Map<String, Color> colorForName =
     uniqueIndex(allColors, toStringFunction());
 assertThat(colorForName).containsEntry("red", red);
 }</pre>

 <p>If your index may associate multiple values with each key, use {@link Multimaps#index(Iterator, Function) Multimaps.index}.
@param values the values to use when constructing the {@code Map}
@param keyFunction the function used to produce the key for each value
@return a map mapping the result of evaluating the function {@code keyFunction} on each value
     in the input collection to that value
@throws IllegalArgumentException if {@code keyFunction} produces the same key for more than one
     value in the input collection
@throws NullPointerException if any element of {@code values} is {@code null}, or if {@code
     keyFunction} produces {@code null} for any value
@since 10.0

### `uniqueIndex([`java.util.Iterator<V>`](../../../../java/util/Iterator.md) values, [`com.google.common.base.Function<? super V,K>`](../base/Function.md) keyFunction, [`com.google.common.collect.ImmutableMap.Builder<K,V>`](ImmutableMap/Builder.md) builder)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

### `fromProperties([`java.util.Properties`](../../../../java/util/Properties.md) properties)`

**Returns:** [`com.google.common.collect.ImmutableMap<java.lang.String,java.lang.String>`](./ImmutableMap.md)

Creates an {@code ImmutableMap<String, String>} from a {@code Properties} instance. Properties
 normally derive from {@code Map<Object, Object>}, but they typically contain strings, which is
 awkward. This method lets you get a plain-old-{@code Map} out of a {@code Properties}.
@param properties a {@code Properties} object to be converted
@return an immutable map containing all the entries in {@code properties}
@throws ClassCastException if any key in {@code properties} is not a {@code String}
@throws NullPointerException if any key or value in {@code properties} is null

### `immutableEntry([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

Returns an immutable map entry with the specified key and value. The {@link Entry#setValue}
 operation throws an {@link UnsupportedOperationException}.

 <p>The returned entry is serializable.

 <p><b>Java 9 users:</b> consider using {@code java.util.Map.entry(key, value)} if the key and
 value are non-null and the entry does not need to be serializable.
@param key the key to be associated with the returned entry
@param value the value to be associated with the returned entry

### `unmodifiableEntrySet([`java.util.Set<java.util.Map.Entry<K,V>>`](../../../../java/util/Set>.md) entrySet)`

**Returns:** [`java.util.Set<java.util.Map.Entry<K,V>>`](../../../../java/util/Set>.md)

Returns an unmodifiable view of the specified set of entries. The {@link Entry#setValue}
 operation throws an {@link UnsupportedOperationException}, as do any operations that would
 modify the returned set.
@param entrySet the entries for which to return an unmodifiable view
@return an unmodifiable view of the entries

### `unmodifiableEntry([`java.util.Map.Entry<? extends K,? extends V>`](../../../../java/util/Map/Entry.md) entry)`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

Returns an unmodifiable view of the specified map entry. The {@link Entry#setValue} operation
 throws an {@link UnsupportedOperationException}. This also has the side effect of redefining
 {@code equals} to comply with the Entry contract, to avoid a possible nefarious implementation
 of equals.
@param entry the entry for which to return an unmodifiable view
@return an unmodifiable view of the entry

### `unmodifiableEntryIterator([`java.util.Iterator<java.util.Map.Entry<K,V>>`](../../../../java/util/Iterator>.md) entryIterator)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K,V>>`](./UnmodifiableIterator>.md)

### `asConverter([`com.google.common.collect.BiMap<A,B>`](./BiMap.md) bimap)`

**Returns:** [`com.google.common.base.Converter<A,B>`](../base/Converter.md)

Returns a {@link Converter} that converts values using {@link BiMap#get bimap.get()}, and whose
 inverse view converts values using {@link BiMap#inverse bimap.inverse()}{@code .get()}.

 <p>To use a plain {@link Map} as a {@link Function}, see {@link com.google.common.base.Functions#forMap(Map)} or {@link com.google.common.base.Functions#forMap(Map, Object)}.
@since 16.0

### `synchronizedBiMap([`com.google.common.collect.BiMap<K,V>`](./BiMap.md) bimap)`

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

Returns a synchronized (thread-safe) bimap backed by the specified bimap. In order to guarantee
 serial access, it is critical that <b>all</b> access to the backing bimap is accomplished
 through the returned bimap.

 <p>It is imperative that the user manually synchronize on the returned map when accessing any
 of its collection views:

 <pre>{@code
 BiMap<Long, String> map = Maps.synchronizedBiMap(
     HashBiMap.<Long, String>create());
 ...
 Set<Long> set = map.keySet();  // Needn't be in synchronized block
 ...
 synchronized (map) {  // Synchronizing on map, not set!
   Iterator<Long> it = set.iterator(); // Must be in synchronized block
   while (it.hasNext()) {
     foo(it.next());
   }
 }
 }</pre>

 <p>Failure to follow this advice may result in non-deterministic behavior.

 <p>The returned bimap will be serializable if the specified bimap is serializable.
@param bimap the bimap to be wrapped in a synchronized view
@return a synchronized view of the specified bimap

### `unmodifiableBiMap([`com.google.common.collect.BiMap<? extends K,? extends V>`](./BiMap.md) bimap)`

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

Returns an unmodifiable view of the specified bimap. This method allows modules to provide
 users with "read-only" access to internal bimaps. Query operations on the returned bimap "read
 through" to the specified bimap, and attempts to modify the returned map, whether direct or via
 its collection views, result in an {@code UnsupportedOperationException}.

 <p>The returned bimap will be serializable if the specified bimap is serializable.
@param bimap the bimap for which an unmodifiable view is to be returned
@return an unmodifiable view of the specified bimap

### `transformValues([`java.util.Map<K,V1>`](../../../../java/util/Map.md) fromMap, [`com.google.common.base.Function<? super V1,V2>`](../base/Function.md) function)`

**Returns:** [`java.util.Map<K,V2>`](../../../../java/util/Map.md)

Returns a view of a map where each value is transformed by a function. All other properties of
 the map, such as iteration order, are left intact. For example, the code:

 <pre>{@code
 Map<String, Integer> map = ImmutableMap.of("a", 4, "b", 9);
 Function<Integer, Double> sqrt =
     new Function<Integer, Double>() {
       public Double apply(Integer in) {
         return Math.sqrt((int) in);
       }
     };
 Map<String, Double> transformed = Maps.transformValues(map, sqrt);
 System.out.println(transformed);
 }</pre>

 ... prints {@code {a=2.0, b=3.0}}.

 <p>Changes in the underlying map are reflected in this view. Conversely, this view supports
 removal operations, and these are reflected in the underlying map.

 <p>It's acceptable for the underlying map to contain null keys, and even null values provided
 that the function is capable of accepting null input. The transformed map might contain null
 values, if the function sometimes gives a null result.

 <p>The returned map is not thread-safe or serializable, even if the underlying map is.

 <p>The function is applied lazily, invoked when needed. This is necessary for the returned map
 to be a view, but it means that the function will be applied many times for bulk operations
 like {@link Map#containsValue} and {@code Map.toString()}. For this to perform well, {@code
 function} should be fast. To avoid lazy evaluation when the returned map doesn't need to be a
 view, copy the returned map into a new map of your choosing.

### `transformValues([`java.util.SortedMap<K,V1>`](../../../../java/util/SortedMap.md) fromMap, [`com.google.common.base.Function<? super V1,V2>`](../base/Function.md) function)`

**Returns:** [`java.util.SortedMap<K,V2>`](../../../../java/util/SortedMap.md)

Returns a view of a sorted map where each value is transformed by a function. All other
 properties of the map, such as iteration order, are left intact. For example, the code:

 <pre>{@code
 SortedMap<String, Integer> map = ImmutableSortedMap.of("a", 4, "b", 9);
 Function<Integer, Double> sqrt =
     new Function<Integer, Double>() {
       public Double apply(Integer in) {
         return Math.sqrt((int) in);
       }
     };
 SortedMap<String, Double> transformed =
      Maps.transformValues(map, sqrt);
 System.out.println(transformed);
 }</pre>

 ... prints {@code {a=2.0, b=3.0}}.

 <p>Changes in the underlying map are reflected in this view. Conversely, this view supports
 removal operations, and these are reflected in the underlying map.

 <p>It's acceptable for the underlying map to contain null keys, and even null values provided
 that the function is capable of accepting null input. The transformed map might contain null
 values, if the function sometimes gives a null result.

 <p>The returned map is not thread-safe or serializable, even if the underlying map is.

 <p>The function is applied lazily, invoked when needed. This is necessary for the returned map
 to be a view, but it means that the function will be applied many times for bulk operations
 like {@link Map#containsValue} and {@code Map.toString()}. For this to perform well, {@code
 function} should be fast. To avoid lazy evaluation when the returned map doesn't need to be a
 view, copy the returned map into a new map of your choosing.
@since 11.0

### `transformValues([`java.util.NavigableMap<K,V1>`](../../../../java/util/NavigableMap.md) fromMap, [`com.google.common.base.Function<? super V1,V2>`](../base/Function.md) function)`

**Returns:** [`java.util.NavigableMap<K,V2>`](../../../../java/util/NavigableMap.md)

Returns a view of a navigable map where each value is transformed by a function. All other
 properties of the map, such as iteration order, are left intact. For example, the code:

 <pre>{@code
 NavigableMap<String, Integer> map = Maps.newTreeMap();
 map.put("a", 4);
 map.put("b", 9);
 Function<Integer, Double> sqrt =
     new Function<Integer, Double>() {
       public Double apply(Integer in) {
         return Math.sqrt((int) in);
       }
     };
 NavigableMap<String, Double> transformed =
      Maps.transformNavigableValues(map, sqrt);
 System.out.println(transformed);
 }</pre>

 ... prints {@code {a=2.0, b=3.0}}.

 <p>Changes in the underlying map are reflected in this view. Conversely, this view supports
 removal operations, and these are reflected in the underlying map.

 <p>It's acceptable for the underlying map to contain null keys, and even null values provided
 that the function is capable of accepting null input. The transformed map might contain null
 values, if the function sometimes gives a null result.

 <p>The returned map is not thread-safe or serializable, even if the underlying map is.

 <p>The function is applied lazily, invoked when needed. This is necessary for the returned map
 to be a view, but it means that the function will be applied many times for bulk operations
 like {@link Map#containsValue} and {@code Map.toString()}. For this to perform well, {@code
 function} should be fast. To avoid lazy evaluation when the returned map doesn't need to be a
 view, copy the returned map into a new map of your choosing.
@since 13.0

### `transformEntries([`java.util.Map<K,V1>`](../../../../java/util/Map.md) fromMap, [`com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2>`](Maps/EntryTransformer.md) transformer)`

**Returns:** [`java.util.Map<K,V2>`](../../../../java/util/Map.md)

Returns a view of a map whose values are derived from the original map's entries. In contrast
 to {@link #transformValues}, this method's entry-transformation logic may depend on the key as
 well as the value.

 <p>All other properties of the transformed map, such as iteration order, are left intact. For
 example, the code:

 <pre>{@code
 Map<String, Boolean> options =
     ImmutableMap.of("verbose", true, "sort", false);
 EntryTransformer<String, Boolean, String> flagPrefixer =
     new EntryTransformer<String, Boolean, String>() {
       public String transformEntry(String key, Boolean value) {
         return value ? key : "no" + key;
       }
     };
 Map<String, String> transformed =
     Maps.transformEntries(options, flagPrefixer);
 System.out.println(transformed);
 }</pre>

 ... prints {@code {verbose=verbose, sort=nosort}}.

 <p>Changes in the underlying map are reflected in this view. Conversely, this view supports
 removal operations, and these are reflected in the underlying map.

 <p>It's acceptable for the underlying map to contain null keys and null values provided that
 the transformer is capable of accepting null inputs. The transformed map might contain null
 values if the transformer sometimes gives a null result.

 <p>The returned map is not thread-safe or serializable, even if the underlying map is.

 <p>The transformer is applied lazily, invoked when needed. This is necessary for the returned
 map to be a view, but it means that the transformer will be applied many times for bulk
 operations like {@link Map#containsValue} and {@link Object#toString}. For this to perform
 well, {@code transformer} should be fast. To avoid lazy evaluation when the returned map
 doesn't need to be a view, copy the returned map into a new map of your choosing.

 <p><b>Warning:</b> This method assumes that for any instance {@code k} of {@code
 EntryTransformer} key type {@code K}, {@code k.equals(k2)} implies that {@code k2} is also of
 type {@code K}. Using an {@code EntryTransformer} key type for which this may not hold, such as
 {@code ArrayList}, may risk a {@code ClassCastException} when calling methods on the
 transformed map.
@since 7.0

### `transformEntries([`java.util.SortedMap<K,V1>`](../../../../java/util/SortedMap.md) fromMap, [`com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2>`](Maps/EntryTransformer.md) transformer)`

**Returns:** [`java.util.SortedMap<K,V2>`](../../../../java/util/SortedMap.md)

Returns a view of a sorted map whose values are derived from the original sorted map's entries.
 In contrast to {@link #transformValues}, this method's entry-transformation logic may depend on
 the key as well as the value.

 <p>All other properties of the transformed map, such as iteration order, are left intact. For
 example, the code:

 <pre>{@code
 Map<String, Boolean> options =
     ImmutableSortedMap.of("verbose", true, "sort", false);
 EntryTransformer<String, Boolean, String> flagPrefixer =
     new EntryTransformer<String, Boolean, String>() {
       public String transformEntry(String key, Boolean value) {
         return value ? key : "yes" + key;
       }
     };
 SortedMap<String, String> transformed =
     Maps.transformEntries(options, flagPrefixer);
 System.out.println(transformed);
 }</pre>

 ... prints {@code {sort=yessort, verbose=verbose}}.

 <p>Changes in the underlying map are reflected in this view. Conversely, this view supports
 removal operations, and these are reflected in the underlying map.

 <p>It's acceptable for the underlying map to contain null keys and null values provided that
 the transformer is capable of accepting null inputs. The transformed map might contain null
 values if the transformer sometimes gives a null result.

 <p>The returned map is not thread-safe or serializable, even if the underlying map is.

 <p>The transformer is applied lazily, invoked when needed. This is necessary for the returned
 map to be a view, but it means that the transformer will be applied many times for bulk
 operations like {@link Map#containsValue} and {@link Object#toString}. For this to perform
 well, {@code transformer} should be fast. To avoid lazy evaluation when the returned map
 doesn't need to be a view, copy the returned map into a new map of your choosing.

 <p><b>Warning:</b> This method assumes that for any instance {@code k} of {@code
 EntryTransformer} key type {@code K}, {@code k.equals(k2)} implies that {@code k2} is also of
 type {@code K}. Using an {@code EntryTransformer} key type for which this may not hold, such as
 {@code ArrayList}, may risk a {@code ClassCastException} when calling methods on the
 transformed map.
@since 11.0

### `transformEntries([`java.util.NavigableMap<K,V1>`](../../../../java/util/NavigableMap.md) fromMap, [`com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2>`](Maps/EntryTransformer.md) transformer)`

**Returns:** [`java.util.NavigableMap<K,V2>`](../../../../java/util/NavigableMap.md)

Returns a view of a navigable map whose values are derived from the original navigable map's
 entries. In contrast to {@link #transformValues}, this method's entry-transformation logic may
 depend on the key as well as the value.

 <p>All other properties of the transformed map, such as iteration order, are left intact. For
 example, the code:

 <pre>{@code
 NavigableMap<String, Boolean> options = Maps.newTreeMap();
 options.put("verbose", false);
 options.put("sort", true);
 EntryTransformer<String, Boolean, String> flagPrefixer =
     new EntryTransformer<String, Boolean, String>() {
       public String transformEntry(String key, Boolean value) {
         return value ? key : ("yes" + key);
       }
     };
 NavigableMap<String, String> transformed =
     LabsMaps.transformNavigableEntries(options, flagPrefixer);
 System.out.println(transformed);
 }</pre>

 ... prints {@code {sort=yessort, verbose=verbose}}.

 <p>Changes in the underlying map are reflected in this view. Conversely, this view supports
 removal operations, and these are reflected in the underlying map.

 <p>It's acceptable for the underlying map to contain null keys and null values provided that
 the transformer is capable of accepting null inputs. The transformed map might contain null
 values if the transformer sometimes gives a null result.

 <p>The returned map is not thread-safe or serializable, even if the underlying map is.

 <p>The transformer is applied lazily, invoked when needed. This is necessary for the returned
 map to be a view, but it means that the transformer will be applied many times for bulk
 operations like {@link Map#containsValue} and {@link Object#toString}. For this to perform
 well, {@code transformer} should be fast. To avoid lazy evaluation when the returned map
 doesn't need to be a view, copy the returned map into a new map of your choosing.

 <p><b>Warning:</b> This method assumes that for any instance {@code k} of {@code
 EntryTransformer} key type {@code K}, {@code k.equals(k2)} implies that {@code k2} is also of
 type {@code K}. Using an {@code EntryTransformer} key type for which this may not hold, such as
 {@code ArrayList}, may risk a {@code ClassCastException} when calling methods on the
 transformed map.
@since 13.0

### `asEntryTransformer([`com.google.common.base.Function<? super V1,V2>`](../base/Function.md) function)`

**Returns:** [`com.google.common.collect.Maps.EntryTransformer<K,V1,V2>`](Maps/EntryTransformer.md)

Views a function as an entry transformer that ignores the entry key.

### `asValueToValueFunction([`com.google.common.collect.Maps.EntryTransformer<? super K,V1,V2>`](Maps/EntryTransformer.md) transformer, [`K`](K.md) key)`

**Returns:** [`com.google.common.base.Function<V1,V2>`](../base/Function.md)

### `asEntryToValueFunction([`com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2>`](Maps/EntryTransformer.md) transformer)`

**Returns:** [`com.google.common.base.Function<java.util.Map.Entry<K,V1>,V2>`](../base/Function,V2>.md)

Views an entry transformer as a function from {@code Entry} to values.

### `transformEntry([`com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2>`](Maps/EntryTransformer.md) transformer, [`java.util.Map.Entry<K,V1>`](../../../../java/util/Map/Entry.md) entry)`

**Returns:** [`java.util.Map.Entry<K,V2>`](../../../../java/util/Map/Entry.md)

Returns a view of an entry transformed by the specified transformer.

### `asEntryToEntryFunction([`com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2>`](Maps/EntryTransformer.md) transformer)`

**Returns:** [`com.google.common.base.Function<java.util.Map.Entry<K,V1>,java.util.Map.Entry<K,V2>>`](../base/Function,java/util/Map/Entry>.md)

Views an entry transformer as a function from entries to entries.

### `keyPredicateOnEntries([`com.google.common.base.Predicate<? super K>`](../base/Predicate.md) keyPredicate)`

**Returns:** [`com.google.common.base.Predicate<java.util.Map.Entry<K,?>>`](../base/Predicate>.md)

### `valuePredicateOnEntries([`com.google.common.base.Predicate<? super V>`](../base/Predicate.md) valuePredicate)`

**Returns:** [`com.google.common.base.Predicate<java.util.Map.Entry<?,V>>`](../base/Predicate>.md)

### `filterKeys([`java.util.Map<K,V>`](../../../../java/util/Map.md) unfiltered, [`com.google.common.base.Predicate<? super K>`](../base/Predicate.md) keyPredicate)`

**Returns:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

Returns a map containing the mappings in {@code unfiltered} whose keys satisfy a predicate. The
 returned map is a live view of {@code unfiltered}; changes to one affect the other.

 <p>The resulting map's {@code keySet()}, {@code entrySet()}, and {@code values()} views have
 iterators that don't support {@code remove()}, but all other methods are supported by the map
 and its views. When given a key that doesn't satisfy the predicate, the map's {@code put()} and
 {@code putAll()} methods throw an {@link IllegalArgumentException}.

 <p>When methods such as {@code removeAll()} and {@code clear()} are called on the filtered map
 or its views, only mappings whose keys satisfy the filter will be removed from the underlying
 map.

 <p>The returned map isn't threadsafe or serializable, even if {@code unfiltered} is.

 <p>Many of the filtered map's methods, such as {@code size()}, iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy the filtered map and use the copy.

 <p><b>Warning:</b> {@code keyPredicate} must be <i>consistent with equals</i>, as documented at
 {@link Predicate#apply}. Do not provide a predicate such as {@code
 Predicates.instanceOf(ArrayList.class)}, which is inconsistent with equals.

### `filterKeys([`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md) unfiltered, [`com.google.common.base.Predicate<? super K>`](../base/Predicate.md) keyPredicate)`

**Returns:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

Returns a sorted map containing the mappings in {@code unfiltered} whose keys satisfy a
 predicate. The returned map is a live view of {@code unfiltered}; changes to one affect the
 other.

 <p>The resulting map's {@code keySet()}, {@code entrySet()}, and {@code values()} views have
 iterators that don't support {@code remove()}, but all other methods are supported by the map
 and its views. When given a key that doesn't satisfy the predicate, the map's {@code put()} and
 {@code putAll()} methods throw an {@link IllegalArgumentException}.

 <p>When methods such as {@code removeAll()} and {@code clear()} are called on the filtered map
 or its views, only mappings whose keys satisfy the filter will be removed from the underlying
 map.

 <p>The returned map isn't threadsafe or serializable, even if {@code unfiltered} is.

 <p>Many of the filtered map's methods, such as {@code size()}, iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy the filtered map and use the copy.

 <p><b>Warning:</b> {@code keyPredicate} must be <i>consistent with equals</i>, as documented at
 {@link Predicate#apply}. Do not provide a predicate such as {@code
 Predicates.instanceOf(ArrayList.class)}, which is inconsistent with equals.
@since 11.0

### `filterKeys([`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md) unfiltered, [`com.google.common.base.Predicate<? super K>`](../base/Predicate.md) keyPredicate)`

**Returns:** [`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md)

Returns a navigable map containing the mappings in {@code unfiltered} whose keys satisfy a
 predicate. The returned map is a live view of {@code unfiltered}; changes to one affect the
 other.

 <p>The resulting map's {@code keySet()}, {@code entrySet()}, and {@code values()} views have
 iterators that don't support {@code remove()}, but all other methods are supported by the map
 and its views. When given a key that doesn't satisfy the predicate, the map's {@code put()} and
 {@code putAll()} methods throw an {@link IllegalArgumentException}.

 <p>When methods such as {@code removeAll()} and {@code clear()} are called on the filtered map
 or its views, only mappings whose keys satisfy the filter will be removed from the underlying
 map.

 <p>The returned map isn't threadsafe or serializable, even if {@code unfiltered} is.

 <p>Many of the filtered map's methods, such as {@code size()}, iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy the filtered map and use the copy.

 <p><b>Warning:</b> {@code keyPredicate} must be <i>consistent with equals</i>, as documented at
 {@link Predicate#apply}. Do not provide a predicate such as {@code
 Predicates.instanceOf(ArrayList.class)}, which is inconsistent with equals.
@since 14.0

### `filterKeys([`com.google.common.collect.BiMap<K,V>`](./BiMap.md) unfiltered, [`com.google.common.base.Predicate<? super K>`](../base/Predicate.md) keyPredicate)`

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

Returns a bimap containing the mappings in {@code unfiltered} whose keys satisfy a predicate.
 The returned bimap is a live view of {@code unfiltered}; changes to one affect the other.

 <p>The resulting bimap's {@code keySet()}, {@code entrySet()}, and {@code values()} views have
 iterators that don't support {@code remove()}, but all other methods are supported by the bimap
 and its views. When given a key that doesn't satisfy the predicate, the bimap's {@code put()},
 {@code forcePut()} and {@code putAll()} methods throw an {@link IllegalArgumentException}.

 <p>When methods such as {@code removeAll()} and {@code clear()} are called on the filtered
 bimap or its views, only mappings that satisfy the filter will be removed from the underlying
 bimap.

 <p>The returned bimap isn't threadsafe or serializable, even if {@code unfiltered} is.

 <p>Many of the filtered bimap's methods, such as {@code size()}, iterate across every key in
 the underlying bimap and determine which satisfy the filter. When a live view is <i>not</i>
 needed, it may be faster to copy the filtered bimap and use the copy.

 <p><b>Warning:</b> {@code entryPredicate} must be <i>consistent with equals </i>, as documented
 at {@link Predicate#apply}.
@since 14.0

### `filterValues([`java.util.Map<K,V>`](../../../../java/util/Map.md) unfiltered, [`com.google.common.base.Predicate<? super V>`](../base/Predicate.md) valuePredicate)`

**Returns:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

Returns a map containing the mappings in {@code unfiltered} whose values satisfy a predicate.
 The returned map is a live view of {@code unfiltered}; changes to one affect the other.

 <p>The resulting map's {@code keySet()}, {@code entrySet()}, and {@code values()} views have
 iterators that don't support {@code remove()}, but all other methods are supported by the map
 and its views. When given a value that doesn't satisfy the predicate, the map's {@code put()},
 {@code putAll()}, and {@link Entry#setValue} methods throw an {@link IllegalArgumentException}.

 <p>When methods such as {@code removeAll()} and {@code clear()} are called on the filtered map
 or its views, only mappings whose values satisfy the filter will be removed from the underlying
 map.

 <p>The returned map isn't threadsafe or serializable, even if {@code unfiltered} is.

 <p>Many of the filtered map's methods, such as {@code size()}, iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy the filtered map and use the copy.

 <p><b>Warning:</b> {@code valuePredicate} must be <i>consistent with equals</i>, as documented
 at {@link Predicate#apply}. Do not provide a predicate such as {@code
 Predicates.instanceOf(ArrayList.class)}, which is inconsistent with equals.

### `filterValues([`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md) unfiltered, [`com.google.common.base.Predicate<? super V>`](../base/Predicate.md) valuePredicate)`

**Returns:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

Returns a sorted map containing the mappings in {@code unfiltered} whose values satisfy a
 predicate. The returned map is a live view of {@code unfiltered}; changes to one affect the
 other.

 <p>The resulting map's {@code keySet()}, {@code entrySet()}, and {@code values()} views have
 iterators that don't support {@code remove()}, but all other methods are supported by the map
 and its views. When given a value that doesn't satisfy the predicate, the map's {@code put()},
 {@code putAll()}, and {@link Entry#setValue} methods throw an {@link IllegalArgumentException}.

 <p>When methods such as {@code removeAll()} and {@code clear()} are called on the filtered map
 or its views, only mappings whose values satisfy the filter will be removed from the underlying
 map.

 <p>The returned map isn't threadsafe or serializable, even if {@code unfiltered} is.

 <p>Many of the filtered map's methods, such as {@code size()}, iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy the filtered map and use the copy.

 <p><b>Warning:</b> {@code valuePredicate} must be <i>consistent with equals</i>, as documented
 at {@link Predicate#apply}. Do not provide a predicate such as {@code
 Predicates.instanceOf(ArrayList.class)}, which is inconsistent with equals.
@since 11.0

### `filterValues([`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md) unfiltered, [`com.google.common.base.Predicate<? super V>`](../base/Predicate.md) valuePredicate)`

**Returns:** [`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md)

Returns a navigable map containing the mappings in {@code unfiltered} whose values satisfy a
 predicate. The returned map is a live view of {@code unfiltered}; changes to one affect the
 other.

 <p>The resulting map's {@code keySet()}, {@code entrySet()}, and {@code values()} views have
 iterators that don't support {@code remove()}, but all other methods are supported by the map
 and its views. When given a value that doesn't satisfy the predicate, the map's {@code put()},
 {@code putAll()}, and {@link Entry#setValue} methods throw an {@link IllegalArgumentException}.

 <p>When methods such as {@code removeAll()} and {@code clear()} are called on the filtered map
 or its views, only mappings whose values satisfy the filter will be removed from the underlying
 map.

 <p>The returned map isn't threadsafe or serializable, even if {@code unfiltered} is.

 <p>Many of the filtered map's methods, such as {@code size()}, iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy the filtered map and use the copy.

 <p><b>Warning:</b> {@code valuePredicate} must be <i>consistent with equals</i>, as documented
 at {@link Predicate#apply}. Do not provide a predicate such as {@code
 Predicates.instanceOf(ArrayList.class)}, which is inconsistent with equals.
@since 14.0

### `filterValues([`com.google.common.collect.BiMap<K,V>`](./BiMap.md) unfiltered, [`com.google.common.base.Predicate<? super V>`](../base/Predicate.md) valuePredicate)`

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

Returns a bimap containing the mappings in {@code unfiltered} whose values satisfy a predicate.
 The returned bimap is a live view of {@code unfiltered}; changes to one affect the other.

 <p>The resulting bimap's {@code keySet()}, {@code entrySet()}, and {@code values()} views have
 iterators that don't support {@code remove()}, but all other methods are supported by the bimap
 and its views. When given a value that doesn't satisfy the predicate, the bimap's {@code
 put()}, {@code forcePut()} and {@code putAll()} methods throw an {@link IllegalArgumentException}. Similarly, the map's entries have a {@link Entry#setValue} method
 that throws an {@link IllegalArgumentException} when the provided value doesn't satisfy the
 predicate.

 <p>When methods such as {@code removeAll()} and {@code clear()} are called on the filtered
 bimap or its views, only mappings that satisfy the filter will be removed from the underlying
 bimap.

 <p>The returned bimap isn't threadsafe or serializable, even if {@code unfiltered} is.

 <p>Many of the filtered bimap's methods, such as {@code size()}, iterate across every value in
 the underlying bimap and determine which satisfy the filter. When a live view is <i>not</i>
 needed, it may be faster to copy the filtered bimap and use the copy.

 <p><b>Warning:</b> {@code entryPredicate} must be <i>consistent with equals </i>, as documented
 at {@link Predicate#apply}.
@since 14.0

### `filterEntries([`java.util.Map<K,V>`](../../../../java/util/Map.md) unfiltered, [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate>.md) entryPredicate)`

**Returns:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

Returns a map containing the mappings in {@code unfiltered} that satisfy a predicate. The
 returned map is a live view of {@code unfiltered}; changes to one affect the other.

 <p>The resulting map's {@code keySet()}, {@code entrySet()}, and {@code values()} views have
 iterators that don't support {@code remove()}, but all other methods are supported by the map
 and its views. When given a key/value pair that doesn't satisfy the predicate, the map's {@code
 put()} and {@code putAll()} methods throw an {@link IllegalArgumentException}. Similarly, the
 map's entries have a {@link Entry#setValue} method that throws an {@link IllegalArgumentException} when the existing key and the provided value don't satisfy the
 predicate.

 <p>When methods such as {@code removeAll()} and {@code clear()} are called on the filtered map
 or its views, only mappings that satisfy the filter will be removed from the underlying map.

 <p>The returned map isn't threadsafe or serializable, even if {@code unfiltered} is.

 <p>Many of the filtered map's methods, such as {@code size()}, iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy the filtered map and use the copy.

 <p><b>Warning:</b> {@code entryPredicate} must be <i>consistent with equals</i>, as documented
 at {@link Predicate#apply}.

### `filterEntries([`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md) unfiltered, [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate>.md) entryPredicate)`

**Returns:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

Returns a sorted map containing the mappings in {@code unfiltered} that satisfy a predicate.
 The returned map is a live view of {@code unfiltered}; changes to one affect the other.

 <p>The resulting map's {@code keySet()}, {@code entrySet()}, and {@code values()} views have
 iterators that don't support {@code remove()}, but all other methods are supported by the map
 and its views. When given a key/value pair that doesn't satisfy the predicate, the map's {@code
 put()} and {@code putAll()} methods throw an {@link IllegalArgumentException}. Similarly, the
 map's entries have a {@link Entry#setValue} method that throws an {@link IllegalArgumentException} when the existing key and the provided value don't satisfy the
 predicate.

 <p>When methods such as {@code removeAll()} and {@code clear()} are called on the filtered map
 or its views, only mappings that satisfy the filter will be removed from the underlying map.

 <p>The returned map isn't threadsafe or serializable, even if {@code unfiltered} is.

 <p>Many of the filtered map's methods, such as {@code size()}, iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy the filtered map and use the copy.

 <p><b>Warning:</b> {@code entryPredicate} must be <i>consistent with equals</i>, as documented
 at {@link Predicate#apply}.
@since 11.0

### `filterEntries([`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md) unfiltered, [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate>.md) entryPredicate)`

**Returns:** [`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md)

Returns a sorted map containing the mappings in {@code unfiltered} that satisfy a predicate.
 The returned map is a live view of {@code unfiltered}; changes to one affect the other.

 <p>The resulting map's {@code keySet()}, {@code entrySet()}, and {@code values()} views have
 iterators that don't support {@code remove()}, but all other methods are supported by the map
 and its views. When given a key/value pair that doesn't satisfy the predicate, the map's {@code
 put()} and {@code putAll()} methods throw an {@link IllegalArgumentException}. Similarly, the
 map's entries have a {@link Entry#setValue} method that throws an {@link IllegalArgumentException} when the existing key and the provided value don't satisfy the
 predicate.

 <p>When methods such as {@code removeAll()} and {@code clear()} are called on the filtered map
 or its views, only mappings that satisfy the filter will be removed from the underlying map.

 <p>The returned map isn't threadsafe or serializable, even if {@code unfiltered} is.

 <p>Many of the filtered map's methods, such as {@code size()}, iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy the filtered map and use the copy.

 <p><b>Warning:</b> {@code entryPredicate} must be <i>consistent with equals</i>, as documented
 at {@link Predicate#apply}.
@since 14.0

### `filterEntries([`com.google.common.collect.BiMap<K,V>`](./BiMap.md) unfiltered, [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate>.md) entryPredicate)`

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

Returns a bimap containing the mappings in {@code unfiltered} that satisfy a predicate. The
 returned bimap is a live view of {@code unfiltered}; changes to one affect the other.

 <p>The resulting bimap's {@code keySet()}, {@code entrySet()}, and {@code values()} views have
 iterators that don't support {@code remove()}, but all other methods are supported by the bimap
 and its views. When given a key/value pair that doesn't satisfy the predicate, the bimap's
 {@code put()}, {@code forcePut()} and {@code putAll()} methods throw an {@link IllegalArgumentException}. Similarly, the map's entries have an {@link Entry#setValue} method
 that throws an {@link IllegalArgumentException} when the existing key and the provided value
 don't satisfy the predicate.

 <p>When methods such as {@code removeAll()} and {@code clear()} are called on the filtered
 bimap or its views, only mappings that satisfy the filter will be removed from the underlying
 bimap.

 <p>The returned bimap isn't threadsafe or serializable, even if {@code unfiltered} is.

 <p>Many of the filtered bimap's methods, such as {@code size()}, iterate across every key/value
 mapping in the underlying bimap and determine which satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy the filtered bimap and use the copy.

 <p><b>Warning:</b> {@code entryPredicate} must be <i>consistent with equals </i>, as documented
 at {@link Predicate#apply}.
@since 14.0

### `filterFiltered([`com.google.common.collect.Maps.AbstractFilteredMap<K,V>`](Maps/AbstractFilteredMap.md) map, [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate>.md) entryPredicate)`

**Returns:** [`java.util.Map<K,V>`](../../../../java/util/Map.md)

Support {@code clear()}, {@code removeAll()}, and {@code retainAll()} when filtering a filtered
 map.

### `filterFiltered([`com.google.common.collect.Maps.FilteredEntrySortedMap<K,V>`](Maps/FilteredEntrySortedMap.md) map, [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate>.md) entryPredicate)`

**Returns:** [`java.util.SortedMap<K,V>`](../../../../java/util/SortedMap.md)

Support {@code clear()}, {@code removeAll()}, and {@code retainAll()} when filtering a filtered
 sorted map.

### `filterFiltered([`com.google.common.collect.Maps.FilteredEntryNavigableMap<K,V>`](Maps/FilteredEntryNavigableMap.md) map, [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate>.md) entryPredicate)`

**Returns:** [`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md)

Support {@code clear()}, {@code removeAll()}, and {@code retainAll()} when filtering a filtered
 navigable map.

### `filterFiltered([`com.google.common.collect.Maps.FilteredEntryBiMap<K,V>`](Maps/FilteredEntryBiMap.md) map, [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate>.md) entryPredicate)`

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

Support {@code clear()}, {@code removeAll()}, and {@code retainAll()} when filtering a filtered
 map.

### `unmodifiableNavigableMap([`java.util.NavigableMap<K,? extends V>`](../../../../java/util/NavigableMap.md) map)`

**Returns:** [`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md)

Returns an unmodifiable view of the specified navigable map. Query operations on the returned
 map read through to the specified map, and attempts to modify the returned map, whether direct
 or via its views, result in an {@code UnsupportedOperationException}.

 <p>The returned navigable map will be serializable if the specified navigable map is
 serializable.

 <p>This method's signature will not permit you to convert a {@code NavigableMap<? extends K,
 V>} to a {@code NavigableMap<K, V>}. If it permitted this, the returned map's {@code
 comparator()} method might return a {@code Comparator<? extends K>}, which works only on a
 particular subtype of {@code K}, but promise that it's a {@code Comparator<? super K>}, which
 must work on any type of {@code K}.
@param map the navigable map for which an unmodifiable view is to be returned
@return an unmodifiable view of the specified navigable map
@since 12.0

### `unmodifiableOrNull([`java.util.Map.Entry<K,? extends V>`](../../../../java/util/Map/Entry.md) entry)`

**Returns:** [`java.util.Map.Entry<K,V>`](../../../../java/util/Map/Entry.md)

### `synchronizedNavigableMap([`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md) navigableMap)`

**Returns:** [`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md)

Returns a synchronized (thread-safe) navigable map backed by the specified navigable map. In
 order to guarantee serial access, it is critical that <b>all</b> access to the backing
 navigable map is accomplished through the returned navigable map (or its views).

 <p>It is imperative that the user manually synchronize on the returned navigable map when
 iterating over any of its collection views, or the collections views of any of its {@code
 descendingMap}, {@code subMap}, {@code headMap} or {@code tailMap} views.

 <pre>{@code
 NavigableMap<K, V> map = synchronizedNavigableMap(new TreeMap<K, V>());

 // Needn't be in synchronized block
 NavigableSet<K> set = map.navigableKeySet();

 synchronized (map) { // Synchronizing on map, not set!
   Iterator<K> it = set.iterator(); // Must be in synchronized block
   while (it.hasNext()) {
     foo(it.next());
   }
 }
 }</pre>

 <p>or:

 <pre>{@code
 NavigableMap<K, V> map = synchronizedNavigableMap(new TreeMap<K, V>());
 NavigableMap<K, V> map2 = map.subMap(foo, false, bar, true);

 // Needn't be in synchronized block
 NavigableSet<K> set2 = map2.descendingKeySet();

 synchronized (map) { // Synchronizing on map, not map2 or set2!
   Iterator<K> it = set2.iterator(); // Must be in synchronized block
   while (it.hasNext()) {
     foo(it.next());
   }
 }
 }</pre>

 <p>Failure to follow this advice may result in non-deterministic behavior.

 <p>The returned navigable map will be serializable if the specified navigable map is
 serializable.
@param navigableMap the navigable map to be "wrapped" in a synchronized navigable map.
@return a synchronized view of the specified navigable map.
@since 13.0

### `safeGet([`java.util.Map<?,V>`](../../../../java/util/Map.md) map, `java.lang.Object` key)`

**Returns:** [`V`](V.md)

Delegates to {@link Map#get}. Returns {@code null} on {@code ClassCastException} and {@code
 NullPointerException}.

### `safeContainsKey([`java.util.Map<?,?>`](../../../../java/util/Map.md) map, `java.lang.Object` key)`

**Returns:** `boolean`

Delegates to {@link Map#containsKey}. Returns {@code false} on {@code ClassCastException} and
 {@code NullPointerException}.

### `safeRemove([`java.util.Map<?,V>`](../../../../java/util/Map.md) map, `java.lang.Object` key)`

**Returns:** [`V`](V.md)

Delegates to {@link Map#remove}. Returns {@code null} on {@code ClassCastException} and {@code
 NullPointerException}.

### `containsKeyImpl([`java.util.Map<?,?>`](../../../../java/util/Map.md) map, `java.lang.Object` key)`

**Returns:** `boolean`

An admittedly inefficient implementation of {@link Map#containsKey}.

### `containsValueImpl([`java.util.Map<?,?>`](../../../../java/util/Map.md) map, `java.lang.Object` value)`

**Returns:** `boolean`

An implementation of {@link Map#containsValue}.

### `containsEntryImpl([`java.util.Collection<java.util.Map.Entry<K,V>>`](../../../../java/util/Collection>.md) c, `java.lang.Object` o)`

**Returns:** `boolean`

Implements {@code Collection.contains} safely for forwarding collections of map entries. If
 {@code o} is an instance of {@code Entry}, it is wrapped using {@link #unmodifiableEntry} to
 protect against a possible nefarious equals method.

 <p>Note that {@code c} is the backing (delegate) collection, rather than the forwarding
 collection.
@param c the delegate (unwrapped) collection of map entries
@param o the object that might be contained in {@code c}
@return {@code true} if {@code c} contains {@code o}

### `removeEntryImpl([`java.util.Collection<java.util.Map.Entry<K,V>>`](../../../../java/util/Collection>.md) c, `java.lang.Object` o)`

**Returns:** `boolean`

Implements {@code Collection.remove} safely for forwarding collections of map entries. If
 {@code o} is an instance of {@code Entry}, it is wrapped using {@link #unmodifiableEntry} to
 protect against a possible nefarious equals method.

 <p>Note that {@code c} is backing (delegate) collection, rather than the forwarding collection.
@param c the delegate (unwrapped) collection of map entries
@param o the object to remove from {@code c}
@return {@code true} if {@code c} was changed

### `equalsImpl([`java.util.Map<?,?>`](../../../../java/util/Map.md) map, `java.lang.Object` object)`

**Returns:** `boolean`

An implementation of {@link Map#equals}.

### `toStringImpl([`java.util.Map<?,?>`](../../../../java/util/Map.md) map)`

**Returns:** `java.lang.String`

An implementation of {@link Map#toString}.

### `putAllImpl([`java.util.Map<K,V>`](../../../../java/util/Map.md) self, [`java.util.Map<? extends K,? extends V>`](../../../../java/util/Map.md) map)`

**Returns:** `void`

An implementation of {@link Map#putAll}.

### `keyOrNull([`java.util.Map.Entry<K,?>`](../../../../java/util/Map/Entry.md) entry)`

**Returns:** [`K`](K.md)

### `valueOrNull([`java.util.Map.Entry<?,V>`](../../../../java/util/Map/Entry.md) entry)`

**Returns:** [`V`](V.md)

### `indexMap([`java.util.Collection<E>`](../../../../java/util/Collection.md) list)`

**Returns:** [`com.google.common.collect.ImmutableMap<E,java.lang.Integer>`](./ImmutableMap.md)

Returns a map from the ith element of list to i.

### `subMap([`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md) map, [`com.google.common.collect.Range<K>`](./Range.md) range)`

**Returns:** [`java.util.NavigableMap<K,V>`](../../../../java/util/NavigableMap.md)

Returns a view of the portion of {@code map} whose keys are contained by {@code range}.

 <p>This method delegates to the appropriate methods of {@link NavigableMap} (namely {@link NavigableMap#subMap(Object, boolean, Object, boolean) subMap()}, {@link NavigableMap#tailMap(Object, boolean) tailMap()}, and {@link NavigableMap#headMap(Object,
 boolean) headMap()}) to actually construct the view. Consult these methods for a full
 description of the returned view's behavior.

 <p><b>Warning:</b> {@code Range}s always represent a range of values using the values' natural
 ordering. {@code NavigableMap} on the other hand can specify a custom ordering via a {@link Comparator}, which can violate the natural ordering. Using this method (or in general using
 {@code Range}) with unnaturally-ordered maps can lead to unexpected and undefined behavior.
@since 20.0

