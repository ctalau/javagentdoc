# Class: `ForwardingMultimap`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingMultimap`

**Extends:** [`com.google.common.collect.ForwardingObject`](./ForwardingObject.md)

**Implements:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

## Type Parameters

- `K` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A multimap which forwards all its method calls to another multimap. Subclasses should override
 one or more methods to modify the behavior of the backing multimap as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>`default` method warning:</b> This class does <i>not</i> forward calls to `default` methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the `ForwardingMultimap`.
**Author:** Robert Konigsberg
**Since:** 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

### `asMap()`

**Returns:** `java.util.Map<K,java.util.Collection<V>>`

### `clear()`

**Returns:** `void`

### `containsEntry(`java.lang.Object` key, `java.lang.Object` value)`

**Returns:** `boolean`

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

### `containsValue(`java.lang.Object` value)`

**Returns:** `boolean`

### `entries()`

**Returns:** `java.util.Collection<java.util.Map.Entry<K,V>>`

### `get(`K` key)`

**Returns:** `java.util.Collection<V>`

### `isEmpty()`

**Returns:** `boolean`

### `keys()`

**Returns:** [`com.google.common.collect.Multiset<K>`](./Multiset.md)

### `keySet()`

**Returns:** `java.util.Set<K>`

### `put(`K` key, `V` value)`

**Returns:** `boolean`

### `putAll(`K` key, `java.lang.Iterable<? extends V>` values)`

**Returns:** `boolean`

### `putAll([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md) multimap)`

**Returns:** `boolean`

### `remove(`java.lang.Object` key, `java.lang.Object` value)`

**Returns:** `boolean`

### `removeAll(`java.lang.Object` key)`

**Returns:** `java.util.Collection<V>`

### `replaceValues(`K` key, `java.lang.Iterable<? extends V>` values)`

**Returns:** `java.util.Collection<V>`

### `size()`

**Returns:** `int`

### `values()`

**Returns:** `java.util.Collection<V>`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

