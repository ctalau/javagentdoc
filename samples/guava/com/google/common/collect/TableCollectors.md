# Class: `TableCollectors`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TableCollectors`

## Description

## Constructors

### `<init>()`

## Methods

### `toImmutableTable(java.util.function.Function<? super T,? extends R> rowFunction, java.util.function.Function<? super T,? extends C> columnFunction, java.util.function.Function<? super T,? extends V> valueFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableTable<R,C,V>>`

**Parameters:**
- `rowFunction` (`java.util.function.Function<? super T,? extends R>`)
- `columnFunction` (`java.util.function.Function<? super T,? extends C>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

### `toImmutableTable(java.util.function.Function<? super T,? extends R> rowFunction, java.util.function.Function<? super T,? extends C> columnFunction, java.util.function.Function<? super T,? extends V> valueFunction, java.util.function.BinaryOperator<V> mergeFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableTable<R,C,V>>`

**Parameters:**
- `rowFunction` (`java.util.function.Function<? super T,? extends R>`)
- `columnFunction` (`java.util.function.Function<? super T,? extends C>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `mergeFunction` (`java.util.function.BinaryOperator<V>`)

### `toTable(java.util.function.Function<? super T,? extends R> rowFunction, java.util.function.Function<? super T,? extends C> columnFunction, java.util.function.Function<? super T,? extends V> valueFunction, java.util.function.Supplier<I> tableSupplier)`

**Returns:** `java.util.stream.Collector<T,?,I>`

**Parameters:**
- `rowFunction` (`java.util.function.Function<? super T,? extends R>`)
- `columnFunction` (`java.util.function.Function<? super T,? extends C>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `tableSupplier` (`java.util.function.Supplier<I>`)

### `toTable(java.util.function.Function<? super T,? extends R> rowFunction, java.util.function.Function<? super T,? extends C> columnFunction, java.util.function.Function<? super T,? extends V> valueFunction, java.util.function.BinaryOperator<V> mergeFunction, java.util.function.Supplier<I> tableSupplier)`

**Returns:** `java.util.stream.Collector<T,?,I>`

**Parameters:**
- `rowFunction` (`java.util.function.Function<? super T,? extends R>`)
- `columnFunction` (`java.util.function.Function<? super T,? extends C>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `mergeFunction` (`java.util.function.BinaryOperator<V>`)
- `tableSupplier` (`java.util.function.Supplier<I>`)

### `mergeTables(com.google.common.collect.Table<R,C,V> table, R row, C column, V value, java.util.function.BinaryOperator<V> mergeFunction)`

**Returns:** `void`

**Parameters:**
- `table` ([`com.google.common.collect.Table<R,C,V>`](./Table.md))
- `row` (`R`)
- `column` (`C`)
- `value` (`V`)
- `mergeFunction` (`java.util.function.BinaryOperator<V>`)

