# Class: `AsyncEventBus`

**Package:** [`com.google.common.eventbus`](README.md)

**Fully Qualified Name:** `com.google.common.eventbus.AsyncEventBus`

**Extends:** [`com.google.common.eventbus.EventBus`](./EventBus.md)

## Description

## Constructors

### `<init>(String identifier, Executor executor)`

Assigns 
 identifier as the bus's name for logging purposes.

**Parameters:**
- `identifier` (`java.lang.String`): short name for the bus, for logging purposes.
- `executor` (`java.util.concurrent.Executor`): Executor to use to dispatch events. It is the caller's responsibility to shut
       down the executor after the last event has been posted to this event bus.

### `<init>(Executor executor, SubscriberExceptionHandler subscriberExceptionHandler)`

**Parameters:**
- `executor` (`java.util.concurrent.Executor`): Executor to use to dispatch events. It is the caller's responsibility to shut
       down the executor after the last event has been posted to this event bus.
- `subscriberExceptionHandler` ([`com.google.common.eventbus.SubscriberExceptionHandler`](./SubscriberExceptionHandler.md)): Handler used to handle exceptions thrown from subscribers.
       See SubscriberExceptionHandler for more information.

### `<init>(Executor executor)`

**Parameters:**
- `executor` (`java.util.concurrent.Executor`): Executor to use to dispatch events. It is the caller's responsibility to shut
       down the executor after the last event has been posted to this event bus.

