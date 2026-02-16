# Class: `ReverseOrdering`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ReverseOrdering`

**Extends:** [`com.google.common.collect.Ordering<T>`](./Ordering.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Type Parameters

- `T` extends `java.lang.@org.checkerframework.checker.nullness.qual.Nullable Object`

## Description

An ordering that uses the reverse of a given order.

## Fields

### `forwardOrder`

**Type:** [`com.google.common.collect.Ordering<? super T>`](./Ordering.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>([`com.google.common.collect.Ordering<? super T>`](./Ordering.md) forwardOrder)`

## Methods

### `compare([`T`](T.md) a, [`T`](T.md) b)`

**Returns:** `int`

### `reverse()`

**Returns:** [`com.google.common.collect.Ordering<S>`](./Ordering.md)

### `min([`E`](E.md) a, [`E`](E.md) b)`

**Returns:** [`E`](E.md)

### `min([`E`](E.md) a, [`E`](E.md) b, [`E`](E.md) c, [`E[]`](E.md) rest)`

**Returns:** [`E`](E.md)

### `min([`java.util.Iterator<E>`](../../../../java/util/Iterator.md) iterator)`

**Returns:** [`E`](E.md)

### `min(`java.lang.Iterable<E>` iterable)`

**Returns:** [`E`](E.md)

### `max([`E`](E.md) a, [`E`](E.md) b)`

**Returns:** [`E`](E.md)

### `max([`E`](E.md) a, [`E`](E.md) b, [`E`](E.md) c, [`E[]`](E.md) rest)`

**Returns:** [`E`](E.md)

### `max([`java.util.Iterator<E>`](../../../../java/util/Iterator.md) iterator)`

**Returns:** [`E`](E.md)

### `max(`java.lang.Iterable<E>` iterable)`

**Returns:** [`E`](E.md)

### `hashCode()`

**Returns:** `int`

### `equals(`java.lang.Object` object)`

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

