# Class: `ListenerCallQueue`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ListenerCallQueue`

## Type Parameters

- `L` extends `java.lang.Object`

## Description

Listeners are registered once via #addListener and then may be invoked by enqueueing and then dispatching events.

 
The API of this class is designed to make it easy to achieve the following properties

 

   - Multiple events for the same listener are never dispatched concurrently.
   - Events for the different listeners are dispatched concurrently.
   - All events for a given listener dispatch on the provided #executor.
   - It is easy for the user to ensure that listeners are never invoked while holding locks.
 


 The last point is subtle. Often the observable object will be managing its own internal state
 using a lock, however it is dangerous to dispatch listeners while holding a lock because they
 might run on the directExecutor() or be otherwise re-entrant (call back into your
 object). So it is important to not call #dispatch while holding any locks. This is why
 #enqueue and #dispatch are 2 different methods. It is expected that the decision
 to run a particular event is made during the state change, but the decision to actually invoke
 the listeners can be delayed slightly so that locks can be dropped. Also, because #dispatch is expected to be called concurrently, it is idempotent.

## Fields

### `logger`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `listeners`

**Type:** `java.util.List<com.google.common.util.concurrent.ListenerCallQueue.PerListenerQueue<L>>`

## Constructors

### `<init>()`

## Methods

### `addListener(L listener, Executor executor)`

**Parameters:**
- `listener` (`L`)
- `executor` (`java.util.concurrent.Executor`)

**Returns:** `void`

### `enqueue(ListenerCallQueue.Event<L> event)`

The toString method of the Event itself will be used to describe the event in the
 case of an error.

**Parameters:**
- `event` (`com.google.common.util.concurrent.ListenerCallQueue.Event<L>`): the callback to execute on #dispatch

**Returns:** `void`

### `enqueue(ListenerCallQueue.Event<L> event, String label)`

**Parameters:**
- `event` (`com.google.common.util.concurrent.ListenerCallQueue.Event<L>`): the callback to execute on #dispatch
- `label` (`java.lang.String`): a description of the event to use in the case of an error

**Returns:** `void`

### `enqueueHelper(ListenerCallQueue.Event<L> event, Object label)`

**Parameters:**
- `event` (`com.google.common.util.concurrent.ListenerCallQueue.Event<L>`)
- `label` (`java.lang.Object`)

**Returns:** `void`

### `dispatch()`

Note: this method is idempotent and safe to call from any thread

**Returns:** `void`

