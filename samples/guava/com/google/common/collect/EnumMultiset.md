# Class: `EnumMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.EnumMultiset`

**Extends:** [`com.google.common.collect.AbstractMultiset<E>`](./AbstractMultiset.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `E` extends `java.lang.Enum<E>`

## Description

See the Guava User Guide article on [Multiset](https://github.com/google/guava/wiki/NewCollectionTypesExplained#multiset).

## Fields

### `type`

**Type:** `java.lang.Class<E>`

### `enumConstants`

**Type:** `E[]`

### `counts`

**Type:** `int[]`

### `distinctElements`

**Type:** `int`

### `size`

**Type:** `long`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(java.lang.Class<E> type)`

**Parameters:**
- `type` (`java.lang.Class<E>`)

## Methods

### `create(java.lang.Class<E> type)`

**Returns:** [`com.google.common.collect.EnumMultiset<E>`](./EnumMultiset.md)

**Parameters:**
- `type` (`java.lang.Class<E>`)

### `create(java.lang.Iterable<E> elements)`

**Returns:** [`com.google.common.collect.EnumMultiset<E>`](./EnumMultiset.md)

This implementation is highly efficient when elements is itself a Multiset.

**Parameters:**
- `elements` (`java.lang.Iterable<E>`): the elements that the multiset should contain

### `create(java.lang.Iterable<E> elements, java.lang.Class<E> type)`

**Returns:** [`com.google.common.collect.EnumMultiset<E>`](./EnumMultiset.md)

Unlike EnumMultiset#create(Iterable), this method does not produce an exception on an empty iterable.

**Parameters:**
- `elements` (`java.lang.Iterable<E>`)
- `type` (`java.lang.Class<E>`)

### `isActuallyE(java.lang.Object o)`

**Returns:** `boolean`

**Parameters:**
- `o` (`java.lang.Object`)

### `checkIsE(java.lang.Object element)`

**Returns:** `void`

Otherwise, throws
 either a NullPointerException or a ClassCastException as appropriate.

**Parameters:**
- `element` (`java.lang.Object`)

### `distinctElements()`

**Returns:** `int`

### `size()`

**Returns:** `int`

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

### `clear()`

**Returns:** `void`

### `elementIterator()`

**Returns:** `java.util.Iterator<E>`

### `entryIterator()`

**Returns:** `java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`

### `forEachEntry(java.util.function.ObjIntConsumer<? super E> action)`

**Returns:** `void`

**Parameters:**
- `action` (`java.util.function.ObjIntConsumer<? super E>`)

### `iterator()`

**Returns:** `java.util.Iterator<E>`

### `writeObject(java.io.ObjectOutputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectOutputStream`)

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

