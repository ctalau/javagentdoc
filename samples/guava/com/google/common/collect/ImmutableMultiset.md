# Class: `ImmutableMultiset`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableMultiset`

**Extends:** [`com.google.common.collect.ImmutableMultisetGwtSerializationDependencies<E>`](./ImmutableMultisetGwtSerializationDependencies.md)

**Implements:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A `Multiset` whose contents will never change, with many other important properties
 detailed at `ImmutableCollection`.

 <p><b>Grouped iteration.</b> In all current implementations, duplicate elements always appear
 consecutively when iterating. Elements iterate in order by the <i>first</i> appearance of that
 element when the multiset was created.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/ImmutableCollectionsExplained">immutable collections</a>.
**Author:** Jared Levy
**Author:** Louis Wasserman
**Since:** 2.0

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

**Returns:** `java.util.stream.Collector<E,?,com.google.common.collect.ImmutableMultiset<E>>`

Returns a `Collector` that accumulates the input elements into a new `ImmutableMultiset`. Elements iterate in order by the <i>first</i> appearance of that element in
 encounter order.
**Since:** 21.0

### `toImmutableMultiset(`java.util.function.Function<? super T,? extends E>` elementFunction, `java.util.function.ToIntFunction<? super T>` countFunction)`

**Returns:** `java.util.stream.Collector<T,?,com.google.common.collect.ImmutableMultiset<E>>`

Returns a `Collector` that accumulates elements into an `ImmutableMultiset` whose
 elements are the result of applying `elementFunction` to the inputs, with counts equal to
 the result of applying `countFunction` to the inputs.

 <p>If the mapped elements contain duplicates (according to `Object.equals`), the first
 occurrence in encounter order appears in the resulting multiset, with count equal to the sum of
 the outputs of `countFunction.applyAsInt(t)` for each `t` mapped to that element.
**Since:** 22.0

### `of()`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns the empty immutable multiset.

 <p><b>Performance note:</b> the instance returned is a singleton.

### `of(`E` element)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns an immutable multiset containing a single element.
@throws NullPointerException if `element` is null
**Since:** 6.0 (source-compatible since 2.0)

### `of(`E` e1, `E` e2)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns an immutable multiset containing the given elements, in order.
@throws NullPointerException if any element is null
**Since:** 6.0 (source-compatible since 2.0)

### `of(`E` e1, `E` e2, `E` e3)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns an immutable multiset containing the given elements, in the "grouped iteration order"
 described in the class documentation.
@throws NullPointerException if any element is null
**Since:** 6.0 (source-compatible since 2.0)

### `of(`E` e1, `E` e2, `E` e3, `E` e4)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns an immutable multiset containing the given elements, in the "grouped iteration order"
 described in the class documentation.
@throws NullPointerException if any element is null
**Since:** 6.0 (source-compatible since 2.0)

### `of(`E` e1, `E` e2, `E` e3, `E` e4, `E` e5)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns an immutable multiset containing the given elements, in the "grouped iteration order"
 described in the class documentation.
@throws NullPointerException if any element is null
**Since:** 6.0 (source-compatible since 2.0)

### `of(`E` e1, `E` e2, `E` e3, `E` e4, `E` e5, `E` e6, `E[]` others)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns an immutable multiset containing the given elements, in the "grouped iteration order"
 described in the class documentation.
@throws NullPointerException if any element is null
**Since:** 6.0 (source-compatible since 2.0)

### `copyOf(`E[]` elements)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns an immutable multiset containing the given elements, in the "grouped iteration order"
 described in the class documentation.
@throws NullPointerException if any of `elements` is null
**Since:** 6.0

### `copyOf(`java.lang.Iterable<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns an immutable multiset containing the given elements, in the "grouped iteration order"
 described in the class documentation.
@throws NullPointerException if any of `elements` is null

### `copyOf(`java.util.Iterator<? extends E>` elements)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

Returns an immutable multiset containing the given elements, in the "grouped iteration order"
 described in the class documentation.
@throws NullPointerException if any of `elements` is null

### `copyFromElements(`E[]` elements)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

### `copyFromEntries(`java.util.Collection<? extends com.google.common.collect.Multiset.Entry<? extends E>>` entries)`

**Returns:** [`com.google.common.collect.ImmutableMultiset<E>`](./ImmutableMultiset.md)

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `asList()`

**Returns:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

### `contains(`java.lang.Object` object)`

**Returns:** `boolean`

### `add(`E` element, `int` occurrences)`

**Returns:** `int`

Guaranteed to throw an exception and leave the collection unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `remove(`java.lang.Object` element, `int` occurrences)`

**Returns:** `int`

Guaranteed to throw an exception and leave the collection unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `setCount(`E` element, `int` count)`

**Returns:** `int`

Guaranteed to throw an exception and leave the collection unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

### `setCount(`E` element, `int` oldCount, `int` newCount)`

**Returns:** `boolean`

Guaranteed to throw an exception and leave the collection unmodified.
@throws UnsupportedOperationException always
**Deprecated:**Unsupported operation.

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

**Since:** 21.0 (present with return type `Set` since 2.0)

### `entrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>>`](./ImmutableSet>.md)

### `createEntrySet()`

**Returns:** [`com.google.common.collect.ImmutableSet<com.google.common.collect.Multiset.Entry<E>>`](./ImmutableSet>.md)

### `getEntry(`int` index)`

**Returns:** [`com.google.common.collect.Multiset.Entry<E>`](Multiset/Entry.md)

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

### `builder()`

**Returns:** [`com.google.common.collect.ImmutableMultiset.Builder<E>`](ImmutableMultiset/Builder.md)

Returns a new builder. The generated builder is equivalent to the builder created by the `Builder` constructor.

