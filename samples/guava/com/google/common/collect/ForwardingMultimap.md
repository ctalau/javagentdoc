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

 <p><b>{@code default} method warning:</b> This class does <i>not</i> forward calls to {@code
 default} methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the {@code ForwardingMultimap}.
@author Robert Konigsberg
@since 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`com.google.common.collect.Multimap<K,V>`](./Multimap.md)

### `asMap()`

**Returns:** [`java.util.Map<K,java.util.Collection<V>>`](../../../../java/util/Map>.md)

### `clear()`

**Returns:** `void`

### `containsEntry(`java.lang.Object` key, `java.lang.Object` value)`

**Returns:** `boolean`

### `containsKey(`java.lang.Object` key)`

**Returns:** `boolean`

### `containsValue(`java.lang.Object` value)`

**Returns:** `boolean`

### `entries()`

**Returns:** [`java.util.Collection<java.util.Map.Entry<K,V>>`](../../../../java/util/Collection>.md)

### `get([`K`](K.md) key)`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `isEmpty()`

**Returns:** `boolean`

### `keys()`

**Returns:** [`com.google.common.collect.Multiset<K>`](./Multiset.md)

### `keySet()`

**Returns:** [`java.util.Set<K>`](../../../../java/util/Set.md)

### `put([`K`](K.md) key, [`V`](V.md) value)`

**Returns:** `boolean`

### `putAll([`K`](K.md) key, `java.lang.Iterable<? extends V>` values)`

**Returns:** `boolean`

### `putAll([`com.google.common.collect.Multimap<? extends K,? extends V>`](./Multimap.md) multimap)`

**Returns:** `boolean`

### `remove(`java.lang.Object` key, `java.lang.Object` value)`

**Returns:** `boolean`

### `removeAll(`java.lang.Object` key)`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `replaceValues([`K`](K.md) key, `java.lang.Iterable<? extends V>` values)`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `size()`

**Returns:** `int`

### `values()`

**Returns:** [`java.util.Collection<V>`](../../../../java/util/Collection.md)

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

