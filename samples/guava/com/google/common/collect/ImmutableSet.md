# Class: `ImmutableSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableSet`

**Extends:** [`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md)

**Implements:** `java.util.Set<E>`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

## Fields

### `SPLITERATOR_CHARACTERISTICS`

**Type:** `int`

### `MAX_TABLE_SIZE`

**Type:** `int`

### `DESIRED_LOAD_FACTOR`

**Type:** `double`

### `CUTOFF`

**Type:** `int`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `toImmutableSet()`

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSet<E>>`

Elements appear in the resulting set in the encounter order of the stream; if
 the stream contains duplicates (according to Object#equals(Object)), only the first
 duplicate in encounter order will appear in the result.

### `of()`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Preferred over Collections#emptySet for code
 consistency, and because the return type conveys the immutability guarantee.

 
**Performance note:** the instance returned is a singleton.

### `of(E element)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Preferred over Collections#singleton for code consistency, null rejection, and because the return
 type conveys the immutability guarantee.

**Parameters:**
- `element` (`E`)

### `of(E e1, E e2)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

That is, if multiple elements are equal, all except
 the first are ignored.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)

### `of(E e1, E e2, E e3)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

That is, if multiple elements are equal, all except
 the first are ignored.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)

### `of(E e1, E e2, E e3, E e4)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

That is, if multiple elements are equal, all except
 the first are ignored.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)

### `of(E e1, E e2, E e3, E e4, E e5)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

That is, if multiple elements are equal, all except
 the first are ignored.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)

### `of(E e1, E e2, E e3, E e4, E e5, E e6, E[] others)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

That is, if multiple elements are equal, all except
 the first are ignored.

 
The array others must not be longer than Integer.MAX_VALUE - 6.

**Parameters:**
- `e1` (`E`)
- `e2` (`E`)
- `e3` (`E`)
- `e4` (`E`)
- `e5` (`E`)
- `e6` (`E`)
- `others` (`E[]`)

### `constructUnknownDuplication(int n, java.lang.Object[] elements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

If k
 is the size of the returned ImmutableSet, then the unique elements of elements
 will be in the first k positions, and elements[i] == null for k <= i <
 n.

 
This may modify elements. Additionally, if n == elements.length and 
 elements contains no duplicates, elements may be used without copying in the returned
 ImmutableSet, in which case the caller must not modify it.

 
elements may contain only values of type E.

**Parameters:**
- `n` (`int`)
- `elements` (`java.lang.Object[]`)

### `construct(int n, int expectedSize, java.lang.Object[] elements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

If
 k is the size of the returned ImmutableSet, then the unique elements of 
 elements will be in the first k positions, and elements[i] == null for 
 k <= i < n.

 
This may modify elements. Additionally, if n == elements.length and 
 elements contains no duplicates, elements may be used without copying in the returned
 ImmutableSet, in which case it may no longer be modified.

 
elements may contain only values of type E.

**Parameters:**
- `n` (`int`)
- `expectedSize` (`int`)
- `elements` (`java.lang.Object[]`)

### `copyOf(java.util.Collection<? extends E> elements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

**Performance note:** This method will sometimes recognize that the actual copy operation
 is unnecessary; for example, copyOf(copyOf(anArrayList)) will copy the data only once.
 This reduces the expense of habitually making defensive copies at API boundaries. However, the
 precise conditions for skipping the copy operation are undefined.

**Parameters:**
- `elements` (`java.util.Collection<? extends E>`)

### `copyOf(java.lang.Iterable<? extends E> elements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

This method iterates over elements only
 once.

 
**Performance note:** This method will sometimes recognize that the actual copy operation
 is unnecessary; for example, copyOf(copyOf(anArrayList)) should copy the data only
 once. This reduces the expense of habitually making defensive copies at API boundaries.
 However, the precise conditions for skipping the copy operation are undefined.

**Parameters:**
- `elements` (`java.lang.Iterable<? extends E>`)

### `copyOf(java.util.Iterator<? extends E> elements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

**Parameters:**
- `elements` (`java.util.Iterator<? extends E>`)

### `copyOf(E[] elements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

**Parameters:**
- `elements` (`E[]`)

### `copyOfEnumSet(java.util.EnumSet enumSet)`

**Returns:** [`com.google.common.collect.ImmutableSet`](./ImmutableSet.md)

**Parameters:**
- `enumSet` (`java.util.EnumSet`)

### `isHashCodeFast()`

**Returns:** `boolean`

### `equals(java.lang.Object object)`

**Returns:** `boolean`

**Parameters:**
- `object` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(java.io.ObjectInputStream stream)`

**Returns:** `void`

**Parameters:**
- `stream` (`java.io.ObjectInputStream`)

### `builder()`

**Returns:** `com.google.common.collect.ImmutableSet.Builder<E>`

The generated builder is equivalent to the builder created by the Builder constructor.

### `builderWithExpectedSize(int expectedSize)`

**Returns:** `com.google.common.collect.ImmutableSet.Builder<E>`

If expectedSize is exactly the number of distinct elements added to the builder
 before Builder#build is called, the builder is likely to perform better than an unsized
 #builder() would have.

 
It is not specified if any performance benefits apply if expectedSize is close to,
 but not exactly, the number of distinct elements added to the builder.

**Parameters:**
- `expectedSize` (`int`)

### `chooseTableSize(int setSize)`

**Returns:** `int`

The returned size is the smallest power of two that
 can hold setSize elements with the desired load factor. Always returns at least setSize + 2.

**Parameters:**
- `setSize` (`int`)

