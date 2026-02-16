# Class: `ImmutableEnumSet`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableEnumSet`

**Extends:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

## Type Parameters

- `E` extends `java.lang.Enum<E>`

## Description

Implementation of `ImmutableSet` backed by a non-empty `java.util.EnumSet`.
**Author:** Jared Levy

## Fields

### `delegate`

**Type:** `java.util.EnumSet<E>`

### `hashCode`

**Type:** `int`

## Constructors

### `<init>(`java.util.EnumSet<E>` delegate)`

## Methods

### `asImmutable(`java.util.EnumSet<E>` set)`

**Returns:** [`com.google.common.collect.ImmutableSet<E>`](./ImmutableSet.md)

### `isPartialView()`

**Returns:** `boolean`

### `iterator()`

**Returns:** [`com.google.common.collect.UnmodifiableIterator<E>`](./UnmodifiableIterator.md)

### `spliterator()`

**Returns:** `java.util.Spliterator<E>`

### `forEach(`java.util.function.Consumer<? super E>` action)`

**Returns:** `void`

### `size()`

**Returns:** `int`

### `contains(`java.lang.Object` object)`

**Returns:** `boolean`

### `containsAll(`java.util.Collection<?>` collection)`

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

### `readObject(`java.io.ObjectInputStream` stream)`

**Returns:** `void`

