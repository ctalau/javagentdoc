# Class: `ImmutableSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableSet`

**Extends:** [`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md)

**Implements:** [`java.util.Set<E>`](../../../../java/util/Set.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A {@link Set} whose contents will never change, with many other important properties detailed at
 {@link ImmutableCollection}.
@since 2.0

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

**Returns:** [`java.util.stream.Collector<E,?,com.google.common.collect.ImmutableSet<E>>`](../../../../java/util/stream/Collector>.md)

Returns a {@code Collector} that accumulates the input elements into a new {@code
 ImmutableSet}. Elements appear in the resulting set in the encounter order of the stream; if
 the stream contains duplicates (according to {@link Object#equals(Object)}), only the first
 duplicate in encounter order will appear in the result.
@since 21.0

### `of()`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns the empty immutable set. Preferred over {@link Collections#emptySet} for code
 consistency, and because the return type conveys the immutability guarantee.

 <p><b>Performance note:</b> the instance returned is a singleton.

### `of([`E`](E.md) element)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set containing {@code element}. Preferred over {@link Collections#singleton} for code consistency, {@code null} rejection, and because the return
 type conveys the immutability guarantee.

### `of([`E`](E.md) e1, [`E`](E.md) e2)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set containing the given elements, minus duplicates, in the order each was
 first specified. That is, if multiple elements are {@linkplain Object#equals equal}, all except
 the first are ignored.

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set containing the given elements, minus duplicates, in the order each was
 first specified. That is, if multiple elements are {@linkplain Object#equals equal}, all except
 the first are ignored.

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set containing the given elements, minus duplicates, in the order each was
 first specified. That is, if multiple elements are {@linkplain Object#equals equal}, all except
 the first are ignored.

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4, [`E`](E.md) e5)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set containing the given elements, minus duplicates, in the order each was
 first specified. That is, if multiple elements are {@linkplain Object#equals equal}, all except
 the first are ignored.

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4, [`E`](E.md) e5, [`E`](E.md) e6, [`E[]`](E.md) others)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set containing the given elements, minus duplicates, in the order each was
 first specified. That is, if multiple elements are {@linkplain Object#equals equal}, all except
 the first are ignored.

 <p>The array {@code others} must not be longer than {@code Integer.MAX_VALUE - 6}.
@since 3.0 (source-compatible since 2.0)

### `constructUnknownDuplication(`int` n, `java.lang.Object[]` elements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Constructs an {@code ImmutableSet} from the first {@code n} elements of the specified array,
 which we have no particular reason to believe does or does not contain duplicates. If {@code k}
 is the size of the returned {@code ImmutableSet}, then the unique elements of {@code elements}
 will be in the first {@code k} positions, and {@code elements[i] == null} for {@code k <= i <
 n}.

 <p>This may modify {@code elements}. Additionally, if {@code n == elements.length} and {@code
 elements} contains no duplicates, {@code elements} may be used without copying in the returned
 {@code ImmutableSet}, in which case the caller must not modify it.

 <p>{@code elements} may contain only values of type {@code E}.
@throws NullPointerException if any of the first {@code n} elements of {@code elements} is null

### `construct(`int` n, `int` expectedSize, `java.lang.Object[]` elements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Constructs an {@code ImmutableSet} from the first {@code n} elements of the specified array. If
 {@code k} is the size of the returned {@code ImmutableSet}, then the unique elements of {@code
 elements} will be in the first {@code k} positions, and {@code elements[i] == null} for {@code
 k <= i < n}.

 <p>This may modify {@code elements}. Additionally, if {@code n == elements.length} and {@code
 elements} contains no duplicates, {@code elements} may be used without copying in the returned
 {@code ImmutableSet}, in which case it may no longer be modified.

 <p>{@code elements} may contain only values of type {@code E}.
@throws NullPointerException if any of the first {@code n} elements of {@code elements} is null

### `copyOf([`java.util.Collection<? extends E>`](../../../../java/util/Collection.md) elements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set containing each of {@code elements}, minus duplicates, in the order
 each appears first in the source collection.

 <p><b>Performance note:</b> This method will sometimes recognize that the actual copy operation
 is unnecessary; for example, {@code copyOf(copyOf(anArrayList))} will copy the data only once.
 This reduces the expense of habitually making defensive copies at API boundaries. However, the
 precise conditions for skipping the copy operation are undefined.
@throws NullPointerException if any of {@code elements} is null
@since 7.0 (source-compatible since 2.0)

### `copyOf(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set containing each of {@code elements}, minus duplicates, in the order
 each appears first in the source iterable. This method iterates over {@code elements} only
 once.

 <p><b>Performance note:</b> This method will sometimes recognize that the actual copy operation
 is unnecessary; for example, {@code copyOf(copyOf(anArrayList))} should copy the data only
 once. This reduces the expense of habitually making defensive copies at API boundaries.
 However, the precise conditions for skipping the copy operation are undefined.
@throws NullPointerException if any of {@code elements} is null

### `copyOf([`java.util.Iterator<? extends E>`](../../../../java/util/Iterator.md) elements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set containing each of {@code elements}, minus duplicates, in the order
 each appears first in the source iterator.
@throws NullPointerException if any of {@code elements} is null

### `copyOf([`E[]`](E.md) elements)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

Returns an immutable set containing each of {@code elements}, minus duplicates, in the order
 each appears first in the source array.
@throws NullPointerException if any of {@code elements} is null
@since 3.0

### `copyOfEnumSet([`java.util.EnumSet`](../../../../java/util/EnumSet.md) enumSet)`

**Returns:** [`com.google.common.collect.ImmutableSet`](./ImmutableSet.md)

### `isHashCodeFast()`

**Returns:** `boolean`

Returns {@code true} if the {@code hashCode()} method runs quickly.

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableSet.Builder<E>`](ImmutableSet/Builder.md)

Returns a new builder. The generated builder is equivalent to the builder created by the {@link Builder} constructor.

### `builderWithExpectedSize(`int` expectedSize)`

**Returns:** [`com.google.common.collect.ImmutableSet.Builder<E>`](ImmutableSet/Builder.md)

Returns a new builder, expecting the specified number of distinct elements to be added.

 <p>If {@code expectedSize} is exactly the number of distinct elements added to the builder
 before {@link Builder#build} is called, the builder is likely to perform better than an unsized
 {@link #builder()} would have.

 <p>It is not specified if any performance benefits apply if {@code expectedSize} is close to,
 but not exactly, the number of distinct elements added to the builder.
@since 23.1

### `chooseTableSize(`int` setSize)`

**Returns:** `int`

Returns an array size suitable for the backing array of a hash table that uses open addressing
 with linear probing in its implementation. The returned size is the smallest power of two that
 can hold setSize elements with the desired load factor. Always returns at least setSize + 2.

