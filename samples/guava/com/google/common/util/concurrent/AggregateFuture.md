# Class: `AggregateFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AggregateFuture`

**Extends:** [`com.google.common.util.concurrent.AggregateFutureState<OutputT>`](./AggregateFutureState.md)

## Type Parameters

- `InputT` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `OutputT` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A future whose value is derived from a collection of input futures.
@param <InputT> the type of the individual inputs
@param <OutputT> the type of the output (i.e. this) future

## Fields

### `logger`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `futures`

**Type:** [`com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>>`](../../collect/ImmutableCollection>.md)

The input futures. After {@link #init}, this field is read only by {@link #afterDone()} (to
 propagate cancellation) and {@link #toString()}. To access the futures' <i>values</i>, {@code
 AggregateFuture} attaches listeners that hold references to one or more inputs. And in the case
 of {@link CombinedFuture}, the user-supplied callback usually has its own references to inputs.

### `allMustSucceed`

**Type:** `boolean`

### `collectsValues`

**Type:** `boolean`

## Constructors

### `<init>([`com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>>`](../../collect/ImmutableCollection>.md) futures, `boolean` allMustSucceed, `boolean` collectsValues)`

## Methods

### `afterDone()`

**Returns:** `void`

### `pendingToString()`

**Returns:** `java.lang.String`

### `init()`

**Returns:** `void`

Must be called at the end of each subclass's constructor. This method performs the "real"
 initialization; we can't put this in the constructor because, in the case where futures are
 already complete, we would not initialize the subclass before calling {@link #collectValueFromNonCancelledFuture}. As this is called after the subclass is constructed,
 we're guaranteed to have properly initialized the subclass.

### `handleException(`java.lang.Throwable` throwable)`

**Returns:** `void`

Fails this future with the given Throwable if {@link #allMustSucceed} is true. Also, logs the
 throwable if it is an {@link Error} or if {@link #allMustSucceed} is {@code true}, the
 throwable did not cause this future to fail, and it is the first time we've seen that
 particular Throwable.

### `log(`java.lang.Throwable` throwable)`

**Returns:** `void`

### `addInitialException([`java.util.Set<java.lang.Throwable>`](../../../../../java/util/Set.md) seen)`

**Returns:** `void`

### `collectValueFromNonCancelledFuture(`int` index, [`java.util.concurrent.Future<? extends InputT>`](../../../../../java/util/concurrent/Future.md) future)`

**Returns:** `void`

Collects the result (success or failure) of one input future. The input must not have been
 cancelled. For details on when this is called, see {@link #collectOneValue}.

### `decrementCountAndMaybeComplete([`com.google.common.collect.ImmutableCollection<? extends java.util.concurrent.Future<? extends InputT>>`](../../collect/ImmutableCollection>.md) futuresIfNeedToCollectAtCompletion)`

**Returns:** `void`

### `processCompleted([`com.google.common.collect.ImmutableCollection<? extends java.util.concurrent.Future<? extends InputT>>`](../../collect/ImmutableCollection>.md) futuresIfNeedToCollectAtCompletion)`

**Returns:** `void`

### `releaseResources([`com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason`](AggregateFuture/ReleaseResourcesReason.md) reason)`

**Returns:** `void`

Clears fields that are no longer needed after this future has completed -- or at least all its
 inputs have completed (more precisely, after {@link #handleAllCompleted()} has been called).
 Often called multiple times (that is, both when the inputs complete and when the output
 completes).

 <p>This is similar to our proposed {@code afterCommit} method but not quite the same. See the
 description of CL 265462958.

### `collectOneValue(`int` index, [`InputT`](InputT.md) returnValue)`

**Returns:** `void`

If {@code allMustSucceed} is true, called as each future completes; otherwise, if {@code
 collectsValues} is true, called for each future when all futures complete.

### `handleAllCompleted()`

**Returns:** `void`

### `addCausalChain([`java.util.Set<java.lang.Throwable>`](../../../../../java/util/Set.md) seen, `java.lang.Throwable` param)`

**Returns:** `boolean`

Adds the chain to the seen set, and returns whether all the chain was new to us.

