# Class: `MutableTypeToInstanceMap`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.MutableTypeToInstanceMap`

**Extends:** [`com.google.common.collect.ForwardingMap<com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`](../collect/ForwardingMap.md)

**Implements:** [`com.google.common.reflect.TypeToInstanceMap<B>`](./TypeToInstanceMap.md)

## Type Parameters

- `B` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

See also ImmutableTypeToInstanceMap.

## Fields

### `backingMap`

**Type:** `java.util.Map<com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`

## Constructors

### `<init>()`

## Methods

### `getInstance(java.lang.Class<T> type)`

**Returns:** `T`

**Parameters:**
- `type` (`java.lang.Class<T>`)

### `getInstance(com.google.common.reflect.TypeToken<T> type)`

**Returns:** `T`

**Parameters:**
- `type` ([`com.google.common.reflect.TypeToken<T>`](./TypeToken.md))

### `putInstance(java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T> type, T value)`

**Returns:** `T`

**Parameters:**
- `type` (`java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>`)
- `value` (`T`)

### `putInstance(com.google.common.reflect.TypeToken<@org.checkerframework.checker.nullness.qual.NonNull T> type, T value)`

**Returns:** `T`

**Parameters:**
- `type` ([`com.google.common.reflect.TypeToken<@org.checkerframework.checker.nullness.qual.NonNull T>`](./TypeToken.md))
- `value` (`T`)

### `put(com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B> key, B value)`

**Returns:** `B`

Use #putInstance instead.

**Parameters:**
- `key` ([`com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>`](./TypeToken.md))
- `value` (`B`)

### `putAll(java.util.Map<? extends com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,? extends B> map)`

**Returns:** `void`

Use #putInstance instead.

**Parameters:**
- `map` (`java.util.Map<? extends com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,? extends B>`)

### `entrySet()`

**Returns:** `java.util.Set<java.util.Map.Entry<com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>>`

### `delegate()`

**Returns:** `java.util.Map<com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`

### `trustedPut(com.google.common.reflect.TypeToken<@org.checkerframework.checker.nullness.qual.NonNull T> type, T value)`

**Returns:** `T`

**Parameters:**
- `type` ([`com.google.common.reflect.TypeToken<@org.checkerframework.checker.nullness.qual.NonNull T>`](./TypeToken.md))
- `value` (`T`)

### `trustedGet(com.google.common.reflect.TypeToken<T> type)`

**Returns:** `T`

**Parameters:**
- `type` ([`com.google.common.reflect.TypeToken<T>`](./TypeToken.md))

