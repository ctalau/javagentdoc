# Class: `SubscriberExceptionContext`

**Package:** [`com.google.common.eventbus`](README.md)

**Fully Qualified Name:** `com.google.common.eventbus.SubscriberExceptionContext`

## Description

Context for an exception thrown by a subscriber.
**Since:** 16.0

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

### `<init>([`com.google.common.eventbus.EventBus`](./EventBus.md) eventBus, `java.lang.Object` event, `java.lang.Object` subscriber, `java.lang.reflect.Method` subscriberMethod)`

@param eventBus The `EventBus` that handled the event and the subscriber. Useful for
     broadcasting a new event based on the error.
@param event The event object that caused the subscriber to throw.
@param subscriber The source subscriber context.
@param subscriberMethod the subscribed method.

## Methods

### `getEventBus()`

**Returns:** [`com.google.common.eventbus.EventBus`](./EventBus.md)

@return The `EventBus` that handled the event and the subscriber. Useful for broadcasting
     a new event based on the error.

### `getEvent()`

**Returns:** `java.lang.Object`

@return The event object that caused the subscriber to throw.

### `getSubscriber()`

**Returns:** `java.lang.Object`

@return The object context that the subscriber was called on.

### `getSubscriberMethod()`

**Returns:** `java.lang.reflect.Method`

@return The subscribed method that threw the exception.

