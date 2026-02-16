# Class: `AsyncEventBus`

**Package:** [`com.google.common.eventbus`](README.md)

**Fully Qualified Name:** `com.google.common.eventbus.AsyncEventBus`

**Extends:** [`com.google.common.eventbus.EventBus`](./EventBus.md)

## Description

An `EventBus` that takes the Executor of your choice and uses it to dispatch events,
 allowing dispatch to occur asynchronously.
**Author:** Cliff Biffle
**Since:** 10.0

## Constructors

### `<init>(`java.lang.String` identifier, `java.util.concurrent.Executor` executor)`

Creates a new AsyncEventBus that will use `executor` to dispatch events. Assigns `identifier` as the bus's name for logging purposes.
@param identifier short name for the bus, for logging purposes.
@param executor Executor to use to dispatch events. It is the caller's responsibility to shut
     down the executor after the last event has been posted to this event bus.

### `<init>(`java.util.concurrent.Executor` executor, [`com.google.common.eventbus.SubscriberExceptionHandler`](./SubscriberExceptionHandler.md) subscriberExceptionHandler)`

Creates a new AsyncEventBus that will use `executor` to dispatch events.
@param executor Executor to use to dispatch events. It is the caller's responsibility to shut
     down the executor after the last event has been posted to this event bus.
@param subscriberExceptionHandler Handler used to handle exceptions thrown from subscribers.
     See `SubscriberExceptionHandler` for more information.
**Since:** 16.0

### `<init>(`java.util.concurrent.Executor` executor)`

Creates a new AsyncEventBus that will use `executor` to dispatch events.
@param executor Executor to use to dispatch events. It is the caller's responsibility to shut
     down the executor after the last event has been posted to this event bus.

