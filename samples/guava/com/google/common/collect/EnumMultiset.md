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

### `<init>(Class<E> type)`

**Parameters:**
- `type` (`java.lang.Class<E>`)

## Methods

### `create(Class<E> type)`

**Parameters:**
- `type` (`java.lang.Class<E>`)

**Returns:** [`com.google.common.collect.EnumMultiset<E>`](./EnumMultiset.md)

### `create(Iterable<E> elements)`

This implementation is highly efficient when elements is itself a Multiset.

**Parameters:**
- `elements` (`java.lang.Iterable<E>`): the elements that the multiset should contain

**Returns:** [`com.google.common.collect.EnumMultiset<E>`](./EnumMultiset.md)

### `create(Iterable<E> elements, Class<E> type)`

Unlike EnumMultiset#create(Iterable), this method does not produce an exception on an empty iterable.

**Parameters:**
- `elements` (`java.lang.Iterable<E>`)
- `type` (`java.lang.Class<E>`)

**Returns:** [`com.google.common.collect.EnumMultiset<E>`](./EnumMultiset.md)

### `isActuallyE(Object o)`

**Parameters:**
- `o` (`java.lang.Object`)

**Returns:** `boolean`

### `checkIsE(Object element)`

Otherwise, throws
 either a NullPointerException or a ClassCastException as appropriate.

**Parameters:**
- `element` (`java.lang.Object`)

**Returns:** `void`

### `distinctElements()`

**Returns:** `int`

### `size()`

**Returns:** `int`

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

### `clear()`

**Returns:** `void`

### `elementIterator()`

**Returns:** `java.util.Iterator<E>`

### `entryIterator()`

**Returns:** `java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`

### `forEachEntry(ObjIntConsumer<? super E> action)`

**Parameters:**
- `action` (`java.util.function.ObjIntConsumer<? super E>`)

**Returns:** `void`

### `iterator()`

**Returns:** `java.util.Iterator<E>`

### `writeObject(ObjectOutputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectOutputStream`)

**Returns:** `void`

### `readObject(ObjectInputStream stream)`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

**Returns:** `void`

