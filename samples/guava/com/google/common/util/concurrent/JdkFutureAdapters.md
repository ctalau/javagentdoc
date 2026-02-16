# Class: `JdkFutureAdapters`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.JdkFutureAdapters`

## Description

Utilities necessary for working with libraries that supply plain `Future` instances. Note
 that, whenever possible, it is strongly preferred to modify those libraries to return `ListenableFuture` directly.

 <p>For interoperability between `ListenableFuture` and <b>`CompletableFuture`</b>,
 consider <a href="https://github.com/lukas-krecan/future-converter">Future Converter</a>.
**Author:** Sven Mawson
**Since:** 10.0 (replacing `Futures.makeListenable`, which existed in 1.0)

## Constructors

### `<init>()`

## Methods

### `listenInPoolThread(`java.util.concurrent.Future<V>` future)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

Assigns a thread to the given `Future` to provide `ListenableFuture` functionality.

 <p><b>Warning:</b> If the input future does not already implement `ListenableFuture`, the
 returned future will emulate `ListenableFuture.addListener` by taking a thread from an
 internal, unbounded pool at the first call to `addListener` and holding it until the
 future is done.

 <p>Prefer to create `ListenableFuture` instances with `SettableFuture`, `MoreExecutors.listeningDecorator( java.util.concurrent.ExecutorService)`, `ListenableFutureTask`, `AbstractFuture`, and other utilities over creating plain `Future` instances to be upgraded to `ListenableFuture` after the fact.

### `listenInPoolThread(`java.util.concurrent.Future<V>` future, `java.util.concurrent.Executor` executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

Submits a blocking task for the given `Future` to provide `ListenableFuture`
 functionality.

 <p><b>Warning:</b> If the input future does not already implement `ListenableFuture`, the
 returned future will emulate `ListenableFuture.addListener` by submitting a task to the
 given executor at the first call to `addListener`. The task must be started by the
 executor promptly, or else the returned `ListenableFuture` may fail to work. The task's
 execution consists of blocking until the input future is done, so
 each call to this method may claim and hold a thread for an arbitrary length of time. Use of
 bounded executors or other executors that may fail to execute a task promptly may result in
 deadlocks.

 <p>Prefer to create `ListenableFuture` instances with `SettableFuture`, `MoreExecutors.listeningDecorator( java.util.concurrent.ExecutorService)`, `ListenableFutureTask`, `AbstractFuture`, and other utilities over creating plain `Future` instances to be upgraded to `ListenableFuture` after the fact.
**Since:** 12.0

