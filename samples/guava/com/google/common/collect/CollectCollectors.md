# Class: `CollectCollectors`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.CollectCollectors`

## Description

Collectors utilities for {@code common.collect} internals.

## Fields

### `TO_IMMUTABLE_LIST`

**Type:** [`java.util.stream.Collector<java.lang.Object,?,com.google.common.collect.ImmutableList<java.lang.Object>>`](../../../../java/util/stream/Collector>.md)

### `TO_IMMUTABLE_SET`

**Type:** [`java.util.stream.Collector<java.lang.Object,?,com.google.common.collect.ImmutableSet<java.lang.Object>>`](../../../../java/util/stream/Collector>.md)

### `TO_IMMUTABLE_RANGE_SET`

**Type:** [`java.util.stream.Collector<com.google.common.collect.Range<java.lang.Comparable<?>>,?,com.google.common.collect.ImmutableRangeSet<java.lang.Comparable<?>>>`](../../../../java/util/stream/Collector>,?,com/google/common/collect/ImmutableRangeSet>>.md)

## Constructors

### `<init>()`

## Methods

### `toImmutableList()`

**Returns:** [`java.util.stream.Collector<E,?,com.google.common.collect.ImmutableList<E>>`](../../../../java/util/stream/Collector>.md)

### `toImmutableSet()`

**Returns:** [`java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSet<E>>`](../../../../java/util/stream/Collector>.md)

### `toImmutableSortedSet([`java.util.Comparator<? super E>`](../../../../java/util/Comparator.md) comparator)`

**Returns:** [`java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSortedSet<E>>`](../../../../java/util/stream/Collector>.md)

### `toImmutableEnumSet()`

**Returns:** [`java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSet<E>>`](../../../../java/util/stream/Collector>.md)

### `toImmutableEnumSetGeneric()`

**Returns:** [`java.util.stream.Collector<E,com.google.common.collect.CollectCollectors.EnumSetAccumulator<E>,com.google.common.collect.ImmutableSet<E>>`](../../../../java/util/stream/Collector,com/google/common/collect/ImmutableSet>.md)

### `toImmutableRangeSet()`

**Returns:** [`java.util.stream.Collector<com.google.common.collect.Range<E>,?,com.google.common.collect.ImmutableRangeSet<E>>`](../../../../java/util/stream/Collector,?,com/google/common/collect/ImmutableRangeSet>.md)

### `toImmutableMultiset([`java.util.function.Function<? super T,? extends E>`](../../../../java/util/function/Function.md) elementFunction, [`java.util.function.ToIntFunction<? super T>`](../../../../java/util/function/ToIntFunction.md) countFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMultiset<E>>`](../../../../java/util/stream/Collector>.md)

### `toMultiset([`java.util.function.Function<? super T,E>`](../../../../java/util/function/Function.md) elementFunction, [`java.util.function.ToIntFunction<? super T>`](../../../../java/util/function/ToIntFunction.md) countFunction, [`java.util.function.Supplier<M>`](../../../../java/util/function/Supplier.md) multisetSupplier)`

**Returns:** [`java.util.stream.Collector<T,?,M>`](../../../../java/util/stream/Collector.md)

### `toImmutableMap([`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`](../../../../java/util/stream/Collector>.md)

### `toImmutableMap([`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction, [`java.util.function.BinaryOperator<V>`](../../../../java/util/function/BinaryOperator.md) mergeFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`](../../../../java/util/stream/Collector>.md)

### `toImmutableSortedMap([`java.util.Comparator<? super K>`](../../../../java/util/Comparator.md) comparator, [`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSortedMap<K,V>>`](../../../../java/util/stream/Collector>.md)

### `toImmutableSortedMap([`java.util.Comparator<? super K>`](../../../../java/util/Comparator.md) comparator, [`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction, [`java.util.function.BinaryOperator<V>`](../../../../java/util/function/BinaryOperator.md) mergeFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSortedMap<K,V>>`](../../../../java/util/stream/Collector>.md)

### `toImmutableBiMap([`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableBiMap<K,V>>`](../../../../java/util/stream/Collector>.md)

### `toImmutableEnumMap([`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`](../../../../java/util/stream/Collector>.md)

### `toImmutableEnumMap([`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction, [`java.util.function.BinaryOperator<V>`](../../../../java/util/function/BinaryOperator.md) mergeFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMap<K,V>>`](../../../../java/util/stream/Collector>.md)

### `toImmutableRangeMap([`java.util.function.Function<? super T,com.google.common.collect.Range<K>>`](../../../../java/util/function/Function>.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableRangeMap<K,V>>`](../../../../java/util/stream/Collector>.md)

### `toImmutableListMultimap([`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableListMultimap<K,V>>`](../../../../java/util/stream/Collector>.md)

### `flatteningToImmutableListMultimap([`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends java.util.stream.Stream<? extends V>>`](../../../../java/util/function/Function>.md) valuesFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableListMultimap<K,V>>`](../../../../java/util/stream/Collector>.md)

### `toImmutableSetMultimap([`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSetMultimap<K,V>>`](../../../../java/util/stream/Collector>.md)

### `flatteningToImmutableSetMultimap([`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends java.util.stream.Stream<? extends V>>`](../../../../java/util/function/Function>.md) valuesFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableSetMultimap<K,V>>`](../../../../java/util/stream/Collector>.md)

### `toMultimap([`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction, [`java.util.function.Supplier<M>`](../../../../java/util/function/Supplier.md) multimapSupplier)`

**Returns:** [`java.util.stream.Collector<T,?,M>`](../../../../java/util/stream/Collector.md)

### `flatteningToMultimap([`java.util.function.Function<? super T,? extends K>`](../../../../java/util/function/Function.md) keyFunction, [`java.util.function.Function<? super T,? extends java.util.stream.Stream<? extends V>>`](../../../../java/util/function/Function>.md) valueFunction, [`java.util.function.Supplier<M>`](../../../../java/util/function/Supplier.md) multimapSupplier)`

**Returns:** [`java.util.stream.Collector<T,?,M>`](../../../../java/util/stream/Collector.md)

