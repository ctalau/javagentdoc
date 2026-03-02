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

### `<init>(Map<E,Count> backingMap)`

**Parameters:**
- `backingMap` (`java.util.Map<E,com.google.common.collect.Count>`)

## Methods

### `setBackingMap(Map<E,Count> backingMap)`

The backing map must be empty.

**Parameters:**
- `backingMap` (`java.util.Map<E,com.google.common.collect.Count>`)

**Returns:** `void`

### `entrySet()`

Invoking Multiset.Entry#getCount on an entry in the returned set always returns the
 current count of that element in the multiset, as opposed to the count at the time the entry
 was retrieved.

**Returns:** `java.util.Set<com.google.common.collect.Multiset.Entry<E>>`

### `elementIterator()`

**Returns:** `java.util.Iterator<E>`

### `entryIterator()`

**Returns:** `java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`

### `forEachEntry(ObjIntConsumer<? super E> action)`

**Parameters:**
- `action` (`java.util.function.ObjIntConsumer<? super E>`)

**Returns:** `void`

### `clear()`

**Returns:** `void`

### `distinctElements()`

**Returns:** `int`

### `size()`

**Returns:** `int`

### `iterator()`

**Returns:** `java.util.Iterator<E>`

### `count(Object element)`

**Parameters:**
- `element` (`java.lang.Object`)

**Returns:** `int`

### `add(E element, int occurrences)`

**Parameters:**
- `element` (`E`)
- `occurrences` (`int`)

**Returns:** `int`

### `remove(Object element, int occurrences)`

**Parameters:**
- `element` (`java.lang.Object`)
- `occurrences` (`int`)

**Returns:** `int`

### `setCount(E element, int count)`

**Parameters:**
- `element` (`E`)
- `count` (`int`)

**Returns:** `int`

### `getAndSet(Count i, int count)`

**Parameters:**
- `i` ([`com.google.common.collect.Count`](./Count.md))
- `count` (`int`)

**Returns:** `int`

### `readObjectNoData()`

**Returns:** `void`

