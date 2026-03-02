# Class: `Platform`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.Platform`

## Description

## Constructors

### `<init>()`

## Methods

### `newHashMapWithExpectedSize(int expectedSize)`

**Returns:** `java.util.Map<K,V>`

**Parameters:**
- `expectedSize` (`int`)

### `newLinkedHashMapWithExpectedSize(int expectedSize)`

**Returns:** `java.util.Map<K,V>`

**Parameters:**
- `expectedSize` (`int`)

### `newHashSetWithExpectedSize(int expectedSize)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `expectedSize` (`int`)

### `newConcurrentHashSet()`

**Returns:** `java.util.Set<E>`

### `newLinkedHashSetWithExpectedSize(int expectedSize)`

**Returns:** `java.util.Set<E>`

**Parameters:**
- `expectedSize` (`int`)

### `preservesInsertionOrderOnPutsMap()`

**Returns:** `java.util.Map<K,V>`

### `preservesInsertionOrderOnAddsSet()`

**Returns:** `java.util.Set<E>`

### `newArray(T[] reference, int length)`

**Returns:** `T[]`

**Parameters:**
- `reference` (`T[]`): any array of the desired type
- `length` (`int`): the length of the new array

### `copy(java.lang.Object[] source, int from, int to, T[] arrayOfType)`

**Returns:** `T[]`

**Parameters:**
- `source` (`java.lang.Object[]`)
- `from` (`int`)
- `to` (`int`)
- `arrayOfType` (`T[]`)

### `tryWeakKeys(com.google.common.collect.MapMaker mapMaker)`

**Returns:** [`com.google.common.collect.MapMaker`](./MapMaker.md)

This is sometimes acceptable, when only server-side code could generate enough volume
 that reclamation becomes important.

**Parameters:**
- `mapMaker` ([`com.google.common.collect.MapMaker`](./MapMaker.md))

### `getDeclaringClassOrObjectForJ2cl(E e)`

**Returns:** `java.lang.Class<E>`

**Parameters:**
- `e` (`E`)

### `reduceIterationsIfGwt(int iterations)`

**Returns:** `int`

**Parameters:**
- `iterations` (`int`)

### `reduceExponentIfGwt(int exponent)`

**Returns:** `int`

**Parameters:**
- `exponent` (`int`)

