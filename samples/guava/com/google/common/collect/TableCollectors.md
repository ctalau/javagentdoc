# Class: `TableCollectors`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TableCollectors`

## Description

Collectors utilities for `common.collect.Table` internals.

## Constructors

### `<init>()`

## Methods

### `toImmutableTable(`java.util.function.Function<? super T,? extends R>` rowFunction, `java.util.function.Function<? super T,? extends C>` columnFunction, `java.util.function.Function<? super T,? extends V>` valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableTable<R,C,V>>`

### `toImmutableTable(`java.util.function.Function<? super T,? extends R>` rowFunction, `java.util.function.Function<? super T,? extends C>` columnFunction, `java.util.function.Function<? super T,? extends V>` valueFunction, `java.util.function.BinaryOperator<V>` mergeFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableTable<R,C,V>>`

### `toTable(`java.util.function.Function<? super T,? extends R>` rowFunction, `java.util.function.Function<? super T,? extends C>` columnFunction, `java.util.function.Function<? super T,? extends V>` valueFunction, `java.util.function.Supplier<I>` tableSupplier)`

**Returns:** `java.util.stream.Collector<T,?,I>`

### `toTable(`java.util.function.Function<? super T,? extends R>` rowFunction, `java.util.function.Function<? super T,? extends C>` columnFunction, `java.util.function.Function<? super T,? extends V>` valueFunction, `java.util.function.BinaryOperator<V>` mergeFunction, `java.util.function.Supplier<I>` tableSupplier)`

**Returns:** `java.util.stream.Collector<T,?,I>`

### `mergeTables([`com.google.common.collect.Table<R,C,V>`](./Table.md) table, `R` row, `C` column, `V` value, `java.util.function.BinaryOperator<V>` mergeFunction)`

**Returns:** `void`

