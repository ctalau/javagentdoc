# Class: `IndexedImmutableSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.IndexedImmutableSet`

**Extends:** `com.google.common.collect.ImmutableSet.CachingAsList<E>`

## Type Parameters

- `E` extends `java.lang.Object`

## Constructors

### `<init>()`

## Methods

### `get(int index)`

**Parameters:**
- `index` (`int`)

**Returns:** `E`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `forEach(Consumer<? super E> consumer)`

**Parameters:**
- `consumer` (`java.util.function.Consumer<? super E>`)

**Returns:** `void`

### `copyIntoArray(lang@Nullable Object[] dst, int offset)`

**Parameters:**
- `dst` (`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]`)
- `offset` (`int`)

**Returns:** `int`

### `createAsList()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

