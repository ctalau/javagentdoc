# Class: `TableCollectors`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TableCollectors`

## Description

Collectors utilities for {@code common.collect.Table} internals.

## Constructors

### `<init>()`

## Methods

### `toImmutableTable([`java.util.function.Function<? super T,? extends R>`](../../../../java/util/function/Function.md) rowFunction, [`java.util.function.Function<? super T,? extends C>`](../../../../java/util/function/Function.md) columnFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableTable<R,C,V>>`](../../../../java/util/stream/Collector>.md)

### `toImmutableTable([`java.util.function.Function<? super T,? extends R>`](../../../../java/util/function/Function.md) rowFunction, [`java.util.function.Function<? super T,? extends C>`](../../../../java/util/function/Function.md) columnFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction, [`java.util.function.BinaryOperator<V>`](../../../../java/util/function/BinaryOperator.md) mergeFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableTable<R,C,V>>`](../../../../java/util/stream/Collector>.md)

### `toTable([`java.util.function.Function<? super T,? extends R>`](../../../../java/util/function/Function.md) rowFunction, [`java.util.function.Function<? super T,? extends C>`](../../../../java/util/function/Function.md) columnFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction, [`java.util.function.Supplier<I>`](../../../../java/util/function/Supplier.md) tableSupplier)`

**Returns:** [`java.util.stream.Collector<T,?,I>`](../../../../java/util/stream/Collector.md)

### `toTable([`java.util.function.Function<? super T,? extends R>`](../../../../java/util/function/Function.md) rowFunction, [`java.util.function.Function<? super T,? extends C>`](../../../../java/util/function/Function.md) columnFunction, [`java.util.function.Function<? super T,? extends V>`](../../../../java/util/function/Function.md) valueFunction, [`java.util.function.BinaryOperator<V>`](../../../../java/util/function/BinaryOperator.md) mergeFunction, [`java.util.function.Supplier<I>`](../../../../java/util/function/Supplier.md) tableSupplier)`

**Returns:** [`java.util.stream.Collector<T,?,I>`](../../../../java/util/stream/Collector.md)

### `mergeTables([`com.google.common.collect.Table<R,C,V>`](./Table.md) table, [`R`](R.md) row, [`C`](C.md) column, [`V`](V.md) value, [`java.util.function.BinaryOperator<V>`](../../../../java/util/function/BinaryOperator.md) mergeFunction)`

**Returns:** `void`

