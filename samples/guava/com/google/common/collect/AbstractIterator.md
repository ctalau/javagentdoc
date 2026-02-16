# Class: `AbstractIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractIterator`

**Extends:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

This class provides a skeletal implementation of the {@code Iterator} interface, to make this
 interface easier to implement for certain types of data sources.

 <p>{@code Iterator} requires its implementations to support querying the end-of-data status
 without changing the iterator's state, using the {@link #hasNext} method. But many data sources,
 such as {@link java.io.Reader#read()}, do not expose this information; the only way to discover
 whether there is any data left is by trying to retrieve it. These types of data sources are
 ordinarily difficult to write iterators for. But using this class, one must implement only the
 {@link #computeNext} method, and invoke the {@link #endOfData} method when appropriate.

 <p>Another example is an iterator that skips over null elements in a backing iterator. This could
 be implemented as:

 <pre>{@code
 public static Iterator<String> skipNulls(final Iterator<String> in) {
   return new AbstractIterator<String>() {
     protected String computeNext() {
       while (in.hasNext()) {
         String s = in.next();
         if (s != null) {
           return s;
         }
       }
       return endOfData();
     }
   };
 }
 }</pre>

 <p>This class supports iterators that include null elements.
@author Kevin Bourrillion
@since 2.0

## Fields

### `state`

**Type:** [`com.google.common.collect.AbstractIterator.State`](AbstractIterator/State.md)

### `next`

**Type:** [`T`](T.md)

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `computeNext()`

**Returns:** [`T`](T.md)

Returns the next element. <b>Note:</b> the implementation must call {@link #endOfData()} when
 there are no elements left in the iteration. Failure to do so could result in an infinite loop.

 <p>The initial invocation of {@link #hasNext()} or {@link #next()} calls this method, as does
 the first invocation of {@code hasNext} or {@code next} following each successful call to
 {@code next}. Once the implementation either invokes {@code endOfData} or throws an exception,
 {@code computeNext} is guaranteed to never be called again.

 <p>If this method throws an exception, it will propagate outward to the {@code hasNext} or
 {@code next} invocation that invoked this method. Any further attempts to use the iterator will
 result in an {@link IllegalStateException}.

 <p>The implementation of this method may not invoke the {@code hasNext}, {@code next}, or
 {@link #peek()} methods on this instance; if it does, an {@code IllegalStateException} will
 result.
@return the next element if there was one. If {@code endOfData} was called during execution,
     the return value will be ignored.
@throws RuntimeException if any unrecoverable error happens. This exception will propagate
     outward to the {@code hasNext()}, {@code next()}, or {@code peek()} invocation that invoked
     this method. Any further attempts to use the iterator will result in an {@link IllegalStateException}.

### `endOfData()`

**Returns:** [`T`](T.md)

Implementations of {@link #computeNext} <b>must</b> invoke this method when there are no
 elements left in the iteration.
@return {@code null}; a convenience so your {@code computeNext} implementation can use the
     simple statement {@code return endOfData();}

### `hasNext()`

**Returns:** `boolean`

### `tryToComputeNext()`

**Returns:** `boolean`

### `next()`

**Returns:** [`T`](T.md)

### `peek()`

**Returns:** [`T`](T.md)

Returns the next element in the iteration without advancing the iteration, according to the
 contract of {@link PeekingIterator#peek()}.

 <p>Implementations of {@code AbstractIterator} that wish to expose this functionality should
 implement {@code PeekingIterator}.

