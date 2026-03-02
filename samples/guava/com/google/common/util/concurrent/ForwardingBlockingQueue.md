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

### `drainTo(Collection<? super E> c, int maxElements)`

**Parameters:**
- `c` (`java.util.Collection<? super E>`)
- `maxElements` (`int`)

**Returns:** `int`

### `drainTo(Collection<? super E> c)`

**Parameters:**
- `c` (`java.util.Collection<? super E>`)

**Returns:** `int`

### `offer(E e, long timeout, TimeUnit unit)`

**Parameters:**
- `e` (`E`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

### `poll(long timeout, TimeUnit unit)`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `E`

### `put(E e)`

**Parameters:**
- `e` (`E`)

**Returns:** `void`

### `remainingCapacity()`

**Returns:** `int`

### `take()`

**Returns:** `E`

