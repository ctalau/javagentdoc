# Class: `CollectCollectors`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.CollectCollectors`

## Description

## Fields

### `TO_IMMUTABLE_LIST`

**Type:** `java.util.stream.Collector<java.lang.Object,?,com.google.common.collect.ImmutableList<java.lang.Object>>`

### `TO_IMMUTABLE_SET`

**Type:** `java.util.stream.Collector<java.lang.Object,?,com.google.common.collect.ImmutableSet<java.lang.Object>>`

### `TO_IMMUTABLE_RANGE_SET`

**Type:** `java.util.stream.Collector<com.google.common.collect.Range<java.lang.Comparable<?>>,?,com.google.common.collect.ImmutableRangeSet<java.lang.Comparable<?>>>`

## Constructors

### `<init>()`

## Methods

### `toImmutableList()`

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableList<E>>`

### `toImmutableSet()`

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSet<E>>`

### `toImmutableSortedSet(java.util.Comparator<? super E> comparator)`

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSortedSet<E>>`

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)

### `toImmutableEnumSet()`

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSet<E>>`

### `toImmutableEnumSetGeneric()`

**Returns:** `java.util.stream.Collector<E,com.google.common.collect.CollectCollectors.EnumSetAccumulator<E>,com.google.common.collect.ImmutableSet<E>>`

### `toImmutableRangeSet()`

**Returns:** `java.util.stream.Collector<com.google.common.collect.Range<E>,?,com.google.common.collect.ImmutableRangeSet<E>>`

### `toImmutableMultiset(java.util.function.Function<? super T,? extends E> elementFunction, java.util.function.ToIntFunction<? super T> countFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMultiset<E>>`

**Parameters:**
- `elementFunction` (`java.util.function.Function<? super T,? extends E>`)
- `countFunction` (`java.util.function.ToIntFunction<? super T>`)

### `toMultiset(java.util.function.Function<? super T,E> elementFunction, java.util.function.ToIntFunction<? super T> countFunction, java.util.function.Supplier<M> multisetSupplier)`

**Returns:** `java.util.stream.Collector<T,?,M>`

**Parameters:**
- `elementFunction` (`java.util.function.Function<? super T,E>`)
- `countFunction` (`java.util.function.ToIntFunction<? super T>`)
- `multisetSupplier` (`java.util.function.Supplier<M>`)

### `toImmutableMap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

### `toImmutableMap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction, java.util.function.BinaryOperator<V> mergeFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `mergeFunction` (`java.util.function.BinaryOperator<V>`)

### `toImmutableSortedMap(java.util.Comparator<? super K> comparator, java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSortedMap<K,V>>`

**Parameters:**
- `comparator` (`java.util.Comparator<? super K>`)
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

### `toImmutableSortedMap(java.util.Comparator<? super K> comparator, java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction, java.util.function.BinaryOperator<V> mergeFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSortedMap<K,V>>`

**Parameters:**
- `comparator` (`java.util.Comparator<? super K>`)
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `mergeFunction` (`java.util.function.BinaryOperator<V>`)

### `toImmutableBiMap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableBiMap<K,V>>`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

### `toImmutableEnumMap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

### `toImmutableEnumMap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction, java.util.function.BinaryOperator<V> mergeFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `mergeFunction` (`java.util.function.BinaryOperator<V>`)

### `toImmutableRangeMap(java.util.function.Function<? super T,com.google.common.collect.Range<K>> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableRangeMap<K,V>>`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,com.google.common.collect.Range<K>>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

### `toImmutableListMultimap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableListMultimap<K,V>>`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

### `flatteningToImmutableListMultimap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends java.util.stream.Stream<? extends V>> valuesFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableListMultimap<K,V>>`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valuesFunction` (`java.util.function.Function<? super T,? extends java.util.stream.Stream<? extends V>>`)

### `toImmutableSetMultimap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSetMultimap<K,V>>`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

### `flatteningToImmutableSetMultimap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends java.util.stream.Stream<? extends V>> valuesFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSetMultimap<K,V>>`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valuesFunction` (`java.util.function.Function<? super T,? extends java.util.stream.Stream<? extends V>>`)

### `toMultimap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends V> valueFunction, java.util.function.Supplier<M> multimapSupplier)`

**Returns:** `java.util.stream.Collector<T,?,M>`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `multimapSupplier` (`java.util.function.Supplier<M>`)

### `flatteningToMultimap(java.util.function.Function<? super T,? extends K> keyFunction, java.util.function.Function<? super T,? extends java.util.stream.Stream<? extends V>> valueFunction, java.util.function.Supplier<M> multimapSupplier)`

**Returns:** `java.util.stream.Collector<T,?,M>`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends java.util.stream.Stream<? extends V>>`)
- `multimapSupplier` (`java.util.function.Supplier<M>`)

