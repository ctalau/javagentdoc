# Class: `ReverseNaturalOrdering`

**Package:** [`com.google.common.collect`](README.md)

**Fully Qualified Name:** `com.google.common.collect.ReverseNaturalOrdering`

**Extends:** [`com.google.common.collect.Ordering<java.lang.Comparable<?>>`](./Ordering.md)

**Implements:** `java.io.Serializable`

## Description

## Fields

### `INSTANCE`

**Type:** [`com.google.common.collect.ReverseNaturalOrdering`](./ReverseNaturalOrdering.md)

### `serialVersionUID`

**Type:** `long`

## Constructors

### `<init>()`

## Methods

### `compare(Comparable<?> left, Comparable<?> right)`

**Parameters:**
- `left` (`java.lang.Comparable<?>`)
- `right` (`java.lang.Comparable<?>`)

**Returns:** `int`

### `reverse()`

**Returns:** [`com.google.common.collect.Ordering<S>`](./Ordering.md)

### `min(E a, E b)`

**Parameters:**
- `a` (`E`)
- `b` (`E`)

**Returns:** `E`

### `min(E a, E b, E c, E[] rest)`

**Parameters:**
- `a` (`E`)
- `b` (`E`)
- `c` (`E`)
- `rest` (`E[]`)

**Returns:** `E`

### `min(Iterator<E> iterator)`

**Parameters:**
- `iterator` (`java.util.Iterator<E>`)

**Returns:** `E`

### `min(Iterable<E> iterable)`

**Parameters:**
- `iterable` (`java.lang.Iterable<E>`)

**Returns:** `E`

### `max(E a, E b)`

**Parameters:**
- `a` (`E`)
- `b` (`E`)

**Returns:** `E`

### `max(E a, E b, E c, E[] rest)`

**Parameters:**
- `a` (`E`)
- `b` (`E`)
- `c` (`E`)
- `rest` (`E[]`)

**Returns:** `E`

### `max(Iterator<E> iterator)`

**Parameters:**
- `iterator` (`java.util.Iterator<E>`)

**Returns:** `E`

### `max(Iterable<E> iterable)`

**Parameters:**
- `iterable` (`java.lang.Iterable<E>`)

**Returns:** `E`

### `readResolve()`

**Returns:** `java.lang.Object`

### `toString()`

**Returns:** `java.lang.String`

