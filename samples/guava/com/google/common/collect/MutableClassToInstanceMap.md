# Class: `MutableClassToInstanceMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.MutableClassToInstanceMap`

**Extends:** [`com.google.common.collect.ForwardingMap<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`](./ForwardingMap.md)

**Implements:** [`com.google.common.collect.ClassToInstanceMap<B>`](./ClassToInstanceMap.md), `java.io.Serializable`

## Type Parameters

- `B` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

See also ImmutableClassToInstanceMap.

 
See the Guava User Guide article on [
 ClassToInstanceMap](https://github.com/google/guava/wiki/NewCollectionTypesExplained#classtoinstancemap).

## Fields

### `delegate`

**Type:** `java.util.Map<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`

## Constructors

### `<init>(java.util.Map<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B> delegate)`

**Parameters:**
- `delegate` (`java.util.Map<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`)

## Methods

### `create()`

**Returns:** [`com.google.common.collect.MutableClassToInstanceMap<B>`](./MutableClassToInstanceMap.md)

### `create(java.util.Map<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B> backingMap)`

**Returns:** [`com.google.common.collect.MutableClassToInstanceMap<B>`](./MutableClassToInstanceMap.md)

The caller surrenders control of the backing map, and thus should not allow any
 direct references to it to remain accessible.

**Parameters:**
- `backingMap` (`java.util.Map<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`)

### `delegate()`

**Returns:** `java.util.Map<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`

### `checkedEntry(java.util.Map.Entry<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B> entry)`

**Returns:** `java.util.Map.Entry<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`

**Parameters:**
- `entry` (`java.util.Map.Entry<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`)

### `entrySet()`

**Returns:** `java.util.Set<java.util.Map.Entry<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>>`

### `put(java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B> key, B value)`

**Returns:** `B`

**Parameters:**
- `key` (`java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>`)
- `value` (`B`)

### `putAll(java.util.Map<? extends java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,? extends B> map)`

**Returns:** `void`

**Parameters:**
- `map` (`java.util.Map<? extends java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,? extends B>`)

### `putInstance(java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T> type, T value)`

**Returns:** `T`

**Parameters:**
- `type` (`java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>`)
- `value` (`T`)

### `getInstance(java.lang.Class<T> type)`

**Returns:** `T`

**Parameters:**
- `type` (`java.lang.Class<T>`)

### `cast(java.lang.Class<T> type, java.lang.Object value)`

**Returns:** `T`

**Parameters:**
- `type` (`java.lang.Class<T>`)
- `value` (`java.lang.Object`)

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

