# Class: `TableCollectors`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.TableCollectors`

## Description

## Constructors

### `<init>()`

## Methods

### `toImmutableTable(Function<? super T,? extends R> rowFunction, Function<? super T,? extends C> columnFunction, Function<? super T,? extends V> valueFunction)`

**Parameters:**
- `rowFunction` (`java.util.function.Function<? super T,? extends R>`)
- `columnFunction` (`java.util.function.Function<? super T,? extends C>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableTable<R,C,V>>`

### `toImmutableTable(Function<? super T,? extends R> rowFunction, Function<? super T,? extends C> columnFunction, Function<? super T,? extends V> valueFunction, BinaryOperator<V> mergeFunction)`

**Parameters:**
- `rowFunction` (`java.util.function.Function<? super T,? extends R>`)
- `columnFunction` (`java.util.function.Function<? super T,? extends C>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `mergeFunction` (`java.util.function.BinaryOperator<V>`)

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableTable<R,C,V>>`

### `toTable(Function<? super T,? extends R> rowFunction, Function<? super T,? extends C> columnFunction, Function<? super T,? extends V> valueFunction, Supplier<I> tableSupplier)`

**Parameters:**
- `rowFunction` (`java.util.function.Function<? super T,? extends R>`)
- `columnFunction` (`java.util.function.Function<? super T,? extends C>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `tableSupplier` (`java.util.function.Supplier<I>`)

**Returns:** `java.util.stream.Collector<T,?,I>`

### `toTable(Function<? super T,? extends R> rowFunction, Function<? super T,? extends C> columnFunction, Function<? super T,? extends V> valueFunction, BinaryOperator<V> mergeFunction, Supplier<I> tableSupplier)`

**Parameters:**
- `rowFunction` (`java.util.function.Function<? super T,? extends R>`)
- `columnFunction` (`java.util.function.Function<? super T,? extends C>`)
- `valueFunction` (`java.util.function.Function<? super T,? extends V>`)
- `mergeFunction` (`java.util.function.BinaryOperator<V>`)
- `tableSupplier` (`java.util.function.Supplier<I>`)

**Returns:** `java.util.stream.Collector<T,?,I>`

### `mergeTables(Table<R,C,V> table, R row, C column, V value, BinaryOperator<V> mergeFunction)`

**Parameters:**
- `table` ([`com.google.common.collect.Table<R,C,V>`](./Table.md))
- `row` (`R`)
- `column` (`C`)
- `value` (`V`)
- `mergeFunction` (`java.util.function.BinaryOperator<V>`)

**Returns:** `void`

