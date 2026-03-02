# Class: `AbstractIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.AbstractIterator`

**Extends:** [`com.google.common.collect.UnmodifiableIterator<T>`](./UnmodifiableIterator.md)

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Iterator requires its implementations to support querying the end-of-data status
 without changing the iterator's state, using the #hasNext method. But many data sources,
 such as java.io.Reader#read(), do not expose this information; the only way to discover
 whether there is any data left is by trying to retrieve it. These types of data sources are
 ordinarily difficult to write iterators for. But using this class, one must implement only the
 #computeNext method, and invoke the #endOfData method when appropriate.

 
Another example is an iterator that skips over null elements in a backing iterator. This could
 be implemented as:

 

```

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
 
```


 
This class supports iterators that include null elements.

## Fields

### `state`

**Type:** `com.google.common.collect.AbstractIterator.State`

### `next`

**Type:** `T`

## Constructors

### `<init>()`

## Methods

### `computeNext()`

**Returns:** `T`

**Note:** the implementation must call #endOfData() when
 there are no elements left in the iteration. Failure to do so could result in an infinite loop.

 
The initial invocation of #hasNext() or #next() calls this method, as does
 the first invocation of hasNext or next following each successful call to
 next. Once the implementation either invokes endOfData or throws an exception,
 computeNext is guaranteed to never be called again.

 
If this method throws an exception, it will propagate outward to the hasNext or
 next invocation that invoked this method. Any further attempts to use the iterator will
 result in an IllegalStateException.

 
The implementation of this method may not invoke the hasNext, next, or
 #peek() methods on this instance; if it does, an IllegalStateException will
 result.

### `endOfData()`

**Returns:** `T`

### `hasNext()`

**Returns:** `boolean`

### `tryToComputeNext()`

**Returns:** `boolean`

### `next()`

**Returns:** `T`

### `peek()`

**Returns:** `T`

Implementations of AbstractIterator that wish to expose this functionality should
 implement PeekingIterator.

