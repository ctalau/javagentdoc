# Class: `ForwardingListIterator`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ForwardingListIterator`

**Extends:** [`com.google.common.collect.ForwardingIterator<E>`](./ForwardingIterator.md)

**Implements:** `java.util.ListIterator<E>`

## Type Parameters

- `E` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

Subclasses should
 override one or more methods to modify the behavior of the backing iterator as desired per the [decorator pattern](http://en.wikipedia.org/wiki/Decorator_pattern).

 
**default method warning:** This class forwards calls to *only some* 
 default methods. Specifically, it forwards calls only for methods that existed [before 
 default methods were introduced](https://docs.oracle.com/javase/7/docs/api/java/util/ListIterator.html). For newer methods, like forEachRemaining, it
 inherits their default implementations. When those implementations invoke methods, they invoke
 methods on the ForwardingListIterator.

## Constructors

### `<init>()`

## Methods

### `delegate()`

**Returns:** `java.util.ListIterator<E>`

### `add(E element)`

**Returns:** `void`

**Parameters:**
- `element` (`E`)

### `hasPrevious()`

**Returns:** `boolean`

### `nextIndex()`

**Returns:** `int`

### `previous()`

**Returns:** `E`

### `previousIndex()`

**Returns:** `int`

### `set(E element)`

**Returns:** `void`

**Parameters:**
- `element` (`E`)

