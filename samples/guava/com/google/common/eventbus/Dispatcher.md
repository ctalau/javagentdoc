# Class: `Dispatcher`

**Package:** [`com.google.common.eventbus`](README.md)

**Fully Qualified Name:** `com.google.common.eventbus.Dispatcher`

## Description

**Note:** The dispatcher is orthogonal to the subscriber's Executor. The dispatcher
 controls the order in which events are dispatched, while the executor controls how (i.e. on which
 thread) the subscriber is actually called when an event is dispatched to it.

## Constructors

### `<init>()`

## Methods

### `perThreadDispatchQueue()`

**Returns:** [`com.google.common.eventbus.Dispatcher`](./Dispatcher.md)

When all subscribers are dispatched to using a *direct* executor (which dispatches on
 the same thread that posts the event), this yields a breadth-first dispatch order on each
 thread. That is, all subscribers to a single event A will be called before any subscribers to
 any events B and C that are posted to the event bus by the subscribers to A.

### `legacyAsync()`

**Returns:** [`com.google.common.eventbus.Dispatcher`](./Dispatcher.md)

This behavior
 matches the original behavior of AsyncEventBus exactly, but is otherwise not especially useful.
 For async dispatch, an immediate dispatcher should generally be
 preferable.

### `immediate()`

**Returns:** [`com.google.common.eventbus.Dispatcher`](./Dispatcher.md)

This is effectively a
 depth-first dispatch order, vs. breadth-first when using a queue.

### `dispatch(java.lang.Object event, java.util.Iterator<com.google.common.eventbus.Subscriber> subscribers)`

**Returns:** `void`

**Parameters:**
- `event` (`java.lang.Object`)
- `subscribers` (`java.util.Iterator<com.google.common.eventbus.Subscriber>`)

