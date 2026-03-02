# Interface: `ListenableFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ListenableFuture`

**Extends:** `java.util.concurrent.Future<V>`

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Each listener has an associated executor, and
 it is invoked using this executor once the future's computation is complete. If the computation has already completed when the listener is added, the listener will
 execute immediately.

 
See the Guava User Guide article on [
 ListenableFuture](https://github.com/google/guava/wiki/ListenableFutureExplained).

 
This class is GWT-compatible.

 Purpose

 
The main purpose of ListenableFuture is to help you chain together a graph of
 asynchronous operations. You can chain them together manually with calls to methods like Futures.transform
 (or FluentFuture.transform), but you will often find it easier to use a framework. Frameworks
 automate the process, often adding features like monitoring, debugging, and cancellation.
 Examples of frameworks include:

 

   - [Dagger Producers](https://dagger.dev/producers.html)
 


 
The main purpose of addListener is to support this chaining. You will
 rarely use it directly, in part because it does not provide direct access to the Future
 result. (If you want such access, you may prefer Futures.addCallback.) Still, direct addListener calls are occasionally useful:

 

```

 final String name = ...;
 inFlight.add(name);
 ListenableFuture<Result> future = service.query(name);
 future.addListener(new Runnable() {
   public void run() {
     processedCount.incrementAndGet();
     inFlight.remove(name);
     lastProcessed.set(name);
     logger.info("Done with {0}", name);
   }
 }, executor);
 
```


 How to get an instance

 
We encourage you to return ListenableFuture from your methods so that your users can
 take advantage of the utilities built atop the class. The way that you will
 create ListenableFuture instances depends on how you currently create Future
 instances:

 

   - If you receive them from an java.util.concurrent.ExecutorService, convert that
       service to a ListeningExecutorService, usually by calling MoreExecutors.listeningDecorator.
   - If you manually call java.util.concurrent.FutureTask#set or a similar method,
       create a SettableFuture instead. (If your needs are more complex, you may prefer
       AbstractFuture.)
 


 
**Test doubles**: If you need a ListenableFuture for your test, try a SettableFuture or one of the methods in the Futures.immediate*
 family. **Avoid** creating a mock or stub Future. Mock and stub implementations are
 fragile because they assume that only certain methods will be called and because they often
 implement subtleties of the API improperly.

 
**Custom implementation**: Avoid implementing ListenableFuture from scratch. If you
 can't get by with the standard implementations, prefer to derive a new Future instance
 with the methods in Futures or, if necessary, to extend AbstractFuture.

 
Occasionally, an API will return a plain Future and it will be impossible to change
 the return type. For this case, we provide a more expensive workaround in 
 JdkFutureAdapters. However, when possible, it is more efficient and reliable to create a 
 ListenableFuture directly.

## Methods

### `addListener(Runnable listener, Executor executor)`

The listener will run when the Future's computation is complete or, if the computation is already complete, immediately.

 
There is no guaranteed ordering of execution of listeners, but any listener added through
 this method is guaranteed to be called once the computation is complete.

 
Exceptions thrown by a listener will be propagated up to the executor. Any exception thrown
 during Executor.execute (e.g., a RejectedExecutionException or an exception
 thrown by direct execution) will be caught and
 logged.

 
Note: If your listener is lightweight -- and will not cause stack overflow by completing
 more futures or adding more directExecutor() listeners inline -- consider MoreExecutors#directExecutor. Otherwise, avoid it: See the warnings on the docs for 
 directExecutor.

 
This is the most general listener interface. For common operations performed using
 listeners, see Futures. For a simplified but general listener interface, see addCallback().

 
Memory consistency effects: Actions in a thread prior to adding a listener [
 *happen-before*](https://docs.oracle.com/javase/specs/jls/se7/html/jls-17.html#jls-17.4.5) its execution begins, perhaps in another thread.

 
Guava implementations of ListenableFuture promptly release references to listeners
 after executing them.

**Parameters:**
- `listener` (`java.lang.Runnable`): the listener to run when the computation is complete
- `executor` (`java.util.concurrent.Executor`): the executor to run the listener in

**Returns:** `void`

