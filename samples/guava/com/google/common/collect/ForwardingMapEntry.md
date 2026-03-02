# Class: `ForwardingMapEntry`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingMapEntry`

**Extends:** [`com.google.common.collect.ForwardingObject`](./ForwardingObject.md)

**Implements:** `java.util.Map.Entry<K,V>`

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Subclasses should override
 one or more methods to modify the behavior of the backing map entry as desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**Warning:** The methods of ForwardingMapEntry forward *indiscriminately* to
 the methods of the delegate. For example, overriding #getValue alone *will not*
 change the behavior of #equals, which can lead to unexpected behavior. In this case, you
 should override equals as well, either providing your own implementation, or delegating
 to the provided standardEquals method.

 
Each of the standard methods, where appropriate, use Objects#equal to test
 equality for both keys and values. This may not be the desired behavior for map implementations
 that use non-standard notions of key equality, such as the entry of a SortedMap whose
 comparator is not consistent with equals.

 
The standard methods are not guaranteed to be thread-safe, even when all of the
 methods that they depend on are thread-safe.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.util.Map.Entry<K,V>`

### `getKey()`

**Returns:** `K`

### `getValue()`

**Returns:** `V`

### `setValue(V value)`

**Parameters:**
- `value` (`V`)

**Returns:** `V`

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `standardEquals(Object object)`

If you override either of these methods, you may wish to override #equals(Object) to forward to this implementation.

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `standardHashCode()`

If you override either of these methods, you may wish to override #hashCode() to forward to this implementation.

**Returns:** `int`

### `standardToString()`

If you override either of these methods, you may wish to override #equals to forward to
 this implementation.

**Returns:** `java.lang.String`

