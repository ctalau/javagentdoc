# Class: `EvictingQueue`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.EvictingQueue`

**Extends:** [`com.google.common.collect.ForwardingQueue<E>`](./ForwardingQueue.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

A non-blocking queue which automatically evicts elements from the head of the queue when
 attempting to add new elements onto the queue and it is full. This queue orders elements FIFO
 (first-in-first-out). This data structure is logically equivalent to a circular buffer (i.e.,
 cyclic buffer or ring buffer).

 <p>An evicting queue must be configured with a maximum size. Each time an element is added to a
 full queue, the queue automatically removes its head element. This is different from conventional
 bounded queues, which either block or reject new elements when full.

 <p>This class is not thread-safe, and does not accept null elements.
**Author:** Kurt Alfred Kluever
**Since:** 15.0

## Fields

### `delegate`

**Type:** `java.util.Queue<E>`

### `maxSize`

**Type:** `int`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(`int` maxSize)`

## Methods

### `create(`int` maxSize)`

**Returns:** [`com.google.common.collect.EvictingQueue<E>`](./EvictingQueue.md)

Creates and returns a new evicting queue that will hold up to `maxSize` elements.

 <p>When `maxSize` is zero, elements will be evicted immediately after being added to the
 queue.

### `remainingCapacity()`

**Returns:** `int`

Returns the number of additional elements that this queue can accept without evicting; zero if
 the queue is currently full.
**Since:** 16.0

### `delegate()`

**Returns:** `java.util.Queue<E>`

### `offer(`E` e)`

**Returns:** `boolean`

Adds the given element to this queue. If the queue is currently full, the element at the head
 of the queue is evicted to make room.
@return `true` always

### `add(`E` e)`

**Returns:** `boolean`

Adds the given element to this queue. If the queue is currently full, the element at the head
 of the queue is evicted to make room.
@return `true` always

### `addAll(`java.util.Collection<? extends E>` collection)`

**Returns:** `boolean`

### `toArray()`

**Returns:** `java.lang.Object[]`

