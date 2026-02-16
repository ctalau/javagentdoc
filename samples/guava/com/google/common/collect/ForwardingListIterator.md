# Class: `ForwardingListIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingListIterator`

**Extends:** [`com.google.common.collect.ForwardingIterator<E>`](./ForwardingIterator.md)

**Implements:** `java.util.ListIterator<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

A list iterator which forwards all its method calls to another list iterator. Subclasses should
 override one or more methods to modify the behavior of the backing iterator as desired per the <a href="http://en.wikipedia.org/wiki/Decorator_pattern">decorator pattern</a>.

 <p><b>`default` method warning:</b> This class forwards calls to <i>only some</i> `default` methods. Specifically, it forwards calls only for methods that existed <a href="https://docs.oracle.com/javase/7/docs/api/java/util/ListIterator.html">before `default` methods were introduced</a>. For newer methods, like `forEachRemaining`, it
 inherits their default implementations. When those implementations invoke methods, they invoke
 methods on the `ForwardingListIterator`.
**Author:** Mike Bostock
**Since:** 2.0

## Constructors

### `<init>()`

Constructor for use by subclasses.

## Methods

### `delegate()`

**Returns:** `java.util.ListIterator<E>`

### `add(`E` element)`

**Returns:** `void`

### `hasPrevious()`

**Returns:** `boolean`

### `nextIndex()`

**Returns:** `int`

### `previous()`

**Returns:** `E`

### `previousIndex()`

**Returns:** `int`

### `set(`E` element)`

**Returns:** `void`

