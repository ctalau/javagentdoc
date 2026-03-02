# Class: `ClosingFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.ClosingFuture`

## Type Parameters

- `V` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

When the last step in the computation is
 complete, some objects captured during the computation are closed.

 
A pipeline of ClosingFutures is a tree of steps. Each step represents either an
 asynchronously-computed intermediate value, or else an exception that indicates the failure or
 cancellation of the operation so far. The only way to extract the value or exception from a step
 is by declaring that step to be the last step of the pipeline. Nevertheless, we refer to the
 "value" of a successful step or the "result" (value or exception) of any step.

 

   - A pipeline starts at its leaf step (or steps), which is created from either a callable
       block or a ListenableFuture.
   - Each other step is derived from one or more input steps. At each step, zero or more objects
       can be captured for later closing.
   - There is one last step (the root of the tree), from which you can extract the final result
       of the computation. After that result is available (or the computation fails), all objects
       captured by any of the steps in the pipeline are closed.
 


 Starting a pipeline

 Start a ClosingFuture pipeline from a
 callable block that may capture objects for later closing. To start a pipeline from a ListenableFuture that doesn't create resources that should be closed later, you can use #from(ListenableFuture) instead.

 Derived steps

 A ClosingFuture step can be derived from one or more input ClosingFuture steps in
 ways similar to FluentFutures:

 

   - by transforming the value from a successful input step,
   - by catching the exception from a failed input step, or
   - by combining the results of several input steps.
 


 Each derivation can capture the next value or any intermediate objects for later closing.

 
A step can be the input to at most one derived step. Once you transform its value, catch its
 exception, or combine it with others, you cannot do anything else with it, including declare it
 to be the last step of the pipeline.

 Transforming

 To derive the next step by asynchronously applying a function to an input step's value, call
 #transform(ClosingFunction, Executor) or #transformAsync(AsyncClosingFunction,
 Executor) on the input step.

 Catching

 To derive the next step from a failed input step, call #catching(Class, ClosingFunction,
 Executor) or #catchingAsync(Class, AsyncClosingFunction, Executor) on the input step.

 Combining

 To derive a ClosingFuture from two or more input steps, pass the input steps to #whenAllComplete(Iterable) or #whenAllSucceed(Iterable) or its overloads.

 Cancelling

 Any step in a pipeline can be cancelled, even after another step
 has been derived, with the same semantics as cancelling a Future. In addition, a
 successfully cancelled step will immediately start closing all objects captured for later closing
 by it and by its input steps.

 Ending a pipeline

 Each ClosingFuture pipeline must be ended. To end a pipeline, decide whether you want to
 close the captured objects automatically or manually.

 Automatically closing

 You can extract a Future that represents the result of the last step in the pipeline by
 calling #finishToFuture(). All objects the pipeline has captured for closing will begin
 to be closed asynchronously **after** the returned Future is done: the future
 completes before closing starts, rather than once it has finished.

 

```

 FluentFuture<UserName> userName =
     ClosingFuture.submit(
             closer -> closer.eventuallyClose(database.newTransaction(), closingExecutor),
             executor)
         .transformAsync((closer, transaction) -> transaction.queryClosingFuture("..."), executor)
         .transform((closer, result) -> result.get("userName"), directExecutor())
         .catching(DBException.class, e -> "no user", directExecutor())
         .finishToFuture();
 
```


 In this example, when the userName Future is done, the transaction and the query
 result cursor will both be closed, even if the operation is cancelled or fails.

 Manually closing

 If you want to close the captured objects manually, after you've used the final result, call
 #finishToValueAndCloser(ValueAndCloserConsumer, Executor) to get an object that holds the
 final result. You then call ValueAndCloser#closeAsync() to close the captured objects.

 

```

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
 
```


 In this example, when userNameValueAndCloser.closeAsync() is called, the transaction and
 the query result cursor will both be closed, even if the operation is cancelled or fails.

 
Note that if you don't call closeAsync(), the captured objects will not be closed. The
 automatic-closing approach described above is safer.

## Fields

### `logger`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `state`

**Type:** `java.util.concurrent.atomic.AtomicReference<com.google.common.util.concurrent.ClosingFuture.State>`

### `closeables`

**Type:** `com.google.common.util.concurrent.ClosingFuture.CloseableList`

### `future`

**Type:** [`com.google.common.util.concurrent.FluentFuture<V>`](./FluentFuture.md)

## Constructors

### `<init>(com.google.common.util.concurrent.ListenableFuture<V> future)`

**Parameters:**
- `future` ([`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md))

### `<init>(com.google.common.util.concurrent.ClosingFuture.ClosingCallable<V> callable, java.util.concurrent.Executor executor)`

**Parameters:**
- `callable` (`com.google.common.util.concurrent.ClosingFuture.ClosingCallable<V>`)
- `executor` (`java.util.concurrent.Executor`)

### `<init>(com.google.common.util.concurrent.ClosingFuture.AsyncClosingCallable<V> callable, java.util.concurrent.Executor executor)`

**Parameters:**
- `callable` (`com.google.common.util.concurrent.ClosingFuture.AsyncClosingCallable<V>`)
- `executor` (`java.util.concurrent.Executor`)

## Methods

### `submit(com.google.common.util.concurrent.ClosingFuture.ClosingCallable<V> callable, java.util.concurrent.Executor executor)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<V>`](./ClosingFuture.md)

**Parameters:**
- `callable` (`com.google.common.util.concurrent.ClosingFuture.ClosingCallable<V>`)
- `executor` (`java.util.concurrent.Executor`)

### `submitAsync(com.google.common.util.concurrent.ClosingFuture.AsyncClosingCallable<V> callable, java.util.concurrent.Executor executor)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<V>`](./ClosingFuture.md)

**Parameters:**
- `callable` (`com.google.common.util.concurrent.ClosingFuture.AsyncClosingCallable<V>`)
- `executor` (`java.util.concurrent.Executor`)

### `from(com.google.common.util.concurrent.ListenableFuture<V> future)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<V>`](./ClosingFuture.md)

future's value will not be closed when the pipeline is done even if V
 implements Closeable. In order to start a pipeline with a value that will be closed
 when the pipeline is done, use #submit(ClosingCallable, Executor) instead.

**Parameters:**
- `future` ([`com.google.common.util.concurrent.ListenableFuture<V>`](./ListenableFuture.md))

### `eventuallyClosing(com.google.common.util.concurrent.ListenableFuture<C> future, java.util.concurrent.Executor closingExecutor)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<C>`](./ClosingFuture.md)

If future succeeds, its value will be closed (using closingExecutor)) when
 the pipeline is done, even if the pipeline is canceled or fails.

 
Cancelling the pipeline will not cancel future, so that the pipeline can access its
 value in order to close it.

**Parameters:**
- `future` ([`com.google.common.util.concurrent.ListenableFuture<C>`](./ListenableFuture.md)): the future to create the ClosingFuture from. For discussion of the
     future's result type C, see DeferredCloser#eventuallyClose(Object,
     Executor).
- `closingExecutor` (`java.util.concurrent.Executor`): the future's result will be closed on this executor

### `whenAllComplete(java.lang.Iterable<? extends com.google.common.util.concurrent.ClosingFuture<?>> futures)`

**Returns:** `com.google.common.util.concurrent.ClosingFuture.Combiner`

**Parameters:**
- `futures` (`java.lang.Iterable<? extends com.google.common.util.concurrent.ClosingFuture<?>>`)

### `whenAllComplete(com.google.common.util.concurrent.ClosingFuture<?> future1, com.google.common.util.concurrent.ClosingFuture<?>[] moreFutures)`

**Returns:** `com.google.common.util.concurrent.ClosingFuture.Combiner`

**Parameters:**
- `future1` ([`com.google.common.util.concurrent.ClosingFuture<?>`](./ClosingFuture.md))
- `moreFutures` ([`com.google.common.util.concurrent.ClosingFuture<?>[]`](./ClosingFuture.md))

### `whenAllSucceed(java.lang.Iterable<? extends com.google.common.util.concurrent.ClosingFuture<?>> futures)`

**Returns:** `com.google.common.util.concurrent.ClosingFuture.Combiner`

If any fail, the resulting pipeline will fail.

**Parameters:**
- `futures` (`java.lang.Iterable<? extends com.google.common.util.concurrent.ClosingFuture<?>>`)

### `whenAllSucceed(com.google.common.util.concurrent.ClosingFuture<V1> future1, com.google.common.util.concurrent.ClosingFuture<V2> future2)`

**Returns:** `com.google.common.util.concurrent.ClosingFuture.Combiner2<V1,V2>`

If any fail, the resulting pipeline will fail.

 
Calling this method allows you to use lambdas or method references typed with the types of
 the input ClosingFutures.

**Parameters:**
- `future1` ([`com.google.common.util.concurrent.ClosingFuture<V1>`](./ClosingFuture.md))
- `future2` ([`com.google.common.util.concurrent.ClosingFuture<V2>`](./ClosingFuture.md))

### `whenAllSucceed(com.google.common.util.concurrent.ClosingFuture<V1> future1, com.google.common.util.concurrent.ClosingFuture<V2> future2, com.google.common.util.concurrent.ClosingFuture<V3> future3)`

**Returns:** `com.google.common.util.concurrent.ClosingFuture.Combiner3<V1,V2,V3>`

If any fail, the resulting pipeline will fail.

 
Calling this method allows you to use lambdas or method references typed with the types of
 the input ClosingFutures.

**Parameters:**
- `future1` ([`com.google.common.util.concurrent.ClosingFuture<V1>`](./ClosingFuture.md))
- `future2` ([`com.google.common.util.concurrent.ClosingFuture<V2>`](./ClosingFuture.md))
- `future3` ([`com.google.common.util.concurrent.ClosingFuture<V3>`](./ClosingFuture.md))

### `whenAllSucceed(com.google.common.util.concurrent.ClosingFuture<V1> future1, com.google.common.util.concurrent.ClosingFuture<V2> future2, com.google.common.util.concurrent.ClosingFuture<V3> future3, com.google.common.util.concurrent.ClosingFuture<V4> future4)`

**Returns:** `com.google.common.util.concurrent.ClosingFuture.Combiner4<V1,V2,V3,V4>`

If any fail, the resulting pipeline will fail.

 
Calling this method allows you to use lambdas or method references typed with the types of
 the input ClosingFutures.

**Parameters:**
- `future1` ([`com.google.common.util.concurrent.ClosingFuture<V1>`](./ClosingFuture.md))
- `future2` ([`com.google.common.util.concurrent.ClosingFuture<V2>`](./ClosingFuture.md))
- `future3` ([`com.google.common.util.concurrent.ClosingFuture<V3>`](./ClosingFuture.md))
- `future4` ([`com.google.common.util.concurrent.ClosingFuture<V4>`](./ClosingFuture.md))

### `whenAllSucceed(com.google.common.util.concurrent.ClosingFuture<V1> future1, com.google.common.util.concurrent.ClosingFuture<V2> future2, com.google.common.util.concurrent.ClosingFuture<V3> future3, com.google.common.util.concurrent.ClosingFuture<V4> future4, com.google.common.util.concurrent.ClosingFuture<V5> future5)`

**Returns:** `com.google.common.util.concurrent.ClosingFuture.Combiner5<V1,V2,V3,V4,V5>`

If any fail, the resulting pipeline will fail.

 
Calling this method allows you to use lambdas or method references typed with the types of
 the input ClosingFutures.

**Parameters:**
- `future1` ([`com.google.common.util.concurrent.ClosingFuture<V1>`](./ClosingFuture.md))
- `future2` ([`com.google.common.util.concurrent.ClosingFuture<V2>`](./ClosingFuture.md))
- `future3` ([`com.google.common.util.concurrent.ClosingFuture<V3>`](./ClosingFuture.md))
- `future4` ([`com.google.common.util.concurrent.ClosingFuture<V4>`](./ClosingFuture.md))
- `future5` ([`com.google.common.util.concurrent.ClosingFuture<V5>`](./ClosingFuture.md))

### `whenAllSucceed(com.google.common.util.concurrent.ClosingFuture<?> future1, com.google.common.util.concurrent.ClosingFuture<?> future2, com.google.common.util.concurrent.ClosingFuture<?> future3, com.google.common.util.concurrent.ClosingFuture<?> future4, com.google.common.util.concurrent.ClosingFuture<?> future5, com.google.common.util.concurrent.ClosingFuture<?> future6, com.google.common.util.concurrent.ClosingFuture<?>[] moreFutures)`

**Returns:** `com.google.common.util.concurrent.ClosingFuture.Combiner`

If any fail, the resulting pipeline will fail.

**Parameters:**
- `future1` ([`com.google.common.util.concurrent.ClosingFuture<?>`](./ClosingFuture.md))
- `future2` ([`com.google.common.util.concurrent.ClosingFuture<?>`](./ClosingFuture.md))
- `future3` ([`com.google.common.util.concurrent.ClosingFuture<?>`](./ClosingFuture.md))
- `future4` ([`com.google.common.util.concurrent.ClosingFuture<?>`](./ClosingFuture.md))
- `future5` ([`com.google.common.util.concurrent.ClosingFuture<?>`](./ClosingFuture.md))
- `future6` ([`com.google.common.util.concurrent.ClosingFuture<?>`](./ClosingFuture.md))
- `moreFutures` ([`com.google.common.util.concurrent.ClosingFuture<?>[]`](./ClosingFuture.md))

### `statusFuture()`

**Returns:** [`com.google.common.util.concurrent.ListenableFuture<?>`](./ListenableFuture.md)

Calling get() on the returned
 future returns null if the step is successful or throws the same exception that would
 be thrown by calling finishToFuture().get() if this were the last step. Calling 
 cancel() on the returned future has no effect on the ClosingFuture pipeline.

 
statusFuture differs from most methods on ClosingFuture: You can make calls
 to statusFuture *in addition to* the call you make to #finishToFuture() or
 a derivation method *on the same instance*. This is important because calling 
 statusFuture alone does not provide a way to close the pipeline.

### `transform(com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super V,U> function, java.util.concurrent.Executor executor)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<U>`](./ClosingFuture.md)

The function can use a DeferredCloser to capture objects to be closed
 when the pipeline is done.

 
If this ClosingFuture fails, the function will not be called, and the derived 
 ClosingFuture will be equivalent to this one.

 
If the function throws an exception, that exception is used as the result of the derived
 ClosingFuture.

 
Example usage:

 

```

 ClosingFuture<List<Row>> rowsFuture =
     queryFuture.transform((closer, result) -> result.getRows(), executor);
 
```


 
When selecting an executor, note that directExecutor is dangerous in some cases. See
 the discussion in the ListenableFuture#addListener documentation. All its warnings
 about heavyweight listeners are also applicable to heavyweight functions passed to this method.

 
After calling this method, you may not call #finishToFuture(), #finishToValueAndCloser(ValueAndCloserConsumer, Executor), or any other derivation method on
 the original ClosingFuture instance.

**Parameters:**
- `function` (`com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super V,U>`): transforms the value of this step to the value of the derived step
- `executor` (`java.util.concurrent.Executor`): executor to run the function in

### `transformAsync(com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<? super V,U> function, java.util.concurrent.Executor executor)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<U>`](./ClosingFuture.md)

The function can use a DeferredCloser to capture objects to be closed when the pipeline is done (other than those
 captured by the returned ClosingFuture).

 
If this ClosingFuture succeeds, the derived one will be equivalent to the one
 returned by the function.

 
If this ClosingFuture fails, the function will not be called, and the derived 
 ClosingFuture will be equivalent to this one.

 
If the function throws an exception, that exception is used as the result of the derived
 ClosingFuture. But if the exception is thrown after the function creates a 
 ClosingFuture, then none of the closeable objects in that ClosingFuture will be
 closed.

 
Usage guidelines for this method:

 

   - Use this method only when calling an API that returns a ListenableFuture or a
       ClosingFuture. If possible, prefer calling #transform(ClosingFunction,
       Executor) instead, with a function that returns the next value directly.
   - Call closer.eventuallyClose()
       for every closeable object this step creates in order to capture it for later closing.
   - Return a ClosingFuture. To turn a ListenableFuture into a 
       ClosingFuture call #from(ListenableFuture).
   - In case this step doesn't create new closeables, you can adapt an API that returns a
       ListenableFuture to return a ClosingFuture by wrapping it with a call to
       #withoutCloser(AsyncFunction)
 


 
Example usage:

 

```

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

 
```


 
When selecting an executor, note that directExecutor is dangerous in some cases. See
 the discussion in the ListenableFuture#addListener documentation. All its warnings
 about heavyweight listeners are also applicable to heavyweight functions passed to this method.
 (Specifically, directExecutor functions should avoid heavyweight operations inside
 AsyncClosingFunction.apply. Any heavyweight operations should occur in other threads
 responsible for completing the returned ClosingFuture.)

 
After calling this method, you may not call #finishToFuture(), #finishToValueAndCloser(ValueAndCloserConsumer, Executor), or any other derivation method on
 the original ClosingFuture instance.

**Parameters:**
- `function` (`com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<? super V,U>`): transforms the value of this step to a ClosingFuture with the value of
     the derived step
- `executor` (`java.util.concurrent.Executor`): executor to run the function in

### `withoutCloser(com.google.common.util.concurrent.AsyncFunction<V,U> function)`

**Returns:** `com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<V,U>`

Use this method to pass a transformation to #transformAsync(AsyncClosingFunction,
 Executor) or to #catchingAsync(Class, AsyncClosingFunction, Executor) as long as it
 meets these conditions:

 

   - It does not need to capture any Closeable objects by calling DeferredCloser#eventuallyClose(Object, Executor).
   - It returns a ListenableFuture.
 


 
Example usage:

 

```

 // Result.getRowsFuture() returns a ListenableFuture.
 ClosingFuture<List<Row>> rowsFuture =
     queryFuture.transformAsync(withoutCloser(Result::getRowsFuture), executor);
 
```

**Parameters:**
- `function` ([`com.google.common.util.concurrent.AsyncFunction<V,U>`](./AsyncFunction.md)): transforms the value of a ClosingFuture step to a ListenableFuture with the value of a derived step

### `catching(java.lang.Class<X> exceptionType, com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super X,? extends V> fallback, java.util.concurrent.Executor executor)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<V>`](./ClosingFuture.md)

The function can use a DeferredCloser to capture objects to be closed when the pipeline is done.

 
If this ClosingFuture succeeds or fails with a different exception type, the
 function will not be called, and the derived ClosingFuture will be equivalent to this
 one.

 
If the function throws an exception, that exception is used as the result of the derived
 ClosingFuture.

 
Example usage:

 

```

 ClosingFuture<QueryResult> queryFuture =
     queryFuture.catching(
         QueryException.class, (closer, x) -> Query.emptyQueryResult(), executor);
 
```


 
When selecting an executor, note that directExecutor is dangerous in some cases. See
 the discussion in the ListenableFuture#addListener documentation. All its warnings
 about heavyweight listeners are also applicable to heavyweight functions passed to this method.

 
After calling this method, you may not call #finishToFuture(), #finishToValueAndCloser(ValueAndCloserConsumer, Executor), or any other derivation method on
 the original ClosingFuture instance.

**Parameters:**
- `exceptionType` (`java.lang.Class<X>`): the exception type that triggers use of fallback. The exception
     type is matched against this step's exception. "This step's exception" means the cause of
     the ExecutionException thrown by Future#get() on the Future
     underlying this step or, if get() throws a different kind of exception, that
     exception itself. To avoid hiding bugs and other unrecoverable errors, callers should
     prefer more specific types, avoiding Throwable.class in particular.
- `fallback` (`com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super X,? extends V>`): the function to be called if this step fails with the expected exception type.
     The function's argument is this step's exception. "This step's exception" means the cause
     of the ExecutionException thrown by Future#get() on the Future
     underlying this step or, if get() throws a different kind of exception, that
     exception itself.
- `executor` (`java.util.concurrent.Executor`): the executor that runs fallback if the input fails

### `catchingMoreGeneric(java.lang.Class<X> exceptionType, com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super X,W> fallback, java.util.concurrent.Executor executor)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<V>`](./ClosingFuture.md)

**Parameters:**
- `exceptionType` (`java.lang.Class<X>`)
- `fallback` (`com.google.common.util.concurrent.ClosingFuture.ClosingFunction<? super X,W>`)
- `executor` (`java.util.concurrent.Executor`)

### `catchingAsync(java.lang.Class<X> exceptionType, com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<? super X,? extends V> fallback, java.util.concurrent.Executor executor)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<V>`](./ClosingFuture.md)

The function can use a DeferredCloser to capture objects to be closed when the
 pipeline is done (other than those captured by the returned ClosingFuture).

 
If this ClosingFuture fails with an exception of the given type, the derived 
 ClosingFuture will be equivalent to the one returned by the function.

 
If this ClosingFuture succeeds or fails with a different exception type, the
 function will not be called, and the derived ClosingFuture will be equivalent to this
 one.

 
If the function throws an exception, that exception is used as the result of the derived
 ClosingFuture. But if the exception is thrown after the function creates a 
 ClosingFuture, then none of the closeable objects in that ClosingFuture will be
 closed.

 
Usage guidelines for this method:

 

   - Use this method only when calling an API that returns a ListenableFuture or a
       ClosingFuture. If possible, prefer calling #catching(Class,
       ClosingFunction, Executor) instead, with a function that returns the next value
       directly.
   - Call closer.eventuallyClose()
       for every closeable object this step creates in order to capture it for later closing.
   - Return a ClosingFuture. To turn a ListenableFuture into a 
       ClosingFuture call #from(ListenableFuture).
   - In case this step doesn't create new closeables, you can adapt an API that returns a
       ListenableFuture to return a ClosingFuture by wrapping it with a call to
       #withoutCloser(AsyncFunction)
 


 
Example usage:

 

```

 // Fall back to a secondary input stream in case of IOException.
 ClosingFuture<InputStream> inputFuture =
     firstInputFuture.catchingAsync(
         IOException.class, (closer, x) -> secondaryInputStreamClosingFuture(), executor);
 
 }
```


 
When selecting an executor, note that directExecutor is dangerous in some cases. See
 the discussion in the ListenableFuture#addListener documentation. All its warnings
 about heavyweight listeners are also applicable to heavyweight functions passed to this method.
 (Specifically, directExecutor functions should avoid heavyweight operations inside
 AsyncClosingFunction.apply. Any heavyweight operations should occur in other threads
 responsible for completing the returned ClosingFuture.)

 
After calling this method, you may not call #finishToFuture(), #finishToValueAndCloser(ValueAndCloserConsumer, Executor), or any other derivation method on
 the original ClosingFuture instance.

**Parameters:**
- `exceptionType` (`java.lang.Class<X>`): the exception type that triggers use of fallback. The exception
     type is matched against this step's exception. "This step's exception" means the cause of
     the ExecutionException thrown by Future#get() on the Future
     underlying this step or, if get() throws a different kind of exception, that
     exception itself. To avoid hiding bugs and other unrecoverable errors, callers should
     prefer more specific types, avoiding Throwable.class in particular.
- `fallback` (`com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<? super X,? extends V>`): the function to be called if this step fails with the expected exception type.
     The function's argument is this step's exception. "This step's exception" means the cause
     of the ExecutionException thrown by Future#get() on the Future
     underlying this step or, if get() throws a different kind of exception, that
     exception itself.
- `executor` (`java.util.concurrent.Executor`): the executor that runs fallback if the input fails

### `catchingAsyncMoreGeneric(java.lang.Class<X> exceptionType, com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<? super X,W> fallback, java.util.concurrent.Executor executor)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<V>`](./ClosingFuture.md)

**Parameters:**
- `exceptionType` (`java.lang.Class<X>`)
- `fallback` (`com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction<? super X,W>`)
- `executor` (`java.util.concurrent.Executor`)

### `finishToFuture()`

**Returns:** [`com.google.common.util.concurrent.FluentFuture<V>`](./FluentFuture.md)

The returned Future is completed when the pipeline's computation completes, or when
 the pipeline is cancelled.

 
All objects the pipeline has captured for closing will begin to be closed asynchronously
 **after** the returned Future is done: the future completes before closing starts,
 rather than once it has finished.

 
After calling this method, you may not call #finishToValueAndCloser(ValueAndCloserConsumer, Executor), this method, or any other
 derivation method on the original ClosingFuture instance.

### `finishToValueAndCloser(com.google.common.util.concurrent.ClosingFuture.ValueAndCloserConsumer<? super V> consumer, java.util.concurrent.Executor executor)`

**Returns:** `void`

When this step is done,
 receiver will be called with an object that contains the result of the operation. The
 receiver can store the ValueAndCloser outside the receiver for later synchronous use.

 
After calling this method, you may not call #finishToFuture(), this method again, or
 any other derivation method on the original ClosingFuture instance.

**Parameters:**
- `consumer` (`com.google.common.util.concurrent.ClosingFuture.ValueAndCloserConsumer<? super V>`): a callback whose method will be called (using executor) when this
     operation is done
- `executor` (`java.util.concurrent.Executor`)

### `provideValueAndCloser(com.google.common.util.concurrent.ClosingFuture.ValueAndCloserConsumer<C> consumer, com.google.common.util.concurrent.ClosingFuture<V> closingFuture)`

**Returns:** `void`

**Parameters:**
- `consumer` (`com.google.common.util.concurrent.ClosingFuture.ValueAndCloserConsumer<C>`)
- `closingFuture` ([`com.google.common.util.concurrent.ClosingFuture<V>`](./ClosingFuture.md))

### `cancel(boolean mayInterruptIfRunning)`

**Returns:** `boolean`

This attempt will fail if the step has already
 completed, has already been cancelled, or could not be cancelled for some other reason. If
 successful, and this step has not started when cancel is called, this step should never
 run.

 
If successful, causes the objects captured by this step (if already started) and its input
 step(s) for later closing to be closed on their respective Executors. If any such calls
 specified MoreExecutors#directExecutor(), those objects will be closed synchronously.

**Parameters:**
- `mayInterruptIfRunning` (`boolean`): true if the thread executing this task should be
     interrupted; otherwise, in-progress tasks are allowed to complete, but the step will be
     cancelled regardless

### `close()`

**Returns:** `void`

### `derive(com.google.common.util.concurrent.FluentFuture<U> future)`

**Returns:** [`com.google.common.util.concurrent.ClosingFuture<U>`](./ClosingFuture.md)

**Parameters:**
- `future` ([`com.google.common.util.concurrent.FluentFuture<U>`](./FluentFuture.md))

### `becomeSubsumedInto(com.google.common.util.concurrent.ClosingFuture.CloseableList otherCloseables)`

**Returns:** `void`

**Parameters:**
- `otherCloseables` (`com.google.common.util.concurrent.ClosingFuture.CloseableList`)

### `toString()`

**Returns:** `java.lang.String`

### `finalize()`

**Returns:** `void`

### `closeQuietly(java.lang.AutoCloseable closeable, java.util.concurrent.Executor executor)`

**Returns:** `void`

**Parameters:**
- `closeable` (`java.lang.AutoCloseable`)
- `executor` (`java.util.concurrent.Executor`)

### `checkAndUpdateState(com.google.common.util.concurrent.ClosingFuture.State oldState, com.google.common.util.concurrent.ClosingFuture.State newState)`

**Returns:** `void`

**Parameters:**
- `oldState` (`com.google.common.util.concurrent.ClosingFuture.State`)
- `newState` (`com.google.common.util.concurrent.ClosingFuture.State`)

### `compareAndUpdateState(com.google.common.util.concurrent.ClosingFuture.State oldState, com.google.common.util.concurrent.ClosingFuture.State newState)`

**Returns:** `boolean`

**Parameters:**
- `oldState` (`com.google.common.util.concurrent.ClosingFuture.State`)
- `newState` (`com.google.common.util.concurrent.ClosingFuture.State`)

### `whenClosedCountDown()`

**Returns:** `java.util.concurrent.CountDownLatch`

