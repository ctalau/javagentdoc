# Class: `RegularImmutableAsList`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RegularImmutableAsList`

**Extends:** [`com.google.common.collect.ImmutableAsList<E>`](./ImmutableAsList.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

An {@link ImmutableAsList} implementation specialized for when the delegate collection is already
 backed by an {@code ImmutableList} or array.
@author Louis Wasserman

## Fields

### `delegate`

**Type:** [`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md)

### `delegateList`

**Type:** [`com.google.common.collect.ImmutableList<? extends E>`](./ImmutableList.md)

## Constructors

### `<init>([`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md) delegate, [`com.google.common.collect.ImmutableList<? extends E>`](./ImmutableList.md) delegateList)`

### `<init>([`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md) delegate, `java.lang.Object[]` array)`

## Methods

### `delegateCollection()`

**Returns:** [`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md)

### `delegateList()`

**Returns:** [`com.google.common.collect.ImmutableList<? extends E>`](./ImmutableList.md)

### `listIterator(`int` index)`

**Returns:** [`com.google.common.collect.UnmodifiableListIterator<E>`](./UnmodifiableListIterator.md)

### `forEach([`java.util.function.Consumer<? super E>`](../../../../java/util/function/Consumer.md) action)`

**Returns:** `void`

### `copyIntoArray(`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` dst, `int` offset)`

**Returns:** `int`

### `internalArray()`

**Returns:** `java.lang.Object[]`

### `internalArrayStart()`

**Returns:** `int`

### `internalArrayEnd()`

**Returns:** `int`

### `get(`int` index)`

**Returns:** [`E`](E.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

