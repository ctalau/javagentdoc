# Class: `StandardRowSortedTable`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.StandardRowSortedTable`

**Extends:** [`com.google.common.collect.StandardTable<R,C,V>`](./StandardTable.md)

**Implements:** [`com.google.common.collect.RowSortedTable<R,C,V>`](./RowSortedTable.md)

## Type Parameters

- `R` extends `java.lang.Object`
- `C` extends `java.lang.Object`
- `V` extends `java.lang.Object`

## Description

Implementation of {@code Table} whose iteration ordering across row keys is sorted by their
 natural ordering or by a supplied comparator. Note that iterations across the columns keys for a
 single row key may or may not be ordered, depending on the implementation. When rows and columns
 are both sorted, it's easier to use the {@link TreeBasedTable} subclass.

 <p>The {@link #rowKeySet} method returns a {@link SortedSet} and the {@link #rowMap} method
 returns a {@link SortedMap}, instead of the {@link Set} and {@link Map} specified by the {@link Table} interface.

 <p>Null keys and values are not supported.

 <p>See the {@link StandardTable} superclass for more information about the behavior of this
 class.
@author Jared Levy

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`java.util.SortedMap<R,java.util.Map<C,V>>`](../../../../java/util/SortedMap>.md) backingMap, [`com.google.common.base.Supplier<? extends java.util.Map<C,V>>`](../base/Supplier>.md) factory)`

## Methods

### `sortedBackingMap()`

**Returns:** [`java.util.SortedMap<R,java.util.Map<C,V>>`](../../../../java/util/SortedMap>.md)

### `rowKeySet()`

**Returns:** [`java.util.SortedSet<R>`](../../../../java/util/SortedSet.md)

{@inheritDoc}

 <p>This method returns a {@link SortedSet}, instead of the {@code Set} specified in the {@link Table} interface.

### `rowMap()`

**Returns:** [`java.util.SortedMap<R,java.util.Map<C,V>>`](../../../../java/util/SortedMap>.md)

{@inheritDoc}

 <p>This method returns a {@link SortedMap}, instead of the {@code Map} specified in the {@link Table} interface.

### `createRowMap()`

**Returns:** [`java.util.SortedMap<R,java.util.Map<C,V>>`](../../../../java/util/SortedMap>.md)

