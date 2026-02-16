# Class: `MutableTypeToInstanceMap`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.MutableTypeToInstanceMap`

**Extends:** [`com.google.common.collect.ForwardingMap<com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`](../collect/ForwardingMap,B>.md)

**Implements:** [`com.google.common.reflect.TypeToInstanceMap<B>`](./TypeToInstanceMap.md)

## Type Parameters

- `B` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A mutable type-to-instance map. See also `ImmutableTypeToInstanceMap`.
**Author:** Ben Yu
**Since:** 13.0

## Fields

### `backingMap`

**Type:** `java.util.Map<com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`

## Constructors

### `<init>()`

## Methods

### `getInstance(`java.lang.Class<T>` type)`

**Returns:** `T`

### `getInstance([`com.google.common.reflect.TypeToken<T>`](./TypeToken.md) type)`

**Returns:** `T`

### `putInstance(`java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>` type, `T` value)`

**Returns:** `T`

### `putInstance([`com.google.common.reflect.TypeToken<@org.checkerframework.checker.nullness.qual.NonNull T>`](./TypeToken.md) type, `T` value)`

**Returns:** `T`

### `put([`com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>`](./TypeToken.md) key, `B` value)`

**Returns:** `B`

Not supported. Use `putInstance` instead.
**Deprecated:** unsupported operation
@throws UnsupportedOperationException always

### `putAll(`java.util.Map<? extends com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,? extends B>` map)`

**Returns:** `void`

Not supported. Use `putInstance` instead.
**Deprecated:** unsupported operation
@throws UnsupportedOperationException always

### `entrySet()`

**Returns:** `java.util.Set<java.util.Map.Entry<com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>>`

### `delegate()`

**Returns:** `java.util.Map<com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`

### `trustedPut([`com.google.common.reflect.TypeToken<@org.checkerframework.checker.nullness.qual.NonNull T>`](./TypeToken.md) type, `T` value)`

**Returns:** `T`

### `trustedGet([`com.google.common.reflect.TypeToken<T>`](./TypeToken.md) type)`

**Returns:** `T`

