# Class: `SingletonImmutableSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SingletonImmutableSet`

**Extends:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

Implementation of `ImmutableSet` with exactly one element.
**Author:** Kevin Bourrillion
**Author:** Nick Kralevich

## Fields

### `element`

**Type:** `E`

## Constructors

### `<init>(`E` element)`

## Methods

### `size()`

**Returns:** `int`

### `contains(`java.lang.Object` target)`

**Returns:** `boolean`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `asList()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `isPartialView()`

**Returns:** `boolean`

### `copyIntoArray(`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` dst, `int` offset)`

**Returns:** `int`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `writeReplace()`

**Returns:** `java.lang.Object`

