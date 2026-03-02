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

### `containsEntry(java.lang.Object key, java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `key` (`java.lang.Object`)
- `value` (`java.lang.Object`)

### `containsKey(java.lang.Object key)`

**Returns:** `boolean`

**Parameters:**
- `key` (`java.lang.Object`)

### `containsValue(java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `value` (`java.lang.Object`)

### `entries()`

**Returns:** `java.util.Collection<java.util.Map.Entry<K,V>>`

### `get(K key)`

**Returns:** `java.util.Collection<V>`

**Parameters:**
- `key` (`K`)

### `isEmpty()`

**Returns:** `boolean`

### `keys()`

**Returns:** [`com.google.common.collect.Multiset<K>`](./Multiset.md)

### `keySet()`

**Returns:** `java.util.Set<K>`

### `put(K key, V value)`

**Returns:** `boolean`

**Parameters:**
- `key` (`K`)
- `value` (`V`)

### `putAll(K key, java.lang.Iterable<? extends V> values)`

**Returns:** `boolean`

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

### `putAll(com.google.common.collect.Multimap<? extends K,? extends V> multimap)`

**Returns:** `boolean`

**Parameters:**
- `multimap` ([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md))

### `remove(java.lang.Object key, java.lang.Object value)`

**Returns:** `boolean`

**Parameters:**
- `key` (`java.lang.Object`)
- `value` (`java.lang.Object`)

### `removeAll(java.lang.Object key)`

**Returns:** `java.util.Collection<V>`

**Parameters:**
- `key` (`java.lang.Object`)

### `replaceValues(K key, java.lang.Iterable<? extends V> values)`

**Returns:** `java.util.Collection<V>`

**Parameters:**
- `key` (`K`)
- `values` (`java.lang.Iterable<? extends V>`)

### `size()`

**Returns:** `int`

### `values()`

**Returns:** `java.util.Collection<V>`

### `equals(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

