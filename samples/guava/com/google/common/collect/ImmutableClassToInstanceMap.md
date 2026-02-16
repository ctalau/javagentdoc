# Class: `ImmutableClassToInstanceMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableClassToInstanceMap`

**Extends:** [`com.google.common.collect.ForwardingMap<java.lang.Class<? extends @org.checkerframework.checker.nullness.qual.NonNull B>,B>`](./ForwardingMap,B>.md)

**Implements:** [`com.google.common.collect.ClassToInstanceMap<B>`](./ClassToInstanceMap.md), [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `B` extends `java.lang.Object`

## Description

A {@link ClassToInstanceMap} whose contents will never change, with many other important
 properties detailed at {@link ImmutableCollection}.
@author Kevin Bourrillion
@since 2.0

## Fields

### `EMPTY`

**Type:** [`com.google.common.collect.ImmutableClassToInstanceMap<java.lang.Object>`](./ImmutableClassToInstanceMap.md)

### `delegate`

**Type:** [`com.google.common.collect.ImmutableMap<java.lang.Class<? extends B>,B>`](./ImmutableMap,B>.md)

## Constructors

### `<init>([`com.google.common.collect.ImmutableMap<java.lang.Class<? extends B>,B>`](./ImmutableMap,B>.md) delegate)`

## Methods

### `of()`

**Returns:** [`com.google.common.collect.ImmutableClassToInstanceMap<B>`](./ImmutableClassToInstanceMap.md)

Returns an empty {@code ImmutableClassToInstanceMap}.

 <p><b>Performance note:</b> the instance returned is a singleton.
@since 19.0

### `of(`java.lang.Class<T>` type, [`T`](T.md) value)`

**Returns:** [`com.google.common.collect.ImmutableClassToInstanceMap<B>`](./ImmutableClassToInstanceMap.md)

Returns an {@code ImmutableClassToInstanceMap} containing a single entry.
@since 19.0

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableClassToInstanceMap.Builder<B>`](ImmutableClassToInstanceMap/Builder.md)

Returns a new builder. The generated builder is equivalent to the builder created by the {@link Builder} constructor.

### `copyOf([`java.util.Map<? extends java.lang.Class<? extends S>,? extends S>`](../../../../java/util/Map,? extends S>.md) map)`

**Returns:** [`com.google.common.collect.ImmutableClassToInstanceMap<B>`](./ImmutableClassToInstanceMap.md)

Returns an immutable map containing the same entries as {@code map}. If {@code map} somehow
 contains entries with duplicate keys (for example, if it is a {@code SortedMap} whose
 comparator is not <i>consistent with equals</i>), the results of this method are undefined.

 <p><b>Note:</b> Despite what the method name suggests, if {@code map} is an {@code
 ImmutableClassToInstanceMap}, no copy will actually be performed.
@throws NullPointerException if any key or value in {@code map} is null
@throws ClassCastException if any value is not an instance of the type specified by its key

### `delegate()`

**Returns:** [`java.util.Map<java.lang.Class<? extends B>,B>`](../../../../java/util/Map,B>.md)

### `getInstance(`java.lang.Class<T>` type)`

**Returns:** [`T`](T.md)

### `putInstance(`java.lang.Class<T>` type, [`T`](T.md) value)`

**Returns:** [`T`](T.md)

Guaranteed to throw an exception and leave the map unmodified.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `readResolve()`

**Returns:** `java.lang.Object`

