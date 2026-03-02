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

### `remove(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `clear()`

**Returns:** `void`

### `containsKey(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `boolean`

### `containsValue(Object value)`

**Parameters:**
- `value` (`java.lang.Object`)

**Returns:** `boolean`

### `get(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `put(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `V`

### `putAll(Map<? extends K,? extends V> map)`

**Parameters:**
- `map` (`java.util.Map<? extends K,? extends V>`)

**Returns:** `void`

### `keySet()`

**Returns:** `java.util.Set<K>`

### `values()`

**Returns:** `java.util.Collection<V>`

### `entrySet()`

**Returns:** `java.util.Set<java.util.Map.Entry<K,V>>`

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `standardPutAll(Map<? extends K,? extends V> map)`

If you
 override #put(Object, Object), you may wish to override #putAll(Map) to forward
 to this implementation.

**Parameters:**
- `map` (`java.util.Map<? extends K,? extends V>`)

**Returns:** `void`

### `standardRemove(Object key)`

If you override #entrySet, you may wish to override #remove to forward to this implementation.

 
Alternately, you may wish to override #remove with keySet().remove, assuming
 that approach would not lead to an infinite loop.

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `V`

### `standardClear()`

In many cases, you may wish to override #clear to forward to this
 implementation.

**Returns:** `void`

### `standardContainsKey(Object key)`

If you override #entrySet, you may wish to
 override #containsKey to forward to this implementation.

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `boolean`

### `standardContainsValue(Object value)`

If you override #entrySet, you may wish to override #containsValue to forward to this implementation.

**Parameters:**
- `value` (`java.lang.Object`)

**Returns:** `boolean`

### `standardIsEmpty()`

If you override #entrySet, you may wish to override #isEmpty to
 forward to this implementation.

**Returns:** `boolean`

### `standardEquals(Object object)`

If you override #entrySet, you may wish to override #equals to
 forward to this implementation.

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `standardHashCode()`

If you override #entrySet, you may wish to override #hashCode to
 forward to this implementation.

**Returns:** `int`

### `standardToString()`

If you override #entrySet, you may wish to override #toString to
 forward to this implementation.

**Returns:** `java.lang.String`

