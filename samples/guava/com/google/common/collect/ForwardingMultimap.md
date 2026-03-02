# Class: `ForwardingMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingMultimap`

**Extends:** [`com.google.common.collect.ForwardingObject`](./ForwardingObject.md)

**Implements:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Subclasses should override
 one or more methods to modify the behavior of the backing multimap as desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**default method warning:** This class does *not* forward calls to 
 default methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the ForwardingMultimap.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

### `asMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

### `clear()`

**Returns:** `void`

### `containsEntry(Object key, Object value)`

**Parameters:**
- `key` (`java.lang.Object`)
- `value` (`java.lang.Object`)

**Returns:** `boolean`

### `containsKey(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `boolean`

### `containsValue(Object value)`

**Parameters:**
- `value` (`java.lang.Object`)

**Returns:** `boolean`

### `entries()`

**Returns:** `java.util.Collection<java.util.Map.Entry<K,V>>`

### `get(K key)`

**Parameters:**
- `key` (`K`)

**Returns:** `java.util.Collection<V>`

### `isEmpty()`

**Returns:** `boolean`

### `keys()`

**Returns:** [`com.google.common.collect.Multiset<K>`](./Multiset.md)

### `keySet()`

**Returns:** `java.util.Set<K>`

### `put(K key, V value)`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

**Returns:** `boolean`

### `putAll(K key, Iterable<? extends V> values)`

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

**Returns:** `boolean`

### `putAll(Multimap<? extends K,? extends V> multimap)`

**Parameters:**
- `multimap` ([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md))

**Returns:** `boolean`

### `remove(Object key, Object value)`

**Parameters:**
- `key` (`java.lang.Object`)
- `value` (`java.lang.Object`)

**Returns:** `boolean`

### `removeAll(Object key)`

**Parameters:**
- `key` (`java.lang.Object`)

**Returns:** `java.util.Collection<V>`

### `replaceValues(K key, Iterable<? extends V> values)`

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

**Returns:** `java.util.Collection<V>`

### `size()`

**Returns:** `int`

### `values()`

**Returns:** `java.util.Collection<V>`

### `equals(Object object)`

**Parameters:**
- `object` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

