# Class: `SubscriberExceptionContext`

**Package:** [`com.google.common.eventbus`](README.md)

**Fully Qualified Name:** `com.google.common.eventbus.SubscriberExceptionContext`

## Description

## Fields

### `eventBus`

**Type:** [`com.google.common.eventbus.EventBus`](./EventBus.md)

### `event`

**Type:** `java.lang.Object`

### `subscriber`

**Type:** `java.lang.Object`

### `subscriberMethod`

**Type:** `java.lang.reflect.Method`

## Constructors

### `<init>(com.google.common.eventbus.EventBus eventBus, java.lang.Object event, java.lang.Object subscriber, java.lang.reflect.Method subscriberMethod)`

**Parameters:**
- `eventBus` ([`com.google.common.eventbus.EventBus`](./EventBus.md)): The EventBus that handled the event and the subscriber. Useful for
     broadcasting a new event based on the error.
- `event` (`java.lang.Object`): The event object that caused the subscriber to throw.
- `subscriber` (`java.lang.Object`): The source subscriber context.
- `subscriberMethod` (`java.lang.reflect.Method`): the subscribed method.

## Methods

### `getEventBus()`

**Returns:** [`com.google.common.eventbus.EventBus`](./EventBus.md)

### `getEvent()`

**Returns:** `java.lang.Object`

### `getSubscriber()`

**Returns:** `java.lang.Object`

### `getSubscriberMethod()`

**Returns:** `java.lang.reflect.Method`

