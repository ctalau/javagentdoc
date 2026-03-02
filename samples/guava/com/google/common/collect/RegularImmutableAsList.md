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

### `<init>(ImmutableCollection<E> delegate, ImmutableList<? extends E> delegateList)`

**Parameters:**
- `delegate` ([`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md))
- `delegateList` ([`com.google.common.collect.ImmutableList<? extends E>`](./ImmutableList.md))

### `<init>(ImmutableCollection<E> delegate, Object[] array)`

**Parameters:**
- `delegate` ([`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md))
- `array` (`java.lang.Object[]`)

## Methods

### `delegateCollection()`

**Returns:** [`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md)

### `delegateList()`

**Returns:** [`com.google.common.collect.ImmutableList<? extends E>`](./ImmutableList.md)

### `listIterator(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** [`com.google.common.collect.UnmodifiableListIterator<E>`](./UnmodifiableListIterator.md)

### `forEach(Consumer<? super E> action)`

**Parameters:**
- `action` (`java.util.function.Consumer<? super E>`)

**Returns:** `void`

### `copyIntoArray(lang@Nullable Object[] dst, int offset)`

**Parameters:**
- `dst` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)
- `offset` (`int`)

**Returns:** `int`

### `internalArray()`

**Returns:** `java.lang.Object[]`

### `internalArrayStart()`

**Returns:** `int`

### `internalArrayEnd()`

**Returns:** `int`

### `get(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** `E`

### `writeReplace()`

**Returns:** `java.lang.Object`

