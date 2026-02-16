# Class: `ImmutableEntry`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableEntry`

**Extends:** [`com.google.common.collect.AbstractMapEntry<K,V>`](./AbstractMapEntry.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An immutable `Map.Entry`, used both by `com.google.common.collect.Maps.immutableEntry(Object, Object)` and by other parts of `common.collect` as a superclass.

## Fields

### `key`

**Type:** `K`

### `value`

**Type:** `V`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`K` key, `V` value)`

## Methods

### `getKey()`

**Returns:** `K`

### `getValue()`

**Returns:** `V`

### `setValue(`V` value)`

**Returns:** `V`

