# Class: `JdkFutureAdapters`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.JdkFutureAdapters`

## Description

Utilities necessary for working with libraries that supply plain {@link Future} instances. Note
 that, whenever possible, it is strongly preferred to modify those libraries to return {@code
 ListenableFuture} directly.

 <p>For interoperability between {@code ListenableFuture} and <b>{@code CompletableFuture}</b>,
 consider <a href="https://github.com/lukas-krecan/future-converter">Future Converter</a>.
@author Sven Mawson
@since 10.0 (replacing {@code Futures.makeListenable}, which existed in 1.0)

## Constructors

### `<init>()`

## Methods

### `listenInPoolThread([`java.util.concurrent.Future<V>`](../../../../../java/util/concurrent/Future.md) future)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

Assigns a thread to the given {@link Future} to provide {@link ListenableFuture} functionality.

 <p><b>Warning:</b> If the input future does not already implement {@code ListenableFuture}, the
 returned future will emulate {@link ListenableFuture#addListener} by taking a thread from an
 internal, unbounded pool at the first call to {@code addListener} and holding it until the
 future is {@linkplain Future#isDone() done}.

 <p>Prefer to create {@code ListenableFuture} instances with {@link SettableFuture}, {@link MoreExecutors#listeningDecorator( java.util.concurrent.ExecutorService)}, {@link ListenableFutureTask}, {@link AbstractFuture}, and other utilities over creating plain {@code
 Future} instances to be upgraded to {@code ListenableFuture} after the fact.

### `listenInPoolThread([`java.util.concurrent.Future<V>`](../../../../../java/util/concurrent/Future.md) future, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

Submits a blocking task for the given {@link Future} to provide {@link ListenableFuture}
 functionality.

 <p><b>Warning:</b> If the input future does not already implement {@code ListenableFuture}, the
 returned future will emulate {@link ListenableFuture#addListener} by submitting a task to the
 given executor at the first call to {@code addListener}. The task must be started by the
 executor promptly, or else the returned {@code ListenableFuture} may fail to work. The task's
 execution consists of blocking until the input future is {@linkplain Future#isDone() done}, so
 each call to this method may claim and hold a thread for an arbitrary length of time. Use of
 bounded executors or other executors that may fail to execute a task promptly may result in
 deadlocks.

 <p>Prefer to create {@code ListenableFuture} instances with {@link SettableFuture}, {@link MoreExecutors#listeningDecorator( java.util.concurrent.ExecutorService)}, {@link ListenableFutureTask}, {@link AbstractFuture}, and other utilities over creating plain {@code
 Future} instances to be upgraded to {@code ListenableFuture} after the fact.
@since 12.0

