# Class: `ForwardingMap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingMap`

**Extends:** [`com.google.common.collect.ForwardingObject`](./ForwardingObject.md)

**Implements:** `java.util.Map<K,V>`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Subclasses should override one or more
 methods to modify the behavior of the backing map as desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**Warning:** The methods of ForwardingMap forward *indiscriminately* to the
 methods of the delegate. For example, overriding #put alone *will not* change the
 behavior of #putAll, which can lead to unexpected behavior. In this case, you should
 override putAll as well, either providing your own implementation, or delegating to the
 provided standardPutAll method.

 
**default method warning:** This class does *not* forward calls to 
 default methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the ForwardingMap.

 
Each of the standard methods, where appropriate, use Objects#equal to test
 equality for both keys and values. This may not be the desired behavior for map implementations
 that use non-standard notions of key equality, such as a SortedMap whose comparator is
 not consistent with equals.

 
The standard methods and the collection views they return are not guaranteed to be
 thread-safe, even when all of the methods that they depend on are thread-safe.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.util.Map<K,V>`

### `size()`

**Returns:** `int`

### `isEmpty()`

**Returns:** `boolean`

### `remove(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `clear()`

**Returns:** `void`

### `containsKey(java.lang.Object key)`

**Returns:** `boolean`

**Parameters:**
- `key` (`java.lang.Object`)

### `containsValue(java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `value` (`java.lang.Object`)

### `get(java.lang.Object key)`

**Returns:** `V`

**Parameters:**
- `key` (`java.lang.Object`)

### `put(K key, V value)`

**Returns:** `V`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `putAll(java.util.Map<? extends K,? extends V> map)`

**Returns:** `void`

**Parameters:**
- `map` (`java.util.Map<? extends K,? extends V>`)

### `keySet()`

**Returns:** `java.util.Set<K>`

### `values()`

**Returns:** `java.util.Collection<V>`

### `entrySet()`

**Returns:** `java.util.Set<java.util.Map.Entry<K,V>>`

### `equals(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `standardPutAll(java.util.Map<? extends K,? extends V> map)`

**Returns:** `void`

If you
 override #put(Object, Object), you may wish to override #putAll(Map) to forward
 to this implementation.

**Parameters:**
- `map` (`java.util.Map<? extends K,? extends V>`)

### `standardRemove(java.lang.Object key)`

**Returns:** `V`

If you override #entrySet, you may wish to override #remove to forward to this implementation.

 
Alternately, you may wish to override #remove with keySet().remove, assuming
 that approach would not lead to an infinite loop.

**Parameters:**
- `key` (`java.lang.Object`)

### `standardClear()`

**Returns:** `void`

In many cases, you may wish to override #clear to forward to this
 implementation.

### `standardContainsKey(java.lang.Object key)`

**Returns:** `boolean`

If you override #entrySet, you may wish to
 override #containsKey to forward to this implementation.

**Parameters:**
- `key` (`java.lang.Object`)

### `standardContainsValue(java.lang.Object value)`

**Returns:** `boolean`

If you override #entrySet, you may wish to override #containsValue to forward to this implementation.

**Parameters:**
- `value` (`java.lang.Object`)

### `standardIsEmpty()`

**Returns:** `boolean`

If you override #entrySet, you may wish to override #isEmpty to
 forward to this implementation.

### `standardEquals(java.lang.Object object)`

**Returns:** `boolean`

If you override #entrySet, you may wish to override #equals to
 forward to this implementation.

**Parameters:**
- `object` (`java.lang.Object`)

### `standardHashCode()`

**Returns:** `int`

If you override #entrySet, you may wish to override #hashCode to
 forward to this implementation.

### `standardToString()`

**Returns:** `java.lang.String`

If you override #entrySet, you may wish to override #toString to
 forward to this implementation.

