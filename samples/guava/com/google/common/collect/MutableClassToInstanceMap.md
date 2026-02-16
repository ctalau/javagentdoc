# Class: `MutableClassToInstanceMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.MutableClassToInstanceMap`

**Extends:** [`com.google.common.collect.ForwardingMap<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`](./ForwardingMap,B>.md)

**Implements:** [`com.google.common.collect.ClassToInstanceMap<B>`](./ClassToInstanceMap.md), [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `B` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A mutable class-to-instance map backed by an arbitrary user-provided map. See also {@link ImmutableClassToInstanceMap}.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#classtoinstancemap">{@code
 ClassToInstanceMap}</a>.
@author Kevin Bourrillion
@since 2.0

## Fields

### `delegate`

**Type:** [`java.util.Map<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`](../../../../java/util/Map,B>.md)

## Constructors

### `<init>([`java.util.Map<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`](../../../../java/util/Map,B>.md) delegate)`

## Methods

### `create()`

**Returns:** [`com.google.common.collect.MutableClassToInstanceMap<B>`](./MutableClassToInstanceMap.md)

Returns a new {@code MutableClassToInstanceMap} instance backed by a {@link HashMap} using the
 default initial capacity and load factor.

### `create([`java.util.Map<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`](../../../../java/util/Map,B>.md) backingMap)`

**Returns:** [`com.google.common.collect.MutableClassToInstanceMap<B>`](./MutableClassToInstanceMap.md)

Returns a new {@code MutableClassToInstanceMap} instance backed by a given empty {@code
 backingMap}. The caller surrenders control of the backing map, and thus should not allow any
 direct references to it to remain accessible.

### `delegate()`

**Returns:** [`java.util.Map<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`](../../../../java/util/Map,B>.md)

### `checkedEntry([`java.util.Map.Entry<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`](../../../../java/util/Map/Entry,B>.md) entry)`

**Returns:** [`java.util.Map.Entry<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`](../../../../java/util/Map/Entry,B>.md)

Wraps the {@code setValue} implementation of an {@code Entry} to enforce the class constraint.

### `entrySet()`

**Returns:** [`java.util.Set<java.util.Map.Entry<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>>`](../../../../java/util/Set,B>>.md)

### `put(`java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>` key, [`B`](B.md) value)`

**Returns:** [`B`](B.md)

### `putAll([`java.util.Map<? extends java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,? extends B>`](../../../../java/util/Map,? extends B>.md) map)`

**Returns:** `void`

### `putInstance(`java.lang.Class<@org.checkerframework.checker.nullness.qual.NonNull T>` type, [`T`](T.md) value)`

**Returns:** [`T`](T.md)

### `getInstance(`java.lang.Class<T>` type)`

**Returns:** [`T`](T.md)

### `cast(`java.lang.Class<T>` type, `java.lang.Object` value)`

**Returns:** [`T`](T.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

