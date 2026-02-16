# Class: `ImmutableAsList`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ImmutableAsList`

**Extends:** [`com.google.common.collect.ImmutableList<E>`](./ImmutableList.md)

## Type Parameters

- `E` extends `java.lang.Object`

## Description

List returned by {@link ImmutableCollection#asList} that delegates {@code contains} checks to the
 backing collection.
@author Jared Levy
@author Louis Wasserman

## Constructors

### `<init>()`

## Methods

### `delegateCollection()`

**Returns:** [`com.google.common.collect.ImmutableCollection<E>`](./ImmutableCollection.md)

### `contains(`java.lang.Object` target)`

**Returns:** `boolean`

### `size()`

**Returns:** `int`

### `isEmpty()`

**Returns:** `boolean`

### `isPartialView()`

**Returns:** `boolean`

### `readObject([`java.io.ObjectInputStream`](../../../../java/io/ObjectInputStream.md) stream)`

**Returns:** `void`

### `writeReplace()`

**Returns:** `java.lang.Object`

