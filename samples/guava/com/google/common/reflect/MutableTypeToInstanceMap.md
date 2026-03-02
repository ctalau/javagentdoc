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

### `getInstance(Class<T> type)`

**Parameters:**
- `type` (`java.lang.Class<T>`)

**Returns:** `T`

### `getInstance(TypeToken<T> type)`

**Parameters:**
- `type` ([`com.google.common.reflect.TypeToken<T>`](./TypeToken.md))

**Returns:** `T`

### `putInstance(Class<@NonNull T> type, T value)`

**Parameters:**
- `type` (`java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>`)
- `value` (`T`)

**Returns:** `T`

### `putInstance(TypeToken<@NonNull T> type, T value)`

**Parameters:**
- `type` ([`com.google.common.reflect.TypeToken<@org.checkerframework.checker.nullness.qual.NonNull T>`](./TypeToken.md))
- `value` (`T`)

**Returns:** `T`

### `put(TypeToken<? extends @NonNull B> key, B value)`

Use #putInstance instead.

**Parameters:**
- `key` ([`com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>`](./TypeToken.md))
- `value` (`B`)

**Returns:** `B`

### `putAll(Map<? extends TypeToken<? extends @NonNull B>,? extends B> map)`

Use #putInstance instead.

**Parameters:**
- `map` (`java.util.Map<? extends com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,? extends B>`)

**Returns:** `void`

### `entrySet()`

**Returns:** `java.util.Set<java.util.Map.Entry<com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>>`

### `delegate()`

**Returns:** `java.util.Map<com.google.common.reflect.TypeToken<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`

### `trustedPut(TypeToken<@NonNull T> type, T value)`

**Parameters:**
- `type` ([`com.google.common.reflect.TypeToken<@org.checkerframework.checker.nullness.qual.NonNull T>`](./TypeToken.md))
- `value` (`T`)

**Returns:** `T`

### `trustedGet(TypeToken<T> type)`

**Parameters:**
- `type` ([`com.google.common.reflect.TypeToken<T>`](./TypeToken.md))

**Returns:** `T`

