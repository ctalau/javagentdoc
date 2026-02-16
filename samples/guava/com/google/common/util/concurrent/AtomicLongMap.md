# Class: `AtomicLongMap`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AtomicLongMap`

**Implements:** `java.io.Serializable`

## Type Parameters

- `K` extends `java.lang.Object`

## Description

A map containing `long` values that can be atomically updated. While writes to a
 traditional `Map` rely on `put(K, V)`, the typical mechanism for writing to this map
 is `addAndGet(K, long)`, which adds a `long` to the value currently associated with
 `K`. If a key has not yet been associated with a value, its implicit value is zero.

 <p>Most methods in this class treat absent values and zero values identically, as individually
 documented. Exceptions to this are `containsKey`, `size`, `isEmpty`, `asMap`, and `toString`.

 <p>Instances of this class may be used by multiple threads concurrently. All operations are
 atomic unless otherwise noted.

 <p>Instances of this class are serializable if the keys are serializable.

 <p><b>Note:</b> If your values are always positive and less than 2^31, you may wish to use a
 `com.google.common.collect.Multiset` such as `com.google.common.collect.ConcurrentHashMultiset` instead.

 <p><b>Warning:</b> Unlike `Multiset`, entries whose values are zero are not automatically
 removed from the map. Instead they must be removed manually with `removeAllZeros`.
**Author:** Charles Fry
**Since:** 11.0

## Fields

### `map`

**Type:** `java.util.concurrent.ConcurrentHashMap<K,java.lang.Long>`

### `asMap`

**Type:** `java.util.Map<K,java.lang.Long>`

## Constructors

### `<init>(`java.util.concurrent.ConcurrentHashMap<K,java.lang.Long>` map)`

## Methods

### `create()`

**Returns:** [`com.google.common.util.concurrent.AtomicLongMap<K>`](./AtomicLongMap.md)

Creates an `AtomicLongMap`.

### `create(`java.util.Map<? extends K,? extends java.lang.Long>` m)`

**Returns:** [`com.google.common.util.concurrent.AtomicLongMap<K>`](./AtomicLongMap.md)

Creates an `AtomicLongMap` with the same mappings as the specified `Map`.

### `get(`K` key)`

**Returns:** `long`

Returns the value associated with `key`, or zero if there is no value associated with
 `key`.

### `incrementAndGet(`K` key)`

**Returns:** `long`

Increments by one the value currently associated with `key`, and returns the new value.

### `decrementAndGet(`K` key)`

**Returns:** `long`

Decrements by one the value currently associated with `key`, and returns the new value.

### `addAndGet(`K` key, `long` delta)`

**Returns:** `long`

Adds `delta` to the value currently associated with `key`, and returns the new
 value.

### `getAndIncrement(`K` key)`

**Returns:** `long`

Increments by one the value currently associated with `key`, and returns the old value.

### `getAndDecrement(`K` key)`

**Returns:** `long`

Decrements by one the value currently associated with `key`, and returns the old value.

### `getAndAdd(`K` key, `long` delta)`

**Returns:** `long`

Adds `delta` to the value currently associated with `key`, and returns the old
 value.

### `updateAndGet(`K` key, `java.util.function.LongUnaryOperator` updaterFunction)`

**Returns:** `long`

Updates the value currently associated with `key` with the specified function, and
 returns the new value. If there is not currently a value associated with `key`, the
 function is applied to `0L`.
**Since:** 21.0

### `getAndUpdate(`K` key, `java.util.function.LongUnaryOperator` updaterFunction)`

**Returns:** `long`

Updates the value currently associated with `key` with the specified function, and
 returns the old value. If there is not currently a value associated with `key`, the
 function is applied to `0L`.
**Since:** 21.0

### `accumulateAndGet(`K` key, `long` x, `java.util.function.LongBinaryOperator` accumulatorFunction)`

**Returns:** `long`

Updates the value currently associated with `key` by combining it with `x` via the
 specified accumulator function, returning the new value. The previous value associated with
 `key` (or zero, if there is none) is passed as the first argument to `accumulatorFunction`, and `x` is passed as the second argument.
**Since:** 21.0

### `getAndAccumulate(`K` key, `long` x, `java.util.function.LongBinaryOperator` accumulatorFunction)`

**Returns:** `long`

Updates the value currently associated with `key` by combining it with `x` via the
 specified accumulator function, returning the old value. The previous value associated with
 `key` (or zero, if there is none) is passed as the first argument to `accumulatorFunction`, and `x` is passed as the second argument.
**Since:** 21.0

### `put(`K` key, `long` newValue)`

**Returns:** `long`

Associates `newValue` with `key` in this map, and returns the value previously
 associated with `key`, or zero if there was no such value.

### `putAll(`java.util.Map<? extends K,? extends java.lang.Long>` m)`

**Returns:** `void`

Copies all of the mappings from the specified map to this map. The effect of this call is
 equivalent to that of calling `put(k, v)` on this map once for each mapping from key
 `k` to value `v` in the specified map. The behavior of this operation is undefined
 if the specified map is modified while the operation is in progress.

### `remove(`K` key)`

**Returns:** `long`

Removes and returns the value associated with `key`. If `key` is not in the map,
 this method has no effect and returns zero.

### `remove(`K` key, `long` value)`

**Returns:** `boolean`

If `(key, value)` is currently in the map, this method removes it and returns true;
 otherwise, this method returns false.

### `removeIfZero(`K` key)`

**Returns:** `boolean`

Atomically remove `key` from the map iff its associated value is 0.
**Since:** 20.0

### `removeAllZeros()`

**Returns:** `void`

Removes all mappings from this map whose values are zero.

 <p>This method is not atomic: the map may be visible in intermediate states, where some of the
 zero values have been removed and others have not.

### `sum()`

**Returns:** `long`

Returns the sum of all values in this map.

 <p>This method is not atomic: the sum may or may not include other concurrent operations.

### `asMap()`

**Returns:** `java.util.Map<K,java.lang.Long>`

Returns a live, read-only view of the map backing this `AtomicLongMap`.

### `createAsMap()`

**Returns:** `java.util.Map<K,java.lang.Long>`

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

Returns true if this map contains a mapping for the specified key.

### `size()`

**Returns:** `int`

Returns the number of key-value mappings in this map. If the map contains more than `Integer.MAX_VALUE` elements, returns `Integer.MAX_VALUE`.

### `isEmpty()`

**Returns:** `boolean`

Returns `true` if this map contains no key-value mappings.

### `clear()`

**Returns:** `void`

Removes all of the mappings from this map. The map will be empty after this call returns.

 <p>This method is not atomic: the map may not be empty after returning if there were concurrent
 writes.

### `toString()`

**Returns:** `java.lang.String`

### `putIfAbsent(`K` key, `long` newValue)`

**Returns:** `long`

If `key` is not already associated with a value or if `key` is associated with
 zero, associate it with `newValue`. Returns the previous value associated with `key`, or zero if there was no mapping for `key`.

### `replace(`K` key, `long` expectedOldValue, `long` newValue)`

**Returns:** `boolean`

If `(key, expectedOldValue)` is currently in the map, this method replaces `expectedOldValue` with `newValue` and returns true; otherwise, this method returns false.

 <p>If `expectedOldValue` is zero, this method will succeed if `(key, zero)` is
 currently in the map, or if `key` is not in the map at all.

