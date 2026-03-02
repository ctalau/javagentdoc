# Class: `ImmutableClassToInstanceMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableClassToInstanceMap`

**Extends:** [`com.google.common.collect.ForwardingMap<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`](./ForwardingMap.md)

**Implements:** [`com.google.common.collect.ClassToInstanceMap<B>`](./ClassToInstanceMap.md), `java.io.Serializable`

## Type Parameters

- `B` extends `java.lang.Object`

## Description

## Fields

### `EMPTY`

**Type:** [`com.google.common.collect.ImmutableClassToInstanceMap<java.lang.Object>`](./ImmutableClassToInstanceMap.md)

### `delegate`

**Type:** [`com.google.common.collect.ImmutableMap<java.lang.Class<? extends B>,B>`](./ImmutableMap.md)

## Constructors

### `<init>(com.google.common.collect.ImmutableMap<java.lang.Class<? extends B>,B> delegate)`

**Parameters:**
- `delegate` ([`com.google.common.collect.ImmutableMap<java.lang.Class<? extends B>,B>`](./ImmutableMap.md))

## Methods

### `of()`

**Returns:** [`com.google.common.collect.ImmutableClassToInstanceMap<B>`](./ImmutableClassToInstanceMap.md)

**Performance note:** the instance returned is a singleton.

### `of(java.lang.Class<T> type, T value)`

**Returns:** [`com.google.common.collect.ImmutableClassToInstanceMap<B>`](./ImmutableClassToInstanceMap.md)

**Parameters:**
- `type` (`java.lang.Class<T>`)
- `value` (`T`)

### `builder()`

**Returns:** `com.google.common.collect.ImmutableClassToInstanceMap.Builder<B>`

The generated builder is equivalent to the builder created by the Builder constructor.

### `copyOf(java.util.Map<? extends java.lang.Class<? extends S>,? extends S> map)`

**Returns:** [`com.google.common.collect.ImmutableClassToInstanceMap<B>`](./ImmutableClassToInstanceMap.md)

If map somehow
 contains entries with duplicate keys (for example, if it is a SortedMap whose
 comparator is not *consistent with equals*), the results of this method are undefined.

 
**Note:** Despite what the method name suggests, if map is an 
 ImmutableClassToInstanceMap, no copy will actually be performed.

**Parameters:**
- `map` (`java.util.Map<? extends java.lang.Class<? extends S>,? extends S>`)

### `delegate()`

**Returns:** `java.util.Map<java.lang.Class<? extends B>,B>`

### `getInstance(java.lang.Class<T> type)`

**Returns:** `T`

**Parameters:**
- `type` (`java.lang.Class<T>`)

### `putInstance(java.lang.Class<T> type, T value)`

**Returns:** `T`

**Parameters:**
- `type` (`java.lang.Class<T>`)
- `value` (`T`)

### `readResolve()`

**Returns:** `java.lang.Object`

