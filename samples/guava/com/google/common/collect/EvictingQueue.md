# Class: `EvictingQueue`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.EvictingQueue`

**Extends:** [`com.google.common.collect.ForwardingQueue<E>`](./ForwardingQueue.md)

**Implements:** `java.io.Serializable`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

This queue orders elements FIFO
 (first-in-first-out). This data structure is logically equivalent to a circular buffer (i.e.,
 cyclic buffer or ring buffer).

 
An evicting queue must be configured with a maximum size. Each time an element is added to a
 full queue, the queue automatically removes its head element. This is different from conventional
 bounded queues, which either block or reject new elements when full.

 
This class is not thread-safe, and does not accept null elements.

## Fields

### `delegate`

**Type:** `java.util.Queue<E>`

### `maxSize`

**Type:** `int`

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>(int maxSize)`

**Parameters:**
- `maxSize` (`int`)

## Methods

### `create(int maxSize)`

**Returns:** [`com.google.common.collect.EvictingQueue<E>`](./EvictingQueue.md)

When maxSize is zero, elements will be evicted immediately after being added to the
 queue.

**Parameters:**
- `maxSize` (`int`)

### `remainingCapacity()`

**Returns:** `int`

### `delegate()`

**Returns:** `java.util.Queue<E>`

### `offer(E e)`

**Returns:** `boolean`

If the queue is currently full, the element at the head
 of the queue is evicted to make room.

**Parameters:**
- `e` (`E`)

### `add(E e)`

**Returns:** `boolean`

If the queue is currently full, the element at the head
 of the queue is evicted to make room.

**Parameters:**
- `e` (`E`)

### `addAll(java.util.Collection<? extends E> collection)`

**Returns:** `boolean`

**Parameters:**
- `collection` (`java.util.Collection<? extends E>`)

### `toArray()`

**Returns:** `java.lang.Object[]`

