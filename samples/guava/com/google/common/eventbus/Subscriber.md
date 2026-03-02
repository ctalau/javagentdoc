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

### `<init>(com.google.common.eventbus.EventBus bus, java.lang.Object target, java.lang.reflect.Method method)`

**Parameters:**
- `bus` ([`com.google.common.eventbus.EventBus`](./EventBus.md))
- `target` (`java.lang.Object`)
- `method` (`java.lang.reflect.Method`)

## Methods

### `create(com.google.common.eventbus.EventBus bus, java.lang.Object listener, java.lang.reflect.Method method)`

**Returns:** [`com.google.common.eventbus.Subscriber`](./Subscriber.md)

**Parameters:**
- `bus` ([`com.google.common.eventbus.EventBus`](./EventBus.md))
- `listener` (`java.lang.Object`)
- `method` (`java.lang.reflect.Method`)

### `dispatchEvent(java.lang.Object event)`

**Returns:** `void`

**Parameters:**
- `event` (`java.lang.Object`)

### `invokeSubscriberMethod(java.lang.Object event)`

**Returns:** `void`

This method can be overridden to make the invocation
 synchronized.

**Parameters:**
- `event` (`java.lang.Object`)

### `context(java.lang.Object event)`

**Returns:** [`com.google.common.eventbus.SubscriberExceptionContext`](./SubscriberExceptionContext.md)

**Parameters:**
- `event` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `equals(java.lang.Object obj)`

**Returns:** `boolean`

**Parameters:**
- `obj` (`java.lang.Object`)

### `isDeclaredThreadSafe(java.lang.reflect.Method method)`

**Returns:** `boolean`

**Parameters:**
- `method` (`java.lang.reflect.Method`)

