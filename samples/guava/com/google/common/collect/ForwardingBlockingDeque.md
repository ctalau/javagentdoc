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

**Parameters:**
- `e` (`E`)

**Returns:** `void`

### `putLast(E e)`

**Parameters:**
- `e` (`E`)

**Returns:** `void`

### `offerFirst(E e, long timeout, TimeUnit unit)`

**Parameters:**
- `e` (`E`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

### `offerLast(E e, long timeout, TimeUnit unit)`

**Parameters:**
- `e` (`E`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

### `takeFirst()`

**Returns:** `E`

### `takeLast()`

**Returns:** `E`

### `pollFirst(long timeout, TimeUnit unit)`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `E`

### `pollLast(long timeout, TimeUnit unit)`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `E`

### `put(E e)`

**Parameters:**
- `e` (`E`)

**Returns:** `void`

### `offer(E e, long timeout, TimeUnit unit)`

**Parameters:**
- `e` (`E`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `boolean`

### `take()`

**Returns:** `E`

### `poll(long timeout, TimeUnit unit)`

**Parameters:**
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

**Returns:** `E`

### `drainTo(Collection<? super E> c)`

**Parameters:**
- `c` (`java.util.Collection<? super E>`)

**Returns:** `int`

### `drainTo(Collection<? super E> c, int maxElements)`

**Parameters:**
- `c` (`java.util.Collection<? super E>`)
- `maxElements` (`int`)

**Returns:** `int`

