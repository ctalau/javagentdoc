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

### `<init>(Map<Class<? extends @NonNull B>,B> delegate)`

**Parameters:**
- `delegate` (`java.util.Map<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`)

## Methods

### `create()`

**Returns:** [`com.google.common.collect.MutableClassToInstanceMap<B>`](./MutableClassToInstanceMap.md)

### `create(Map<Class<? extends @NonNull B>,B> backingMap)`

The caller surrenders control of the backing map, and thus should not allow any
 direct references to it to remain accessible.

**Parameters:**
- `backingMap` (`java.util.Map<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`)

**Returns:** [`com.google.common.collect.MutableClassToInstanceMap<B>`](./MutableClassToInstanceMap.md)

### `delegate()`

**Returns:** `java.util.Map<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`

### `checkedEntry(Map.Entry<Class<? extends @NonNull B>,B> entry)`

**Parameters:**
- `entry` (`java.util.Map.Entry<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`)

**Returns:** `java.util.Map.Entry<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`

### `entrySet()`

**Returns:** `java.util.Set<java.util.Map.Entry<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>>`

### `put(Class<? extends @NonNull B> key, B value)`

**Parameters:**
- `key` (`java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>`)
- `value` (`B`)

**Returns:** `B`

### `putAll(Map<? extends Class<? extends @NonNull B>,? extends B> map)`

**Parameters:**
- `map` (`java.util.Map<? extends java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,? extends B>`)

**Returns:** `void`

### `putInstance(Class<@NonNull T> type, T value)`

**Parameters:**
- `type` (`java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>`)
- `value` (`T`)

**Returns:** `T`

### `getInstance(Class<T> type)`

**Parameters:**
- `type` (`java.lang.Class<T>`)

**Returns:** `T`

### `cast(Class<T> type, Object value)`

**Parameters:**
- `type` (`java.lang.Class<T>`)
- `value` (`java.lang.Object`)

**Returns:** `T`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(ObjectInputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

**Returns:** `void`

