# Class: `Platform`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Platform`

## Description

Methods factored out so that they can be emulated differently in GWT.
**Author:** Hayward Chan

## Constructors

### `<init>()`

## Methods

### `newHashMapWithExpectedSize(`int` expectedSize)`

**Returns:** `java.util.Map<K,V>`

Returns the platform preferred implementation of a map based on a hash table.

### `newLinkedHashMapWithExpectedSize(`int` expectedSize)`

**Returns:** `java.util.Map<K,V>`

Returns the platform preferred implementation of an insertion ordered map based on a hash
 table.

### `newHashSetWithExpectedSize(`int` expectedSize)`

**Returns:** `java.util.Set<E>`

Returns the platform preferred implementation of a set based on a hash table.

### `newConcurrentHashSet()`

**Returns:** `java.util.Set<E>`

Returns the platform preferred implementation of a thread-safe hash set.

### `newLinkedHashSetWithExpectedSize(`int` expectedSize)`

**Returns:** `java.util.Set<E>`

Returns the platform preferred implementation of an insertion ordered set based on a hash
 table.

### `preservesInsertionOrderOnPutsMap()`

**Returns:** `java.util.Map<K,V>`

Returns the platform preferred map implementation that preserves insertion order when used only
 for insertions.

### `preservesInsertionOrderOnAddsSet()`

**Returns:** `java.util.Set<E>`

Returns the platform preferred set implementation that preserves insertion order when used only
 for insertions.

### `newArray(`T[]` reference, `int` length)`

**Returns:** `T[]`

Returns a new array of the given length with the same type as a reference array.
@param reference any array of the desired type
@param length the length of the new array

### `copy(`java.lang.Object[]` source, `int` from, `int` to, `T[]` arrayOfType)`

**Returns:** `T[]`

Equivalent to Arrays.copyOfRange(source, from, to, arrayOfType.getClass()).

### `tryWeakKeys([`com.google.common.collect.MapMaker`](./MapMaker.md) mapMaker)`

**Returns:** [`com.google.common.collect.MapMaker`](./MapMaker.md)

Configures the given map maker to use weak keys, if possible; does nothing otherwise (i.e., in
 GWT). This is sometimes acceptable, when only server-side code could generate enough volume
 that reclamation becomes important.

### `getDeclaringClassOrObjectForJ2cl(`E` e)`

**Returns:** `java.lang.Class<E>`

### `reduceIterationsIfGwt(`int` iterations)`

**Returns:** `int`

### `reduceExponentIfGwt(`int` exponent)`

**Returns:** `int`

