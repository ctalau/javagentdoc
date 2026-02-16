# Class: `MutableTypeToInstanceMap`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.MutableTypeToInstanceMap`

**Extends:** [`com.google.common.collect.ForwardingMap<com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`](../collect/ForwardingMap,B>.md)

**Implements:** [`com.google.common.reflect.TypeToInstanceMap<B>`](./TypeToInstanceMap.md)

## Type Parameters

- `B` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A mutable type-to-instance map. See also {@link ImmutableTypeToInstanceMap}.
@author Ben Yu
@since 13.0

## Fields

### `backingMap`

**Type:** [`java.util.Map<com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`](../../../../java/util/Map,B>.md)

## Constructors

### `<init>()`

## Methods

### `getInstance(`java.lang.Class<T>` type)`

**Returns:** [`T`](T.md)

### `getInstance([`com.google.common.reflect.TypeToken<T>`](./TypeToken.md) type)`

**Returns:** [`T`](T.md)

### `putInstance(`java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>` type, [`T`](T.md) value)`

**Returns:** [`T`](T.md)

### `putInstance([`com.google.common.reflect.TypeToken<@org.checkerframework.checker.nullness.qual.NonNull T>`](./TypeToken.md) type, [`T`](T.md) value)`

**Returns:** [`T`](T.md)

### `put([`com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>`](./TypeToken.md) key, [`B`](B.md) value)`

**Returns:** [`B`](B.md)

Not supported. Use {@link #putInstance} instead.
@deprecated unsupported operation
@throws UnsupportedOperationException always

### `putAll([`java.util.Map<? extends com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,? extends B>`](../../../../java/util/Map,? extends B>.md) map)`

**Returns:** `void`

Not supported. Use {@link #putInstance} instead.
@deprecated unsupported operation
@throws UnsupportedOperationException always

### `entrySet()`

**Returns:** [`java.util.Set<java.util.Map.Entry<com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>>`](../../../../java/util/Set,B>>.md)

### `delegate()`

**Returns:** [`java.util.Map<com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`](../../../../java/util/Map,B>.md)

### `trustedPut([`com.google.common.reflect.TypeToken<@org.checkerframework.checker.nullness.qual.NonNull T>`](./TypeToken.md) type, [`T`](T.md) value)`

**Returns:** [`T`](T.md)

### `trustedGet([`com.google.common.reflect.TypeToken<T>`](./TypeToken.md) type)`

**Returns:** [`T`](T.md)

