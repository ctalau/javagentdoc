# Class: `AbstractMapBasedMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractMapBasedMultiset`

**Extends:** [`com.google.common.collect.AbstractMultiset<E>`](./AbstractMultiset.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Basic implementation of `Multiset<E>` backed by an instance of `Map<E, Count>`.

 <p>For serialization to work, the subclass must specify explicit `readObject` and `writeObject` methods.
**Author:** Kevin Bourrillion

## Fields

### `backingMap`

**Type:** `java.util.Map<E,com.google.common.collect.Count>`

### `size`

**Type:** `long`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`java.util.Map<E,com.google.common.collect.Count>` backingMap)`

Standard constructor.

## Methods

### `setBackingMap(`java.util.Map<E,com.google.common.collect.Count>` backingMap)`

**Returns:** `void`

Used during deserialization only. The backing map must be empty.

### `entrySet()`

**Returns:** `java.util.Set<com.google.common.collect.Multiset.Entry<E>>`

{@inheritDoc}

 <p>Invoking `Multiset.Entry.getCount` on an entry in the returned set always returns the
 current count of that element in the multiset, as opposed to the count at the time the entry
 was retrieved.

### `elementIterator()`

**Returns:** `java.util.Iterator<E>`

### `entryIterator()`

**Returns:** `java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`

### `forEachEntry(`java.util.function.ObjIntConsumer<? super E>` action)`

**Returns:** `void`

### `clear()`

**Returns:** `void`

### `distinctElements()`

**Returns:** `int`

### `size()`

**Returns:** `int`

### `iterator()`

**Returns:** `java.util.Iterator<E>`

### `count(`java.lang.Object` element)`

**Returns:** `int`

### `add(`E` element, `int` occurrences)`

**Returns:** `int`

{@inheritDoc}
@throws IllegalArgumentException if the call would result in more than `Integer.MAX_VALUE` occurrences of `element` in this multiset.

### `remove(`java.lang.Object` element, `int` occurrences)`

**Returns:** `int`

### `setCount(`E` element, `int` count)`

**Returns:** `int`

### `getAndSet([`com.google.common.collect.Count`](./Count.md) i, `int` count)`

**Returns:** `int`

### `readObjectNoData()`

**Returns:** `void`

