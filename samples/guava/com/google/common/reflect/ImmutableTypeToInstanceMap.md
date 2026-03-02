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

### `<init>(com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeToken<? extends B>,B> delegate)`

**Parameters:**
- `delegate` ([`com.google.common.collect.ImmutableMap<com.google.common.reflect.TypeToken<? extends B>,B>`](../collect/ImmutableMap.md))

## Methods

### `of()`

**Returns:** [`com.google.common.reflect.ImmutableTypeToInstanceMap<B>`](./ImmutableTypeToInstanceMap.md)

### `builder()`

**Returns:** `com.google.common.reflect.ImmutableTypeToInstanceMap.Builder<B>`

### `getInstance(com.google.common.reflect.TypeToken<T> type)`

**Returns:** `T`

**Parameters:**
- `type` ([`com.google.common.reflect.TypeToken<T>`](./TypeToken.md))

### `getInstance(java.lang.Class<T> type)`

**Returns:** `T`

**Parameters:**
- `type` (`java.lang.Class<T>`)

### `putInstance(com.google.common.reflect.TypeToken<T> type, T value)`

**Returns:** `T`

**Parameters:**
- `type` ([`com.google.common.reflect.TypeToken<T>`](./TypeToken.md))
- `value` (`T`)

### `putInstance(java.lang.Class<T> type, T value)`

**Returns:** `T`

**Parameters:**
- `type` (`java.lang.Class<T>`)
- `value` (`T`)

### `put(com.google.common.reflect.TypeToken<? extends B> key, B value)`

**Returns:** `B`

**Parameters:**
- `key` ([`com.google.common.reflect.TypeToken<? extends B>`](./TypeToken.md))
- `value` (`B`)

### `putAll(java.util.Map<? extends com.google.common.reflect.TypeToken<? extends B>,? extends B> map)`

**Returns:** `void`

**Parameters:**
- `map` (`java.util.Map<? extends com.google.common.reflect.TypeToken<? extends B>,? extends B>`)

### `delegate()`

**Returns:** `java.util.Map<com.google.common.reflect.TypeToken<? extends B>,B>`

### `trustedGet(com.google.common.reflect.TypeToken<T> type)`

**Returns:** `T`

**Parameters:**
- `type` ([`com.google.common.reflect.TypeToken<T>`](./TypeToken.md))

