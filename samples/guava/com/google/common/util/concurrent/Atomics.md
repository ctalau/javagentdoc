# Class: `Atomics`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Atomics`

## Description

Static utility methods pertaining to classes in the {@code java.util.concurrent.atomic} package.
@author Kurt Alfred Kluever
@since 10.0

## Constructors

### `<init>()`

## Methods

### `newReference()`

**Returns:** [`java.util.concurrent.atomic.AtomicReference<@org.checkerframework.checker.nullness.qual.Nullable V>`](../../../../../java/util/concurrent/atomic/AtomicReference.md)

Creates an {@code AtomicReference} instance with no initial value.
@return a new {@code AtomicReference} with no initial value

### `newReference([`V`](V.md) initialValue)`

**Returns:** [`java.util.concurrent.atomic.AtomicReference<V>`](../../../../../java/util/concurrent/atomic/AtomicReference.md)

Creates an {@code AtomicReference} instance with the given initial value.
@param initialValue the initial value
@return a new {@code AtomicReference} with the given initial value

### `newReferenceArray(`int` length)`

**Returns:** [`java.util.concurrent.atomic.AtomicReferenceArray<@org.checkerframework.checker.nullness.qual.Nullable E>`](../../../../../java/util/concurrent/atomic/AtomicReferenceArray.md)

Creates an {@code AtomicReferenceArray} instance of given length.
@param length the length of the array
@return a new {@code AtomicReferenceArray} with the given length

### `newReferenceArray([`E[]`](E.md) array)`

**Returns:** [`java.util.concurrent.atomic.AtomicReferenceArray<E>`](../../../../../java/util/concurrent/atomic/AtomicReferenceArray.md)

Creates an {@code AtomicReferenceArray} instance with the same length as, and all elements
 copied from, the given array.
@param array the array to copy elements from
@return a new {@code AtomicReferenceArray} copied from the given array

