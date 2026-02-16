# Class: `EnumMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.EnumMultiset`

**Extends:** [`com.google.common.collect.AbstractMultiset<E>`](./AbstractMultiset.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `E` extends `java.lang.Enum<E>`

## Description

Multiset implementation specialized for enum elements, supporting all single-element operations
 in O(1).

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#multiset">`Multiset`</a>.
**Author:** Jared Levy
**Since:** 2.0

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

### `<init>(`java.lang.Class<E>` type)`

Creates an empty `EnumMultiset`.

## Methods

### `create(`java.lang.Class<E>` type)`

**Returns:** [`com.google.common.collect.EnumMultiset<E>`](./EnumMultiset.md)

Creates an empty `EnumMultiset`.

### `create(`java.lang.Iterable<E>` elements)`

**Returns:** [`com.google.common.collect.EnumMultiset<E>`](./EnumMultiset.md)

Creates a new `EnumMultiset` containing the specified elements.

 <p>This implementation is highly efficient when `elements` is itself a `Multiset`.
@param elements the elements that the multiset should contain
@throws IllegalArgumentException if `elements` is empty

### `create(`java.lang.Iterable<E>` elements, `java.lang.Class<E>` type)`

**Returns:** [`com.google.common.collect.EnumMultiset<E>`](./EnumMultiset.md)

Returns a new `EnumMultiset` instance containing the given elements. Unlike `EnumMultiset.create(Iterable)`, this method does not produce an exception on an empty iterable.
**Since:** 14.0

### `isActuallyE(`java.lang.Object` o)`

**Returns:** `boolean`

### `checkIsE(`java.lang.Object` element)`

**Returns:** `void`

Returns `element` cast to `E`, if it actually is a nonnull E. Otherwise, throws
 either a NullPointerException or a ClassCastException as appropriate.

### `distinctElements()`

**Returns:** `int`

### `size()`

**Returns:** `int`

### `count(`java.lang.Object` element)`

**Returns:** `int`

### `add(`E` element, `int` occurrences)`

**Returns:** `int`

### `remove(`java.lang.Object` element, `int` occurrences)`

**Returns:** `int`

### `setCount(`E` element, `int` count)`

**Returns:** `int`

### `clear()`

**Returns:** `void`

### `elementIterator()`

**Returns:** `java.util.Iterator<E>`

### `entryIterator()`

**Returns:** `java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`

### `forEachEntry(`java.util.function.ObjIntConsumer<? super E>` action)`

**Returns:** `void`

### `iterator()`

**Returns:** `java.util.Iterator<E>`

### `writeObject(`java.io.ObjectOutputStream` stream)`

**Returns:** `void`

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

@serialData the `Class<E>` for the enum type, the number of distinct elements, the first
     element, its count, the second element, its count, and so on

