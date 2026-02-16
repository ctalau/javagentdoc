# Class: `ClosingFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ClosingFuture`

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A step in a pipeline of an asynchronous computation. When the last step in the computation is
 complete, some objects captured during the computation are closed.

 <p>A pipeline of {@code ClosingFuture}s is a tree of steps. Each step represents either an
 asynchronously-computed intermediate value, or else an exception that indicates the failure or
 cancellation of the operation so far. The only way to extract the value or exception from a step
 is by declaring that step to be the last step of the pipeline. Nevertheless, we refer to the
 "value" of a successful step or the "result" (value or exception) of any step.

 <ol>
   <li>A pipeline starts at its leaf step (or steps), which is created from either a callable
       block or a {@link ListenableFuture}.
   <li>Each other step is derived from one or more input steps. At each step, zero or more objects
       can be captured for later closing.
   <li>There is one last step (the root of the tree), from which you can extract the final result
       of the computation. After that result is available (or the computation fails), all objects
       captured by any of the steps in the pipeline are closed.
 </ol>

 <h3>Starting a pipeline</h3>

 Start a {@code ClosingFuture} pipeline {@linkplain #submit(ClosingCallable, Executor) from a
 callable block} that may capture objects for later closing. To start a pipeline from a {@link ListenableFuture} that doesn't create resources that should be closed later, you can use {@link #from(ListenableFuture)} instead.

 <h3>Derived steps</h3>

 A {@code ClosingFuture} step can be derived from one or more input {@code ClosingFuture} steps in
 ways similar to {@link FluentFuture}s:

 <ul>
   <li>by transforming the value from a successful input step,
   <li>by catching the exception from a failed input step, or
   <li>by combining the results of several input steps.
 </ul>

 Each derivation can capture the next value or any intermediate objects for later closing.

 <p>A step can be the input to at most one derived step. Once you transform its value, catch its
 exception, or combine it with others, you cannot do anything else with it, including declare it
 to be the last step of the pipeline.

 <h4>Transforming</h4>

 To derive the next step by asynchronously applying a function to an input step's value, call
 {@link #transform(ClosingFunction, Executor)} or {@link #transformAsync(AsyncClosingFunction,
 Executor)} on the input step.

 <h4>Catching</h4>

 To derive the next step from a failed input step, call {@link #catching(Class, ClosingFunction,
 Executor)} or {@link #catchingAsync(Class, AsyncClosingFunction, Executor)} on the input step.

 <h4>Combining</h4>

 To derive a {@code ClosingFuture} from two or more input steps, pass the input steps to {@link #whenAllComplete(Iterable)} or {@link #whenAllSucceed(Iterable)} or its overloads.

 <h3>Cancelling</h3>

 Any step in a pipeline can be {@linkplain #cancel(boolean) cancelled}, even after another step
 has been derived, with the same semantics as cancelling a {@link Future}. In addition, a
 successfully cancelled step will immediately start closing all objects captured for later closing
 by it and by its input steps.

 <h3>Ending a pipeline</h3>

 Each {@code ClosingFuture} pipeline must be ended. To end a pipeline, decide whether you want to
 close the captured objects automatically or manually.

 <h4>Automatically closing</h4>

 You can extract a {@link Future} that represents the result of the last step in the pipeline by
 calling {@link #finishToFuture()}. All objects the pipeline has captured for closing will begin
 to be closed asynchronously <b>after</b> the returned {@code Future} is done: the future
 completes before closing starts, rather than once it has finished.

 <pre>{@code
 FluentFuture<UserName> userName =
     ClosingFuture.submit(
             closer -> closer.eventuallyClose(database.newTransaction(), closingExecutor),
             executor)
         .transformAsync((closer, transaction) -> transaction.queryClosingFuture("..."), executor)
         .transform((closer, result) -> result.get("userName"), directExecutor())
         .catching(DBException.class, e -> "no user", directExecutor())
         .finishToFuture();
 }</pre>

 In this example, when the {@code userName} {@link Future} is done, the transaction and the query
 result cursor will both be closed, even if the operation is cancelled or fails.

 <h4>Manually closing</h4>

 If you want to close the captured objects manually, after you've used the final result, call
 {@link #finishToValueAndCloser(ValueAndCloserConsumer, Executor)} to get an object that holds the
 final result. You then call {@link ValueAndCloser#closeAsync()} to close the captured objects.

 <pre>{@code
     ClosingFuture.submit(
             closer -> closer.eventuallyClose(database.newTransaction(), closingExecutor),
             executor)
     .transformAsync((closer, transaction) -> transaction.queryClosingFuture("..."), executor)
     .transform((closer, result) -> result.get("userName"), directExecutor())
     .catching(DBException.class, e -> "no user", directExecutor())
     .finishToValueAndCloser(
         valueAndCloser -> this.userNameValueAndCloser = valueAndCloser, executor);

 // later
 try { // get() will throw if the operation failed or was cancelled.
   UserName userName = userNameValueAndCloser.get();
   // do something with userName
 } finally {
   userNameValueAndCloser.closeAsync();
 }
 }</pre>

 In this example, when {@code userNameValueAndCloser.closeAsync()} is called, the transaction and
 the query result cursor will both be closed, even if the operation is cancelled or fails.

 <p>Note that if you don't call {@code closeAsync()}, the captured objects will not be closed. The
 automatic-closing approach described above is safer.
@param <V> the type of the value of this step
@since 30.0

## Fields

### `logger`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `state`

**Type:** [`java.util.concurrent.atomic.AtomicReference<com.google.common.util.concurrent.ClosingFuture.State>`](../../../../../java/util/concurrent/atomic/AtomicReference.md)

### `closeables`

**Type:** [`com.google.common.util.concurrent.ClosingFuture.CloseableList`](ClosingFuture/CloseableList.md)

### `future`

**Type:** [`com.google.common.util.concurrent.FluentFuture<V>`](./FluentFuture.md)

## Constructors

### `<init>([`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md) future)`

### `<init>([`com.google.common.util.concurrent.ClosingFuture.ClosingCallable<V>`](ClosingFuture/ClosingCallable.md) callable, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

### `<init>([`com.google.common.util.concurrent.ClosingFuture.AsyncClosingCallable<V>`](ClosingFuture/AsyncClosingCallable.md) callable, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

## Methods

### `submit([`com.google.common.util.concurrent.ClosingFuture.ClosingCallable<V>`](ClosingFuture/ClosingCallable.md) callable, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<V>`](./ClosingFuture.md)

Starts a {@link ClosingFuture} pipeline by submitting a callable block to an executor.
@throws java.util.concurrent.RejectedExecutionException if the task cannot be scheduled for
     execution

### `submitAsync([`com.google.common.util.concurrent.ClosingFuture.AsyncClosingCallable<V>`](ClosingFuture/AsyncClosingCallable.md) callable, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<V>`](./ClosingFuture.md)

Starts a {@link ClosingFuture} pipeline by submitting a callable block to an executor.
@throws java.util.concurrent.RejectedExecutionException if the task cannot be scheduled for
     execution
@since 30.1

### `from([`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md) future)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<V>`](./ClosingFuture.md)

Starts a {@link ClosingFuture} pipeline with a {@link ListenableFuture}.

 <p>{@code future}'s value will not be closed when the pipeline is done even if {@code V}
 implements {@link Closeable}. In order to start a pipeline with a value that will be closed
 when the pipeline is done, use {@link #submit(ClosingCallable, Executor)} instead.

### `eventuallyClosing([`com.google.common.util.concurrent.ListenableFuture<C>`](./ListenableFuture.md) future, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) closingExecutor)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<C>`](./ClosingFuture.md)

Starts a {@link ClosingFuture} pipeline with a {@link ListenableFuture}.

 <p>If {@code future} succeeds, its value will be closed (using {@code closingExecutor)}) when
 the pipeline is done, even if the pipeline is canceled or fails.

 <p>Cancelling the pipeline will not cancel {@code future}, so that the pipeline can access its
 value in order to close it.
@param future the future to create the {@code ClosingFuture} from. For discussion of the
     future's result type {@code C}, see {@link DeferredCloser#eventuallyClose(Object,
     Executor)}.
@param closingExecutor the future's result will be closed on this executor
@deprecated Creating {@link Future}s of closeable types is dangerous in general because the
     underlying value may never be closed if the {@link Future} is canceled after its operation
     begins. Consider replacing code that creates {@link ListenableFuture}s of closeable types,
     including those that pass them to this method, with {@link #submit(ClosingCallable,
     Executor)} in order to ensure that resources do not leak. Or, to start a pipeline with a
     {@link ListenableFuture} that doesn't create values that should be closed, use {@link ClosingFuture#from}.

### `whenAllComplete(`java.lang.Iterable<? extends com.google.common.util.concurrent.ClosingFuture<?>>` futures)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture.Combiner`](ClosingFuture/Combiner.md)

Starts specifying how to combine {@link ClosingFuture}s into a single pipeline.
@throws IllegalStateException if a {@code ClosingFuture} has already been derived from any of
     the {@code futures}, or if any has already been {@linkplain #finishToFuture() finished}

### `whenAllComplete([`com.google.common.util.concurrent.ClosingFuture<?>`](./ClosingFuture.md) future1, [`com.google.common.util.concurrent.ClosingFuture<?>[]`](./ClosingFuture.md) moreFutures)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture.Combiner`](ClosingFuture/Combiner.md)

Starts specifying how to combine {@link ClosingFuture}s into a single pipeline.
@throws IllegalStateException if a {@code ClosingFuture} has already been derived from any of
     the arguments, or if any has already been {@linkplain #finishToFuture() finished}

### `whenAllSucceed(`java.lang.Iterable<? extends com.google.common.util.concurrent.ClosingFuture<?>>` futures)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture.Combiner`](ClosingFuture/Combiner.md)

Starts specifying how to combine {@link ClosingFuture}s into a single pipeline, assuming they
 all succeed. If any fail, the resulting pipeline will fail.
@throws IllegalStateException if a {@code ClosingFuture} has already been derived from any of
     the {@code futures}, or if any has already been {@linkplain #finishToFuture() finished}

### `whenAllSucceed([`com.google.common.util.concurrent.ClosingFuture<V1>`](./ClosingFuture.md) future1, [`com.google.common.util.concurrent.ClosingFuture<V2>`](./ClosingFuture.md) future2)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture.Combiner2<V1,V2>`](ClosingFuture/Combiner2.md)

Starts specifying how to combine two {@link ClosingFuture}s into a single pipeline, assuming
 they all succeed. If any fail, the resulting pipeline will fail.

 <p>Calling this method allows you to use lambdas or method references typed with the types of
 the input {@link ClosingFuture}s.
@throws IllegalStateException if a {@code ClosingFuture} has already been derived from any of
     the arguments, or if any has already been {@linkplain #finishToFuture() finished}

### `whenAllSucceed([`com.google.common.util.concurrent.ClosingFuture<V1>`](./ClosingFuture.md) future1, [`com.google.common.util.concurrent.ClosingFuture<V2>`](./ClosingFuture.md) future2, [`com.google.common.util.concurrent.ClosingFuture<V3>`](./ClosingFuture.md) future3)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture.Combiner3<V1,V2,V3>`](ClosingFuture/Combiner3.md)

Starts specifying how to combine three {@link ClosingFuture}s into a single pipeline, assuming
 they all succeed. If any fail, the resulting pipeline will fail.

 <p>Calling this method allows you to use lambdas or method references typed with the types of
 the input {@link ClosingFuture}s.
@throws IllegalStateException if a {@code ClosingFuture} has already been derived from any of
     the arguments, or if any has already been {@linkplain #finishToFuture() finished}

### `whenAllSucceed([`com.google.common.util.concurrent.ClosingFuture<V1>`](./ClosingFuture.md) future1, [`com.google.common.util.concurrent.ClosingFuture<V2>`](./ClosingFuture.md) future2, [`com.google.common.util.concurrent.ClosingFuture<V3>`](./ClosingFuture.md) future3, [`com.google.common.util.concurrent.ClosingFuture<V4>`](./ClosingFuture.md) future4)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture.Combiner4<V1,V2,V3,V4>`](ClosingFuture/Combiner4.md)

Starts specifying how to combine four {@link ClosingFuture}s into a single pipeline, assuming
 they all succeed. If any fail, the resulting pipeline will fail.

 <p>Calling this method allows you to use lambdas or method references typed with the types of
 the input {@link ClosingFuture}s.
@throws IllegalStateException if a {@code ClosingFuture} has already been derived from any of
     the arguments, or if any has already been {@linkplain #finishToFuture() finished}

### `whenAllSucceed([`com.google.common.util.concurrent.ClosingFuture<V1>`](./ClosingFuture.md) future1, [`com.google.common.util.concurrent.ClosingFuture<V2>`](./ClosingFuture.md) future2, [`com.google.common.util.concurrent.ClosingFuture<V3>`](./ClosingFuture.md) future3, [`com.google.common.util.concurrent.ClosingFuture<V4>`](./ClosingFuture.md) future4, [`com.google.common.util.concurrent.ClosingFuture<V5>`](./ClosingFuture.md) future5)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture.Combiner5<V1,V2,V3,V4,V5>`](ClosingFuture/Combiner5.md)

Starts specifying how to combine five {@link ClosingFuture}s into a single pipeline, assuming
 they all succeed. If any fail, the resulting pipeline will fail.

 <p>Calling this method allows you to use lambdas or method references typed with the types of
 the input {@link ClosingFuture}s.
@throws IllegalStateException if a {@code ClosingFuture} has already been derived from any of
     the arguments, or if any has already been {@linkplain #finishToFuture() finished}

### `whenAllSucceed([`com.google.common.util.concurrent.ClosingFuture<?>`](./ClosingFuture.md) future1, [`com.google.common.util.concurrent.ClosingFuture<?>`](./ClosingFuture.md) future2, [`com.google.common.util.concurrent.ClosingFuture<?>`](./ClosingFuture.md) future3, [`com.google.common.util.concurrent.ClosingFuture<?>`](./ClosingFuture.md) future4, [`com.google.common.util.concurrent.ClosingFuture<?>`](./ClosingFuture.md) future5, [`com.google.common.util.concurrent.ClosingFuture<?>`](./ClosingFuture.md) future6, [`com.google.common.util.concurrent.ClosingFuture<?>[]`](./ClosingFuture.md) moreFutures)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture.Combiner`](ClosingFuture/Combiner.md)

Starts specifying how to combine {@link ClosingFuture}s into a single pipeline, assuming they
 all succeed. If any fail, the resulting pipeline will fail.
@throws IllegalStateException if a {@code ClosingFuture} has already been derived from any of
     the arguments, or if any has already been {@linkplain #finishToFuture() finished}

### `statusFuture()`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<?>`](./ListenableFuture.md)

Returns a future that finishes when this step does. Calling {@code get()} on the returned
 future returns {@code null} if the step is successful or throws the same exception that would
 be thrown by calling {@code finishToFuture().get()} if this were the last step. Calling {@code
 cancel()} on the returned future has no effect on the {@code ClosingFuture} pipeline.

 <p>{@code statusFuture} differs from most methods on {@code ClosingFuture}: You can make calls
 to {@code statusFuture} <i>in addition to</i> the call you make to {@link #finishToFuture()} or
 a derivation method <i>on the same instance</i>. This is important because calling {@code
 statusFuture} alone does not provide a way to close the pipeline.

### `transform([`com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super V,U>`](ClosingFuture/ClosingFunction.md) function, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<U>`](./ClosingFuture.md)

Returns a new {@code ClosingFuture} pipeline step derived from this one by applying a function
 to its value. The function can use a {@link DeferredCloser} to capture objects to be closed
 when the pipeline is done.

 <p>If this {@code ClosingFuture} fails, the function will not be called, and the derived {@code
 ClosingFuture} will be equivalent to this one.

 <p>If the function throws an exception, that exception is used as the result of the derived
 {@code ClosingFuture}.

 <p>Example usage:

 <pre>{@code
 ClosingFuture<List<Row>> rowsFuture =
     queryFuture.transform((closer, result) -> result.getRows(), executor);
 }</pre>

 <p>When selecting an executor, note that {@code directExecutor} is dangerous in some cases. See
 the discussion in the {@link ListenableFuture#addListener} documentation. All its warnings
 about heavyweight listeners are also applicable to heavyweight functions passed to this method.

 <p>After calling this method, you may not call {@link #finishToFuture()}, {@link #finishToValueAndCloser(ValueAndCloserConsumer, Executor)}, or any other derivation method on
 the original {@code ClosingFuture} instance.
@param function transforms the value of this step to the value of the derived step
@param executor executor to run the function in
@return the derived step
@throws IllegalStateException if a {@code ClosingFuture} has already been derived from this
     one, or if this {@code ClosingFuture} has already been {@linkplain #finishToFuture() finished}

### `transformAsync([`com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<? super V,U>`](ClosingFuture/AsyncClosingFunction.md) function, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<U>`](./ClosingFuture.md)

Returns a new {@code ClosingFuture} pipeline step derived from this one by applying a function
 that returns a {@code ClosingFuture} to its value. The function can use a {@link DeferredCloser} to capture objects to be closed when the pipeline is done (other than those
 captured by the returned {@link ClosingFuture}).

 <p>If this {@code ClosingFuture} succeeds, the derived one will be equivalent to the one
 returned by the function.

 <p>If this {@code ClosingFuture} fails, the function will not be called, and the derived {@code
 ClosingFuture} will be equivalent to this one.

 <p>If the function throws an exception, that exception is used as the result of the derived
 {@code ClosingFuture}. But if the exception is thrown after the function creates a {@code
 ClosingFuture}, then none of the closeable objects in that {@code ClosingFuture} will be
 closed.

 <p>Usage guidelines for this method:

 <ul>
   <li>Use this method only when calling an API that returns a {@link ListenableFuture} or a
       {@code ClosingFuture}. If possible, prefer calling {@link #transform(ClosingFunction,
       Executor)} instead, with a function that returns the next value directly.
   <li>Call {@link DeferredCloser#eventuallyClose(Object, Executor) closer.eventuallyClose()}
       for every closeable object this step creates in order to capture it for later closing.
   <li>Return a {@code ClosingFuture}. To turn a {@link ListenableFuture} into a {@code
       ClosingFuture} call {@link #from(ListenableFuture)}.
   <li>In case this step doesn't create new closeables, you can adapt an API that returns a
       {@link ListenableFuture} to return a {@code ClosingFuture} by wrapping it with a call to
       {@link #withoutCloser(AsyncFunction)}
 </ul>

 <p>Example usage:

 <pre>{@code
 // Result.getRowsClosingFuture() returns a ClosingFuture.
 ClosingFuture<List<Row>> rowsFuture =
     queryFuture.transformAsync((closer, result) -> result.getRowsClosingFuture(), executor);

 // Result.writeRowsToOutputStreamFuture() returns a ListenableFuture that resolves to the
 // number of written rows. openOutputFile() returns a FileOutputStream (which implements
 // Closeable).
 ClosingFuture<Integer> rowsFuture2 =
     queryFuture.transformAsync(
         (closer, result) -> {
           FileOutputStream fos = closer.eventuallyClose(openOutputFile(), closingExecutor);
           return ClosingFuture.from(result.writeRowsToOutputStreamFuture(fos));
      },
      executor);

 // Result.getRowsFuture() returns a ListenableFuture (no new closeables are created).
 ClosingFuture<List<Row>> rowsFuture3 =
     queryFuture.transformAsync(withoutCloser(Result::getRowsFuture), executor);

 }</pre>

 <p>When selecting an executor, note that {@code directExecutor} is dangerous in some cases. See
 the discussion in the {@link ListenableFuture#addListener} documentation. All its warnings
 about heavyweight listeners are also applicable to heavyweight functions passed to this method.
 (Specifically, {@code directExecutor} functions should avoid heavyweight operations inside
 {@code AsyncClosingFunction.apply}. Any heavyweight operations should occur in other threads
 responsible for completing the returned {@code ClosingFuture}.)

 <p>After calling this method, you may not call {@link #finishToFuture()}, {@link #finishToValueAndCloser(ValueAndCloserConsumer, Executor)}, or any other derivation method on
 the original {@code ClosingFuture} instance.
@param function transforms the value of this step to a {@code ClosingFuture} with the value of
     the derived step
@param executor executor to run the function in
@return the derived step
@throws IllegalStateException if a {@code ClosingFuture} has already been derived from this
     one, or if this {@code ClosingFuture} has already been {@linkplain #finishToFuture() finished}

### `withoutCloser([`com.google.common.util.concurrent.AsyncFunction<V,U>`](./AsyncFunction.md) function)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<V,U>`](ClosingFuture/AsyncClosingFunction.md)

Returns an {@link AsyncClosingFunction} that applies an {@link AsyncFunction} to an input,
 ignoring the DeferredCloser and returning a {@code ClosingFuture} derived from the returned
 {@link ListenableFuture}.

 <p>Use this method to pass a transformation to {@link #transformAsync(AsyncClosingFunction,
 Executor)} or to {@link #catchingAsync(Class, AsyncClosingFunction, Executor)} as long as it
 meets these conditions:

 <ul>
   <li>It does not need to capture any {@link Closeable} objects by calling {@link DeferredCloser#eventuallyClose(Object, Executor)}.
   <li>It returns a {@link ListenableFuture}.
 </ul>

 <p>Example usage:

 <pre>{@code
 // Result.getRowsFuture() returns a ListenableFuture.
 ClosingFuture<List<Row>> rowsFuture =
     queryFuture.transformAsync(withoutCloser(Result::getRowsFuture), executor);
 }</pre>
@param function transforms the value of a {@code ClosingFuture} step to a {@link ListenableFuture} with the value of a derived step

### `catching(`java.lang.Class<X>` exceptionType, [`com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super X,? extends V>`](ClosingFuture/ClosingFunction.md) fallback, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<V>`](./ClosingFuture.md)

Returns a new {@code ClosingFuture} pipeline step derived from this one by applying a function
 to its exception if it is an instance of a given exception type. The function can use a {@link DeferredCloser} to capture objects to be closed when the pipeline is done.

 <p>If this {@code ClosingFuture} succeeds or fails with a different exception type, the
 function will not be called, and the derived {@code ClosingFuture} will be equivalent to this
 one.

 <p>If the function throws an exception, that exception is used as the result of the derived
 {@code ClosingFuture}.

 <p>Example usage:

 <pre>{@code
 ClosingFuture<QueryResult> queryFuture =
     queryFuture.catching(
         QueryException.class, (closer, x) -> Query.emptyQueryResult(), executor);
 }</pre>

 <p>When selecting an executor, note that {@code directExecutor} is dangerous in some cases. See
 the discussion in the {@link ListenableFuture#addListener} documentation. All its warnings
 about heavyweight listeners are also applicable to heavyweight functions passed to this method.

 <p>After calling this method, you may not call {@link #finishToFuture()}, {@link #finishToValueAndCloser(ValueAndCloserConsumer, Executor)}, or any other derivation method on
 the original {@code ClosingFuture} instance.
@param exceptionType the exception type that triggers use of {@code fallback}. The exception
     type is matched against this step's exception. "This step's exception" means the cause of
     the {@link ExecutionException} thrown by {@link Future#get()} on the {@link Future}
     underlying this step or, if {@code get()} throws a different kind of exception, that
     exception itself. To avoid hiding bugs and other unrecoverable errors, callers should
     prefer more specific types, avoiding {@code Throwable.class} in particular.
@param fallback the function to be called if this step fails with the expected exception type.
     The function's argument is this step's exception. "This step's exception" means the cause
     of the {@link ExecutionException} thrown by {@link Future#get()} on the {@link Future}
     underlying this step or, if {@code get()} throws a different kind of exception, that
     exception itself.
@param executor the executor that runs {@code fallback} if the input fails

### `catchingMoreGeneric(`java.lang.Class<X>` exceptionType, [`com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super X,W>`](ClosingFuture/ClosingFunction.md) fallback, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<V>`](./ClosingFuture.md)

### `catchingAsync(`java.lang.Class<X>` exceptionType, [`com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<? super X,? extends V>`](ClosingFuture/AsyncClosingFunction.md) fallback, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<V>`](./ClosingFuture.md)

Returns a new {@code ClosingFuture} pipeline step derived from this one by applying a function
 that returns a {@code ClosingFuture} to its exception if it is an instance of a given exception
 type. The function can use a {@link DeferredCloser} to capture objects to be closed when the
 pipeline is done (other than those captured by the returned {@link ClosingFuture}).

 <p>If this {@code ClosingFuture} fails with an exception of the given type, the derived {@code
 ClosingFuture} will be equivalent to the one returned by the function.

 <p>If this {@code ClosingFuture} succeeds or fails with a different exception type, the
 function will not be called, and the derived {@code ClosingFuture} will be equivalent to this
 one.

 <p>If the function throws an exception, that exception is used as the result of the derived
 {@code ClosingFuture}. But if the exception is thrown after the function creates a {@code
 ClosingFuture}, then none of the closeable objects in that {@code ClosingFuture} will be
 closed.

 <p>Usage guidelines for this method:

 <ul>
   <li>Use this method only when calling an API that returns a {@link ListenableFuture} or a
       {@code ClosingFuture}. If possible, prefer calling {@link #catching(Class,
       ClosingFunction, Executor)} instead, with a function that returns the next value
       directly.
   <li>Call {@link DeferredCloser#eventuallyClose(Object, Executor) closer.eventuallyClose()}
       for every closeable object this step creates in order to capture it for later closing.
   <li>Return a {@code ClosingFuture}. To turn a {@link ListenableFuture} into a {@code
       ClosingFuture} call {@link #from(ListenableFuture)}.
   <li>In case this step doesn't create new closeables, you can adapt an API that returns a
       {@link ListenableFuture} to return a {@code ClosingFuture} by wrapping it with a call to
       {@link #withoutCloser(AsyncFunction)}
 </ul>

 <p>Example usage:

 <pre>{@code
 // Fall back to a secondary input stream in case of IOException.
 ClosingFuture<InputStream> inputFuture =
     firstInputFuture.catchingAsync(
         IOException.class, (closer, x) -> secondaryInputStreamClosingFuture(), executor);
 }
 }</pre>

 <p>When selecting an executor, note that {@code directExecutor} is dangerous in some cases. See
 the discussion in the {@link ListenableFuture#addListener} documentation. All its warnings
 about heavyweight listeners are also applicable to heavyweight functions passed to this method.
 (Specifically, {@code directExecutor} functions should avoid heavyweight operations inside
 {@code AsyncClosingFunction.apply}. Any heavyweight operations should occur in other threads
 responsible for completing the returned {@code ClosingFuture}.)

 <p>After calling this method, you may not call {@link #finishToFuture()}, {@link #finishToValueAndCloser(ValueAndCloserConsumer, Executor)}, or any other derivation method on
 the original {@code ClosingFuture} instance.
@param exceptionType the exception type that triggers use of {@code fallback}. The exception
     type is matched against this step's exception. "This step's exception" means the cause of
     the {@link ExecutionException} thrown by {@link Future#get()} on the {@link Future}
     underlying this step or, if {@code get()} throws a different kind of exception, that
     exception itself. To avoid hiding bugs and other unrecoverable errors, callers should
     prefer more specific types, avoiding {@code Throwable.class} in particular.
@param fallback the function to be called if this step fails with the expected exception type.
     The function's argument is this step's exception. "This step's exception" means the cause
     of the {@link ExecutionException} thrown by {@link Future#get()} on the {@link Future}
     underlying this step or, if {@code get()} throws a different kind of exception, that
     exception itself.
@param executor the executor that runs {@code fallback} if the input fails

### `catchingAsyncMoreGeneric(`java.lang.Class<X>` exceptionType, [`com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<? super X,W>`](ClosingFuture/AsyncClosingFunction.md) fallback, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<V>`](./ClosingFuture.md)

### `finishToFuture()`

**Returns:** [`com.google.common.util.concurrent.FluentFuture<V>`](./FluentFuture.md)

Marks this step as the last step in the {@code ClosingFuture} pipeline.

 <p>The returned {@link Future} is completed when the pipeline's computation completes, or when
 the pipeline is cancelled.

 <p>All objects the pipeline has captured for closing will begin to be closed asynchronously
 <b>after</b> the returned {@code Future} is done: the future completes before closing starts,
 rather than once it has finished.

 <p>After calling this method, you may not call {@link #finishToValueAndCloser(ValueAndCloserConsumer, Executor)}, this method, or any other
 derivation method on the original {@code ClosingFuture} instance.
@return a {@link Future} that represents the final value or exception of the pipeline

### `finishToValueAndCloser([`com.google.common.util.concurrent.ClosingFuture.ValueAndCloserConsumer<? super V>`](ClosingFuture/ValueAndCloserConsumer.md) consumer, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** `void`

Marks this step as the last step in the {@code ClosingFuture} pipeline. When this step is done,
 {@code receiver} will be called with an object that contains the result of the operation. The
 receiver can store the {@link ValueAndCloser} outside the receiver for later synchronous use.

 <p>After calling this method, you may not call {@link #finishToFuture()}, this method again, or
 any other derivation method on the original {@code ClosingFuture} instance.
@param consumer a callback whose method will be called (using {@code executor}) when this
     operation is done

### `provideValueAndCloser([`com.google.common.util.concurrent.ClosingFuture.ValueAndCloserConsumer<C>`](ClosingFuture/ValueAndCloserConsumer.md) consumer, [`com.google.common.util.concurrent.ClosingFuture<V>`](./ClosingFuture.md) closingFuture)`

**Returns:** `void`

### `cancel(`boolean` mayInterruptIfRunning)`

**Returns:** `boolean`

Attempts to cancel execution of this step. This attempt will fail if the step has already
 completed, has already been cancelled, or could not be cancelled for some other reason. If
 successful, and this step has not started when {@code cancel} is called, this step should never
 run.

 <p>If successful, causes the objects captured by this step (if already started) and its input
 step(s) for later closing to be closed on their respective {@link Executor}s. If any such calls
 specified {@link MoreExecutors#directExecutor()}, those objects will be closed synchronously.
@param mayInterruptIfRunning {@code true} if the thread executing this task should be
     interrupted; otherwise, in-progress tasks are allowed to complete, but the step will be
     cancelled regardless
@return {@code false} if the step could not be cancelled, typically because it has already
     completed normally; {@code true} otherwise

### `close()`

**Returns:** `void`

### `derive([`com.google.common.util.concurrent.FluentFuture<U>`](./FluentFuture.md) future)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<U>`](./ClosingFuture.md)

### `becomeSubsumedInto([`com.google.common.util.concurrent.ClosingFuture.CloseableList`](ClosingFuture/CloseableList.md) otherCloseables)`

**Returns:** `void`

### `toString()`

**Returns:** `java.lang.String`

### `finalize()`

**Returns:** `void`

### `closeQuietly(`java.lang.AutoCloseable` closeable, [`java.util.concurrent.Executor`](../../../../../java/util/concurrent/Executor.md) executor)`

**Returns:** `void`

### `checkAndUpdateState([`com.google.common.util.concurrent.ClosingFuture.State`](ClosingFuture/State.md) oldState, [`com.google.common.util.concurrent.ClosingFuture.State`](ClosingFuture/State.md) newState)`

**Returns:** `void`

### `compareAndUpdateState([`com.google.common.util.concurrent.ClosingFuture.State`](ClosingFuture/State.md) oldState, [`com.google.common.util.concurrent.ClosingFuture.State`](ClosingFuture/State.md) newState)`

**Returns:** `boolean`

### `whenClosedCountDown()`

**Returns:** [`java.util.concurrent.CountDownLatch`](../../../../../java/util/concurrent/CountDownLatch.md)

Returns an object that can be used to wait until this objects' deferred closeables have all had
 {@link Runnable}s that close them submitted to each one's closing {@link Executor}.

