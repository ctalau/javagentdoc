# Class: `Maps`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Maps`

## Description

Static utility methods pertaining to `Map` instances (including instances of `SortedMap`, `BiMap`, etc.). Also see this class's counterparts `Lists`, `Sets`
 and `Queues`.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/CollectionUtilitiesExplained#maps">`Maps`</a>.
**Author:** Kevin Bourrillion
**Author:** Mike Bostock
**Author:** Isaac Shum
**Author:** Louis Wasserman
**Since:** 2.0

## Constructors

### `<init>()`

## Methods

### `keyFunction()`

**Returns:** [`com.google.common.base.Function<java.util.Map.Entry<K,?>,K>`](../base/Function,K>.md)

### `valueFunction()`

**Returns:** [`com.google.common.base.Function<java.util.Map.Entry<?,V>,V>`](../base/Function,V>.md)

### `keyIterator(`java.util.Iterator<java.util.Map.Entry<K,V>>` entryIterator)`

**Returns:** `java.util.Iterator<K>`

### `valueIterator(`java.util.Iterator<java.util.Map.Entry<K,V>>` entryIterator)`

**Returns:** `java.util.Iterator<V>`

### `immutableEnumMap(`java.util.Map<K,? extends V>` map)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns an immutable map instance containing the given entries. Internally, the returned map
 will be backed by an `EnumMap`.

 <p>The iteration order of the returned map follows the enum's iteration order, not the order in
 which the elements appear in the given map.
@param map the map to make an immutable copy of
@return an immutable map containing those entries
**Since:** 14.0

### `toImmutableEnumMap(`java.util.function.Function<? super T,? extends K>` keyFunction, `java.util.function.Function<? super T,? extends V>` valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

Returns a `Collector` that accumulates elements into an `ImmutableMap` whose keys
 and values are the result of applying the provided mapping functions to the input elements. The
 resulting implementation is specialized for enum key types. The returned map and its views will
 iterate over keys in their enum definition order, not encounter order.

 <p>If the mapped keys contain duplicates, an `IllegalArgumentException` is thrown when
 the collection operation is performed. (This differs from the `Collector` returned by
 `java.util.stream.Collectors.toMap(java.util.function.Function,
 java.util.function.Function) Collectors.toMap(Function, Function)`, which throws an `IllegalStateException`.)
**Since:** 21.0

### `toImmutableEnumMap(`java.util.function.Function<? super T,? extends K>` keyFunction, `java.util.function.Function<? super T,? extends V>` valueFunction, `java.util.function.BinaryOperator<V>` mergeFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

Returns a `Collector` that accumulates elements into an `ImmutableMap` whose keys
 and values are the result of applying the provided mapping functions to the input elements. The
 resulting implementation is specialized for enum key types. The returned map and its views will
 iterate over keys in their enum definition order, not encounter order.

 <p>If the mapped keys contain duplicates, the values are merged using the specified merging
 function.
**Since:** 21.0

### `newHashMap()`

**Returns:** `java.util.HashMap<K,V>`

Creates a <i>mutable</i>, empty `HashMap` instance.

 <p><b>Note:</b> if mutability is not required, use `ImmutableMap.of()` instead.

 <p><b>Note:</b> if `K` is an `enum` type, use `newEnumMap` instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the `HashMap` constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@return a new, empty `HashMap`

### `newHashMap(`java.util.Map<? extends K,? extends V>` map)`

**Returns:** `java.util.HashMap<K,V>`

Creates a <i>mutable</i> `HashMap` instance with the same mappings as the specified map.

 <p><b>Note:</b> if mutability is not required, use `ImmutableMap.copyOf(Map)` instead.

 <p><b>Note:</b> if `K` is an `Enum` type, use `newEnumMap` instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the `HashMap` constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@param map the mappings to be placed in the new map
@return a new `HashMap` initialized with the mappings from `map`

### `newHashMapWithExpectedSize(`int` expectedSize)`

**Returns:** `java.util.HashMap<K,V>`

Creates a `HashMap` instance, with a high enough "initial capacity" that it <i>should</i>
 hold `expectedSize` elements without growth. This behavior cannot be broadly guaranteed,
 but it is observed to be true for OpenJDK 1.7. It also can't be guaranteed that the method
 isn't inadvertently <i>oversizing</i> the returned map.
@param expectedSize the number of entries you expect to add to the returned map
@return a new, empty `HashMap` with enough capacity to hold `expectedSize` entries
     without resizing
@throws IllegalArgumentException if `expectedSize` is negative

### `capacity(`int` expectedSize)`

**Returns:** `int`

Returns a capacity that is sufficient to keep the map from being resized as long as it grows no
 larger than expectedSize and the load factor is \u2265 its default (0.75).

### `newLinkedHashMap()`

**Returns:** `java.util.LinkedHashMap<K,V>`

Creates a <i>mutable</i>, empty, insertion-ordered `LinkedHashMap` instance.

 <p><b>Note:</b> if mutability is not required, use `ImmutableMap.of()` instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the `LinkedHashMap` constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@return a new, empty `LinkedHashMap`

### `newLinkedHashMap(`java.util.Map<? extends K,? extends V>` map)`

**Returns:** `java.util.LinkedHashMap<K,V>`

Creates a <i>mutable</i>, insertion-ordered `LinkedHashMap` instance with the same
 mappings as the specified map.

 <p><b>Note:</b> if mutability is not required, use `ImmutableMap.copyOf(Map)` instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the `LinkedHashMap` constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@param map the mappings to be placed in the new map
@return a new, `LinkedHashMap` initialized with the mappings from `map`

### `newLinkedHashMapWithExpectedSize(`int` expectedSize)`

**Returns:** `java.util.LinkedHashMap<K,V>`

Creates a `LinkedHashMap` instance, with a high enough "initial capacity" that it
 <i>should</i> hold `expectedSize` elements without growth. This behavior cannot be
 broadly guaranteed, but it is observed to be true for OpenJDK 1.7. It also can't be guaranteed
 that the method isn't inadvertently <i>oversizing</i> the returned map.
@param expectedSize the number of entries you expect to add to the returned map
@return a new, empty `LinkedHashMap` with enough capacity to hold `expectedSize`
     entries without resizing
@throws IllegalArgumentException if `expectedSize` is negative
**Since:** 19.0

### `newConcurrentMap()`

**Returns:** `java.util.concurrent.ConcurrentMap<K,V>`

Creates a new empty `ConcurrentHashMap` instance.
**Since:** 3.0

### `newTreeMap()`

**Returns:** `java.util.TreeMap<K,V>`

Creates a <i>mutable</i>, empty `TreeMap` instance using the natural ordering of its
 elements.

 <p><b>Note:</b> if mutability is not required, use `ImmutableSortedMap.of()` instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the `TreeMap` constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@return a new, empty `TreeMap`

### `newTreeMap(`java.util.SortedMap<K,? extends V>` map)`

**Returns:** `java.util.TreeMap<K,V>`

Creates a <i>mutable</i> `TreeMap` instance with the same mappings as the specified map
 and using the same ordering as the specified map.

 <p><b>Note:</b> if mutability is not required, use `ImmutableSortedMap.copyOfSorted(SortedMap)` instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the `TreeMap` constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@param map the sorted map whose mappings are to be placed in the new map and whose comparator
     is to be used to sort the new map
@return a new `TreeMap` initialized with the mappings from `map` and using the
     comparator of `map`

### `newTreeMap(`java.util.Comparator<C>` comparator)`

**Returns:** `java.util.TreeMap<K,V>`

Creates a <i>mutable</i>, empty `TreeMap` instance using the given comparator.

 <p><b>Note:</b> if mutability is not required, use `ImmutableSortedMap.orderedBy(comparator).build()` instead.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the `TreeMap` constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@param comparator the comparator to sort the keys with
@return a new, empty `TreeMap`

### `newEnumMap(`java.lang.Class<K>` type)`

**Returns:** `java.util.EnumMap<K,V>`

Creates an `EnumMap` instance.
@param type the key type for this map
@return a new, empty `EnumMap`

### `newEnumMap(`java.util.Map<K,? extends V>` map)`

**Returns:** `java.util.EnumMap<K,V>`

Creates an `EnumMap` with the same mappings as the specified map.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the `EnumMap` constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@param map the map from which to initialize this `EnumMap`
@return a new `EnumMap` initialized with the mappings from `map`
@throws IllegalArgumentException if `m` is not an `EnumMap` instance and contains
     no mappings

### `newIdentityHashMap()`

**Returns:** `java.util.IdentityHashMap<K,V>`

Creates an `IdentityHashMap` instance.

 <p><b>Note:</b> this method is now unnecessary and should be treated as deprecated. Instead,
 use the `IdentityHashMap` constructor directly, taking advantage of <a href="http://goo.gl/iz2Wi">"diamond" syntax</a>.
@return a new, empty `IdentityHashMap`

### `difference(`java.util.Map<? extends K,? extends V>` left, `java.util.Map<? extends K,? extends V>` right)`

**Returns:** [`com.google.common.collect.MapDifference<K,V>`](./MapDifference.md)

Computes the difference between two maps. This difference is an immutable snapshot of the state
 of the maps at the time this method is called. It will never change, even if the maps change at
 a later time.

 <p>Since this method uses `HashMap` instances internally, the keys of the supplied maps
 must be well-behaved with respect to `Object.equals` and `Object.hashCode`.

 <p><b>Note:</b>If you only need to know whether two maps have the same mappings, call `left.equals(right)` instead of this method.
@param left the map to treat as the "left" map for purposes of comparison
@param right the map to treat as the "right" map for purposes of comparison
@return the difference between the two maps

### `difference(`java.util.Map<? extends K,? extends V>` left, `java.util.Map<? extends K,? extends V>` right, [`com.google.common.base.Equivalence<? super @org.checkerframework.checker.nullness.qual.NonNull V>`](../base/Equivalence.md) valueEquivalence)`

**Returns:** [`com.google.common.collect.MapDifference<K,V>`](./MapDifference.md)

Computes the difference between two maps. This difference is an immutable snapshot of the state
 of the maps at the time this method is called. It will never change, even if the maps change at
 a later time.

 <p>Since this method uses `HashMap` instances internally, the keys of the supplied maps
 must be well-behaved with respect to `Object.equals` and `Object.hashCode`.
@param left the map to treat as the "left" map for purposes of comparison
@param right the map to treat as the "right" map for purposes of comparison
@param valueEquivalence the equivalence relationship to use to compare values
@return the difference between the two maps
**Since:** 10.0

### `difference(`java.util.SortedMap<K,? extends V>` left, `java.util.Map<? extends K,? extends V>` right)`

**Returns:** [`com.google.common.collect.SortedMapDifference<K,V>`](./SortedMapDifference.md)

Computes the difference between two sorted maps, using the comparator of the left map, or
 `Ordering.natural()` if the left map uses the natural ordering of its elements. This
 difference is an immutable snapshot of the state of the maps at the time this method is called.
 It will never change, even if the maps change at a later time.

 <p>Since this method uses `TreeMap` instances internally, the keys of the right map must
 all compare as distinct according to the comparator of the left map.

 <p><b>Note:</b>If you only need to know whether two sorted maps have the same mappings, call
 `left.equals(right)` instead of this method.
@param left the map to treat as the "left" map for purposes of comparison
@param right the map to treat as the "right" map for purposes of comparison
@return the difference between the two maps
**Since:** 11.0

### `doDifference(`java.util.Map<? extends K,? extends V>` left, `java.util.Map<? extends K,? extends V>` right, [`com.google.common.base.Equivalence<? super @org.checkerframework.checker.nullness.qual.NonNull V>`](../base/Equivalence.md) valueEquivalence, `java.util.Map<K,V>` onlyOnLeft, `java.util.Map<K,V>` onlyOnRight, `java.util.Map<K,V>` onBoth, `java.util.Map<K,com.google.common.collect.MapDifference.ValueDifference<V>>` differences)`

**Returns:** `void`

### `unmodifiableMap(`java.util.Map<K,? extends V>` map)`

**Returns:** `java.util.Map<K,V>`

### `orNaturalOrder(`java.util.Comparator<? super E>` comparator)`

**Returns:** `java.util.Comparator<? super E>`

Returns the specified comparator if not null; otherwise returns `Ordering.natural()`.
 This method is an abomination of generics; the only purpose of this method is to contain the
 ugly type-casting in one place.

### `asMap(`java.util.Set<K>` set, [`com.google.common.base.Function<? super K,V>`](../base/Function.md) function)`

**Returns:** `java.util.Map<K,V>`

Returns a live `Map` view whose keys are the contents of `set` and whose values are
 computed on demand using `function`. To get an immutable <i>copy</i> instead, use `toMap(Iterable, Function)`.

 <p>Specifically, for each `k` in the backing set, the returned map has an entry mapping
 `k` to `function.apply(k)`. The `keySet`, `values`, and `entrySet` views of the returned map iterate in the same order as the backing set.

 <p>Modifications to the backing set are read through to the returned map. The returned map
 supports removal operations if the backing set does. Removal operations write through to the
 backing set. The returned map does not support put operations.

 <p><b>Warning:</b> If the function rejects `null`, caution is required to make sure the
 set does not contain `null`, because the view cannot stop `null` from being added
 to the set.

 <p><b>Warning:</b> This method assumes that for any instance `k` of key type `K`,
 `k.equals(k2)` implies that `k2` is also of type `K`. Using a key type for
 which this may not hold, such as `ArrayList`, may risk a `ClassCastException` when
 calling methods on the resulting map view.
**Since:** 14.0

### `asMap(`java.util.SortedSet<K>` set, [`com.google.common.base.Function<? super K,V>`](../base/Function.md) function)`

**Returns:** `java.util.SortedMap<K,V>`

Returns a view of the sorted set as a map, mapping keys from the set according to the specified
 function.

 <p>Specifically, for each `k` in the backing set, the returned map has an entry mapping
 `k` to `function.apply(k)`. The `keySet`, `values`, and `entrySet` views of the returned map iterate in the same order as the backing set.

 <p>Modifications to the backing set are read through to the returned map. The returned map
 supports removal operations if the backing set does. Removal operations write through to the
 backing set. The returned map does not support put operations.

 <p><b>Warning:</b> If the function rejects `null`, caution is required to make sure the
 set does not contain `null`, because the view cannot stop `null` from being added
 to the set.

 <p><b>Warning:</b> This method assumes that for any instance `k` of key type `K`,
 `k.equals(k2)` implies that `k2` is also of type `K`. Using a key type for
 which this may not hold, such as `ArrayList`, may risk a `ClassCastException` when
 calling methods on the resulting map view.
**Since:** 14.0

### `asMap(`java.util.NavigableSet<K>` set, [`com.google.common.base.Function<? super K,V>`](../base/Function.md) function)`

**Returns:** `java.util.NavigableMap<K,V>`

Returns a view of the navigable set as a map, mapping keys from the set according to the
 specified function.

 <p>Specifically, for each `k` in the backing set, the returned map has an entry mapping
 `k` to `function.apply(k)`. The `keySet`, `values`, and `entrySet` views of the returned map iterate in the same order as the backing set.

 <p>Modifications to the backing set are read through to the returned map. The returned map
 supports removal operations if the backing set does. Removal operations write through to the
 backing set. The returned map does not support put operations.

 <p><b>Warning:</b> If the function rejects `null`, caution is required to make sure the
 set does not contain `null`, because the view cannot stop `null` from being added
 to the set.

 <p><b>Warning:</b> This method assumes that for any instance `k` of key type `K`,
 `k.equals(k2)` implies that `k2` is also of type `K`. Using a key type for
 which this may not hold, such as `ArrayList`, may risk a `ClassCastException` when
 calling methods on the resulting map view.
**Since:** 14.0

### `asMapEntryIterator(`java.util.Set<K>` set, [`com.google.common.base.Function<? super K,V>`](../base/Function.md) function)`

**Returns:** `java.util.Iterator<java.util.Map.Entry<K,V>>`

### `removeOnlySet(`java.util.Set<E>` set)`

**Returns:** `java.util.Set<E>`

### `removeOnlySortedSet(`java.util.SortedSet<E>` set)`

**Returns:** `java.util.SortedSet<E>`

### `removeOnlyNavigableSet(`java.util.NavigableSet<E>` set)`

**Returns:** `java.util.NavigableSet<E>`

### `toMap(`java.lang.Iterable<K>` keys, [`com.google.common.base.Function<? super K,V>`](../base/Function.md) valueFunction)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns an immutable map whose keys are the distinct elements of `keys` and whose value
 for each key was computed by `valueFunction`. The map's iteration order is the order of
 the first appearance of each key in `keys`.

 <p>When there are multiple instances of a key in `keys`, it is unspecified whether `valueFunction` will be applied to more than one instance of that key and, if it is, which
 result will be mapped to that key in the returned map.

 <p>If `keys` is a `Set`, a live view can be obtained instead of a copy using `Maps.asMap(Set, Function)`.
@throws NullPointerException if any element of `keys` is `null`, or if `valueFunction` produces `null` for any key
**Since:** 14.0

### `toMap(`java.util.Iterator<K>` keys, [`com.google.common.base.Function<? super K,V>`](../base/Function.md) valueFunction)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns an immutable map whose keys are the distinct elements of `keys` and whose value
 for each key was computed by `valueFunction`. The map's iteration order is the order of
 the first appearance of each key in `keys`.

 <p>When there are multiple instances of a key in `keys`, it is unspecified whether `valueFunction` will be applied to more than one instance of that key and, if it is, which
 result will be mapped to that key in the returned map.
@throws NullPointerException if any element of `keys` is `null`, or if `valueFunction` produces `null` for any key
**Since:** 14.0

### `uniqueIndex(`java.lang.Iterable<V>` values, [`com.google.common.base.Function<? super V,K>`](../base/Function.md) keyFunction)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns a map with the given `values`, indexed by keys derived from those values. In
 other words, each input value produces an entry in the map whose key is the result of applying
 `keyFunction` to that value. These entries appear in the same order as the input values.
 Example usage:

 <pre>`Color red = new Color("red", 255, 0, 0);
 ...
 ImmutableSet<Color> allColors = ImmutableSet.of(red, green, blue);

 ImmutableMap<String, Color> colorForName =
     uniqueIndex(allColors, c -> c.toString());
 assertThat(colorForName).containsEntry("red", red);
 `</pre>

 <p>If your index may associate multiple values with each key, use `Multimaps.index(Iterable, Function) Multimaps.index`.

 <p><b>Note:</b> on Java 8 and later, it is usually better to use streams. For example:

 <pre>`import static com.google.common.collect.ImmutableMap.toImmutableMap;
 ...
 ImmutableMap<String, Color> colorForName =
     allColors.stream().collect(toImmutableMap(c -> c.toString(), c -> c));
 `</pre>

 <p>Streams provide a more standard and flexible API and the lambdas make it clear what the keys
 and values in the map are.
@param values the values to use when constructing the `Map`
@param keyFunction the function used to produce the key for each value
@return a map mapping the result of evaluating the function `keyFunction` on each value
     in the input collection to that value
@throws IllegalArgumentException if `keyFunction` produces the same key for more than one
     value in the input collection
@throws NullPointerException if any element of `values` is `null`, or if `keyFunction` produces `null` for any value

### `uniqueIndex(`java.util.Iterator<V>` values, [`com.google.common.base.Function<? super V,K>`](../base/Function.md) keyFunction)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Returns a map with the given `values`, indexed by keys derived from those values. In
 other words, each input value produces an entry in the map whose key is the result of applying
 `keyFunction` to that value. These entries appear in the same order as the input values.
 Example usage:

 <pre>`Color red = new Color("red", 255, 0, 0);
 ...
 Iterator<Color> allColors = ImmutableSet.of(red, green, blue).iterator();

 Map<String, Color> colorForName =
     uniqueIndex(allColors, toStringFunction());
 assertThat(colorForName).containsEntry("red", red);
 `</pre>

 <p>If your index may associate multiple values with each key, use `Multimaps.index(Iterator, Function) Multimaps.index`.
@param values the values to use when constructing the `Map`
@param keyFunction the function used to produce the key for each value
@return a map mapping the result of evaluating the function `keyFunction` on each value
     in the input collection to that value
@throws IllegalArgumentException if `keyFunction` produces the same key for more than one
     value in the input collection
@throws NullPointerException if any element of `values` is `null`, or if `keyFunction` produces `null` for any value
**Since:** 10.0

### `uniqueIndex(`java.util.Iterator<V>` values, [`com.google.common.base.Function<? super V,K>`](../base/Function.md) keyFunction, [`com.google.common.collect.ImmutableMap.Builder<K,V>`](ImmutableMap/Builder.md) builder)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

### `fromProperties(`java.util.Properties` properties)`

**Returns:** [`com.google.common.collect.ImmutableMap<java.lang.String,java.lang.String>`](./ImmutableMap.md)

Creates an `ImmutableMap<String, String>` from a `Properties` instance. Properties
 normally derive from `Map<Object, Object>`, but they typically contain strings, which is
 awkward. This method lets you get a plain-old-`Map` out of a `Properties`.
@param properties a `Properties` object to be converted
@return an immutable map containing all the entries in `properties`
@throws ClassCastException if any key in `properties` is not a `String`
@throws NullPointerException if any key or value in `properties` is null

### `immutableEntry(`K` key, `V` value)`

**Returns:** `java.util.Map.Entry<K,V>`

Returns an immutable map entry with the specified key and value. The `Entry.setValue`
 operation throws an `UnsupportedOperationException`.

 <p>The returned entry is serializable.

 <p><b>Java 9 users:</b> consider using `java.util.Map.entry(key, value)` if the key and
 value are non-null and the entry does not need to be serializable.
@param key the key to be associated with the returned entry
@param value the value to be associated with the returned entry

### `unmodifiableEntrySet(`java.util.Set<java.util.Map.Entry<K,V>>` entrySet)`

**Returns:** `java.util.Set<java.util.Map.Entry<K,V>>`

Returns an unmodifiable view of the specified set of entries. The `Entry.setValue`
 operation throws an `UnsupportedOperationException`, as do any operations that would
 modify the returned set.
@param entrySet the entries for which to return an unmodifiable view
@return an unmodifiable view of the entries

### `unmodifiableEntry(`java.util.Map.Entry<? extends K,? extends V>` entry)`

**Returns:** `java.util.Map.Entry<K,V>`

Returns an unmodifiable view of the specified map entry. The `Entry.setValue` operation
 throws an `UnsupportedOperationException`. This also has the side effect of redefining
 `equals` to comply with the Entry contract, to avoid a possible nefarious implementation
 of equals.
@param entry the entry for which to return an unmodifiable view
@return an unmodifiable view of the entry

### `unmodifiableEntryIterator(`java.util.Iterator<java.util.Map.Entry<K,V>>` entryIterator)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K,V>>`](./UnmodifiableIterator>.md)

### `asConverter([`com.google.common.collect.BiMap<A,B>`](./BiMap.md) bimap)`

**Returns:** [`com.google.common.base.Converter<A,B>`](../base/Converter.md)

Returns a `Converter` that converts values using `BiMap.get bimap.get()`, and whose
 inverse view converts values using `BiMap.inverse bimap.inverse()``.get()`.

 <p>To use a plain `Map` as a `Function`, see `com.google.common.base.Functions.forMap(Map)` or `com.google.common.base.Functions.forMap(Map, Object)`.
**Since:** 16.0

### `synchronizedBiMap([`com.google.common.collect.BiMap<K,V>`](./BiMap.md) bimap)`

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

Returns a synchronized (thread-safe) bimap backed by the specified bimap. In order to guarantee
 serial access, it is critical that <b>all</b> access to the backing bimap is accomplished
 through the returned bimap.

 <p>It is imperative that the user manually synchronize on the returned map when accessing any
 of its collection views:

 <pre>`BiMap<Long, String> map = Maps.synchronizedBiMap(
     HashBiMap.<Long, String>create());
 ...
 Set<Long> set = map.keySet();  // Needn't be in synchronized block
 ...
 synchronized (map) {  // Synchronizing on map, not set!
   Iterator<Long> it = set.iterator(); // Must be in synchronized block
   while (it.hasNext()) {
     foo(it.next());
   `
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
 its collection views, result in an `UnsupportedOperationException`.

 <p>The returned bimap will be serializable if the specified bimap is serializable.
@param bimap the bimap for which an unmodifiable view is to be returned
@return an unmodifiable view of the specified bimap

### `transformValues(`java.util.Map<K,V1>` fromMap, [`com.google.common.base.Function<? super V1,V2>`](../base/Function.md) function)`

**Returns:** `java.util.Map<K,V2>`

Returns a view of a map where each value is transformed by a function. All other properties of
 the map, such as iteration order, are left intact. For example, the code:

 <pre>`Map<String, Integer> map = ImmutableMap.of("a", 4, "b", 9);
 Function<Integer, Double> sqrt =
     new Function<Integer, Double>() {
       public Double apply(Integer in) {
         return Math.sqrt((int) in);
       `
     };
 Map<String, Double> transformed = Maps.transformValues(map, sqrt);
 System.out.println(transformed);
 }</pre>

 ... prints `{a=2.0, b=3.0`}.

 <p>Changes in the underlying map are reflected in this view. Conversely, this view supports
 removal operations, and these are reflected in the underlying map.

 <p>It's acceptable for the underlying map to contain null keys, and even null values provided
 that the function is capable of accepting null input. The transformed map might contain null
 values, if the function sometimes gives a null result.

 <p>The returned map is not thread-safe or serializable, even if the underlying map is.

 <p>The function is applied lazily, invoked when needed. This is necessary for the returned map
 to be a view, but it means that the function will be applied many times for bulk operations
 like `Map.containsValue` and `Map.toString()`. For this to perform well, `function` should be fast. To avoid lazy evaluation when the returned map doesn't need to be a
 view, copy the returned map into a new map of your choosing.

### `transformValues(`java.util.SortedMap<K,V1>` fromMap, [`com.google.common.base.Function<? super V1,V2>`](../base/Function.md) function)`

**Returns:** `java.util.SortedMap<K,V2>`

Returns a view of a sorted map where each value is transformed by a function. All other
 properties of the map, such as iteration order, are left intact. For example, the code:

 <pre>`SortedMap<String, Integer> map = ImmutableSortedMap.of("a", 4, "b", 9);
 Function<Integer, Double> sqrt =
     new Function<Integer, Double>() {
       public Double apply(Integer in) {
         return Math.sqrt((int) in);
       `
     };
 SortedMap<String, Double> transformed =
      Maps.transformValues(map, sqrt);
 System.out.println(transformed);
 }</pre>

 ... prints `{a=2.0, b=3.0`}.

 <p>Changes in the underlying map are reflected in this view. Conversely, this view supports
 removal operations, and these are reflected in the underlying map.

 <p>It's acceptable for the underlying map to contain null keys, and even null values provided
 that the function is capable of accepting null input. The transformed map might contain null
 values, if the function sometimes gives a null result.

 <p>The returned map is not thread-safe or serializable, even if the underlying map is.

 <p>The function is applied lazily, invoked when needed. This is necessary for the returned map
 to be a view, but it means that the function will be applied many times for bulk operations
 like `Map.containsValue` and `Map.toString()`. For this to perform well, `function` should be fast. To avoid lazy evaluation when the returned map doesn't need to be a
 view, copy the returned map into a new map of your choosing.
**Since:** 11.0

### `transformValues(`java.util.NavigableMap<K,V1>` fromMap, [`com.google.common.base.Function<? super V1,V2>`](../base/Function.md) function)`

**Returns:** `java.util.NavigableMap<K,V2>`

Returns a view of a navigable map where each value is transformed by a function. All other
 properties of the map, such as iteration order, are left intact. For example, the code:

 <pre>`NavigableMap<String, Integer> map = Maps.newTreeMap();
 map.put("a", 4);
 map.put("b", 9);
 Function<Integer, Double> sqrt =
     new Function<Integer, Double>() {
       public Double apply(Integer in) {
         return Math.sqrt((int) in);
       `
     };
 NavigableMap<String, Double> transformed =
      Maps.transformNavigableValues(map, sqrt);
 System.out.println(transformed);
 }</pre>

 ... prints `{a=2.0, b=3.0`}.

 <p>Changes in the underlying map are reflected in this view. Conversely, this view supports
 removal operations, and these are reflected in the underlying map.

 <p>It's acceptable for the underlying map to contain null keys, and even null values provided
 that the function is capable of accepting null input. The transformed map might contain null
 values, if the function sometimes gives a null result.

 <p>The returned map is not thread-safe or serializable, even if the underlying map is.

 <p>The function is applied lazily, invoked when needed. This is necessary for the returned map
 to be a view, but it means that the function will be applied many times for bulk operations
 like `Map.containsValue` and `Map.toString()`. For this to perform well, `function` should be fast. To avoid lazy evaluation when the returned map doesn't need to be a
 view, copy the returned map into a new map of your choosing.
**Since:** 13.0

### `transformEntries(`java.util.Map<K,V1>` fromMap, [`com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2>`](Maps/EntryTransformer.md) transformer)`

**Returns:** `java.util.Map<K,V2>`

Returns a view of a map whose values are derived from the original map's entries. In contrast
 to `transformValues`, this method's entry-transformation logic may depend on the key as
 well as the value.

 <p>All other properties of the transformed map, such as iteration order, are left intact. For
 example, the code:

 <pre>`Map<String, Boolean> options =
     ImmutableMap.of("verbose", true, "sort", false);
 EntryTransformer<String, Boolean, String> flagPrefixer =
     new EntryTransformer<String, Boolean, String>() {
       public String transformEntry(String key, Boolean value) {
         return value ? key : "no" + key;
       `
     };
 Map<String, String> transformed =
     Maps.transformEntries(options, flagPrefixer);
 System.out.println(transformed);
 }</pre>

 ... prints `{verbose=verbose, sort=nosort`}.

 <p>Changes in the underlying map are reflected in this view. Conversely, this view supports
 removal operations, and these are reflected in the underlying map.

 <p>It's acceptable for the underlying map to contain null keys and null values provided that
 the transformer is capable of accepting null inputs. The transformed map might contain null
 values if the transformer sometimes gives a null result.

 <p>The returned map is not thread-safe or serializable, even if the underlying map is.

 <p>The transformer is applied lazily, invoked when needed. This is necessary for the returned
 map to be a view, but it means that the transformer will be applied many times for bulk
 operations like `Map.containsValue` and `Object.toString`. For this to perform
 well, `transformer` should be fast. To avoid lazy evaluation when the returned map
 doesn't need to be a view, copy the returned map into a new map of your choosing.

 <p><b>Warning:</b> This method assumes that for any instance `k` of `EntryTransformer` key type `K`, `k.equals(k2)` implies that `k2` is also of
 type `K`. Using an `EntryTransformer` key type for which this may not hold, such as
 `ArrayList`, may risk a `ClassCastException` when calling methods on the
 transformed map.
**Since:** 7.0

### `transformEntries(`java.util.SortedMap<K,V1>` fromMap, [`com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2>`](Maps/EntryTransformer.md) transformer)`

**Returns:** `java.util.SortedMap<K,V2>`

Returns a view of a sorted map whose values are derived from the original sorted map's entries.
 In contrast to `transformValues`, this method's entry-transformation logic may depend on
 the key as well as the value.

 <p>All other properties of the transformed map, such as iteration order, are left intact. For
 example, the code:

 <pre>`Map<String, Boolean> options =
     ImmutableSortedMap.of("verbose", true, "sort", false);
 EntryTransformer<String, Boolean, String> flagPrefixer =
     new EntryTransformer<String, Boolean, String>() {
       public String transformEntry(String key, Boolean value) {
         return value ? key : "yes" + key;
       `
     };
 SortedMap<String, String> transformed =
     Maps.transformEntries(options, flagPrefixer);
 System.out.println(transformed);
 }</pre>

 ... prints `{sort=yessort, verbose=verbose`}.

 <p>Changes in the underlying map are reflected in this view. Conversely, this view supports
 removal operations, and these are reflected in the underlying map.

 <p>It's acceptable for the underlying map to contain null keys and null values provided that
 the transformer is capable of accepting null inputs. The transformed map might contain null
 values if the transformer sometimes gives a null result.

 <p>The returned map is not thread-safe or serializable, even if the underlying map is.

 <p>The transformer is applied lazily, invoked when needed. This is necessary for the returned
 map to be a view, but it means that the transformer will be applied many times for bulk
 operations like `Map.containsValue` and `Object.toString`. For this to perform
 well, `transformer` should be fast. To avoid lazy evaluation when the returned map
 doesn't need to be a view, copy the returned map into a new map of your choosing.

 <p><b>Warning:</b> This method assumes that for any instance `k` of `EntryTransformer` key type `K`, `k.equals(k2)` implies that `k2` is also of
 type `K`. Using an `EntryTransformer` key type for which this may not hold, such as
 `ArrayList`, may risk a `ClassCastException` when calling methods on the
 transformed map.
**Since:** 11.0

### `transformEntries(`java.util.NavigableMap<K,V1>` fromMap, [`com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2>`](Maps/EntryTransformer.md) transformer)`

**Returns:** `java.util.NavigableMap<K,V2>`

Returns a view of a navigable map whose values are derived from the original navigable map's
 entries. In contrast to `transformValues`, this method's entry-transformation logic may
 depend on the key as well as the value.

 <p>All other properties of the transformed map, such as iteration order, are left intact. For
 example, the code:

 <pre>`NavigableMap<String, Boolean> options = Maps.newTreeMap();
 options.put("verbose", false);
 options.put("sort", true);
 EntryTransformer<String, Boolean, String> flagPrefixer =
     new EntryTransformer<String, Boolean, String>() {
       public String transformEntry(String key, Boolean value) {
         return value ? key : ("yes" + key);
       `
     };
 NavigableMap<String, String> transformed =
     LabsMaps.transformNavigableEntries(options, flagPrefixer);
 System.out.println(transformed);
 }</pre>

 ... prints `{sort=yessort, verbose=verbose`}.

 <p>Changes in the underlying map are reflected in this view. Conversely, this view supports
 removal operations, and these are reflected in the underlying map.

 <p>It's acceptable for the underlying map to contain null keys and null values provided that
 the transformer is capable of accepting null inputs. The transformed map might contain null
 values if the transformer sometimes gives a null result.

 <p>The returned map is not thread-safe or serializable, even if the underlying map is.

 <p>The transformer is applied lazily, invoked when needed. This is necessary for the returned
 map to be a view, but it means that the transformer will be applied many times for bulk
 operations like `Map.containsValue` and `Object.toString`. For this to perform
 well, `transformer` should be fast. To avoid lazy evaluation when the returned map
 doesn't need to be a view, copy the returned map into a new map of your choosing.

 <p><b>Warning:</b> This method assumes that for any instance `k` of `EntryTransformer` key type `K`, `k.equals(k2)` implies that `k2` is also of
 type `K`. Using an `EntryTransformer` key type for which this may not hold, such as
 `ArrayList`, may risk a `ClassCastException` when calling methods on the
 transformed map.
**Since:** 13.0

### `asEntryTransformer([`com.google.common.base.Function<? super V1,V2>`](../base/Function.md) function)`

**Returns:** [`com.google.common.collect.Maps.EntryTransformer<K,V1,V2>`](Maps/EntryTransformer.md)

Views a function as an entry transformer that ignores the entry key.

### `asValueToValueFunction([`com.google.common.collect.Maps.EntryTransformer<? super K,V1,V2>`](Maps/EntryTransformer.md) transformer, `K` key)`

**Returns:** [`com.google.common.base.Function<V1,V2>`](../base/Function.md)

### `asEntryToValueFunction([`com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2>`](Maps/EntryTransformer.md) transformer)`

**Returns:** [`com.google.common.base.Function<java.util.Map.Entry<K,V1>,V2>`](../base/Function,V2>.md)

Views an entry transformer as a function from `Entry` to values.

### `transformEntry([`com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2>`](Maps/EntryTransformer.md) transformer, `java.util.Map.Entry<K,V1>` entry)`

**Returns:** `java.util.Map.Entry<K,V2>`

Returns a view of an entry transformed by the specified transformer.

### `asEntryToEntryFunction([`com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2>`](Maps/EntryTransformer.md) transformer)`

**Returns:** [`com.google.common.base.Function<java.util.Map.Entry<K,V1>,java.util.Map.Entry<K,V2>>`](../base/Function,java/util/Map/Entry>.md)

Views an entry transformer as a function from entries to entries.

### `keyPredicateOnEntries([`com.google.common.base.Predicate<? super K>`](../base/Predicate.md) keyPredicate)`

**Returns:** [`com.google.common.base.Predicate<java.util.Map.Entry<K,?>>`](../base/Predicate>.md)

### `valuePredicateOnEntries([`com.google.common.base.Predicate<? super V>`](../base/Predicate.md) valuePredicate)`

**Returns:** [`com.google.common.base.Predicate<java.util.Map.Entry<?,V>>`](../base/Predicate>.md)

### `filterKeys(`java.util.Map<K,V>` unfiltered, [`com.google.common.base.Predicate<? super K>`](../base/Predicate.md) keyPredicate)`

**Returns:** `java.util.Map<K,V>`

Returns a map containing the mappings in `unfiltered` whose keys satisfy a predicate. The
 returned map is a live view of `unfiltered`; changes to one affect the other.

 <p>The resulting map's `keySet()`, `entrySet()`, and `values()` views have
 iterators that don't support `remove()`, but all other methods are supported by the map
 and its views. When given a key that doesn't satisfy the predicate, the map's `put()` and
 `putAll()` methods throw an `IllegalArgumentException`.

 <p>When methods such as `removeAll()` and `clear()` are called on the filtered map
 or its views, only mappings whose keys satisfy the filter will be removed from the underlying
 map.

 <p>The returned map isn't threadsafe or serializable, even if `unfiltered` is.

 <p>Many of the filtered map's methods, such as `size()`, iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy the filtered map and use the copy.

 <p><b>Warning:</b> `keyPredicate` must be <i>consistent with equals</i>, as documented at
 `Predicate.apply`. Do not provide a predicate such as `Predicates.instanceOf(ArrayList.class)`, which is inconsistent with equals.

### `filterKeys(`java.util.SortedMap<K,V>` unfiltered, [`com.google.common.base.Predicate<? super K>`](../base/Predicate.md) keyPredicate)`

**Returns:** `java.util.SortedMap<K,V>`

Returns a sorted map containing the mappings in `unfiltered` whose keys satisfy a
 predicate. The returned map is a live view of `unfiltered`; changes to one affect the
 other.

 <p>The resulting map's `keySet()`, `entrySet()`, and `values()` views have
 iterators that don't support `remove()`, but all other methods are supported by the map
 and its views. When given a key that doesn't satisfy the predicate, the map's `put()` and
 `putAll()` methods throw an `IllegalArgumentException`.

 <p>When methods such as `removeAll()` and `clear()` are called on the filtered map
 or its views, only mappings whose keys satisfy the filter will be removed from the underlying
 map.

 <p>The returned map isn't threadsafe or serializable, even if `unfiltered` is.

 <p>Many of the filtered map's methods, such as `size()`, iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy the filtered map and use the copy.

 <p><b>Warning:</b> `keyPredicate` must be <i>consistent with equals</i>, as documented at
 `Predicate.apply`. Do not provide a predicate such as `Predicates.instanceOf(ArrayList.class)`, which is inconsistent with equals.
**Since:** 11.0

### `filterKeys(`java.util.NavigableMap<K,V>` unfiltered, [`com.google.common.base.Predicate<? super K>`](../base/Predicate.md) keyPredicate)`

**Returns:** `java.util.NavigableMap<K,V>`

Returns a navigable map containing the mappings in `unfiltered` whose keys satisfy a
 predicate. The returned map is a live view of `unfiltered`; changes to one affect the
 other.

 <p>The resulting map's `keySet()`, `entrySet()`, and `values()` views have
 iterators that don't support `remove()`, but all other methods are supported by the map
 and its views. When given a key that doesn't satisfy the predicate, the map's `put()` and
 `putAll()` methods throw an `IllegalArgumentException`.

 <p>When methods such as `removeAll()` and `clear()` are called on the filtered map
 or its views, only mappings whose keys satisfy the filter will be removed from the underlying
 map.

 <p>The returned map isn't threadsafe or serializable, even if `unfiltered` is.

 <p>Many of the filtered map's methods, such as `size()`, iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy the filtered map and use the copy.

 <p><b>Warning:</b> `keyPredicate` must be <i>consistent with equals</i>, as documented at
 `Predicate.apply`. Do not provide a predicate such as `Predicates.instanceOf(ArrayList.class)`, which is inconsistent with equals.
**Since:** 14.0

### `filterKeys([`com.google.common.collect.BiMap<K,V>`](./BiMap.md) unfiltered, [`com.google.common.base.Predicate<? super K>`](../base/Predicate.md) keyPredicate)`

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

Returns a bimap containing the mappings in `unfiltered` whose keys satisfy a predicate.
 The returned bimap is a live view of `unfiltered`; changes to one affect the other.

 <p>The resulting bimap's `keySet()`, `entrySet()`, and `values()` views have
 iterators that don't support `remove()`, but all other methods are supported by the bimap
 and its views. When given a key that doesn't satisfy the predicate, the bimap's `put()`,
 `forcePut()` and `putAll()` methods throw an `IllegalArgumentException`.

 <p>When methods such as `removeAll()` and `clear()` are called on the filtered
 bimap or its views, only mappings that satisfy the filter will be removed from the underlying
 bimap.

 <p>The returned bimap isn't threadsafe or serializable, even if `unfiltered` is.

 <p>Many of the filtered bimap's methods, such as `size()`, iterate across every key in
 the underlying bimap and determine which satisfy the filter. When a live view is <i>not</i>
 needed, it may be faster to copy the filtered bimap and use the copy.

 <p><b>Warning:</b> `entryPredicate` must be <i>consistent with equals </i>, as documented
 at `Predicate.apply`.
**Since:** 14.0

### `filterValues(`java.util.Map<K,V>` unfiltered, [`com.google.common.base.Predicate<? super V>`](../base/Predicate.md) valuePredicate)`

**Returns:** `java.util.Map<K,V>`

Returns a map containing the mappings in `unfiltered` whose values satisfy a predicate.
 The returned map is a live view of `unfiltered`; changes to one affect the other.

 <p>The resulting map's `keySet()`, `entrySet()`, and `values()` views have
 iterators that don't support `remove()`, but all other methods are supported by the map
 and its views. When given a value that doesn't satisfy the predicate, the map's `put()`,
 `putAll()`, and `Entry.setValue` methods throw an `IllegalArgumentException`.

 <p>When methods such as `removeAll()` and `clear()` are called on the filtered map
 or its views, only mappings whose values satisfy the filter will be removed from the underlying
 map.

 <p>The returned map isn't threadsafe or serializable, even if `unfiltered` is.

 <p>Many of the filtered map's methods, such as `size()`, iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy the filtered map and use the copy.

 <p><b>Warning:</b> `valuePredicate` must be <i>consistent with equals</i>, as documented
 at `Predicate.apply`. Do not provide a predicate such as `Predicates.instanceOf(ArrayList.class)`, which is inconsistent with equals.

### `filterValues(`java.util.SortedMap<K,V>` unfiltered, [`com.google.common.base.Predicate<? super V>`](../base/Predicate.md) valuePredicate)`

**Returns:** `java.util.SortedMap<K,V>`

Returns a sorted map containing the mappings in `unfiltered` whose values satisfy a
 predicate. The returned map is a live view of `unfiltered`; changes to one affect the
 other.

 <p>The resulting map's `keySet()`, `entrySet()`, and `values()` views have
 iterators that don't support `remove()`, but all other methods are supported by the map
 and its views. When given a value that doesn't satisfy the predicate, the map's `put()`,
 `putAll()`, and `Entry.setValue` methods throw an `IllegalArgumentException`.

 <p>When methods such as `removeAll()` and `clear()` are called on the filtered map
 or its views, only mappings whose values satisfy the filter will be removed from the underlying
 map.

 <p>The returned map isn't threadsafe or serializable, even if `unfiltered` is.

 <p>Many of the filtered map's methods, such as `size()`, iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy the filtered map and use the copy.

 <p><b>Warning:</b> `valuePredicate` must be <i>consistent with equals</i>, as documented
 at `Predicate.apply`. Do not provide a predicate such as `Predicates.instanceOf(ArrayList.class)`, which is inconsistent with equals.
**Since:** 11.0

### `filterValues(`java.util.NavigableMap<K,V>` unfiltered, [`com.google.common.base.Predicate<? super V>`](../base/Predicate.md) valuePredicate)`

**Returns:** `java.util.NavigableMap<K,V>`

Returns a navigable map containing the mappings in `unfiltered` whose values satisfy a
 predicate. The returned map is a live view of `unfiltered`; changes to one affect the
 other.

 <p>The resulting map's `keySet()`, `entrySet()`, and `values()` views have
 iterators that don't support `remove()`, but all other methods are supported by the map
 and its views. When given a value that doesn't satisfy the predicate, the map's `put()`,
 `putAll()`, and `Entry.setValue` methods throw an `IllegalArgumentException`.

 <p>When methods such as `removeAll()` and `clear()` are called on the filtered map
 or its views, only mappings whose values satisfy the filter will be removed from the underlying
 map.

 <p>The returned map isn't threadsafe or serializable, even if `unfiltered` is.

 <p>Many of the filtered map's methods, such as `size()`, iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy the filtered map and use the copy.

 <p><b>Warning:</b> `valuePredicate` must be <i>consistent with equals</i>, as documented
 at `Predicate.apply`. Do not provide a predicate such as `Predicates.instanceOf(ArrayList.class)`, which is inconsistent with equals.
**Since:** 14.0

### `filterValues([`com.google.common.collect.BiMap<K,V>`](./BiMap.md) unfiltered, [`com.google.common.base.Predicate<? super V>`](../base/Predicate.md) valuePredicate)`

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

Returns a bimap containing the mappings in `unfiltered` whose values satisfy a predicate.
 The returned bimap is a live view of `unfiltered`; changes to one affect the other.

 <p>The resulting bimap's `keySet()`, `entrySet()`, and `values()` views have
 iterators that don't support `remove()`, but all other methods are supported by the bimap
 and its views. When given a value that doesn't satisfy the predicate, the bimap's `put()`, `forcePut()` and `putAll()` methods throw an `IllegalArgumentException`. Similarly, the map's entries have a `Entry.setValue` method
 that throws an `IllegalArgumentException` when the provided value doesn't satisfy the
 predicate.

 <p>When methods such as `removeAll()` and `clear()` are called on the filtered
 bimap or its views, only mappings that satisfy the filter will be removed from the underlying
 bimap.

 <p>The returned bimap isn't threadsafe or serializable, even if `unfiltered` is.

 <p>Many of the filtered bimap's methods, such as `size()`, iterate across every value in
 the underlying bimap and determine which satisfy the filter. When a live view is <i>not</i>
 needed, it may be faster to copy the filtered bimap and use the copy.

 <p><b>Warning:</b> `entryPredicate` must be <i>consistent with equals </i>, as documented
 at `Predicate.apply`.
**Since:** 14.0

### `filterEntries(`java.util.Map<K,V>` unfiltered, [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate>.md) entryPredicate)`

**Returns:** `java.util.Map<K,V>`

Returns a map containing the mappings in `unfiltered` that satisfy a predicate. The
 returned map is a live view of `unfiltered`; changes to one affect the other.

 <p>The resulting map's `keySet()`, `entrySet()`, and `values()` views have
 iterators that don't support `remove()`, but all other methods are supported by the map
 and its views. When given a key/value pair that doesn't satisfy the predicate, the map's `put()` and `putAll()` methods throw an `IllegalArgumentException`. Similarly, the
 map's entries have a `Entry.setValue` method that throws an `IllegalArgumentException` when the existing key and the provided value don't satisfy the
 predicate.

 <p>When methods such as `removeAll()` and `clear()` are called on the filtered map
 or its views, only mappings that satisfy the filter will be removed from the underlying map.

 <p>The returned map isn't threadsafe or serializable, even if `unfiltered` is.

 <p>Many of the filtered map's methods, such as `size()`, iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy the filtered map and use the copy.

 <p><b>Warning:</b> `entryPredicate` must be <i>consistent with equals</i>, as documented
 at `Predicate.apply`.

### `filterEntries(`java.util.SortedMap<K,V>` unfiltered, [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate>.md) entryPredicate)`

**Returns:** `java.util.SortedMap<K,V>`

Returns a sorted map containing the mappings in `unfiltered` that satisfy a predicate.
 The returned map is a live view of `unfiltered`; changes to one affect the other.

 <p>The resulting map's `keySet()`, `entrySet()`, and `values()` views have
 iterators that don't support `remove()`, but all other methods are supported by the map
 and its views. When given a key/value pair that doesn't satisfy the predicate, the map's `put()` and `putAll()` methods throw an `IllegalArgumentException`. Similarly, the
 map's entries have a `Entry.setValue` method that throws an `IllegalArgumentException` when the existing key and the provided value don't satisfy the
 predicate.

 <p>When methods such as `removeAll()` and `clear()` are called on the filtered map
 or its views, only mappings that satisfy the filter will be removed from the underlying map.

 <p>The returned map isn't threadsafe or serializable, even if `unfiltered` is.

 <p>Many of the filtered map's methods, such as `size()`, iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy the filtered map and use the copy.

 <p><b>Warning:</b> `entryPredicate` must be <i>consistent with equals</i>, as documented
 at `Predicate.apply`.
**Since:** 11.0

### `filterEntries(`java.util.NavigableMap<K,V>` unfiltered, [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate>.md) entryPredicate)`

**Returns:** `java.util.NavigableMap<K,V>`

Returns a sorted map containing the mappings in `unfiltered` that satisfy a predicate.
 The returned map is a live view of `unfiltered`; changes to one affect the other.

 <p>The resulting map's `keySet()`, `entrySet()`, and `values()` views have
 iterators that don't support `remove()`, but all other methods are supported by the map
 and its views. When given a key/value pair that doesn't satisfy the predicate, the map's `put()` and `putAll()` methods throw an `IllegalArgumentException`. Similarly, the
 map's entries have a `Entry.setValue` method that throws an `IllegalArgumentException` when the existing key and the provided value don't satisfy the
 predicate.

 <p>When methods such as `removeAll()` and `clear()` are called on the filtered map
 or its views, only mappings that satisfy the filter will be removed from the underlying map.

 <p>The returned map isn't threadsafe or serializable, even if `unfiltered` is.

 <p>Many of the filtered map's methods, such as `size()`, iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy the filtered map and use the copy.

 <p><b>Warning:</b> `entryPredicate` must be <i>consistent with equals</i>, as documented
 at `Predicate.apply`.
**Since:** 14.0

### `filterEntries([`com.google.common.collect.BiMap<K,V>`](./BiMap.md) unfiltered, [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate>.md) entryPredicate)`

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

Returns a bimap containing the mappings in `unfiltered` that satisfy a predicate. The
 returned bimap is a live view of `unfiltered`; changes to one affect the other.

 <p>The resulting bimap's `keySet()`, `entrySet()`, and `values()` views have
 iterators that don't support `remove()`, but all other methods are supported by the bimap
 and its views. When given a key/value pair that doesn't satisfy the predicate, the bimap's
 `put()`, `forcePut()` and `putAll()` methods throw an `IllegalArgumentException`. Similarly, the map's entries have an `Entry.setValue` method
 that throws an `IllegalArgumentException` when the existing key and the provided value
 don't satisfy the predicate.

 <p>When methods such as `removeAll()` and `clear()` are called on the filtered
 bimap or its views, only mappings that satisfy the filter will be removed from the underlying
 bimap.

 <p>The returned bimap isn't threadsafe or serializable, even if `unfiltered` is.

 <p>Many of the filtered bimap's methods, such as `size()`, iterate across every key/value
 mapping in the underlying bimap and determine which satisfy the filter. When a live view is
 <i>not</i> needed, it may be faster to copy the filtered bimap and use the copy.

 <p><b>Warning:</b> `entryPredicate` must be <i>consistent with equals </i>, as documented
 at `Predicate.apply`.
**Since:** 14.0

### `filterFiltered([`com.google.common.collect.Maps.AbstractFilteredMap<K,V>`](Maps/AbstractFilteredMap.md) map, [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate>.md) entryPredicate)`

**Returns:** `java.util.Map<K,V>`

Support `clear()`, `removeAll()`, and `retainAll()` when filtering a filtered
 map.

### `filterFiltered([`com.google.common.collect.Maps.FilteredEntrySortedMap<K,V>`](Maps/FilteredEntrySortedMap.md) map, [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate>.md) entryPredicate)`

**Returns:** `java.util.SortedMap<K,V>`

Support `clear()`, `removeAll()`, and `retainAll()` when filtering a filtered
 sorted map.

### `filterFiltered([`com.google.common.collect.Maps.FilteredEntryNavigableMap<K,V>`](Maps/FilteredEntryNavigableMap.md) map, [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate>.md) entryPredicate)`

**Returns:** `java.util.NavigableMap<K,V>`

Support `clear()`, `removeAll()`, and `retainAll()` when filtering a filtered
 navigable map.

### `filterFiltered([`com.google.common.collect.Maps.FilteredEntryBiMap<K,V>`](Maps/FilteredEntryBiMap.md) map, [`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate>.md) entryPredicate)`

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

Support `clear()`, `removeAll()`, and `retainAll()` when filtering a filtered
 map.

### `unmodifiableNavigableMap(`java.util.NavigableMap<K,? extends V>` map)`

**Returns:** `java.util.NavigableMap<K,V>`

Returns an unmodifiable view of the specified navigable map. Query operations on the returned
 map read through to the specified map, and attempts to modify the returned map, whether direct
 or via its views, result in an `UnsupportedOperationException`.

 <p>The returned navigable map will be serializable if the specified navigable map is
 serializable.

 <p>This method's signature will not permit you to convert a `NavigableMap<? extends K,
 V>` to a `NavigableMap<K, V>`. If it permitted this, the returned map's `comparator()` method might return a `Comparator<? extends K>`, which works only on a
 particular subtype of `K`, but promise that it's a `Comparator<? super K>`, which
 must work on any type of `K`.
@param map the navigable map for which an unmodifiable view is to be returned
@return an unmodifiable view of the specified navigable map
**Since:** 12.0

### `unmodifiableOrNull(`java.util.Map.Entry<K,? extends V>` entry)`

**Returns:** `java.util.Map.Entry<K,V>`

### `synchronizedNavigableMap(`java.util.NavigableMap<K,V>` navigableMap)`

**Returns:** `java.util.NavigableMap<K,V>`

Returns a synchronized (thread-safe) navigable map backed by the specified navigable map. In
 order to guarantee serial access, it is critical that <b>all</b> access to the backing
 navigable map is accomplished through the returned navigable map (or its views).

 <p>It is imperative that the user manually synchronize on the returned navigable map when
 iterating over any of its collection views, or the collections views of any of its `descendingMap`, `subMap`, `headMap` or `tailMap` views.

 <pre>`NavigableMap<K, V> map = synchronizedNavigableMap(new TreeMap<K, V>());

 // Needn't be in synchronized block
 NavigableSet<K> set = map.navigableKeySet();

 synchronized (map) { // Synchronizing on map, not set!
   Iterator<K> it = set.iterator(); // Must be in synchronized block
   while (it.hasNext()) {
     foo(it.next());
   `
 }
 }</pre>

 <p>or:

 <pre>`NavigableMap<K, V> map = synchronizedNavigableMap(new TreeMap<K, V>());
 NavigableMap<K, V> map2 = map.subMap(foo, false, bar, true);

 // Needn't be in synchronized block
 NavigableSet<K> set2 = map2.descendingKeySet();

 synchronized (map) { // Synchronizing on map, not map2 or set2!
   Iterator<K> it = set2.iterator(); // Must be in synchronized block
   while (it.hasNext()) {
     foo(it.next());
   `
 }
 }</pre>

 <p>Failure to follow this advice may result in non-deterministic behavior.

 <p>The returned navigable map will be serializable if the specified navigable map is
 serializable.
@param navigableMap the navigable map to be "wrapped" in a synchronized navigable map.
@return a synchronized view of the specified navigable map.
**Since:** 13.0

### `safeGet(`java.util.Map<?,V>` map, `java.lang.Object` key)`

**Returns:** `V`

Delegates to `Map.get`. Returns `null` on `ClassCastException` and `NullPointerException`.

### `safeContainsKey(`java.util.Map<?,?>` map, `java.lang.Object` key)`

**Returns:** `boolean`

Delegates to `Map.containsKey`. Returns `false` on `ClassCastException` and
 `NullPointerException`.

### `safeRemove(`java.util.Map<?,V>` map, `java.lang.Object` key)`

**Returns:** `V`

Delegates to `Map.remove`. Returns `null` on `ClassCastException` and `NullPointerException`.

### `containsKeyImpl(`java.util.Map<?,?>` map, `java.lang.Object` key)`

**Returns:** `boolean`

An admittedly inefficient implementation of `Map.containsKey`.

### `containsValueImpl(`java.util.Map<?,?>` map, `java.lang.Object` value)`

**Returns:** `boolean`

An implementation of `Map.containsValue`.

### `containsEntryImpl(`java.util.Collection<java.util.Map.Entry<K,V>>` c, `java.lang.Object` o)`

**Returns:** `boolean`

Implements `Collection.contains` safely for forwarding collections of map entries. If
 `o` is an instance of `Entry`, it is wrapped using `unmodifiableEntry` to
 protect against a possible nefarious equals method.

 <p>Note that `c` is the backing (delegate) collection, rather than the forwarding
 collection.
@param c the delegate (unwrapped) collection of map entries
@param o the object that might be contained in `c`
@return `true` if `c` contains `o`

### `removeEntryImpl(`java.util.Collection<java.util.Map.Entry<K,V>>` c, `java.lang.Object` o)`

**Returns:** `boolean`

Implements `Collection.remove` safely for forwarding collections of map entries. If
 `o` is an instance of `Entry`, it is wrapped using `unmodifiableEntry` to
 protect against a possible nefarious equals method.

 <p>Note that `c` is backing (delegate) collection, rather than the forwarding collection.
@param c the delegate (unwrapped) collection of map entries
@param o the object to remove from `c`
@return `true` if `c` was changed

### `equalsImpl(`java.util.Map<?,?>` map, `java.lang.Object` object)`

**Returns:** `boolean`

An implementation of `Map.equals`.

### `toStringImpl(`java.util.Map<?,?>` map)`

**Returns:** `java.lang.String`

An implementation of `Map.toString`.

### `putAllImpl(`java.util.Map<K,V>` self, `java.util.Map<? extends K,? extends V>` map)`

**Returns:** `void`

An implementation of `Map.putAll`.

### `keyOrNull(`java.util.Map.Entry<K,?>` entry)`

**Returns:** `K`

### `valueOrNull(`java.util.Map.Entry<?,V>` entry)`

**Returns:** `V`

### `indexMap(`java.util.Collection<E>` list)`

**Returns:** [`com.google.common.collect.ImmutableMap<E,java.lang.Integer>`](./ImmutableMap.md)

Returns a map from the ith element of list to i.

### `subMap(`java.util.NavigableMap<K,V>` map, [`com.google.common.collect.Range<K>`](./Range.md) range)`

**Returns:** `java.util.NavigableMap<K,V>`

Returns a view of the portion of `map` whose keys are contained by `range`.

 <p>This method delegates to the appropriate methods of `NavigableMap` (namely `NavigableMap.subMap(Object, boolean, Object, boolean) subMap()`, `NavigableMap.tailMap(Object, boolean) tailMap()`, and `NavigableMap.headMap(Object,
 boolean) headMap()`) to actually construct the view. Consult these methods for a full
 description of the returned view's behavior.

 <p><b>Warning:</b> `Range`s always represent a range of values using the values' natural
 ordering. `NavigableMap` on the other hand can specify a custom ordering via a `Comparator`, which can violate the natural ordering. Using this method (or in general using
 `Range`) with unnaturally-ordered maps can lead to unexpected and undefined behavior.
**Since:** 20.0

