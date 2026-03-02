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

### `toImmutableSortedSet(Comparator<? super E> comparator)`

**Parameters:**
- `comparator` (`java.util.Comparator<? super E>`)

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSortedSet<E>>`

### `toImmutableEnumSet()`

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSet<E>>`

### `toImmutableEnumSetGeneric()`

**Returns:** `java.util.stream.Collector<E,com.google.common.collect.CollectCollectors.EnumSetAccumulator<E>,com.google.common.collect.ImmutableSet<E>>`

### `toImmutableRangeSet()`

**Returns:** `java.util.stream.Collector<com.google.common.collect.Range<E>,?,com.google.common.collect.ImmutableRangeSet<E>>`

### `toImmutableMultiset(Function<? super T,? extends E> elementFunction, ToIntFunction<? super T> countFunction)`

**Parameters:**
- `elementFunction` (`java.util.function.Function<? super T,? extends E>`)
- `countFunction` (`java.util.function.ToIntFunction<? super T>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMultiset<E>>`

### `toMultiset(Function<? super T,E> elementFunction, ToIntFunction<? super T> countFunction, Supplier<M> multisetSupplier)`

**Parameters:**
- `elementFunction` (`java.util.function.Function<? super T,E>`)
- `countFunction` (`java.util.function.ToIntFunction<? super T>`)
- `multisetSupplier` (`java.util.function.Supplier<M>`)

**Returns:** `java.util.stream.Collector<T,?,M>`

### `toImmutableMap(Function<? super T,? extends K> keyFunction, Function<? super T,? extends V> valueFunction)`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

### `toImmutableMap(Function<? super T,? extends K> keyFunction, Function<? super T,? extends V> valueFunction, BinaryOperator<V> mergeFunction)`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `mergeFunction` (`java.util.function.BinaryOperator<V>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

### `toImmutableSortedMap(Comparator<? super K> comparator, Function<? super T,? extends K> keyFunction, Function<? super T,? extends V> valueFunction)`

**Parameters:**
- `comparator` (`java.util.Comparator<? super K>`)
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSortedMap<K,V>>`

### `toImmutableSortedMap(Comparator<? super K> comparator, Function<? super T,? extends K> keyFunction, Function<? super T,? extends V> valueFunction, BinaryOperator<V> mergeFunction)`

**Parameters:**
- `comparator` (`java.util.Comparator<? super K>`)
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `mergeFunction` (`java.util.function.BinaryOperator<V>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSortedMap<K,V>>`

### `toImmutableBiMap(Function<? super T,? extends K> keyFunction, Function<? super T,? extends V> valueFunction)`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableBiMap<K,V>>`

### `toImmutableEnumMap(Function<? super T,? extends K> keyFunction, Function<? super T,? extends V> valueFunction)`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

### `toImmutableEnumMap(Function<? super T,? extends K> keyFunction, Function<? super T,? extends V> valueFunction, BinaryOperator<V> mergeFunction)`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `mergeFunction` (`java.util.function.BinaryOperator<V>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`

### `toImmutableRangeMap(Function<? super T,Range<K>> keyFunction, Function<? super T,? extends V> valueFunction)`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,com.google.common.collect.Range<K>>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableRangeMap<K,V>>`

### `toImmutableListMultimap(Function<? super T,? extends K> keyFunction, Function<? super T,? extends V> valueFunction)`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableListMultimap<K,V>>`

### `flatteningToImmutableListMultimap(Function<? super T,? extends K> keyFunction, Function<? super T,? extends Stream<? extends V>> valuesFunction)`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valuesFunction` (`java.util.function.Function<? super T,? extends java.util.stream.Stream<? extends V>>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableListMultimap<K,V>>`

### `toImmutableSetMultimap(Function<? super T,? extends K> keyFunction, Function<? super T,? extends V> valueFunction)`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSetMultimap<K,V>>`

### `flatteningToImmutableSetMultimap(Function<? super T,? extends K> keyFunction, Function<? super T,? extends Stream<? extends V>> valuesFunction)`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valuesFunction` (`java.util.function.Function<? super T,? extends java.util.stream.Stream<? extends V>>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSetMultimap<K,V>>`

### `toMultimap(Function<? super T,? extends K> keyFunction, Function<? super T,? extends V> valueFunction, Supplier<M> multimapSupplier)`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `multimapSupplier` (`java.util.function.Supplier<M>`)

**Returns:** `java.util.stream.Collector<T,?,M>`

### `flatteningToMultimap(Function<? super T,? extends K> keyFunction, Function<? super T,? extends Stream<? extends V>> valueFunction, Supplier<M> multimapSupplier)`

**Parameters:**
- `keyFunction` (`java.util.function.Function<? super T,? extends K>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends java.util.stream.Stream<? extends V>>`)
- `multimapSupplier` (`java.util.function.Supplier<M>`)

**Returns:** `java.util.stream.Collector<T,?,M>`

