# Class: `Futures`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Futures`

**Extends:** [`com.google.common.util.concurrent.GwtFuturesCatchingSpecialization`](./GwtFuturesCatchingSpecialization.md)

## Description

Many of these methods use the ListenableFuture API; consult the Guava User Guide
 article on [
 ListenableFuture](https://github.com/google/guava/wiki/ListenableFutureExplained).

 
The main purpose of ListenableFuture is to help you chain together a graph of
 asynchronous operations. You can chain them together manually with calls to methods like Futures.transform, but you will often
 find it easier to use a framework. Frameworks automate the process, often adding features like
 monitoring, debugging, and cancellation. Examples of frameworks include:

 

   - [Dagger Producers](https://dagger.dev/producers.html)
 


 
If you do chain your operations manually, you may want to use FluentFuture.

## Constructors

### `<init>()`

## Methods

### `immediateFuture(V value)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

The
 getters just return the value. This Future can't be canceled or timed out and its
 isDone() method always returns true.

**Parameters:**
- `value` (`V`)

### `immediateVoidFuture()`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Void>`](./ListenableFuture.md)

This method is equivalent to 
 immediateFuture(null) except that it is restricted to produce futures of type Void.

### `immediateFailedFuture(java.lang.Throwable throwable)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

The returned Future can't be cancelled, and its isDone() method always
 returns true. Calling get() will immediately throw the provided 
 Throwable wrapped in an ExecutionException.

**Parameters:**
- `throwable` (`java.lang.Throwable`)

### `immediateCancelledFuture()`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

### `submit(java.util.concurrent.Callable<O> callable, java.util.concurrent.Executor executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<O>`](./ListenableFuture.md)

**Parameters:**
- `callable` (`java.util.concurrent.Callable<O>`)
- `executor` (`java.util.concurrent.Executor`)

### `submit(java.lang.Runnable runnable, java.util.concurrent.Executor executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Void>`](./ListenableFuture.md)

**Parameters:**
- `runnable` (`java.lang.Runnable`)
- `executor` (`java.util.concurrent.Executor`)

### `submitAsync(com.google.common.util.concurrent.AsyncCallable<O> callable, java.util.concurrent.Executor executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<O>`](./ListenableFuture.md)

**Parameters:**
- `callable` ([`com.google.common.util.concurrent.AsyncCallable<O>`](./AsyncCallable.md))
- `executor` (`java.util.concurrent.Executor`)

### `scheduleAsync(com.google.common.util.concurrent.AsyncCallable<O> callable, java.time.Duration delay, java.util.concurrent.ScheduledExecutorService executorService)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<O>`](./ListenableFuture.md)

**Parameters:**
- `callable` ([`com.google.common.util.concurrent.AsyncCallable<O>`](./AsyncCallable.md))
- `delay` (`java.time.Duration`)
- `executorService` (`java.util.concurrent.ScheduledExecutorService`)

### `scheduleAsync(com.google.common.util.concurrent.AsyncCallable<O> callable, long delay, java.util.concurrent.TimeUnit timeUnit, java.util.concurrent.ScheduledExecutorService executorService)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<O>`](./ListenableFuture.md)

**Parameters:**
- `callable` ([`com.google.common.util.concurrent.AsyncCallable<O>`](./AsyncCallable.md))
- `delay` (`long`)
- `timeUnit` (`java.util.concurrent.TimeUnit`)
- `executorService` (`java.util.concurrent.ScheduledExecutorService`)

### `catching(com.google.common.util.concurrent.ListenableFuture<? extends V> input, java.lang.Class<X> exceptionType, com.google.common.base.Function<? super X,? extends V> fallback, java.util.concurrent.Executor executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

Function#apply is not invoked until the primary input has failed, so
 if the primary input succeeds, it is never invoked. If, during the invocation of 
 fallback, an exception is thrown, this exception is used as the result of the output 
 Future.

 
Usage example:

 

```

 ListenableFuture<Integer> fetchCounterFuture = ...;

 // Falling back to a zero counter in case an exception happens when
 // processing the RPC to fetch counters.
 ListenableFuture<Integer> faultTolerantFuture = Futures.catching(
     fetchCounterFuture, FetchException.class, x -> 0, directExecutor());
 
```


 
When selecting an executor, note that directExecutor is dangerous in some cases. See
 the warnings the MoreExecutors#directExecutor documentation.

**Parameters:**
- `input` ([`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md)): the primary input Future
- `exceptionType` (`java.lang.Class<X>`): the exception type that triggers use of fallback. The exception
     type is matched against the input's exception. "The input's exception" means the cause of
     the ExecutionException thrown by input.get() or, if get() throws a
     different kind of exception, that exception itself. To avoid hiding bugs and other
     unrecoverable errors, callers should prefer more specific types, avoiding 
     Throwable.class in particular.
- `fallback` ([`com.google.common.base.Function<? super X,? extends V>`](../../base/Function.md)): the Function to be called if input fails with the expected
     exception type. The function's argument is the input's exception. "The input's exception"
     means the cause of the ExecutionException thrown by input.get() or, if
     get() throws a different kind of exception, that exception itself.
- `executor` (`java.util.concurrent.Executor`): the executor that runs fallback if input fails

### `catchingAsync(com.google.common.util.concurrent.ListenableFuture<? extends V> input, java.lang.Class<X> exceptionType, com.google.common.util.concurrent.AsyncFunction<? super X,? extends V> fallback, java.util.concurrent.Executor executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

AsyncFunction#apply is not invoked until the primary input has
 failed, so if the primary input succeeds, it is never invoked. If, during the invocation of
 fallback, an exception is thrown, this exception is used as the result of the output
 Future.

 
Usage examples:

 

```

 ListenableFuture<Integer> fetchCounterFuture = ...;

 // Falling back to a zero counter in case an exception happens when
 // processing the RPC to fetch counters.
 ListenableFuture<Integer> faultTolerantFuture = Futures.catchingAsync(
     fetchCounterFuture, FetchException.class, x -> immediateFuture(0), directExecutor());
 
```


 
The fallback can also choose to propagate the original exception when desired:

 

```

 ListenableFuture<Integer> fetchCounterFuture = ...;

 // Falling back to a zero counter only in case the exception was a
 // TimeoutException.
 ListenableFuture<Integer> faultTolerantFuture = Futures.catchingAsync(
     fetchCounterFuture,
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
 the warnings the MoreExecutors#directExecutor documentation.

**Parameters:**
- `input` ([`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md)): the primary input Future
- `exceptionType` (`java.lang.Class<X>`): the exception type that triggers use of fallback. The exception
     type is matched against the input's exception. "The input's exception" means the cause of
     the ExecutionException thrown by input.get() or, if get() throws a
     different kind of exception, that exception itself. To avoid hiding bugs and other
     unrecoverable errors, callers should prefer more specific types, avoiding 
     Throwable.class in particular.
- `fallback` ([`com.google.common.util.concurrent.AsyncFunction<? super X,? extends V>`](./AsyncFunction.md)): the AsyncFunction to be called if input fails with the expected
     exception type. The function's argument is the input's exception. "The input's exception"
     means the cause of the ExecutionException thrown by input.get() or, if
     get() throws a different kind of exception, that exception itself.
- `executor` (`java.util.concurrent.Executor`): the executor that runs fallback if input fails

### `withTimeout(com.google.common.util.concurrent.ListenableFuture<V> delegate, java.time.Duration time, java.util.concurrent.ScheduledExecutorService scheduledExecutor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

The delegate future is interrupted and cancelled if it times out.

**Parameters:**
- `delegate` ([`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)): The future to delegate to.
- `time` (`java.time.Duration`): when to time out the future
- `scheduledExecutor` (`java.util.concurrent.ScheduledExecutorService`): The executor service to enforce the timeout.

### `withTimeout(com.google.common.util.concurrent.ListenableFuture<V> delegate, long time, java.util.concurrent.TimeUnit unit, java.util.concurrent.ScheduledExecutorService scheduledExecutor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

The delegate future is interrupted and cancelled if it times out.

**Parameters:**
- `delegate` ([`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)): The future to delegate to.
- `time` (`long`): when to time out the future
- `unit` (`java.util.concurrent.TimeUnit`): the time unit of the time parameter
- `scheduledExecutor` (`java.util.concurrent.ScheduledExecutorService`): The executor service to enforce the timeout.

### `transformAsync(com.google.common.util.concurrent.ListenableFuture<I> input, com.google.common.util.concurrent.AsyncFunction<? super I,? extends O> function, java.util.concurrent.Executor executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<O>`](./ListenableFuture.md)

If the given Future fails, the returned Future fails with
 the same exception (and the function is not invoked).

 
More precisely, the returned Future takes its result from a Future produced
 by applying the given AsyncFunction to the result of the original Future.
 Example usage:

 

```

 ListenableFuture<RowKey> rowKeyFuture = indexService.lookUp(query);
 ListenableFuture<QueryResult> queryFuture =
     transformAsync(rowKeyFuture, dataService::readFuture, executor);
 
```


 
When selecting an executor, note that directExecutor is dangerous in some cases. See
 the warnings the MoreExecutors#directExecutor documentation.

 
The returned Future attempts to keep its cancellation state in sync with that of the
 input future and that of the future returned by the chain function. That is, if the returned
 Future is cancelled, it will attempt to cancel the other two, and if either of the
 other two is cancelled, the returned Future will receive a callback in which it will
 attempt to cancel itself.

**Parameters:**
- `input` ([`com.google.common.util.concurrent.ListenableFuture<I>`](./ListenableFuture.md)): The future to transform
- `function` ([`com.google.common.util.concurrent.AsyncFunction<? super I,? extends O>`](./AsyncFunction.md)): A function to transform the result of the input future to the result of the
     output future
- `executor` (`java.util.concurrent.Executor`): Executor to run the function in.

### `transform(com.google.common.util.concurrent.ListenableFuture<I> input, com.google.common.base.Function<? super I,? extends O> function, java.util.concurrent.Executor executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<O>`](./ListenableFuture.md)

If input fails, the returned Future fails with the same exception (and
 the function is not invoked). Example usage:

 

```

 ListenableFuture<QueryResult> queryFuture = ...;
 ListenableFuture<List<Row>> rowsFuture =
     transform(queryFuture, QueryResult::getRows, executor);
 
```


 
When selecting an executor, note that directExecutor is dangerous in some cases. See
 the warnings the MoreExecutors#directExecutor documentation.

 
The returned Future attempts to keep its cancellation state in sync with that of the
 input future. That is, if the returned Future is cancelled, it will attempt to cancel
 the input, and if the input is cancelled, the returned Future will receive a callback
 in which it will attempt to cancel itself.

 
An example use of this method is to convert a serializable object returned from an RPC into
 a POJO.

**Parameters:**
- `input` ([`com.google.common.util.concurrent.ListenableFuture<I>`](./ListenableFuture.md)): The future to transform
- `function` ([`com.google.common.base.Function<? super I,? extends O>`](../../base/Function.md)): A Function to transform the results of the provided future to the results of
     the returned future.
- `executor` (`java.util.concurrent.Executor`): Executor to run the function in.

### `lazyTransform(java.util.concurrent.Future<I> input, com.google.common.base.Function<? super I,? extends O> function)`

**Returns:** `java.util.concurrent.Future<O>`

The returned Future reflects the input's cancellation state directly, and any
 attempt to cancel the returned Future is likewise passed through to the input Future.

 
Note that calls to timed get only apply the timeout
 to the execution of the underlying Future, *not* to the execution of the
 transformation function.

 
The primary audience of this method is callers of transform who don't have a 
 ListenableFuture available and do not mind repeated, lazy function evaluation.

**Parameters:**
- `input` (`java.util.concurrent.Future<I>`): The future to transform
- `function` ([`com.google.common.base.Function<? super I,? extends O>`](../../base/Function.md)): A Function to transform the results of the provided future to the results of
     the returned future.

### `allAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>[] futures)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<java.util.List<V>>`](./ListenableFuture.md)

The list of results is in the same order as the input list.

 
This differs from #successfulAsList(ListenableFuture[]) in that it will return a
 failed future if any of the items fails.

 
Canceling this future will attempt to cancel all the component futures, and if any of the
 provided futures fails or is canceled, this one is, too.

**Parameters:**
- `futures` ([`com.google.common.util.concurrent.ListenableFuture<? extends V>[]`](./ListenableFuture.md)): futures to combine

### `allAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> futures)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<java.util.List<V>>`](./ListenableFuture.md)

The list of results is in the same order as the input list.

 
This differs from #successfulAsList(Iterable) in that it will return a failed future
 if any of the items fails.

 
Canceling this future will attempt to cancel all the component futures, and if any of the
 provided futures fails or is canceled, this one is, too.

**Parameters:**
- `futures` (`java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>`): futures to combine

### `whenAllComplete(com.google.common.util.concurrent.ListenableFuture<? extends V>[] futures)`

**Returns:** `com.google.common.util.concurrent.Futures.FutureCombiner<V>`

Any failures from the input futures will not be propagated to the returned future.

**Parameters:**
- `futures` ([`com.google.common.util.concurrent.ListenableFuture<? extends V>[]`](./ListenableFuture.md))

### `whenAllComplete(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> futures)`

**Returns:** `com.google.common.util.concurrent.Futures.FutureCombiner<V>`

Any failures from the input futures will not be propagated to the returned future.

**Parameters:**
- `futures` (`java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>`)

### `whenAllSucceed(com.google.common.util.concurrent.ListenableFuture<? extends V>[] futures)`

**Returns:** `com.google.common.util.concurrent.Futures.FutureCombiner<V>`

If any input fails, the returned future fails immediately.

**Parameters:**
- `futures` ([`com.google.common.util.concurrent.ListenableFuture<? extends V>[]`](./ListenableFuture.md))

### `whenAllSucceed(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> futures)`

**Returns:** `com.google.common.util.concurrent.Futures.FutureCombiner<V>`

If any input fails, the returned future fails immediately.

**Parameters:**
- `futures` (`java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>`)

### `nonCancellationPropagating(com.google.common.util.concurrent.ListenableFuture<V> future)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

Cancelling the supplied future will also cancel the returned future, but cancelling
 the returned future will have no effect on the supplied future.

**Parameters:**
- `future` ([`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md))

### `successfulAsList(com.google.common.util.concurrent.ListenableFuture<? extends V>[] futures)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<java.util.List<@org.checkerframework.checker.nullness.qual.Nullable V>>`](./ListenableFuture.md)

The list of results is in the same order as the input list, and if
 any of the provided futures fails or is canceled, its corresponding position will contain
 null (which is indistinguishable from the future having a successful value of 
 null).

 
The list of results is in the same order as the input list.

 
This differs from #allAsList(ListenableFuture[]) in that it's tolerant of failed
 futures for any of the items, representing them as null in the result list.

 
Canceling this future will attempt to cancel all the component futures.

**Parameters:**
- `futures` ([`com.google.common.util.concurrent.ListenableFuture<? extends V>[]`](./ListenableFuture.md)): futures to combine

### `successfulAsList(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>> futures)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<java.util.List<@org.checkerframework.checker.nullness.qual.Nullable V>>`](./ListenableFuture.md)

The list of results is in the same order as the input list, and if
 any of the provided futures fails or is canceled, its corresponding position will contain
 null (which is indistinguishable from the future having a successful value of 
 null).

 
The list of results is in the same order as the input list.

 
This differs from #allAsList(Iterable) in that it's tolerant of failed futures for
 any of the items, representing them as null in the result list.

 
Canceling this future will attempt to cancel all the component futures.

**Parameters:**
- `futures` (`java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>`): futures to combine

### `inCompletionOrder(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends T>> futures)`

**Returns:** [`com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ListenableFuture<T>>`](../../collect/ImmutableList.md)

Delegate futures return the same value or throw the same exception as the
 corresponding input future returns/throws.

 
"In the order that they complete" means, for practical purposes, about what you would
 expect, but there are some subtleties. First, we do guarantee that, if the output future at
 index n is done, the output future at index n-1 is also done. (But as usual with futures, some
 listeners for future n may complete before some for future n-1.) However, it is possible, if
 one input completes with result X and another later with result Y, for Y to come before X in
 the output future list. (Such races are impossible to solve without global synchronization of
 all future completions. And they should have little practical impact.)

 
Cancelling a delegate future propagates to input futures once all the delegates complete,
 either from cancellation or because an input future has completed. If N futures are passed in,
 and M delegates are cancelled, the remaining M input futures will be cancelled once N - M of
 the input futures complete. If all the delegates are cancelled, all the input futures will be
 too.

**Parameters:**
- `futures` (`java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends T>>`)

### `gwtCompatibleToArray(java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends T>> futures)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<? extends T>[]`](./ListenableFuture.md)

**Parameters:**
- `futures` (`java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends T>>`)

### `addCallback(com.google.common.util.concurrent.ListenableFuture<V> future, com.google.common.util.concurrent.FutureCallback<? super V> callback, java.util.concurrent.Executor executor)`

**Returns:** `void`

The callback is run on executor. There is no guaranteed ordering of execution of
 callbacks, but any callback added through this method is guaranteed to be called once the
 computation is complete.

 
Exceptions thrown by a callback will be propagated up to the executor. Any exception
 thrown during Executor.execute (e.g., a RejectedExecutionException or an
 exception thrown by direct execution) will be caught
 and logged.

 
Example:

 

```

 ListenableFuture<QueryResult> future = ...;
 Executor e = ...
 addCallback(future,
     new FutureCallback<QueryResult>() {
       public void onSuccess(QueryResult result) {
         storeInCache(result);
       }
       public void onFailure(Throwable t) {
         reportError(t);
       }
     }, e);
 
```


 
When selecting an executor, note that directExecutor is dangerous in some cases. See
 the warnings the MoreExecutors#directExecutor documentation.

 
For a more general interface to attach a completion listener to a Future, see addListener.

**Parameters:**
- `future` ([`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)): The future attach the callback to.
- `callback` ([`com.google.common.util.concurrent.FutureCallback<? super V>`](./FutureCallback.md)): The callback to invoke when future is completed.
- `executor` (`java.util.concurrent.Executor`): The executor to run callback when the future completes.

### `getDone(java.util.concurrent.Future<V> future)`

**Returns:** `V`

The benefits of this method are twofold. First, the name "getDone" suggests to readers that
 the Future is already done. Second, if buggy code calls getDone on a 
 Future that is still pending, the program will throw instead of block. This can be important
 for APIs like whenAllComplete(...).call(...), where it is easy to use a new input from
 the call implementation but forget to add it to the arguments of 
 whenAllComplete.

 
If you are looking for a method to determine whether a given Future is done, use the
 instance method Future#isDone().

**Parameters:**
- `future` (`java.util.concurrent.Future<V>`)

### `getChecked(java.util.concurrent.Future<V> future, java.lang.Class<X> exceptionClass)`

**Returns:** `V`

This reduces boilerplate for a common use of Future in
 which it is unnecessary to programmatically distinguish between exception types or to extract
 other information from the exception instance.

 
Exceptions from Future.get are treated as follows:

 

   - Any ExecutionException has its *cause* wrapped in an X if the cause
       is a checked exception, an UncheckedExecutionException if the cause is a 
       RuntimeException, or an ExecutionError if the cause is an Error.
   - Any InterruptedException is wrapped in an X (after restoring the
       interrupt).
   - Any CancellationException is propagated untouched, as is any other RuntimeException (though get implementations are discouraged from throwing such
       exceptions).
 


 
The overall principle is to continue to treat every checked exception as a checked
 exception, every unchecked exception as an unchecked exception, and every error as an error. In
 addition, the cause of any ExecutionException is wrapped in order to ensure that the
 new stack trace matches that of the current thread.

 
Instances of exceptionClass are created by choosing an arbitrary public constructor
 that accepts zero or more arguments, all of type String or Throwable
 (preferring constructors with at least one String, then preferring constructors with at
 least one Throwable) and calling the constructor via reflection. If the exception did
 not already have a cause, one is set by calling Throwable#initCause(Throwable) on it.
 If no such constructor exists, an IllegalArgumentException is thrown.

**Parameters:**
- `future` (`java.util.concurrent.Future<V>`)
- `exceptionClass` (`java.lang.Class<X>`)

### `getChecked(java.util.concurrent.Future<V> future, java.lang.Class<X> exceptionClass, java.time.Duration timeout)`

**Returns:** `V`

This reduces boilerplate for a common use of
 Future in which it is unnecessary to programmatically distinguish between exception
 types or to extract other information from the exception instance.

 
Exceptions from Future.get are treated as follows:

 

   - Any ExecutionException has its *cause* wrapped in an X if the cause
       is a checked exception, an UncheckedExecutionException if the cause is a 
       RuntimeException, or an ExecutionError if the cause is an Error.
   - Any InterruptedException is wrapped in an X (after restoring the
       interrupt).
   - Any TimeoutException is wrapped in an X.
   - Any CancellationException is propagated untouched, as is any other RuntimeException (though get implementations are discouraged from throwing such
       exceptions).
 


 
The overall principle is to continue to treat every checked exception as a checked
 exception, every unchecked exception as an unchecked exception, and every error as an error. In
 addition, the cause of any ExecutionException is wrapped in order to ensure that the
 new stack trace matches that of the current thread.

 
Instances of exceptionClass are created by choosing an arbitrary public constructor
 that accepts zero or more arguments, all of type String or Throwable
 (preferring constructors with at least one String, then preferring constructors with at
 least one Throwable) and calling the constructor via reflection. If the exception did
 not already have a cause, one is set by calling Throwable#initCause(Throwable) on it.
 If no such constructor exists, an IllegalArgumentException is thrown.

**Parameters:**
- `future` (`java.util.concurrent.Future<V>`)
- `exceptionClass` (`java.lang.Class<X>`)
- `timeout` (`java.time.Duration`)

### `getChecked(java.util.concurrent.Future<V> future, java.lang.Class<X> exceptionClass, long timeout, java.util.concurrent.TimeUnit unit)`

**Returns:** `V`

This reduces boilerplate for a common use of
 Future in which it is unnecessary to programmatically distinguish between exception
 types or to extract other information from the exception instance.

 
Exceptions from Future.get are treated as follows:

 

   - Any ExecutionException has its *cause* wrapped in an X if the cause
       is a checked exception, an UncheckedExecutionException if the cause is a 
       RuntimeException, or an ExecutionError if the cause is an Error.
   - Any InterruptedException is wrapped in an X (after restoring the
       interrupt).
   - Any TimeoutException is wrapped in an X.
   - Any CancellationException is propagated untouched, as is any other RuntimeException (though get implementations are discouraged from throwing such
       exceptions).
 


 
The overall principle is to continue to treat every checked exception as a checked
 exception, every unchecked exception as an unchecked exception, and every error as an error. In
 addition, the cause of any ExecutionException is wrapped in order to ensure that the
 new stack trace matches that of the current thread.

 
Instances of exceptionClass are created by choosing an arbitrary public constructor
 that accepts zero or more arguments, all of type String or Throwable
 (preferring constructors with at least one String) and calling the constructor via
 reflection. If the exception did not already have a cause, one is set by calling Throwable#initCause(Throwable) on it. If no such constructor exists, an 
 IllegalArgumentException is thrown.

**Parameters:**
- `future` (`java.util.concurrent.Future<V>`)
- `exceptionClass` (`java.lang.Class<X>`)
- `timeout` (`long`)
- `unit` (`java.util.concurrent.TimeUnit`)

### `getUnchecked(java.util.concurrent.Future<V> future)`

**Returns:** `V`

This makes Future more suitable for lightweight, fast-running
 tasks that, barring bugs in the code, will not fail. This gives it exception-handling behavior
 similar to that of ForkJoinTask.join.

 
Exceptions from Future.get are treated as follows:

 

   - Any ExecutionException has its *cause* wrapped in an UncheckedExecutionException (if the cause is an Exception) or ExecutionError (if the cause is an Error).
   - Any InterruptedException causes a retry of the get call. The interrupt is
       restored before getUnchecked returns.
   - Any CancellationException is propagated untouched. So is any other RuntimeException (get implementations are discouraged from throwing such
       exceptions).
 


 
The overall principle is to eliminate all checked exceptions: to loop to avoid 
 InterruptedException, to pass through CancellationException, and to wrap any exception
 from the underlying computation in an UncheckedExecutionException or 
 ExecutionError.

 
For an uninterruptible get that preserves other exceptions, see Uninterruptibles#getUninterruptibly(Future).

**Parameters:**
- `future` (`java.util.concurrent.Future<V>`)

### `wrapAndThrowUnchecked(java.lang.Throwable cause)`

**Returns:** `void`

**Parameters:**
- `cause` (`java.lang.Throwable`)

