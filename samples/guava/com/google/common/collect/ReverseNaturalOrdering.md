# Class: `ReverseNaturalOrdering`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ReverseNaturalOrdering`

**Extends:** [`com.google.common.collect.Ordering<java.lang.Comparable<?>>`](./Ordering>.md)

**Implements:** `java.io.Serializable`

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

### `min(`E` a, `E` b)`

**Returns:** `E`

### `min(`E` a, `E` b, `E` c, `E[]` rest)`

**Returns:** `E`

### `min(`java.util.Iterator<E>` iterator)`

**Returns:** `E`

### `min(`java.lang.Iterable<E>` iterable)`

**Returns:** `E`

### `max(`E` a, `E` b)`

**Returns:** `E`

### `max(`E` a, `E` b, `E` c, `E[]` rest)`

**Returns:** `E`

### `max(`java.util.Iterator<E>` iterator)`

**Returns:** `E`

### `max(`java.lang.Iterable<E>` iterable)`

**Returns:** `E`

### `readResolve()`

**Returns:** `java.lang.Object`

### `toString()`

**Returns:** `java.lang.String`

