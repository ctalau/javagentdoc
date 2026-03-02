# Class: `ImmutableTypeToInstanceMap`

**Package:** [`com.google.common.reflect`](README.md)

**Fully Qualified Name:** `com.google.common.reflect.ImmutableTypeToInstanceMap`

**Extends:** [`com.google.common.collect.ForwardingMap<com.google.common.reflect.TypeToken<? extends B>,B>`](../collect/ForwardingMap.md)

**Implements:** [`com.google.common.reflect.TypeToInstanceMap<B>`](./TypeToInstanceMap.md)

## Type Parameters

- `B` extends `java.lang.Object`

## Description

See also MutableTypeToInstanceMap.

## Fields

### `delegate`

**Type:** [`com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeToken<? extends B>,B>`](../collect/ImmutableMap.md)

## Constructors

### `<init>(ImmutableMap<TypeToken<? extends B>,B> delegate)`

**Parameters:**
- `delegate` ([`com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeToken<? extends B>,B>`](../collect/ImmutableMap.md))

## Methods

### `of()`

**Returns:** [`com.google.common.reflect.ImmutableTypeToInstanceMap<B>`](./ImmutableTypeToInstanceMap.md)

### `builder()`

**Returns:** `com.google.common.reflect.ImmutableTypeToInstanceMap.Builder<B>`

### `getInstance(TypeToken<T> type)`

**Parameters:**
- `type` ([`com.google.common.reflect.TypeToken<T>`](./TypeToken.md))

**Returns:** `T`

### `getInstance(Class<T> type)`

**Parameters:**
- `type` (`java.lang.Class<T>`)

**Returns:** `T`

### `putInstance(TypeToken<T> type, T value)`

**Parameters:**
- `type` ([`com.google.common.reflect.TypeToken<T>`](./TypeToken.md))
- `value` (`T`)

**Returns:** `T`

### `putInstance(Class<T> type, T value)`

**Parameters:**
- `type` (`java.lang.Class<T>`)
- `value` (`T`)

**Returns:** `T`

### `put(TypeToken<? extends B> key, B value)`

**Parameters:**
- `key` ([`com.google.common.reflect.TypeToken<? extends B>`](./TypeToken.md))
- `value` (`B`)

**Returns:** `B`

### `putAll(Map<? extends TypeToken<? extends B>,? extends B> map)`

**Parameters:**
- `map` (`java.util.Map<? extends com.google.common.reflect.TypeToken<? extends B>,? extends B>`)

**Returns:** `void`

### `delegate()`

**Returns:** `java.util.Map<com.google.common.reflect.TypeToken<? extends B>,B>`

### `trustedGet(TypeToken<T> type)`

**Parameters:**
- `type` ([`com.google.common.reflect.TypeToken<T>`](./TypeToken.md))

**Returns:** `T`

