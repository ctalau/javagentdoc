# Class: `ListenerCallQueue`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ListenerCallQueue`

## Type Parameters

- `L` extends `java.lang.Object`

## Description

A list of listeners for implementing a concurrency friendly observable object.

 <p>Listeners are registered once via `addListener` and then may be invoked by enqueueing and then dispatching events.

 <p>The API of this class is designed to make it easy to achieve the following properties

 <ul>
   <li>Multiple events for the same listener are never dispatched concurrently.
   <li>Events for the different listeners are dispatched concurrently.
   <li>All events for a given listener dispatch on the provided `executor`.
   <li>It is easy for the user to ensure that listeners are never invoked while holding locks.
 </ul>

 The last point is subtle. Often the observable object will be managing its own internal state
 using a lock, however it is dangerous to dispatch listeners while holding a lock because they
 might run on the `directExecutor()` or be otherwise re-entrant (call back into your
 object). So it is important to not call `dispatch` while holding any locks. This is why
 `enqueue` and `dispatch` are 2 different methods. It is expected that the decision
 to run a particular event is made during the state change, but the decision to actually invoke
 the listeners can be delayed slightly so that locks can be dropped. Also, because `dispatch` is expected to be called concurrently, it is idempotent.

## Fields

### `logger`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `listeners`

**Type:** `java.util.List<com.google.common.util.concurrent.ListenerCallQueue.PerListenerQueue<L>>`

## Constructors

### `<init>()`

## Methods

### `addListener(`L` listener, `java.util.concurrent.Executor` executor)`

**Returns:** `void`

Adds a listener that will be called using the given executor when events are later `enqueue enqueued` and `dispatch dispatched`.

### `enqueue([`com.google.common.util.concurrent.ListenerCallQueue.Event<L>`](ListenerCallQueue/Event.md) event)`

**Returns:** `void`

Enqueues an event to be run on currently known listeners.

 <p>The `toString` method of the Event itself will be used to describe the event in the
 case of an error.
@param event the callback to execute on `dispatch`

### `enqueue([`com.google.common.util.concurrent.ListenerCallQueue.Event<L>`](ListenerCallQueue/Event.md) event, `java.lang.String` label)`

**Returns:** `void`

Enqueues an event to be run on currently known listeners, with a label.
@param event the callback to execute on `dispatch`
@param label a description of the event to use in the case of an error

### `enqueueHelper([`com.google.common.util.concurrent.ListenerCallQueue.Event<L>`](ListenerCallQueue/Event.md) event, `java.lang.Object` label)`

**Returns:** `void`

### `dispatch()`

**Returns:** `void`

Dispatches all events enqueued prior to this call, serially and in order, for every listener.

 <p>Note: this method is idempotent and safe to call from any thread

