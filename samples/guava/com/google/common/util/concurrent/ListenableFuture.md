# Interface: `ListenableFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ListenableFuture`

**Extends:** `java.util.concurrent.Future<V>`

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A `Future` that accepts completion listeners. Each listener has an associated executor, and
 it is invoked using this executor once the future's computation is complete. If the computation has already completed when the listener is added, the listener will
 execute immediately.

 <p>See the Guava User Guide article on <a href="https://github.com/google/guava/wiki/ListenableFutureExplained">`ListenableFuture`</a>.

 <p>This class is GWT-compatible.

 <h3>Purpose</h3>

 <p>The main purpose of `ListenableFuture` is to help you chain together a graph of
 asynchronous operations. You can chain them together manually with calls to methods like `Futures.transform(ListenableFuture, com.google.common.base.Function, Executor) Futures.transform`
 (or `FluentFuture.transform(com.google.common.base.Function, Executor) FluentFuture.transform`), but you will often find it easier to use a framework. Frameworks
 automate the process, often adding features like monitoring, debugging, and cancellation.
 Examples of frameworks include:

 <ul>
   <li><a href="https://dagger.dev/producers.html">Dagger Producers</a>
 </ul>

 <p>The main purpose of `addListener addListener` is to support this chaining. You will
 rarely use it directly, in part because it does not provide direct access to the `Future`
 result. (If you want such access, you may prefer `Futures.addCallback Futures.addCallback`.) Still, direct `addListener` calls are occasionally useful:

 <pre>`final String name = ...;
 inFlight.add(name);
 ListenableFuture<Result> future = service.query(name);
 future.addListener(new Runnable() {
   public void run() {
     processedCount.incrementAndGet();
     inFlight.remove(name);
     lastProcessed.set(name);
     logger.info("Done with {0`", name);
   }
 }, executor);
 }</pre>

 <h3>How to get an instance</h3>

 <p>We encourage you to return `ListenableFuture` from your methods so that your users can
 take advantage of the utilities built atop the class. The way that you will
 create `ListenableFuture` instances depends on how you currently create `Future`
 instances:

 <ul>
   <li>If you receive them from an `java.util.concurrent.ExecutorService`, convert that
       service to a `ListeningExecutorService`, usually by calling `MoreExecutors.listeningDecorator(java.util.concurrent.ExecutorService) MoreExecutors.listeningDecorator`.
   <li>If you manually call `java.util.concurrent.FutureTask.set` or a similar method,
       create a `SettableFuture` instead. (If your needs are more complex, you may prefer
       `AbstractFuture`.)
 </ul>

 <p><b>Test doubles</b>: If you need a `ListenableFuture` for your test, try a `SettableFuture` or one of the methods in the `Futures.immediateFuture Futures.immediate*`
 family. <b>Avoid</b> creating a mock or stub `Future`. Mock and stub implementations are
 fragile because they assume that only certain methods will be called and because they often
 implement subtleties of the API improperly.

 <p><b>Custom implementation</b>: Avoid implementing `ListenableFuture` from scratch. If you
 can't get by with the standard implementations, prefer to derive a new `Future` instance
 with the methods in `Futures` or, if necessary, to extend `AbstractFuture`.

 <p>Occasionally, an API will return a plain `Future` and it will be impossible to change
 the return type. For this case, we provide a more expensive workaround in `JdkFutureAdapters`. However, when possible, it is more efficient and reliable to create a `ListenableFuture` directly.
**Author:** Sven Mawson
**Author:** Nishant Thakkar
**Since:** 1.0

## Methods

### `addListener(`java.lang.Runnable` listener, `java.util.concurrent.Executor` executor)`

**Returns:** `void`

Registers a listener to be run on the given executor.
 The listener will run when the `Future`'s computation is complete or, if the computation is already complete, immediately.

 <p>There is no guaranteed ordering of execution of listeners, but any listener added through
 this method is guaranteed to be called once the computation is complete.

 <p>Exceptions thrown by a listener will be propagated up to the executor. Any exception thrown
 during `Executor.execute` (e.g., a `RejectedExecutionException` or an exception
 thrown by direct execution) will be caught and
 logged.

 <p>Note: If your listener is lightweight -- and will not cause stack overflow by completing
 more futures or adding more `directExecutor()` listeners inline -- consider `MoreExecutors.directExecutor`. Otherwise, avoid it: See the warnings on the docs for `directExecutor`.

 <p>This is the most general listener interface. For common operations performed using
 listeners, see `Futures`. For a simplified but general listener interface, see `Futures.addCallback addCallback()`.

 <p>Memory consistency effects: Actions in a thread prior to adding a listener <a href="https://docs.oracle.com/javase/specs/jls/se7/html/jls-17.html#jls-17.4.5">
 <i>happen-before</i></a> its execution begins, perhaps in another thread.

 <p>Guava implementations of `ListenableFuture` promptly release references to listeners
 after executing them.
@param listener the listener to run when the computation is complete
@param executor the executor to run the listener in
@throws RejectedExecutionException if we tried to execute the listener immediately but the
     executor rejected it.

