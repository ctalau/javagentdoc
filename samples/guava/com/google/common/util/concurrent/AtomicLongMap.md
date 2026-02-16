# Class: `AtomicLongMap`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AtomicLongMap`

**Implements:** [`java.io.Serializable`](../../../../../java/io/Serializable.md)

## Type Parameters

- `K` extends `java.lang.Object`

## Description

A map containing {@code long} values that can be atomically updated. While writes to a
 traditional {@code Map} rely on {@code put(K, V)}, the typical mechanism for writing to this map
 is {@code addAndGet(K, long)}, which adds a {@code long} to the value currently associated with
 {@code K}. If a key has not yet been associated with a value, its implicit value is zero.

 <p>Most methods in this class treat absent values and zero values identically, as individually
 documented. Exceptions to this are {@link #containsKey}, {@link #size}, {@link #isEmpty}, {@link #asMap}, and {@link #toString}.

 <p>Instances of this class may be used by multiple threads concurrently. All operations are
 atomic unless otherwise noted.

 <p>Instances of this class are serializable if the keys are serializable.

 <p><b>Note:</b> If your values are always positive and less than 2^31, you may wish to use a
 {@link com.google.common.collect.Multiset} such as {@link com.google.common.collect.ConcurrentHashMultiset} instead.

 <p><b>Warning:</b> Unlike {@code Multiset}, entries whose values are zero are not automatically
 removed from the map. Instead they must be removed manually with {@link #removeAllZeros}.
@author Charles Fry
@since 11.0

## Fields

### `map`

**Type:** [`java.util.concurrent.ConcurrentHashMap<K,java.lang.Long>`](../../../../../java/util/concurrent/ConcurrentHashMap.md)

### `asMap`

**Type:** [`java.util.Map<K,java.lang.Long>`](../../../../../java/util/Map.md)

## Constructors

### `<init>([`java.util.concurrent.ConcurrentHashMap<K,java.lang.Long>`](../../../../../java/util/concurrent/ConcurrentHashMap.md) map)`

## Methods

### `create()`

**Returns:** [`com.google.common.util.concurrent.AtomicLongMap<K>`](./AtomicLongMap.md)

Creates an {@code AtomicLongMap}.

### `create([`java.util.Map<? extends K,? extends java.lang.Long>`](../../../../../java/util/Map.md) m)`

**Returns:** [`com.google.common.util.concurrent.AtomicLongMap<K>`](./AtomicLongMap.md)

Creates an {@code AtomicLongMap} with the same mappings as the specified {@code Map}.

### `get([`K`](K.md) key)`

**Returns:** `long`

Returns the value associated with {@code key}, or zero if there is no value associated with
 {@code key}.

### `incrementAndGet([`K`](K.md) key)`

**Returns:** `long`

Increments by one the value currently associated with {@code key}, and returns the new value.

### `decrementAndGet([`K`](K.md) key)`

**Returns:** `long`

Decrements by one the value currently associated with {@code key}, and returns the new value.

### `addAndGet([`K`](K.md) key, `long` delta)`

**Returns:** `long`

Adds {@code delta} to the value currently associated with {@code key}, and returns the new
 value.

### `getAndIncrement([`K`](K.md) key)`

**Returns:** `long`

Increments by one the value currently associated with {@code key}, and returns the old value.

### `getAndDecrement([`K`](K.md) key)`

**Returns:** `long`

Decrements by one the value currently associated with {@code key}, and returns the old value.

### `getAndAdd([`K`](K.md) key, `long` delta)`

**Returns:** `long`

Adds {@code delta} to the value currently associated with {@code key}, and returns the old
 value.

### `updateAndGet([`K`](K.md) key, [`java.util.function.LongUnaryOperator`](../../../../../java/util/function/LongUnaryOperator.md) updaterFunction)`

**Returns:** `long`

Updates the value currently associated with {@code key} with the specified function, and
 returns the new value. If there is not currently a value associated with {@code key}, the
 function is applied to {@code 0L}.
@since 21.0

### `getAndUpdate([`K`](K.md) key, [`java.util.function.LongUnaryOperator`](../../../../../java/util/function/LongUnaryOperator.md) updaterFunction)`

**Returns:** `long`

Updates the value currently associated with {@code key} with the specified function, and
 returns the old value. If there is not currently a value associated with {@code key}, the
 function is applied to {@code 0L}.
@since 21.0

### `accumulateAndGet([`K`](K.md) key, `long` x, [`java.util.function.LongBinaryOperator`](../../../../../java/util/function/LongBinaryOperator.md) accumulatorFunction)`

**Returns:** `long`

Updates the value currently associated with {@code key} by combining it with {@code x} via the
 specified accumulator function, returning the new value. The previous value associated with
 {@code key} (or zero, if there is none) is passed as the first argument to {@code
 accumulatorFunction}, and {@code x} is passed as the second argument.
@since 21.0

### `getAndAccumulate([`K`](K.md) key, `long` x, [`java.util.function.LongBinaryOperator`](../../../../../java/util/function/LongBinaryOperator.md) accumulatorFunction)`

**Returns:** `long`

Updates the value currently associated with {@code key} by combining it with {@code x} via the
 specified accumulator function, returning the old value. The previous value associated with
 {@code key} (or zero, if there is none) is passed as the first argument to {@code
 accumulatorFunction}, and {@code x} is passed as the second argument.
@since 21.0

### `put([`K`](K.md) key, `long` newValue)`

**Returns:** `long`

Associates {@code newValue} with {@code key} in this map, and returns the value previously
 associated with {@code key}, or zero if there was no such value.

### `putAll([`java.util.Map<? extends K,? extends java.lang.Long>`](../../../../../java/util/Map.md) m)`

**Returns:** `void`

Copies all of the mappings from the specified map to this map. The effect of this call is
 equivalent to that of calling {@code put(k, v)} on this map once for each mapping from key
 {@code k} to value {@code v} in the specified map. The behavior of this operation is undefined
 if the specified map is modified while the operation is in progress.

### `remove([`K`](K.md) key)`

**Returns:** `long`

Removes and returns the value associated with {@code key}. If {@code key} is not in the map,
 this method has no effect and returns zero.

### `remove([`K`](K.md) key, `long` value)`

**Returns:** `boolean`

If {@code (key, value)} is currently in the map, this method removes it and returns true;
 otherwise, this method returns false.

### `removeIfZero([`K`](K.md) key)`

**Returns:** `boolean`

Atomically remove {@code key} from the map iff its associated value is 0.
@since 20.0

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

**Returns:** [`java.util.Map<K,java.lang.Long>`](../../../../../java/util/Map.md)

Returns a live, read-only view of the map backing this {@code AtomicLongMap}.

### `createAsMap()`

**Returns:** [`java.util.Map<K,java.lang.Long>`](../../../../../java/util/Map.md)

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

Returns true if this map contains a mapping for the specified key.

### `size()`

**Returns:** `int`

Returns the number of key-value mappings in this map. If the map contains more than {@code
 Integer.MAX_VALUE} elements, returns {@code Integer.MAX_VALUE}.

### `isEmpty()`

**Returns:** `boolean`

Returns {@code true} if this map contains no key-value mappings.

### `clear()`

**Returns:** `void`

Removes all of the mappings from this map. The map will be empty after this call returns.

 <p>This method is not atomic: the map may not be empty after returning if there were concurrent
 writes.

### `toString()`

**Returns:** `java.lang.String`

### `putIfAbsent([`K`](K.md) key, `long` newValue)`

**Returns:** `long`

If {@code key} is not already associated with a value or if {@code key} is associated with
 zero, associate it with {@code newValue}. Returns the previous value associated with {@code
 key}, or zero if there was no mapping for {@code key}.

### `replace([`K`](K.md) key, `long` expectedOldValue, `long` newValue)`

**Returns:** `boolean`

If {@code (key, expectedOldValue)} is currently in the map, this method replaces {@code
 expectedOldValue} with {@code newValue} and returns true; otherwise, this method returns false.

 <p>If {@code expectedOldValue} is zero, this method will succeed if {@code (key, zero)} is
 currently in the map, or if {@code key} is not in the map at all.

