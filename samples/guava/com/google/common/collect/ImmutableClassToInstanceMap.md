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

### `<init>(ImmutableMap<Class<? extends B>,B> delegate)`

**Parameters:**
- `delegate` ([`com.google.common.collect.ImmutableMap<java.lang.Class<? extends B>,B>`](./ImmutableMap.md))

## Methods

### `of()`

**Performance note:** the instance returned is a singleton.

**Returns:** [`com.google.common.collect.ImmutableClassToInstanceMap<B>`](./ImmutableClassToInstanceMap.md)

### `of(Class<T> type, T value)`

**Parameters:**
- `type` (`java.lang.Class<T>`)
- `value` (`T`)

**Returns:** [`com.google.common.collect.ImmutableClassToInstanceMap<B>`](./ImmutableClassToInstanceMap.md)

### `builder()`

The generated builder is equivalent to the builder created by the Builder constructor.

**Returns:** `com.google.common.collect.ImmutableClassToInstanceMap.Builder<B>`

### `copyOf(Map<? extends Class<? extends S>,? extends S> map)`

If map somehow
 contains entries with duplicate keys (for example, if it is a SortedMap whose
 comparator is not *consistent with equals*), the results of this method are undefined.

 
**Note:** Despite what the method name suggests, if map is an 
 ImmutableClassToInstanceMap, no copy will actually be performed.

**Parameters:**
- `map` (`java.util.Map<? extends java.lang.Class<? extends S>,? extends S>`)

**Returns:** [`com.google.common.collect.ImmutableClassToInstanceMap<B>`](./ImmutableClassToInstanceMap.md)

### `delegate()`

**Returns:** `java.util.Map<java.lang.Class<? extends B>,B>`

### `getInstance(Class<T> type)`

**Parameters:**
- `type` (`java.lang.Class<T>`)

**Returns:** `T`

### `putInstance(Class<T> type, T value)`

**Parameters:**
- `type` (`java.lang.Class<T>`)
- `value` (`T`)

**Returns:** `T`

### `readResolve()`

**Returns:** `java.lang.Object`

