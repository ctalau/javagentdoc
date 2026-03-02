# Class: `AggregateFuture`

**Package:** [`com.google.common.util.concurrent`](README.md)

**Fully Qualified Name:** `com.google.common.util.concurrent.AggregateFuture`

**Extends:** [`com.google.common.util.concurrent.AggregateFutureState<OutputT>`](./AggregateFutureState.md)

## Type Parameters

- `InputT` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`
- `OutputT` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

## Fields

### `logger`

**Type:** [`com.google.common.util.concurrent.LazyLogger`](./LazyLogger.md)

### `futures`

**Type:** [`com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>>`](../../collect/ImmutableCollection.md)

After #init, this field is read only by #afterDone() (to
 propagate cancellation) and #toString(). To access the futures' *values*, 
 AggregateFuture attaches listeners that hold references to one or more inputs. And in the case
 of CombinedFuture, the user-supplied callback usually has its own references to inputs.

### `allMustSucceed`

**Type:** `boolean`

### `collectsValues`

**Type:** `boolean`

## Constructors

### `<init>(ImmutableCollection<? extends ListenableFuture<? extends InputT>> futures, boolean allMustSucceed, boolean collectsValues)`

**Parameters:**
- `futures` ([`com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>>`](../../collect/ImmutableCollection.md))
- `allMustSucceed` (`boolean`)
- `collectsValues` (`boolean`)

## Methods

### `afterDone()`

**Returns:** `void`

### `pendingToString()`

**Returns:** `java.lang.String`

### `init()`

This method performs the "real"
 initialization; we can't put this in the constructor because, in the case where futures are
 already complete, we would not initialize the subclass before calling #collectValueFromNonCancelledFuture. As this is called after the subclass is constructed,
 we're guaranteed to have properly initialized the subclass.

**Returns:** `void`

### `handleException(Throwable throwable)`

Also, logs the
 throwable if it is an Error or if #allMustSucceed is true, the
 throwable did not cause this future to fail, and it is the first time we've seen that
 particular Throwable.

**Parameters:**
- `throwable` (`java.lang.Throwable`)

**Returns:** `void`

### `log(Throwable throwable)`

**Parameters:**
- `throwable` (`java.lang.Throwable`)

**Returns:** `void`

### `addInitialException(Set<Throwable> seen)`

**Parameters:**
- `seen` (`java.util.Set<java.lang.Throwable>`)

**Returns:** `void`

### `collectValueFromNonCancelledFuture(int index, Future<? extends InputT> future)`

The input must not have been
 cancelled. For details on when this is called, see #collectOneValue.

**Parameters:**
- `index` (`int`)
- `future` (`java.util.concurrent.Future<? extends InputT>`)

**Returns:** `void`

### `decrementCountAndMaybeComplete(ImmutableCollection<? extends Future<? extends InputT>> futuresIfNeedToCollectAtCompletion)`

**Parameters:**
- `futuresIfNeedToCollectAtCompletion` ([`com.google.common.collect.ImmutableCollection<? extends java.util.concurrent.Future<? extends InputT>>`](../../collect/ImmutableCollection.md))

**Returns:** `void`

### `processCompleted(ImmutableCollection<? extends Future<? extends InputT>> futuresIfNeedToCollectAtCompletion)`

**Parameters:**
- `futuresIfNeedToCollectAtCompletion` ([`com.google.common.collect.ImmutableCollection<? extends java.util.concurrent.Future<? extends InputT>>`](../../collect/ImmutableCollection.md))

**Returns:** `void`

### `releaseResources(AggregateFuture.ReleaseResourcesReason reason)`

Often called multiple times (that is, both when the inputs complete and when the output
 completes).

 
This is similar to our proposed afterCommit method but not quite the same. See the
 description of CL 265462958.

**Parameters:**
- `reason` (`com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason`)

**Returns:** `void`

### `collectOneValue(int index, InputT returnValue)`

**Parameters:**
- `index` (`int`)
- `returnValue` (`InputT`)

**Returns:** `void`

### `handleAllCompleted()`

**Returns:** `void`

### `addCausalChain(Set<Throwable> seen, Throwable param)`

**Parameters:**
- `seen` (`java.util.Set<java.lang.Throwable>`)
- `param` (`java.lang.Throwable`)

**Returns:** `boolean`

