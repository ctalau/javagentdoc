# Class: `ReverseNaturalOrdering`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ReverseNaturalOrdering`

**Extends:** [`com.google.common.collect.Ordering<java.lang.Comparable<?>>`](./Ordering>.md)

**Implements:** [`java.io.Serializable`](../../../../java/io/Serializable.md)

## Description

An ordering that uses the reverse of the natural order of the values.

## Fields

### `INSTANCE`

**Type:** [`com.google.common.collect.ReverseNaturalOrdering`](./ReverseNaturalOrdering.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `compare(`java.lang.Comparable<?>` left, `java.lang.Comparable<?>` right)`

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

### `readResolve()`

**Returns:** `java.lang.Object`

### `toString()`

**Returns:** `java.lang.String`

