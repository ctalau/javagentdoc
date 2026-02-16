# Class: `EnumMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.EnumMultiset`

**Extends:** [`com.google.common.collect.AbstractMultiset<E>`](./AbstractMultiset.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `E` extends `java.lang.Enum<E>`

## Description

Multiset implementation specialized for enum elements, supporting all single-element operations
 in O(1).

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/NewCollectionTypesExplained#multiset">{@code Multiset}</a>.
@author Jared Levy
@since 2.0

## Fields

### `type`

**Type:** `java.lang.Class<E>`

### `enumConstants`

**Type:** [`E[]`](E.md)

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

Creates an empty {@code EnumMultiset}.

## Methods

### `create(`java.lang.Class<E>` type)`

**Returns:** [`com.google.common.collect.EnumMultiset<E>`](./EnumMultiset.md)

Creates an empty {@code EnumMultiset}.

### `create(`java.lang.Iterable<E>` elements)`

**Returns:** [`com.google.common.collect.EnumMultiset<E>`](./EnumMultiset.md)

Creates a new {@code EnumMultiset} containing the specified elements.

 <p>This implementation is highly efficient when {@code elements} is itself a {@link Multiset}.
@param elements the elements that the multiset should contain
@throws IllegalArgumentException if {@code elements} is empty

### `create(`java.lang.Iterable<E>` elements, `java.lang.Class<E>` type)`

**Returns:** [`com.google.common.collect.EnumMultiset<E>`](./EnumMultiset.md)

Returns a new {@code EnumMultiset} instance containing the given elements. Unlike {@link EnumMultiset#create(Iterable)}, this method does not produce an exception on an empty iterable.
@since 14.0

### `isActuallyE(`java.lang.Object` o)`

**Returns:** `boolean`

### `checkIsE(`java.lang.Object` element)`

**Returns:** `void`

Returns {@code element} cast to {@code E}, if it actually is a nonnull E. Otherwise, throws
 either a NullPointerException or a ClassCastException as appropriate.

### `distinctElements()`

**Returns:** `int`

### `size()`

**Returns:** `int`

### `count(`java.lang.Object` element)`

**Returns:** `int`

### `add([`E`](E.md) element, `int` occurrences)`

**Returns:** `int`

### `remove(`java.lang.Object` element, `int` occurrences)`

**Returns:** `int`

### `setCount([`E`](E.md) element, `int` count)`

**Returns:** `int`

### `clear()`

**Returns:** `void`

### `elementIterator()`

**Returns:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

### `entryIterator()`

**Returns:** [`java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>`](../../../../java/util/Iterator>.md)

### `forEachEntry([`java.util.function.ObjIntConsumer<? super E>`](../../../../java/util/function/ObjIntConsumer.md) action)`

**Returns:** `void`

### `iterator()`

**Returns:** [`java.util.Iterator<E>`](../../../../java/util/Iterator.md)

### `writeObject([`java.io.ObjectOutputStream`](../../../../java/io/ObjectOutputStream.md) stream)`

**Returns:** `void`

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

@serialData the {@code Class<E>} for the enum type, the number of distinct elements, the first
     element, its count, the second element, its count, and so on

