# Class: `ForwardingIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingIterator`

**Extends:** [`com.google.common.collect.ForwardingObject`](./ForwardingObject.md)

**Implements:** `java.util.Iterator<T>`

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Subclasses should override
 one or more methods to modify the behavior of the backing iterator as desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**default method warning:** This class forwards calls to *only some* 
 default methods. Specifically, it forwards calls only for methods that existed [before default
 methods were introduced](https://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html). For newer methods, like forEachRemaining, it inherits their
 default implementations. When those implementations invoke methods, they invoke methods on the
 ForwardingIterator.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.util.Iterator<T>`

### `hasNext()`

**Returns:** `boolean`

### `next()`

**Returns:** `T`

### `remove()`

**Returns:** `void`

