# Class: `JdkFutureAdapters`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.JdkFutureAdapters`

## Description

Note
 that, whenever possible, it is strongly preferred to modify those libraries to return 
 ListenableFuture directly.

 
For interoperability between ListenableFuture and **CompletableFuture**,
 consider [Future Converter](https://github.com/lukas-krecan/future-converter).

## Constructors

### `<init>()`

## Methods

### `listenInPoolThread(Future<V> future)`

**Warning:** If the input future does not already implement ListenableFuture, the
 returned future will emulate ListenableFuture#addListener by taking a thread from an
 internal, unbounded pool at the first call to addListener and holding it until the
 future is done.

 
Prefer to create ListenableFuture instances with SettableFuture, MoreExecutors#listeningDecorator( java.util.concurrent.ExecutorService), ListenableFutureTask, AbstractFuture, and other utilities over creating plain 
 Future instances to be upgraded to ListenableFuture after the fact.

**Parameters:**
- `future` (`java.util.concurrent.Future<V>`)

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

### `listenInPoolThread(Future<V> future, Executor executor)`

**Warning:** If the input future does not already implement ListenableFuture, the
 returned future will emulate ListenableFuture#addListener by submitting a task to the
 given executor at the first call to addListener. The task must be started by the
 executor promptly, or else the returned ListenableFuture may fail to work. The task's
 execution consists of blocking until the input future is done, so
 each call to this method may claim and hold a thread for an arbitrary length of time. Use of
 bounded executors or other executors that may fail to execute a task promptly may result in
 deadlocks.

 
Prefer to create ListenableFuture instances with SettableFuture, MoreExecutors#listeningDecorator( java.util.concurrent.ExecutorService), ListenableFutureTask, AbstractFuture, and other utilities over creating plain 
 Future instances to be upgraded to ListenableFuture after the fact.

**Parameters:**
- `future` (`java.util.concurrent.Future<V>`)
- `executor` (`java.util.concurrent.Executor`)

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

