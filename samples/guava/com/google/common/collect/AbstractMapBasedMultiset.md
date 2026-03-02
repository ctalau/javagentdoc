# Class: `AbstractMapBasedMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractMapBasedMultiset`

**Extends:** [`com.google.common.collect.AbstractMultiset<E>`](./AbstractMultiset.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

For serialization to work, the subclass must specify explicit readObject and 
 writeObject methods.

## Fields

### `backingMap`

**Type:** `java.util.Map<E,com.google.common.collect.Count>`

### `size`

**Type:** `long`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(java.util.Map<E,com.google.common.collect.Count> backingMap)`

**Parameters:**
- `backingMap` (`java.util.Map<E,com.google.common.collect.Count>`)

## Methods

### `setBackingMap(java.util.Map<E,com.google.common.collect.Count> backingMap)`

**Returns:** `void`

The backing map must be empty.

**Parameters:**
- `backingMap` (`java.util.Map<E,com.google.common.collect.Count>`)

### `entrySet()`

**Returns:** `java.util.Set<com.google.common.collect.Multiset.Entry<E>>`

Invoking Multiset.Entry#getCount on an entry in the returned set always returns the
 current count of that element in the multiset, as opposed to the count at the time the entry
 was retrieved.

### `elementIterator()`

**Returns:** `java.util.Iterator<E>`

### `entryIterator()`

**Returns:** `java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`

### `forEachEntry(java.util.function.ObjIntConsumer<? super E> action)`

**Returns:** `void`

**Parameters:**
- `action` (`java.util.function.ObjIntConsumer<? super E>`)

### `clear()`

**Returns:** `void`

### `distinctElements()`

**Returns:** `int`

### `size()`

**Returns:** `int`

### `iterator()`

**Returns:** `java.util.Iterator<E>`

### `count(java.lang.Object element)`

**Returns:** `int`

**Parameters:**
- `element` (`java.lang.Object`)

### `add(E element, int occurrences)`

**Returns:** `int`

**Parameters:**
- `element` (`E`)
- `occurrences` (`int`)

### `remove(java.lang.Object element, int occurrences)`

**Returns:** `int`

**Parameters:**
- `element` (`java.lang.Object`)
- `occurrences` (`int`)

### `setCount(E element, int count)`

**Returns:** `int`

**Parameters:**
- `element` (`E`)
- `count` (`int`)

### `getAndSet(com.google.common.collect.Count i, int count)`

**Returns:** `int`

**Parameters:**
- `i` ([`com.google.common.collect.Count`](./Count.md))
- `count` (`int`)

### `readObjectNoData()`

**Returns:** `void`

