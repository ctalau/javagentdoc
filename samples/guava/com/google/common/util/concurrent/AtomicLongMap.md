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

### `<init>(ConcurrentHashMap<K,Long> map)`

**Parameters:**
- `map` (`java.util.concurrent.ConcurrentHashMap<K,java.lang.Long>`)

## Methods

### `create()`

**Returns:** [`com.google.common.util.concurrent.AtomicLongMap<K>`](./AtomicLongMap.md)

### `create(Map<? extends K,? extends Long> m)`

**Parameters:**
- `m` (`java.util.Map<? extends K,? extends java.lang.Long>`)

**Returns:** [`com.google.common.util.concurrent.AtomicLongMap<K>`](./AtomicLongMap.md)

### `get(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `long`

### `incrementAndGet(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `long`

### `decrementAndGet(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `long`

### `addAndGet(K key, long delta)`

**Parameters:**
- `key` (`K`)
- `delta` (`long`)

**Returns:** `long`

### `getAndIncrement(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `long`

### `getAndDecrement(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `long`

### `getAndAdd(K key, long delta)`

**Parameters:**
- `key` (`K`)
- `delta` (`long`)

**Returns:** `long`

### `updateAndGet(K key, LongUnaryOperator updaterFunction)`

If there is not currently a value associated with key, the
 function is applied to 0L.

**Parameters:**
- `key` (`K`)
- `updaterFunction` (`java.util.function.LongUnaryOperator`)

**Returns:** `long`

### `getAndUpdate(K key, LongUnaryOperator updaterFunction)`

If there is not currently a value associated with key, the
 function is applied to 0L.

**Parameters:**
- `key` (`K`)
- `updaterFunction` (`java.util.function.LongUnaryOperator`)

**Returns:** `long`

### `accumulateAndGet(K key, long x, LongBinaryOperator accumulatorFunction)`

The previous value associated with
 key (or zero, if there is none) is passed as the first argument to 
 accumulatorFunction, and x is passed as the second argument.

**Parameters:**
- `key` (`K`)
- `x` (`long`)
- `accumulatorFunction` (`java.util.function.LongBinaryOperator`)

**Returns:** `long`

### `getAndAccumulate(K key, long x, LongBinaryOperator accumulatorFunction)`

The previous value associated with
 key (or zero, if there is none) is passed as the first argument to 
 accumulatorFunction, and x is passed as the second argument.

**Parameters:**
- `key` (`K`)
- `x` (`long`)
- `accumulatorFunction` (`java.util.function.LongBinaryOperator`)

**Returns:** `long`

### `put(K key, long newValue)`

**Parameters:**
- `key` (`K`)
- `newValue` (`long`)

**Returns:** `long`

### `putAll(Map<? extends K,? extends Long> m)`

The effect of this call is
 equivalent to that of calling put(k, v) on this map once for each mapping from key
 k to value v in the specified map. The behavior of this operation is undefined
 if the specified map is modified while the operation is in progress.

**Parameters:**
- `m` (`java.util.Map<? extends K,? extends java.lang.Long>`)

**Returns:** `void`

### `remove(K key)`

If key is not in the map,
 this method has no effect and returns zero.

**Parameters:**
- `key` (`K`)

**Returns:** `long`

### `remove(K key, long value)`

**Parameters:**
- `key` (`K`)
- `value` (`long`)

**Returns:** `boolean`

### `removeIfZero(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `boolean`

### `removeAllZeros()`

This method is not atomic: the map may be visible in intermediate states, where some of the
 zero values have been removed and others have not.

**Returns:** `void`

### `sum()`

This method is not atomic: the sum may or may not include other concurrent operations.

**Returns:** `long`

### `asMap()`

**Returns:** `java.util.Map<K,java.lang.Long>`

### `createAsMap()`

**Returns:** `java.util.Map<K,java.lang.Long>`

### `containsKey(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `boolean`

### `size()`

If the map contains more than 
 Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.

**Returns:** `int`

### `isEmpty()`

**Returns:** `boolean`

### `clear()`

The map will be empty after this call returns.

 
This method is not atomic: the map may not be empty after returning if there were concurrent
 writes.

**Returns:** `void`

### `toString()`

**Returns:** `java.lang.String`

### `putIfAbsent(K key, long newValue)`

Returns the previous value associated with 
 key, or zero if there was no mapping for key.

**Parameters:**
- `key` (`K`)
- `newValue` (`long`)

**Returns:** `long`

### `replace(K key, long expectedOldValue, long newValue)`

If expectedOldValue is zero, this method will succeed if (key, zero) is
 currently in the map, or if key is not in the map at all.

**Parameters:**
- `key` (`K`)
- `expectedOldValue` (`long`)
- `newValue` (`long`)

**Returns:** `boolean`

