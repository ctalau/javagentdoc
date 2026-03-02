# Class: `ForwardingBlockingDeque`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingBlockingDeque`

**Extends:** [`com.google.common.collect.ForwardingDeque<E>`](./ForwardingDeque.md)

**Implements:** `java.util.concurrent.BlockingDeque<E>`

## Type Parameters

- `E` extends `java.lang.Object`

## Description

Subclasses should override one or more methods to modify the behavior of the backing deque as
 desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**Warning:** The methods of ForwardingBlockingDeque forward **indiscriminately**
 to the methods of the delegate. For example, overriding #add alone **will not** change
 the behaviour of #offer which can lead to unexpected behaviour. In this case, you should
 override offer as well, either providing your own implementation, or delegating to the
 provided standardOffer method.

 
**default method warning:** This class does *not* forward calls to 
 default methods. Instead, it inherits their default implementations. When those implementations
 invoke methods, they invoke methods on the ForwardingBlockingDeque.

 
The standard methods are not guaranteed to be thread-safe, even when all of the
 methods that they depend on are thread-safe.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.util.concurrent.BlockingDeque<E>`

### `remainingCapacity()`

**Returns:** `int`

### `putFirst(E e)`

**Returns:** `void`

**Parameters:**
- `e` (`E`)

### `putLast(E e)`

**Returns:** `void`

**Parameters:**
- `e` (`E`)

### `offerFirst(E e, long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

**Parameters:**
- `e` (`E`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `offerLast(E e, long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

**Parameters:**
- `e` (`E`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `takeFirst()`

**Returns:** `E`

### `takeLast()`

**Returns:** `E`

### `pollFirst(long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `E`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `pollLast(long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `E`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `put(E e)`

**Returns:** `void`

**Parameters:**
- `e` (`E`)

### `offer(E e, long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `boolean`

**Parameters:**
- `e` (`E`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `take()`

**Returns:** `E`

### `poll(long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `E`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `drainTo(java.util.Collection<? super E> c)`

**Returns:** `int`

**Parameters:**
- `c` (`java.util.Collection<? super E>`)

### `drainTo(java.util.Collection<? super E> c, int maxElements)`

**Returns:** `int`

**Parameters:**
- `c` (`java.util.Collection<? super E>`)
- `maxElements` (`int`)

