# Class: `Futures`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.Futures`

**Extends:** [`com.google.common.util.concurrent.GwtFuturesCatchingSpecialization`](./GwtFuturesCatchingSpecialization.md)

## Description

Static utility methods pertaining to the `Future` interface.

 <p>Many of these methods use the `ListenableFuture` API; consult the Guava User Guide
 article on <a href="https://github.com/google/guava/wiki/ListenableFutureExplained">`ListenableFuture`</a>.

 <p>The main purpose of `ListenableFuture` is to help you chain together a graph of
 asynchronous operations. You can chain them together manually with calls to methods like `Futures.transform(ListenableFuture, Function, Executor) Futures.transform`, but you will often
 find it easier to use a framework. Frameworks automate the process, often adding features like
 monitoring, debugging, and cancellation. Examples of frameworks include:

 <ul>
   <li><a href="https://dagger.dev/producers.html">Dagger Producers</a>
 </ul>

 <p>If you do chain your operations manually, you may want to use `FluentFuture`.
**Author:** Kevin Bourrillion
**Author:** Nishant Thakkar
**Author:** Sven Mawson
**Since:** 1.0

## Constructors

### `<init>()`

## Methods

### `immediateFuture(`V` value)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

Creates a `ListenableFuture` which has its value set immediately upon construction. The
 getters just return the value. This `Future` can't be canceled or timed out and its
 `isDone()` method always returns `true`.

### `immediateVoidFuture()`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Void>`](./ListenableFuture.md)

Returns a successful `ListenableFuture<Void>`. This method is equivalent to `immediateFuture(null)` except that it is restricted to produce futures of type `Void`.
**Since:** 29.0

### `immediateFailedFuture(`java.lang.Throwable` throwable)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

Returns a `ListenableFuture` which has an exception set immediately upon construction.

 <p>The returned `Future` can't be cancelled, and its `isDone()` method always
 returns `true`. Calling `get()` will immediately throw the provided `Throwable` wrapped in an `ExecutionException`.

### `immediateCancelledFuture()`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

Creates a `ListenableFuture` which is cancelled immediately upon construction, so that
 `isCancelled()` always returns `true`.
**Since:** 14.0

### `submit(`java.util.concurrent.Callable<O>` callable, `java.util.concurrent.Executor` executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<O>`](./ListenableFuture.md)

Executes `callable` on the specified `executor`, returning a `Future`.
@throws RejectedExecutionException if the task cannot be scheduled for execution
**Since:** 28.2

### `submit(`java.lang.Runnable` runnable, `java.util.concurrent.Executor` executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<java.lang.@org.checkerframework.checker.nullness.qual.Nullable Void>`](./ListenableFuture.md)

Executes `runnable` on the specified `executor`, returning a `Future` that
 will complete after execution.
@throws RejectedExecutionException if the task cannot be scheduled for execution
**Since:** 28.2

### `submitAsync([`com.google.common.util.concurrent.AsyncCallable<O>`](./AsyncCallable.md) callable, `java.util.concurrent.Executor` executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<O>`](./ListenableFuture.md)

Executes `callable` on the specified `executor`, returning a `Future`.
@throws RejectedExecutionException if the task cannot be scheduled for execution
**Since:** 23.0

### `scheduleAsync([`com.google.common.util.concurrent.AsyncCallable<O>`](./AsyncCallable.md) callable, `java.time.Duration` delay, `java.util.concurrent.ScheduledExecutorService` executorService)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<O>`](./ListenableFuture.md)

Schedules `callable` on the specified `executor`, returning a `Future`.
@throws RejectedExecutionException if the task cannot be scheduled for execution
**Since:** 28.0

### `scheduleAsync([`com.google.common.util.concurrent.AsyncCallable<O>`](./AsyncCallable.md) callable, `long` delay, `java.util.concurrent.TimeUnit` timeUnit, `java.util.concurrent.ScheduledExecutorService` executorService)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<O>`](./ListenableFuture.md)

Schedules `callable` on the specified `executor`, returning a `Future`.
@throws RejectedExecutionException if the task cannot be scheduled for execution
**Since:** 23.0

### `catching([`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md) input, `java.lang.Class<X>` exceptionType, [`com.google.common.base.Function<? super X,? extends V>`](../../base/Function.md) fallback, `java.util.concurrent.Executor` executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

Returns a `Future` whose result is taken from the given primary `input` or, if the
 primary input fails with the given `exceptionType`, from the result provided by the
 `fallback`. `Function.apply` is not invoked until the primary input has failed, so
 if the primary input succeeds, it is never invoked. If, during the invocation of `fallback`, an exception is thrown, this exception is used as the result of the output `Future`.

 <p>Usage example:

 <pre>`ListenableFuture<Integer> fetchCounterFuture = ...;

 // Falling back to a zero counter in case an exception happens when
 // processing the RPC to fetch counters.
 ListenableFuture<Integer> faultTolerantFuture = Futures.catching(
     fetchCounterFuture, FetchException.class, x -> 0, directExecutor());
 `</pre>

 <p>When selecting an executor, note that `directExecutor` is dangerous in some cases. See
 the warnings the `MoreExecutors.directExecutor` documentation.
@param input the primary input `Future`
@param exceptionType the exception type that triggers use of `fallback`. The exception
     type is matched against the input's exception. "The input's exception" means the cause of
     the `ExecutionException` thrown by `input.get()` or, if `get()` throws a
     different kind of exception, that exception itself. To avoid hiding bugs and other
     unrecoverable errors, callers should prefer more specific types, avoiding `Throwable.class` in particular.
@param fallback the `Function` to be called if `input` fails with the expected
     exception type. The function's argument is the input's exception. "The input's exception"
     means the cause of the `ExecutionException` thrown by `input.get()` or, if
     `get()` throws a different kind of exception, that exception itself.
@param executor the executor that runs `fallback` if `input` fails
**Since:** 19.0

### `catchingAsync([`com.google.common.util.concurrent.ListenableFuture<? extends V>`](./ListenableFuture.md) input, `java.lang.Class<X>` exceptionType, [`com.google.common.util.concurrent.AsyncFunction<? super X,? extends V>`](./AsyncFunction.md) fallback, `java.util.concurrent.Executor` executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

Returns a `Future` whose result is taken from the given primary `input` or, if the
 primary input fails with the given `exceptionType`, from the result provided by the
 `fallback`. `AsyncFunction.apply` is not invoked until the primary input has
 failed, so if the primary input succeeds, it is never invoked. If, during the invocation of
 `fallback`, an exception is thrown, this exception is used as the result of the output
 `Future`.

 <p>Usage examples:

 <pre>`ListenableFuture<Integer> fetchCounterFuture = ...;

 // Falling back to a zero counter in case an exception happens when
 // processing the RPC to fetch counters.
 ListenableFuture<Integer> faultTolerantFuture = Futures.catchingAsync(
     fetchCounterFuture, FetchException.class, x -> immediateFuture(0), directExecutor());
 `</pre>

 <p>The fallback can also choose to propagate the original exception when desired:

 <pre>`ListenableFuture<Integer> fetchCounterFuture = ...;

 // Falling back to a zero counter only in case the exception was a
 // TimeoutException.
 ListenableFuture<Integer> faultTolerantFuture = Futures.catchingAsync(
     fetchCounterFuture,
     FetchException.class,
     e -> {
       if (omitDataOnFetchFailure) {
         return immediateFuture(0);
       `
       throw e;
     },
     directExecutor());
 }</pre>

 <p>When selecting an executor, note that `directExecutor` is dangerous in some cases. See
 the warnings the `MoreExecutors.directExecutor` documentation.
@param input the primary input `Future`
@param exceptionType the exception type that triggers use of `fallback`. The exception
     type is matched against the input's exception. "The input's exception" means the cause of
     the `ExecutionException` thrown by `input.get()` or, if `get()` throws a
     different kind of exception, that exception itself. To avoid hiding bugs and other
     unrecoverable errors, callers should prefer more specific types, avoiding `Throwable.class` in particular.
@param fallback the `AsyncFunction` to be called if `input` fails with the expected
     exception type. The function's argument is the input's exception. "The input's exception"
     means the cause of the `ExecutionException` thrown by `input.get()` or, if
     `get()` throws a different kind of exception, that exception itself.
@param executor the executor that runs `fallback` if `input` fails
**Since:** 19.0 (similar functionality in 14.0 as `withFallback`)

### `withTimeout([`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md) delegate, `java.time.Duration` time, `java.util.concurrent.ScheduledExecutorService` scheduledExecutor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

Returns a future that delegates to another but will finish early (via a `TimeoutException` wrapped in an `ExecutionException`) if the specified duration expires.

 <p>The delegate future is interrupted and cancelled if it times out.
@param delegate The future to delegate to.
@param time when to time out the future
@param scheduledExecutor The executor service to enforce the timeout.
**Since:** 28.0

### `withTimeout([`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md) delegate, `long` time, `java.util.concurrent.TimeUnit` unit, `java.util.concurrent.ScheduledExecutorService` scheduledExecutor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

Returns a future that delegates to another but will finish early (via a `TimeoutException` wrapped in an `ExecutionException`) if the specified duration expires.

 <p>The delegate future is interrupted and cancelled if it times out.
@param delegate The future to delegate to.
@param time when to time out the future
@param unit the time unit of the time parameter
@param scheduledExecutor The executor service to enforce the timeout.
**Since:** 19.0

### `transformAsync([`com.google.common.util.concurrent.ListenableFuture<I>`](./ListenableFuture.md) input, [`com.google.common.util.concurrent.AsyncFunction<? super I,? extends O>`](./AsyncFunction.md) function, `java.util.concurrent.Executor` executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<O>`](./ListenableFuture.md)

Returns a new `Future` whose result is asynchronously derived from the result of the
 given `Future`. If the given `Future` fails, the returned `Future` fails with
 the same exception (and the function is not invoked).

 <p>More precisely, the returned `Future` takes its result from a `Future` produced
 by applying the given `AsyncFunction` to the result of the original `Future`.
 Example usage:

 <pre>`ListenableFuture<RowKey> rowKeyFuture = indexService.lookUp(query);
 ListenableFuture<QueryResult> queryFuture =
     transformAsync(rowKeyFuture, dataService::readFuture, executor);
 `</pre>

 <p>When selecting an executor, note that `directExecutor` is dangerous in some cases. See
 the warnings the `MoreExecutors.directExecutor` documentation.

 <p>The returned `Future` attempts to keep its cancellation state in sync with that of the
 input future and that of the future returned by the chain function. That is, if the returned
 `Future` is cancelled, it will attempt to cancel the other two, and if either of the
 other two is cancelled, the returned `Future` will receive a callback in which it will
 attempt to cancel itself.
@param input The future to transform
@param function A function to transform the result of the input future to the result of the
     output future
@param executor Executor to run the function in.
@return A future that holds result of the function (if the input succeeded) or the original
     input's failure (if not)
**Since:** 19.0 (in 11.0 as `transform`)

### `transform([`com.google.common.util.concurrent.ListenableFuture<I>`](./ListenableFuture.md) input, [`com.google.common.base.Function<? super I,? extends O>`](../../base/Function.md) function, `java.util.concurrent.Executor` executor)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<O>`](./ListenableFuture.md)

Returns a new `Future` whose result is derived from the result of the given `Future`. If `input` fails, the returned `Future` fails with the same exception (and
 the function is not invoked). Example usage:

 <pre>`ListenableFuture<QueryResult> queryFuture = ...;
 ListenableFuture<List<Row>> rowsFuture =
     transform(queryFuture, QueryResult::getRows, executor);
 `</pre>

 <p>When selecting an executor, note that `directExecutor` is dangerous in some cases. See
 the warnings the `MoreExecutors.directExecutor` documentation.

 <p>The returned `Future` attempts to keep its cancellation state in sync with that of the
 input future. That is, if the returned `Future` is cancelled, it will attempt to cancel
 the input, and if the input is cancelled, the returned `Future` will receive a callback
 in which it will attempt to cancel itself.

 <p>An example use of this method is to convert a serializable object returned from an RPC into
 a POJO.
@param input The future to transform
@param function A Function to transform the results of the provided future to the results of
     the returned future.
@param executor Executor to run the function in.
@return A future that holds result of the transformation.
**Since:** 9.0 (in 2.0 as `compose`)

### `lazyTransform(`java.util.concurrent.Future<I>` input, [`com.google.common.base.Function<? super I,? extends O>`](../../base/Function.md) function)`

**Returns:** `java.util.concurrent.Future<O>`

Like `transform(ListenableFuture, Function, Executor)` except that the transformation
 `function` is invoked on each call to `Future.get() get()` on the returned future.

 <p>The returned `Future` reflects the input's cancellation state directly, and any
 attempt to cancel the returned Future is likewise passed through to the input Future.

 <p>Note that calls to TimeUnit) timed get only apply the timeout
 to the execution of the underlying `Future`, <em>not</em> to the execution of the
 transformation function.

 <p>The primary audience of this method is callers of `transform` who don't have a `ListenableFuture` available and do not mind repeated, lazy function evaluation.
@param input The future to transform
@param function A Function to transform the results of the provided future to the results of
     the returned future.
@return A future that returns the result of the transformation.
**Since:** 10.0

### `allAsList([`com.google.common.util.concurrent.ListenableFuture<? extends V>[]`](./ListenableFuture.md) futures)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<java.util.List<V>>`](./ListenableFuture>.md)

Creates a new `ListenableFuture` whose value is a list containing the values of all its
 input futures, if all succeed.

 <p>The list of results is in the same order as the input list.

 <p>This differs from `successfulAsList(ListenableFuture[])` in that it will return a
 failed future if any of the items fails.

 <p>Canceling this future will attempt to cancel all the component futures, and if any of the
 provided futures fails or is canceled, this one is, too.
@param futures futures to combine
@return a future that provides a list of the results of the component futures
**Since:** 10.0

### `allAsList(`java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>` futures)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<java.util.List<V>>`](./ListenableFuture>.md)

Creates a new `ListenableFuture` whose value is a list containing the values of all its
 input futures, if all succeed.

 <p>The list of results is in the same order as the input list.

 <p>This differs from `successfulAsList(Iterable)` in that it will return a failed future
 if any of the items fails.

 <p>Canceling this future will attempt to cancel all the component futures, and if any of the
 provided futures fails or is canceled, this one is, too.
@param futures futures to combine
@return a future that provides a list of the results of the component futures
**Since:** 10.0

### `whenAllComplete([`com.google.common.util.concurrent.ListenableFuture<? extends V>[]`](./ListenableFuture.md) futures)`

**Returns:** [`com.google.common.util.concurrent.Futures.FutureCombiner<V>`](Futures/FutureCombiner.md)

Creates a `FutureCombiner` that processes the completed futures whether or not they're
 successful.

 <p>Any failures from the input futures will not be propagated to the returned future.
**Since:** 20.0

### `whenAllComplete(`java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>` futures)`

**Returns:** [`com.google.common.util.concurrent.Futures.FutureCombiner<V>`](Futures/FutureCombiner.md)

Creates a `FutureCombiner` that processes the completed futures whether or not they're
 successful.

 <p>Any failures from the input futures will not be propagated to the returned future.
**Since:** 20.0

### `whenAllSucceed([`com.google.common.util.concurrent.ListenableFuture<? extends V>[]`](./ListenableFuture.md) futures)`

**Returns:** [`com.google.common.util.concurrent.Futures.FutureCombiner<V>`](Futures/FutureCombiner.md)

Creates a `FutureCombiner` requiring that all passed in futures are successful.

 <p>If any input fails, the returned future fails immediately.
**Since:** 20.0

### `whenAllSucceed(`java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>` futures)`

**Returns:** [`com.google.common.util.concurrent.Futures.FutureCombiner<V>`](Futures/FutureCombiner.md)

Creates a `FutureCombiner` requiring that all passed in futures are successful.

 <p>If any input fails, the returned future fails immediately.
**Since:** 20.0

### `nonCancellationPropagating([`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md) future)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md)

Returns a `ListenableFuture` whose result is set from the supplied future when it
 completes. Cancelling the supplied future will also cancel the returned future, but cancelling
 the returned future will have no effect on the supplied future.
**Since:** 15.0

### `successfulAsList([`com.google.common.util.concurrent.ListenableFuture<? extends V>[]`](./ListenableFuture.md) futures)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<java.util.List<@org.checkerframework.checker.nullness.qual.Nullable V>>`](./ListenableFuture>.md)

Creates a new `ListenableFuture` whose value is a list containing the values of all its
 successful input futures. The list of results is in the same order as the input list, and if
 any of the provided futures fails or is canceled, its corresponding position will contain
 `null` (which is indistinguishable from the future having a successful value of `null`).

 <p>The list of results is in the same order as the input list.

 <p>This differs from `allAsList(ListenableFuture[])` in that it's tolerant of failed
 futures for any of the items, representing them as `null` in the result list.

 <p>Canceling this future will attempt to cancel all the component futures.
@param futures futures to combine
@return a future that provides a list of the results of the component futures
**Since:** 10.0

### `successfulAsList(`java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends V>>` futures)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<java.util.List<@org.checkerframework.checker.nullness.qual.Nullable V>>`](./ListenableFuture>.md)

Creates a new `ListenableFuture` whose value is a list containing the values of all its
 successful input futures. The list of results is in the same order as the input list, and if
 any of the provided futures fails or is canceled, its corresponding position will contain
 `null` (which is indistinguishable from the future having a successful value of `null`).

 <p>The list of results is in the same order as the input list.

 <p>This differs from `allAsList(Iterable)` in that it's tolerant of failed futures for
 any of the items, representing them as `null` in the result list.

 <p>Canceling this future will attempt to cancel all the component futures.
@param futures futures to combine
@return a future that provides a list of the results of the component futures
**Since:** 10.0

### `inCompletionOrder(`java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends T>>` futures)`

**Returns:** [`com.google.common.collect.ImmutableList<com.google.common.util.concurrent.ListenableFuture<T>>`](../../collect/ImmutableList>.md)

Returns a list of delegate futures that correspond to the futures received in the order that
 they complete. Delegate futures return the same value or throw the same exception as the
 corresponding input future returns/throws.

 <p>"In the order that they complete" means, for practical purposes, about what you would
 expect, but there are some subtleties. First, we do guarantee that, if the output future at
 index n is done, the output future at index n-1 is also done. (But as usual with futures, some
 listeners for future n may complete before some for future n-1.) However, it is possible, if
 one input completes with result X and another later with result Y, for Y to come before X in
 the output future list. (Such races are impossible to solve without global synchronization of
 all future completions. And they should have little practical impact.)

 <p>Cancelling a delegate future propagates to input futures once all the delegates complete,
 either from cancellation or because an input future has completed. If N futures are passed in,
 and M delegates are cancelled, the remaining M input futures will be cancelled once N - M of
 the input futures complete. If all the delegates are cancelled, all the input futures will be
 too.
**Since:** 17.0

### `gwtCompatibleToArray(`java.lang.Iterable<? extends com.google.common.util.concurrent.ListenableFuture<? extends T>>` futures)`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<? extends T>[]`](./ListenableFuture.md)

Can't use Iterables.toArray because it's not gwt compatible

### `addCallback([`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md) future, [`com.google.common.util.concurrent.FutureCallback<? super V>`](./FutureCallback.md) callback, `java.util.concurrent.Executor` executor)`

**Returns:** `void`

Registers separate success and failure callbacks to be run when the `Future`'s
 computation is complete or, if the
 computation is already complete, immediately.

 <p>The callback is run on `executor`. There is no guaranteed ordering of execution of
 callbacks, but any callback added through this method is guaranteed to be called once the
 computation is complete.

 <p>Exceptions thrown by a `callback` will be propagated up to the executor. Any exception
 thrown during `Executor.execute` (e.g., a `RejectedExecutionException` or an
 exception thrown by direct execution) will be caught
 and logged.

 <p>Example:

 <pre>`ListenableFuture<QueryResult> future = ...;
 Executor e = ...
 addCallback(future,
     new FutureCallback<QueryResult>() {
       public void onSuccess(QueryResult result) {
         storeInCache(result);
       `
       public void onFailure(Throwable t) {
         reportError(t);
       }
     }, e);
 }</pre>

 <p>When selecting an executor, note that `directExecutor` is dangerous in some cases. See
 the warnings the `MoreExecutors.directExecutor` documentation.

 <p>For a more general interface to attach a completion listener to a `Future`, see `ListenableFuture.addListener addListener`.
@param future The future attach the callback to.
@param callback The callback to invoke when `future` is completed.
@param executor The executor to run `callback` when the future completes.
**Since:** 10.0

### `getDone(`java.util.concurrent.Future<V>` future)`

**Returns:** `V`

Returns the result of the input `Future`, which must have already completed.

 <p>The benefits of this method are twofold. First, the name "getDone" suggests to readers that
 the `Future` is already done. Second, if buggy code calls `getDone` on a `Future` that is still pending, the program will throw instead of block. This can be important
 for APIs like `whenAllComplete whenAllComplete(...)``.``FutureCombiner.call(Callable, Executor) call(...)`, where it is easy to use a new input from
 the `call` implementation but forget to add it to the arguments of `whenAllComplete`.

 <p>If you are looking for a method to determine whether a given `Future` is done, use the
 instance method `Future.isDone()`.
@throws ExecutionException if the `Future` failed with an exception
@throws CancellationException if the `Future` was cancelled
@throws IllegalStateException if the `Future` is not done
**Since:** 20.0

### `getChecked(`java.util.concurrent.Future<V>` future, `java.lang.Class<X>` exceptionClass)`

**Returns:** `V`

Returns the result of `Future.get()`, converting most exceptions to a new instance of the
 given checked exception type. This reduces boilerplate for a common use of `Future` in
 which it is unnecessary to programmatically distinguish between exception types or to extract
 other information from the exception instance.

 <p>Exceptions from `Future.get` are treated as follows:

 <ul>
   <li>Any `ExecutionException` has its <i>cause</i> wrapped in an `X` if the cause
       is a checked exception, an `UncheckedExecutionException` if the cause is a `RuntimeException`, or an `ExecutionError` if the cause is an `Error`.
   <li>Any `InterruptedException` is wrapped in an `X` (after restoring the
       interrupt).
   <li>Any `CancellationException` is propagated untouched, as is any other `RuntimeException` (though `get` implementations are discouraged from throwing such
       exceptions).
 </ul>

 <p>The overall principle is to continue to treat every checked exception as a checked
 exception, every unchecked exception as an unchecked exception, and every error as an error. In
 addition, the cause of any `ExecutionException` is wrapped in order to ensure that the
 new stack trace matches that of the current thread.

 <p>Instances of `exceptionClass` are created by choosing an arbitrary public constructor
 that accepts zero or more arguments, all of type `String` or `Throwable`
 (preferring constructors with at least one `String`, then preferring constructors with at
 least one `Throwable`) and calling the constructor via reflection. If the exception did
 not already have a cause, one is set by calling `Throwable.initCause(Throwable)` on it.
 If no such constructor exists, an `IllegalArgumentException` is thrown.
@throws X if `get` throws any checked exception except for an `ExecutionException`
     whose cause is not itself a checked exception
@throws UncheckedExecutionException if `get` throws an `ExecutionException` with a
     `RuntimeException` as its cause
@throws ExecutionError if `get` throws an `ExecutionException` with an `Error` as its cause
@throws CancellationException if `get` throws a `CancellationException`
@throws IllegalArgumentException if `exceptionClass` extends `RuntimeException` or
     does not have a suitable constructor
**Since:** 19.0 (in 10.0 as `get`)

### `getChecked(`java.util.concurrent.Future<V>` future, `java.lang.Class<X>` exceptionClass, `java.time.Duration` timeout)`

**Returns:** `V`

Returns the result of `Future.get(long, TimeUnit)`, converting most exceptions to a new
 instance of the given checked exception type. This reduces boilerplate for a common use of
 `Future` in which it is unnecessary to programmatically distinguish between exception
 types or to extract other information from the exception instance.

 <p>Exceptions from `Future.get` are treated as follows:

 <ul>
   <li>Any `ExecutionException` has its <i>cause</i> wrapped in an `X` if the cause
       is a checked exception, an `UncheckedExecutionException` if the cause is a `RuntimeException`, or an `ExecutionError` if the cause is an `Error`.
   <li>Any `InterruptedException` is wrapped in an `X` (after restoring the
       interrupt).
   <li>Any `TimeoutException` is wrapped in an `X`.
   <li>Any `CancellationException` is propagated untouched, as is any other `RuntimeException` (though `get` implementations are discouraged from throwing such
       exceptions).
 </ul>

 <p>The overall principle is to continue to treat every checked exception as a checked
 exception, every unchecked exception as an unchecked exception, and every error as an error. In
 addition, the cause of any `ExecutionException` is wrapped in order to ensure that the
 new stack trace matches that of the current thread.

 <p>Instances of `exceptionClass` are created by choosing an arbitrary public constructor
 that accepts zero or more arguments, all of type `String` or `Throwable`
 (preferring constructors with at least one `String`, then preferring constructors with at
 least one `Throwable`) and calling the constructor via reflection. If the exception did
 not already have a cause, one is set by calling `Throwable.initCause(Throwable)` on it.
 If no such constructor exists, an `IllegalArgumentException` is thrown.
@throws X if `get` throws any checked exception except for an `ExecutionException`
     whose cause is not itself a checked exception
@throws UncheckedExecutionException if `get` throws an `ExecutionException` with a
     `RuntimeException` as its cause
@throws ExecutionError if `get` throws an `ExecutionException` with an `Error` as its cause
@throws CancellationException if `get` throws a `CancellationException`
@throws IllegalArgumentException if `exceptionClass` extends `RuntimeException` or
     does not have a suitable constructor
**Since:** 28.0

### `getChecked(`java.util.concurrent.Future<V>` future, `java.lang.Class<X>` exceptionClass, `long` timeout, `java.util.concurrent.TimeUnit` unit)`

**Returns:** `V`

Returns the result of `Future.get(long, TimeUnit)`, converting most exceptions to a new
 instance of the given checked exception type. This reduces boilerplate for a common use of
 `Future` in which it is unnecessary to programmatically distinguish between exception
 types or to extract other information from the exception instance.

 <p>Exceptions from `Future.get` are treated as follows:

 <ul>
   <li>Any `ExecutionException` has its <i>cause</i> wrapped in an `X` if the cause
       is a checked exception, an `UncheckedExecutionException` if the cause is a `RuntimeException`, or an `ExecutionError` if the cause is an `Error`.
   <li>Any `InterruptedException` is wrapped in an `X` (after restoring the
       interrupt).
   <li>Any `TimeoutException` is wrapped in an `X`.
   <li>Any `CancellationException` is propagated untouched, as is any other `RuntimeException` (though `get` implementations are discouraged from throwing such
       exceptions).
 </ul>

 <p>The overall principle is to continue to treat every checked exception as a checked
 exception, every unchecked exception as an unchecked exception, and every error as an error. In
 addition, the cause of any `ExecutionException` is wrapped in order to ensure that the
 new stack trace matches that of the current thread.

 <p>Instances of `exceptionClass` are created by choosing an arbitrary public constructor
 that accepts zero or more arguments, all of type `String` or `Throwable`
 (preferring constructors with at least one `String`) and calling the constructor via
 reflection. If the exception did not already have a cause, one is set by calling `Throwable.initCause(Throwable)` on it. If no such constructor exists, an `IllegalArgumentException` is thrown.
@throws X if `get` throws any checked exception except for an `ExecutionException`
     whose cause is not itself a checked exception
@throws UncheckedExecutionException if `get` throws an `ExecutionException` with a
     `RuntimeException` as its cause
@throws ExecutionError if `get` throws an `ExecutionException` with an `Error` as its cause
@throws CancellationException if `get` throws a `CancellationException`
@throws IllegalArgumentException if `exceptionClass` extends `RuntimeException` or
     does not have a suitable constructor
**Since:** 19.0 (in 10.0 as `get` and with different parameter order)

### `getUnchecked(`java.util.concurrent.Future<V>` future)`

**Returns:** `V`

Returns the result of calling `Future.get()` uninterruptibly on a task known not to throw
 a checked exception. This makes `Future` more suitable for lightweight, fast-running
 tasks that, barring bugs in the code, will not fail. This gives it exception-handling behavior
 similar to that of `ForkJoinTask.join`.

 <p>Exceptions from `Future.get` are treated as follows:

 <ul>
   <li>Any `ExecutionException` has its <i>cause</i> wrapped in an `UncheckedExecutionException` (if the cause is an `Exception`) or `ExecutionError` (if the cause is an `Error`).
   <li>Any `InterruptedException` causes a retry of the `get` call. The interrupt is
       restored before `getUnchecked` returns.
   <li>Any `CancellationException` is propagated untouched. So is any other `RuntimeException` (`get` implementations are discouraged from throwing such
       exceptions).
 </ul>

 <p>The overall principle is to eliminate all checked exceptions: to loop to avoid `InterruptedException`, to pass through `CancellationException`, and to wrap any exception
 from the underlying computation in an `UncheckedExecutionException` or `ExecutionError`.

 <p>For an uninterruptible `get` that preserves other exceptions, see `Uninterruptibles.getUninterruptibly(Future)`.
@throws UncheckedExecutionException if `get` throws an `ExecutionException` with an
     `Exception` as its cause
@throws ExecutionError if `get` throws an `ExecutionException` with an `Error` as its cause
@throws CancellationException if `get` throws a `CancellationException`
**Since:** 10.0

### `wrapAndThrowUnchecked(`java.lang.Throwable` cause)`

**Returns:** `void`

