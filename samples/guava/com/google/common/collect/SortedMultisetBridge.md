# Interface: `SortedMultisetBridge`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.SortedMultisetBridge`

**Extends:** [`com.google.common.collect.Multiset<E>`](./Multiset.md)

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Superinterface of {@link SortedMultiset} to introduce a bridge method for {@code elementSet()},
 to ensure binary compatibility with older Guava versions that specified {@code elementSet()} to
 return {@code SortedSet}.
@author Louis Wasserman

## Methods

### `elementSet()`

**Returns:** [`java.util.SortedSet<E>`](../../../../java/util/SortedSet.md)

