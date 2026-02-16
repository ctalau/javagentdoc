# Class: `ImmutableMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableMultiset`

**Extends:** [`com.google.common.collect.ImmutableMultisetGwtSerializationDependencies<E>`](./ImmutableMultisetGwtSerializationDependencies.md)

**Implements:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A {@link Multiset} whose contents will never change, with many other important properties
 detailed at {@link ImmutableCollection}.

 <p><b>Grouped iteration.</b> In all current implementations, duplicate elements always appear
 consecutively when iterating. Elements iterate in order by the <i>first</i> appearance of that
 element when the multiset was created.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/ImmutableCollectionsExplained">immutable collections</a>.
@author Jared Levy
@author Louis Wasserman
@since 2.0

## Fields

### `asList`

**Type:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `entrySet`

**Type:** [`com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>>`](./ImmutableSet>.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `toImmutableMultiset()`

**Returns:** [`java.util.stream.Collector<E,?,com.google.common.collect.ImmutableMultiset<E>>`](../../../../java/util/stream/Collector>.md)

Returns a {@code Collector} that accumulates the input elements into a new {@code
 ImmutableMultiset}. Elements iterate in order by the <i>first</i> appearance of that element in
 encounter order.
@since 21.0

### `toImmutableMultiset([`java.util.function.Function<? super T,? extends E>`](../../../../java/util/function/Function.md) elementFunction, [`java.util.function.ToIntFunction<? super T>`](../../../../java/util/function/ToIntFunction.md) countFunction)`

**Returns:** [`java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMultiset<E>>`](../../../../java/util/stream/Collector>.md)

Returns a {@code Collector} that accumulates elements into an {@code ImmutableMultiset} whose
 elements are the result of applying {@code elementFunction} to the inputs, with counts equal to
 the result of applying {@code countFunction} to the inputs.

 <p>If the mapped elements contain duplicates (according to {@link Object#equals}), the first
 occurrence in encounter order appears in the resulting multiset, with count equal to the sum of
 the outputs of {@code countFunction.applyAsInt(t)} for each {@code t} mapped to that element.
@since 22.0

### `of()`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns the empty immutable multiset.

 <p><b>Performance note:</b> the instance returned is a singleton.

### `of([`E`](E.md) element)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns an immutable multiset containing a single element.
@throws NullPointerException if {@code element} is null
@since 6.0 (source-compatible since 2.0)

### `of([`E`](E.md) e1, [`E`](E.md) e2)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns an immutable multiset containing the given elements, in order.
@throws NullPointerException if any element is null
@since 6.0 (source-compatible since 2.0)

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns an immutable multiset containing the given elements, in the "grouped iteration order"
 described in the class documentation.
@throws NullPointerException if any element is null
@since 6.0 (source-compatible since 2.0)

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns an immutable multiset containing the given elements, in the "grouped iteration order"
 described in the class documentation.
@throws NullPointerException if any element is null
@since 6.0 (source-compatible since 2.0)

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4, [`E`](E.md) e5)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns an immutable multiset containing the given elements, in the "grouped iteration order"
 described in the class documentation.
@throws NullPointerException if any element is null
@since 6.0 (source-compatible since 2.0)

### `of([`E`](E.md) e1, [`E`](E.md) e2, [`E`](E.md) e3, [`E`](E.md) e4, [`E`](E.md) e5, [`E`](E.md) e6, [`E[]`](E.md) others)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns an immutable multiset containing the given elements, in the "grouped iteration order"
 described in the class documentation.
@throws NullPointerException if any element is null
@since 6.0 (source-compatible since 2.0)

### `copyOf([`E[]`](E.md) elements)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns an immutable multiset containing the given elements, in the "grouped iteration order"
 described in the class documentation.
@throws NullPointerException if any of {@code elements} is null
@since 6.0

### `copyOf(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns an immutable multiset containing the given elements, in the "grouped iteration order"
 described in the class documentation.
@throws NullPointerException if any of {@code elements} is null

### `copyOf([`java.util.Iterator<? extends E>`](../../../../java/util/Iterator.md) elements)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns an immutable multiset containing the given elements, in the "grouped iteration order"
 described in the class documentation.
@throws NullPointerException if any of {@code elements} is null

### `copyFromElements([`E[]`](E.md) elements)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

### `copyFromEntries([`java.util.Collection<? extends com.google.common.collect.Multiset.Entry<? extends E>>`](../../../../java/util/Collection>.md) entries)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `asList()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `contains(`java.lang.Object` object)`

**Returns:** `boolean`

### `add([`E`](E.md) element, `int` occurrences)`

**Returns:** `int`

Guaranteed to throw an exception and leave the collection unmodified.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `remove(`java.lang.Object` element, `int` occurrences)`

**Returns:** `int`

Guaranteed to throw an exception and leave the collection unmodified.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `setCount([`E`](E.md) element, `int` count)`

**Returns:** `int`

Guaranteed to throw an exception and leave the collection unmodified.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `setCount([`E`](E.md) element, `int` oldCount, `int` newCount)`

**Returns:** `boolean`

Guaranteed to throw an exception and leave the collection unmodified.
@throws UnsupportedOperationException always
@deprecated Unsupported operation.

### `copyIntoArray(`java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object[]` dst, `int` offset)`

**Returns:** `int`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `elementSet()`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

@since 21.0 (present with return type {@code Set} since 2.0)

### `entrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>>`](./ImmutableSet>.md)

### `createEntrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>>`](./ImmutableSet>.md)

### `getEntry(`int` index)`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableMultiset.Builder<E>`](ImmutableMultiset/Builder.md)

Returns a new builder. The generated builder is equivalent to the builder created by the {@link Builder} constructor.

