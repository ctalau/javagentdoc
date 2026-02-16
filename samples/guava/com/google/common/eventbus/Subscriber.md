# Class: `Subscriber`

**Package:** [`com.google.common.eventbus`](README.md)

**Fully Qualified Name:** `com.google.common.eventbus.Subscriber`

## Description

A subscriber method on a specific object, plus the executor that should be used for dispatching
 events to it.

 <p>Two subscribers are equivalent when they refer to the same method on the same object (not
 class). This property is used to ensure that no subscriber method is registered more than once.
**Author:** Colin Decker

## Fields

### `bus`

**Type:** [`com.google.common.eventbus.EventBus`](./EventBus.md)

The event bus this subscriber belongs to.

### `target`

**Type:** `java.lang.Object`

The object with the subscriber method.

### `method`

**Type:** `java.lang.reflect.Method`

Subscriber method.

### `executor`

**Type:** `java.util.concurrent.Executor`

Executor to use for dispatching events to this subscriber.

## Constructors

### `<init>([`com.google.common.eventbus.EventBus`](./EventBus.md) bus, `java.lang.Object` target, `java.lang.reflect.Method` method)`

## Methods

### `create([`com.google.common.eventbus.EventBus`](./EventBus.md) bus, `java.lang.Object` listener, `java.lang.reflect.Method` method)`

**Returns:** [`com.google.common.eventbus.Subscriber`](./Subscriber.md)

Creates a `Subscriber` for `method` on `listener`.

### `dispatchEvent(`java.lang.Object` event)`

**Returns:** `void`

Dispatches `event` to this subscriber using the proper executor.

### `invokeSubscriberMethod(`java.lang.Object` event)`

**Returns:** `void`

Invokes the subscriber method. This method can be overridden to make the invocation
 synchronized.

### `context(`java.lang.Object` event)`

**Returns:** [`com.google.common.eventbus.SubscriberExceptionContext`](./SubscriberExceptionContext.md)

Gets the context for the given event.

### `hashCode()`

**Returns:** `int`

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `isDeclaredThreadSafe(`java.lang.reflect.Method` method)`

**Returns:** `boolean`

Checks whether `method` is thread-safe, as indicated by the presence of the `AllowConcurrentEvents` annotation.

