# Class: `AbstractIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractIterator`

**Extends:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

This class provides a skeletal implementation of the `Iterator` interface, to make this
 interface easier to implement for certain types of data sources.

 <p>`Iterator` requires its implementations to support querying the end-of-data status
 without changing the iterator's state, using the `hasNext` method. But many data sources,
 such as `java.io.Reader.read()`, do not expose this information; the only way to discover
 whether there is any data left is by trying to retrieve it. These types of data sources are
 ordinarily difficult to write iterators for. But using this class, one must implement only the
 `computeNext` method, and invoke the `endOfData` method when appropriate.

 <p>Another example is an iterator that skips over null elements in a backing iterator. This could
 be implemented as:

 <pre>`public static Iterator<String> skipNulls(final Iterator<String> in) {
   return new AbstractIterator<String>() {
     protected String computeNext() {
       while (in.hasNext()) {
         String s = in.next();
         if (s != null) {
           return s;
         `
       }
       return endOfData();
     }
   };
 }
 }</pre>

 <p>This class supports iterators that include null elements.
**Author:** Kevin Bourrillion
**Since:** 2.0

## Fields

### `state`

**Type:** [`com.google.common.collect.AbstractIterator.State`](AbstractIterator/State.md)

### `next`

**Type:** `T`

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `computeNext()`

**Returns:** `T`

Returns the next element. <b>Note:</b> the implementation must call `endOfData()` when
 there are no elements left in the iteration. Failure to do so could result in an infinite loop.

 <p>The initial invocation of `hasNext()` or `next()` calls this method, as does
 the first invocation of `hasNext` or `next` following each successful call to
 `next`. Once the implementation either invokes `endOfData` or throws an exception,
 `computeNext` is guaranteed to never be called again.

 <p>If this method throws an exception, it will propagate outward to the `hasNext` or
 `next` invocation that invoked this method. Any further attempts to use the iterator will
 result in an `IllegalStateException`.

 <p>The implementation of this method may not invoke the `hasNext`, `next`, or
 `peek()` methods on this instance; if it does, an `IllegalStateException` will
 result.
@return the next element if there was one. If `endOfData` was called during execution,
     the return value will be ignored.
@throws RuntimeException if any unrecoverable error happens. This exception will propagate
     outward to the `hasNext()`, `next()`, or `peek()` invocation that invoked
     this method. Any further attempts to use the iterator will result in an `IllegalStateException`.

### `endOfData()`

**Returns:** `T`

Implementations of `computeNext` <b>must</b> invoke this method when there are no
 elements left in the iteration.
@return `null`; a convenience so your `computeNext` implementation can use the
     simple statement `return endOfData();`

### `hasNext()`

**Returns:** `boolean`

### `tryToComputeNext()`

**Returns:** `boolean`

### `next()`

**Returns:** `T`

### `peek()`

**Returns:** `T`

Returns the next element in the iteration without advancing the iteration, according to the
 contract of `PeekingIterator.peek()`.

 <p>Implementations of `AbstractIterator` that wish to expose this functionality should
 implement `PeekingIterator`.

