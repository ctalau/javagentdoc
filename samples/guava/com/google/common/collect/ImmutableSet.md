# Class: `ImmutableSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableSet`

**Extends:** [`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md)

**Implements:** `java.util.Set<E>`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A `Set` whose contents will never change, with many other important properties detailed at
 `ImmutableCollection`.
**Since:** 2.0

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

Returns a `Collector` that accumulates the input elements into a new `ImmutableSet`. Elements appear in the resulting set in the encounter order of the stream; if
 the stream contains duplicates (according to `Object.equals(Object)`), only the first
 duplicate in encounter order will appear in the result.
**Since:** 21.0

### `of()`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns the empty immutable set. Preferred over `Collections.emptySet` for code
 consistency, and because the return type conveys the immutability guarantee.

 <p><b>Performance note:</b> the instance returned is a singleton.

### `of(`E` element)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set containing `element`. Preferred over `Collections.singleton` for code consistency, `null` rejection, and because the return
 type conveys the immutability guarantee.

### `of(`E` e1, `E` e2)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set containing the given elements, minus duplicates, in the order each was
 first specified. That is, if multiple elements are equal, all except
 the first are ignored.

### `of(`E` e1, `E` e2, `E` e3)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set containing the given elements, minus duplicates, in the order each was
 first specified. That is, if multiple elements are equal, all except
 the first are ignored.

### `of(`E` e1, `E` e2, `E` e3, `E` e4)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set containing the given elements, minus duplicates, in the order each was
 first specified. That is, if multiple elements are equal, all except
 the first are ignored.

### `of(`E` e1, `E` e2, `E` e3, `E` e4, `E` e5)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set containing the given elements, minus duplicates, in the order each was
 first specified. That is, if multiple elements are equal, all except
 the first are ignored.

### `of(`E` e1, `E` e2, `E` e3, `E` e4, `E` e5, `E` e6, `E[]` others)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set containing the given elements, minus duplicates, in the order each was
 first specified. That is, if multiple elements are equal, all except
 the first are ignored.

 <p>The array `others` must not be longer than `Integer.MAX_VALUE - 6`.
**Since:** 3.0 (source-compatible since 2.0)

### `constructUnknownDuplication(`int` n, `java.lang.Object[]` elements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Constructs an `ImmutableSet` from the first `n` elements of the specified array,
 which we have no particular reason to believe does or does not contain duplicates. If `k`
 is the size of the returned `ImmutableSet`, then the unique elements of `elements`
 will be in the first `k` positions, and `elements[i] == null` for `k <= i <
 n`.

 <p>This may modify `elements`. Additionally, if `n == elements.length` and `elements` contains no duplicates, `elements` may be used without copying in the returned
 `ImmutableSet`, in which case the caller must not modify it.

 <p>`elements` may contain only values of type `E`.
@throws NullPointerException if any of the first `n` elements of `elements` is null

### `construct(`int` n, `int` expectedSize, `java.lang.Object[]` elements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Constructs an `ImmutableSet` from the first `n` elements of the specified array. If
 `k` is the size of the returned `ImmutableSet`, then the unique elements of `elements` will be in the first `k` positions, and `elements[i] == null` for `k <= i < n`.

 <p>This may modify `elements`. Additionally, if `n == elements.length` and `elements` contains no duplicates, `elements` may be used without copying in the returned
 `ImmutableSet`, in which case it may no longer be modified.

 <p>`elements` may contain only values of type `E`.
@throws NullPointerException if any of the first `n` elements of `elements` is null

### `copyOf(`java.util.Collection<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set containing each of `elements`, minus duplicates, in the order
 each appears first in the source collection.

 <p><b>Performance note:</b> This method will sometimes recognize that the actual copy operation
 is unnecessary; for example, `copyOf(copyOf(anArrayList))` will copy the data only once.
 This reduces the expense of habitually making defensive copies at API boundaries. However, the
 precise conditions for skipping the copy operation are undefined.
@throws NullPointerException if any of `elements` is null
**Since:** 7.0 (source-compatible since 2.0)

### `copyOf(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set containing each of `elements`, minus duplicates, in the order
 each appears first in the source iterable. This method iterates over `elements` only
 once.

 <p><b>Performance note:</b> This method will sometimes recognize that the actual copy operation
 is unnecessary; for example, `copyOf(copyOf(anArrayList))` should copy the data only
 once. This reduces the expense of habitually making defensive copies at API boundaries.
 However, the precise conditions for skipping the copy operation are undefined.
@throws NullPointerException if any of `elements` is null

### `copyOf(`java.util.Iterator<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set containing each of `elements`, minus duplicates, in the order
 each appears first in the source iterator.
@throws NullPointerException if any of `elements` is null

### `copyOf(`E[]` elements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set containing each of `elements`, minus duplicates, in the order
 each appears first in the source array.
@throws NullPointerException if any of `elements` is null
**Since:** 3.0

### `copyOfEnumSet(`java.util.EnumSet` enumSet)`

**Returns:** [`com.google.common.collect.ImmutableSet`](./ImmutableSet.md)

### `isHashCodeFast()`

**Returns:** `boolean`

Returns `true` if the `hashCode()` method runs quickly.

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableSet.Builder<E>`](ImmutableSet/Builder.md)

Returns a new builder. The generated builder is equivalent to the builder created by the `Builder` constructor.

### `builderWithExpectedSize(`int` expectedSize)`

**Returns:** [`com.google.common.collect.ImmutableSet.Builder<E>`](ImmutableSet/Builder.md)

Returns a new builder, expecting the specified number of distinct elements to be added.

 <p>If `expectedSize` is exactly the number of distinct elements added to the builder
 before `Builder.build` is called, the builder is likely to perform better than an unsized
 `builder()` would have.

 <p>It is not specified if any performance benefits apply if `expectedSize` is close to,
 but not exactly, the number of distinct elements added to the builder.
**Since:** 23.1

### `chooseTableSize(`int` setSize)`

**Returns:** `int`

Returns an array size suitable for the backing array of a hash table that uses open addressing
 with linear probing in its implementation. The returned size is the smallest power of two that
 can hold setSize elements with the desired load factor. Always returns at least setSize + 2.

