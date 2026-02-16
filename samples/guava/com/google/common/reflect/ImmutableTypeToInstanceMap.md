# Class: `ImmutableTypeToInstanceMap`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.ImmutableTypeToInstanceMap`

**Extends:** [`com.google.common.collect.ForwardingMap<com.google.common.reflect.TypeToken<? extends B>,B>`](../collect/ForwardingMap,B>.md)

**Implements:** [`com.google.common.reflect.TypeToInstanceMap<B>`](./TypeToInstanceMap.md)

## Type Parameters

- `B` extends `java.lang.Object`

## Description

A type-to-instance map backed by an `ImmutableMap`. See also `MutableTypeToInstanceMap`.
**Author:** Ben Yu
**Since:** 13.0

## Fields

### `delegate`

**Type:** [`com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeToken<? extends B>,B>`](../collect/ImmutableMap,B>.md)

## Constructors

### `<init>([`com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeToken<? extends B>,B>`](../collect/ImmutableMap,B>.md) delegate)`

## Methods

### `of()`

**Returns:** [`com.google.common.reflect.ImmutableTypeToInstanceMap<B>`](./ImmutableTypeToInstanceMap.md)

Returns an empty type to instance map.

### `builder()`

**Returns:** [`com.google.common.reflect.ImmutableTypeToInstanceMap.Builder<B>`](ImmutableTypeToInstanceMap/Builder.md)

Returns a new builder.

### `getInstance([`com.google.common.reflect.TypeToken<T>`](./TypeToken.md) type)`

**Returns:** `T`

### `getInstance(`java.lang.Class<T>` type)`

**Returns:** `T`

### `putInstance([`com.google.common.reflect.TypeToken<T>`](./TypeToken.md) type, `T` value)`

**Returns:** `T`

Guaranteed to throw an exception and leave the map unmodified.
**Deprecated:** unsupported operation
@throws UnsupportedOperationException always

### `putInstance(`java.lang.Class<T>` type, `T` value)`

**Returns:** `T`

Guaranteed to throw an exception and leave the map unmodified.
**Deprecated:** unsupported operation
@throws UnsupportedOperationException always

### `put([`com.google.common.reflect.TypeToken<? extends B>`](./TypeToken.md) key, `B` value)`

**Returns:** `B`

Guaranteed to throw an exception and leave the map unmodified.
**Deprecated:** unsupported operation
@throws UnsupportedOperationException always

### `putAll(`java.util.Map<? extends com.google.common.reflect.TypeToken<? extends B>,? extends B>` map)`

**Returns:** `void`

Guaranteed to throw an exception and leave the map unmodified.
**Deprecated:** unsupported operation
@throws UnsupportedOperationException always

### `delegate()`

**Returns:** `java.util.Map<com.google.common.reflect.TypeToken<? extends B>,B>`

### `trustedGet([`com.google.common.reflect.TypeToken<T>`](./TypeToken.md) type)`

**Returns:** `T`

