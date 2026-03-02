# Class: `FluentFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.FluentFuture`

**Extends:** [`com.google.common.util.concurrent.GwtFluentFutureCatchingSpecialization<V>`](./GwtFluentFutureCatchingSpecialization.md)

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

For example:

 

```

 ListenableFuture<Boolean> adminIsLoggedIn =
     FluentFuture.from(usersDatabase.getAdminUser())
         .transform(User::getId, directExecutor())
         .transform(ActivityService::isLoggedIn, threadPool)
         .catching(RpcException.class, e -> false, directExecutor());
 
```


 Alternatives

 Frameworks

 
When chaining together a graph of asynchronous operations, you will often find it easier to
 use a framework. Frameworks automate the process, often adding features like monitoring,
 debugging, and cancellation. Examples of frameworks include:

 

   - [Dagger Producers](https://dagger.dev/producers.html)
 


 java.util.concurrent.CompletableFuture / java.util.concurrent.CompletionStage
 

 
Users of CompletableFuture will likely want to continue using 
 CompletableFuture. FluentFuture is targeted at people who use ListenableFuture,
 who can't use Java 8, or who want an API more focused than CompletableFuture. (If you
 need to adapt between CompletableFuture and ListenableFuture, consider [Future Converter](https://github.com/lukas-krecan/future-converter).)

 Extension

 If you want a class like FluentFuture but with extra methods, we recommend declaring your
 own subclass of ListenableFuture, complete with a method like #from to adapt an
 existing ListenableFuture, implemented atop a ForwardingListenableFuture that
 forwards to that future and adds the desired methods.

## Constructors

### `<init>()`

## Methods

### `from(ListenableFuture<V> future)`

If the given ListenableFuture is already a FluentFuture, it is returned
 directly. If not, it is wrapped in a FluentFuture that delegates all calls to the
 original ListenableFuture.

**Parameters:**
- `future` ([`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md))

**Returns:** [`com.google.common.util.concurrent.FluentFuture<V>`](./FluentFuture.md)

### `from(FluentFuture<V> future)`

**Parameters:**
- `future` ([`com.google.common.util.concurrent.FluentFuture<V>`](./FluentFuture.md))

**Returns:** [`com.google.common.util.concurrent.FluentFuture<V>`](./FluentFuture.md)

### `catching(Class<X> exceptionType, Function<? super X,? extends V> fallback, Executor executor)`

Function#apply is not invoked until the primary input has failed, so if the
 primary input succeeds, it is never invoked. If, during the invocation of fallback, an
 exception is thrown, this exception is used as the result of the output Future.

 
Usage example:

 

```

 // Falling back to a zero counter in case an exception happens when processing the RPC to fetch
 // counters.
 ListenableFuture<Integer> faultTolerantFuture =
     fetchCounters().catching(FetchException.class, x -> 0, directExecutor());
 
```


 
When selecting an executor, note that directExecutor is dangerous in some cases. See
 the discussion in the #addListener documentation. All its warnings about heavyweight
 listeners are also applicable to heavyweight functions passed to this method.

 
This method is similar to java.util.concurrent.CompletableFuture#exceptionally. It
 can also serve some of the use cases of java.util.concurrent.CompletableFuture#handle
 and java.util.concurrent.CompletableFuture#handleAsync when used along with #transform.

**Parameters:**
- `exceptionType` (`java.lang.Class<X>`): the exception type that triggers use of fallback. The exception
       type is matched against the input's exception. "The input's exception" means the cause of
       the ExecutionException thrown by input.get() or, if get() throws a
       different kind of exception, that exception itself. To avoid hiding bugs and other
       unrecoverable errors, callers should prefer more specific types, avoiding 
       Throwable.class in particular.
- `fallback` ([`com.google.common.base.Function<? super X,? extends V>`](../../base/Function.md)): the Function to be called if the input fails with the expected
       exception type. The function's argument is the input's exception. "The input's exception"
       means the cause of the ExecutionException thrown by this.get() or, if
       get() throws a different kind of exception, that exception itself.
- `executor` (`java.util.concurrent.Executor`): the executor that runs fallback if the input fails

**Returns:** [`com.google.common.util.concurrent.FluentFuture<V>`](./FluentFuture.md)

### `catchingAsync(Class<X> exceptionType, AsyncFunction<? super X,? extends V> fallback, Executor executor)`

AsyncFunction#apply is not invoked until the primary input has failed, so if
 the primary input succeeds, it is never invoked. If, during the invocation of fallback,
 an exception is thrown, this exception is used as the result of the output Future.

 
Usage examples:

 

```

 // Falling back to a zero counter in case an exception happens when processing the RPC to fetch
 // counters.
 ListenableFuture<Integer> faultTolerantFuture =
     fetchCounters().catchingAsync(
         FetchException.class, x -> immediateFuture(0), directExecutor());
 
```


 
The fallback can also choose to propagate the original exception when desired:

 

```

 // Falling back to a zero counter only in case the exception was a
 // TimeoutException.
 ListenableFuture<Integer> faultTolerantFuture =
     fetchCounters().catchingAsync(
         FetchException.class,
         e -> {
           if (omitDataOnFetchFailure) {
             return immediateFuture(0);
           }
           throw e;
         },
         directExecutor());
 
```


 
When selecting an executor, note that directExecutor is dangerous in some cases. See
 the discussion in the #addListener documentation. All its warnings about heavyweight
 listeners are also applicable to heavyweight functions passed to this method. (Specifically,
 directExecutor functions should avoid heavyweight operations inside 
 AsyncFunction.apply. Any heavyweight operations should occur in other threads responsible for
 completing the returned Future.)

 
This method is similar to java.util.concurrent.CompletableFuture#exceptionally. It
 can also serve some of the use cases of java.util.concurrent.CompletableFuture#handle
 and java.util.concurrent.CompletableFuture#handleAsync when used along with #transform.

**Parameters:**
- `exceptionType` (`java.lang.Class<X>`): the exception type that triggers use of fallback. The exception
       type is matched against the input's exception. "The input's exception" means the cause of
       the ExecutionException thrown by this.get() or, if get() throws a
       different kind of exception, that exception itself. To avoid hiding bugs and other
       unrecoverable errors, callers should prefer more specific types, avoiding 
       Throwable.class in particular.
- `fallback` ([`com.google.common.util.concurrent.AsyncFunction<? super X,? extends V>`](./AsyncFunction.md)): the AsyncFunction to be called if the input fails with the expected
       exception type. The function's argument is the input's exception. "The input's exception"
       means the cause of the ExecutionException thrown by input.get() or, if
       get() throws a different kind of exception, that exception itself.
- `executor` (`java.util.concurrent.Executor`): the executor that runs fallback if the input fails

**Returns:** [`com.google.common.util.concurrent.FluentFuture<V>`](./FluentFuture.md)

### `withTimeout(Duration timeout, ScheduledExecutorService scheduledExecutor)`

If the timeout expires, not only will the output future finish, but also the input future
 (this) will be cancelled and interrupted.

**Parameters:**
- `timeout` (`java.time.Duration`): when to time out the future
- `scheduledExecutor` (`java.util.concurrent.ScheduledExecutorService`): The executor service to enforce the timeout.

**Returns:** [`com.google.common.util.concurrent.FluentFuture<V>`](./FluentFuture.md)

### `withTimeout(long timeout, TimeUnit unit, ScheduledExecutorService scheduledExecutor)`

If the timeout expires, not only will the output future finish, but also the input future
 (this) will be cancelled and interrupted.

**Parameters:**
- `timeout` (`long`): when to time out the future
- `unit` (`java.util.concurrent.TimeUnit`): the time unit of the time parameter
- `scheduledExecutor` (`java.util.concurrent.ScheduledExecutorService`): The executor service to enforce the timeout.

**Returns:** [`com.google.common.util.concurrent.FluentFuture<V>`](./FluentFuture.md)

### `transformAsync(AsyncFunction<? super V,T> function, Executor executor)`

If the input Future fails, the returned Future fails with the
 same exception (and the function is not invoked).

 
More precisely, the returned Future takes its result from a Future produced
 by applying the given AsyncFunction to the result of the original Future.
 Example usage:

 

```

 FluentFuture<RowKey> rowKeyFuture = FluentFuture.from(indexService.lookUp(query));
 ListenableFuture<QueryResult> queryFuture =
     rowKeyFuture.transformAsync(dataService::readFuture, executor);
 
```


 
When selecting an executor, note that directExecutor is dangerous in some cases. See
 the discussion in the #addListener documentation. All its warnings about heavyweight
 listeners are also applicable to heavyweight functions passed to this method. (Specifically,
 directExecutor functions should avoid heavyweight operations inside 
 AsyncFunction.apply. Any heavyweight operations should occur in other threads responsible for
 completing the returned Future.)

 
The returned Future attempts to keep its cancellation state in sync with that of the
 input future and that of the future returned by the chain function. That is, if the returned
 Future is cancelled, it will attempt to cancel the other two, and if either of the
 other two is cancelled, the returned Future will receive a callback in which it will
 attempt to cancel itself.

 
This method is similar to java.util.concurrent.CompletableFuture#thenCompose and
 java.util.concurrent.CompletableFuture#thenComposeAsync. It can also serve some of the
 use cases of java.util.concurrent.CompletableFuture#handle and java.util.concurrent.CompletableFuture#handleAsync when used along with #catching.

**Parameters:**
- `function` ([`com.google.common.util.concurrent.AsyncFunction<? super V,T>`](./AsyncFunction.md)): A function to transform the result of this future to the result of the output
       future
- `executor` (`java.util.concurrent.Executor`): Executor to run the function in.

**Returns:** [`com.google.common.util.concurrent.FluentFuture<T>`](./FluentFuture.md)

### `transform(Function<? super V,T> function, Executor executor)`

If
 this input Future fails, the returned Future fails with the same exception (and
 the function is not invoked). Example usage:

 

```

 ListenableFuture<List<Row>> rowsFuture =
     queryFuture.transform(QueryResult::getRows, executor);
 
```


 
When selecting an executor, note that directExecutor is dangerous in some cases. See
 the discussion in the #addListener documentation. All its warnings about heavyweight
 listeners are also applicable to heavyweight functions passed to this method.

 
The returned Future attempts to keep its cancellation state in sync with that of the
 input future. That is, if the returned Future is cancelled, it will attempt to cancel
 the input, and if the input is cancelled, the returned Future will receive a callback
 in which it will attempt to cancel itself.

 
An example use of this method is to convert a serializable object returned from an RPC into
 a POJO.

 
This method is similar to java.util.concurrent.CompletableFuture#thenApply and
 java.util.concurrent.CompletableFuture#thenApplyAsync. It can also serve some of the
 use cases of java.util.concurrent.CompletableFuture#handle and java.util.concurrent.CompletableFuture#handleAsync when used along with #catching.

**Parameters:**
- `function` ([`com.google.common.base.Function<? super V,T>`](../../base/Function.md)): A Function to transform the results of this future to the results of the
       returned future.
- `executor` (`java.util.concurrent.Executor`): Executor to run the function in.

**Returns:** [`com.google.common.util.concurrent.FluentFuture<T>`](./FluentFuture.md)

### `addCallback(FutureCallback<? super V> callback, Executor executor)`

The callback is run on executor. There is no guaranteed ordering of execution of
 callbacks, but any callback added through this method is guaranteed to be called once the
 computation is complete.

 
Example:

 

```

 future.addCallback(
     new FutureCallback<QueryResult>() {
       public void onSuccess(QueryResult result) {
         storeInCache(result);
       }
       public void onFailure(Throwable t) {
         reportError(t);
       }
     }, executor);
 
```


 
When selecting an executor, note that directExecutor is dangerous in some cases. See
 the discussion in the #addListener documentation. All its warnings about heavyweight
 listeners are also applicable to heavyweight callbacks passed to this method.

 
For a more general interface to attach a completion listener, see #addListener.

 
This method is similar to java.util.concurrent.CompletableFuture#whenComplete and
 java.util.concurrent.CompletableFuture#whenCompleteAsync. It also serves the use case
 of java.util.concurrent.CompletableFuture#thenAccept and java.util.concurrent.CompletableFuture#thenAcceptAsync.

**Parameters:**
- `callback` ([`com.google.common.util.concurrent.FutureCallback<? super V>`](./FutureCallback.md)): The callback to invoke when this Future is completed.
- `executor` (`java.util.concurrent.Executor`): The executor to run callback when the future completes.

**Returns:** `void`

