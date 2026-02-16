# Class: `ForwardingIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingIterator`

**Extends:** [`com.google.common.collect.ForwardingObject`](./ForwardingObject.md)

**Implements:** [`java.util.Iterator<T>`](../../../../java/util/Iterator.md)

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An iterator which forwards all its method calls to another iterator. Subclasses should override
 one or more methods to modify the behavior of the backing iterator as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>{@code default} method warning:</b> This class forwards calls to <i>only some</i> {@code
 default} methods. Specifically, it forwards calls only for methods that existed <a href="https://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html">before {@code default}
 methods were introduced</a>. For newer methods, like {@code forEachRemaining}, it inherits their
 default implementations. When those implementations invoke methods, they invoke methods on the
 {@code ForwardingIterator}.
@author Kevin Bourrillion
@since 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** [`java.util.Iterator<T>`](../../../../java/util/Iterator.md)

### `hasNext()`

**Returns:** `boolean`

### `next()`

**Returns:** [`T`](T.md)

### `remove()`

**Returns:** `void`

