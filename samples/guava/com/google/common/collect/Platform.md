# Class: `Platform`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Platform`

## Description

## Constructors

### `<init>()`

## Methods

### `newHashMapWithExpectedSize(int expectedSize)`

**Parameters:**
- `expectedSize` (`int`)

**Returns:** `java.util.Map<K,V>`

### `newLinkedHashMapWithExpectedSize(int expectedSize)`

**Parameters:**
- `expectedSize` (`int`)

**Returns:** `java.util.Map<K,V>`

### `newHashSetWithExpectedSize(int expectedSize)`

**Parameters:**
- `expectedSize` (`int`)

**Returns:** `java.util.Set<E>`

### `newConcurrentHashSet()`

**Returns:** `java.util.Set<E>`

### `newLinkedHashSetWithExpectedSize(int expectedSize)`

**Parameters:**
- `expectedSize` (`int`)

**Returns:** `java.util.Set<E>`

### `preservesInsertionOrderOnPutsMap()`

**Returns:** `java.util.Map<K,V>`

### `preservesInsertionOrderOnAddsSet()`

**Returns:** `java.util.Set<E>`

### `newArray(T[] reference, int length)`

**Parameters:**
- `reference` (`T[]`): any array of the desired type
- `length` (`int`): the length of the new array

**Returns:** `T[]`

### `copy(Object[] source, int from, int to, T[] arrayOfType)`

**Parameters:**
- `source` (`java.lang.Object[]`)
- `from` (`int`)
- `to` (`int`)
- `arrayOfType` (`T[]`)

**Returns:** `T[]`

### `tryWeakKeys(MapMaker mapMaker)`

This is sometimes acceptable, when only server-side code could generate enough volume
 that reclamation becomes important.

**Parameters:**
- `mapMaker` ([`com.google.common.collect.MapMaker`](./MapMaker.md))

**Returns:** [`com.google.common.collect.MapMaker`](./MapMaker.md)

### `getDeclaringClassOrObjectForJ2cl(E e)`

**Parameters:**
- `e` (`E`)

**Returns:** `java.lang.Class<E>`

### `reduceIterationsIfGwt(int iterations)`

**Parameters:**
- `iterations` (`int`)

**Returns:** `int`

### `reduceExponentIfGwt(int exponent)`

**Parameters:**
- `exponent` (`int`)

**Returns:** `int`

