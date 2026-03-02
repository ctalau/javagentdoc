# Class: `Subscriber`

**Package:** [`com.google.common.eventbus`](README.md)

**Fully Qualified Name:** `com.google.common.eventbus.Subscriber`

## Description

Two subscribers are equivalent when they refer to the same method on the same object (not
 class). This property is used to ensure that no subscriber method is registered more than once.

## Fields

### `bus`

**Type:** [`com.google.common.eventbus.EventBus`](./EventBus.md)

### `target`

**Type:** `java.lang.Object`

### `method`

**Type:** `java.lang.reflect.Method`

### `executor`

**Type:** `java.util.concurrent.Executor`

## Constructors

### `<init>(EventBus bus, Object target, Method method)`

**Parameters:**
- `bus` ([`com.google.common.eventbus.EventBus`](./EventBus.md))
- `target` (`java.lang.Object`)
- `method` (`java.lang.reflect.Method`)

## Methods

### `create(EventBus bus, Object listener, Method method)`

**Parameters:**
- `bus` ([`com.google.common.eventbus.EventBus`](./EventBus.md))
- `listener` (`java.lang.Object`)
- `method` (`java.lang.reflect.Method`)

**Returns:** [`com.google.common.eventbus.Subscriber`](./Subscriber.md)

### `dispatchEvent(Object event)`

**Parameters:**
- `event` (`java.lang.Object`)

**Returns:** `void`

### `invokeSubscriberMethod(Object event)`

This method can be overridden to make the invocation
 synchronized.

**Parameters:**
- `event` (`java.lang.Object`)

**Returns:** `void`

### `context(Object event)`

**Parameters:**
- `event` (`java.lang.Object`)

**Returns:** [`com.google.common.eventbus.SubscriberExceptionContext`](./SubscriberExceptionContext.md)

### `hashCode()`

**Returns:** `int`

### `equals(Object obj)`

**Parameters:**
- `obj` (`java.lang.Object`)

**Returns:** `boolean`

### `isDeclaredThreadSafe(Method method)`

**Parameters:**
- `method` (`java.lang.reflect.Method`)

**Returns:** `boolean`

