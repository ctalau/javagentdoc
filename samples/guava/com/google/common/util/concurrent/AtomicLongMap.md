# Class: `AtomicLongMap`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AtomicLongMap`

**Implements:** `java.io.Serializable`

## Type Parameters

- `K` extends `java.lang.Object`

## Description

While writes to a
 traditional Map rely on put(K, V), the typical mechanism for writing to this map
 is addAndGet(K, long), which adds a long to the value currently associated with
 K. If a key has not yet been associated with a value, its implicit value is zero.

 
Most methods in this class treat absent values and zero values identically, as individually
 documented. Exceptions to this are #containsKey, #size, #isEmpty, #asMap, and #toString.

 
Instances of this class may be used by multiple threads concurrently. All operations are
 atomic unless otherwise noted.

 
Instances of this class are serializable if the keys are serializable.

 
**Note:** If your values are always positive and less than 2^31, you may wish to use a
 com.google.common.collect.Multiset such as com.google.common.collect.ConcurrentHashMultiset instead.

 
**Warning:** Unlike Multiset, entries whose values are zero are not automatically
 removed from the map. Instead they must be removed manually with #removeAllZeros.

## Fields

### `map`

**Type:** `java.util.concurrent.ConcurrentHashMap<K,java.lang.Long>`

### `asMap`

**Type:** `java.util.Map<K,java.lang.Long>`

## Constructors

### `<init>(java.util.concurrent.ConcurrentHashMap<K,java.lang.Long> map)`

**Parameters:**
- `map` (`java.util.concurrent.ConcurrentHashMap<K,java.lang.Long>`)

## Methods

### `create()`

**Returns:** [`com.google.common.util.concurrent.AtomicLongMap<K>`](./AtomicLongMap.md)

### `create(java.util.Map<? extends K,? extends java.lang.Long> m)`

**Returns:** [`com.google.common.util.concurrent.AtomicLongMap<K>`](./AtomicLongMap.md)

**Parameters:**
- `m` (`java.util.Map<? extends K,? extends java.lang.Long>`)

### `get(K key)`

**Returns:** `long`

**Parameters:**
- `key` (`K`)

### `incrementAndGet(K key)`

**Returns:** `long`

**Parameters:**
- `key` (`K`)

### `decrementAndGet(K key)`

**Returns:** `long`

**Parameters:**
- `key` (`K`)

### `addAndGet(K key, long delta)`

**Returns:** `long`

**Parameters:**
- `key` (`K`)
- `delta` (`long`)

### `getAndIncrement(K key)`

**Returns:** `long`

**Parameters:**
- `key` (`K`)

### `getAndDecrement(K key)`

**Returns:** `long`

**Parameters:**
- `key` (`K`)

### `getAndAdd(K key, long delta)`

**Returns:** `long`

**Parameters:**
- `key` (`K`)
- `delta` (`long`)

### `updateAndGet(K key, java.util.function.LongUnaryOperator updaterFunction)`

**Returns:** `long`

If there is not currently a value associated with key, the
 function is applied to 0L.

**Parameters:**
- `key` (`K`)
- `updaterFunction` (`java.util.function.LongUnaryOperator`)

### `getAndUpdate(K key, java.util.function.LongUnaryOperator updaterFunction)`

**Returns:** `long`

If there is not currently a value associated with key, the
 function is applied to 0L.

**Parameters:**
- `key` (`K`)
- `updaterFunction` (`java.util.function.LongUnaryOperator`)

### `accumulateAndGet(K key, long x, java.util.function.LongBinaryOperator accumulatorFunction)`

**Returns:** `long`

The previous value associated with
 key (or zero, if there is none) is passed as the first argument to 
 accumulatorFunction, and x is passed as the second argument.

**Parameters:**
- `key` (`K`)
- `x` (`long`)
- `accumulatorFunction` (`java.util.function.LongBinaryOperator`)

### `getAndAccumulate(K key, long x, java.util.function.LongBinaryOperator accumulatorFunction)`

**Returns:** `long`

The previous value associated with
 key (or zero, if there is none) is passed as the first argument to 
 accumulatorFunction, and x is passed as the second argument.

**Parameters:**
- `key` (`K`)
- `x` (`long`)
- `accumulatorFunction` (`java.util.function.LongBinaryOperator`)

### `put(K key, long newValue)`

**Returns:** `long`

**Parameters:**
- `key` (`K`)
- `newValue` (`long`)

### `putAll(java.util.Map<? extends K,? extends java.lang.Long> m)`

**Returns:** `void`

The effect of this call is
 equivalent to that of calling put(k, v) on this map once for each mapping from key
 k to value v in the specified map. The behavior of this operation is undefined
 if the specified map is modified while the operation is in progress.

**Parameters:**
- `m` (`java.util.Map<? extends K,? extends java.lang.Long>`)

### `remove(K key)`

**Returns:** `long`

If key is not in the map,
 this method has no effect and returns zero.

**Parameters:**
- `key` (`K`)

### `remove(K key, long value)`

**Returns:** `boolean`

**Parameters:**
- `key` (`K`)
- `value` (`long`)

### `removeIfZero(K key)`

**Returns:** `boolean`

**Parameters:**
- `key` (`K`)

### `removeAllZeros()`

**Returns:** `void`

This method is not atomic: the map may be visible in intermediate states, where some of the
 zero values have been removed and others have not.

### `sum()`

**Returns:** `long`

This method is not atomic: the sum may or may not include other concurrent operations.

### `asMap()`

**Returns:** `java.util.Map<K,java.lang.Long>`

### `createAsMap()`

**Returns:** `java.util.Map<K,java.lang.Long>`

### `containsKey(java.lang.Object key)`

**Returns:** `boolean`

**Parameters:**
- `key` (`java.lang.Object`)

### `size()`

**Returns:** `int`

If the map contains more than 
 Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.

### `isEmpty()`

**Returns:** `boolean`

### `clear()`

**Returns:** `void`

The map will be empty after this call returns.

 
This method is not atomic: the map may not be empty after returning if there were concurrent
 writes.

### `toString()`

**Returns:** `java.lang.String`

### `putIfAbsent(K key, long newValue)`

**Returns:** `long`

Returns the previous value associated with 
 key, or zero if there was no mapping for key.

**Parameters:**
- `key` (`K`)
- `newValue` (`long`)

### `replace(K key, long expectedOldValue, long newValue)`

**Returns:** `boolean`

If expectedOldValue is zero, this method will succeed if (key, zero) is
 currently in the map, or if key is not in the map at all.

**Parameters:**
- `key` (`K`)
- `expectedOldValue` (`long`)
- `newValue` (`long`)

