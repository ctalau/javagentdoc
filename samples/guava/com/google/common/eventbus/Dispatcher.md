# Class: `Dispatcher`

**Package:** [`com.google.common.eventbus`](README.md)

**Fully Qualified Name:** `com.google.common.eventbus.Dispatcher`

## Description

Handler for dispatching events to subscribers, providing different event ordering guarantees that
 make sense for different situations.

 <p><b>Note:</b> The dispatcher is orthogonal to the subscriber's `Executor`. The dispatcher
 controls the order in which events are dispatched, while the executor controls how (i.e. on which
 thread) the subscriber is actually called when an event is dispatched to it.
**Author:** Colin Decker

## Constructors

### `<init>()`

## Methods

### `perThreadDispatchQueue()`

**Returns:** [`com.google.common.eventbus.Dispatcher`](./Dispatcher.md)

Returns a dispatcher that queues events that are posted reentrantly on a thread that is already
 dispatching an event, guaranteeing that all events posted on a single thread are dispatched to
 all subscribers in the order they are posted.

 <p>When all subscribers are dispatched to using a <i>direct</i> executor (which dispatches on
 the same thread that posts the event), this yields a breadth-first dispatch order on each
 thread. That is, all subscribers to a single event A will be called before any subscribers to
 any events B and C that are posted to the event bus by the subscribers to A.

### `legacyAsync()`

**Returns:** [`com.google.common.eventbus.Dispatcher`](./Dispatcher.md)

Returns a dispatcher that queues events that are posted in a single global queue. This behavior
 matches the original behavior of AsyncEventBus exactly, but is otherwise not especially useful.
 For async dispatch, an immediate dispatcher should generally be
 preferable.

### `immediate()`

**Returns:** [`com.google.common.eventbus.Dispatcher`](./Dispatcher.md)

Returns a dispatcher that dispatches events to subscribers immediately as they're posted
 without using an intermediate queue to change the dispatch order. This is effectively a
 depth-first dispatch order, vs. breadth-first when using a queue.

### `dispatch(`java.lang.Object` event, `java.util.Iterator<com.google.common.eventbus.Subscriber>` subscribers)`

**Returns:** `void`

Dispatches the given `event` to the given `subscribers`.

