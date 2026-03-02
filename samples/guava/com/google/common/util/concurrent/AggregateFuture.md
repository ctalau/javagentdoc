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

### `<init>(com.google.common.collect.ImmutableCollection<? extends com.google.common.util.concurrent.ListenableFuture<? extends InputT>> futures, boolean allMustSucceed, boolean collectsValues)`

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

**Returns:** `void`

This method performs the "real"
 initialization; we can't put this in the constructor because, in the case where futures are
 already complete, we would not initialize the subclass before calling #collectValueFromNonCancelledFuture. As this is called after the subclass is constructed,
 we're guaranteed to have properly initialized the subclass.

### `handleException(java.lang.Throwable throwable)`

**Returns:** `void`

Also, logs the
 throwable if it is an Error or if #allMustSucceed is true, the
 throwable did not cause this future to fail, and it is the first time we've seen that
 particular Throwable.

**Parameters:**
- `throwable` (`java.lang.Throwable`)

### `log(java.lang.Throwable throwable)`

**Returns:** `void`

**Parameters:**
- `throwable` (`java.lang.Throwable`)

### `addInitialException(java.util.Set<java.lang.Throwable> seen)`

**Returns:** `void`

**Parameters:**
- `seen` (`java.util.Set<java.lang.Throwable>`)

### `collectValueFromNonCancelledFuture(int index, java.util.concurrent.Future<? extends InputT> future)`

**Returns:** `void`

The input must not have been
 cancelled. For details on when this is called, see #collectOneValue.

**Parameters:**
- `index` (`int`)
- `future` (`java.util.concurrent.Future<? extends InputT>`)

### `decrementCountAndMaybeComplete(com.google.common.collect.ImmutableCollection<? extends java.util.concurrent.Future<? extends InputT>> futuresIfNeedToCollectAtCompletion)`

**Returns:** `void`

**Parameters:**
- `futuresIfNeedToCollectAtCompletion` ([`com.google.common.collect.ImmutableCollection<? extends java.util.concurrent.Future<? extends InputT>>`](../../collect/ImmutableCollection.md))

### `processCompleted(com.google.common.collect.ImmutableCollection<? extends java.util.concurrent.Future<? extends InputT>> futuresIfNeedToCollectAtCompletion)`

**Returns:** `void`

**Parameters:**
- `futuresIfNeedToCollectAtCompletion` ([`com.google.common.collect.ImmutableCollection<? extends java.util.concurrent.Future<? extends InputT>>`](../../collect/ImmutableCollection.md))

### `releaseResources(com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason reason)`

**Returns:** `void`

Often called multiple times (that is, both when the inputs complete and when the output
 completes).

 
This is similar to our proposed afterCommit method but not quite the same. See the
 description of CL 265462958.

**Parameters:**
- `reason` (`com.google.common.util.concurrent.AggregateFuture.ReleaseResourcesReason`)

### `collectOneValue(int index, InputT returnValue)`

**Returns:** `void`

**Parameters:**
- `index` (`int`)
- `returnValue` (`InputT`)

### `handleAllCompleted()`

**Returns:** `void`

### `addCausalChain(java.util.Set<java.lang.Throwable> seen, java.lang.Throwable param)`

**Returns:** `boolean`

**Parameters:**
- `seen` (`java.util.Set<java.lang.Throwable>`)
- `param` (`java.lang.Throwable`)

