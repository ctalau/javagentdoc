# Class: `ForwardingBlockingQueue`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ForwardingBlockingQueue`

**Extends:** [`com.google.common.collect.ForwardingQueue<E>`](../../collect/ForwardingQueue.md)

**Implements:** `java.util.concurrent.BlockingQueue<E>`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

Subclasses should override one or more methods to modify the behavior of the backing collection
 as desired per the [decorator
 pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**default method warning:** This class does *not* forward calls to 
 default methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the ForwardingBlockingQueue.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.util.concurrent.BlockingQueue<E>`

### `drainTo(java.util.Collection<? super E> c, int maxElements)`

**Returns:** `int`

**Parameters:**
- `c` (`java.util.Collection<? super E>`)
- `maxElements` (`int`)

### `drainTo(java.util.Collection<? super E> c)`

**Returns:** `int`

**Parameters:**
- `c` (`java.util.Collection<? super E>`)

### `offer(E e, long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

**Parameters:**
- `e` (`E`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `poll(long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `E`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `put(E e)`

**Returns:** `void`

**Parameters:**
- `e` (`E`)

### `remainingCapacity()`

**Returns:** `int`

### `take()`

**Returns:** `E`

