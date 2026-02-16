# Class: `ConsumingQueueIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ConsumingQueueIterator`

**Extends:** [`com.google.common.collect.AbstractIterator<T>`](./AbstractIterator.md)

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An Iterator implementation which draws elements from a queue, removing them from the queue as it
 iterates. This class is not thread safe.

## Fields

### `queue`

**Type:** [`java.util.Queue<T>`](../../../../java/util/Queue.md)

## Constructors

### `<init>([`java.util.Queue<T>`](../../../../java/util/Queue.md) queue)`

## Methods

### `computeNext()`

**Returns:** [`T`](T.md)

