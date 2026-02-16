# Class: `ImmutableEntry`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableEntry`

**Extends:** [`com.google.common.collect.AbstractMapEntry<K,V>`](./AbstractMapEntry.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An immutable {@code Map.Entry}, used both by {@link com.google.common.collect.Maps#immutableEntry(Object, Object)} and by other parts of {@code
 common.collect} as a superclass.

## Fields

### `key`

**Type:** [`K`](K.md)

### `value`

**Type:** [`V`](V.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`K`](K.md) key, [`V`](V.md) value)`

## Methods

### `getKey()`

**Returns:** [`K`](K.md)

### `getValue()`

**Returns:** [`V`](V.md)

### `setValue([`V`](V.md) value)`

**Returns:** [`V`](V.md)

