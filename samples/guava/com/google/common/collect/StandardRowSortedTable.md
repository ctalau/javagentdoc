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

Note that iterations across the columns keys for a
 single row key may or may not be ordered, depending on the implementation. When rows and columns
 are both sorted, it's easier to use the TreeBasedTable subclass.

 
The #rowKeySet method returns a SortedSet and the #rowMap method
 returns a SortedMap, instead of the Set and Map specified by the Table interface.

 
Null keys and values are not supported.

 
See the StandardTable superclass for more information about the behavior of this
 class.

## Fields

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(java.util.SortedMap<R,java.util.Map<C,V>> backingMap, com.google.common.base.Supplier<? extends java.util.Map<C,V>> factory)`

**Parameters:**
- `backingMap` (`java.util.SortedMap<R,java.util.Map<C,V>>`)
- `factory` ([`com.google.common.base.Supplier<? extends java.util.Map<C,V>>`](../base/Supplier.md))

## Methods

### `sortedBackingMap()`

**Returns:** `java.util.SortedMap<R,java.util.Map<C,V>>`

### `rowKeySet()`

**Returns:** `java.util.SortedSet<R>`

This method returns a SortedSet, instead of the Set specified in the Table interface.

### `rowMap()`

**Returns:** `java.util.SortedMap<R,java.util.Map<C,V>>`

This method returns a SortedMap, instead of the Map specified in the Table interface.

### `createRowMap()`

**Returns:** `java.util.SortedMap<R,java.util.Map<C,V>>`

