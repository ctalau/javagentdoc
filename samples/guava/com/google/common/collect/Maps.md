# Class: `Maps`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Maps`

## Description

Also see this class's counterparts Lists, Sets
 and Queues.

 
See the Guava User Guide article on [Maps](https://github.com/google/guava/wiki/CollectionUtilitiesExplained#maps).

## Constructors

### `<init>()`

## Methods

### `keyFunction()`

**Returns:** [`com.google.common.base.Function<java.util.Map.Entry<K,?>,K>`](../base/Function.md)

### `valueFunction()`

**Returns:** [`com.google.common.base.Function<java.util.Map.Entry<?,V>,V>`](../base/Function.md)

### `keyIterator(java.util.Iterator<java.util.Map.Entry<K,V>> entryIterator)`

**Returns:** `java.util.Iterator<K>`

**Parameters:**
- `entryIterator` (`java.util.Iterator<java.util.Map.Entry<K,V>>`)

### `valueIterator(java.util.Iterator<java.util.Map.Entry<K,V>> entryIterator)`

**Returns:** `java.util.Iterator<V>`

**Parameters:**
- `entryIterator` (`java.util.Iterator<java.util.Map.Entry<K,V>>`)

### `immutableEnumMap(java.util.Map<K,? extends V> map)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

Internally, the returned map
 will be backed by an EnumMap.

 
The iteration order of the returned map follows the enum's iteration order, not the order in
 which the elements appear in the given map.

**Parameters:**
- `map` (`java.util.Map<K,? extends V>`): the map to make an immutable copy of

### `toImmutableEnumMap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

The
 resulting implementation is specialized for enum key types. The returned map and its views will
 iterate over keys in their enum definition order, not encounter order.

 
If the mapped keys contain duplicates, an IllegalArgumentException is thrown when
 the collection operation is performed. (This differs from the Collector returned by
 Collectors.toMap(Function, Function), which throws an 
 IllegalStateException.)

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

### `toImmutableEnumMap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction, java.util.function.BinaryOperator<V> mergeFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

The
 resulting implementation is specialized for enum key types. The returned map and its views will
 iterate over keys in their enum definition order, not encounter order.

 
If the mapped keys contain duplicates, the values are merged using the specified merging
 function.

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `mergeFunction` (`java.util.function.BinaryOperator<V>`)

### `newHashMap()`

**Returns:** `java.util.HashMap<K,V>`

**Note:** if mutability is not required, use ImmutableMap#of() instead.

 
**Note:** if K is an enum type, use #newEnumMap instead.

 
**Note:** this method is now unnecessary and should be treated as deprecated. Instead,
 use the HashMap constructor directly, taking advantage of ["diamond" syntax](http://goo.gl/iz2Wi).

### `newHashMap(java.util.Map<? extends K,? extends V> map)`

**Returns:** `java.util.HashMap<K,V>`

**Note:** if mutability is not required, use ImmutableMap#copyOf(Map) instead.

 
**Note:** if K is an Enum type, use #newEnumMap instead.

 
**Note:** this method is now unnecessary and should be treated as deprecated. Instead,
 use the HashMap constructor directly, taking advantage of ["diamond" syntax](http://goo.gl/iz2Wi).

**Parameters:**
- `map` (`java.util.Map<? extends K,? extends V>`): the mappings to be placed in the new map

### `newHashMapWithExpectedSize(int expectedSize)`

**Returns:** `java.util.HashMap<K,V>`

This behavior cannot be broadly guaranteed,
 but it is observed to be true for OpenJDK 1.7. It also can't be guaranteed that the method
 isn't inadvertently *oversizing* the returned map.

**Parameters:**
- `expectedSize` (`int`): the number of entries you expect to add to the returned map

### `capacity(int expectedSize)`

**Returns:** `int`

**Parameters:**
- `expectedSize` (`int`)

### `newLinkedHashMap()`

**Returns:** `java.util.LinkedHashMap<K,V>`

**Note:** if mutability is not required, use ImmutableMap#of() instead.

 
**Note:** this method is now unnecessary and should be treated as deprecated. Instead,
 use the LinkedHashMap constructor directly, taking advantage of ["diamond" syntax](http://goo.gl/iz2Wi).

### `newLinkedHashMap(java.util.Map<? extends K,? extends V> map)`

**Returns:** `java.util.LinkedHashMap<K,V>`

**Note:** if mutability is not required, use ImmutableMap#copyOf(Map) instead.

 
**Note:** this method is now unnecessary and should be treated as deprecated. Instead,
 use the LinkedHashMap constructor directly, taking advantage of ["diamond" syntax](http://goo.gl/iz2Wi).

**Parameters:**
- `map` (`java.util.Map<? extends K,? extends V>`): the mappings to be placed in the new map

### `newLinkedHashMapWithExpectedSize(int expectedSize)`

**Returns:** `java.util.LinkedHashMap<K,V>`

This behavior cannot be
 broadly guaranteed, but it is observed to be true for OpenJDK 1.7. It also can't be guaranteed
 that the method isn't inadvertently *oversizing* the returned map.

**Parameters:**
- `expectedSize` (`int`): the number of entries you expect to add to the returned map

### `newConcurrentMap()`

**Returns:** `java.util.concurrent.ConcurrentMap<K,V>`

### `newTreeMap()`

**Returns:** `java.util.TreeMap<K,V>`

**Note:** if mutability is not required, use ImmutableSortedMap#of() instead.

 
**Note:** this method is now unnecessary and should be treated as deprecated. Instead,
 use the TreeMap constructor directly, taking advantage of ["diamond" syntax](http://goo.gl/iz2Wi).

### `newTreeMap(java.util.SortedMap<K,? extends V> map)`

**Returns:** `java.util.TreeMap<K,V>`

**Note:** if mutability is not required, use ImmutableSortedMap#copyOfSorted(SortedMap) instead.

 
**Note:** this method is now unnecessary and should be treated as deprecated. Instead,
 use the TreeMap constructor directly, taking advantage of ["diamond" syntax](http://goo.gl/iz2Wi).

**Parameters:**
- `map` (`java.util.SortedMap<K,? extends V>`): the sorted map whose mappings are to be placed in the new map and whose comparator
     is to be used to sort the new map

### `newTreeMap(java.util.Comparator<C> comparator)`

**Returns:** `java.util.TreeMap<K,V>`

**Note:** if mutability is not required, use 
 ImmutableSortedMap.orderedBy(comparator).build() instead.

 
**Note:** this method is now unnecessary and should be treated as deprecated. Instead,
 use the TreeMap constructor directly, taking advantage of ["diamond" syntax](http://goo.gl/iz2Wi).

**Parameters:**
- `comparator` (`java.util.Comparator<C>`): the comparator to sort the keys with

### `newEnumMap(java.lang.Class<K> type)`

**Returns:** `java.util.EnumMap<K,V>`

**Parameters:**
- `type` (`java.lang.Class<K>`): the key type for this map

### `newEnumMap(java.util.Map<K,? extends V> map)`

**Returns:** `java.util.EnumMap<K,V>`

**Note:** this method is now unnecessary and should be treated as deprecated. Instead,
 use the EnumMap constructor directly, taking advantage of ["diamond" syntax](http://goo.gl/iz2Wi).

**Parameters:**
- `map` (`java.util.Map<K,? extends V>`): the map from which to initialize this EnumMap

### `newIdentityHashMap()`

**Returns:** `java.util.IdentityHashMap<K,V>`

**Note:** this method is now unnecessary and should be treated as deprecated. Instead,
 use the IdentityHashMap constructor directly, taking advantage of ["diamond" syntax](http://goo.gl/iz2Wi).

### `difference(java.util.Map<? extends K,? extends V> left, java.util.Map<? extends K,? extends V> right)`

**Returns:** [`com.google.common.collect.MapDifference<K,V>`](./MapDifference.md)

This difference is an immutable snapshot of the state
 of the maps at the time this method is called. It will never change, even if the maps change at
 a later time.

 
Since this method uses HashMap instances internally, the keys of the supplied maps
 must be well-behaved with respect to Object#equals and Object#hashCode.

 
**Note:**If you only need to know whether two maps have the same mappings, call 
 left.equals(right) instead of this method.

**Parameters:**
- `left` (`java.util.Map<? extends K,? extends V>`): the map to treat as the "left" map for purposes of comparison
- `right` (`java.util.Map<? extends K,? extends V>`): the map to treat as the "right" map for purposes of comparison

### `difference(java.util.Map<? extends K,? extends V> left, java.util.Map<? extends K,? extends V> right, com.google.common.base.Equivalence<? super @org.checkerframework.checker.nullness.qual.NonNull V> valueEquivalence)`

**Returns:** [`com.google.common.collect.MapDifference<K,V>`](./MapDifference.md)

This difference is an immutable snapshot of the state
 of the maps at the time this method is called. It will never change, even if the maps change at
 a later time.

 
Since this method uses HashMap instances internally, the keys of the supplied maps
 must be well-behaved with respect to Object#equals and Object#hashCode.

**Parameters:**
- `left` (`java.util.Map<? extends K,? extends V>`): the map to treat as the "left" map for purposes of comparison
- `right` (`java.util.Map<? extends K,? extends V>`): the map to treat as the "right" map for purposes of comparison
- `valueEquivalence` ([`com.google.common.base.Equivalence<? super @org.checkerframework.checker.nullness.qual.NonNull V>`](../base/Equivalence.md)): the equivalence relationship to use to compare values

### `difference(java.util.SortedMap<K,? extends V> left, java.util.Map<? extends K,? extends V> right)`

**Returns:** [`com.google.common.collect.SortedMapDifference<K,V>`](./SortedMapDifference.md)

This
 difference is an immutable snapshot of the state of the maps at the time this method is called.
 It will never change, even if the maps change at a later time.

 
Since this method uses TreeMap instances internally, the keys of the right map must
 all compare as distinct according to the comparator of the left map.

 
**Note:**If you only need to know whether two sorted maps have the same mappings, call
 left.equals(right) instead of this method.

**Parameters:**
- `left` (`java.util.SortedMap<K,? extends V>`): the map to treat as the "left" map for purposes of comparison
- `right` (`java.util.Map<? extends K,? extends V>`): the map to treat as the "right" map for purposes of comparison

### `doDifference(java.util.Map<? extends K,? extends V> left, java.util.Map<? extends K,? extends V> right, com.google.common.base.Equivalence<? super @org.checkerframework.checker.nullness.qual.NonNull V> valueEquivalence, java.util.Map<K,V> onlyOnLeft, java.util.Map<K,V> onlyOnRight, java.util.Map<K,V> onBoth, java.util.Map<K,com.google.common.collect.MapDifference.ValueDifference<V>> differences)`

**Returns:** `void`

**Parameters:**
- `left` (`java.util.Map<? extends K,? extends V>`)
- `right` (`java.util.Map<? extends K,? extends V>`)
- `valueEquivalence` ([`com.google.common.base.Equivalence<? super @org.checkerframework.checker.nullness.qual.NonNull V>`](../base/Equivalence.md))
- `onlyOnLeft` (`java.util.Map<K,V>`)
- `onlyOnRight` (`java.util.Map<K,V>`)
- `onBoth` (`java.util.Map<K,V>`)
- `differences` (`java.util.Map<K,com.google.common.collect.MapDifference.ValueDifference<V>>`)

### `unmodifiableMap(java.util.Map<K,? extends V> map)`

**Returns:** `java.util.Map<K,V>`

**Parameters:**
- `map` (`java.util.Map<K,? extends V>`)

### `orNaturalOrder(java.util.Comparator<? super E> comparator)`

**Returns:** `java.util.Comparator<? super E>`

This method is an abomination of generics; the only purpose of this method is to contain the
 ugly type-casting in one place.

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)

### `asMap(java.util.Set<K> set, com.google.common.base.Function<? super K,V> function)`

**Returns:** `java.util.Map<K,V>`

To get an immutable *copy* instead, use #toMap(Iterable, Function).

 
Specifically, for each k in the backing set, the returned map has an entry mapping
 k to function.apply(k). The keySet, values, and 
 entrySet views of the returned map iterate in the same order as the backing set.

 
Modifications to the backing set are read through to the returned map. The returned map
 supports removal operations if the backing set does. Removal operations write through to the
 backing set. The returned map does not support put operations.

 
**Warning:** If the function rejects null, caution is required to make sure the
 set does not contain null, because the view cannot stop null from being added
 to the set.

 
**Warning:** This method assumes that for any instance k of key type K,
 k.equals(k2) implies that k2 is also of type K. Using a key type for
 which this may not hold, such as ArrayList, may risk a ClassCastException when
 calling methods on the resulting map view.

**Parameters:**
- `set` (`java.util.Set<K>`)
- `function` ([`com.google.common.base.Function<? super K,V>`](../base/Function.md))

### `asMap(java.util.SortedSet<K> set, com.google.common.base.Function<? super K,V> function)`

**Returns:** `java.util.SortedMap<K,V>`

Specifically, for each k in the backing set, the returned map has an entry mapping
 k to function.apply(k). The keySet, values, and 
 entrySet views of the returned map iterate in the same order as the backing set.

 
Modifications to the backing set are read through to the returned map. The returned map
 supports removal operations if the backing set does. Removal operations write through to the
 backing set. The returned map does not support put operations.

 
**Warning:** If the function rejects null, caution is required to make sure the
 set does not contain null, because the view cannot stop null from being added
 to the set.

 
**Warning:** This method assumes that for any instance k of key type K,
 k.equals(k2) implies that k2 is also of type K. Using a key type for
 which this may not hold, such as ArrayList, may risk a ClassCastException when
 calling methods on the resulting map view.

**Parameters:**
- `set` (`java.util.SortedSet<K>`)
- `function` ([`com.google.common.base.Function<? super K,V>`](../base/Function.md))

### `asMap(java.util.NavigableSet<K> set, com.google.common.base.Function<? super K,V> function)`

**Returns:** `java.util.NavigableMap<K,V>`

Specifically, for each k in the backing set, the returned map has an entry mapping
 k to function.apply(k). The keySet, values, and 
 entrySet views of the returned map iterate in the same order as the backing set.

 
Modifications to the backing set are read through to the returned map. The returned map
 supports removal operations if the backing set does. Removal operations write through to the
 backing set. The returned map does not support put operations.

 
**Warning:** If the function rejects null, caution is required to make sure the
 set does not contain null, because the view cannot stop null from being added
 to the set.

 
**Warning:** This method assumes that for any instance k of key type K,
 k.equals(k2) implies that k2 is also of type K. Using a key type for
 which this may not hold, such as ArrayList, may risk a ClassCastException when
 calling methods on the resulting map view.

**Parameters:**
- `set` (`java.util.NavigableSet<K>`)
- `function` ([`com.google.common.base.Function<? super K,V>`](../base/Function.md))

### `asMapEntryIterator(java.util.Set<K> set, com.google.common.base.Function<? super K,V> function)`

**Returns:** `java.util.Iterator<java.util.Map.Entry<K,V>>`

**Parameters:**
- `set` (`java.util.Set<K>`)
- `function` ([`com.google.common.base.Function<? super K,V>`](../base/Function.md))

### `removeOnlySet(java.util.Set<E> set)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `set` (`java.util.Set<E>`)

### `removeOnlySortedSet(java.util.SortedSet<E> set)`

**Returns:** `java.util.SortedSet<E>`

**Parameters:**
- `set` (`java.util.SortedSet<E>`)

### `removeOnlyNavigableSet(java.util.NavigableSet<E> set)`

**Returns:** `java.util.NavigableSet<E>`

**Parameters:**
- `set` (`java.util.NavigableSet<E>`)

### `toMap(java.lang.Iterable<K> keys, com.google.common.base.Function<? super K,V> valueFunction)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

The map's iteration order is the order of
 the first appearance of each key in keys.

 
When there are multiple instances of a key in keys, it is unspecified whether 
 valueFunction will be applied to more than one instance of that key and, if it is, which
 result will be mapped to that key in the returned map.

 
If keys is a Set, a live view can be obtained instead of a copy using Maps#asMap(Set, Function).

**Parameters:**
- `keys` (`java.lang.Iterable<K>`)
- `valueFunction` ([`com.google.common.base.Function<? super K,V>`](../base/Function.md))

### `toMap(java.util.Iterator<K> keys, com.google.common.base.Function<? super K,V> valueFunction)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

The map's iteration order is the order of
 the first appearance of each key in keys.

 
When there are multiple instances of a key in keys, it is unspecified whether 
 valueFunction will be applied to more than one instance of that key and, if it is, which
 result will be mapped to that key in the returned map.

**Parameters:**
- `keys` (`java.util.Iterator<K>`)
- `valueFunction` ([`com.google.common.base.Function<? super K,V>`](../base/Function.md))

### `uniqueIndex(java.lang.Iterable<V> values, com.google.common.base.Function<? super V,K> keyFunction)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

In
 other words, each input value produces an entry in the map whose key is the result of applying
 keyFunction to that value. These entries appear in the same order as the input values.
 Example usage:

 

```

 Color red = new Color("red", 255, 0, 0);
 ...
 ImmutableSet<Color> allColors = ImmutableSet.of(red, green, blue);

 ImmutableMap<String, Color> colorForName =
     uniqueIndex(allColors, c -> c.toString());
 assertThat(colorForName).containsEntry("red", red);
 
```


 
If your index may associate multiple values with each key, use Multimaps.index.

 
**Note:** on Java 8 and later, it is usually better to use streams. For example:

 

```

 import static com.google.common.collect.ImmutableMap.toImmutableMap;
 ...
 ImmutableMap<String, Color> colorForName =
     allColors.stream().collect(toImmutableMap(c -> c.toString(), c -> c));
 
```


 
Streams provide a more standard and flexible API and the lambdas make it clear what the keys
 and values in the map are.

**Parameters:**
- `values` (`java.lang.Iterable<V>`): the values to use when constructing the Map
- `keyFunction` ([`com.google.common.base.Function<? super V,K>`](../base/Function.md)): the function used to produce the key for each value

### `uniqueIndex(java.util.Iterator<V> values, com.google.common.base.Function<? super V,K> keyFunction)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

In
 other words, each input value produces an entry in the map whose key is the result of applying
 keyFunction to that value. These entries appear in the same order as the input values.
 Example usage:

 

```

 Color red = new Color("red", 255, 0, 0);
 ...
 Iterator<Color> allColors = ImmutableSet.of(red, green, blue).iterator();

 Map<String, Color> colorForName =
     uniqueIndex(allColors, toStringFunction());
 assertThat(colorForName).containsEntry("red", red);
 
```


 
If your index may associate multiple values with each key, use Multimaps.index.

**Parameters:**
- `values` (`java.util.Iterator<V>`): the values to use when constructing the Map
- `keyFunction` ([`com.google.common.base.Function<? super V,K>`](../base/Function.md)): the function used to produce the key for each value

### `uniqueIndex(java.util.Iterator<V> values, com.google.common.base.Function<? super V,K> keyFunction, com.google.common.collect.ImmutableMap.Builder<K,V> builder)`

**Returns:** [`com.google.common.collect.ImmutableMap<K,V>`](./ImmutableMap.md)

**Parameters:**
- `values` (`java.util.Iterator<V>`)
- `keyFunction` ([`com.google.common.base.Function<? super V,K>`](../base/Function.md))
- `builder` (`com.google.common.collect.ImmutableMap.Builder<K,V>`)

### `fromProperties(java.util.Properties properties)`

**Returns:** [`com.google.common.collect.ImmutableMap<java.lang.String,java.lang.String>`](./ImmutableMap.md)

Properties
 normally derive from Map<Object, Object>, but they typically contain strings, which is
 awkward. This method lets you get a plain-old-Map out of a Properties.

**Parameters:**
- `properties` (`java.util.Properties`): a Properties object to be converted

### `immutableEntry(K key, V value)`

**Returns:** `java.util.Map.Entry<K,V>`

The Entry#setValue
 operation throws an UnsupportedOperationException.

 
The returned entry is serializable.

 
**Java 9 users:** consider using java.util.Map.entry(key, value) if the key and
 value are non-null and the entry does not need to be serializable.

**Parameters:**
- `key` (`K`): the key to be associated with the returned entry
- `value` (`V`): the value to be associated with the returned entry

### `unmodifiableEntrySet(java.util.Set<java.util.Map.Entry<K,V>> entrySet)`

**Returns:** `java.util.Set<java.util.Map.Entry<K,V>>`

The Entry#setValue
 operation throws an UnsupportedOperationException, as do any operations that would
 modify the returned set.

**Parameters:**
- `entrySet` (`java.util.Set<java.util.Map.Entry<K,V>>`): the entries for which to return an unmodifiable view

### `unmodifiableEntry(java.util.Map.Entry<? extends K,? extends V> entry)`

**Returns:** `java.util.Map.Entry<K,V>`

The Entry#setValue operation
 throws an UnsupportedOperationException. This also has the side effect of redefining
 equals to comply with the Entry contract, to avoid a possible nefarious implementation
 of equals.

**Parameters:**
- `entry` (`java.util.Map.Entry<? extends K,? extends V>`): the entry for which to return an unmodifiable view

### `unmodifiableEntryIterator(java.util.Iterator<java.util.Map.Entry<K,V>> entryIterator)`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<java.util.Map.Entry<K,V>>`](./UnmodifiableIterator.md)

**Parameters:**
- `entryIterator` (`java.util.Iterator<java.util.Map.Entry<K,V>>`)

### `asConverter(com.google.common.collect.BiMap<A,B> bimap)`

**Returns:** [`com.google.common.base.Converter<A,B>`](../base/Converter.md)

To use a plain Map as a Function, see com.google.common.base.Functions#forMap(Map) or com.google.common.base.Functions#forMap(Map, Object).

**Parameters:**
- `bimap` ([`com.google.common.collect.BiMap<A,B>`](./BiMap.md))

### `synchronizedBiMap(com.google.common.collect.BiMap<K,V> bimap)`

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

In order to guarantee
 serial access, it is critical that **all** access to the backing bimap is accomplished
 through the returned bimap.

 
It is imperative that the user manually synchronize on the returned map when accessing any
 of its collection views:

 

```

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
 
```


 
Failure to follow this advice may result in non-deterministic behavior.

 
The returned bimap will be serializable if the specified bimap is serializable.

**Parameters:**
- `bimap` ([`com.google.common.collect.BiMap<K,V>`](./BiMap.md)): the bimap to be wrapped in a synchronized view

### `unmodifiableBiMap(com.google.common.collect.BiMap<? extends K,? extends V> bimap)`

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

This method allows modules to provide
 users with "read-only" access to internal bimaps. Query operations on the returned bimap "read
 through" to the specified bimap, and attempts to modify the returned map, whether direct or via
 its collection views, result in an UnsupportedOperationException.

 
The returned bimap will be serializable if the specified bimap is serializable.

**Parameters:**
- `bimap` ([`com.google.common.collect.BiMap<? extends K,? extends V>`](./BiMap.md)): the bimap for which an unmodifiable view is to be returned

### `transformValues(java.util.Map<K,V1> fromMap, com.google.common.base.Function<? super V1,V2> function)`

**Returns:** `java.util.Map<K,V2>`

All other properties of
 the map, such as iteration order, are left intact. For example, the code:

 

```

 Map<String, Integer> map = ImmutableMap.of("a", 4, "b", 9);
 Function<Integer, Double> sqrt =
     new Function<Integer, Double>() {
       public Double apply(Integer in) {
         return Math.sqrt((int) in);
       }
     };
 Map<String, Double> transformed = Maps.transformValues(map, sqrt);
 System.out.println(transformed);
 
```


 ... prints {a=2.0, b=3.0}.

 
Changes in the underlying map are reflected in this view. Conversely, this view supports
 removal operations, and these are reflected in the underlying map.

 
It's acceptable for the underlying map to contain null keys, and even null values provided
 that the function is capable of accepting null input. The transformed map might contain null
 values, if the function sometimes gives a null result.

 
The returned map is not thread-safe or serializable, even if the underlying map is.

 
The function is applied lazily, invoked when needed. This is necessary for the returned map
 to be a view, but it means that the function will be applied many times for bulk operations
 like Map#containsValue and Map.toString(). For this to perform well, 
 function should be fast. To avoid lazy evaluation when the returned map doesn't need to be a
 view, copy the returned map into a new map of your choosing.

**Parameters:**
- `fromMap` (`java.util.Map<K,V1>`)
- `function` ([`com.google.common.base.Function<? super V1,V2>`](../base/Function.md))

### `transformValues(java.util.SortedMap<K,V1> fromMap, com.google.common.base.Function<? super V1,V2> function)`

**Returns:** `java.util.SortedMap<K,V2>`

All other
 properties of the map, such as iteration order, are left intact. For example, the code:

 

```

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
 
```


 ... prints {a=2.0, b=3.0}.

 
Changes in the underlying map are reflected in this view. Conversely, this view supports
 removal operations, and these are reflected in the underlying map.

 
It's acceptable for the underlying map to contain null keys, and even null values provided
 that the function is capable of accepting null input. The transformed map might contain null
 values, if the function sometimes gives a null result.

 
The returned map is not thread-safe or serializable, even if the underlying map is.

 
The function is applied lazily, invoked when needed. This is necessary for the returned map
 to be a view, but it means that the function will be applied many times for bulk operations
 like Map#containsValue and Map.toString(). For this to perform well, 
 function should be fast. To avoid lazy evaluation when the returned map doesn't need to be a
 view, copy the returned map into a new map of your choosing.

**Parameters:**
- `fromMap` (`java.util.SortedMap<K,V1>`)
- `function` ([`com.google.common.base.Function<? super V1,V2>`](../base/Function.md))

### `transformValues(java.util.NavigableMap<K,V1> fromMap, com.google.common.base.Function<? super V1,V2> function)`

**Returns:** `java.util.NavigableMap<K,V2>`

All other
 properties of the map, such as iteration order, are left intact. For example, the code:

 

```

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
 
```


 ... prints {a=2.0, b=3.0}.

 
Changes in the underlying map are reflected in this view. Conversely, this view supports
 removal operations, and these are reflected in the underlying map.

 
It's acceptable for the underlying map to contain null keys, and even null values provided
 that the function is capable of accepting null input. The transformed map might contain null
 values, if the function sometimes gives a null result.

 
The returned map is not thread-safe or serializable, even if the underlying map is.

 
The function is applied lazily, invoked when needed. This is necessary for the returned map
 to be a view, but it means that the function will be applied many times for bulk operations
 like Map#containsValue and Map.toString(). For this to perform well, 
 function should be fast. To avoid lazy evaluation when the returned map doesn't need to be a
 view, copy the returned map into a new map of your choosing.

**Parameters:**
- `fromMap` (`java.util.NavigableMap<K,V1>`)
- `function` ([`com.google.common.base.Function<? super V1,V2>`](../base/Function.md))

### `transformEntries(java.util.Map<K,V1> fromMap, com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2> transformer)`

**Returns:** `java.util.Map<K,V2>`

In contrast
 to #transformValues, this method's entry-transformation logic may depend on the key as
 well as the value.

 
All other properties of the transformed map, such as iteration order, are left intact. For
 example, the code:

 

```

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
 
```


 ... prints {verbose=verbose, sort=nosort}.

 
Changes in the underlying map are reflected in this view. Conversely, this view supports
 removal operations, and these are reflected in the underlying map.

 
It's acceptable for the underlying map to contain null keys and null values provided that
 the transformer is capable of accepting null inputs. The transformed map might contain null
 values if the transformer sometimes gives a null result.

 
The returned map is not thread-safe or serializable, even if the underlying map is.

 
The transformer is applied lazily, invoked when needed. This is necessary for the returned
 map to be a view, but it means that the transformer will be applied many times for bulk
 operations like Map#containsValue and Object#toString. For this to perform
 well, transformer should be fast. To avoid lazy evaluation when the returned map
 doesn't need to be a view, copy the returned map into a new map of your choosing.

 
**Warning:** This method assumes that for any instance k of 
 EntryTransformer key type K, k.equals(k2) implies that k2 is also of
 type K. Using an EntryTransformer key type for which this may not hold, such as
 ArrayList, may risk a ClassCastException when calling methods on the
 transformed map.

**Parameters:**
- `fromMap` (`java.util.Map<K,V1>`)
- `transformer` (`com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2>`)

### `transformEntries(java.util.SortedMap<K,V1> fromMap, com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2> transformer)`

**Returns:** `java.util.SortedMap<K,V2>`

In contrast to #transformValues, this method's entry-transformation logic may depend on
 the key as well as the value.

 
All other properties of the transformed map, such as iteration order, are left intact. For
 example, the code:

 

```

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
 
```


 ... prints {sort=yessort, verbose=verbose}.

 
Changes in the underlying map are reflected in this view. Conversely, this view supports
 removal operations, and these are reflected in the underlying map.

 
It's acceptable for the underlying map to contain null keys and null values provided that
 the transformer is capable of accepting null inputs. The transformed map might contain null
 values if the transformer sometimes gives a null result.

 
The returned map is not thread-safe or serializable, even if the underlying map is.

 
The transformer is applied lazily, invoked when needed. This is necessary for the returned
 map to be a view, but it means that the transformer will be applied many times for bulk
 operations like Map#containsValue and Object#toString. For this to perform
 well, transformer should be fast. To avoid lazy evaluation when the returned map
 doesn't need to be a view, copy the returned map into a new map of your choosing.

 
**Warning:** This method assumes that for any instance k of 
 EntryTransformer key type K, k.equals(k2) implies that k2 is also of
 type K. Using an EntryTransformer key type for which this may not hold, such as
 ArrayList, may risk a ClassCastException when calling methods on the
 transformed map.

**Parameters:**
- `fromMap` (`java.util.SortedMap<K,V1>`)
- `transformer` (`com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2>`)

### `transformEntries(java.util.NavigableMap<K,V1> fromMap, com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2> transformer)`

**Returns:** `java.util.NavigableMap<K,V2>`

In contrast to #transformValues, this method's entry-transformation logic may
 depend on the key as well as the value.

 
All other properties of the transformed map, such as iteration order, are left intact. For
 example, the code:

 

```

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
 
```


 ... prints {sort=yessort, verbose=verbose}.

 
Changes in the underlying map are reflected in this view. Conversely, this view supports
 removal operations, and these are reflected in the underlying map.

 
It's acceptable for the underlying map to contain null keys and null values provided that
 the transformer is capable of accepting null inputs. The transformed map might contain null
 values if the transformer sometimes gives a null result.

 
The returned map is not thread-safe or serializable, even if the underlying map is.

 
The transformer is applied lazily, invoked when needed. This is necessary for the returned
 map to be a view, but it means that the transformer will be applied many times for bulk
 operations like Map#containsValue and Object#toString. For this to perform
 well, transformer should be fast. To avoid lazy evaluation when the returned map
 doesn't need to be a view, copy the returned map into a new map of your choosing.

 
**Warning:** This method assumes that for any instance k of 
 EntryTransformer key type K, k.equals(k2) implies that k2 is also of
 type K. Using an EntryTransformer key type for which this may not hold, such as
 ArrayList, may risk a ClassCastException when calling methods on the
 transformed map.

**Parameters:**
- `fromMap` (`java.util.NavigableMap<K,V1>`)
- `transformer` (`com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2>`)

### `asEntryTransformer(com.google.common.base.Function<? super V1,V2> function)`

**Returns:** `com.google.common.collect.Maps.EntryTransformer<K,V1,V2>`

**Parameters:**
- `function` ([`com.google.common.base.Function<? super V1,V2>`](../base/Function.md))

### `asValueToValueFunction(com.google.common.collect.Maps.EntryTransformer<? super K,V1,V2> transformer, K key)`

**Returns:** [`com.google.common.base.Function<V1,V2>`](../base/Function.md)

**Parameters:**
- `transformer` (`com.google.common.collect.Maps.EntryTransformer<? super K,V1,V2>`)
- `key` (`K`)

### `asEntryToValueFunction(com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2> transformer)`

**Returns:** [`com.google.common.base.Function<java.util.Map.Entry<K,V1>,V2>`](../base/Function.md)

**Parameters:**
- `transformer` (`com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2>`)

### `transformEntry(com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2> transformer, java.util.Map.Entry<K,V1> entry)`

**Returns:** `java.util.Map.Entry<K,V2>`

**Parameters:**
- `transformer` (`com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2>`)
- `entry` (`java.util.Map.Entry<K,V1>`)

### `asEntryToEntryFunction(com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2> transformer)`

**Returns:** [`com.google.common.base.Function<java.util.Map.Entry<K,V1>,java.util.Map.Entry<K,V2>>`](../base/Function.md)

**Parameters:**
- `transformer` (`com.google.common.collect.Maps.EntryTransformer<? super K,? super V1,V2>`)

### `keyPredicateOnEntries(com.google.common.base.Predicate<? super K> keyPredicate)`

**Returns:** [`com.google.common.base.Predicate<java.util.Map.Entry<K,?>>`](../base/Predicate.md)

**Parameters:**
- `keyPredicate` ([`com.google.common.base.Predicate<? super K>`](../base/Predicate.md))

### `valuePredicateOnEntries(com.google.common.base.Predicate<? super V> valuePredicate)`

**Returns:** [`com.google.common.base.Predicate<java.util.Map.Entry<?,V>>`](../base/Predicate.md)

**Parameters:**
- `valuePredicate` ([`com.google.common.base.Predicate<? super V>`](../base/Predicate.md))

### `filterKeys(java.util.Map<K,V> unfiltered, com.google.common.base.Predicate<? super K> keyPredicate)`

**Returns:** `java.util.Map<K,V>`

The
 returned map is a live view of unfiltered; changes to one affect the other.

 
The resulting map's keySet(), entrySet(), and values() views have
 iterators that don't support remove(), but all other methods are supported by the map
 and its views. When given a key that doesn't satisfy the predicate, the map's put() and
 putAll() methods throw an IllegalArgumentException.

 
When methods such as removeAll() and clear() are called on the filtered map
 or its views, only mappings whose keys satisfy the filter will be removed from the underlying
 map.

 
The returned map isn't threadsafe or serializable, even if unfiltered is.

 
Many of the filtered map's methods, such as size(), iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 *not* needed, it may be faster to copy the filtered map and use the copy.

 
**Warning:** keyPredicate must be *consistent with equals*, as documented at
 Predicate#apply. Do not provide a predicate such as 
 Predicates.instanceOf(ArrayList.class), which is inconsistent with equals.

**Parameters:**
- `unfiltered` (`java.util.Map<K,V>`)
- `keyPredicate` ([`com.google.common.base.Predicate<? super K>`](../base/Predicate.md))

### `filterKeys(java.util.SortedMap<K,V> unfiltered, com.google.common.base.Predicate<? super K> keyPredicate)`

**Returns:** `java.util.SortedMap<K,V>`

The returned map is a live view of unfiltered; changes to one affect the
 other.

 
The resulting map's keySet(), entrySet(), and values() views have
 iterators that don't support remove(), but all other methods are supported by the map
 and its views. When given a key that doesn't satisfy the predicate, the map's put() and
 putAll() methods throw an IllegalArgumentException.

 
When methods such as removeAll() and clear() are called on the filtered map
 or its views, only mappings whose keys satisfy the filter will be removed from the underlying
 map.

 
The returned map isn't threadsafe or serializable, even if unfiltered is.

 
Many of the filtered map's methods, such as size(), iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 *not* needed, it may be faster to copy the filtered map and use the copy.

 
**Warning:** keyPredicate must be *consistent with equals*, as documented at
 Predicate#apply. Do not provide a predicate such as 
 Predicates.instanceOf(ArrayList.class), which is inconsistent with equals.

**Parameters:**
- `unfiltered` (`java.util.SortedMap<K,V>`)
- `keyPredicate` ([`com.google.common.base.Predicate<? super K>`](../base/Predicate.md))

### `filterKeys(java.util.NavigableMap<K,V> unfiltered, com.google.common.base.Predicate<? super K> keyPredicate)`

**Returns:** `java.util.NavigableMap<K,V>`

The returned map is a live view of unfiltered; changes to one affect the
 other.

 
The resulting map's keySet(), entrySet(), and values() views have
 iterators that don't support remove(), but all other methods are supported by the map
 and its views. When given a key that doesn't satisfy the predicate, the map's put() and
 putAll() methods throw an IllegalArgumentException.

 
When methods such as removeAll() and clear() are called on the filtered map
 or its views, only mappings whose keys satisfy the filter will be removed from the underlying
 map.

 
The returned map isn't threadsafe or serializable, even if unfiltered is.

 
Many of the filtered map's methods, such as size(), iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 *not* needed, it may be faster to copy the filtered map and use the copy.

 
**Warning:** keyPredicate must be *consistent with equals*, as documented at
 Predicate#apply. Do not provide a predicate such as 
 Predicates.instanceOf(ArrayList.class), which is inconsistent with equals.

**Parameters:**
- `unfiltered` (`java.util.NavigableMap<K,V>`)
- `keyPredicate` ([`com.google.common.base.Predicate<? super K>`](../base/Predicate.md))

### `filterKeys(com.google.common.collect.BiMap<K,V> unfiltered, com.google.common.base.Predicate<? super K> keyPredicate)`

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

The returned bimap is a live view of unfiltered; changes to one affect the other.

 
The resulting bimap's keySet(), entrySet(), and values() views have
 iterators that don't support remove(), but all other methods are supported by the bimap
 and its views. When given a key that doesn't satisfy the predicate, the bimap's put(),
 forcePut() and putAll() methods throw an IllegalArgumentException.

 
When methods such as removeAll() and clear() are called on the filtered
 bimap or its views, only mappings that satisfy the filter will be removed from the underlying
 bimap.

 
The returned bimap isn't threadsafe or serializable, even if unfiltered is.

 
Many of the filtered bimap's methods, such as size(), iterate across every key in
 the underlying bimap and determine which satisfy the filter. When a live view is *not*
 needed, it may be faster to copy the filtered bimap and use the copy.

 
**Warning:** entryPredicate must be *consistent with equals *, as documented
 at Predicate#apply.

**Parameters:**
- `unfiltered` ([`com.google.common.collect.BiMap<K,V>`](./BiMap.md))
- `keyPredicate` ([`com.google.common.base.Predicate<? super K>`](../base/Predicate.md))

### `filterValues(java.util.Map<K,V> unfiltered, com.google.common.base.Predicate<? super V> valuePredicate)`

**Returns:** `java.util.Map<K,V>`

The returned map is a live view of unfiltered; changes to one affect the other.

 
The resulting map's keySet(), entrySet(), and values() views have
 iterators that don't support remove(), but all other methods are supported by the map
 and its views. When given a value that doesn't satisfy the predicate, the map's put(),
 putAll(), and Entry#setValue methods throw an IllegalArgumentException.

 
When methods such as removeAll() and clear() are called on the filtered map
 or its views, only mappings whose values satisfy the filter will be removed from the underlying
 map.

 
The returned map isn't threadsafe or serializable, even if unfiltered is.

 
Many of the filtered map's methods, such as size(), iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 *not* needed, it may be faster to copy the filtered map and use the copy.

 
**Warning:** valuePredicate must be *consistent with equals*, as documented
 at Predicate#apply. Do not provide a predicate such as 
 Predicates.instanceOf(ArrayList.class), which is inconsistent with equals.

**Parameters:**
- `unfiltered` (`java.util.Map<K,V>`)
- `valuePredicate` ([`com.google.common.base.Predicate<? super V>`](../base/Predicate.md))

### `filterValues(java.util.SortedMap<K,V> unfiltered, com.google.common.base.Predicate<? super V> valuePredicate)`

**Returns:** `java.util.SortedMap<K,V>`

The returned map is a live view of unfiltered; changes to one affect the
 other.

 
The resulting map's keySet(), entrySet(), and values() views have
 iterators that don't support remove(), but all other methods are supported by the map
 and its views. When given a value that doesn't satisfy the predicate, the map's put(),
 putAll(), and Entry#setValue methods throw an IllegalArgumentException.

 
When methods such as removeAll() and clear() are called on the filtered map
 or its views, only mappings whose values satisfy the filter will be removed from the underlying
 map.

 
The returned map isn't threadsafe or serializable, even if unfiltered is.

 
Many of the filtered map's methods, such as size(), iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 *not* needed, it may be faster to copy the filtered map and use the copy.

 
**Warning:** valuePredicate must be *consistent with equals*, as documented
 at Predicate#apply. Do not provide a predicate such as 
 Predicates.instanceOf(ArrayList.class), which is inconsistent with equals.

**Parameters:**
- `unfiltered` (`java.util.SortedMap<K,V>`)
- `valuePredicate` ([`com.google.common.base.Predicate<? super V>`](../base/Predicate.md))

### `filterValues(java.util.NavigableMap<K,V> unfiltered, com.google.common.base.Predicate<? super V> valuePredicate)`

**Returns:** `java.util.NavigableMap<K,V>`

The returned map is a live view of unfiltered; changes to one affect the
 other.

 
The resulting map's keySet(), entrySet(), and values() views have
 iterators that don't support remove(), but all other methods are supported by the map
 and its views. When given a value that doesn't satisfy the predicate, the map's put(),
 putAll(), and Entry#setValue methods throw an IllegalArgumentException.

 
When methods such as removeAll() and clear() are called on the filtered map
 or its views, only mappings whose values satisfy the filter will be removed from the underlying
 map.

 
The returned map isn't threadsafe or serializable, even if unfiltered is.

 
Many of the filtered map's methods, such as size(), iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 *not* needed, it may be faster to copy the filtered map and use the copy.

 
**Warning:** valuePredicate must be *consistent with equals*, as documented
 at Predicate#apply. Do not provide a predicate such as 
 Predicates.instanceOf(ArrayList.class), which is inconsistent with equals.

**Parameters:**
- `unfiltered` (`java.util.NavigableMap<K,V>`)
- `valuePredicate` ([`com.google.common.base.Predicate<? super V>`](../base/Predicate.md))

### `filterValues(com.google.common.collect.BiMap<K,V> unfiltered, com.google.common.base.Predicate<? super V> valuePredicate)`

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

The returned bimap is a live view of unfiltered; changes to one affect the other.

 
The resulting bimap's keySet(), entrySet(), and values() views have
 iterators that don't support remove(), but all other methods are supported by the bimap
 and its views. When given a value that doesn't satisfy the predicate, the bimap's 
 put(), forcePut() and putAll() methods throw an IllegalArgumentException. Similarly, the map's entries have a Entry#setValue method
 that throws an IllegalArgumentException when the provided value doesn't satisfy the
 predicate.

 
When methods such as removeAll() and clear() are called on the filtered
 bimap or its views, only mappings that satisfy the filter will be removed from the underlying
 bimap.

 
The returned bimap isn't threadsafe or serializable, even if unfiltered is.

 
Many of the filtered bimap's methods, such as size(), iterate across every value in
 the underlying bimap and determine which satisfy the filter. When a live view is *not*
 needed, it may be faster to copy the filtered bimap and use the copy.

 
**Warning:** entryPredicate must be *consistent with equals *, as documented
 at Predicate#apply.

**Parameters:**
- `unfiltered` ([`com.google.common.collect.BiMap<K,V>`](./BiMap.md))
- `valuePredicate` ([`com.google.common.base.Predicate<? super V>`](../base/Predicate.md))

### `filterEntries(java.util.Map<K,V> unfiltered, com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>> entryPredicate)`

**Returns:** `java.util.Map<K,V>`

The
 returned map is a live view of unfiltered; changes to one affect the other.

 
The resulting map's keySet(), entrySet(), and values() views have
 iterators that don't support remove(), but all other methods are supported by the map
 and its views. When given a key/value pair that doesn't satisfy the predicate, the map's 
 put() and putAll() methods throw an IllegalArgumentException. Similarly, the
 map's entries have a Entry#setValue method that throws an IllegalArgumentException when the existing key and the provided value don't satisfy the
 predicate.

 
When methods such as removeAll() and clear() are called on the filtered map
 or its views, only mappings that satisfy the filter will be removed from the underlying map.

 
The returned map isn't threadsafe or serializable, even if unfiltered is.

 
Many of the filtered map's methods, such as size(), iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 *not* needed, it may be faster to copy the filtered map and use the copy.

 
**Warning:** entryPredicate must be *consistent with equals*, as documented
 at Predicate#apply.

**Parameters:**
- `unfiltered` (`java.util.Map<K,V>`)
- `entryPredicate` ([`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate.md))

### `filterEntries(java.util.SortedMap<K,V> unfiltered, com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>> entryPredicate)`

**Returns:** `java.util.SortedMap<K,V>`

The returned map is a live view of unfiltered; changes to one affect the other.

 
The resulting map's keySet(), entrySet(), and values() views have
 iterators that don't support remove(), but all other methods are supported by the map
 and its views. When given a key/value pair that doesn't satisfy the predicate, the map's 
 put() and putAll() methods throw an IllegalArgumentException. Similarly, the
 map's entries have a Entry#setValue method that throws an IllegalArgumentException when the existing key and the provided value don't satisfy the
 predicate.

 
When methods such as removeAll() and clear() are called on the filtered map
 or its views, only mappings that satisfy the filter will be removed from the underlying map.

 
The returned map isn't threadsafe or serializable, even if unfiltered is.

 
Many of the filtered map's methods, such as size(), iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 *not* needed, it may be faster to copy the filtered map and use the copy.

 
**Warning:** entryPredicate must be *consistent with equals*, as documented
 at Predicate#apply.

**Parameters:**
- `unfiltered` (`java.util.SortedMap<K,V>`)
- `entryPredicate` ([`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate.md))

### `filterEntries(java.util.NavigableMap<K,V> unfiltered, com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>> entryPredicate)`

**Returns:** `java.util.NavigableMap<K,V>`

The returned map is a live view of unfiltered; changes to one affect the other.

 
The resulting map's keySet(), entrySet(), and values() views have
 iterators that don't support remove(), but all other methods are supported by the map
 and its views. When given a key/value pair that doesn't satisfy the predicate, the map's 
 put() and putAll() methods throw an IllegalArgumentException. Similarly, the
 map's entries have a Entry#setValue method that throws an IllegalArgumentException when the existing key and the provided value don't satisfy the
 predicate.

 
When methods such as removeAll() and clear() are called on the filtered map
 or its views, only mappings that satisfy the filter will be removed from the underlying map.

 
The returned map isn't threadsafe or serializable, even if unfiltered is.

 
Many of the filtered map's methods, such as size(), iterate across every key/value
 mapping in the underlying map and determine which satisfy the filter. When a live view is
 *not* needed, it may be faster to copy the filtered map and use the copy.

 
**Warning:** entryPredicate must be *consistent with equals*, as documented
 at Predicate#apply.

**Parameters:**
- `unfiltered` (`java.util.NavigableMap<K,V>`)
- `entryPredicate` ([`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate.md))

### `filterEntries(com.google.common.collect.BiMap<K,V> unfiltered, com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>> entryPredicate)`

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

The
 returned bimap is a live view of unfiltered; changes to one affect the other.

 
The resulting bimap's keySet(), entrySet(), and values() views have
 iterators that don't support remove(), but all other methods are supported by the bimap
 and its views. When given a key/value pair that doesn't satisfy the predicate, the bimap's
 put(), forcePut() and putAll() methods throw an IllegalArgumentException. Similarly, the map's entries have an Entry#setValue method
 that throws an IllegalArgumentException when the existing key and the provided value
 don't satisfy the predicate.

 
When methods such as removeAll() and clear() are called on the filtered
 bimap or its views, only mappings that satisfy the filter will be removed from the underlying
 bimap.

 
The returned bimap isn't threadsafe or serializable, even if unfiltered is.

 
Many of the filtered bimap's methods, such as size(), iterate across every key/value
 mapping in the underlying bimap and determine which satisfy the filter. When a live view is
 *not* needed, it may be faster to copy the filtered bimap and use the copy.

 
**Warning:** entryPredicate must be *consistent with equals *, as documented
 at Predicate#apply.

**Parameters:**
- `unfiltered` ([`com.google.common.collect.BiMap<K,V>`](./BiMap.md))
- `entryPredicate` ([`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate.md))

### `filterFiltered(com.google.common.collect.Maps.AbstractFilteredMap<K,V> map, com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>> entryPredicate)`

**Returns:** `java.util.Map<K,V>`

**Parameters:**
- `map` (`com.google.common.collect.Maps.AbstractFilteredMap<K,V>`)
- `entryPredicate` ([`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate.md))

### `filterFiltered(com.google.common.collect.Maps.FilteredEntrySortedMap<K,V> map, com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>> entryPredicate)`

**Returns:** `java.util.SortedMap<K,V>`

**Parameters:**
- `map` (`com.google.common.collect.Maps.FilteredEntrySortedMap<K,V>`)
- `entryPredicate` ([`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate.md))

### `filterFiltered(com.google.common.collect.Maps.FilteredEntryNavigableMap<K,V> map, com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>> entryPredicate)`

**Returns:** `java.util.NavigableMap<K,V>`

**Parameters:**
- `map` (`com.google.common.collect.Maps.FilteredEntryNavigableMap<K,V>`)
- `entryPredicate` ([`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate.md))

### `filterFiltered(com.google.common.collect.Maps.FilteredEntryBiMap<K,V> map, com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>> entryPredicate)`

**Returns:** [`com.google.common.collect.BiMap<K,V>`](./BiMap.md)

**Parameters:**
- `map` (`com.google.common.collect.Maps.FilteredEntryBiMap<K,V>`)
- `entryPredicate` ([`com.google.common.base.Predicate<? super java.util.Map.Entry<K,V>>`](../base/Predicate.md))

### `unmodifiableNavigableMap(java.util.NavigableMap<K,? extends V> map)`

**Returns:** `java.util.NavigableMap<K,V>`

Query operations on the returned
 map read through to the specified map, and attempts to modify the returned map, whether direct
 or via its views, result in an UnsupportedOperationException.

 
The returned navigable map will be serializable if the specified navigable map is
 serializable.

 
This method's signature will not permit you to convert a NavigableMap<? extends K,
 V> to a NavigableMap<K, V>. If it permitted this, the returned map's 
 comparator() method might return a Comparator<? extends K>, which works only on a
 particular subtype of K, but promise that it's a Comparator<? super K>, which
 must work on any type of K.

**Parameters:**
- `map` (`java.util.NavigableMap<K,? extends V>`): the navigable map for which an unmodifiable view is to be returned

### `unmodifiableOrNull(java.util.Map.Entry<K,? extends V> entry)`

**Returns:** `java.util.Map.Entry<K,V>`

**Parameters:**
- `entry` (`java.util.Map.Entry<K,? extends V>`)

### `synchronizedNavigableMap(java.util.NavigableMap<K,V> navigableMap)`

**Returns:** `java.util.NavigableMap<K,V>`

In
 order to guarantee serial access, it is critical that **all** access to the backing
 navigable map is accomplished through the returned navigable map (or its views).

 
It is imperative that the user manually synchronize on the returned navigable map when
 iterating over any of its collection views, or the collections views of any of its 
 descendingMap, subMap, headMap or tailMap views.

 

```

 NavigableMap<K, V> map = synchronizedNavigableMap(new TreeMap<K, V>());

 // Needn't be in synchronized block
 NavigableSet<K> set = map.navigableKeySet();

 synchronized (map) { // Synchronizing on map, not set!
   Iterator<K> it = set.iterator(); // Must be in synchronized block
   while (it.hasNext()) {
     foo(it.next());
   }
 }
 
```


 
or:

 

```

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
 
```


 
Failure to follow this advice may result in non-deterministic behavior.

 
The returned navigable map will be serializable if the specified navigable map is
 serializable.

**Parameters:**
- `navigableMap` (`java.util.NavigableMap<K,V>`): the navigable map to be "wrapped" in a synchronized navigable map.

### `safeGet(java.util.Map<?,V> map, java.lang.Object key)`

**Returns:** `V`

Returns null on ClassCastException and 
 NullPointerException.

**Parameters:**
- `map` (`java.util.Map<?,V>`)
- `key` (`java.lang.Object`)

### `safeContainsKey(java.util.Map<?,?> map, java.lang.Object key)`

**Returns:** `boolean`

Returns false on ClassCastException and
 NullPointerException.

**Parameters:**
- `map` (`java.util.Map<?,?>`)
- `key` (`java.lang.Object`)

### `safeRemove(java.util.Map<?,V> map, java.lang.Object key)`

**Returns:** `V`

Returns null on ClassCastException and 
 NullPointerException.

**Parameters:**
- `map` (`java.util.Map<?,V>`)
- `key` (`java.lang.Object`)

### `containsKeyImpl(java.util.Map<?,?> map, java.lang.Object key)`

**Returns:** `boolean`

**Parameters:**
- `map` (`java.util.Map<?,?>`)
- `key` (`java.lang.Object`)

### `containsValueImpl(java.util.Map<?,?> map, java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `map` (`java.util.Map<?,?>`)
- `value` (`java.lang.Object`)

### `containsEntryImpl(java.util.Collection<java.util.Map.Entry<K,V>> c, java.lang.Object o)`

**Returns:** `boolean`

If
 o is an instance of Entry, it is wrapped using #unmodifiableEntry to
 protect against a possible nefarious equals method.

 
Note that c is the backing (delegate) collection, rather than the forwarding
 collection.

**Parameters:**
- `c` (`java.util.Collection<java.util.Map.Entry<K,V>>`): the delegate (unwrapped) collection of map entries
- `o` (`java.lang.Object`): the object that might be contained in c

### `removeEntryImpl(java.util.Collection<java.util.Map.Entry<K,V>> c, java.lang.Object o)`

**Returns:** `boolean`

If
 o is an instance of Entry, it is wrapped using #unmodifiableEntry to
 protect against a possible nefarious equals method.

 
Note that c is backing (delegate) collection, rather than the forwarding collection.

**Parameters:**
- `c` (`java.util.Collection<java.util.Map.Entry<K,V>>`): the delegate (unwrapped) collection of map entries
- `o` (`java.lang.Object`): the object to remove from c

### `equalsImpl(java.util.Map<?,?> map, java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `map` (`java.util.Map<?,?>`)
- `object` (`java.lang.Object`)

### `toStringImpl(java.util.Map<?,?> map)`

**Returns:** `java.lang.String`

**Parameters:**
- `map` (`java.util.Map<?,?>`)

### `putAllImpl(java.util.Map<K,V> self, java.util.Map<? extends K,? extends V> map)`

**Returns:** `void`

**Parameters:**
- `self` (`java.util.Map<K,V>`)
- `map` (`java.util.Map<? extends K,? extends V>`)

### `keyOrNull(java.util.Map.Entry<K,?> entry)`

**Returns:** `K`

**Parameters:**
- `entry` (`java.util.Map.Entry<K,?>`)

### `valueOrNull(java.util.Map.Entry<?,V> entry)`

**Returns:** `V`

**Parameters:**
- `entry` (`java.util.Map.Entry<?,V>`)

### `indexMap(java.util.Collection<E> list)`

**Returns:** [`com.google.common.collect.ImmutableMap<E,java.lang.Integer>`](./ImmutableMap.md)

**Parameters:**
- `list` (`java.util.Collection<E>`)

### `subMap(java.util.NavigableMap<K,V> map, com.google.common.collect.Range<K> range)`

**Returns:** `java.util.NavigableMap<K,V>`

This method delegates to the appropriate methods of NavigableMap (namely subMap(), tailMap(), and headMap()) to actually construct the view. Consult these methods for a full
 description of the returned view's behavior.

 
**Warning:** Ranges always represent a range of values using the values' natural
 ordering. NavigableMap on the other hand can specify a custom ordering via a Comparator, which can violate the natural ordering. Using this method (or in general using
 Range) with unnaturally-ordered maps can lead to unexpected and undefined behavior.

**Parameters:**
- `map` (`java.util.NavigableMap<K,V>`)
- `range` ([`com.google.common.collect.Range<K>`](./Range.md))

