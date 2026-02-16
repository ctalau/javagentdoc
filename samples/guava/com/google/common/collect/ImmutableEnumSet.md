# Class: `ImmutableEnumSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableEnumSet`

**Extends:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

## Type Parameters

- `E` extends `java.lang.Enum<E>`

## Description

Implementation of {@link ImmutableSet} backed by a non-empty {@link java.util.EnumSet}.
@author Jared Levy

## Fields

### `delegate`

**Type:** [`java.util.EnumSet<E>`](../../../../java/util/EnumSet.md)

### `hashCode`

**Type:** `int`

## Constructors

### `<init>([`java.util.EnumSet<E>`](../../../../java/util/EnumSet.md) delegate)`

## Methods

### `asImmutable([`java.util.EnumSet<E>`](../../../../java/util/EnumSet.md) set)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

### `isPartialView()`

**Returns:** `boolean`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `spliterator()`

**Returns:** [`java.util.Spliterator<E>`](../../../../java/util/Spliterator.md)

### `forEach([`java.util.function.Consumer<? super E>`](../../../../java/util/function/Consumer.md) action)`

**Returns:** `void`

### `size()`

**Returns:** `int`

### `contains(`java.lang.Object` object)`

**Returns:** `boolean`

### `containsAll([`java.util.Collection<?>`](../../../../java/util/Collection.md) collection)`

**Returns:** `boolean`

### `isEmpty()`

**Returns:** `boolean`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `isHashCodeFast()`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `writeReplace()`

**Returns:** `java.lang.Object`

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

