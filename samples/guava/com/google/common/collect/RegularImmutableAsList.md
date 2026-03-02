# Class: `RegularImmutableAsList`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.RegularImmutableAsList`

**Extends:** [`com.google.common.collect.ImmutableAsList<E>`](./ImmutableAsList.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

## Fields

### `delegate`

**Type:** [`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md)

### `delegateList`

**Type:** [`com.google.common.collect.ImmutableList<? extends E>`](./ImmutableList.md)

## Constructors

### `<init>(com.google.common.collect.ImmutableCollection<E> delegate, com.google.common.collect.ImmutableList<? extends E> delegateList)`

**Parameters:**
- `delegate` ([`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md))
- `delegateList` ([`com.google.common.collect.ImmutableList<? extends E>`](./ImmutableList.md))

### `<init>(com.google.common.collect.ImmutableCollection<E> delegate, java.lang.Object[] array)`

**Parameters:**
- `delegate` ([`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md))
- `array` (`java.lang.Object[]`)

## Methods

### `delegateCollection()`

**Returns:** [`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md)

### `delegateList()`

**Returns:** [`com.google.common.collect.ImmutableList<? extends E>`](./ImmutableList.md)

### `listIterator(int index)`

**Returns:** [`com.google.common.collect.UnmodifiableListIterator<E>`](./UnmodifiableListIterator.md)

**Parameters:**
- `index` (`int`)

### `forEach(java.util.function.Consumer<? super E> action)`

**Returns:** `void`

**Parameters:**
- `action` (`java.util.function.Consumer<? super E>`)

### `copyIntoArray(java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[] dst, int offset)`

**Returns:** `int`

**Parameters:**
- `dst` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)
- `offset` (`int`)

### `internalArray()`

**Returns:** `java.lang.Object[]`

### `internalArrayStart()`

**Returns:** `int`

### `internalArrayEnd()`

**Returns:** `int`

### `get(int index)`

**Returns:** `E`

**Parameters:**
- `index` (`int`)

### `writeReplace()`

**Returns:** `java.lang.Object`

